package Y;

import X.C1JD;
import X.C36178EHu;
import X.C69084R9k;
import X.C69093R9t;
import X.EnumC69113RAn;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.Q13;
import X.Y4W;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AfS4S2200000_15 implements InterfaceC64592gB {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS4S2200000_15 afS4S2200000_15, Object obj) {
        Q13.LIZIZ("monitor_bind_phone", 0, C36178EHu.LIZ(0, "", "bindPhone"));
        C1JD.LJJIIZ(0, ((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJJI(), "mobile", null, afS4S2200000_15.s0, ((InterfaceC69056R8i) afS4S2200000_15.l2).Hg(), ((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJLLLLLLLZ(), afS4S2200000_15.s1);
        C1JD.LJJ(0, ((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJLLLLLLLZ(), "phone", ((InterfaceC69056R8i) afS4S2200000_15.l2).Hg());
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.SUCCESS.getValue());
        clientSmsVerificationResultEvent.LJIIJ(C69093R9t.LJIJ((EnumC69113RAn) afS4S2200000_15.l3));
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }

    public static final void accept$1(AfS4S2200000_15 afS4S2200000_15, Object obj) {
        Throwable th = (Throwable) obj;
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.FAILURE.getValue());
        clientSmsVerificationResultEvent.LJIIJ(C69093R9t.LJIJ((EnumC69113RAn) afS4S2200000_15.l3));
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        Q13.LIZIZ("monitor_bind_phone", 1, C36178EHu.LIZ(c69084R9k.getErrorCode(), c69084R9k.getErrorMsg(), "bindPhone"));
        C1JD.LJJIIZ(c69084R9k.getErrorCode(), ((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJJI(), "mobile", c69084R9k.getErrorMsg(), afS4S2200000_15.s0, ((InterfaceC69056R8i) afS4S2200000_15.l2).Hg(), ((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJLLLLLLLZ(), afS4S2200000_15.s1);
        C1JD.LJJ(c69084R9k.getErrorCode(), ((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS4S2200000_15.l2).q9().LJJLIIIJLLLLLLLZ(), "phone", ((InterfaceC69056R8i) afS4S2200000_15.l2).Hg());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS4S2200000_15(X.EnumC69113RAn r2, X.InterfaceC69056R8i r3, java.lang.String r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l2 = r3
            r0.l3 = r2
            r0.s0 = r4
            r0.s1 = r5
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l2 = r3
            r0.s0 = r4
            r0.s1 = r5
            r0.l3 = r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS4S2200000_15.<init>(X.RAn, X.R8i, java.lang.String, java.lang.String, int):void");
    }
}
