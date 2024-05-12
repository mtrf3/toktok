package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NNA {
    public static boolean LIZJ;
    public static final java.util.Map<Aweme, String> LIZ = new LinkedHashMap();
    public static boolean LIZIZ = true;
    public static boolean LIZLLL = true;

    public static boolean LIZIZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getNativeSiteConfig() != null && o.LJ("lynx", awemeRawAd.getNativeSiteConfig().getRenderType()) && C78685UuP.LJJJZ(awemeRawAd.getNativeSiteConfig().getLynxScheme())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (LIZIZ(r0) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(android.content.Context r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r5 = 0
            com.ss.android.ugc.aweme.services.IMainService r0 = com.ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin(r5)
            boolean r0 = r0.isMainPage(r6)
            if (r0 == 0) goto L4b
            r4 = 1
            r3 = 31744(0x7c00, float:4.4483E-41)
            X.FFL r1 = X.FFL.LJIIIZ()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = "left_slide_lynx_page_optimize_enable"
            r1.getClass()     // Catch: java.lang.Throwable -> L1c
            boolean r0 = X.FFL.LJ(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2 = 0
            if (r0 == 0) goto L2f
            if (r7 == 0) goto L2d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
        L26:
            boolean r0 = LIZIZ(r0)
            if (r0 != 0) goto L4a
            goto L2f
        L2d:
            r0 = r2
            goto L26
        L2f:
            X.FFL r1 = X.FFL.LJIIIZ()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "left_slide_webpage_optimize_enable"
            r1.getClass()     // Catch: java.lang.Throwable -> L4b
            boolean r0 = X.FFL.LJ(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L4b
            if (r7 == 0) goto L44
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r7.getAwemeRawAd()
        L44:
            boolean r0 = LIZIZ(r2)
            if (r0 != 0) goto L4b
        L4a:
            r5 = 1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NNA.LIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
