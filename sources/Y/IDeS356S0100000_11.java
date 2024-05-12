package Y;

import X.ActivityC45651qj;
import X.C39326Fc2;
import X.C5S1;
import X.EnumC69116RAq;
import X.InterfaceC65784Pro;
import X.JJ4;
import X.R47;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.services.interceptor.ForcePhoneVerificationManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class IDeS356S0100000_11 implements R47 {
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
            default:
                return;
        }
    }

    public IDeS356S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(IDeS356S0100000_11 iDeS356S0100000_11, int i, int i2, Object obj) {
        ForcePhoneVerificationManager.INSTANCE.conditionalBindLoginSuccessOrCancel();
        Activity activity = (Activity) iDeS356S0100000_11.l0;
        if (activity instanceof AuthorizeActivity) {
            activity.finish();
        }
    }

    public static final void onResult$1(IDeS356S0100000_11 iDeS356S0100000_11, int i, int i2, Object obj) {
        if (i2 == 1) {
            ActivityC45651qj mo49getActivity = ((InputPhoneFragment) iDeS356S0100000_11.l0).mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity");
            BindOrModifyPhoneActivity bindOrModifyPhoneActivity = (BindOrModifyPhoneActivity) mo49getActivity;
            o.LJII(obj, "null cannot be cast to non-null type android.os.Bundle");
            bindOrModifyPhoneActivity.LJLJJI = true;
            bindOrModifyPhoneActivity.LJLJJL = (Bundle) obj;
            bindOrModifyPhoneActivity.LJLJJLL = Integer.valueOf(i);
            bindOrModifyPhoneActivity.finish();
        }
    }

    public static final void onResult$2(IDeS356S0100000_11 iDeS356S0100000_11, int i, int i2, Object obj) {
        Bundle bundle;
        AuthorizeActivity authorizeActivity = (AuthorizeActivity) iDeS356S0100000_11.l0;
        authorizeActivity.getClass();
        if (i == 9 && i2 == 1) {
            if (obj instanceof Bundle) {
                bundle = (Bundle) obj;
            } else {
                bundle = new Bundle();
            }
            C39326Fc2.LIZIZ(bundle, new AObjectS42S0101000_5(5, authorizeActivity, 58));
            return;
        }
        C5S1 c5s1 = new C5S1(authorizeActivity.getBaseContext());
        c5s1.LIZJ(R.string.g5w);
        c5s1.LJ();
    }

    public static final void onResult$3(IDeS356S0100000_11 iDeS356S0100000_11, int i, int i2, Object obj) {
        if (i == EnumC69116RAq.VERIFY.getValue() && i2 == 1) {
            ((JJ4) iDeS356S0100000_11.l0).LIZ();
        } else {
            ((JJ4) iDeS356S0100000_11.l0).LIZIZ();
        }
    }

    public static final void onResult$4(IDeS356S0100000_11 iDeS356S0100000_11, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((InterfaceC65784Pro) iDeS356S0100000_11.l0).invoke();
        }
    }
}
