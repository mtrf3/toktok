package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TxH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76315TxH implements InterfaceC76804UCi {
    public final /* synthetic */ AbstractC76285Twn<InterfaceC76358Txy> LIZ;

    @Override // X.InterfaceC76804UCi
    public final void LIZ() {
        C0NB.LJIIIZ("IMatchViewPresenter", "startPunishCountDown, finish");
        DataChannel LJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.rv0(BattlePunishTimeLeftChannel.class, 0L);
        }
        this.LIZ.LJIIJ("punish_count_down", false);
    }

    public C76315TxH(AbstractC76285Twn<InterfaceC76358Txy> abstractC76285Twn) {
        this.LIZ = abstractC76285Twn;
    }

    @Override // X.InterfaceC76804UCi
    public final void LJIILIIL(long j) {
        C44878HjO.LIZJ("BattleCountDown, countdownTime = ", j, "IMatchViewPresenter");
        DataChannel LJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.rv0(BattlePunishTimeLeftChannel.class, Long.valueOf(j));
        }
    }
}
