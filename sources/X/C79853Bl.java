package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79853Bl {
    public static final C3BS LIZ = new C3BS("NO_VALUE");

    public static XLL LIZ(int i, int i2, XKI xki, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            xki = XKI.SUSPEND;
        }
        if (i >= 0) {
            if (i2 >= 0) {
                if (i > 0 || i2 > 0 || xki == XKI.SUSPEND) {
                    int i4 = i2 + i;
                    if (i4 < 0) {
                        i4 = Integer.MAX_VALUE;
                    }
                    return new XLL(i, i4, xki);
                }
                String LJIILLIIL = o.LJIILLIIL(xki, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                LJIILLIIL.toString();
                throw new IllegalArgumentException(LJIILLIIL);
            }
            String LJIILLIIL2 = o.LJIILLIIL(Integer.valueOf(i2), "extraBufferCapacity cannot be negative, but was ");
            LJIILLIIL2.toString();
            throw new IllegalArgumentException(LJIILLIIL2);
        }
        String LJIILLIIL3 = o.LJIILLIIL(Integer.valueOf(i), "replay cannot be negative, but was ");
        LJIILLIIL3.toString();
        throw new IllegalArgumentException(LJIILLIIL3);
    }
}
