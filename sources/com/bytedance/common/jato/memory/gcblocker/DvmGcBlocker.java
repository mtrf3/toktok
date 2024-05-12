package com.bytedance.common.jato.memory.gcblocker;

import X.QXX;

/* loaded from: classes7.dex */
public class DvmGcBlocker extends QXX {
    public DvmGcBlocker() {
        super((Object) null);
        try {
            nativeInit();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static native void nativeDalvikStartBlockGc();

    public static native void nativeDalvikStopBlockGc();

    public static native void nativeInit();

    @Override // X.QXX
    public final void LLLLIL(long j) {
    }

    @Override // X.QXX
    public final void LLLLJI(int i) {
    }

    @Override // X.QXX
    public final void LLLLLJLJLL(String str) {
        try {
            nativeDalvikStartBlockGc();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @Override // X.QXX
    public final void LLLLLLIL(String str) {
        try {
            nativeDalvikStopBlockGc();
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
