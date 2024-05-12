package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.following.FollowingVisibilityViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SMD extends SN1<FollowingVisibilityViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "following_visibility";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMD(FollowingVisibilityViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        int i;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        LJLLLLLL(C78966Uyw.LJI(R.string.p9r));
        SL4 sl4 = new SL4();
        sl4.LJIILLIIL = 1;
        LLIFFJFJJ(sl4, 1, false);
        if (C78966Uyw.LJJIJL()) {
            i = R.string.p9p;
        } else {
            i = R.string.p9o;
        }
        AbstractC71913SKf.LIZJ(sl4, i);
        LJLLLLLL(sl4.LIZ());
        SL4 sl42 = new SL4();
        sl42.LJIILLIIL = 2;
        LLIFFJFJJ(sl42, 2, false);
        AbstractC71913SKf.LIZJ(sl42, R.string.p9q);
        sl42.LJ = Integer.valueOf(R.string.p9n);
        LJLLLLLL(sl42.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 47));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 48));
    }
}
