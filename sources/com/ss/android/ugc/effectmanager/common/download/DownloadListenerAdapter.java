package com.ss.android.ugc.effectmanager.common.download;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class DownloadListenerAdapter implements DownloadListener {
    @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListener
    public void onFinish(DownloadResult result) {
        o.LJIIJ(result, "result");
    }

    @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListener
    public void onProgress(int i, long j) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListener
    public void onStart() {
    }
}
