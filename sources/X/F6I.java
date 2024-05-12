package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;

/* loaded from: classes7.dex */
public final class F6I {
    public static boolean LIZ;

    public static boolean LIZ() {
        boolean z;
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        boolean z2 = false;
        if (LIZLLL != null) {
            z = LIZLLL.checkPluginInstalled("com.ss.android.ugc.aweme.cast");
        } else {
            z = false;
        }
        C70922qO.LIZ("CastingPluginInstaller", "isPluginInstalled checkDownload: " + z + ", isPluginLoaded: " + LIZ);
        if (z && LIZLLL()) {
            z2 = true;
        }
        C70922qO.LIZ("CastingPluginInstaller", "isPluginInstalled : " + z2);
        return z2;
    }

    public static boolean LIZLLL() {
        if (LIZ) {
            return true;
        }
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null && LIZLLL.LIZJ() != null) {
            C39647FhD.LIZLLL(EF7.LIZIZ());
            LIZ = true;
        }
        return LIZ;
    }

    public static void LIZIZ(InterfaceC88472Yns interfaceC88472Yns) {
        synchronized (C71042qa.LIZ) {
            XKX.LIZLLL((InterfaceC70422pa) C71042qa.LIZLLL.getValue(), null, null, new C71092qf(null), 3);
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
    }

    public static void LIZJ(InterfaceC88472Yns interfaceC88472Yns) {
        C70922qO.LIZ("CastingPluginInstaller", "tryInstallPlugin");
        if (!C4HD.LIZ()) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (LIZ()) {
            LIZIZ(interfaceC88472Yns);
            return;
        }
        F6J f6j = new F6J(interfaceC88472Yns);
        C37132Ehk c37132Ehk = new C37132Ehk();
        c37132Ehk.LIZ = "com.ss.android.ugc.aweme.cast";
        c37132Ehk.LIZIZ = true;
        F5Q f5q = new F5Q();
        f5q.LIZ = false;
        f5q.LJI = EnumC217558gJ.KEEP;
        c37132Ehk.LJ = new F5R(f5q);
        c37132Ehk.LIZLLL = f6j;
        C37131Ehj c37131Ehj = new C37131Ehj(c37132Ehk);
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LIZ(c37131Ehj);
        }
    }
}
