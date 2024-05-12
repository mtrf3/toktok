package com.ss.android.ugc.tiktok.location_api.service;

import X.V0N;

/* loaded from: classes10.dex */
public enum LocationLevel {
    LEVEL_L0(0),
    LEVEL_L1(1),
    LEVEL_L2(2),
    LEVEL_L3(3);

    public final int level;

    public static LocationLevel valueOf(String str) {
        return (LocationLevel) V0N.LJJJ(LocationLevel.class, str);
    }

    public final int getLevel() {
        return this.level;
    }

    LocationLevel(int i) {
        this.level = i;
    }
}
