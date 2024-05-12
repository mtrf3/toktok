package com.ss.android.ttve.nativePort;

import X.InterfaceC63909P6j;
import X.InterfaceC84087WzL;
import X.InterfaceC84088WzM;
import X.P6Z;
import X.QC5;
import X.X01;
import X.X0P;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes15.dex */
public class TECallbackClient {
    public NativeCallbacks.IAudioCaptureCallback mAudioCaptureCallback;
    public NativeCallbacks.ICameraFrameCallback mBufferedFrameCallback;
    public InterfaceC63909P6j mByteBufferAllocator;
    public X0P mCommonCallback;
    public InterfaceC84087WzL mDisplayParamsListener;
    public NativeCallbacks.IFrameEffectCallback mFrameEffectCallback;
    public NativeCallbacks.IGetFrameCallback mGetFrameCallback;
    public NativeCallbacks.ILensCallback mLensCallback;
    public X01 mOpenGLCallback;
    public InterfaceC84088WzM mScanListener;
    public NativeCallbacks.ICameraFrameCallback mTextureFrameCallback;

    private void nativeCallback_onScanCallback(ByteBuffer byteBuffer, byte[][] bArr, int i, int i2) {
    }

    public void nativeCallback_onCameraFacingChangedCallback(boolean z) {
    }

    public void nativeCallback_onDisplaySizeChangedCallback(int i, int i2, int i3, int i4) {
    }

    public void setDisplayParamsListener(InterfaceC84087WzL interfaceC84087WzL) {
    }

    public X01 getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    public ByteBuffer nativeCallback_allocateBuffer(int i) {
        return nativeCallback_allocateBuffer(i, true);
    }

    public ByteBuffer nativeCallback_allocateBufferFromAllocator(int i) {
        ByteBuffer allocateFrame;
        InterfaceC63909P6j interfaceC63909P6j = this.mByteBufferAllocator;
        if (interfaceC63909P6j != null) {
            QC5 qc5 = (QC5) interfaceC63909P6j;
            synchronized (qc5) {
                if (!((List) qc5.LIZ).isEmpty()) {
                    allocateFrame = (ByteBuffer) ((List) qc5.LIZ).get(0);
                    ((List) qc5.LIZ).remove(0);
                } else {
                    allocateFrame = VEFrame.allocateFrame(i);
                }
            }
            return allocateFrame;
        }
        return null;
    }

    public void nativeCallback_onAudioCaptureCallback(ByteBuffer byteBuffer) {
        NativeCallbacks.IAudioCaptureCallback iAudioCaptureCallback = this.mAudioCaptureCallback;
        if (iAudioCaptureCallback != null) {
            iAudioCaptureCallback.onReceive(byteBuffer);
        }
    }

    public void nativeCallback_onFrameEffectCallback(long j) {
        NativeCallbacks.IFrameEffectCallback iFrameEffectCallback = this.mFrameEffectCallback;
        if (iFrameEffectCallback != null) {
            iFrameEffectCallback.onResult(j);
        }
    }

    public void nativeCallback_onOpenGLCreate(int i) {
        X01 x01 = this.mOpenGLCallback;
        if (x01 != null) {
            x01.LJ(i);
        }
    }

    public void nativeCallback_onOpenGLDestroy(int i) {
        X01 x01 = this.mOpenGLCallback;
        if (x01 != null) {
            x01.LIZIZ(i);
        }
    }

    public void nativeCallback_onPreviewSurface(int i) {
        X01 x01 = this.mOpenGLCallback;
        if (x01 != null) {
            x01.LIZ(i);
        }
    }

    public void setAudioCaptureListener(NativeCallbacks.IAudioCaptureCallback iAudioCaptureCallback) {
        this.mAudioCaptureCallback = iAudioCaptureCallback;
    }

    public void setBufferedFrameListener(NativeCallbacks.ICameraFrameCallback iCameraFrameCallback) {
        this.mBufferedFrameCallback = iCameraFrameCallback;
    }

    public void setCommonCallback(X0P x0p) {
        this.mCommonCallback = x0p;
    }

