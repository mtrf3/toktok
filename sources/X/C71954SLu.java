package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.profileviews.ProfileViewHistorySettingViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SLu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71954SLu extends SN1<ProfileViewHistorySettingViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "profile_view_history";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71954SLu(ProfileViewHistorySettingViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        SL3 sl3 = new SL3();
        sl3.LJIILLIIL = 1;
        sl3.LJIIZILJ = 2;
        LLIFFJFJJ(sl3, 1, false);
        AbstractC71913SKf.LIZJ(sl3, R.string.pgv);
        sl3.LJ = Integer.valueOf(R.string.pgx);
        LJLLLLLL(sl3.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 63));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 64));
    }
}
