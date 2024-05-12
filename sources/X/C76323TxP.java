package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TxP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76323TxP implements InterfaceC76804UCi {
    public final /* synthetic */ AbstractC76298Tx0 LIZ;

    @Override // X.InterfaceC76804UCi
    public final void LIZ() {
        C0NB.LJIIIZ("MatchFeedViewDelegateAbs", "startPunishCountDown, finish");
        DataChannel LJFF = this.LIZ.LJFF();
        if (LJFF != null) {
            LJFF.rv0(BattlePunishTimeLeftChannel.class, 0L);
        }
        this.LIZ.LJIIIIZZ("punish_count_down");
    }

    public C76323TxP(AbstractC76298Tx0 abstractC76298Tx0) {
        this.LIZ = abstractC76298Tx0;
    }

    @Override // X.InterfaceC76804UCi
    public final void LJIILIIL(long j) {
        DataChannel LJFF = this.LIZ.LJFF();
        if (LJFF != null) {
            LJFF.rv0(BattlePunishTimeLeftChannel.class, Long.valueOf(j));
        }
    }
}
