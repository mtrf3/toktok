package com.bytedance.ies.cutsame.source.model;

import X.X1D;
import defpackage.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SpeedConfig {
    public final List<Point> points;
    public final int repeat_duration;

    /* JADX WARN: Multi-variable type inference failed */
    public SpeedConfig() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpeedConfig copy$default(SpeedConfig speedConfig, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = speedConfig.points;
        }
        if ((i2 & 2) != 0) {
            i = speedConfig.repeat_duration;
        }
        return speedConfig.copy(list, i);
    }

    public final SpeedConfig copy(List<Point> list, int i) {
        return new SpeedConfig(list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeedConfig)) {
            return false;
        }
        SpeedConfig speedConfig = (SpeedConfig) obj;
        return o.LJ(this.points, speedConfig.points) && this.repeat_duration == speedConfig.repeat_duration;
    }

    public int hashCode() {
        List<Point> list = this.points;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.repeat_duration;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpeedConfig(points=");
        LIZ.append(this.points);
        LIZ.append(", repeat_duration=");
        return b0.LIZJ(LIZ, this.repeat_duration, ')', LIZ);
    }

    public final List<Point> getPoints() {
        return this.points;
    }

    public final int getRepeat_duration() {
        return this.repeat_duration;
    }

    public SpeedConfig(List<Point> list, int i) {
        this.points = list;
        this.repeat_duration = i;
    }

    public /* synthetic */ SpeedConfig(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? 0 : i);
    }
}
