package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS110S0101000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SOt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC72031SOt<VM extends BaseVideoPrivacySettingViewModel> extends SLJ {
    public final VM LJLL;
    public final PrivacySettingsRestrictionItem LJLLI;
    public final SKL LJLLILLLL;

    public boolean LLFZ() {
        return true;
    }

    public boolean LLIFFJFJJ() {
        return true;
    }

    public int LLIIII() {
        return 0;
    }

    public int LLIIIILZ() {
        return 0;
    }

    public boolean LLIIIJ(int i) {
        return false;
    }

    @Override // X.SLJ
    public final boolean LL() {
        if (SN3.LIZJ(this.LJLLI).LIZIZ && LLIFFJFJJ()) {
            return true;
        }
        return false;
    }

    public void LLIIIL(int i) {
        this.LJLL.lv0(i);
    }

    public boolean LLIIIZ(int i) {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = this.LJLLI;
        if (privacySettingsRestrictionItem != null) {
            int resType = privacySettingsRestrictionItem.getResType();
            if (resType != 1) {
                if (resType != 2) {
                    if (resType != 3) {
                        if (resType == 1000) {
                            LLIIJI(LLIIII());
                            return true;
                        }
                    } else {
                        LLIIJI(LLIIIILZ());
                        return true;
                    }
                } else {
                    LLIIJI(R.string.g9h);
                    return true;
                }
            } else {
                LLIIJI(R.string.quk);
                return true;
            }
        }
        return false;
    }

    public final void LLIIJI(int i) {
        if (i == 0) {
            return;
        }
        this.LJLLILLLL.LIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC72031SOt(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, VM viewModel, Fragment fragment) {
        super(new C25600zU(fragment.getContext(), R.style.kp));
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(fragment, "fragment");
        this.LJLL = viewModel;
        this.LJLLI = privacySettingsRestrictionItem;
        this.LJLLILLLL = new SKL(fragment);
    }

    public final void LLII(SL3 sl3, int i, int i2) {
        sl3.LJIIJJI = true;
        sl3.LJIILLIIL = i;
        sl3.LJIIZILJ = i2;
        sl3.LJ(this.LJLL);
        sl3.LJIIIZ = new AqS110S0101000_12(this, (AbstractC72031SOt<BaseVideoPrivacySettingViewModel>) i, 7);
        sl3.LJIIJ = new C53392KxQ(this);
        sl3.LJIIIIZZ = new L44(this);
        sl3.LJII = new C72033SOv(this);
    }
}
