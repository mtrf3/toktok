package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.InteractionVideoCount;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.VideoCount;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.stitch.StitchViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SMY extends SN1<StitchViewModel> {
    public Integer LJLLJ;

    @Override // X.SN1
    public final String LLIIII() {
        return "stitch";
    }

    @Override // X.SN1
    public final String LLIIIILZ() {
        String LLIIIILZ = super.LLIIIILZ();
        if (LLIIIILZ == null) {
            if (C78966Uyw.LJJIJL()) {
                return this.LJLIL.getString(R.string.h1c);
            }
            return null;
        }
        return LLIIIILZ;
    }

    public static final SKZ LLIIIZ(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        VideoCount videoCount;
        C71909SKb.LIZ.getClass();
        SKK LIZLLL = C71909SKb.LIZLLL();
        C72041SPd.LIZ.getClass();
        InteractionVideoCount LIZLLL2 = C72041SPd.LIZLLL();
        if (LIZLLL2 != null) {
            videoCount = LIZLLL2.stitch;
        } else {
            videoCount = null;
        }
        return LIZLLL.LJFF(interfaceC65784Pro, videoCount, R.string.b62, R.plurals.ak, R.plurals.al);
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        if (C78966Uyw.LJJIJL() && i == 3) {
            SMU.LIZIZ(3, 3, ((StitchViewModel) this.LJLL).LJLJL);
        }
        super.LLIIIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMY(StitchViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
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
        LJLLLLLL(C78966Uyw.LJI(R.string.r1j));
        SL4 sl4 = new SL4();
        sl4.LJIILLIIL = 0;
        LLIFFJFJJ(sl4, 0, true);
        if (C78966Uyw.LJJIJL()) {
            i = R.string.jdc;
        } else {
            i = R.string.blo;
        }
        AbstractC71913SKf.LIZJ(sl4, i);
        LJLLLLLL(sl4.LIZ());
        LJLLLLLL(LLIIIZ(new AqS162S0100000_12(this, 1083)));
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        boolean LJIIZILJ = C72028SOq.LJIIZILJ();
        SL4 sl42 = new SL4();
        sl42.LJIILLIIL = 1;
        LLIFFJFJJ(sl42, 1, true);
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
        LJLLLLLL(LLIIIZ(new AqS162S0100000_12(this, 1084)));
        SL4 sl43 = new SL4();
        sl43.LJIILLIIL = 3;
        LLIFFJFJJ(sl43, 3, false);
        AbstractC71913SKf.LIZJ(sl43, R.string.jdf);
        sl43.LJI = new AqS159S0200000_12(this, context, 61);
        LJLLLLLL(sl43.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(lifecycleOwner, this, 31));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, viewModel, 32));
    }
}
