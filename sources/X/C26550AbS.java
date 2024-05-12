package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AbS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26550AbS {
    public static EnumC26549AbR LIZ(int i, String page) {
        o.LJIIIZ(page, "page");
        for (EnumC26549AbR enumC26549AbR : EnumC26549AbR.values()) {
            if (o.LJ(enumC26549AbR.getPage(), page) && enumC26549AbR.getTemplate() == i) {
                return enumC26549AbR;
            }
        }
        return EnumC26549AbR.DEFAULT;
    }
}
