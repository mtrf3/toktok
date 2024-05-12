package X;

import Y.AObjectS8S0001000_1;
import Y.ARunnableS13S0000000_6;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.legoImp.task.FeedCachePreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister;

/* renamed from: X.EMn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36301EMn implements QJ8 {
    @Override // X.QJ8
    public final void LIZ(boolean z) {
        CommonFeedLaunchServiceImpl.LJ().LIZIZ(!z);
        if (z) {
            ObserveDeviceRegister.LIZLLL();
        }
    }

    @Override // X.QJ8
    public final void LIZIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            ObserveDeviceRegister.LIZLLL();
            TrustedEnvApi.LIZ(new AObjectS8S0001000_1(0, 1));
            if (C36152EGu.LJ() && C86801Y4v.LIZ() && ((Boolean) C33873DRd.LIZLLL.getValue()).booleanValue()) {
                FMW.LIZ(new ARunnableS13S0000000_6(22));
            }
        }
    }

    @Override // X.QJ8
    public final void LIZJ(boolean z, boolean z2) {
        if (!C36311EMx.LIZIZ) {
            if (DUE.LIZJ() || DUE.LIZIZ()) {
                C36093EEn.LIZ.getClass();
                C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                LJIIIZ.LIZIZ(new FeedCachePreloadTask(1, 2), true);
                LJIIIZ.LIZJ();
                C36311EMx.LIZIZ = true;
            }
        }
    }
}
