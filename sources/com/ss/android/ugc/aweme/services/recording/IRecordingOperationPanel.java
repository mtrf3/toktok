package com.ss.android.ugc.aweme.services.recording;

import X.C76800UCe;
import X.InterfaceC83586WrG;
import X.InterfaceC88471Ynr;
import X.W5G;
import X.WLZ;
import android.view.ScaleGestureDetector;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.framework.services.IStickerService;

/* loaded from: classes15.dex */
public interface IRecordingOperationPanel {
    W5G backgroundView();

    void cameraFocus(int i, int i2, float[] fArr);

    void closeCamera(Cert cert);

    void closeRecording();

    void detectDirtyLens(InterfaceC88471Ynr<Float, Integer, C76800UCe> interfaceC88471Ynr);

    WLZ filterModule();

    FragmentManager fragmentManager();

    int getCameraInfo();

    int getCameraPos();

    Lifecycle getLifecycle();

    LifecycleOwner getLifecycleOwner();

    int getSurfaceSizeLayoutId();

    int[] getVideoSize();

    LiveData<Float> getZoomEvent();

    boolean isSupportedExposureCompensation();

    void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str);

    void onHidePanel(String str);

    void onShowPanel(String str);

    void onStickerCancel(IStickerService.FaceSticker faceSticker, String str);

    void onStickerChosen(IStickerService.FaceSticker faceSticker, String str);

    void openCamera(Cert cert);

    Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector);

    void setCameraPos(int i, Cert cert);

    void setExposureCompensation(int i);

    void setFilter(String str, float f);

    void updateLiveBackgroundView();

    InterfaceC83586WrG videoRecorder();
}
