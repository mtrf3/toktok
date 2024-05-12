package com.gyf.barlibrary;

import X.V0N;

/* loaded from: classes11.dex */
public enum BarHide {
    FLAG_HIDE_STATUS_BAR,
    FLAG_HIDE_NAVIGATION_BAR,
    FLAG_HIDE_BAR,
    FLAG_SHOW_BAR;

    public static BarHide valueOf(String str) {
        return (BarHide) V0N.LJJJ(BarHide.class, str);
    }
}
