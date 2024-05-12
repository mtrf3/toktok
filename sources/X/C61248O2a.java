package X;

import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;

/* renamed from: X.O2a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61248O2a {
    public static C61157NzN LIZ(O2J o2j, GeckoConfig geckoConfig) {
        long j;
        String accessKey = geckoConfig.getAccessKey();
        String offlineDir = geckoConfig.getOfflineDir();
        o2j.getClass();
        Long LJJIZ = C38350F3i.LJJIZ(O2J.LIZ());
        if (LJJIZ != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        String LIZIZ = O2J.LIZIZ();
        String LIZJ = O2J.LIZJ();
        String LIZLLL = O2J.LIZLLL();
        boolean isRelativePath = geckoConfig.isRelativePath();
        geckoConfig.getLoopCheck();
        return new C61157NzN(accessKey, offlineDir, j, LIZIZ, LIZJ, LIZLLL, isRelativePath);
    }
}
