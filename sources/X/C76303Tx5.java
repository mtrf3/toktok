package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Tx5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76303Tx5 implements InterfaceC76804UCi {
    public long LIZ = -1;
    public final /* synthetic */ C76278Twg LIZIZ;

    @Override // X.InterfaceC76804UCi
    public final void LIZ() {
        DataChannel LJI;
        C0NB.LJIIIZ("MultiMatchViewAnchorPre", "BattleCountDown, finish");
        if (this.LIZ != 0 && (LJI = this.LIZIZ.LJI()) != null) {
            LJI.rv0(BattleTimeLeftChannel.class, 0L);
        }
        InterfaceC29856Bng interfaceC29856Bng = (InterfaceC29856Bng) AbstractC73672Svk.LJJLIIIJLJLI(LiveTimeIncrementForBattleSetting.INSTANCE.getValue(), TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LIZJ(this.LIZIZ.LIZIZ());
        C76278Twg c76278Twg = this.LIZIZ;
        interfaceC29856Bng.LIZJ(new AfS65S0100000_13(c76278Twg, 89), new AfS65S0100000_13(c76278Twg, 90));
    }

    public C76303Tx5(C76278Twg c76278Twg) {
        this.LIZIZ = c76278Twg;
    }

    @Override // X.InterfaceC76804UCi
    public final void LJIILIIL(long j) {
        this.LIZ = j;
        C44878HjO.LIZJ("BattleCountDown, countdownTime = ", j, "MultiMatchViewAnchorPre");
        DataChannel LJI = this.LIZIZ.LJI();
        if (LJI != null) {
            LJI.rv0(BattleTimeLeftChannel.class, Long.valueOf(j));
        }
    }
}
