package Y;

import X.C1JD;
import X.C36178EHu;
import X.C68972R5c;
import X.C68986R5q;
import X.C69084R9k;
import X.C69093R9t;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.Q13;
import X.Y4W;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AfS40S0101000_15 implements InterfaceC64592gB {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS40S0101000_15 afS40S0101000_15, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        Q13.LIZIZ("monitor_rebind_phone", 1, C36178EHu.LIZ(c69084R9k.getErrorCode(), c69084R9k.getErrorMsg(), "changePhone"));
        C1JD.LJJ(c69084R9k.getErrorCode(), ((InterfaceC69056R8i) afS40S0101000_15.l0).q9().LJJLIIIJJI(), "rebind_phone_click", "phone", null);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS40S0101000_15.l0).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS40S0101000_15.l0).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.FAILURE.getValue());
        clientSmsVerificationResultEvent.LJIIJ(afS40S0101000_15.i1);
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }

    public static final void accept$1(AfS40S0101000_15 afS40S0101000_15, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        if (c69084R9k.getErrorCode() == 1011) {
            return;
        }
        C68986R5q.LIZ.LJ(c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg(), false);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS40S0101000_15.l0).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS40S0101000_15.l0).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.FAILURE.getValue());
        clientSmsVerificationResultEvent.LJIIJ(afS40S0101000_15.i1);
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }

    public static final void accept$2(AfS40S0101000_15 afS40S0101000_15, Object obj) {
        C68972R5c.LJ(true, (InterfaceC69056R8i) afS40S0101000_15.l0);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS40S0101000_15.l0).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS40S0101000_15.l0).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.SUCCESS.getValue());
        clientSmsVerificationResultEvent.LJIIJ(C69093R9t.LJIILLIIL(afS40S0101000_15.i1));
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }

    public AfS40S0101000_15(InterfaceC69056R8i interfaceC69056R8i, int i, int i2) {
        this.$t = i2;
        this.l0 = interfaceC69056R8i;
        this.i1 = i;
    }
}
