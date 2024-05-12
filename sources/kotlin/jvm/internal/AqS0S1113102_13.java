package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC07790Sh;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import X.V2K;

/* loaded from: classes14.dex */
public class AqS0S1113102_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public float f7;
    public float f8;
    public int i3;
    public int i4;
    public int i5;
    public long j6;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S1113102_13 aqS0S1113102_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V2K.LIZ(aqS0S1113102_13.i3, aqS0S1113102_13.s0, (InterfaceC07790Sh) aqS0S1113102_13.l1, aqS0S1113102_13.j6, aqS0S1113102_13.f7, aqS0S1113102_13.f8, aqS0S1113102_13.z2, (InterfaceC24520xk) obj, aqS0S1113102_13.i4 | 1, aqS0S1113102_13.i5);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S1113102_13 aqS0S1113102_13, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        V2K.LIZJ(aqS0S1113102_13.i3, aqS0S1113102_13.s0, (InterfaceC07790Sh) aqS0S1113102_13.l1, aqS0S1113102_13.j6, aqS0S1113102_13.f7, aqS0S1113102_13.f8, aqS0S1113102_13.z2, (InterfaceC24520xk) obj, aqS0S1113102_13.i4 | 1, aqS0S1113102_13.i5);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S1113102_13(int i, String str, InterfaceC07790Sh interfaceC07790Sh, long j, float f, float f2, boolean z, int i2, int i3, int i4) {
        super(2);
        this.$t = i4;
        this.i3 = i;
        this.s0 = str;
        this.l1 = interfaceC07790Sh;
        this.j6 = j;
        this.f7 = f;
        this.f8 = f2;
        this.z2 = z;
        this.i4 = i2;
        this.i5 = i3;
    }
}
