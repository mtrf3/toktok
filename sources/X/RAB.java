package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RAB<T> implements InterfaceC64592gB {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ BaseAccountFlowFragment LJLILLLLZI;
    public final /* synthetic */ SignUpOrLoginActivity LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    public RAB(Bundle bundle, BaseAccountFlowFragment baseAccountFlowFragment, SignUpOrLoginActivity signUpOrLoginActivity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = bundle;
        this.LJLILLLLZI = baseAccountFlowFragment;
        this.LJLJI = signUpOrLoginActivity;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        String str;
        Bundle arguments;
        Bundle arguments2;
        Bundle arguments3;
        Bundle arguments4;
        R40 r40 = (R40) obj;
        this.LJLIL.putString("platform_profile", "sms_verification");
        C68972R5c.LJIIIZ(true, "sms_verification", this.LJLILLLLZI, ((R7Z) r40.LJIIIZ).LJFF, null);
        BaseAccountFlowFragment baseAccountFlowFragment = this.LJLILLLLZI;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.SIGN_UP;
        EnumC69113RAn Al = baseAccountFlowFragment.Al();
        QTX qtx = ((R7Z) r40.LJIIIZ).LJFF;
        o.LJIIIIZZ(qtx, "data.mobileObj.mUserInfo");
        C68985R5p.LIZIZ(baseAccountFlowFragment, baseAccountFlowFragment, enumC69116RAq, Al, qtx);
        if (C69040R7s.LIZIZ()) {
            C69040R7s.LIZ = null;
        }
        SignUpOrLoginActivity signUpOrLoginActivity = this.LJLJI;
        Bundle bundle = this.LJLIL;
        BaseAccountFlowFragment LLFII = signUpOrLoginActivity.LLFII();
        boolean z3 = false;
        if (LLFII != null && (arguments4 = LLFII.getArguments()) != null) {
            z = arguments4.getBoolean("should_bind_email");
        } else {
            z = false;
        }
        bundle.putBoolean("should_bind_email", z);
        BaseAccountFlowFragment LLFII2 = signUpOrLoginActivity.LLFII();
        if (LLFII2 != null && (arguments3 = LLFII2.getArguments()) != null) {
            z2 = arguments3.getBoolean("is_user_age_legal");
        } else {
            z2 = false;
        }
        bundle.putBoolean("is_user_age_legal", z2);
        BaseAccountFlowFragment LLFII3 = signUpOrLoginActivity.LLFII();
        if (LLFII3 != null && (arguments2 = LLFII3.getArguments()) != null) {
            z3 = arguments2.getBoolean("is_check_box_legal");
        }
        bundle.putBoolean("is_check_box_legal", z3);
        BaseAccountFlowFragment LLFII4 = signUpOrLoginActivity.LLFII();
        if (LLFII4 == null || (arguments = LLFII4.getArguments()) == null || (str = arguments.getString("auth_type")) == null) {
            str = " ";
        }
        bundle.putString("auth_type", str);
        bundle.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
        bundle.putInt("previous_page", EnumC69113RAn.AGE_GATE_POST_PHONE_SIGNUP.getValue());
        signUpOrLoginActivity.LLFZ(bundle);
        this.LJLJJI.invoke();
    }
}
