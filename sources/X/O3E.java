package X;

import com.bytedance.geckox.GeckoGlobalConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O3E {
    public static final java.util.Map<String, C61520OCm> LIZ = new ConcurrentHashMap();

    public static C61520OCm LIZ(String str) {
        Object LIZ2;
        Object obj = null;
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        if (concurrentHashMap.get(str) != null) {
            return (C61520OCm) concurrentHashMap.get(str);
        }
        try {
            C61532OCy c61532OCy = EBC.LIZ;
            o.LJFF(c61532OCy, "GeckoGlobalManager.inst()");
            c61532OCy.LIZIZ();
            GeckoGlobalConfig geckoConfig = c61532OCy.LJ;
            o.LJFF(geckoConfig, "geckoConfig");
            O2T o2t = new O2T(geckoConfig.getContext());
            o2t.LIZJ(geckoConfig.getAppId());
            o2t.LJII = geckoConfig.getAppVersion();
            o2t.LJIIIIZZ = geckoConfig.getDeviceId();
            o2t.LIZ = geckoConfig.getNetWork();
            o2t.LJ = geckoConfig.getStatisticMonitor();
            o2t.LJIIIZ = geckoConfig.getHost();
            o2t.LIZ(str);
            o2t.LIZIZ(str);
            LIZ2 = C61520OCm.LIZLLL(new C61276O3c(o2t));
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        return (C61520OCm) obj;
    }
}
