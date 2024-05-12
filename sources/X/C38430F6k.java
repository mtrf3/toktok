package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;

/* renamed from: X.F6k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38430F6k {
    public static boolean LIZ;

    public static void LIZ() {
        boolean LJ = C19N.LJ("spark_webview_adblock", false);
        if (C38639FEl.LJ == null) {
            synchronized (C38639FEl.class) {
                if (C38639FEl.LJ == null) {
                    C38639FEl.LJ = new C38490F8s();
                }
            }
        }
        C38639FEl.LJ.LIZ = LJ;
        if (!C19N.LJ("spark_webview_adblock", false)) {
            return;
        }
        C38434F6o.LIZ = new C1A7();
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        LIZLLL.enableInstall();
        if (LIZLLL.checkPluginInstalled("com.ss.android.ugc.aweme.search.i18n.adblock")) {
            if (!C38639FEl.LIZIZ() || C38434F6o.LIZ == null) {
                return;
            }
            C1A7.LJJIIZI();
            return;
        }
        IPluginService LIZLLL2 = AabPluginServiceImpl.LIZLLL();
        C37132Ehk c37132Ehk = new C37132Ehk();
        c37132Ehk.LIZ = "com.ss.android.ugc.aweme.search.i18n.adblock";
        c37132Ehk.LIZIZ = true;
        c37132Ehk.LIZLLL = new C38432F6m();
        F5Q f5q = new F5Q();
        f5q.LIZ = false;
        f5q.LIZIZ = true;
        f5q.LIZJ = true;
        f5q.LIZLLL = true;
        f5q.LJ = false;
        c37132Ehk.LJ = new F5R(f5q);
        LIZLLL2.LIZ(new C37131Ehj(c37132Ehk));
    }
}
