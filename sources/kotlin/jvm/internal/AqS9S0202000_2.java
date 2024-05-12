package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import X.X1D;
import defpackage.b0;

/* loaded from: classes3.dex */
public class AqS9S0202000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS9S0202000_2 aqS9S0202000_2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("input size: (");
        LIZ.append(((int[]) aqS9S0202000_2.l0)[0]);
        LIZ.append(", ");
        LIZ.append(((int[]) aqS9S0202000_2.l0)[1]);
        LIZ.append("), output size: (");
        LIZ.append(((int[]) aqS9S0202000_2.l1)[0]);
        LIZ.append(", ");
        LIZ.append(((int[]) aqS9S0202000_2.l1)[1]);
        LIZ.append("), display size: (");
        LIZ.append(aqS9S0202000_2.i2);
        LIZ.append(", ");
        return b0.LIZJ(LIZ, aqS9S0202000_2.i3, ')', LIZ);
    }

    public static final Object invoke$1(AqS9S0202000_2 aqS9S0202000_2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("input size: (");
        LIZ.append(((int[]) aqS9S0202000_2.l0)[0]);
        LIZ.append(", ");
        LIZ.append(((int[]) aqS9S0202000_2.l0)[1]);
        LIZ.append("), output size: (");
        LIZ.append(((int[]) aqS9S0202000_2.l1)[0]);
        LIZ.append(", ");
        LIZ.append(((int[]) aqS9S0202000_2.l1)[1]);
        LIZ.append("), display size: (");
        LIZ.append(aqS9S0202000_2.i2);
        LIZ.append(", ");
        return b0.LIZJ(LIZ, aqS9S0202000_2.i3, ')', LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S0202000_2(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = iArr;
        this.l1 = iArr2;
        this.i2 = i;
        this.i3 = i2;
    }
}
