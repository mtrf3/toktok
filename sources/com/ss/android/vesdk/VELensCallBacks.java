package com.ss.android.vesdk;

import X.InterfaceC87316YOq;

/* loaded from: classes16.dex */
public class VELensCallBacks {
    public volatile InterfaceC87316YOq mLensStateListener;

    public void setmLensStateListener(Object obj) {
        this.mLensStateListener = (InterfaceC87316YOq) obj;
    }

    public static boolean onAlgorithmProcess(Object obj, int i) {
        if (obj instanceof VELensCallBacks) {
            VELensCallBacks vELensCallBacks = (VELensCallBacks) obj;
            if (vELensCallBacks.mLensStateListener != null && vELensCallBacks.mLensStateListener.getState()) {
                return true;
            }
        }
        return false;
    }
}
