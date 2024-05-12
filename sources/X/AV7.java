package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.viewmodel.MainActivityProfileSwitchAccountViewModel;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class AV7 implements R4B {
    public final /* synthetic */ AVB LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.R4B
    public final void onSuccess() {
        this.LJLIL.LIZ();
        ((MainActivityProfileSwitchAccountViewModel) ViewModelProviders.of(this.LJLIL.LJLJJI).get(MainActivityProfileSwitchAccountViewModel.class)).LJLIL = true;
        UserProfilePreloadHelper.LJIIIIZZ().clearCache();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLIL.LJLJJL.LIZ);
        c188727au.LJIIIZ("enter_method", this.LJLIL.LJLJJL.LIZIZ);
        c188727au.LJIIIZ("channel", this.LJLIL.LJLJJL.LIZJ);
        c188727au.LJIIIZ("from_uid", this.LJLILLLLZI);
        c188727au.LJIIIZ("target_uid", this.LJLJI);
        c188727au.LIZLLL(1, "status");
        FMX.LJIIL("switch_account_result", c188727au.LIZ);
    }

    @Override // X.R4B
    public final void LIZJ(Integer num, String str) {
        Activity LJIIIIZZ;
        this.LJLIL.LIZ();
        int i = -1;
        if ((num == null || num.intValue() != 1349) && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null) {
            if (num != null && num.intValue() > 0 && str != null && !TextUtils.isEmpty(str)) {
                C5S1 c5s1 = new C5S1(LJIIIIZZ);
                c5s1.LIZLLL(str);
                c5s1.LJ();
            } else if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
                C25678A5y.LIZJ(LJIIIIZZ, "personal_homepage", null, null, 12);
            } else {
                C5S1 c5s12 = new C5S1(LJIIIIZZ);
                c5s12.LIZJ(R.string.g5w);
                c5s12.LJ();
            }
        }
        C188727au LIZJ = C78920UyC.LIZJ(0, "status");
        if (num != null) {
            i = num.intValue();
        }
        LIZJ.LIZLLL(i, "fail_info");
        LIZJ.LJIIIZ("sdk_name", this.LJLIL.LJLJJL.LIZLLL);
        LIZJ.LJIIIZ("sdk_version", this.LJLIL.LJLJJL.LJ);
        FMX.LJIIL("switch_account_result", LIZJ.LIZ);
    }

    public AV7(AVB avb, String str, String str2) {
        this.LJLIL = avb;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
