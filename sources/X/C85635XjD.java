package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreateAccountFragment;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreatePasswordFragment;
import com.ss.android.ugc.aweme.account.bind.BindEmailCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.bind.BindEmailFragment;
import com.ss.android.ugc.aweme.account.bind.BindTOTPFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailVerifyFragment;
import com.ss.android.ugc.aweme.account.changemail.VerifyEmailBeforeChangeFragment;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginBlockFragment;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSIModeFragment;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeySetUpFragment;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.login.twostep.AddCurrentAuthDeviceFragment;
import com.ss.android.ugc.aweme.account.login.twostep.RecentDevicesFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyEmailForTicketFragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyPhoneForTicketFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountPrivateAccountTipsFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BindEmailWithoutVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ChildrenChangePasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailPasswordLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ForceVerifyPhoneInputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PaPromptAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhlAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneNumRecycleProcessFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetAvatarFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetAvatarNicknameFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetNicknameFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SignUpTermsConsentFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.setpwd.EmailCodeChangePwdFragment;
import com.ss.android.ugc.aweme.account.setpwd.PhoneChangePwdVerifyFragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.account.unbind.UnbindConfirmFragment;
import com.ss.android.ugc.aweme.account.unbind.UnbindInputCodeFragment;
import com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyPhoneFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.jvm.internal.o;

/* renamed from: X.XjD, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85635XjD {
    public static BaseAccountFlowFragment LIZ(EnumC69113RAn step) {
        o.LJIIIZ(step, "step");
        switch (C69114RAo.LIZ[step.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new CreatePasswordFragment();
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
                return new InputCodeFragment();
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return new VerifyEmailCodeFragment();
            case 14:
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
                return new InputPhoneFragment();
            case 18:
                return new InputEmailFragment();
            case 19:
                return new InputPasswordFragment();
            case 20:
                return new PhoneEmailLoginFragment();
            case 21:
            case 22:
                return new PhoneEmailSignUpFragment();
            case 23:
                return new SetNicknameFragment();
            case 24:
            case 25:
                return new EmailPasswordLoginFragment();
            case 26:
                return new PhoneLoginFragment();
            case 27:
                return new PhoneSignUpFragment();
            case 28:
                return new EmailSignUpFragment();
            case 29:
                return new EmailPasswordLoginFragment();
            case 30:
                return new PhoneLoginFragment();
            case 31:
                return new InputCodeFragment();
            case 32:
                return new PhoneChangePwdVerifyFragment();
            case 33:
                return new BaseUpdatePasswordFragment();
            case 34:
            case 35:
            case 36:
            case 37:
                return new VerifyPasswordFragment();
            case 38:
                return new BindEmailFragment();
            case 39:
                return new BindEmailCodeVerifyFragment();
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return new ChangeEmailVerifyFragment();
            case 41:
                return new VerifyEmailBeforeChangeFragment();
            case 42:
                return new ChangeEmailFragment();
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return new ConfirmEmailFragment();
            case 44:
                return new VerifyPhoneFragment();
            case 45:
                return new EmailCodeChangePwdFragment();
            case 46:
                return new LoginMethodListFragment();
            case 47:
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
            case C61447O9r.LJIIJ:
            case 50:
                return new SignUpTermsConsentFragment();
            case 51:
                return new FtcCreateAccountFragment();
            case 52:
                return new FtcCreatePasswordFragment();
            case 53:
                return new ChildrenChangePasswordFragment();
            case 54:
            case 55:
                return new TwoStepVerifyEmailFor2046Fragment();
            case 56:
                return new TwoStepVerifySmsFor2046Fragment();
            case 57:
                return new VerifyEmailForTicketFragment();
            case 58:
                return new VerifyPhoneForTicketFragment();
            case 59:
                return new AccountPrivateAccountTipsFragment();
            case 60:
                return new PhoneNumRecycleProcessFragment();
            case 61:
            case BaseNotice.CREATOR /* 62 */:
                return new UnbindConfirmFragment();
            case 63:
            case 64:
            case 65:
            case 66:
                return new UnbindInputCodeFragment();
            case 67:
                return new RuInstantLoginSIModeFragment();
            case 68:
                return new RuInstantLoginBlockFragment();
            case 69:
                return new BindEmailWithoutVerifyFragment();
            case 70:
                return new InputPhoneFragment();
            case 71:
                return new ForceVerifyPhoneInputCodeFragment();
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return new BindTOTPFragment();
            case 73:
                return new TOTPCodeVerifyFragment();
            case 74:
                return new SetAvatarFragment();
            case 75:
                return new SetAvatarNicknameFragment();
            case 76:
                return new PaPromptAccountFlowFragment();
            case 77:
                return new PhlAccountFlowFragment();
            case 78:
                return new AddCurrentAuthDeviceFragment();
            case 79:
                return new TrustedDevicesFragment();
            case 80:
                return new RecentDevicesFragment();
            case 81:
                return new PasskeySetUpFragment();
            default:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unknown step ");
                LIZ.append(step);
                LIZ.append(" in LoginFlowFactory");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
    }
}