    public void setFrameEffectCallback(NativeCallbacks.IFrameEffectCallback iFrameEffectCallback) {
        this.mFrameEffectCallback = iFrameEffectCallback;
    }

    public void setGetFrameListener(NativeCallbacks.IGetFrameCallback iGetFrameCallback) {
        this.mGetFrameCallback = iGetFrameCallback;
    }

    public void setLensCallback(NativeCallbacks.ILensCallback iLensCallback) {
        this.mLensCallback = iLensCallback;
    }

    public void setOpenGLListeners(X01 x01) {
        this.mOpenGLCallback = x01;
    }

    public void setTextureFrameListener(NativeCallbacks.ICameraFrameCallback iCameraFrameCallback) {
        this.mTextureFrameCallback = iCameraFrameCallback;
    }

    public ByteBuffer nativeCallback_allocateBuffer(int i, boolean z) {
        ByteOrder byteOrder;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        if (z) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        return allocateDirect.order(byteOrder);
    }

    public void nativeCallback_onOpenGLDrawAfter(int i, double d) {
        X01 x01 = this.mOpenGLCallback;
        if (x01 != null) {
            x01.LIZJ(d, i);
        }
    }

    public void nativeCallback_onOpenGLDrawBefore(int i, double d) {
        X01 x01 = this.mOpenGLCallback;
        if (x01 != null) {
            x01.LIZLLL(d);
        }
    }

    public void setScanListener(InterfaceC84088WzM interfaceC84088WzM, InterfaceC63909P6j interfaceC63909P6j) {
        this.mByteBufferAllocator = interfaceC63909P6j;
    }

    public void nativeCallback_onLensCallbackError(int i, int i2, String str) {
        NativeCallbacks.ILensCallback iLensCallback = this.mLensCallback;
        if (iLensCallback != null) {
            iLensCallback.onError(i, i2, str);
        }
    }

    public void nativeCallback_onLensCallbackSuccess(int i, float f, int i2) {
        NativeCallbacks.ILensCallback iLensCallback = this.mLensCallback;
        if (iLensCallback != null) {
            iLensCallback.onSuccess(i, f, i2);
        }
    }

    public void nativeCallback_onBufferedFrameCallback(ByteBuffer byteBuffer, int i, int i2, long j) {
        NativeCallbacks.ICameraFrameCallback iCameraFrameCallback = this.mBufferedFrameCallback;
        if (iCameraFrameCallback != null) {
            iCameraFrameCallback.onResult(byteBuffer, i, i2, j);
        }
    }

    public void nativeCallback_onCommonCallback(int i, int i2, float f, String str) {
        X0P x0p = this.mCommonCallback;
        if (x0p != null) {
            x0p.LIZ(i, i2, f, str);
        }
    }

    public void nativeCallback_onLensCallbackInfo(int i, int i2, int i3, String str) {
        NativeCallbacks.ILensCallback iLensCallback = this.mLensCallback;
        if (iLensCallback != null) {
            iLensCallback.onInfo(i, i2, i3, str);
        }
    }

    public void nativeCallback_onGetFrameCallback(String str, int i, int i2, long j, boolean z) {
        if (this.mGetFrameCallback != null) {
            this.mGetFrameCallback.onResult(VEFrame.createTextureFrame(str, i, i2, 0, j, P6Z.TEPixFmt_OpenGL_RGBA8), z);
        }
    }

    public void nativeCallback_onGetFrameCallback(int[] iArr, int i, int i2, long j, boolean z) {
        NativeCallbacks.IGetFrameCallback iGetFrameCallback = this.mGetFrameCallback;
        if (iGetFrameCallback != null) {
            iGetFrameCallback.onResult(iArr, i, i2, j, z);
        }
    }

    public void nativeCallback_onTextureFrameCallback(int i, float[] fArr, int i2, int i3, int i4, long j) {
        NativeCallbacks.ICameraFrameCallback iCameraFrameCallback = this.mTextureFrameCallback;
        if (iCameraFrameCallback != null) {
            iCameraFrameCallback.onResult(i, fArr, i2, i3, i4, j);
        }
    }
}
