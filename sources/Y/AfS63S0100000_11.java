package Y;

import X.AbstractViewOnClickListenerC67619QgJ;
import X.ActivityC45651qj;
import X.C1JD;
import X.C30941Ji;
import X.C35936E8m;
import X.C38776FJs;
import X.C58725N2z;
import X.C5S1;
import X.C61447O9r;
import X.C67623QgN;
import X.C67624QgO;
import X.C67625QgP;
import X.C68908R2q;
import X.C68972R5c;
import X.C68985R5p;
import X.C68986R5q;
import X.C68987R5r;
import X.C69014R6s;
import X.C69022R7a;
import X.C69025R7d;
import X.C69030R7i;
import X.C69032R7k;
import X.C69061R8n;
import X.C69072R8y;
import X.C69073R8z;
import X.C69074R9a;
import X.C69084R9k;
import X.C69093R9t;
import X.C69100RAa;
import X.C69119RAt;
import X.C69142RBq;
import X.C73919Szj;
import X.C78688UuS;
import X.C85144XbI;
import X.C85631Xj9;
import X.C85690Xk6;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.FMX;
import X.InterfaceC46627IRr;
import X.InterfaceC64592gB;
import X.InterfaceC68901R2j;
import X.InterfaceC68905R2n;
import X.InterfaceC69056R8i;
import X.PR3;
import X.QDR;
import X.QTX;
import X.R2U;
import X.R40;
import X.R41;
import X.R7U;
import X.R7W;
import X.RBV;
import X.RC0;
import X.RCG;
import X.X1D;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.bind.BindEmailCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailVerifyFragment;
import com.ss.android.ugc.aweme.account.changemail.VerifyEmailBeforeChangeFragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyEmailForTicketFragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyPhoneForTicketFragment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ForceVerifyPhoneInputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.setpwd.EmailCodeChangePwdFragment;
import com.ss.android.ugc.aweme.account.setpwd.PhoneChangePwdVerifyFragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyPhoneFragment;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.AqS34S1000000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AfS63S0100000_11 implements InterfaceC64592gB {
    public final int $t;
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
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            case 29:
                accept$29(this, obj);
                return;
            case 30:
                accept$30(this, obj);
                return;
            case 31:
                accept$31(this, obj);
                return;
            case 32:
                accept$32(this, obj);
                return;
            case 33:
                accept$33(this, obj);
                return;
            case 34:
                accept$34(this, obj);
                return;
            case 35:
                accept$35(this, obj);
                return;
            case 36:
                accept$36(this, obj);
                return;
            case 37:
                accept$37(this, obj);
                return;
            case 38:
                accept$38(this, obj);
                return;
            case 39:
                accept$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                accept$40(this, obj);
                return;
            case 41:
                accept$41(this, obj);
                return;
            case 42:
                accept$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                accept$43(this, obj);
                return;
            case 44:
                accept$44(this, obj);
                return;
            case 45:
                accept$45(this, obj);
                return;
            case 46:
                accept$46(this, obj);
                return;
            case 47:
                accept$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                accept$48(this, obj);
                return;
            case C61447O9r.LJIIJ:
                accept$49(this, obj);
                return;
            case 50:
                accept$50(this, obj);
                return;
            case 51:
                accept$51(this, obj);
                return;
            case 52:
                accept$52(this, obj);
                return;
            case 53:
                accept$53(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS63S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        RBV.LJIIIZ(((C69100RAa) afS63S0100000_11.l0).LIZ, true);
        C69100RAa c69100RAa = (C69100RAa) afS63S0100000_11.l0;
        InterfaceC69056R8i interfaceC69056R8i = c69100RAa.LIZIZ;
        Bundle arguments = c69100RAa.LIZ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC69113RAn.EMAIL_SMS_VERIFY.getValue());
        interfaceC69056R8i.rh(arguments);
    }

    public static final void accept$1(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        ((R2U) ((AqS158S0200000_11) afS63S0100000_11.l0).l1).LIZIZ(new C30941Ji(1));
    }

    public static final void accept$10(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        VerifyPhoneForTicketFragment verifyPhoneForTicketFragment = (VerifyPhoneForTicketFragment) afS63S0100000_11.l0;
        RC0.LJI(verifyPhoneForTicketFragment.LLIIIILZ, verifyPhoneForTicketFragment.LLIIII);
        Bundle bundle = new Bundle();
        bundle.putString("platform", "phone");
        String str = ((C69014R6s) obj).LJIIIZ;
        o.LJIIIIZZ(str, "it.ticket");
        RBV.LJIILL(bundle, str);
        Bundle arguments = ((VerifyPhoneForTicketFragment) afS63S0100000_11.l0).getArguments();
        o.LJI(arguments);
        arguments.putBundle("final_data", bundle);
        VerifyPhoneForTicketFragment verifyPhoneForTicketFragment2 = (VerifyPhoneForTicketFragment) afS63S0100000_11.l0;
        Bundle arguments2 = verifyPhoneForTicketFragment2.getArguments();
        o.LJI(arguments2);
        verifyPhoneForTicketFragment2.Dl(arguments2);
    }

    public static final void accept$11(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        RC0.LJ(Integer.valueOf(c69084R9k.getErrorCode()), ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ(), "email");
        C68987R5r c68987R5r = C68986R5q.LIZ;
        int errorCode = c69084R9k.getErrorCode();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckEmail:");
        LIZ.append(c69084R9k.getErrorMsg());
        c68987R5r.LIZJ(1, errorCode, X1D.LIZIZ(LIZ));
    }

    public static final void accept$12(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C68972R5c.LJIILIIL(true, C69093R9t.LIZIZ, ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ());
    }

    public static final void accept$13(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C68972R5c.LJFF(true, ((C69084R9k) th).getErrorCode(), "phone", ((InterfaceC69056R8i) afS63S0100000_11.l0).q9(), null);
    }

    public static final void accept$14(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C68972R5c.LJIILIIL(false, C69093R9t.LIZIZ, ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ());
    }

    public static final void accept$15(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        RC0.LJ(Integer.valueOf(c69084R9k.getErrorCode()), ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ(), "email");
        C68987R5r c68987R5r = C68986R5q.LIZ;
        int errorCode = c69084R9k.getErrorCode();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckUsername:");
        LIZ.append(c69084R9k.getErrorMsg());
        c68987R5r.LIZJ(1, errorCode, X1D.LIZIZ(LIZ));
    }

    public static final void accept$16(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C68972R5c.LJFF(true, c69084R9k.getErrorCode(), "sms_verification", ((InterfaceC69056R8i) afS63S0100000_11.l0).q9(), null);
        C68986R5q.LIZ.LJ(c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg(), false);
    }

    public static final void accept$17(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C68972R5c.LJFF(false, c69084R9k.getErrorCode(), "sms_verification", ((InterfaceC69056R8i) afS63S0100000_11.l0).q9(), null);
        C68986R5q.LIZ.LJ(c69084R9k.getErrorCode(), c69084R9k.getDetailErrorMsg(), false);
    }

    public static final void accept$18(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C68986R5q.LIZ.LIZJ(0, 0, "");
        C68972R5c.LJIIL(0, "register", ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ(), null, null);
        C68972R5c.LJIIIZ(true, "email", ((InterfaceC69056R8i) afS63S0100000_11.l0).q9(), ((R7U) obj).LJIIIZ, null);
    }

    public static final void accept$19(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C68986R5q.LIZ.LIZJ(1, c69084R9k.getErrorCode(), c69084R9k.getErrorMsg());
        C68972R5c.LJIIL(c69084R9k.getErrorCode(), "register", ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ(), null, null);
        C68972R5c.LJFF(true, c69084R9k.getErrorCode(), "email", ((InterfaceC69056R8i) afS63S0100000_11.l0).q9(), null);
    }

    public static final void accept$2(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        R2U r2u = (R2U) ((AqS158S0200000_11) afS63S0100000_11.l0).l1;
        ((Throwable) obj).toString();
        r2u.onError();
    }

    public static final void accept$20(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C68972R5c.LJIILIIL(true, C69093R9t.LIZIZ, ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ());
    }

    public static final void accept$21(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C1JD.LJJIIZ(0, ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJJI(), "email", null, null, null, ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ(), null);
        C1JD.LJJ(0, ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ(), "email", null);
    }

    public static final void accept$22(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C1JD.LJJIIZ(c69084R9k.getErrorCode(), ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJJI(), "email", c69084R9k.getErrorMsg(), null, null, ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ(), null);
        C1JD.LJJ(c69084R9k.getErrorCode(), ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS63S0100000_11.l0).q9().LJJLIIIJLLLLLLLZ(), "email", null);
    }

    public static final void accept$23(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        ForceVerifyPhoneInputCodeFragment forceVerifyPhoneInputCodeFragment = (ForceVerifyPhoneInputCodeFragment) afS63S0100000_11.l0;
        RC0.LJI(forceVerifyPhoneInputCodeFragment.LLIIIILZ, forceVerifyPhoneInputCodeFragment.LLIIII);
    }

    public static final void accept$24(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        ((ForceVerifyPhoneInputCodeFragment) afS63S0100000_11.l0).Zl();
    }

    public static final void accept$25(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C69014R6s c69014R6s = (C69014R6s) obj;
        RC0.LJI(((InputCodeFragment) afS63S0100000_11.l0).cm(), ((InputCodeFragment) afS63S0100000_11.l0).LLILLIZIL);
        InputCodeFragment.Yl((InputCodeFragment) afS63S0100000_11.l0);
        ((InputCodeFragment) afS63S0100000_11.l0).Rl(0, true);
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS63S0100000_11.l0;
        Bundle arguments = inputCodeFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS63S0100000_11.l0;
        if (inputCodeFragment2.LLIILZL.LIZ()) {
            RBV.LJIIJJI(inputCodeFragment2, "");
            RBV.LJIILJJIL(inputCodeFragment2, "");
            int i = C69142RBq.LIZ[inputCodeFragment2.xl().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    arguments.putInt("next_page", EnumC69113RAn.INPUT_EMAIL_CHANGE.getValue());
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unknown scene [");
                    LIZ.append(inputCodeFragment2.xl());
                    LIZ.append("] while validating code");
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            } else {
                arguments.putInt("next_page", EnumC69113RAn.INPUT_PHONE_MODIFY.getValue());
            }
        } else {
            arguments.putInt("next_page", EnumC69113RAn.INPUT_PHONE_MODIFY.getValue());
            arguments.putString("ticket", c69014R6s.LJIIIZ);
        }
        inputCodeFragment.rh(arguments);
    }

    public static final void accept$26(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        R40 r40 = (R40) obj;
        RC0.LJI(((InputCodeFragment) afS63S0100000_11.l0).cm(), ((InputCodeFragment) afS63S0100000_11.l0).LLILLIZIL);
        InputCodeFragment.Yl((InputCodeFragment) afS63S0100000_11.l0);
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS63S0100000_11.l0;
        String enterFrom = inputCodeFragment.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((InputCodeFragment) afS63S0100000_11.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C85631Xj9.LJIIJ(inputCodeFragment, true, enterFrom, enterMethod, String.valueOf(r40.LJIIIZ.LIZIZ), 1, false);
        C68985R5p.LIZJ(RBV.LJ((InputCodeFragment) afS63S0100000_11.l0), (InputCodeFragment) afS63S0100000_11.l0, (R7W) r40.LJIIIZ);
    }

    public static final void accept$27(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        boolean z;
        C69074R9a c69074R9a = (C69074R9a) obj;
        if (c69074R9a.LJFF != null) {
            z = true;
        } else {
            z = false;
        }
        String enterFrom = ((InputCodeFragment) afS63S0100000_11.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((InputCodeFragment) afS63S0100000_11.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC0.LIZJ(null, "login_signup_phone_result", enterFrom, enterMethod, "phone", z);
        if (z) {
            RC0.LJI(((InputCodeFragment) afS63S0100000_11.l0).cm(), ((InputCodeFragment) afS63S0100000_11.l0).LLILLIZIL);
            InputCodeFragment inputCodeFragment = (InputCodeFragment) afS63S0100000_11.l0;
            EnumC69116RAq xl = inputCodeFragment.xl();
            EnumC69113RAn Al = ((InputCodeFragment) afS63S0100000_11.l0).Al();
            QTX qtx = c69074R9a.LJFF;
            o.LJIIIIZZ(qtx, "it.mUserInfo");
            C68985R5p.LIZIZ(inputCodeFragment, inputCodeFragment, xl, Al, qtx);
        }
    }

    public static final void accept$28(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C69022R7a c69022R7a = (C69022R7a) obj;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS63S0100000_11.l0;
        boolean z = true;
        if (inputCodeFragment.LLIFFJFJJ) {
            ((C85690Xk6) inputCodeFragment.LLILLJJLI.getValue()).LIZ(true);
        }
        PhoneNumberUtil.PhoneNumber LJ = RBV.LJ((InputCodeFragment) afS63S0100000_11.l0);
        if (LJ != null) {
            C38776FJs.LJIIL().LJIIJJI(((InputCodeFragment) afS63S0100000_11.l0).getContext(), "country", LJ.getCountryIso());
        }
        if (c69022R7a.LJFF == null) {
            z = false;
        }
        String enterFrom = ((InputCodeFragment) afS63S0100000_11.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((InputCodeFragment) afS63S0100000_11.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        RC0.LIZJ(null, "login_signup_phone_result", enterFrom, enterMethod, "phone", z);
        if (z) {
            RC0.LJI(((InputCodeFragment) afS63S0100000_11.l0).cm(), ((InputCodeFragment) afS63S0100000_11.l0).LLILLIZIL);
            EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
            InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS63S0100000_11.l0;
            EnumC69113RAn Al = inputCodeFragment2.Al();
            QTX qtx = c69022R7a.LJFF;
            o.LJIIIIZZ(qtx, "it.mUserInfo");
            C68985R5p.LIZIZ(inputCodeFragment2, inputCodeFragment2, enumC69116RAq, Al, qtx);
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZIZ(System.currentTimeMillis() - ((InputCodeFragment) afS63S0100000_11.l0).LLI, "stay_time");
        FMX.LJIIL("input_code_page", c35936E8m.LIZ);
    }

    public static final void accept$29(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        R7U r7u = (R7U) obj;
        if (r7u.LJIIIZ != null) {
            RC0.LJI(((InputCodeFragment) afS63S0100000_11.l0).cm(), ((InputCodeFragment) afS63S0100000_11.l0).LLILLIZIL);
            InputCodeFragment inputCodeFragment = (InputCodeFragment) afS63S0100000_11.l0;
            EnumC69116RAq xl = inputCodeFragment.xl();
            EnumC69113RAn Al = ((InputCodeFragment) afS63S0100000_11.l0).Al();
            QTX qtx = r7u.LJIIIZ;
            o.LJIIIIZZ(qtx, "it.mUserInfo");
            C68985R5p.LIZIZ(inputCodeFragment, inputCodeFragment, xl, Al, qtx);
        }
    }

    public static final void accept$3(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        ((BindEmailCodeVerifyFragment) afS63S0100000_11.l0).Zl();
    }

    public static final void accept$30(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C69025R7d c69025R7d = (C69025R7d) obj;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS63S0100000_11.l0;
        String platForm = (String) inputCodeFragment.LLIL.getValue();
        o.LJIIIIZZ(platForm, "platForm");
        inputCodeFragment.fm(c69025R7d.LIZLLL, platForm, true);
        RC0.LJI(((InputCodeFragment) afS63S0100000_11.l0).cm(), ((InputCodeFragment) afS63S0100000_11.l0).LLILLIZIL);
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS63S0100000_11.l0;
        Bundle arguments = inputCodeFragment2.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC69113RAn.RESET_PASSWORD_FOR_PHONE.getValue());
        arguments.putString("ticket", c69025R7d.LJIIIZ);
        inputCodeFragment2.rh(arguments);
    }

    public static final void accept$31(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C69025R7d c69025R7d = (C69025R7d) obj;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS63S0100000_11.l0;
        String platForm = (String) inputCodeFragment.LLIL.getValue();
        o.LJIIIIZZ(platForm, "platForm");
        inputCodeFragment.fm(c69025R7d.LIZLLL, platForm, true);
        RC0.LJI(((InputCodeFragment) afS63S0100000_11.l0).cm(), ((InputCodeFragment) afS63S0100000_11.l0).LLILLIZIL);
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS63S0100000_11.l0;
        Bundle arguments = inputCodeFragment2.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC69113RAn.RESET_PASSWORD_FOR_EMAIL.getValue());
        arguments.putString("ticket", c69025R7d.LJIIIZ);
        inputCodeFragment2.rh(arguments);
    }

    public static final void accept$32(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        R40 r40 = (R40) obj;
        RC0.LJI(((InputCodeFragment) afS63S0100000_11.l0).cm(), ((InputCodeFragment) afS63S0100000_11.l0).LLILLIZIL);
        InputCodeFragment.Yl((InputCodeFragment) afS63S0100000_11.l0);
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS63S0100000_11.l0;
        String enterFrom = inputCodeFragment.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = ((InputCodeFragment) afS63S0100000_11.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C85631Xj9.LJIIJ(inputCodeFragment, true, enterFrom, enterMethod, String.valueOf(r40.LJIIIZ.LIZIZ), 1, false);
        C68985R5p.LIZJ(RBV.LJ((InputCodeFragment) afS63S0100000_11.l0), (InputCodeFragment) afS63S0100000_11.l0, (R7W) r40.LJIIIZ);
    }

    public static final void accept$33(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        R41.LJIIL(8, 1, ((C69072R8y) ((R40) obj).LJIIIZ).LJFF);
        C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
        c5s1.LIZLLL(((BaseUpdatePasswordFragment) afS63S0100000_11.l0).getString(R.string.cm5));
        c5s1.LJ();
        ActivityC45651qj mo49getActivity = ((BaseUpdatePasswordFragment) afS63S0100000_11.l0).mo49getActivity();
        o.LJI(mo49getActivity);
        mo49getActivity.finish();
    }

    public static final void accept$34(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        R41.LJIIL(8, 1, ((C69073R8z) ((R40) obj).LJIIIZ).LJFF);
        C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
        c5s1.LIZLLL(((BaseUpdatePasswordFragment) afS63S0100000_11.l0).getString(R.string.cm5));
        c5s1.LJ();
        ActivityC45651qj mo49getActivity = ((BaseUpdatePasswordFragment) afS63S0100000_11.l0).mo49getActivity();
        o.LJI(mo49getActivity);
        mo49getActivity.finish();
    }

    public static final void accept$35(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
        c5s1.LIZLLL(((BaseUpdatePasswordFragment) afS63S0100000_11.l0).getString(R.string.clq));
        c5s1.LJ();
        ((BaseUpdatePasswordFragment) afS63S0100000_11.l0).requireActivity().finish();
    }

    public static final void accept$36(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        EmailCodeChangePwdFragment emailCodeChangePwdFragment = (EmailCodeChangePwdFragment) afS63S0100000_11.l0;
        RC0.LJI(emailCodeChangePwdFragment.LLIIIILZ, emailCodeChangePwdFragment.LLIIII);
        EmailCodeChangePwdFragment emailCodeChangePwdFragment2 = (EmailCodeChangePwdFragment) afS63S0100000_11.l0;
        String str = ((C69032R7k) obj).LJIIIZ;
        o.LJIIIIZZ(str, "it.ticket");
        RBV.LJIILLIIL(emailCodeChangePwdFragment2, str);
        EmailCodeChangePwdFragment emailCodeChangePwdFragment3 = (EmailCodeChangePwdFragment) afS63S0100000_11.l0;
        Bundle arguments = emailCodeChangePwdFragment3.getArguments();
        o.LJI(arguments);
        arguments.putInt("next_page", EnumC69113RAn.CHANGE_PASSWORD.getValue());
        arguments.putString("platform", "email");
        emailCodeChangePwdFragment3.rh(arguments);
    }

    public static final void accept$37(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        PhoneChangePwdVerifyFragment phoneChangePwdVerifyFragment = (PhoneChangePwdVerifyFragment) afS63S0100000_11.l0;
        RC0.LJI(phoneChangePwdVerifyFragment.LLIIIILZ, phoneChangePwdVerifyFragment.LLIIII);
        PhoneChangePwdVerifyFragment phoneChangePwdVerifyFragment2 = (PhoneChangePwdVerifyFragment) afS63S0100000_11.l0;
        String str = ((C69014R6s) obj).LJIIIZ;
        o.LJIIIIZZ(str, "it.ticket");
        RBV.LJIILLIIL(phoneChangePwdVerifyFragment2, str);
        PhoneChangePwdVerifyFragment phoneChangePwdVerifyFragment3 = (PhoneChangePwdVerifyFragment) afS63S0100000_11.l0;
        Bundle arguments = phoneChangePwdVerifyFragment3.getArguments();
        o.LJI(arguments);
        arguments.putInt("next_page", EnumC69113RAn.CHANGE_PASSWORD.getValue());
        arguments.putString("platform", "phone");
        phoneChangePwdVerifyFragment3.rh(arguments);
    }

    public static final void accept$38(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        R40 r40 = (R40) obj;
        ((VerifyPasswordFragment) afS63S0100000_11.l0).Rl(0, true);
        String str = "";
        if (((VerifyPasswordFragment) afS63S0100000_11.l0).Ql() && (((VerifyPasswordFragment) afS63S0100000_11.l0).LLD.LIZIZ() || ((VerifyPasswordFragment) afS63S0100000_11.l0).LLD.LIZ())) {
            int i = C69119RAt.LIZ[((VerifyPasswordFragment) afS63S0100000_11.l0).xl().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (((VerifyPasswordFragment) afS63S0100000_11.l0).LLD.LIZIZ()) {
                                C85631Xj9.LIZ((VerifyPasswordFragment) afS63S0100000_11.l0, null);
                                return;
                            }
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Unknown scene [");
                            LIZ.append(((VerifyPasswordFragment) afS63S0100000_11.l0).xl());
                            LIZ.append("] during password verification");
                            throw new IllegalStateException(X1D.LIZIZ(LIZ));
                        }
                    } else if (((VerifyPasswordFragment) afS63S0100000_11.l0).LLD.LIZIZ()) {
                        C85631Xj9.LIZIZ((VerifyPasswordFragment) afS63S0100000_11.l0, null);
                        return;
                    }
                } else {
                    RBV.LJIIJJI((VerifyPasswordFragment) afS63S0100000_11.l0, "");
                    if (((VerifyPasswordFragment) afS63S0100000_11.l0).LLD.LIZ()) {
                        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) afS63S0100000_11.l0;
                        Bundle arguments = verifyPasswordFragment.getArguments();
                        if (arguments == null) {
                            arguments = new Bundle();
                        }
                        arguments.putInt("next_page", EnumC69113RAn.INPUT_EMAIL_CHANGE.getValue());
                        verifyPasswordFragment.rh(arguments);
                        return;
                    }
                }
            } else if (((VerifyPasswordFragment) afS63S0100000_11.l0).LLD.LIZ()) {
                RBV.LJIILJJIL((VerifyPasswordFragment) afS63S0100000_11.l0, "");
                VerifyPasswordFragment verifyPasswordFragment2 = (VerifyPasswordFragment) afS63S0100000_11.l0;
                Bundle arguments2 = verifyPasswordFragment2.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                arguments2.putInt("next_page", EnumC69113RAn.INPUT_PHONE_MODIFY.getValue());
                verifyPasswordFragment2.rh(arguments2);
                return;
            }
        }
        if (((VerifyPasswordFragment) afS63S0100000_11.l0).xl() == EnumC69116RAq.MODIFY_PHONE) {
            VerifyPasswordFragment verifyPasswordFragment3 = (VerifyPasswordFragment) afS63S0100000_11.l0;
            Bundle arguments3 = verifyPasswordFragment3.getArguments();
            if (arguments3 == null) {
                arguments3 = new Bundle();
            }
            arguments3.putInt("next_page", EnumC69113RAn.INPUT_PHONE_MODIFY.getValue());
            C69061R8n c69061R8n = (C69061R8n) r40.LJIIIZ;
            if (c69061R8n == null || (str = c69061R8n.LJI) != null) {
                arguments3.putString("ticket", str);
                verifyPasswordFragment3.rh(arguments3);
                return;
            } else {
                o.LJIJI("ticket");
                throw null;
            }
        }
        Bundle bundle = new Bundle();
        C69061R8n c69061R8n2 = (C69061R8n) r40.LJIIIZ;
        if (c69061R8n2 == null || (str = c69061R8n2.LJI) != null) {
            bundle.putString("ticket", str);
            R41.LJIIL(17, 1, bundle);
            ActivityC45651qj mo49getActivity = ((VerifyPasswordFragment) afS63S0100000_11.l0).mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            mo49getActivity.finish();
            return;
        }
        o.LJIJI("ticket");
        throw null;
    }

    public static final void accept$39(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        Throwable it = (Throwable) obj;
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) afS63S0100000_11.l0;
        o.LJIIIIZZ(it, "it");
        verifyPasswordFragment.Rl(C78688UuS.LJJIIZ(it), false);
    }

    public static final void accept$4(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String enterFrom = ((ChangeEmailVerifyFragment) afS63S0100000_11.l0).getEnterFrom();
        Bundle arguments = ((ChangeEmailVerifyFragment) afS63S0100000_11.l0).getArguments();
        if (arguments != null) {
            str = arguments.getString("page", "");
        } else {
            str = null;
        }
        String enterMethod = ((ChangeEmailVerifyFragment) afS63S0100000_11.l0).getEnterMethod();
        o.LJIIIIZZ(it, "it");
        C1JD.LJJIII(0, C78688UuS.LJJIIZ(it), enterFrom, str, enterMethod);
    }

    public static final void accept$40(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) afS63S0100000_11.l0;
        verifyPasswordFragment.getClass();
        String platform = verifyPasswordFragment.Xl();
        o.LJIIIIZZ(platform, "platform");
        C85144XbI.LJJ(platform, "password", true);
        String enterFrom = verifyPasswordFragment.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = verifyPasswordFragment.getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String platform2 = verifyPasswordFragment.Xl();
        o.LJIIIIZZ(platform2, "platform");
        C85144XbI.LJIJJ(enterFrom, enterMethod, platform2, "password", ((CompoundButton) verifyPasswordFragment._$_findCachedViewById(R.id.b_d)).isChecked());
        Bundle arguments = ((VerifyPasswordFragment) afS63S0100000_11.l0).getArguments();
        o.LJI(arguments);
        Bundle bundle = new Bundle();
        String str = ((C69030R7i) obj).LJIIIZ;
        o.LJIIIIZZ(str, "it.ticket");
        RBV.LJIILL(bundle, str);
        arguments.putBundle("final_data", bundle);
        VerifyPasswordFragment verifyPasswordFragment2 = (VerifyPasswordFragment) afS63S0100000_11.l0;
        Bundle arguments2 = verifyPasswordFragment2.getArguments();
        o.LJI(arguments2);
        verifyPasswordFragment2.Dl(arguments2);
    }

    public static final void accept$41(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        ((VerifyEmailCodeFragment) afS63S0100000_11.l0).Zl();
    }

    public static final void accept$42(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        ((VerifyEmailCodeFragment) afS63S0100000_11.l0).Zl();
    }

    public static final void accept$43(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        VerifyPhoneFragment verifyPhoneFragment = (VerifyPhoneFragment) afS63S0100000_11.l0;
        RC0.LJI(verifyPhoneFragment.LLIIIILZ, verifyPhoneFragment.LLIIII);
        VerifyPhoneFragment verifyPhoneFragment2 = (VerifyPhoneFragment) afS63S0100000_11.l0;
        String str = ((C69014R6s) obj).LJIIIZ;
        o.LJIIIIZZ(str, "it.ticket");
        RBV.LJIILLIIL(verifyPhoneFragment2, str);
        Bundle arguments = ((VerifyPhoneFragment) afS63S0100000_11.l0).getArguments();
        if (arguments != null) {
            ((VerifyPhoneFragment) afS63S0100000_11.l0).rh(arguments);
        }
    }

    public static final void accept$44(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PR3.LJ = booleanValue;
        if (booleanValue) {
            if (PR3.LIZ > 0 && System.currentTimeMillis() - PR3.LIZ > LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                try {
                    PR3.LIZ((InterfaceC46627IRr) afS63S0100000_11.l0);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        PR3.LIZIZ();
    }

    public static final void accept$45(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        MutableLiveData<Integer> mutableLiveData;
        DiskViewModel LJIILJJIL = ((C67624QgO) afS63S0100000_11.l0).LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLILLLLZI) != null) {
            mutableLiveData.setValue(0);
        }
        C67624QgO c67624QgO = (C67624QgO) afS63S0100000_11.l0;
        c67624QgO.LJIIJ(new AqS177S0100000_11(c67624QgO, 31));
    }

    public static final void accept$46(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        MutableLiveData<Integer> mutableLiveData;
        DiskViewModel LJIILJJIL = ((C67624QgO) afS63S0100000_11.l0).LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLILLLLZI) != null) {
            mutableLiveData.setValue(0);
        }
        C67624QgO c67624QgO = (C67624QgO) afS63S0100000_11.l0;
        c67624QgO.LJIIJ(new AqS177S0100000_11(c67624QgO, 32));
    }

    public static final void accept$47(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        MutableLiveData<Integer> mutableLiveData;
        DiskViewModel LJIILJJIL = ((C67623QgN) afS63S0100000_11.l0).LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLILLLLZI) != null) {
            mutableLiveData.setValue(0);
        }
        C67623QgN c67623QgN = (C67623QgN) afS63S0100000_11.l0;
        c67623QgN.LJIIJ(new AqS177S0100000_11(c67623QgN, 33));
    }

    public static final void accept$48(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        MutableLiveData<Integer> mutableLiveData;
        DiskViewModel LJIILJJIL = ((C67623QgN) afS63S0100000_11.l0).LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLILLLLZI) != null) {
            mutableLiveData.setValue(0);
        }
        C67623QgN c67623QgN = (C67623QgN) afS63S0100000_11.l0;
        c67623QgN.LJIIJ(new AqS177S0100000_11(c67623QgN, 34));
    }

    public static final void accept$49(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        MutableLiveData<Integer> mutableLiveData;
        DiskViewModel LJIILJJIL = ((C67625QgP) afS63S0100000_11.l0).LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLILLLLZI) != null) {
            mutableLiveData.setValue(0);
        }
        C67625QgP c67625QgP = (C67625QgP) afS63S0100000_11.l0;
        c67625QgP.LJIIJ(new AqS177S0100000_11(c67625QgP, 35));
    }

    public static final void accept$5(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        ((ChangeEmailVerifyFragment) afS63S0100000_11.l0).Zl();
    }

    public static final void accept$50(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        MutableLiveData<Integer> mutableLiveData;
        DiskViewModel LJIILJJIL = ((C67625QgP) afS63S0100000_11.l0).LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLILLLLZI) != null) {
            mutableLiveData.setValue(0);
        }
        C67625QgP c67625QgP = (C67625QgP) afS63S0100000_11.l0;
        c67625QgP.LJIIJ(new AqS177S0100000_11(c67625QgP, 36));
    }

    public static final void accept$51(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        ((AbstractViewOnClickListenerC67619QgJ) afS63S0100000_11.l0).LJIIJ(new AqS34S1000000_11((String) obj, 7));
    }

    public static final void accept$52(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        InterfaceC68901R2j it = (InterfaceC68901R2j) obj;
        Object obj2 = ((C73919Szj) afS63S0100000_11.l0).LIZIZ;
        if (!(obj2 instanceof InterfaceC68905R2n)) {
            obj2 = null;
        }
        InterfaceC68905R2n interfaceC68905R2n = (InterfaceC68905R2n) obj2;
        if (interfaceC68905R2n != null) {
            o.LJFF(it, "it");
            interfaceC68905R2n.LJI(it);
        }
    }

    public static final void accept$53(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        InterfaceC68901R2j interfaceC68901R2j = (InterfaceC68901R2j) obj;
        Object obj2 = ((C68908R2q) afS63S0100000_11.l0).LIZ.get();
        if (obj2 != null) {
            interfaceC68901R2j.LIZ((QDR) obj2);
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    public static final void accept$6(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        C69032R7k c69032R7k = (C69032R7k) obj;
        VerifyEmailBeforeChangeFragment verifyEmailBeforeChangeFragment = (VerifyEmailBeforeChangeFragment) afS63S0100000_11.l0;
        RC0.LJI(verifyEmailBeforeChangeFragment.LLIIIILZ, verifyEmailBeforeChangeFragment.LLIIII);
        ((VerifyEmailBeforeChangeFragment) afS63S0100000_11.l0).Rl(0, true);
        VerifyEmailBeforeChangeFragment verifyEmailBeforeChangeFragment2 = (VerifyEmailBeforeChangeFragment) afS63S0100000_11.l0;
        Bundle arguments = ((VerifyEmailBeforeChangeFragment) afS63S0100000_11.l0).getArguments();
        o.LJI(arguments);
        Bundle bundle = new Bundle(arguments);
        VerifyEmailBeforeChangeFragment verifyEmailBeforeChangeFragment3 = (VerifyEmailBeforeChangeFragment) afS63S0100000_11.l0;
        RBV.LJIIJ(bundle, "");
        if (verifyEmailBeforeChangeFragment3.LLIIJI.LIZ()) {
            RBV.LJIIJJI(verifyEmailBeforeChangeFragment3, "");
            RBV.LJIILJJIL(verifyEmailBeforeChangeFragment3, "");
            int i = RCG.LIZ[verifyEmailBeforeChangeFragment3.xl().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    bundle.putInt("next_page", EnumC69113RAn.INPUT_EMAIL_CHANGE.getValue());
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unknown scene ");
                    LIZ.append(verifyEmailBeforeChangeFragment3.xl());
                    LIZ.append(" while validating email code");
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            } else {
                bundle.putInt("next_page", EnumC69113RAn.INPUT_PHONE_MODIFY.getValue());
            }
        } else {
            String str = c69032R7k.LJIIIZ;
            o.LJIIIIZZ(str, "it.ticket");
            RBV.LJIILL(bundle, str);
            bundle.putInt("next_page", EnumC69113RAn.INPUT_EMAIL_CHANGE.getValue());
        }
        verifyEmailBeforeChangeFragment2.rh(bundle);
    }

    public static final void accept$7(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        Throwable it = (Throwable) obj;
        VerifyEmailBeforeChangeFragment verifyEmailBeforeChangeFragment = (VerifyEmailBeforeChangeFragment) afS63S0100000_11.l0;
        o.LJIIIIZZ(it, "it");
        verifyEmailBeforeChangeFragment.Rl(C78688UuS.LJJIIZ(it), false);
    }

    public static final void accept$8(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        ((VerifyEmailBeforeChangeFragment) afS63S0100000_11.l0).lm(true);
    }

    public static final void accept$9(AfS63S0100000_11 afS63S0100000_11, Object obj) {
        VerifyEmailForTicketFragment verifyEmailForTicketFragment = (VerifyEmailForTicketFragment) afS63S0100000_11.l0;
        RC0.LJI(verifyEmailForTicketFragment.LLIIIILZ, verifyEmailForTicketFragment.LLIIII);
        R41.LIZJ().setEmailVerified(true);
        Bundle bundle = new Bundle();
        bundle.putString("platform", "email");
        String str = ((C69032R7k) obj).LJIIIZ;
        o.LJIIIIZZ(str, "it.ticket");
        RBV.LJIILL(bundle, str);
        Bundle arguments = ((VerifyEmailForTicketFragment) afS63S0100000_11.l0).getArguments();
        o.LJI(arguments);
        arguments.putBundle("final_data", bundle);
        VerifyEmailForTicketFragment verifyEmailForTicketFragment2 = (VerifyEmailForTicketFragment) afS63S0100000_11.l0;
        Bundle arguments2 = verifyEmailForTicketFragment2.getArguments();
        o.LJI(arguments2);
        verifyEmailForTicketFragment2.Dl(arguments2);
    }
}
