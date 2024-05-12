package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.Haz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44357Haz implements InterfaceC44358Hb0 {
    public static final C44357Haz LIZ = new C44357Haz();
    public static final Keva LIZIZ;

    static {
        Keva repo = Keva.getRepo("story_lightening_landing_strategy");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZIZ = repo;
    }

    @Override // X.InterfaceC44358Hb0
    public final int LIZ(String str) {
        return LIZIZ.getInt("story_lightening_tab_when_leave", -1);
    }

    @Override // X.InterfaceC44358Hb0
    public final void LIZIZ(int i, String str) {
        if (o.LJ(str, "mv_page") && i == 0) {
            return;
        }
        int i2 = 0;
        if (i != 2) {
            if (i != 18 && i != 10 && i != 11 && i != 14) {
                if (i != 15) {
                    i2 = -1;
                }
            }
            LIZIZ.storeInt("story_lightening_tab_when_leave", i2);
        }
        if (!C44258HYo.LIZ()) {
            i2 = 1;
        }
        LIZIZ.storeInt("story_lightening_tab_when_leave", i2);
    }
}
