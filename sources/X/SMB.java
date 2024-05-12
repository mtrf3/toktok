package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.tagmention.tag.TagViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SMB extends SN1<TagViewModel> {
    public final boolean LJLLJ;

    @Override // X.SN1
    public final String LLIIII() {
        return "tag";
    }

    @Override // X.SN1, X.SLJ
    public final boolean LL() {
        if (this.LJLLJ && super.LL()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMB(TagViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        boolean z;
        int i;
        Integer valueOf;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        Bundle bundle = configs.extraData;
        if (bundle != null) {
            z = bundle.getBoolean("hasVideoTag", false);
        } else {
            z = false;
        }
        this.LJLLJ = z;
        LJLLLLLL(C78966Uyw.LJI(R.string.r2i));
        SL4 sl4 = new SL4();
        sl4.LJIILLIIL = 1;
        LLIFFJFJJ(sl4, 1, false);
        AbstractC71913SKf.LIZJ(sl4, R.string.blo);
        LJLLLLLL(sl4.LIZ());
        SL4 sl42 = new SL4();
        sl42.LJIILLIIL = 3;
        LLIFFJFJJ(sl42, 3, false);
        AbstractC71913SKf.LIZJ(sl42, R.string.gkz);
        LJLLLLLL(sl42.LIZ());
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        boolean LJIIZILJ = C72028SOq.LJIIZILJ();
        SL4 sl43 = new SL4();
        sl43.LJIILLIIL = 4;
        LLIFFJFJJ(sl43, 4, false);
        if (LJIIZILJ) {
            i = R.string.gnw;
        } else {
            i = R.string.jbq;
        }
        AbstractC71913SKf.LIZJ(sl43, i);
        if (LJIIZILJ) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(R.string.gna);
        }
        sl43.LJ = valueOf;
        LJLLLLLL(sl43.LIZ());
        SL4 sl44 = new SL4();
        sl44.LJIILLIIL = 5;
        LLIFFJFJJ(sl44, 5, false);
        AbstractC71913SKf.LIZJ(sl44, R.string.p9_);
        LJLLLLLL(sl44.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 95));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 96));
    }
}
