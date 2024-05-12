package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.login.rememberaccount.OneClickLoginViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5C implements View.OnClickListener {
    public final /* synthetic */ LoginMethodListFragment LJLIL;

    public R5C(LoginMethodListFragment loginMethodListFragment) {
        this.LJLIL = loginMethodListFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!((OneClickLoginViewModel) this.LJLIL.LJZI.getValue()).hv0()) {
            this.LJLIL.Il(false);
            return;
        }
        Bundle bundle = new Bundle((Bundle) this.LJLIL.LJLZ.getValue());
        bundle.putString("enter_from", "trust_one_click_pad");
        bundle.putString("enter_method", "sign_in");
        bundle.putBoolean("isFromOcl", true);
        java.util.Map LIZJ = C68972R5c.LIZJ(bundle);
        o.LJI(LIZJ);
        LIZJ.put("login_last_time", 1);
        ActivityC45651qj requireActivity = this.LJLIL.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C68971R5b.LIZJ(requireActivity, bundle, PrevLoginPlatformService.LJIIL().LJI(), true, false);
    }
}
