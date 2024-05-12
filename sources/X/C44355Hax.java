package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Hax, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44355Hax implements InterfaceC44358Hb0 {
    public static final C44355Hax LIZ = new C44355Hax();
    public static final Keva LIZIZ;

    static {
        Keva repo = Keva.getRepo("story_lightening_separate_landing_strategy");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZIZ = repo;
    }

    @Override // X.InterfaceC44358Hb0
    public final int LIZ(String str) {
        return i0.LIZJ("story_separate_lightening_tab_when_leave_", str, LIZIZ, -1);
    }

    @Override // X.InterfaceC44358Hb0
    public final void LIZIZ(int i, String str) {
        int i2;
        if (!ORZ.LJLJJI(str, C44356Hay.LIZ) && !o.LJ(str, "direct_shoot")) {
            return;
        }
        if (o.LJ(str, "mv_page") && i == 0) {
            return;
        }
        String LJFF = i0.LJFF("story_separate_lightening_tab_when_leave_", str);
        if (i != 2) {
            if (i != 18 && i != 10 && i != 11 && i != 14) {
                if (i != 15) {
                    i2 = -1;
                    LIZIZ.storeInt(LJFF, i2);
                }
            }
            i2 = 0;
            LIZIZ.storeInt(LJFF, i2);
        }
        if (!C44258HYo.LIZ()) {
            i2 = 1;
            LIZIZ.storeInt(LJFF, i2);
        }
        i2 = 0;
        LIZIZ.storeInt(LJFF, i2);
    }
}
