package Y;

import X.AbstractC49325JXl;
import X.C2068389v;
import X.C76800UCe;
import X.GGS;
import X.GGT;
import X.I9D;
import X.InterfaceC88472Yns;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* loaded from: classes8.dex */
public class AObjectS12S0001000_7 implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public AObjectS12S0001000_7(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AObjectS12S0001000_7 aObjectS12S0001000_7, Object obj) {
        switch (aObjectS12S0001000_7.i0) {
            case 0:
                AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) obj;
                if (abstractC49325JXl == null || abstractC49325JXl.getAweme() == null) {
                    return null;
                }
                return abstractC49325JXl.getAweme().getAuthor();
            default:
                BaseViewModel baseViewModel = (BaseViewModel) obj;
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                baseViewModel.config(new AObjectS136S0100000_7(ggt, 2));
                baseViewModel.config(new I9D(2));
                return null;
        }
    }

    public static final Object invoke$1(AObjectS12S0001000_7 aObjectS12S0001000_7, Object obj) {
        switch (aObjectS12S0001000_7.i0) {
            case 0:
                return C76800UCe.LIZ;
            case 1:
                BaseViewModel baseViewModel = (BaseViewModel) obj;
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                baseViewModel.config(new AObjectS52S0101000_7(0, ggt, 13));
                baseViewModel.config(new AObjectS24S0000000_7(2));
                return null;
            case 2:
                return SettingNewVersionFragment.lambda$initUnits$89((C2068389v) obj);
            default:
                GGT ggt2 = GGS.LIZ;
                Objects.requireNonNull(ggt2);
                ((BaseViewModel) obj).config(new AObjectS136S0100000_7(ggt2, 13));
                return null;
        }
    }

    public static final Object invoke$2(AObjectS12S0001000_7 aObjectS12S0001000_7, Object obj) {
        switch (aObjectS12S0001000_7.i0) {
            case 0:
                BaseViewModel baseViewModel = (BaseViewModel) obj;
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                baseViewModel.config(new AObjectS52S0101000_7(0, ggt, 20));
                baseViewModel.config(new AObjectS22S0001000_6(1, 6));
                return null;
            case 1:
                return SettingNewVersionFragment.lambda$initUnits$105((C2068389v) obj);
            default:
                return SettingNewVersionFragment.lambda$initUnits$12((C2068389v) obj);
        }
    }

    public static final Object invoke$3(AObjectS12S0001000_7 aObjectS12S0001000_7, Object obj) {
        switch (aObjectS12S0001000_7.i0) {
            case 0:
                ((C2068389v) obj).LIZ = R.raw.icon_color_heart_motion;
                return null;
            case 1:
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                ((BaseViewModel) obj).config(new AObjectS54S0101000_9(1, ggt, 1));
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$16((C2068389v) obj);
        }
    }

    public static final Object invoke$4(AObjectS12S0001000_7 aObjectS12S0001000_7, Object obj) {
        switch (aObjectS12S0001000_7.i0) {
            case 0:
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                ((BaseViewModel) obj).config(new AObjectS47S0101000_2(0, ggt, 6));
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$54((C2068389v) obj);
        }
    }

    public static final Object invoke$5(AObjectS12S0001000_7 aObjectS12S0001000_7, Object obj) {
        switch (aObjectS12S0001000_7.i0) {
            case 0:
                BaseViewModel baseViewModel = (BaseViewModel) obj;
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                baseViewModel.config(new AObjectS136S0100000_7(ggt, 14));
                baseViewModel.config(new AObjectS22S0001000_6(0, 11));
                return null;
            case 1:
                ((C2068389v) obj).LIZ = R.raw.icon_arrow_up_left_ltr;
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$93((C2068389v) obj);
        }
    }
}
