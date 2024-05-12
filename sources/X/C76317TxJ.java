package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TxJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76317TxJ implements InterfaceC76804UCi {
    public final /* synthetic */ C76279Twh LIZ;

    @Override // X.InterfaceC76804UCi
    public final void LIZ() {
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "startPunishCountDown, finish");
        DataChannel LJI = this.LIZ.LJI();
        if (LJI != null) {
            LJI.rv0(BattlePunishTimeLeftChannel.class, 0L);
        }
        this.LIZ.LJJIJIIJIL(102, false, null);
    }

    public C76317TxJ(C76279Twh c76279Twh) {
        this.LIZ = c76279Twh;
    }

    @Override // X.InterfaceC76804UCi
    public final void LJIILIIL(long j) {
        C44878HjO.LIZJ("BattleCountDown, countdownTime = ", j, "TwoMatchViewAnchorPrese");
        DataChannel LJI = this.LIZ.LJI();
        if (LJI != null) {
            LJI.rv0(BattlePunishTimeLeftChannel.class, Long.valueOf(j));
        }
    }
}
