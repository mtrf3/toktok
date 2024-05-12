package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F6B {
    public static boolean LIZ;
    public static final C64962gm LIZIZ = C48841JEv.LIZ(C78613UtF.LIZJ);
    public static final IPluginService LIZJ = AabPluginServiceImpl.LIZLLL();

    public static boolean LIZ() {
        boolean z;
        IPluginService iPluginService = LIZJ;
        if (iPluginService == null) {
            return false;
        }
        iPluginService.enableInstall();
        if (!iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.poi_map")) {
            return false;
        }
        if (!LIZ) {
            if (iPluginService.LIZJ() == null) {
                z = false;
            } else {
                C39647FhD.LIZLLL(EF7.LIZIZ());
                z = true;
            }
            LIZ = z;
        }
        if (!LIZ) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(boolean z, EnumC217558gJ enumC217558gJ, String str, String str2, String str3) {
        F6C f6c = new F6C();
        F6D f6d = new F6D(str);
        C37132Ehk c37132Ehk = new C37132Ehk();
        c37132Ehk.LIZ = "com.ss.android.ugc.aweme.poi_map";
        c37132Ehk.LIZIZ = z;
        F5Q f5q = new F5Q();
        f5q.LIZ = !z;
        f5q.LJIIIZ = f6c;
        f5q.LJI = enumC217558gJ;
        c37132Ehk.LJ = new F5R(f5q);
        c37132Ehk.LIZLLL = f6d;
        if (!z) {
            F6F f6f = new F6F();
            f6f.LIZ = str2;
            f6f.LIZIZ = str3;
            c37132Ehk.LJI = new F6E(f6f);
        }
        LIZJ.LIZ(new C37131Ehj(c37132Ehk));
    }

    public static void LIZJ(boolean z, EnumC217558gJ downloadPolicy, String str, String str2, String str3) {
        o.LJIIIZ(downloadPolicy, "downloadPolicy");
        if (LIZ()) {
            return;
        }
        if (((Boolean) F6G.LIZ.getValue()).booleanValue()) {
            XKX.LIZLLL(LIZIZ, C78613UtF.LIZJ, null, new C211838Tb(z, downloadPolicy, str, str2, str3, null), 2);
        } else {
            LIZIZ(z, downloadPolicy, str, str2, str3);
        }
    }
}
