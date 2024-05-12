package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VLp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79593VLp {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(Long l, Long l2) {
        long longValue;
        long longValue2;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        if (l2 == null) {
            longValue2 = 0;
        } else {
            longValue2 = l2.longValue();
        }
        if (longValue == 0) {
            if (longValue2 == 0) {
                return -3L;
            }
            return -1L;
        }
        if (longValue2 == 0) {
            return -2L;
        }
        if (longValue > longValue2) {
            return -4L;
        }
        if (l2 != null) {
            long longValue3 = l2.longValue();
            if (l != null) {
                return longValue3 - l.longValue();
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }
}
