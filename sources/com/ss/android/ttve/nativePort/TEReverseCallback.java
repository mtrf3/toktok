package com.ss.android.ttve.nativePort;

import X.YOW;

/* loaded from: classes16.dex */
public class TEReverseCallback {
    public YOW listener;

    public void onProgressChanged(double d) {
        YOW yow = this.listener;
        if (yow != null) {
            yow.LIZIZ(d);
        }
    }

    public void setListener(Object obj) {
        this.listener = (YOW) obj;
    }
}
