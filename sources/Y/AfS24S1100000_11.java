package Y;

import X.AbstractViewOnClickListenerC67619QgJ;
import X.C1JD;
import X.C35936E8m;
import X.C58725N2z;
import X.C5S1;
import X.C68972R5c;
import X.C68985R5p;
import X.C68986R5q;
import X.C69068R8u;
import X.C69078R9e;
import X.C69084R9k;
import X.C85729Xkj;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.FMX;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.QTZ;
import X.R7X;
import X.RBV;
import X.RC0;
import X.X1D;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CombinedEmailSignupLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS64S1100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AfS24S1100000_11 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
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
            default:
                return;
        }
    }

    public AfS24S1100000_11(BaseAccountFlowFragment baseAccountFlowFragment, int i) {
        this.$t = i;
        this.s0 = "instant_login_si";
        this.l1 = baseAccountFlowFragment;
    }

    public static final void accept$0(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        String str;
        boolean z;
        R7X r7x = (R7X) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(afS24S1100000_11.s0);
        LIZ.append(" is ");
        if (r7x.LJII == 1) {
            str = "not available";
        } else {
            str = "available";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (r7x.LJII == 1) {
            z = true;
        } else {
            z = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment = (CombinedEmailSignupLoginFragment) afS24S1100000_11.l1;
        long j = currentTimeMillis - combinedEmailSignupLoginFragment.LL;
        String enterFrom = combinedEmailSignupLoginFragment.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((CombinedEmailSignupLoginFragment) afS24S1100000_11.l1).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC0.LJFF(j, enterFrom, z, enterMethod, "email");
        RBV.LJIIJJI((CombinedEmailSignupLoginFragment) afS24S1100000_11.l1, afS24S1100000_11.s0);
        if (r7x.LJII == 1) {
            ((CombinedEmailSignupLoginFragment) afS24S1100000_11.l1).Xl();
        } else {
            CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment2 = (CombinedEmailSignupLoginFragment) afS24S1100000_11.l1;
            Bundle arguments = combinedEmailSignupLoginFragment2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC69113RAn.CREATE_PASSWORD_FOR_EMAIL.getValue());
            combinedEmailSignupLoginFragment2.rh(arguments);
        }
        String enterMethod2 = ((CombinedEmailSignupLoginFragment) afS24S1100000_11.l1).getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        RC0.LJ(0, enterMethod2, "email");
    }

    public static final void accept$1(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        String str;
        C69078R9e c69078R9e = (C69078R9e) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(afS24S1100000_11.s0);
        LIZ.append(" is ");
        if (c69078R9e.LJI) {
            str = "not available";
        } else {
            str = "available";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        boolean z = c69078R9e.LJI;
        long currentTimeMillis = System.currentTimeMillis();
        CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment = (CombinedEmailSignupLoginFragment) afS24S1100000_11.l1;
        long j = currentTimeMillis - combinedEmailSignupLoginFragment.LL;
        String enterFrom = combinedEmailSignupLoginFragment.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((CombinedEmailSignupLoginFragment) afS24S1100000_11.l1).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC0.LJFF(j, enterFrom, z, enterMethod, "username");
        RBV.LJIIJJI((CombinedEmailSignupLoginFragment) afS24S1100000_11.l1, afS24S1100000_11.s0);
        if (c69078R9e.LJI) {
            ((CombinedEmailSignupLoginFragment) afS24S1100000_11.l1).Xl();
        } else {
            CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment2 = (CombinedEmailSignupLoginFragment) afS24S1100000_11.l1;
            String string = combinedEmailSignupLoginFragment2.getString(R.string.di2);
            o.LJIIIIZZ(string, "getString(R.string.combi…signUppanel_errorMessage)");
            combinedEmailSignupLoginFragment2.Sg(0, string);
        }
        String enterMethod2 = ((CombinedEmailSignupLoginFragment) afS24S1100000_11.l1).getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        RC0.LJ(0, enterMethod2, "username");
    }

    public static final void accept$10(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        ((BaseUpdatePasswordFragment) afS24S1100000_11.l1).Ql(afS24S1100000_11.s0);
    }

    public static final void accept$11(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        AbstractViewOnClickListenerC67619QgJ abstractViewOnClickListenerC67619QgJ = (AbstractViewOnClickListenerC67619QgJ) afS24S1100000_11.l1;
        abstractViewOnClickListenerC67619QgJ.LJIIJ(new AqS64S1100000_11(abstractViewOnClickListenerC67619QgJ, afS24S1100000_11.s0, 5));
    }

    public static final void accept$2(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        String str;
        boolean z;
        R7X r7x = (R7X) obj;
        RBV.LJIIJJI((EmailSignUpFragment) afS24S1100000_11.l1, afS24S1100000_11.s0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(afS24S1100000_11.s0);
        LIZ.append(" is ");
        boolean z2 = true;
        if (r7x.LJII == 1) {
            str = "not available";
        } else {
            str = "available";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (r7x.LJII != 1) {
            z2 = false;
        }
        if (z2) {
            EmailSignUpFragment emailSignUpFragment = (EmailSignUpFragment) afS24S1100000_11.l1;
            Bundle arguments = emailSignUpFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC69113RAn.EMAIL_PASSWORD_LOGIN.getValue());
            emailSignUpFragment.rh(arguments);
        } else {
            EmailSignUpFragment emailSignUpFragment2 = (EmailSignUpFragment) afS24S1100000_11.l1;
            Bundle arguments2 = emailSignUpFragment2.getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            arguments2.putInt("next_page", EnumC69113RAn.CREATE_PASSWORD_FOR_EMAIL.getValue());
            emailSignUpFragment2.rh(arguments2);
            EmailSignUpFragment emailSignUpFragment3 = (EmailSignUpFragment) afS24S1100000_11.l1;
            if (emailSignUpFragment3.LLD) {
                z = ((CompoundButton) emailSignUpFragment3._$_findCachedViewById(R.id.cti)).isChecked();
            } else {
                z = false;
            }
            C85729Xkj.LIZ = z;
        }
        String enterMethod = ((EmailSignUpFragment) afS24S1100000_11.l1).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC0.LJ(0, enterMethod, "email");
    }

    public static final void accept$3(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C1JD.LJJIIZ(c69084R9k.getErrorCode(), ((InterfaceC69056R8i) afS24S1100000_11.l1).q9().LJJLIIIJJI(), "email", c69084R9k.getErrorMsg(), null, null, ((InterfaceC69056R8i) afS24S1100000_11.l1).q9().LJJLIIIJLLLLLLLZ(), afS24S1100000_11.s0);
    }

    public static final void accept$4(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C68972R5c.LJFF(false, ((C69084R9k) th).getErrorCode(), afS24S1100000_11.s0, ((InterfaceC69056R8i) afS24S1100000_11.l1).q9(), null);
    }

    public static final void accept$5(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        if (o.LJ(afS24S1100000_11.s0, "phone")) {
            C68986R5q.LIZ.LIZLLL(c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg(), false);
        } else {
            C68986R5q.LIZ.LIZJ(1, c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg());
        }
        C68972R5c.LJFF(false, c69084R9k.getErrorCode(), afS24S1100000_11.s0, ((InterfaceC69056R8i) afS24S1100000_11.l1).q9(), null);
    }

    public static final void accept$6(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        C68972R5c.LJIIL(0, afS24S1100000_11.s0, ((InterfaceC69056R8i) afS24S1100000_11.l1).q9().LJJLIIIJLLLLLLLZ(), null, null);
    }

    public static final void accept$7(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        C1JD.LJJIIZ(0, ((InterfaceC69056R8i) afS24S1100000_11.l1).q9().LJJLIIIJJI(), "email", null, null, null, ((InterfaceC69056R8i) afS24S1100000_11.l1).q9().LJJLIIIJLLLLLLLZ(), afS24S1100000_11.s0);
    }

    public static final void accept$8(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        CreatePasswordFragment createPasswordFragment = (CreatePasswordFragment) afS24S1100000_11.l1;
        String password = afS24S1100000_11.s0;
        createPasswordFragment.getClass();
        o.LJIIIZ(password, "password");
        if (createPasswordFragment.xl() == EnumC69116RAq.SIGN_UP) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZIZ(System.currentTimeMillis() - createPasswordFragment.LLIIJI, "stay_time");
            FMX.LJIIL("input_email_pwd_page", c35936E8m.LIZ);
        }
    }

    public static final void accept$9(AfS24S1100000_11 afS24S1100000_11, Object obj) {
        EnumC69113RAn enumC69113RAn;
        C69068R8u c69068R8u = (C69068R8u) obj;
        C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
        c5s1.LIZLLL(((BaseUpdatePasswordFragment) afS24S1100000_11.l1).requireActivity().getString(R.string.cm5));
        c5s1.LJ();
        BaseUpdatePasswordFragment baseUpdatePasswordFragment = (BaseUpdatePasswordFragment) afS24S1100000_11.l1;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        if (o.LJ(afS24S1100000_11.s0, "phone")) {
            enumC69113RAn = EnumC69113RAn.RESET_PASSWORD_FOR_PHONE;
        } else {
            enumC69113RAn = EnumC69113RAn.RESET_PASSWORD_FOR_EMAIL;
        }
        QTZ qtz = c69068R8u.LJIILL;
        o.LJI(qtz);
        C68985R5p.LIZIZ(baseUpdatePasswordFragment, baseUpdatePasswordFragment, enumC69116RAq, enumC69113RAn, qtz);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS24S1100000_11(X.InterfaceC69056R8i r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 3: goto Le;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS24S1100000_11.<init>(X.R8i, java.lang.String, int):void");
    }

    public AfS24S1100000_11(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
