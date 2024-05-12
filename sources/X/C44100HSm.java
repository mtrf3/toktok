package X;

import kotlin.jvm.internal.o;

/* renamed from: X.HSm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44100HSm {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        if (r0 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
    
        if (r2 != 7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C188727au LIZIZ(X.C7F9 r8, X.S1E r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44100HSm.LIZIZ(X.7F9, X.S1E, boolean):X.7au");
    }

    public static final C188727au LIZ(S1E mainMaker, C7F9 chain, String clickMethod, boolean z) {
        o.LJIIIZ(chain, "chain");
        o.LJIIIZ(mainMaker, "mainMaker");
        o.LJIIIZ(clickMethod, "clickMethod");
        C188727au LIZIZ = LIZIZ(chain, mainMaker, z);
        LIZIZ.LJI("click_method", clickMethod);
        return LIZIZ;
    }

    public static final C188727au LIZJ(S1E mainMaker, C7F9 chain, String str, boolean z) {
        o.LJIIIZ(chain, "chain");
        o.LJIIIZ(mainMaker, "mainMaker");
        if (ORZ.LJLLLL(chain.LIZJ()) == null) {
            C188727au.LJIIJJI();
        }
        C188727au LIZIZ = mainMaker.LJIJI().LIZIZ();
        String str2 = chain.LIZLLL;
        LIZIZ.getClass();
        LIZIZ.LJIIIZ("enter_method", str2);
        LIZIZ.LJIIIZ("main_anchor_id", ((S1E) ORZ.LJLLJ(chain.LIZJ())).LJIJI().LIZ());
        LIZIZ.LJIIIZ("main_anchor_name", ((S1E) ORZ.LJLLJ(chain.LIZJ())).LJIJI().LIZJ());
        LIZIZ.LJIIIZ("main_anchor_type", ((S1E) ORZ.LJLLJ(chain.LIZJ())).LJIJI().LIZLLL());
        LIZIZ.LIZLLL(z ? 1 : 0, "multi_anchor");
        LIZIZ.LJIIIZ("group_id", chain.LIZ.getAid());
        LIZIZ.LJIIIZ("anchor_id", mainMaker.LJIJI().LIZ());
        LIZIZ.LJIIIZ("anchor_name", mainMaker.LJIJI().LIZJ());
        LIZIZ.LJIIIZ("anchor_type", mainMaker.LJIJI().LIZLLL());
        LIZIZ.LIZLLL(chain.LIZIZ(), "anchor_number");
        LIZIZ.LJIIIZ("request_id", chain.LIZ.getRequestId());
        LIZIZ.LJI("click_method", str);
        return LIZIZ;
    }
}
