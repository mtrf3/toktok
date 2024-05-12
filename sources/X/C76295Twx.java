package X;

import Y.AfS65S0100000_13;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Twx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76295Twx implements InterfaceC76804UCi {
    public final /* synthetic */ AbstractC76285Twn<P> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC76804UCi
    public final void LIZ() {
        MultiMatchAudienceWidget multiMatchAudienceWidget;
        C0NB.LJIIIZ("IMatchViewPresenter", "BattleCountDown, finish");
        DataChannel LJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.rv0(BattleTimeLeftChannel.class, 0L);
        }
        C73454SsE LJJJ = AbstractC73672Svk.LJJLIIIJLJLI(LiveTimeIncrementForBattleSetting.INSTANCE.getValue(), TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ());
        AbstractC76285Twn<P> abstractC76285Twn = this.LIZ;
        abstractC76285Twn.getClass();
        C62705OjF c62705OjF = new C62705OjF();
        P p = abstractC76285Twn.LJII;
        if (p != 0) {
            multiMatchAudienceWidget = p.LIZLLL();
        } else {
            multiMatchAudienceWidget = null;
        }
        InterfaceC29856Bng interfaceC29856Bng = (InterfaceC29856Bng) LJJJ.LIZJ(C73933Szx.LIZ(C73931Szv.LIZIZ(multiMatchAudienceWidget, Lifecycle.Event.ON_DESTROY), c62705OjF));
        Object obj = this.LIZ;
        interfaceC29856Bng.LIZJ(new AfS65S0100000_13(obj, 104), new AfS65S0100000_13(obj, 105));
    }

    public C76295Twx(AbstractC76285Twn<P> abstractC76285Twn) {
        this.LIZ = abstractC76285Twn;
    }

    @Override // X.InterfaceC76804UCi
    public final void LJIILIIL(long j) {
        C44878HjO.LIZJ("BattleCountDown, countdownTime = ", j, "IMatchViewPresenter");
        DataChannel LJIIIIZZ = this.LIZ.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.rv0(BattleTimeLeftChannel.class, Long.valueOf(j));
        }
    }
}
