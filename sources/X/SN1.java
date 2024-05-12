package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS110S0101000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class SN1<VM extends BasePrivacySettingViewModel> extends SLJ {
    public final VM LJLL;
    public final SKL LJLLI;
    public final C62822Ol8 LJLLILLLL;

    public abstract String LLIIII();

    public boolean LLIIIJ(int i) {
        return false;
    }

    public final PrivacySettingsRestrictionItem LLII() {
        return (PrivacySettingsRestrictionItem) this.LJLLILLLL.getValue();
    }

    @Override // X.SLJ
    public boolean LL() {
        return SN3.LIZJ(LLII()).LIZIZ;
    }

    public String LLIIIILZ() {
        Integer valueOf;
        PrivacySettingsRestrictionItem LLII = LLII();
        if (LLII == null || (valueOf = Integer.valueOf(LLII.getTipsType())) == null || valueOf.intValue() != 1) {
            return null;
        }
        return this.LJLIL.getString(R.string.quk);
    }

    public void LLIIIL(int i) {
        this.LJLL.lv0(i);
    }

    public static void LLFZ(SN1 sn1, SL3 sl3) {
        sn1.getClass();
        sl3.LJ(sn1.LJLL);
        sl3.LJIIIZ = new AqS162S0100000_12(sn1, (SN1<BasePrivacySettingViewModel>) 1141);
        sl3.LJIIJ = new C53394KxS(sn1);
        sl3.LJIIIIZZ = new C53400KxY(sn1);
        sl3.LJII = new SN2(sn1, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SN1(VM viewModel, Context context, SKL toastHolder) {
        super(context);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLL = viewModel;
        this.LJLLI = toastHolder;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, (SN1<BasePrivacySettingViewModel>) 1142));
    }

    public final AbstractC71913SKf LLIFFJFJJ(AbstractC71913SKf abstractC71913SKf, int i, boolean z) {
        ((AbstractC71933SKz) abstractC71913SKf).LJ(this.LJLL);
        abstractC71913SKf.LJIIIZ = new AqS110S0101000_12(this, i, 5);
        abstractC71913SKf.LJIIJ = new C53395KxT(this);
        abstractC71913SKf.LJIIIIZZ = new C53399KxX(this);
        abstractC71913SKf.LJII = new SN4(this, i, z);
        return abstractC71913SKf;
    }
}
