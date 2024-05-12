package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SWN {
    public static SWO LIZ(String value) {
        o.LJIIIZ(value, "value");
        if (o.LJ(value, "big")) {
            return SWO.BIG;
        }
        if (o.LJ(value, "small")) {
            return SWO.SMALL;
        }
        return SWO.UNKNOWN;
    }
}
