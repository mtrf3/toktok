package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RAC<T> implements InterfaceC64592gB {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ SetPasswordMobHelper LJLILLLLZI;
    public final /* synthetic */ BaseAccountFlowFragment LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ SignUpOrLoginActivity LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    public RAC(Bundle bundle, SetPasswordMobHelper setPasswordMobHelper, BaseAccountFlowFragment baseAccountFlowFragment, String str, SignUpOrLoginActivity signUpOrLoginActivity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = bundle;
        this.LJLILLLLZI = setPasswordMobHelper;
        this.LJLJI = baseAccountFlowFragment;
        this.LJLJJI = str;
        this.LJLJJL = signUpOrLoginActivity;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        String str;
        Bundle arguments;
        Bundle arguments2;
        Bundle arguments3;
        R40 r40 = (R40) obj;
        this.LJLIL.putString("platform_profile", "email");
        SetPasswordMobHelper setPasswordMobHelper = this.LJLILLLLZI;
        String enterFrom = this.LJLJI.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "it.enterFrom");
        String enterMethod = this.LJLJI.getEnterMethod();
        o.LJIIIIZZ(enterMethod, "it.enterMethod");
        String wl = this.LJLJI.wl();
        o.LJIIIIZZ(wl, "it.loginPanelType");
        setPasswordMobHelper.LIZ(true, "email", enterFrom, enterMethod, wl, 0, this.LJLJI, this.LJLJJI);
        C68972R5c.LJIIIZ(true, "email", this.LJLJI, ((R7V) r40.LJIIIZ).LJIIIZ, null);
        BaseAccountFlowFragment baseAccountFlowFragment = this.LJLJI;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.SIGN_UP;
        EnumC69113RAn Al = baseAccountFlowFragment.Al();
        QTX qtx = ((R7V) r40.LJIIIZ).LJIIIZ;
        o.LJIIIIZZ(qtx, "data.mobileObj.mUserInfo");
        C68985R5p.LIZIZ(baseAccountFlowFragment, baseAccountFlowFragment, enumC69116RAq, Al, qtx);
        if (C69040R7s.LIZIZ()) {
            C69040R7s.LIZ = null;
        }
        SignUpOrLoginActivity signUpOrLoginActivity = this.LJLJJL;
        Bundle bundle = this.LJLIL;
        BaseAccountFlowFragment LLFII = signUpOrLoginActivity.LLFII();
        boolean z2 = false;
        if (LLFII != null && (arguments3 = LLFII.getArguments()) != null) {
            z = arguments3.getBoolean("should_bind_phone");
        } else {
            z = false;
        }
        bundle.putBoolean("should_bind_phone", z);
        BaseAccountFlowFragment LLFII2 = signUpOrLoginActivity.LLFII();
        if (LLFII2 != null && (arguments2 = LLFII2.getArguments()) != null) {
            z2 = arguments2.getBoolean("is_user_age_legal");
        }
        bundle.putBoolean("is_user_age_legal", z2);
        BaseAccountFlowFragment LLFII3 = signUpOrLoginActivity.LLFII();
        if (LLFII3 == null || (arguments = LLFII3.getArguments()) == null || (str = arguments.getString("auth_type")) == null) {
            str = " ";
        }
        bundle.putString("auth_type", str);
        bundle.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
        bundle.putInt("previous_page", EnumC69113RAn.AGE_GATE_POST_EMAIL_SIGNUP.getValue());
        signUpOrLoginActivity.LLFZ(bundle);
        this.LJLJJLL.invoke();
    }
}
