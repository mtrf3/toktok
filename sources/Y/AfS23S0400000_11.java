package Y;

import X.C68972R5c;
import X.C68985R5p;
import X.C68986R5q;
import X.C69084R9k;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC69056R8i;
import X.InterfaceC88471Ynr;
import X.QTX;
import X.R6R;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AfS23S0400000_11 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final void accept$0(AfS23S0400000_11 afS23S0400000_11, Object obj) {
        QTX qtx = ((R6R) obj).LJIIIZ;
        if (qtx != null) {
            C68985R5p.LIZIZ((Fragment) afS23S0400000_11.l0, (InterfaceC69056R8i) afS23S0400000_11.l1, (EnumC69116RAq) afS23S0400000_11.l2, (EnumC69113RAn) afS23S0400000_11.l3, qtx);
        }
    }

    public static final void accept$1(AfS23S0400000_11 afS23S0400000_11, Object obj) {
        QTX qtx = ((R6R) obj).LJIIIZ;
        if (qtx != null) {
            C68985R5p.LIZIZ((Fragment) afS23S0400000_11.l0, (InterfaceC69056R8i) afS23S0400000_11.l1, (EnumC69116RAq) afS23S0400000_11.l2, (EnumC69113RAn) afS23S0400000_11.l3, qtx);
        }
    }

    public static final void accept$2(AfS23S0400000_11 afS23S0400000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C68972R5c.LJFF(true, c69084R9k.getErrorCode(), "sms_verification", (BaseAccountFlowFragment) afS23S0400000_11.l0, null);
        C68986R5q.LIZ.LJ(c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg(), false);
        int errorCode = c69084R9k.getErrorCode();
        if (SignUpOrLoginActivity.LJLLLLLL.contains(Integer.valueOf(errorCode))) {
            ((InterfaceC65784Pro) afS23S0400000_11.l1).invoke();
            return;
        }
        if (SignUpOrLoginActivity.LJLZ.contains(Integer.valueOf(errorCode))) {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) afS23S0400000_11.l2;
            String message = th.getMessage();
            if (message == null) {
                message = ((SignUpOrLoginActivity) afS23S0400000_11.l3).getString(R.string.g5w);
                o.LJIIIIZZ(message, "getString(R.string.error_unknown)");
            }
            interfaceC88471Ynr.invoke(message, 1);
            return;
        }
        InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) afS23S0400000_11.l2;
        String message2 = th.getMessage();
        if (message2 == null) {
            message2 = ((SignUpOrLoginActivity) afS23S0400000_11.l3).getString(R.string.g5w);
            o.LJIIIIZZ(message2, "getString(R.string.error_unknown)");
        }
        interfaceC88471Ynr2.invoke(message2, 0);
    }

    public AfS23S0400000_11(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
