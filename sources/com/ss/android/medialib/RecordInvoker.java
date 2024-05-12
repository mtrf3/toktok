package com.ss.android.medialib;

import X.YP0;
import android.opengl.EGLContext;
import com.ss.android.medialib.model.FaceAttributeInfo;
import com.ss.android.medialib.model.FaceDetectInfo;
import com.ss.android.medialib.model.SceneDetectInfo;
import com.ss.android.medialib.model.SkeletonInfo;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import java.nio.ByteBuffer;

/* loaded from: classes16.dex */
public class RecordInvoker {

    /* loaded from: classes16.dex */
    public interface EffectAlgorithmCallback {
        void onResult(int[] iArr, long[] jArr, float f);
    }

    /* loaded from: classes16.dex */
    public interface FaceResultCallback {
        void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo);
    }

    /* loaded from: classes16.dex */
    public interface OnARTextBitmapCallback {
        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    /* loaded from: classes16.dex */
    public interface OnARTextContentCallback {
        void onResult(String[] strArr);
    }

    /* loaded from: classes16.dex */
    public interface OnARTextCountCallback {
        void onResult(int i);
    }

    /* loaded from: classes16.dex */
    public interface OnCherEffectParmaCallback {
        void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr);
    }

    /* loaded from: classes16.dex */
    public interface OnFrameCallback {
        void onFrame(int i, double d);

        void onFrame(ByteBuffer byteBuffer, int i, int i2, int i3, double d);

        void onInit(EGLContext eGLContext, int i, int i2, int i3, long j);
    }

    /* loaded from: classes16.dex */
    public interface OnHandDetectCallback {
        void onResult(int[] iArr);
    }

    /* loaded from: classes16.dex */
    public interface OnLensResultCallback {
        void onError(int i, int i2, String str);

        void onInfo(int i, int i2, int i3, String str);

        void onSuccess(int i, float f, int i2);
    }

    /* loaded from: classes16.dex */
    public interface OnPictureCallback {
        void onResult(int[] iArr, int i, int i2);
    }

    /* loaded from: classes16.dex */
    public interface OnPictureCallbackV2 {
        void onImage(int[] iArr, int i, int i2);

        void onResult(int i, int i2);
    }

    /* loaded from: classes16.dex */
    public interface OnPreviewRadioListener {
        void onInfo(int i, int i2);
    }

    /* loaded from: classes16.dex */
    public interface OnRunningErrorCallback {
        void onAccurateInfo(int i, double d);

        void onError(int i);

        void onInfo(int i, int i2);
    }

    /* loaded from: classes16.dex */
    public interface OnSceneDetectCallback {
        void onResult(SceneDetectInfo sceneDetectInfo);
    }

    /* loaded from: classes16.dex */
    public interface OnSkeletonDetectCallback {
        void onResult(SkeletonInfo skeletonInfo);
    }

    /* loaded from: classes16.dex */
    public interface OnSmartBeautyCallback {
        void onResult(YP0 yp0);
    }
}
