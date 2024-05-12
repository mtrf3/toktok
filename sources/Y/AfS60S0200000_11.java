package Y;

import X.C16880lQ;
import X.C68972R5c;
import X.C68985R5p;
import X.C68986R5q;
import X.C69084R9k;
import X.C69093R9t;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC64592gB;
import X.InterfaceC68900R2i;
import X.InterfaceC68907R2p;
import X.InterfaceC68914R2w;
import X.InterfaceC69056R8i;
import X.InterfaceC85767XlL;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.QDQ;
import X.QTX;
import X.R6R;
import X.UC0;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.LoginSuccessEvent;
import com.ss.android.ugc.aweme.services.interceptor.ConditionalBindLoginParam;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AfS60S0200000_11 implements InterfaceC64592gB {
    public final int $t;
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
            case 5:
                accept$5(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS60S0200000_11 afS60S0200000_11, Object obj) {
        R6R r6r = (R6R) obj;
        ((InterfaceC85767XlL) afS60S0200000_11.l0).LJJJJZI(null);
        Activity activity = (Activity) afS60S0200000_11.l1;
        o.LJIIIZ(activity, "activity");
        LoginSuccessEvent loginSuccessEvent = new LoginSuccessEvent();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_from");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        loginSuccessEvent.LIZLLL(LLJJIJIIJIL, "enter_from");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_method");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        loginSuccessEvent.LIZLLL(LLJJIJIIJIL2, "enter_method");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_type");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        loginSuccessEvent.LIZLLL(LLJJIJIIJIL3, "enter_type");
        loginSuccessEvent.LIZLLL("passkey", "platform");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "login_panel_type");
        if (LLJJIJIIJIL4 != null) {
            str = LLJJIJIIJIL4;
        }
        loginSuccessEvent.LIZLLL(str, "login_panel_type");
        loginSuccessEvent.LJFF();
        Activity activity2 = (Activity) afS60S0200000_11.l1;
        QTX qtx = r6r.LJIIIZ;
        o.LJIIIIZZ(qtx, "it.userInfo");
        C68985R5p.LIZ(activity2, qtx, null, false);
    }

    public static final void accept$1(AfS60S0200000_11 afS60S0200000_11, Object obj) {
        R6R r6r = (R6R) obj;
        C68972R5c.LJIIIZ(true, "phone", ((InterfaceC69056R8i) afS60S0200000_11.l0).q9(), r6r.LJIIIZ, null);
        Fragment fragment = (Fragment) afS60S0200000_11.l1;
        InterfaceC69056R8i interfaceC69056R8i = (InterfaceC69056R8i) afS60S0200000_11.l0;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        QTX qtx = r6r.LJIIIZ;
        o.LJIIIIZZ(qtx, "it.userInfo");
        C68985R5p.LIZIZ(fragment, interfaceC69056R8i, enumC69116RAq, LJLLLL, qtx);
    }

    public static final void accept$2(AfS60S0200000_11 afS60S0200000_11, Object obj) {
        boolean z;
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        if (((EnumC69116RAq) afS60S0200000_11.l0) == EnumC69116RAq.SIGN_UP) {
            z = true;
        } else {
            z = false;
        }
        C68972R5c.LJFF(z, c69084R9k.getErrorCode(), "sms_verification", ((InterfaceC69056R8i) afS60S0200000_11.l1).q9(), null);
        C68986R5q.LIZ.LJ(c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg(), false);
    }

    public static final void accept$3(AfS60S0200000_11 afS60S0200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C68972R5c.LJFF(((ConditionalBindLoginParam) afS60S0200000_11.l0).isRegister(), ((C69084R9k) th).getErrorCode(), "phone", ((InterfaceC69056R8i) afS60S0200000_11.l1).q9(), null);
    }

    public static final void accept$4(AfS60S0200000_11 afS60S0200000_11, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns;
        if ((obj instanceof C69084R9k) && (interfaceC88472Yns = (InterfaceC88472Yns) afS60S0200000_11.l0) != null) {
            interfaceC88472Yns.invoke(obj);
        }
        C68972R5c.LJIILIIL(false, C69093R9t.LIZIZ, ((InterfaceC69056R8i) afS60S0200000_11.l1).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS60S0200000_11.l1).q9().LJJLIIIJLLLLLLLZ());
    }

    public static final void accept$5(AfS60S0200000_11 afS60S0200000_11, Object obj) {
        Object LJI = ((InterfaceC68907R2p) afS60S0200000_11.l0).LJI(afS60S0200000_11.l1, obj);
        if (LJI != null) {
            InterfaceC68914R2w LJI2 = UC0.LJI((InterfaceC68907R2p) afS60S0200000_11.l0);
            if (!(LJI2 instanceof InterfaceC68900R2i)) {
                LJI2 = null;
            }
            InterfaceC68900R2i interfaceC68900R2i = (InterfaceC68900R2i) LJI2;
            if (interfaceC68900R2i != null) {
                interfaceC68900R2i.LIZLLL(QDQ.LIZ(new OSZ(((InterfaceC68907R2p) afS60S0200000_11.l0).LJFF(afS60S0200000_11.l1), LJI)));
            }
        }
    }

    public AfS60S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
