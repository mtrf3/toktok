package X;

import Y.AfS65S0100000_13;
import Y.AfS8S0100100_13;
import Y.IDaS222S0100000_13;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchMateQuitRequestFragment;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TwG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76252TwG extends AbstractC76249TwD {
    public final C76255TwJ LJLJJI;
    public final C76244Tw8 LJLJJL;
    public InterfaceC92693kP LJLJJLL;

    @Override // X.AbstractC76249TwD
    public final void LIZJ() {
        Long value = this.LJLJJL.LIZ.getValue();
        if (value == null) {
            value = 0L;
        }
        long longValue = value.longValue();
        this.LJLJJL.getClass();
        long LIZ = C76244Tw8.LIZ();
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        C76271TwZ.LJIILIIL = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        long LIZ2 = C30725C4b.LIZ() - C76271TwZ.LJIIIIZZ;
        C76271TwZ.LJJ(jSONObject, false);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "match_duration", LIZ2);
        C76271TwZ.LJJZZIII(c76271TwZ, "quit_approve_request", jSONObject, jSONObject2, jSONObject3, false, 16);
        ((InterfaceC29856Bng) ((MultiMatchApi) Q7L.LIZIZ(MultiMatchApi.class)).approvalQuit(longValue, LIZ, 1).LIZJ(LIZ())).LIZJ(new AfS8S0100100_13(LIZ, this, 0), C76253TwH.LJLIL);
        C75832TpU.LIZ.LJJIJIIJI(true, this.LJLJJI.LIZIZ, false);
    }

    @Override // X.AbstractC76249TwD
    public final void LIZLLL() {
        InterfaceC92693kP interfaceC92693kP;
        InterfaceC92693kP interfaceC92693kP2 = this.LJLJJLL;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = this.LJLJJLL) != null) {
            interfaceC92693kP.dispose();
        }
        this.LJLJJLL = ((InterfaceC29856Bng) TMC.LJIL(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(20L).LJJIJL(C78983UzD.LJLLI).LJJJ(C73969T1h.LIZIZ()).LIZJ(LIZ())).LIZLLL(new AfS65S0100000_13(this, 10), C76251TwF.LJLIL, new IDaS222S0100000_13(this, 0));
    }

    public final void LJII() {
        InterfaceC92693kP interfaceC92693kP;
        InterfaceC92693kP interfaceC92693kP2 = this.LJLJJLL;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = this.LJLJJLL) != null) {
            interfaceC92693kP.dispose();
        }
    }

    @Override // X.AbstractC76249TwD
    public final void LJ() {
        LJII();
    }

    @Override // X.AbstractC76249TwD
    public final C76244Tw8 LJFF() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC76249TwD
    public final void LJI(boolean z) {
        int i;
        Long value = this.LJLJJL.LIZ.getValue();
        if (value == null) {
            value = 0L;
        }
        long longValue = value.longValue();
        this.LJLJJL.getClass();
        long LIZ = C76244Tw8.LIZ();
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        ((InterfaceC29856Bng) ((MultiMatchApi) Q7L.LIZIZ(MultiMatchApi.class)).approvalQuit(longValue, LIZ, i).LIZJ(LIZ())).LIZJ(new AfS65S0100000_13(this, 9), C76254TwI.LJLIL);
        C75832TpU.LIZ.LJJIJIIJI(false, this.LJLJJI.LIZIZ, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76252TwG(MultiMatchMateQuitRequestFragment multiMatchMateQuitRequestFragment, C76255TwJ params) {
        super(multiMatchMateQuitRequestFragment);
        o.LJIIIZ(params, "params");
        this.LJLJJI = params;
        this.LJLJJL = (C76244Tw8) params.LIZIZ.LJZI(C76244Tw8.class);
    }
}
