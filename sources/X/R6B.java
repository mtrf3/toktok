package X;

import Y.AObjectS88S0300000_11;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.service.nickname.NicknameSignupExperiment;

/* loaded from: classes12.dex */
public final /* synthetic */ class R6B implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ LifecycleOwner LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        EnumC69116RAq enumC69116RAq;
        String LIZ;
        boolean z = false;
        switch (this.LJLIL) {
            case 0:
                ((View) this.LJLJI).addOnLayoutChangeListener(((CommentWidget) this.LJLILLLLZI).LLJJIII);
                return;
            case 1:
                AuthorizeActivity authorizeActivity = (AuthorizeActivity) this.LJLILLLLZI;
                QTZ qtz = (QTZ) this.LJLJI;
                authorizeActivity.getClass();
                Intent intent = new Intent();
                Bundle bundle = new Bundle(C16880lQ.LLJJIJI(authorizeActivity.getIntent()));
                String str = "";
                if (qtz.LJ) {
                    QBH qbh = authorizeActivity.LJLILLLLZI;
                    if (qbh == null) {
                        LIZ = "";
                    } else {
                        LIZ = QBU.LIZ(qbh.LIZIZ);
                    }
                    bundle.putString("set_nickname_platform", LIZ);
                    bundle.putString("enter_from", authorizeActivity.LJLL);
                    bundle.putString("enter_method", authorizeActivity.LJLLI);
                    if (NicknameSignupExperiment.LIZ().isEnabled()) {
                        bundle.putBoolean("need_restart", false);
                        bundle.putBoolean("should_restart_later", true);
                    }
                }
                if (qtz.LJ) {
                    enumC69116RAq = EnumC69116RAq.SIGN_UP;
                } else {
                    enumC69116RAq = EnumC69116RAq.LOGIN;
                }
                bundle.putInt("current_scene", enumC69116RAq.getValue());
                QBH qbh2 = authorizeActivity.LJLILLLLZI;
                if (qbh2 != null) {
                    str = QBU.LIZ(qbh2.LIZIZ);
                }
                bundle.putString("platform", str);
                bundle.putString("login_path", "third_party_auth");
                C39326Fc2.LIZIZ(bundle, new AObjectS88S0300000_11(intent, qtz, authorizeActivity, 1));
                if ("find_account".equals(authorizeActivity.LJLL)) {
                    C2U8.LIZ(new C60058Nhe());
                }
                if (qtz.LJ) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(authorizeActivity, "//account/login/signup_or_login");
                    buildRoute.withParam("enter_type", authorizeActivity.Xg());
                    buildRoute.withParam("is_new_3p_signup", true);
                    buildRoute.withParam("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
                    buildRoute.withParam("enter_from", "signup");
                    buildRoute.withParam("enter_method", "third_platform");
                    if (C40453FuD.LIZ(bundle) == 1) {
                        z = true;
                    }
                    buildRoute.withParam("should_restart_later", z);
                    buildRoute.withParam("restart_bundle", bundle);
                    buildRoute.withParam("platform_profile", authorizeActivity.LJLJJLL);
                    buildRoute.open();
                    return;
                }
                return;
            default:
                AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) this.LJLILLLLZI;
                C26336AVg c26336AVg = (C26336AVg) this.LJLJI;
                awemeListFragmentImpl.getClass();
                if (c26336AVg.LIZ <= 0) {
                    C56473MEj c56473MEj = awemeListFragmentImpl.LJZ;
                    if (c56473MEj != null) {
                        c56473MEj.LJLJI = false;
                        c56473MEj.LJLJLLL = null;
                        c56473MEj.notifyDataSetChanged();
                    }
                    C56473MEj c56473MEj2 = awemeListFragmentImpl.LJZ;
                    if (c56473MEj2 != null && c56473MEj2.getItemCount() == 0) {
                        awemeListFragmentImpl.LL.setVisibility(4);
                        awemeListFragmentImpl.LLILLIZIL = 0;
                        MFC mfc = awemeListFragmentImpl.LLF;
                        if (mfc != null) {
                            mfc.LIZIZ(awemeListFragmentImpl.LJLL, awemeListFragmentImpl.LJLLILLLL);
                            return;
                        }
                        return;
                    }
                    return;
                }
                awemeListFragmentImpl.Jm(c26336AVg);
                return;
        }
    }

    public /* synthetic */ R6B(LifecycleOwner lifecycleOwner, Object obj, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = obj;
    }
}
