package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0C implements InterfaceC55053Lj7 {
    public static final Y0C LIZ = new Y0C();

    @Override // X.InterfaceC55053Lj7
    public final boolean LIZJ() {
        C86713Y1l.LIZIZ.getClass();
        return C86713Y1l.LJFF;
    }

    @Override // X.InterfaceC55053Lj7
    public final boolean LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (!Y04.LIZIZ(aweme) || Y04.LIZLLL(aweme) != null) {
            return false;
        }
        Y01 y01 = Y01.LIZIZ;
        if (!y01.LJIJJLI(aweme, y01.LJJIIZI())) {
            return false;
        }
        String targetLang = y01.LJJIIZI();
        C86713Y1l.LIZIZ.getClass();
        o.LJIIIZ(targetLang, "targetLang");
        return !r2.LIZ.containsKey(r2.LIZJ().LIZIZ(aweme, targetLang));
    }

    @Override // X.InterfaceC55053Lj7
    public final void LIZ(Aweme aweme, String enterFrom) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (LIZIZ(aweme)) {
            String LJJIIZI = Y01.LIZIZ.LJJIIZI();
            C86713Y1l.LIZIZ.getClass();
            String LJIIJ = C86713Y1l.LJIIJ(aweme, LJJIIZI);
            Long LJIIJ2 = C86670Xzu.LJIIJ(aweme);
            if (LJIIJ2 != null) {
                C86713Y1l.LJIIIZ(LJIIJ2.longValue(), LJJIIZI, aweme, LJIIJ, enterFrom, null).LJJL(T16.LIZ()).LJJJJZ();
            }
        }
    }
}
