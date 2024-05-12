package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RAG extends AbstractC65781Prl implements InterfaceC88472Yns<C10K<Bundle>, C76800UCe> {
    public final /* synthetic */ BaseAccountFlowFragment LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;
    public final /* synthetic */ SignUpOrLoginActivity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RAG(BaseAccountFlowFragment baseAccountFlowFragment, Bundle bundle, SignUpOrLoginActivity signUpOrLoginActivity) {
        super(1);
        this.LJLIL = baseAccountFlowFragment;
        this.LJLILLLLZI = bundle;
        this.LJLJI = signUpOrLoginActivity;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C10K<Bundle> it) {
        o.LJIIIZ(it, "it");
        BaseAccountFlowFragment baseAccountFlowFragment = this.LJLIL;
        if (baseAccountFlowFragment != null) {
            baseAccountFlowFragment.ee(0);
        }
        if (this.LJLILLLLZI.getBoolean("phone_signup") || this.LJLILLLLZI.getBoolean("email_signup")) {
            this.LJLILLLLZI.putBoolean("need_restart", false);
            if (R41.LJI() && (!RAJ.LIZ() || this.LJLILLLLZI.getBoolean("age_gate_login"))) {
                SignUpOrLoginActivity signUpOrLoginActivity = this.LJLJI;
                Bundle bundle = this.LJLILLLLZI;
                bundle.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
                signUpOrLoginActivity.LLFZ(bundle);
            }
        } else if (this.LJLILLLLZI.getBoolean("is_new_3p_signup")) {
            this.LJLILLLLZI.putBoolean("need_restart", false);
            SignUpOrLoginActivity signUpOrLoginActivity2 = this.LJLJI;
            Bundle bundle2 = this.LJLILLLLZI;
            bundle2.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
            signUpOrLoginActivity2.LLFZ(bundle2);
        } else if (C41565GSz.LIZIZ(this.LJLJI.getIntent())) {
            this.LJLJI.LJLLL = true;
        } else {
            this.LJLJI.finish();
        }
        if (this.LJLJI.LLIL()) {
            this.LJLILLLLZI.putBoolean("should_restart_later", true);
        }
        if (R41.LJI()) {
            R41.LJIIL(1, 1, "");
        }
        C69101RAb.LIZIZ(11);
        R41.LJIIIIZZ(R41.LIZJ());
        if (o.LJ("find_account", this.LJLJI.LJJLIIIJJI())) {
            C2U8.LIZ(new C60058Nhe());
        }
        return C76800UCe.LIZ;
    }
}
