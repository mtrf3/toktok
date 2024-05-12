package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.downloads.DownloadsViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SNE extends SN1<DownloadsViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "download";
    }

    @Override // X.SN1
    public final String LLIIIILZ() {
        String LLIIIILZ = super.LLIIIILZ();
        if (LLIIIILZ == null) {
            if (C78966Uyw.LJJIJL()) {
                return this.LJLIL.getString(R.string.h14);
            }
            return null;
        }
        return LLIIIILZ;
    }

    @Override // X.SN1
    public final boolean LLIIIJ(int i) {
        if (i != 3) {
            C72041SPd.LIZ.getClass();
            PrivacySettingsAgreementRecord LIZIZ = C72041SPd.LIZIZ("download_setting_change_young");
            if (LIZIZ != null && LIZIZ.status == 1) {
                C26227ARb c26227ARb = new C26227ARb(this.LJLIL);
                c26227ARb.LJ(R.string.ey9);
                c26227ARb.LIZ(R.string.ey8);
                UC0.LIZJ(c26227ARb, new AqS99S0101000_12(this, i, 1));
                c26227ARb.LJI().LIZLLL();
                C72043SPf.LIZJ("download_setting_change_young");
                C72039SPb.LJFF(2, "download_setting_change_young");
                return true;
            }
        }
        return false;
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        if (C78966Uyw.LJJIJL()) {
            C71948SLo.LIZ(3);
        }
        super.LLIIIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SNE(DownloadsViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        SL3 sl3 = new SL3();
        sl3.LJIILLIIL = 0;
        sl3.LJIIZILJ = 3;
        LLIFFJFJJ(sl3, 0, true);
        AbstractC71913SKf.LIZJ(sl3, R.string.eya);
        sl3.LJ = Integer.valueOf(R.string.ey_);
        LJLLLLLL(sl3.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 13));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 14));
    }
}
