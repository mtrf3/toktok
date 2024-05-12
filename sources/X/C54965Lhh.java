package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Lhh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54965Lhh {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (s.LJJLIIIJL(str, str2, 0, false, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(String target, String[] strArr) {
        o.LJIIIZ(target, "target");
        for (String str : strArr) {
            if (o.LJ(target, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (s.LJJLIIIJL(str, str2, 0, false, 6) == 0) {
                return true;
            }
        }
        return false;
    }
}
