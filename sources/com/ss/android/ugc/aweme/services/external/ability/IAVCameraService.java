package com.ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.view.SurfaceHolder;

/* loaded from: classes11.dex */
public interface IAVCameraService {

    /* loaded from: classes11.dex */
    public interface IAVCameraReadyCallback<T> {
        void finish(T t);
    }

    void getScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback);
}
