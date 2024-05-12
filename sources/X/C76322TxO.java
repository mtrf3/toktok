package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TxO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76322TxO implements InterfaceC76804UCi {
    public final /* synthetic */ C76278Twg LIZ;

    @Override // X.InterfaceC76804UCi
    public final void LIZ() {
        DataChannel LJI = this.LIZ.LJI();
        if (LJI != null) {
            LJI.rv0(BattlePunishTimeLeftChannel.class, 0L);
        }
        C76278Twg.LJJIJLIJ(102, 12, 0L, this.LIZ, false);
    }

    public C76322TxO(C76278Twg c76278Twg) {
        this.LIZ = c76278Twg;
    }

    @Override // X.InterfaceC76804UCi
    public final void LJIILIIL(long j) {
        C44878HjO.LIZJ("BattleCountDown, countdownTime = ", j, "MultiMatchViewAnchorPre");
        DataChannel LJI = this.LIZ.LJI();
        if (LJI != null) {
            LJI.rv0(BattlePunishTimeLeftChannel.class, Long.valueOf(j));
        }
    }
}
