package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0YT;
import X.C0YU;
import X.C76800UCe;
import X.EnumC23500w6;
import X.InterfaceC23370vt;
import X.InterfaceC88475Ynv;

/* loaded from: classes.dex */
public class IDqS458S0100000 extends AbstractC65781Prl implements InterfaceC88475Ynv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88475Ynv
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS458S0100000(C0YT c0yt, int i) {
        super(5);
        this.$t = i;
        this.l0 = c0yt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS458S0100000(C0YU c0yu, int i) {
        super(5);
        this.$t = i;
        this.l0 = c0yu;
    }

    public static final Object invoke$0(IDqS458S0100000 iDqS458S0100000, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj).intValue();
        int[] size = (int[]) obj2;
        EnumC23500w6 layoutDirection = (EnumC23500w6) obj3;
        InterfaceC23370vt density = (InterfaceC23370vt) obj4;
        int[] outPosition = (int[]) obj5;
        o.LJIIIZ(size, "size");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        o.LJIIIZ(density, "density");
        o.LJIIIZ(outPosition, "outPosition");
        ((C0YT) iDqS458S0100000.l0).LIZIZ(intValue, density, layoutDirection, size, outPosition);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS458S0100000 iDqS458S0100000, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj).intValue();
        int[] size = (int[]) obj2;
        InterfaceC23370vt density = (InterfaceC23370vt) obj4;
        int[] outPosition = (int[]) obj5;
        o.LJIIIZ(size, "size");
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        o.LJIIIZ(density, "density");
        o.LJIIIZ(outPosition, "outPosition");
        ((C0YU) iDqS458S0100000.l0).LIZJ(density, intValue, size, outPosition);
        return C76800UCe.LIZ;
    }
}
