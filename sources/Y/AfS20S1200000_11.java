package Y;

import X.ActivityC45651qj;
import X.C68922R3e;
import X.C68972R5c;
import X.C68985R5p;
import X.C68986R5q;
import X.C69084R9k;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.InterfaceC88472Yns;
import X.QTX;
import X.R40;
import X.R41;
import X.R9Y;
import androidx.fragment.app.Fragment;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AfS20S1200000_11 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C69084R9k) {
            C69084R9k c69084R9k = (C69084R9k) th;
            C68972R5c.LJFF(false, c69084R9k.getErrorCode(), "sms_verification", ((InterfaceC69056R8i) afS20S1200000_11.l1).q9(), null);
            ((SetPasswordMobHelper) afS20S1200000_11.l2).LIZ(false, "phone", ((InterfaceC69056R8i) afS20S1200000_11.l1).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS20S1200000_11.l1).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS20S1200000_11.l1).q9().LLZZ(), c69084R9k.getErrorCode(), ((InterfaceC69056R8i) afS20S1200000_11.l1).q9(), afS20S1200000_11.s0);
            if (((InterfaceC69056R8i) afS20S1200000_11.l1).LJLLLL() == EnumC69113RAn.RESET_PASSWORD_FOR_PHONE) {
                R41.LJIIL(8, 3, c69084R9k.getErrorMsg());
            }
        }
    }

    public static final void accept$1(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        C68922R3e c68922R3e = (C68922R3e) obj;
        C68972R5c.LJIIIZ(false, afS20S1200000_11.s0, ((InterfaceC69056R8i) afS20S1200000_11.l1).q9(), c68922R3e.LJIIIZ, null);
        if (((Fragment) afS20S1200000_11.l2).mo49getActivity() instanceof I18nSignUpActivity) {
            ActivityC45651qj mo49getActivity = ((Fragment) afS20S1200000_11.l2).mo49getActivity();
            o.LJI(mo49getActivity);
            JSONObject jSONObject = c68922R3e.LJIILJJIL;
            QTX qtx = c68922R3e.LJIIIZ;
            o.LJIIIIZZ(qtx, "it.userInfo");
            C68985R5p.LIZ(mo49getActivity, qtx, jSONObject, false);
            return;
        }
        Fragment fragment = (Fragment) afS20S1200000_11.l2;
        InterfaceC69056R8i interfaceC69056R8i = (InterfaceC69056R8i) afS20S1200000_11.l1;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        QTX qtx2 = c68922R3e.LJIIIZ;
        o.LJIIIIZZ(qtx2, "it.userInfo");
        C68985R5p.LIZIZ(fragment, interfaceC69056R8i, enumC69116RAq, LJLLLL, qtx2);
    }

    public static final void accept$10(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        SetPasswordMobHelper.LIZIZ((SetPasswordMobHelper) afS20S1200000_11.l1, "phone", ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LLZZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), afS20S1200000_11.s0);
    }

    public static final void accept$11(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        ((SetPasswordMobHelper) afS20S1200000_11.l1).LIZ(false, "phone", ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LLZZ(), ((C69084R9k) th).getErrorCode(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), afS20S1200000_11.s0);
    }

    public static final void accept$12(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        ((SetPasswordMobHelper) afS20S1200000_11.l1).LIZ(false, "email", ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LLZZ(), c69084R9k.getErrorCode(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), afS20S1200000_11.s0);
        C68972R5c.LJFF(false, c69084R9k.getErrorCode(), "email", ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), null);
    }

    public static final void accept$2(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        if (o.LJ(afS20S1200000_11.s0, "phone")) {
            C68986R5q.LIZ.LIZLLL(c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg(), false);
        } else {
            C68986R5q.LIZ.LIZJ(1, c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg());
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS20S1200000_11.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c69084R9k);
        }
        C68972R5c.LJFF(false, c69084R9k.getErrorCode(), afS20S1200000_11.s0, ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), null);
    }

    public static final void accept$3(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        R40 r40 = (R40) obj;
        Fragment fragment = (Fragment) afS20S1200000_11.l1;
        InterfaceC69056R8i interfaceC69056R8i = (InterfaceC69056R8i) afS20S1200000_11.l2;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        QTX qtx = ((R9Y) r40.LJIIIZ).LJI;
        o.LJIIIIZZ(qtx, "it.mobileObj.mUserInfo");
        C68985R5p.LIZIZ(fragment, interfaceC69056R8i, enumC69116RAq, LJLLLL, qtx);
        C68972R5c.LJIIIZ(false, afS20S1200000_11.s0, ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), ((R9Y) r40.LJIIIZ).LJI, null);
    }

    public static final void accept$4(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        SetPasswordMobHelper.LIZIZ((SetPasswordMobHelper) afS20S1200000_11.l1, "email", ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LLZZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), afS20S1200000_11.s0);
    }

    public static final void accept$5(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        SetPasswordMobHelper.LIZIZ((SetPasswordMobHelper) afS20S1200000_11.l1, "phone", ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LLZZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), afS20S1200000_11.s0);
    }

    public static final void accept$6(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        ((SetPasswordMobHelper) afS20S1200000_11.l1).LIZ(false, "email", ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LLZZ(), ((C69084R9k) th).getErrorCode(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), afS20S1200000_11.s0);
    }

    public static final void accept$7(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C68972R5c.LJIIL(c69084R9k.getErrorCode(), afS20S1200000_11.s0, ((InterfaceC69056R8i) afS20S1200000_11.l1).q9().LJJLIIIJLLLLLLLZ(), null, null);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS20S1200000_11.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c69084R9k);
        }
    }

    public static final void accept$8(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        SetPasswordMobHelper setPasswordMobHelper = (SetPasswordMobHelper) afS20S1200000_11.l1;
        String LJJLIIIJJI = ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJJI();
        String LJJLIIIJLLLLLLLZ = ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJLLLLLLLZ();
        String LLZZ = ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LLZZ();
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        setPasswordMobHelper.LIZ(false, "phone", LJJLIIIJJI, LJJLIIIJLLLLLLLZ, LLZZ, ((C69084R9k) th).getErrorCode(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), afS20S1200000_11.s0);
    }

    public static final void accept$9(AfS20S1200000_11 afS20S1200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        ((SetPasswordMobHelper) afS20S1200000_11.l1).LIZ(false, "email", ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9().LLZZ(), c69084R9k.getErrorCode(), ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), afS20S1200000_11.s0);
        C68972R5c.LJFF(true, c69084R9k.getErrorCode(), "email", ((InterfaceC69056R8i) afS20S1200000_11.l2).q9(), null);
        C68986R5q.LIZ.LIZJ(1, c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg());
    }

    public AfS20S1200000_11(BaseAccountFlowFragment baseAccountFlowFragment, BaseAccountFlowFragment baseAccountFlowFragment2, int i) {
        this.$t = i;
        this.s0 = "instant_login_si";
        this.l1 = baseAccountFlowFragment2;
        this.l2 = baseAccountFlowFragment;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS20S1200000_11(X.InterfaceC69056R8i r2, java.lang.String r3, X.InterfaceC88472Yns r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r4
            r0.l2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS20S1200000_11.<init>(X.R8i, java.lang.String, X.Yns, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS20S1200000_11(com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper r2, com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r2
            r0.l2 = r3
            r0.s0 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r2
            r0.s0 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS20S1200000_11.<init>(com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper, com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, java.lang.String, int):void");
    }

    public AfS20S1200000_11(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
