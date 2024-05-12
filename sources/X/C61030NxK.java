package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NxK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61030NxK {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(O1I input, O1L config) {
        String str;
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        if (ujb.o.LJJJLIIL(config.LJFF, "/", false)) {
            String str2 = config.LJFF;
            if (str2 != null) {
                str = str2.substring(1);
                o.LJFF(str, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str = config.LJFF;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(config.LJIILJJIL);
        LIZ2.append('_');
        return C0MT.LIZ(LIZ2, config.LJ, '_', str, LIZ2);
    }
}
