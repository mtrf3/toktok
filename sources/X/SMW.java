package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.story.StoryViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SMW extends SN1<StoryViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "share_to_story";
    }

    @Override // X.SN1
    public final String LLIIIILZ() {
        String LLIIIILZ = super.LLIIIILZ();
        if (LLIIIILZ == null) {
            if (C78966Uyw.LJJIJL()) {
                return this.LJLIL.getString(R.string.r6a);
            }
            Integer value = this.LJLL.LJLJI.getValue();
            if (value == null || value.intValue() != 5) {
                return this.LJLIL.getString(R.string.r5n);
            }
            return this.LJLIL.getString(R.string.r5r);
        }
        return LLIIIILZ;
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        if (C78966Uyw.LJJIJL() && i == 5) {
            SMV.LIZ(5);
        }
        super.LLIIIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMW(StoryViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        int i;
        int i2;
        Integer valueOf;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        viewModel.LJLJI.getValue();
        LJLLLLLL(C78966Uyw.LJI(R.string.r63));
        SL4 sl4 = new SL4();
        sl4.LJIILLIIL = 1;
        LLIFFJFJJ(sl4, 1, true);
        if (C78966Uyw.LJJIJL()) {
            i = R.string.jdc;
        } else {
            i = R.string.blo;
        }
        AbstractC71913SKf.LIZJ(sl4, i);
        LJLLLLLL(sl4.LIZ());
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        boolean LJIIZILJ = C72028SOq.LJIIZILJ();
        SL4 sl42 = new SL4();
        sl42.LJIILLIIL = 4;
        LLIFFJFJJ(sl42, 4, true);
        if (LJIIZILJ) {
            i2 = R.string.gnw;
        } else {
            i2 = R.string.jbq;
        }
        AbstractC71913SKf.LIZJ(sl42, i2);
        if (LJIIZILJ) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(R.string.gna);
        }
        sl42.LJ = valueOf;
        LJLLLLLL(sl42.LIZ());
        SL4 sl43 = new SL4();
        sl43.LJIILLIIL = 5;
        LLIFFJFJJ(sl43, 5, false);
        AbstractC71913SKf.LIZJ(sl43, R.string.p9a);
        LJLLLLLL(sl43.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(lifecycleOwner, this, 34));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, viewModel, 35));
    }
}
