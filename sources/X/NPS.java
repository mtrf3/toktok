package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class NPS implements C14Q {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ List LJLILLLLZI;

    @Override // X.C14Q
    public final Object apply(Object obj) {
        NPT npt = C61359O6h.LJJIIZI;
        List list = this.LJLIL;
        npt.getClass();
        NPQ.LIZIZ().getClass();
        NW6.LIZ().LJII();
        if (NPQ.LIZJ()) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: filter by low device");
            return null;
        }
        if (NPQ.LIZIZ == null) {
            return null;
        }
        if (C79004UzY.LJJIFFI(list)) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("cancel download reason: splash ids null");
            return null;
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Aweme LIZJ = NPQ.LIZIZ.LIZJ((String) it.next());
            if (LIZJ != null) {
                new TopViewAdEventLogger().LJI(NMA.LJIIJ, LIZJ.getAwemeRawAd());
                if (!z || C00F.LIZ(31744, 0, "awesome_splash_preload_optimize", true) == 0) {
                    if (NPQ.LIZ(LIZJ)) {
                        z = true;
                    }
                }
            }
        }
        return null;
    }

    public NPS(List list, List list2) {
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
    }
}
