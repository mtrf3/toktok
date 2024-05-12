package Y;

import X.C17N;
import X.C2068389v;
import X.InterfaceC88472Yns;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;

/* loaded from: classes10.dex */
public class AObjectS13S0001000_9 implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public AObjectS13S0001000_9(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AObjectS13S0001000_9 aObjectS13S0001000_9, Object obj) {
        switch (aObjectS13S0001000_9.i0) {
            case 0:
                ((BaseViewModel) obj).config(new AObjectS22S0001000_6(0, 3));
                return null;
            case 1:
                C2068389v c2068389v = (C2068389v) obj;
                c2068389v.LIZJ = C17N.LJIILL(15.0d);
                c2068389v.LIZIZ = C17N.LJIILL(15.0d);
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$75((C2068389v) obj);
        }
    }

    public static final Object invoke$1(AObjectS13S0001000_9 aObjectS13S0001000_9, Object obj) {
        switch (aObjectS13S0001000_9.i0) {
            case 0:
                return Boolean.TRUE;
            default:
                return SettingNewVersionFragment.lambda$initUnits$91((C2068389v) obj);
        }
    }

    public static final Object invoke$2(AObjectS13S0001000_9 aObjectS13S0001000_9, Object obj) {
        switch (aObjectS13S0001000_9.i0) {
            case 0:
                ((BaseViewModel) obj).config(new AObjectS25S0000000_9(1));
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$69((C2068389v) obj);
        }
    }

    public static final Object invoke$3(AObjectS13S0001000_9 aObjectS13S0001000_9, Object obj) {
        switch (aObjectS13S0001000_9.i0) {
            case 0:
                return null;
            case 1:
                ((BaseViewModel) obj).config(new AObjectS21S0001000_5(1, 1));
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$48((C2068389v) obj);
        }
    }
}
