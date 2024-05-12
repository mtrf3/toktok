package X;

import ujb.o;
import ujb.s;

/* renamed from: X.Fch, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39367Fch {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (str != null && !o.LJJJJJL(str)) {
            String LIZJ = AnonymousClass028.LIZJ("getDefault()", str, "this as java.lang.String).toLowerCase(locale)");
            if (s.LJJJLZIJ(LIZJ, "application/json", false) || s.LJJJLZIJ(LIZJ, "text/plain", false)) {
                return true;
            }
        }
        return false;
    }
}
