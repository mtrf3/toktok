package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.following.FollowingVisibilityViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SM5 extends AbstractC71980SMu {
    public final FollowingVisibilityViewModel LJLLILLLL;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "following_visibility";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=following_list_sheet").open();
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "privacy_setting");
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "newBuilder()\n           …ivacy_setting\").builder()", LIZ, "click_following_list_setting", map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SM5(FollowingVisibilityViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        sk9.LJIILIIL = new SM6(this);
        AbstractC71913SKf.LIZJ(sk9, R.string.p9m);
        sk9.LIZIZ(R.raw.icon_two_person_fill);
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 22));
    }
}
