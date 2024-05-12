package com.ss.android.ugc.aweme.commerce.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class ActivityTimeRange extends F9E implements Serializable {

    @InterfaceC65349Pkn("end")
    public float end;

    @InterfaceC65349Pkn("start")
    public float start;

    public ActivityTimeRange() {
    }

    public static /* synthetic */ ActivityTimeRange copy$default(ActivityTimeRange activityTimeRange, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = activityTimeRange.start;
        }
        if ((i & 2) != 0) {
            f2 = activityTimeRange.end;
        }
        return activityTimeRange.copy(f, f2);
    }

    public final ActivityTimeRange copy(float f, float f2) {
        return new ActivityTimeRange(f, f2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.start), Float.valueOf(this.end)};
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public ActivityTimeRange(float f, float f2) {
        this.start = f;
        this.end = f2;
    }
}
