package X;

import androidx.fragment.app.Fragment;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.api.AuthListApi;
import com.ss.android.ugc.aweme.setting.model.AuthAppCountResponse;
import com.ss.android.ugc.aweme.setting.model.CountStruct;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoListFragment;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYD implements InterfaceC73463SsN<BaseResponse> {
    public final /* synthetic */ AuthAppInfoFragment LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
        Object value = this.LJLIL.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        ((C73305Spp) value).setVisibility(8);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(BaseResponse t) {
        boolean z;
        Integer count;
        o.LJIIIZ(t, "t");
        Object value = this.LJLIL.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        ((C73305Spp) value).setVisibility(8);
        JediViewModel jediViewModel = (JediViewModel) this.LJLIL.LJLIL.getValue();
        String clientKey = this.LJLILLLLZI;
        jediViewModel.getClass();
        o.LJIIIZ(clientKey, "clientKey");
        jediViewModel.setState(new AqS29S1000000_4(clientKey, 45));
        AuthListApi.LIZ.getClass();
        AuthAppCountResponse authAppCountResponse = AYE.LIZ().getAuthAppCount().get();
        Keva repo = Keva.getRepo("setting_repo_safe_view");
        CountStruct countStruct = authAppCountResponse.countInfo;
        if (countStruct == null || (count = countStruct.getCount()) == null || count.intValue() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            repo.storeBoolean("authorized_apps_entrance", false);
            ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.onBackPressed();
            }
        } else {
            repo.storeBoolean("authorized_apps_entrance", true);
        }
        if (this.LJLIL.getParentFragment() != null) {
            AuthAppInfoFragment authAppInfoFragment = this.LJLIL;
            if (authAppInfoFragment.getParentFragment() instanceof AuthManagementPage) {
                Fragment parentFragment = authAppInfoFragment.getParentFragment();
                o.LJII(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage");
                AuthManagementPage authManagementPage = (AuthManagementPage) parentFragment;
                AuthAppInfoListFragment authAppInfoListFragment = new AuthAppInfoListFragment();
                authAppInfoListFragment.LJLIL = authManagementPage;
                authManagementPage.Al(authAppInfoListFragment);
            }
        }
    }

    public AYD(AuthAppInfoFragment authAppInfoFragment, String str) {
        this.LJLIL = authAppInfoFragment;
        this.LJLILLLLZI = str;
    }
}
