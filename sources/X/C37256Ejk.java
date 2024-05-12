package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Ejk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37256Ejk {
    public static boolean LIZ;
    public static final IPluginService LIZIZ;

    public static boolean LIZ() {
        boolean z;
        IPluginService iPluginService = LIZIZ;
        iPluginService.enableInstall();
        if (iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_pipo_bnpl")) {
            if (!LIZ) {
                if (iPluginService.LIZJ() == null) {
                    z = false;
                } else {
                    C39647FhD.LIZLLL(EF7.LIZIZ());
                    z = true;
                }
                LIZ = z;
            }
            if (LIZ) {
                return true;
            }
        }
        return false;
    }

    static {
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "get().getService(IPluginService::class.java)");
        LIZIZ = LIZLLL;
    }
}
