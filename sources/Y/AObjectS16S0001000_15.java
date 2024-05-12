package Y;

import X.AbstractC234519Ih;
import X.C2068389v;
import X.C234529Ii;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;

/* loaded from: classes16.dex */
public class AObjectS16S0001000_15 implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public AObjectS16S0001000_15(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AObjectS16S0001000_15 aObjectS16S0001000_15, Object obj) {
        switch (aObjectS16S0001000_15.i0) {
            case 0:
                return I18nSettingNewVersionFragment.lambda$onCreate$1((BaseActivityViewModel) obj);
            case 1:
                return SettingNewVersionFragment.lambda$initUnits$79((C2068389v) obj);
            default:
                return C76800UCe.LIZ;
        }
    }

    public static final Object invoke$1(AObjectS16S0001000_15 aObjectS16S0001000_15, Object obj) {
        switch (aObjectS16S0001000_15.i0) {
            case 0:
                AbstractC234519Ih abstractC234519Ih = (AbstractC234519Ih) obj;
                if (abstractC234519Ih instanceof C234529Ii) {
                    ((C234529Ii) abstractC234519Ih).LJI = true;
                    return null;
                }
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$24((C2068389v) obj);
        }
    }
}
