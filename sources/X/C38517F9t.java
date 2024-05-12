package X;

import kotlin.jvm.internal.o;

/* renamed from: X.F9t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38517F9t {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(O1M config) {
        String str;
        o.LJIIJ(config, "config");
        if (ujb.o.LJJJLIIL(config.LJI, "/", false)) {
            String str2 = config.LJI;
            if (str2 != null) {
                str = str2.substring(1);
                o.LJFF(str, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str = config.LJI;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(config.LJIILLIIL);
        LIZ2.append('_');
        return C0MT.LIZ(LIZ2, config.LJFF, '_', str, LIZ2);
    }
}
