package com.ss.android.ugc.effectmanager.common.task;

/* loaded from: classes16.dex */
public class SyncTask<T> {
    public boolean mCanceled;
    public SyncTaskListener<T> mSyncTaskListener;

    public void cancel() {
        this.mCanceled = true;
    }

    public void execute() {
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public void onFinally(SyncTask<T> syncTask) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onFinally(syncTask);
        }
    }

    public void onStart(SyncTask<T> syncTask) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onStart(syncTask);
        }
    }

    public void setListener(SyncTaskListener<T> syncTaskListener) {
        this.mSyncTaskListener = syncTaskListener;
    }

    public void onFailed(SyncTask<T> syncTask, ExceptionResult exceptionResult) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onFailed(syncTask, exceptionResult);
        }
    }

    public void onResponse(SyncTask<T> syncTask, T t) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onResponse(syncTask, t);
        }
    }

    public void onProgress(SyncTask<T> syncTask, int i, long j) {
        SyncTaskListener<T> syncTaskListener = this.mSyncTaskListener;
        if (syncTaskListener != null) {
            syncTaskListener.onProgress(syncTask, i, j);
        }
    }
}
