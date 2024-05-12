package Y;

import X.ActivityC45651qj;
import X.C0H1;
import X.C141415gn;
import X.C85115Xap;
import X.InterfaceC88472Yns;
import X.R47;
import X.RBV;
import X.RC1;
import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.bind.BindEmailFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class IDeS359S0100000_15 implements R47 {
    public final int $t;
    public Object l0;

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                return;
            case 1:
                onResult$1(this, i, i2, obj);
                return;
            case 2:
                onResult$2(this, i, i2, obj);
                return;
            case 3:
                onResult$3(this, i, i2, obj);
                return;
            case 4:
                onResult$4(this, i, i2, obj);
                return;
            case 5:
                onResult$5(this, i, i2, obj);
                return;
            case 6:
                onResult$6(this, i, i2, obj);
                return;
            case 7:
                onResult$7(this, i, i2, obj);
                return;
            default:
                return;
        }
    }

    public IDeS359S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(IDeS359S0100000_15 iDeS359S0100000_15, int i, int i2, Object obj) {
        if (i2 == 1) {
            TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS359S0100000_15.l0, 0, null, 6);
        }
    }

    public static final void onResult$1(IDeS359S0100000_15 iDeS359S0100000_15, int i, int i2, Object obj) {
        CommonFlowActivity commonFlowActivity;
        if (i2 == 1) {
            Bundle LIZ = C0H1.LIZ("platform", "phone");
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.BindMobileFinishData");
            String optString = new JSONObject(((RC1) obj).LJLILLLLZI).optString("ticket", "");
            o.LJIIIIZZ(optString, "jsonObject.optString(\"ticket\", \"\")");
            RBV.LJIILL(LIZ, optString);
            ActivityC45651qj mo49getActivity = ((ConfirmEmailFragment) iDeS359S0100000_15.l0).mo49getActivity();
            if ((mo49getActivity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) mo49getActivity) != null) {
                commonFlowActivity.LLIIJLIL(i, LIZ);
            }
        }
    }

    public static final void onResult$2(IDeS359S0100000_15 iDeS359S0100000_15, int i, int i2, Object obj) {
        CommonFlowActivity commonFlowActivity;
        if (i2 == 1) {
            ActivityC45651qj mo49getActivity = ((BindEmailFragment) iDeS359S0100000_15.l0).mo49getActivity();
            if ((mo49getActivity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) mo49getActivity) != null) {
                commonFlowActivity.LLIIJLIL(i, null);
            }
        }
    }

    public static final void onResult$3(IDeS359S0100000_15 iDeS359S0100000_15, int i, int i2, Object obj) {
        CommonFlowActivity commonFlowActivity;
        if (i2 == 1) {
            Bundle LIZ = C0H1.LIZ("platform", "phone");
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.BindMobileFinishData");
            String optString = new JSONObject(((RC1) obj).LJLILLLLZI).optString("ticket", "");
            o.LJIIIIZZ(optString, "jsonObject.optString(\"ticket\", \"\")");
            RBV.LJIILL(LIZ, optString);
            ActivityC45651qj mo49getActivity = ((ChangeEmailFragment) iDeS359S0100000_15.l0).mo49getActivity();
            if ((mo49getActivity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) mo49getActivity) != null) {
                commonFlowActivity.LLIIJLIL(i, LIZ);
            }
        }
    }

    public static final void onResult$4(IDeS359S0100000_15 iDeS359S0100000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C85115Xap.LIZLLL = true;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS359S0100000_15.l0;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(str);
        }
    }

    public static final void onResult$5(IDeS359S0100000_15 iDeS359S0100000_15, int i, int i2, Object obj) {
        ((TrustedDevicesFragmentViewModel) iDeS359S0100000_15.l0).gv0(true);
    }

    public static final void onResult$6(IDeS359S0100000_15 iDeS359S0100000_15, int i, int i2, Object obj) {
        BaseBundle baseBundle;
        int i3;
        CommonFlowActivity commonFlowActivity;
        if (i2 == 1) {
            if (obj instanceof Bundle) {
                baseBundle = (BaseBundle) obj;
            } else {
                baseBundle = null;
            }
            if (baseBundle != null) {
                i3 = baseBundle.getInt("error_code");
            } else {
                i3 = 0;
            }
            Bundle arguments = ((TOTPCodeVerifyFragment) iDeS359S0100000_15.l0).getArguments();
            if (arguments != null) {
                TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) iDeS359S0100000_15.l0;
                if (i3 != 0) {
                    arguments.putBundle("final_data", C141415gn.LIZ("error_code", i3));
                }
                tOTPCodeVerifyFragment.Dl(arguments);
                if (tOTPCodeVerifyFragment.qm()) {
                    ActivityC45651qj mo49getActivity = tOTPCodeVerifyFragment.mo49getActivity();
                    if ((mo49getActivity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) mo49getActivity) != null) {
                        commonFlowActivity.LJLJJI = true;
                        commonFlowActivity.finish();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "sign_up") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onResult$7(Y.IDeS359S0100000_15 r6, int r7, int r8, java.lang.Object r9) {
        /*
            r1 = 10
            r0 = 4
            X.R41.LJIIJJI(r1, r0)
            java.lang.String r2 = ""
            r1 = 1
            if (r8 != r1) goto L1e
            X.RAq r0 = X.EnumC69116RAq.ONE_KEY_LOGIN
            int r0 = r0.getValue()
            if (r7 != r0) goto L1d
            X.R41.LJIIL(r1, r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = X.R41.LIZJ()
            X.R41.LJIIIIZZ(r0)
        L1d:
            return
        L1e:
            boolean r0 = r9 instanceof android.os.Bundle
            r5 = 0
            if (r0 == 0) goto L8f
            android.os.BaseBundle r9 = (android.os.BaseBundle) r9
            if (r9 == 0) goto L8f
            java.lang.String r0 = "dismiss_action"
            java.lang.String r3 = r9.getString(r0, r2)
        L2d:
            boolean r0 = X.C78685UuP.LJJJZ(r3)
            if (r0 == 0) goto L80
            X.8m0 r4 = X.EnumC221088m0.NONE
            kotlin.jvm.internal.AqS165S0100000_15 r2 = new kotlin.jvm.internal.AqS165S0100000_15
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity r1 = (com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity) r1
            r0 = 933(0x3a5, float:1.307E-42)
            r2.<init>(r1, r0)
            X.5H3 r2 = X.C221108m2.LIZ(r4, r2)
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity r0 = (com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity) r0
            X.XiH r0 = r0.LJLJL
            java.lang.String r1 = "signupManager"
            if (r0 == 0) goto L95
            boolean r0 = r0.LJJLIIJ()
            if (r0 == 0) goto L5c
            java.lang.String r0 = "login"
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 != 0) goto L72
        L5c:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity r0 = (com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity) r0
            X.XiH r0 = r0.LJLJL
            if (r0 == 0) goto L91
            boolean r0 = r0.LJJLIIJ()
            if (r0 != 0) goto L80
            java.lang.String r0 = "sign_up"
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L80
        L72:
            java.lang.Object r1 = r2.getValue()
            java.lang.String r0 = "onResult$lambda$0(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.view.View r1 = (android.view.View) r1
            r1.performClick()
        L80:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity r0 = (com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity) r0
            r0.LLIIJLIL()
            X.XiO r2 = X.RunnableC85584XiO.LJLIL
            r0 = 200(0xc8, double:9.9E-322)
            X.C1DH.LJJIJIIJIL(r0, r2)
            goto L1d
        L8f:
            r3 = r5
            goto L2d
        L91:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r5
        L95:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDeS359S0100000_15.onResult$7(Y.IDeS359S0100000_15, int, int, java.lang.Object):void");
    }
}
