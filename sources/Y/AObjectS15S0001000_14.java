package Y;

import X.AbstractC234519Ih;
import X.C2068389v;
import X.C234509Ig;
import X.C25848ACm;
import X.C76917UGr;
import X.C83591WrL;
import X.C83622Wrq;
import X.C83788WuW;
import X.GGS;
import X.GGT;
import X.InterfaceC65784Pro;
import X.InterfaceC83624Wrs;
import X.InterfaceC88472Yns;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.trill.setting.PushSettingActivity;
import java.util.Objects;

/* loaded from: classes15.dex */
public class AObjectS15S0001000_14 implements InterfaceC88472Yns {
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
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public AObjectS15S0001000_14(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AObjectS15S0001000_14 aObjectS15S0001000_14, Object obj) {
        switch (aObjectS15S0001000_14.i0) {
            case 0:
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                ((BaseViewModel) obj).config(new AObjectS55S0101000_10(1, ggt, 1));
                return null;
            case 1:
                return SettingNewVersionFragment.lambda$initUnits$50((C2068389v) obj);
            default:
                return C83622Wrq.L1((Integer) obj);
        }
    }

    public static final Object invoke$1(AObjectS15S0001000_14 aObjectS15S0001000_14, Object obj) {
        switch (aObjectS15S0001000_14.i0) {
            case 0:
                ((BaseViewModel) obj).config(new AObjectS22S0001000_6(1, 2));
                return null;
            case 1:
                return SettingNewVersionFragment.lambda$initUnits$10((C2068389v) obj);
            case 2:
                return C83591WrL.I2((InterfaceC83624Wrs) obj);
            default:
                return PushSettingActivity.LLFII((C25848ACm) obj);
        }
    }

    public static final Object invoke$2(AObjectS15S0001000_14 aObjectS15S0001000_14, Object obj) {
        switch (aObjectS15S0001000_14.i0) {
            case 0:
                return SettingNewVersionFragment.lambda$initUnits$52((C2068389v) obj);
            default:
                return C83622Wrq.Q1((Integer) obj);
        }
    }

    public static final Object invoke$3(AObjectS15S0001000_14 aObjectS15S0001000_14, Object obj) {
        switch (aObjectS15S0001000_14.i0) {
            case 0:
                return Boolean.valueOf(C76917UGr.LJJJJJ((TimeSpeedModelExtension) obj));
            default:
                return PushSettingActivity.LLFII((C25848ACm) obj);
        }
    }

    public static final Object invoke$4(AObjectS15S0001000_14 aObjectS15S0001000_14, Object obj) {
        switch (aObjectS15S0001000_14.i0) {
            case 0:
                BaseViewModel baseViewModel = (BaseViewModel) obj;
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                baseViewModel.config(new AObjectS54S0101000_9(0, ggt, 2));
                baseViewModel.config(new AObjectS22S0001000_6(1, 0));
                baseViewModel.config(new AObjectS22S0001000_6(1, 3));
                return null;
            case 1:
                BaseViewModel baseViewModel2 = (BaseViewModel) obj;
                baseViewModel2.config(new InterfaceC65784Pro() { // from class: X.Ooh
                    @Override // X.InterfaceC65784Pro
                    public final Object invoke() {
                        return new C40106Foc();
                    }
                });
                baseViewModel2.config(new C83788WuW(0));
                return null;
            default:
                GGT ggt2 = GGS.LIZ;
                Objects.requireNonNull(ggt2);
                ((BaseViewModel) obj).config(new AObjectS57S0101000_14(2, ggt2, 1));
                return null;
        }
    }

    public static final Object invoke$5(AObjectS15S0001000_14 aObjectS15S0001000_14, Object obj) {
        switch (aObjectS15S0001000_14.i0) {
            case 0:
                return ((Aweme) obj).getAuthor();
            case 1:
                return SettingNewVersionFragment.lambda$initUnits$73((C2068389v) obj);
            default:
                return PushSettingActivity.LLFII((C25848ACm) obj);
        }
    }

    public static final Object invoke$6(AObjectS15S0001000_14 aObjectS15S0001000_14, Object obj) {
        switch (aObjectS15S0001000_14.i0) {
            case 0:
                BaseViewModel baseViewModel = (BaseViewModel) obj;
                baseViewModel.config(new AObjectS22S0001000_6(3, 0));
                baseViewModel.config(new AObjectS22S0001000_6(3, 3));
                return null;
            default:
                ((C234509Ig) ((AbstractC234519Ih) obj)).LJ = false;
                return null;
        }
    }
}
