package Y;

import X.C1JD;
import X.C36178EHu;
import X.C68972R5c;
import X.C68985R5p;
import X.C69074R9a;
import X.C69084R9k;
import X.C69093R9t;
import X.C78688UuS;
import X.C85631Xj9;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.InterfaceC88472Yns;
import X.Q13;
import X.QTX;
import X.Y4W;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AfS34S0201000_15 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS34S0201000_15 afS34S0201000_15, Object obj) {
        if (obj instanceof C69084R9k) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS34S0201000_15.l0;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(obj);
            }
            C68972R5c.LJ(false, (InterfaceC69056R8i) afS34S0201000_15.l1);
            ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
            clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS34S0201000_15.l1).q9().LJJLIIIJJI());
            clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS34S0201000_15.l1).q9().LJJLIIIJLLLLLLLZ());
            clientSmsVerificationResultEvent.LJIIIZ(Y4W.FAILURE.getValue());
            clientSmsVerificationResultEvent.LJIIJ(C69093R9t.LJIILLIIL(afS34S0201000_15.i2));
            clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
            clientSmsVerificationResultEvent.LJFF();
        }
    }

    public static final void accept$1(AfS34S0201000_15 afS34S0201000_15, Object obj) {
        C68972R5c.LJ(true, (InterfaceC69056R8i) afS34S0201000_15.l0);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS34S0201000_15.l0).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS34S0201000_15.l0).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.SUCCESS.getValue());
        clientSmsVerificationResultEvent.LJIIJ(C69093R9t.LJIILLIIL(afS34S0201000_15.i2));
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
        C85631Xj9.LJIIJJI((BaseAccountFlowFragment) afS34S0201000_15.l1, 1, 0);
    }

    public static final void accept$2(AfS34S0201000_15 afS34S0201000_15, Object obj) {
        Throwable it = (Throwable) obj;
        if (it instanceof C69084R9k) {
            C68972R5c.LJ(false, (InterfaceC69056R8i) afS34S0201000_15.l0);
        }
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS34S0201000_15.l0).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS34S0201000_15.l0).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.FAILURE.getValue());
        clientSmsVerificationResultEvent.LJIIJ(C69093R9t.LJIILLIIL(afS34S0201000_15.i2));
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS34S0201000_15.l1;
        o.LJIIIIZZ(it, "it");
        C85631Xj9.LJIIJJI(baseAccountFlowFragment, 0, C78688UuS.LJJIIZ(it));
    }

    public static final void accept$3(AfS34S0201000_15 afS34S0201000_15, Object obj) {
        Q13.LIZIZ("monitor_rebind_phone", 0, C36178EHu.LIZ(0, "", "changePhone"));
        String str = null;
        C1JD.LJJ(0, ((InterfaceC69056R8i) afS34S0201000_15.l0).q9().LJJLIIIJJI(), "rebind_phone_click", "phone", null);
        String LJJLIIIJJI = ((InterfaceC69056R8i) afS34S0201000_15.l0).q9().LJJLIIIJJI();
        String LJJLIIIJLLLLLLLZ = ((InterfaceC69056R8i) afS34S0201000_15.l0).q9().LJJLIIIJLLLLLLLZ();
        Bundle arguments = ((BaseAccountFlowFragment) afS34S0201000_15.l1).getArguments();
        if (arguments != null) {
            str = arguments.getString("page");
        }
        C1JD.LJJI("phone_bind_status", LJJLIIIJJI, LJJLIIIJLLLLLLLZ, str, "changed_to_new_phone");
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS34S0201000_15.l0).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS34S0201000_15.l0).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.SUCCESS.getValue());
        clientSmsVerificationResultEvent.LJIIJ(afS34S0201000_15.i2);
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }

    public static final void accept$4(AfS34S0201000_15 afS34S0201000_15, Object obj) {
        C69074R9a c69074R9a = (C69074R9a) obj;
        Fragment fragment = (Fragment) afS34S0201000_15.l0;
        InterfaceC69056R8i interfaceC69056R8i = (InterfaceC69056R8i) afS34S0201000_15.l1;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        QTX qtx = c69074R9a.LJFF;
        o.LJIIIIZZ(qtx, "it.mUserInfo");
        C68985R5p.LIZIZ(fragment, interfaceC69056R8i, enumC69116RAq, LJLLLL, qtx);
        C68972R5c.LJIIIZ(false, "sms_verification", ((InterfaceC69056R8i) afS34S0201000_15.l1).q9(), c69074R9a.LJFF, null);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((InterfaceC69056R8i) afS34S0201000_15.l1).q9().LJJLIIIJJI());
        clientSmsVerificationResultEvent.LJII(((InterfaceC69056R8i) afS34S0201000_15.l1).q9().LJJLIIIJLLLLLLLZ());
        clientSmsVerificationResultEvent.LJIIIZ(Y4W.SUCCESS.getValue());
        clientSmsVerificationResultEvent.LJIIJ(afS34S0201000_15.i2);
        clientSmsVerificationResultEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJFF();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS34S0201000_15(int r2, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment r3, X.InterfaceC69056R8i r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 1: goto L10;
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.i2 = r2
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r4
            r0.i2 = r2
            r0.l1 = r3
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS34S0201000_15.<init>(int, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.R8i, int):void");
    }

    public AfS34S0201000_15(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
