package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC07790Sh;
import X.InterfaceC24520xk;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.V5H;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes2.dex */
public class AqS2S0302000_1 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S0302000_1 aqS2S0302000_1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V5H.LIZ((Aweme) aqS2S0302000_1.l0, (InterfaceC07790Sh) aqS2S0302000_1.l1, (InterfaceC65784Pro) aqS2S0302000_1.l2, (InterfaceC24520xk) obj, aqS2S0302000_1.i3 | 1, aqS2S0302000_1.i4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S0302000_1 aqS2S0302000_1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V5H.LIZIZ((Aweme) aqS2S0302000_1.l0, (InterfaceC07790Sh) aqS2S0302000_1.l1, (InterfaceC65784Pro) aqS2S0302000_1.l2, (InterfaceC24520xk) obj, aqS2S0302000_1.i3 | 1, aqS2S0302000_1.i4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS2S0302000_1 aqS2S0302000_1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V5H.LIZIZ((Aweme) aqS2S0302000_1.l0, (InterfaceC07790Sh) aqS2S0302000_1.l1, (InterfaceC65784Pro) aqS2S0302000_1.l2, (InterfaceC24520xk) obj, aqS2S0302000_1.i3 | 1, aqS2S0302000_1.i4);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS2S0302000_1(Aweme aweme, Aweme aweme2, InterfaceC07790Sh interfaceC07790Sh, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = aweme;
        this.l1 = aweme2;
        this.l2 = interfaceC07790Sh;
        this.i3 = interfaceC65784Pro;
        this.i4 = i;
    }
}
