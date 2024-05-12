package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.suggestaccount.SugToInterestedUsersViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SOR extends AbstractC71950SLq {
    @Override // X.SN1
    public final String LLIIII() {
        return "sug_to_interested_users";
    }

    @Override // X.AbstractC71950SLq
    public final String LLIIIZ() {
        return "like_account";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SOR(SugToInterestedUsersViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        SL3 sl3 = new SL3();
        sl3.LJIILLIIL = 1;
        sl3.LJIIZILJ = 2;
        SN1.LLFZ(this, sl3);
        AbstractC71913SKf.LIZJ(sl3, R.string.jdi);
        sl3.LJ = Integer.valueOf(R.string.jdj);
        LJLLLLLL(sl3.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 79));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 80));
    }
}
