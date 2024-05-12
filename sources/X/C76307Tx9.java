package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Tx9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76307Tx9 implements InterfaceC76804UCi {
    public final /* synthetic */ AbstractC76298Tx0 LIZ;

    @Override // X.InterfaceC76804UCi
    public final void LIZ() {
        C0NB.LJIIIZ("MatchFeedViewDelegateAbs", "BattleCountDown, finish");
        DataChannel LJFF = this.LIZ.LJFF();
        if (LJFF != null) {
            LJFF.rv0(BattleTimeLeftChannel.class, 0L);
        }
        C73454SsE LJJJ = AbstractC73672Svk.LJJLIIIJLJLI(LiveTimeIncrementForBattleSetting.INSTANCE.getValue(), TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ());
        AbstractC76298Tx0 abstractC76298Tx0 = this.LIZ;
        this.LIZ.LJLILLLLZI.LIZ(LJJJ.LJJJLIIL(new AfS65S0100000_13(abstractC76298Tx0, 137), new AfS65S0100000_13(abstractC76298Tx0, 138)));
    }

    public C76307Tx9(AbstractC76298Tx0 abstractC76298Tx0) {
        this.LIZ = abstractC76298Tx0;
    }

    @Override // X.InterfaceC76804UCi
    public final void LJIILIIL(long j) {
        DataChannel LJFF = this.LIZ.LJFF();
        if (LJFF != null) {
            LJFF.rv0(BattleTimeLeftChannel.class, Long.valueOf(j));
        }
    }
}
