package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.Tww, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76294Tww implements InterfaceC76804UCi {
    public long LIZ = -1;
    public final /* synthetic */ C76279Twh LIZIZ;
    public final /* synthetic */ long LIZJ;

    @Override // X.InterfaceC76804UCi
    public final void LIZ() {
        DataChannel LJI;
        if (this.LIZ != 0 && (LJI = this.LIZIZ.LJI()) != null) {
            LJI.rv0(BattleTimeLeftChannel.class, 0L);
        }
        boolean z = C76265TwT.LIZ.LJ;
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = C76272Twa.LIZ;
        C76272Twa.LJIJJ(jSONObject, false);
        C76272Twa.LJJJLIIL(c76272Twa, "open_message_timer_complete", jSONObject, z, null, 56);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BattleCountDown, finish, real time past = ");
        LIZ.append(C76273Twb.LIZ() - this.LIZJ);
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", X1D.LIZIZ(LIZ));
        InterfaceC29856Bng interfaceC29856Bng = (InterfaceC29856Bng) AbstractC73672Svk.LJJLIIIJLJLI(LiveTimeIncrementForBattleSetting.INSTANCE.getValue(), TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LIZJ(this.LIZIZ.LIZIZ());
        C76279Twh c76279Twh = this.LIZIZ;
        interfaceC29856Bng.LIZJ(new AfS65S0100000_13(c76279Twh, 92), new AfS65S0100000_13(c76279Twh, 93));
    }

    @Override // X.InterfaceC76804UCi
    public final void LJIILIIL(long j) {
        this.LIZ = j;
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "BattleCountDown, countdownTime = second");
        DataChannel LJI = this.LIZIZ.LJI();
        if (LJI != null) {
            LJI.rv0(BattleTimeLeftChannel.class, Long.valueOf(j));
        }
    }

    public C76294Tww(C76279Twh c76279Twh, long j) {
        this.LIZIZ = c76279Twh;
        this.LIZJ = j;
    }
}
