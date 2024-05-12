package X;

import Y.AfS1S0110100_13;
import Y.AfS5S0111000_13;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStartCountDownChannel;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.match.ui.fragment.InteractBattleBeInvitedFragmentV2;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TwM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76258TwM extends AbstractC75836TpY {
    public final DataChannel LJLJJI;

    public C76258TwM(InteractBattleBeInvitedFragmentV2 interactBattleBeInvitedFragmentV2, DataChannel dataChannel) {
        super(interactBattleBeInvitedFragmentV2);
        this.LJLJJI = dataChannel;
    }

    @Override // X.AbstractC75836TpY
    public final void LIZJ(int i, long j) {
        boolean z;
        long LIZJ = C76265TwT.LIZ.LIZJ();
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!C8E.LIZLLL().LLIFFJFJJ()) {
            C75457TjR.LJIIL(j, z, true);
        }
        C76272Twa.LJJJIL(j, "normal", z);
        this.LJLJJI.rv0(BattleStartCountDownChannel.class, Boolean.valueOf(z));
        long value = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        long value2 = LiveTimeIncrementForBattleSetting.INSTANCE.getValue() + value;
        C65814PsI.LIZ().getClass();
        ((InterfaceC29856Bng) ((LinkBattleApi) C65814PsI.LIZIZ(LinkBattleApi.class)).open(LIZJ, j, value, value2, 0).LIZJ(LIZ())).LIZJ(new AfS1S0110100_13(this, z, j, 0), new AfS1S0110100_13(this, z, j, 1));
        C75597Tlh.LIZLLL(true);
    }

    @Override // X.AbstractC75836TpY
    public final void LIZLLL(int i, long j) {
        boolean z;
        int i2;
        long LIZJ = C76265TwT.LIZ.LIZJ();
        if (i == 1) {
            z = true;
            i2 = 2;
        } else {
            z = false;
            i2 = 0;
        }
        if (!C8E.LIZLLL().LLIFFJFJJ()) {
            C75457TjR.LJIIL(j, z, false);
        }
        C76261TwP.LIZ = true;
        C76272Twa.LJJJJJL("normal", null, z);
        C65814PsI.LIZ().getClass();
        ((InterfaceC29856Bng) ((LinkBattleApi) C65814PsI.LIZJ(LinkBattleApi.class)).reject(LIZJ, j, i, 0).LIZJ(LIZ())).LIZJ(new AfS5S0111000_13(i2, this, z, 2), new AfS5S0111000_13(i2, this, z, 3));
        C75597Tlh.LIZLLL(false);
    }
}
