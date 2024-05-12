package Y;

import X.C76800UCe;
import X.InterfaceC29879Bo3;
import X.InterfaceC51158K5y;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;

/* loaded from: classes9.dex */
public class AObjectS146S0100000_8 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;

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

    public AObjectS146S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS146S0100000_8 aObjectS146S0100000_8, Object obj) {
        ((InterfaceC29879Bo3) aObjectS146S0100000_8.l0).invoke(obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS146S0100000_8 aObjectS146S0100000_8, Object obj) {
        ((BaseDiscoverAndSearchFragmentNew) aObjectS146S0100000_8.l0).LLIIIL = (InterfaceC51158K5y) obj;
        return null;
    }

    public static final Object invoke$2(AObjectS146S0100000_8 aObjectS146S0100000_8, Object obj) {
        ((BaseDiscoverAndSearchFragmentNew) aObjectS146S0100000_8.l0).LLIIIZ = (InterfaceC51158K5y) obj;
        return null;
    }

    public static final Object invoke$3(AObjectS146S0100000_8 aObjectS146S0100000_8, Object obj) {
        ((EcBaseDiscoverAndSearchFragmentNew) aObjectS146S0100000_8.l0).LLFII = (InterfaceC51158K5y) obj;
        return null;
    }
}
