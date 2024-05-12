package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Q4y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66420Q4y {
    public static final EnumC66377Q3h LIZ(Q51 q51) {
        o.LJIIIZ(q51, "<this>");
        int i = Q50.LIZ[q51.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC66377Q3h.DELETE;
                }
                throw new C162476Zf();
            }
            return EnumC66377Q3h.POST;
        }
        return EnumC66377Q3h.GET;
    }
}
