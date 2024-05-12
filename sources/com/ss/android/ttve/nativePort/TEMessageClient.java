package com.ss.android.ttve.nativePort;

import X.X0P;

/* loaded from: classes15.dex */
public class TEMessageClient {
    public X0P mOnErrorListener;
    public X0P mOnInfoListener;

    public X0P getErrorListener() {
        return this.mOnErrorListener;
    }

    public X0P getInfoListener() {
        return this.mOnInfoListener;
    }

    public void setErrorListener(X0P x0p) {
        this.mOnErrorListener = x0p;
    }

    public void setInfoListener(X0P x0p) {
        this.mOnInfoListener = x0p;
    }

    public void nativeCallback_onInfoListener(int i, int i2, float f) {
        X0P x0p = this.mOnInfoListener;
        if (x0p != null) {
            x0p.LIZ(i, i2, f, null);
        }
    }

    public void nativeCallback_onErrorListener(int i, int i2, float f, String str) {
        X0P x0p = this.mOnErrorListener;
        if (x0p != null) {
            x0p.LIZ(i, i2, f, str);
        }
    }
}
