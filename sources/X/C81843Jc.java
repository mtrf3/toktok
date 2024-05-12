package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3Jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81843Jc {
    public static final java.util.Map<C81983Jq, C81833Jb> LIZ = new LinkedHashMap();
    public static final C81983Jq LIZIZ = new C81983Jq("ONLY_FOR_LOG", EnumC82443Lk.NULL, EnumC82403Lg.NULL, C81853Jd.LJLIL, C81863Je.LJLIL);

    public static C81833Jb LJ() {
        java.util.Map<C81983Jq, C81833Jb> map = LIZ;
        C81983Jq c81983Jq = LIZIZ;
        C81833Jb c81833Jb = (C81833Jb) ((LinkedHashMap) map).get(c81983Jq);
        if (c81833Jb == null) {
            c81833Jb = new C81833Jb(c81983Jq);
        }
        map.put(c81983Jq, c81833Jb);
        return c81833Jb;
    }

    public static C81833Jb LIZLLL(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        java.util.Map<C81983Jq, C81833Jb> map = LIZ;
        C81833Jb c81833Jb = (C81833Jb) ((LinkedHashMap) map).get(sessionPage);
        if (c81833Jb == null) {
            c81833Jb = new C81833Jb(sessionPage);
        }
        map.put(sessionPage, c81833Jb);
        return c81833Jb;
    }

    public static String LIZ(EnumC81823Ja enumC81823Ja, C3JU c3ju) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(enumC81823Ja.getTag());
        LIZ2.append('-');
        LIZ2.append(c3ju.getTag());
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        if (!C3KQ.LIZ().refactorDataFlowDebugLog) {
            return;
        }
        C34B.LIZIZ(tag, msg);
    }

    public static void LIZJ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        C34B.LJI(tag, msg);
    }
}
