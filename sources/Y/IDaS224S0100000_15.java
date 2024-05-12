package Y;

import X.C74088T5w;
import X.C86192XsC;
import X.DialogC86015XpL;
import X.InterfaceC29937Boz;
import X.InterfaceC65784Pro;
import X.SY4;
import X.XS7;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSIModeFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyEmailForTicketFragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyPhoneForTicketFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDaS224S0100000_15 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((C86192XsC) iDaS224S0100000_15.l0).LJIIJJI("overall");
    }

    public static final void run$1(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((C86192XsC) iDaS224S0100000_15.l0).LJIIJJI("separate");
    }

    public static final void run$10(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((DialogC86015XpL) iDaS224S0100000_15.l0).LIZJ("next_time");
        ((DialogC86015XpL) iDaS224S0100000_15.l0).dismiss();
    }

    public static final void run$11(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((TwoStepVerifyEmailFor2046Fragment) iDaS224S0100000_15.l0).Zl();
    }

    public static final void run$12(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((TwoStepVerifySmsFor2046Fragment) iDaS224S0100000_15.l0).Zl();
    }

    public static final void run$13(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((VerifyEmailForTicketFragment) iDaS224S0100000_15.l0).Zl();
    }

    public static final void run$14(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((VerifyPhoneForTicketFragment) iDaS224S0100000_15.l0).Zl();
    }

    public static final void run$2(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((I18nUpdateManager) iDaS224S0100000_15.l0).LIZLLL = false;
    }

    public static final void run$3(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((SY4) ((TwoStepVerifyEmailFor2046Fragment) iDaS224S0100000_15.l0)._$_findCachedViewById(R.id.h0u)).setEnabled(true);
        ((SY4) ((TwoStepVerifyEmailFor2046Fragment) iDaS224S0100000_15.l0)._$_findCachedViewById(R.id.h0u)).setLoading(false);
    }

    public static final void run$4(IDaS224S0100000_15 iDaS224S0100000_15) {
        C74088T5w c74088T5w = (C74088T5w) ((TwoStepVerifyPushFor2067Activity) iDaS224S0100000_15.l0)._$_findCachedViewById(R.id.ayj);
        String string = ((TwoStepVerifyPushFor2067Activity) iDaS224S0100000_15.l0).getString(R.string.pm4);
        o.LJIIIIZZ(string, "getString(R.string.pushc…device_resend_btn_active)");
        c74088T5w.setText(string);
        ((C74088T5w) ((TwoStepVerifyPushFor2067Activity) iDaS224S0100000_15.l0)._$_findCachedViewById(R.id.ayj)).setEnabled(true);
    }

    public static final void run$5(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((SY4) ((TwoStepVerifySmsFor2046Fragment) iDaS224S0100000_15.l0)._$_findCachedViewById(R.id.h0u)).setEnabled(true);
        ((SY4) ((TwoStepVerifySmsFor2046Fragment) iDaS224S0100000_15.l0)._$_findCachedViewById(R.id.h0u)).setLoading(false);
    }

    public static final void run$6(IDaS224S0100000_15 iDaS224S0100000_15) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDaS224S0100000_15.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void run$7(IDaS224S0100000_15 iDaS224S0100000_15) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDaS224S0100000_15.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void run$8(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((RuInstantLoginSIModeFragment) iDaS224S0100000_15.l0).LJIJ();
    }

    public static final void run$9(IDaS224S0100000_15 iDaS224S0100000_15) {
        ((XS7) iDaS224S0100000_15.l0).LJIIL(3);
    }

    public IDaS224S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
