package com.ss.android.ttve.nativePort;

import X.C5SJ;
import X.InterfaceC87303YOd;
import X.InterfaceC87304YOe;
import X.InterfaceC87305YOf;
import X.InterfaceC87306YOg;
import X.InterfaceC87307YOh;
import X.InterfaceC87308YOi;
import X.X01;
import X.X0P;
import X.YOV;
import X.YOX;
import X.YOY;

/* loaded from: classes16.dex */
public class TENativeServiceBase {
    public InterfaceC87303YOd mAudioExtendToFileCallback;
    public InterfaceC87305YOf mEncoderDataCallback;
    public InterfaceC87304YOe mExtractFrameProcessCallback;
    public YOV mGetImageCallback;
    public InterfaceC87306YOg mKeyFrameCallback;
    public InterfaceC87307YOh mMVInitedCallback;
    public InterfaceC87308YOi mMattingCallback;
    public X0P mOnErrorListener;
    public X0P mOnInfoListener;
    public X01 mOpenGLCallback;
    public YOV mSeekFrameCallback;

    public void nativeCallback_onExtractFrameProcess(float f) {
    }

    public void setExtractFrameProcessCallback(InterfaceC87304YOe interfaceC87304YOe) {
    }

    public void nativeCallback_onAudioExtendToFileCancel() {
        InterfaceC87303YOd interfaceC87303YOd = this.mAudioExtendToFileCallback;
        if (interfaceC87303YOd != null) {
            interfaceC87303YOd.getClass();
        }
    }

    public void nativeCallback_onMVInited() {
        InterfaceC87307YOh interfaceC87307YOh = this.mMVInitedCallback;
        if (interfaceC87307YOh != null) {
            ((YOY) interfaceC87307YOh).LIZ.getClass();
        }
    }

    public void nativeCallback_onMattingStartedCallback() {
        if (this.mMattingCallback == null) {
        } else {
            throw null;
        }
    }

    public InterfaceC87305YOf getEncoderDataListener() {
        return this.mEncoderDataCallback;
    }

    public X0P getErrorListener() {
        return this.mOnErrorListener;
    }

    public X0P getInfoListener() {
        return this.mOnInfoListener;
    }

    public X01 getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    public void nativeCallback_onAudioExtendToFileFinish(boolean z) {
        InterfaceC87303YOd interfaceC87303YOd = this.mAudioExtendToFileCallback;
        if (interfaceC87303YOd != null) {
            interfaceC87303YOd.getClass();
        }
    }

    public void nativeCallback_onAudioExtendToFileProcess(float f) {
        InterfaceC87303YOd interfaceC87303YOd = this.mAudioExtendToFileCallback;
        if (interfaceC87303YOd != null) {
            interfaceC87303YOd.getClass();
        }
    }

    public void nativeCallback_onMattingDoneCallback(float f) {
        if (this.mMattingCallback == null) {
        } else {
            throw null;
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

    public void setAudioExtendToFileCallback(InterfaceC87303YOd interfaceC87303YOd) {
        this.mAudioExtendToFileCallback = interfaceC87303YOd;
    }

    public void setEncoderDataListener(InterfaceC87305YOf interfaceC87305YOf) {
        this.mEncoderDataCallback = interfaceC87305YOf;
    }

    public void setErrorListener(X0P x0p) {
        this.mOnErrorListener = x0p;
    }

    public void setGetImageCallback(YOV yov) {
        this.mGetImageCallback = yov;
    }

    public void setGetSeekFrameCallback(YOV yov) {
        this.mGetImageCallback = yov;
    }

    public void setInfoListener(X0P x0p) {
        this.mOnInfoListener = x0p;
    }

    public void setKeyFrameCallback(InterfaceC87306YOg interfaceC87306YOg) {
        this.mKeyFrameCallback = interfaceC87306YOg;
    }

    public void setMattingCallback(InterfaceC87308YOi interfaceC87308YOi) {
        this.mMattingCallback = interfaceC87308YOi;
    }

    public void setOpenGLListeners(X01 x01) {
        this.mOpenGLCallback = x01;
    }

    public void setSeekFrameCallback(YOV yov) {
        this.mSeekFrameCallback = yov;
    }

    public void setmMVInitedCallback(InterfaceC87307YOh interfaceC87307YOh) {
        this.mMVInitedCallback = interfaceC87307YOh;
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

    public void nativeCallback_onDisplayCallback(int i, int i2, int i3) {
        if (this.mKeyFrameCallback == null) {
        } else {
            throw null;
        }
    }

    public void nativeCallback_onInfoListener(int i, int i2, float f) {
        X0P x0p = this.mOnInfoListener;
        if (x0p != null) {
            x0p.LIZ(i, i2, f, null);
        }
    }

    public void nativeCallback_onMattingErrorCallback(int i, int i2, float f) {
        if (this.mMattingCallback == null) {
        } else {
            throw null;
        }
    }

    public void nativeCallback_onProcessCallback(int i, int i2, String str) {
        if (this.mKeyFrameCallback == null) {
        } else {
            throw null;
        }
    }

    public void nativeCallback_onCompressBuffer(byte[] bArr, long j, int i, boolean z) {
        C5SJ c5sj;
        InterfaceC87305YOf interfaceC87305YOf = this.mEncoderDataCallback;
        if (interfaceC87305YOf != null) {
            YOX yox = (YOX) interfaceC87305YOf;
            yox.getClass();
            if (bArr == null || j < 0 || i <= 0 || (c5sj = yox.LIZ.LLJI) == null) {
                return;
            }
            c5sj.LIZIZ(bArr, j, i, z);
        }
    }

    public void nativeCallback_onErrorListener(int i, int i2, float f, String str) {
        X0P x0p = this.mOnErrorListener;
        if (x0p != null) {
            x0p.LIZ(i, i2, f, str);
        }
    }

    public void nativeCallback_onMattingProgressCallback(int i, float f, float f2, boolean z) {
        if (this.mMattingCallback == null) {
        } else {
            throw null;
        }
    }

    public int nativeCallback_onImageData(byte[] bArr, int i, int i2, int i3, float f) {
        YOV yov = this.mGetImageCallback;
        if (yov != null) {
            return yov.LIZ(bArr, i, i2, i3, f);
        }
        return 0;
    }

    public int nativeCallback_onSeekFrameData(byte[] bArr, int i, int i2, int i3, float f) {
        YOV yov = this.mSeekFrameCallback;
        if (yov != null) {
            return yov.LIZ(bArr, i, i2, i3, f);
        }
        return 0;
    }
}
