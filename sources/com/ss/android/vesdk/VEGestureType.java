package com.ss.android.vesdk;

import X.V0N;

/* loaded from: classes3.dex */
public enum VEGestureType {
    Unknown,
    Tap,
    Pan,
    Rotate,
    Scale,
    LongPress;

    public static VEGestureType valueOf(String str) {
        return (VEGestureType) V0N.LJJJ(VEGestureType.class, str);
    }
}
