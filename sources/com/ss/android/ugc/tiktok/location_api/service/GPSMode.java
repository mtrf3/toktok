package com.ss.android.ugc.tiktok.location_api.service;

import X.V0N;

/* loaded from: classes2.dex */
public enum GPSMode {
    UNKNOWN(0),
    COARSE(1),
    PRECISE(2);

    public final int mode;

    public static GPSMode valueOf(String str) {
        return (GPSMode) V0N.LJJJ(GPSMode.class, str);
    }

    public final int getMode() {
        return this.mode;
    }

    GPSMode(int i) {
        this.mode = i;
    }
}
