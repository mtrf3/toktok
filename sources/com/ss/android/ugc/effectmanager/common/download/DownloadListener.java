package com.ss.android.ugc.effectmanager.common.download;

/* loaded from: classes16.dex */
public interface DownloadListener {
    void onFinish(DownloadResult downloadResult);

    void onProgress(int i, long j);

    void onStart();
}
