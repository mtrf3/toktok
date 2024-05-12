package Y;

import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;

/* loaded from: classes9.dex */
public class AObjectS137S0100000_8 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS137S0100000_8 aObjectS137S0100000_8) {
        return Integer.valueOf(((EcAbstractSearchIntermediateFragmentNew) aObjectS137S0100000_8.l0).Hl());
    }

    public static final Object invoke$1(AObjectS137S0100000_8 aObjectS137S0100000_8) {
        return Integer.valueOf(((AbstractSearchIntermediateFragmentNew) aObjectS137S0100000_8.l0).Dl());
    }

    public static final Object invoke$2(AObjectS137S0100000_8 aObjectS137S0100000_8) {
        return ((TTEPEffectPreviewActivity) aObjectS137S0100000_8.l0).LLIIJI;
    }

    public AObjectS137S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
