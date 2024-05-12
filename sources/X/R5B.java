package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.login.rememberaccount.OneClickLoginViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5B implements InterfaceC85536Xhc {
    public final /* synthetic */ LoginMethodListFragment LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.InterfaceC85536Xhc
    public final void LIZ() {
        Bundle bundle = new Bundle((Bundle) this.LIZ.LJLZ.getValue());
        bundle.putString("enter_from", "oneclick_add_acct");
        bundle.putString("enter_method", "add_a_account");
        bundle.putString("login_panel_type", "login");
        bundle.putBoolean("is_skippable_dialog", true);
        bundle.putBoolean("is_fullscreen_dialog", false);
        bundle.putBoolean("isFromOcl", true);
        java.util.Map LIZJ = C68972R5c.LIZJ(bundle);
        o.LJI(LIZJ);
        LIZJ.put("login_last_time", 1);
        R5Q.LJ(null, this.LIZ.getEnterFrom(), this.LIZ.getEnterMethod(), this.LIZ.wl(), "add_account");
        if (C53262KvK.LIZIZ()) {
            ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
            if (mo49getActivity != null) {
                LoginMethodListFragment loginMethodListFragment = this.LIZ;
                if (((OneClickLoginViewModel) loginMethodListFragment.LJZI.getValue()).hv0() || ((OneClickLoginViewModel) loginMethodListFragment.LJZI.getValue()).gv0()) {
                    C68971R5b.LIZJ(mo49getActivity, bundle, true, true, false);
                    return;
                } else {
                    loginMethodListFragment.Il(true);
                    return;
                }
            }
            return;
        }
        ActivityC45651qj requireActivity = this.LIZ.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C68971R5b.LIZJ(requireActivity, bundle, true, true, false);
    }

    public R5B(LoginMethodListFragment loginMethodListFragment, View view) {
        this.LIZ = loginMethodListFragment;
        this.LIZIZ = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    @Override // X.InterfaceC85536Xhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r24, int r25) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R5B.LIZIZ(com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod, int):void");
    }
}
