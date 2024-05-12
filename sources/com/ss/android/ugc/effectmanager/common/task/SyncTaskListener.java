package com.ss.android.ugc.effectmanager.common.task;

/* loaded from: classes16.dex */
public interface SyncTaskListener<T> {
    void onFailed(SyncTask<T> syncTask, ExceptionResult exceptionResult);

    void onFinally(SyncTask<T> syncTask);

    void onProgress(SyncTask<T> syncTask, int i, long j);

    void onResponse(SyncTask<T> syncTask, T t);

    void onStart(SyncTask<T> syncTask);
}
