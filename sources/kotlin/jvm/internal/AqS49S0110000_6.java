package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C35778E2k;
import X.C35779E2l;
import X.InterfaceC88472Yns;
import android.view.View;
import java.util.Map;

/* loaded from: classes7.dex */
public class AqS49S0110000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS49S0110000_6(View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.z1 = true;
    }

    public static final Object invoke$0(AqS49S0110000_6 aqS49S0110000_6, Object obj) {
        return ((View) aqS49S0110000_6.l0).getDrawingCache(aqS49S0110000_6.z1);
    }

    public static final Object invoke$1(AqS49S0110000_6 aqS49S0110000_6, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C35779E2l(new C35778E2k(aqS49S0110000_6.z1, (Map) aqS49S0110000_6.l0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS49S0110000_6(boolean z, boolean z2, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.z1 = z;
        this.l0 = z2;
    }
}
