package com.ss.android.ttve.nativePort;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import java.nio.ByteBuffer;

/* loaded from: classes16.dex */
public class NativeCallbacks {

    /* loaded from: classes15.dex */
    public interface IAudioCaptureCallback {
        void onReceive(ByteBuffer byteBuffer);
    }

    /* loaded from: classes15.dex */
    public interface ICameraFrameCallback {
        void onResult(int i, float[] fArr, int i2, int i3, int i4, long j);

        void onResult(ByteBuffer byteBuffer, int i, int i2, long j);
    }

    /* loaded from: classes15.dex */
    public interface IFrameEffectCallback {
        void onResult(long j);
    }

    /* loaded from: classes15.dex */
    public interface IGetFrameCallback {
        void onResult(VEFrame vEFrame, boolean z);

        void onResult(int[] iArr, int i, int i2, long j, boolean z);
    }

    /* loaded from: classes15.dex */
    public interface ILensCallback {
        void onError(int i, int i2, String str);

        void onInfo(int i, int i2, int i3, String str);

        void onSuccess(int i, float f, int i2);
    }

    /* loaded from: classes16.dex */
    public interface OnARTextBitmapCallback {
        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    /* loaded from: classes16.dex */
    public interface OnARTextContentCallback {
        void onResult(String[] strArr);
    }
}
