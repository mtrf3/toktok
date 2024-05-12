package Y;

import X.InterfaceC29937Boz;
import android.app.Dialog;
import com.ss.android.ugc.aweme.account.changemail.VerifyEmailBeforeChangeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneNumRecycleProcessFragment;
import com.ss.android.ugc.aweme.account.setpwd.EmailCodeChangePwdFragment;
import com.ss.android.ugc.aweme.account.setpwd.PhoneChangePwdVerifyFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyPhoneFragment;

/* loaded from: classes12.dex */
public class IDaS220S0100000_11 implements InterfaceC29937Boz {
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
            default:
                return;
        }
    }

    public static final void run$0(IDaS220S0100000_11 iDaS220S0100000_11) {
        Dialog dialog = (Dialog) ((PhoneNumRecycleProcessFragment) iDaS220S0100000_11.l0).LLI.getValue();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void run$1(IDaS220S0100000_11 iDaS220S0100000_11) {
        Dialog dialog = (Dialog) ((PhoneNumRecycleProcessFragment) iDaS220S0100000_11.l0).LLI.getValue();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void run$2(IDaS220S0100000_11 iDaS220S0100000_11) {
        Dialog dialog = (Dialog) ((PhoneNumRecycleProcessFragment) iDaS220S0100000_11.l0).LLI.getValue();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void run$3(IDaS220S0100000_11 iDaS220S0100000_11) {
        ((VerifyPhoneFragment) iDaS220S0100000_11.l0).Zl();
    }

    public static final void run$4(IDaS220S0100000_11 iDaS220S0100000_11) {
        ((VerifyEmailBeforeChangeFragment) iDaS220S0100000_11.l0).Zl();
    }

    public static final void run$5(IDaS220S0100000_11 iDaS220S0100000_11) {
        ((EmailCodeChangePwdFragment) iDaS220S0100000_11.l0).Zl();
    }

    public static final void run$6(IDaS220S0100000_11 iDaS220S0100000_11) {
        ((PhoneChangePwdVerifyFragment) iDaS220S0100000_11.l0).Zl();
    }

    public IDaS220S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
