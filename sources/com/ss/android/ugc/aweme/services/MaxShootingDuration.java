package com.ss.android.ugc.aweme.services;

import X.C43465H4b;
import X.C44531Hdn;
import X.HYZ;

/* loaded from: classes8.dex */
public final class MaxShootingDuration {
    public static final MaxShootingDuration INSTANCE = new MaxShootingDuration();

    public final long get10MinDuration() {
        return 600000L;
    }

    public final long get3MinDuration() {
        return 180000L;
    }

    public final long getMaxDuration() {
        if (HYZ.LIZ() == 1) {
            return 600000L;
        }
        if (C43465H4b.LIZ() != 0) {
            return 180000L;
        }
        return C44531Hdn.LIZ();
    }
}
