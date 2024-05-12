package Y;

import X.C85625Xj3;
import X.C85626Xj4;
import X.InterfaceC65784Pro;
import X.OHI;
import X.RBV;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import java.util.List;

/* loaded from: classes16.dex */
public class IDCListenerS166S0100000_15 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            case 6:
                onClick$6(this, dialogInterface, i);
                return;
            case 7:
                onClick$7(this, dialogInterface, i);
                return;
            case 8:
                onClick$8(this, dialogInterface, i);
                return;
            case 9:
                onClick$9(this, dialogInterface, i);
                return;
            case 10:
                onClick$10(this, dialogInterface, i);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, dialogInterface, i);
                return;
            case 12:
                onClick$12(this, dialogInterface, i);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS166S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        ((ProfileEditFragment) iDCListenerS166S0100000_15.l0).fm();
    }

    public static final void onClick$1(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        ((ProfileEditFragment) iDCListenerS166S0100000_15.l0).em();
    }

    public static final void onClick$10(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        TwoStepVerifyWays twoStepVerifyWays = (TwoStepVerifyWays) ListProtector.get(((TwoStepVerifyEmailFor2046Fragment) iDCListenerS166S0100000_15.l0).lm(), i);
        if (twoStepVerifyWays != null) {
            TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment = (TwoStepVerifyEmailFor2046Fragment) iDCListenerS166S0100000_15.l0;
            Bundle arguments = twoStepVerifyEmailFor2046Fragment.getArguments();
            if (arguments != null) {
                String verify_way = twoStepVerifyWays.getVerify_way();
                if (verify_way == null) {
                    verify_way = "";
                }
                arguments.putInt("next_page", C85625Xj3.LIZJ(verify_way).getValue());
                RBV.LJIIJ(arguments, twoStepVerifyEmailFor2046Fragment.getEmail());
            } else {
                arguments = new Bundle();
            }
            twoStepVerifyEmailFor2046Fragment.rh(arguments);
        }
    }

    public static final void onClick$11(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        TwoStepVerifyWays twoStepVerifyWays;
        List<TwoStepVerifyWays> lm = ((TwoStepVerifySmsFor2046Fragment) iDCListenerS166S0100000_15.l0).lm();
        if (lm != null && (twoStepVerifyWays = (TwoStepVerifyWays) ListProtector.get(lm, i)) != null) {
            TwoStepVerifySmsFor2046Fragment twoStepVerifySmsFor2046Fragment = (TwoStepVerifySmsFor2046Fragment) iDCListenerS166S0100000_15.l0;
            Bundle arguments = twoStepVerifySmsFor2046Fragment.getArguments();
            if (arguments != null) {
                String verify_way = twoStepVerifyWays.getVerify_way();
                if (verify_way == null) {
                    verify_way = "";
                }
                arguments.putInt("next_page", C85625Xj3.LIZJ(verify_way).getValue());
            } else {
                arguments = new Bundle();
            }
            twoStepVerifySmsFor2046Fragment.rh(arguments);
        }
    }

    public static final void onClick$12(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        TwoStepVerifyWays twoStepVerifyWays;
        List<TwoStepVerifyWays> mm = ((TOTPCodeVerifyFragment) iDCListenerS166S0100000_15.l0).mm();
        if (mm != null && (twoStepVerifyWays = (TwoStepVerifyWays) ListProtector.get(mm, i)) != null) {
            TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) iDCListenerS166S0100000_15.l0;
            Bundle arguments = tOTPCodeVerifyFragment.getArguments();
            if (arguments != null) {
                String verify_way = twoStepVerifyWays.getVerify_way();
                if (verify_way == null) {
                    verify_way = "";
                }
                arguments.putInt("next_page", C85625Xj3.LIZJ(verify_way).getValue());
            } else {
                arguments = new Bundle();
            }
            tOTPCodeVerifyFragment.rh(arguments);
        }
    }

    public static final void onClick$13(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        TwoStepVerifyWays twoStepVerifyWays = (TwoStepVerifyWays) ListProtector.get(((VerifyPasswordFragment) iDCListenerS166S0100000_15.l0).Yl(), i);
        if (twoStepVerifyWays != null) {
            VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) iDCListenerS166S0100000_15.l0;
            Bundle arguments = verifyPasswordFragment.getArguments();
            if (arguments != null) {
                String verify_way = twoStepVerifyWays.getVerify_way();
                if (verify_way == null) {
                    verify_way = "";
                }
                arguments.putInt("next_page", C85626Xj4.LIZIZ(verify_way).getValue());
            } else {
                arguments = new Bundle();
            }
            verifyPasswordFragment.rh(arguments);
        }
    }

    public static final void onClick$2(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS166S0100000_15.l0).invoke();
    }

    public static final void onClick$3(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS166S0100000_15.l0).invoke();
    }

    public static final void onClick$4(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS166S0100000_15.l0).invoke();
    }

    public static final void onClick$5(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS166S0100000_15.l0).invoke();
    }

    public static final void onClick$6(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS166S0100000_15.l0).invoke();
    }

    public static final void onClick$7(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS166S0100000_15.l0).invoke();
    }

    public static final void onClick$8(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS166S0100000_15.l0).invoke();
    }

    public static final void onClick$9(IDCListenerS166S0100000_15 iDCListenerS166S0100000_15, DialogInterface dialogInterface, int i) {
        OHI ohi = OHI.LIZ;
        ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) iDCListenerS166S0100000_15.l0;
        ohi.getClass();
        OHI.LJIIIIZZ(contextThemeWrapper, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
