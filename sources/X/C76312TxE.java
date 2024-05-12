package X;

import Y.ARunnableS17S0101000_13;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostFeedMatchRetryIntervalSetting;

/* renamed from: X.TxE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76312TxE {
    public InterfaceC76348Txo LIZ;
    public final C73318Sq2 LIZIZ = new C73318Sq2();
    public final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());
    public int LIZLLL;

    public final void LIZ(int i) {
        if (this.LIZ == null) {
            C0NB.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo, return by viewInterface == null");
            return;
        }
        QZP.LIZJ("checkBattleInfo, type = ", i, "MatchFeedWidgetPresenter");
        int i2 = this.LIZLLL;
        if (i2 == 0) {
            C0NB.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo, return by remainedGetBattleInfoRetryCount == 0");
        } else {
            this.LIZLLL = i2 - 1;
            this.LIZJ.postDelayed(new ARunnableS17S0101000_13(i, this, 14), LiveCohostFeedMatchRetryIntervalSetting.INSTANCE.getValue());
        }
    }
}
