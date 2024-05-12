package com.ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigmaResult;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;

/* loaded from: classes11.dex */
public interface IQRCodeScanner {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes11.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    /* loaded from: classes11.dex */
    public interface OnEnigmaScanListener {
        void onFail(int i);

        void onSuccess(AVEnigmaResult aVEnigmaResult);
    }

    void closeLight();

    void enableCameraScan(boolean z, long j);

    void openLight();

    void pauseEffectAudio(boolean z);

    void processTouchEvent(float f, float f2);

    void release();

    void setScanListener(OnEnigmaScanListener onEnigmaScanListener);

    void startPicScan(String str, AVScanSettings aVScanSettings, long j);

    void startScan(Context context, AVCameraParams aVCameraParams, SurfaceHolder surfaceHolder, AVScanSettings aVScanSettings);

    void stop();

    void stopPicScan();

    void switchEffectWithTag(String str, int i, int i2, String str2);

    void zoomByRatio(float f);
}
