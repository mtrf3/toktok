package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.FYO;
import X.InterfaceC36772Ebw;
import X.InterfaceC88472Yns;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* loaded from: classes7.dex */
public class AqS68S0000000_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;

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
    public AqS68S0000000_6(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0000000_6(String str, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AqS68S0000000_6 aqS68S0000000_6, Object obj) {
        Class it = (Class) obj;
        o.LJIIIZ(it, "it");
        return RetrofitFactory.LIZLLL().LIZ(FYO.LIZ.invoke()).LJFF().LIZ.LIZ(it);
    }

    public static final Object invoke$1(AqS68S0000000_6 aqS68S0000000_6, Object obj) {
        InterfaceC36772Ebw it = (InterfaceC36772Ebw) obj;
        o.LJIIJ(it, "it");
        return Boolean.valueOf(it.LIZ());
    }
}
