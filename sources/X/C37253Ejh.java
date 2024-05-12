package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Ejh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37253Ejh {
    public static boolean LIZIZ(boolean z, Runnable runnable) {
        if (AabPluginServiceImpl.LIZLLL() == null) {
            return false;
        }
        if (!z) {
            return LIZ("com.ss.android.ugc.i18n.miniapp", Arrays.asList("com.ss.android.ugc.aweme.rn_kit"), runnable);
        }
        return LIZ("com.ss.android.ugc.i18n.miniapp_so", Arrays.asList("com.ss.android.ugc.aweme.rn_kit", "com.ss.android.ugc.i18n.miniapp"), runnable);
    }

    public static boolean LIZ(String str, List list, Runnable runnable) {
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (LIZLLL == null) {
            return false;
        }
        LIZLLL.enableInstall();
        C37132Ehk c37132Ehk = new C37132Ehk();
        c37132Ehk.LIZ = str;
        c37132Ehk.LIZIZ = false;
        c37132Ehk.LIZLLL = new C37254Eji(runnable);
        F5Q f5q = new F5Q();
        f5q.LIZ = true;
        f5q.LIZIZ = true;
        f5q.LIZJ = true;
        f5q.LIZLLL = true;
        f5q.LJ = false;
        f5q.LJII = list;
        c37132Ehk.LJ = new F5R(f5q);
        LIZLLL.LIZ(new C37131Ehj(c37132Ehk));
        return true;
    }
}
