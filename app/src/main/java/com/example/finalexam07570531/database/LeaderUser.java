package com.example.finalexam07570531.database;

import android.content.Context;
import android.os.AsyncTask;

import java.util.List;

public class LeaderUser {
    private Context mContext;

    public LeaderUser(Context mContext) {
        this.mContext = mContext;
    }

    public void getLedger(Callback callback) {
        GetTask getTask = new GetTask(mContext, callback);
        getTask.execute();
    }

    public void insertLedger(UserItem userItem, InsertCallback callback) {
        InsertTask insertTask = new InsertTask(mContext, callback);
        insertTask.execute(userItem);
    }

    private static class GetTask extends AsyncTask<Void, Void, List<UserItem>> {

        private Context mContext;
        private Callback mCallback;

        public GetTask(Context context, Callback callback) {
            this.mContext = context;
            this.mCallback = callback;
        }

        @Override
        protected List<UserItem> doInBackground(Void... voids) {
            AppDatabase db = AppDatabase.getInstance(mContext);
            List<UserItem> itemList = db.userFrom().getAll();
            return itemList;
        }

        @Override
        protected void onPostExecute(List<UserItem> ledgerItemList) {
            super.onPostExecute(ledgerItemList);

            mCallback.onGetLedger(ledgerItemList);
        }
    } // ปิด GetTask

    public interface Callback {
        void onGetLedger(List<UserItem> itemList);
    }

    private static class InsertTask extends AsyncTask<UserItem, Void, Void> {

        private Context mContext;
        private InsertCallback mCallback;

        public InsertTask(Context context, InsertCallback callback) {
            this.mContext = context;
            this.mCallback = callback;
        }

        @Override
        protected Void doInBackground(UserItem... ledgerItems) {
            AppDatabase db = AppDatabase.getInstance(mContext);
            db.userFrom().insert(ledgerItems[0]);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            mCallback.onInsertSuccess();
        }

        public void execute(UserItem userItem) {

        }
    } // ปิด InsertTask

    public interface InsertCallback {
        void onInsertSuccess();
    }
}
