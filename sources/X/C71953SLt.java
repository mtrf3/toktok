package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.ativitystatus.ActivityStatusPrivacyViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SLt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71953SLt extends SN1<ActivityStatusPrivacyViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "activity_status";
    }

    @Override // X.SN1, X.SLJ
    public final boolean LL() {
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ().getClass();
        if (C107454Jp.LIZ() && super.LL()) {
            return true;
        }
        return false;
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        C72028SOq.LJIILLIIL(i);
        super.LLIIIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71953SLt(ActivityStatusPrivacyViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
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
        AbstractC71913SKf.LIZJ(sl3, R.string.b7t);
        sl3.LJ = Integer.valueOf(R.string.b7u);
        LJLLLLLL(sl3.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 109));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 110));
    }
}
