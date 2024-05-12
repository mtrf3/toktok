package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.sticker.StickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SMZ extends SN1<StickerViewModel> {
    public Integer LJLLJ;

    @Override // X.SN1
    public final String LLIIII() {
        return "create_sticker";
    }

    @Override // X.SN1
    public final String LLIIIILZ() {
        String LLIIIILZ = super.LLIIIILZ();
        if (LLIIIILZ == null) {
            if (C78966Uyw.LJJIJL()) {
                return this.LJLIL.getString(R.string.tla);
            }
            return null;
        }
        return LLIIIILZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMZ(StickerViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        int i;
        int i2;
        Integer valueOf;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLJ = viewModel.LJLJI.getValue();
        LJLLLLLL(C78966Uyw.LJI(R.string.tlg));
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
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 1066);
        C71909SKb c71909SKb = C71909SKb.LIZ;
        c71909SKb.getClass();
        LJLLLLLL(C71909SKb.LIZLLL().LJFF(aqS162S0100000_12, null, R.string.tlh, 0, 0));
        c71909SKb.getClass();
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
        AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(this, 1067);
        c71909SKb.getClass();
        LJLLLLLL(C71909SKb.LIZLLL().LJFF(aqS162S0100000_122, null, R.string.tlh, 0, 0));
        SL4 sl43 = new SL4();
        sl43.LJIILLIIL = 5;
        LLIFFJFJJ(sl43, 5, false);
        AbstractC71913SKf.LIZJ(sl43, R.string.jdf);
        sl43.LJI = new AqS159S0200000_12(this, context, 59);
        LJLLLLLL(sl43.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(lifecycleOwner, this, 28));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, viewModel, 29));
    }
}
