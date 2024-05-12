package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C29688Bky;
import X.C76800UCe;
import X.InterfaceC88472Yns;

/* loaded from: classes6.dex */
public class AqS10S2000000_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS10S2000000_5 aqS10S2000000_5, Object obj) {
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        it.LIZJ(aqS10S2000000_5.s0, aqS10S2000000_5.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS10S2000000_5 aqS10S2000000_5, Object obj) {
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        it.LIZJ(aqS10S2000000_5.s0, aqS10S2000000_5.s1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S2000000_5(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
