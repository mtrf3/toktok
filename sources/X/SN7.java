package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.likedlist.LikedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SN7 extends SN1<LikedListViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "favorite";
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        C72028SOq.LJIIJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SN7(LikedListViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        int i;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        LJLLLLLL(C78966Uyw.LJI(R.string.p9j));
        SL4 sl4 = new SL4();
        sl4.LJIILLIIL = 0;
        LLIFFJFJJ(sl4, 0, false);
        if (C78966Uyw.LJJIJL()) {
            i = R.string.jdc;
        } else {
            i = R.string.blo;
        }
        AbstractC71913SKf.LIZJ(sl4, i);
        LJLLLLLL(sl4.LIZ());
        SL4 sl42 = new SL4();
        sl42.LJIILLIIL = 1;
        LLIFFJFJJ(sl42, 1, false);
        AbstractC71913SKf.LIZJ(sl42, R.string.p9a);
        LJLLLLLL(sl42.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 55));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 56));
    }
}
