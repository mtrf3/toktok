package X;

import Y.IDRunnableS6S0101000;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ncp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59759Ncp implements O86 {
    public NormalSplashAdActivity LIZ;
    public final boolean LIZIZ = false;

    @Override // X.O86
    public final void LIZIZ() {
    }

    @Override // X.O86
    public final void LIZJ(O8I o8i) {
        C2U8.LIZ(new C9G5());
        NormalSplashAdActivity normalSplashAdActivity = this.LIZ;
        if (normalSplashAdActivity == null) {
            return;
        }
        NormalSplashAdActivity.LJLJI = o8i.LIZ;
        normalSplashAdActivity.finish();
        int i = NormalSplashAdActivity.LJLJI;
        if (i == 1 || i == 4) {
            IFT.LIZIZ(System.currentTimeMillis(), "skip");
        } else if (i == 3) {
            IFT.LIZIZ(System.currentTimeMillis(), "click");
        } else {
            IFT.LIZIZ(System.currentTimeMillis(), "finish");
        }
    }

    @Override // X.O86
    public final void LIZLLL(C59760Ncq c59760Ncq) {
        String str;
        long j;
        String str2;
        NormalSplashAdActivity normalSplashAdActivity = this.LIZ;
        if (normalSplashAdActivity == null) {
            return;
        }
        IFT.LIZIZ(System.currentTimeMillis(), "click");
        C36922EeM.LJ("openSplashScheme: from = SplashAdActivity");
        TroubleshootingLogDelegate.INSTANCE.ordinarySplashLog("Click to open the screen and hang up");
        C72545SdZ c72545SdZ = new C72545SdZ();
        List<C59762Ncs> list = c59760Ncq.LIZLLL;
        if (!C79004UzY.LJJIFFI(list)) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C59762Ncs c59762Ncs = (C59762Ncs) it.next();
                if (c59762Ncs != null) {
                    str = c59762Ncs.LIZ;
                    int i = c59762Ncs.LIZIZ;
                    if (!TextUtils.isEmpty(str)) {
                        j = c59760Ncq.LIZ;
                        str2 = c59760Ncq.LIZIZ;
                        if (i != 1) {
                            if (i != 2) {
                                if (!C38354F3m.LJ(str) && (str.toLowerCase().startsWith("http://") || str.toLowerCase().startsWith("https://"))) {
                                    if (C59292NOu.LIZIZ(normalSplashAdActivity, str, c59760Ncq.LIZJ, Long.valueOf(j), str2, (NativeSiteConfig) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), c59760Ncq.LJFF, NativeSiteConfig.class), c59760Ncq.LJI, c59760Ncq.LJII)) {
                                        break;
                                    }
                                }
                            } else if (C59292NOu.LIZIZ(normalSplashAdActivity, str, c59760Ncq.LIZJ, Long.valueOf(j), str2, (NativeSiteConfig) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), c59760Ncq.LJFF, NativeSiteConfig.class), c59760Ncq.LJI, c59760Ncq.LJII)) {
                                break;
                            }
                        } else {
                            C59292NOu.LIZ(normalSplashAdActivity, str, Long.valueOf(j), str2, c72545SdZ);
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            C59292NOu.LIZ(normalSplashAdActivity, str, Long.valueOf(j), str2, c72545SdZ);
        }
        if (this.LIZIZ) {
            long LIZIZ = C012403c.LIZIZ(31744, 0L, "splashad_finish_delay");
            if (LIZIZ > 0) {
                normalSplashAdActivity.LJLIL.postDelayed(new IDRunnableS6S0101000(1, normalSplashAdActivity, 26), LIZIZ);
                return;
            }
        }
        normalSplashAdActivity.finish();
    }

    @Override // X.O86
    public final void LIZ(long j, String str) {
        long currentTimeMillis = System.currentTimeMillis() - NW6.LIZ().LJIIIIZZ();
        C58655N0h LJ = C58704N2e.LJ("splash_ad", "first_view", String.valueOf(j), str, CardStruct.IStatusCode.DEFAULT);
        LJ.LIZIZ(Long.valueOf(currentTimeMillis), "launchduration");
        LJ.LJI();
        long currentTimeMillis2 = System.currentTimeMillis();
        IFT.LIZ = currentTimeMillis;
        IFT.LJ = 2;
        IFT.LIZIZ = currentTimeMillis2;
    }
}
