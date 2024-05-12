package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.UpdatePackage;

/* loaded from: classes11.dex */
public final class ODT extends OE9 {
    @Override // X.OE9
    public final void LIZIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        UpdatePackage updatePackage = (UpdatePackage) c61546ODm.LIZIZ(C61545ODl.class);
        ODS LIZIZ = ODP.LIZIZ(c61546ODm, false);
        LIZIZ.LIZLLL = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        LIZIZ.LJFF = uptimeMillis - LIZIZ.LJIILL;
        OE3 LIZIZ2 = LIZIZ.LIZIZ(updatePackage, false);
        LIZIZ2.LIZIZ = true;
        long j = uptimeMillis - LIZIZ2.LJII;
        LIZIZ.LJI = j;
        LIZIZ.LJIIIZ = j - LIZIZ.LJII;
        C61532OCy c61532OCy = EBC.LIZ;
        c61532OCy.LIZIZ();
        GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
        if (geckoGlobalConfig != null) {
            LIZIZ.LJIILJJIL = System.currentTimeMillis() - geckoGlobalConfig.getAppColdStartTime();
        }
        OD6.LJIIL(updatePackage);
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        ODP.LIZJ(c61546ODm, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, th);
    }
}
