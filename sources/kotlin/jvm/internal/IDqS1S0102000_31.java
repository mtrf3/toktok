package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C91746Zza;
import X.C91747Zzb;
import X.C92008a3o;
import X.C92010a3q;
import X.C92013a3t;
import X.C92056a4a;
import X.InterfaceC07790Sh;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import java.util.List;

/* loaded from: classes20.dex */
public class IDqS1S0102000_31 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS1S0102000_31 iDqS1S0102000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C91747Zzb.LIZ((List) iDqS1S0102000_31.l0, (InterfaceC24520xk) obj, iDqS1S0102000_31.i1 | 1, iDqS1S0102000_31.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS1S0102000_31 iDqS1S0102000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C91746Zza.LIZ((InterfaceC07790Sh) iDqS1S0102000_31.l0, (InterfaceC24520xk) obj, iDqS1S0102000_31.i1 | 1, iDqS1S0102000_31.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS1S0102000_31 iDqS1S0102000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92008a3o.LIZ((InterfaceC07790Sh) iDqS1S0102000_31.l0, (InterfaceC24520xk) obj, iDqS1S0102000_31.i1 | 1, iDqS1S0102000_31.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS1S0102000_31 iDqS1S0102000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92010a3q.LIZ((InterfaceC07790Sh) iDqS1S0102000_31.l0, (InterfaceC24520xk) obj, iDqS1S0102000_31.i1 | 1, iDqS1S0102000_31.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS1S0102000_31 iDqS1S0102000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92013a3t.LIZ((InterfaceC07790Sh) iDqS1S0102000_31.l0, (InterfaceC24520xk) obj, iDqS1S0102000_31.i1 | 1, iDqS1S0102000_31.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS1S0102000_31 iDqS1S0102000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92056a4a.LIZ((InterfaceC07790Sh) iDqS1S0102000_31.l0, (InterfaceC24520xk) obj, iDqS1S0102000_31.i1 | 1, iDqS1S0102000_31.i2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS1S0102000_31(InterfaceC07790Sh interfaceC07790Sh, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = interfaceC07790Sh;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS1S0102000_31(List list, List<String> list2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = list;
        this.i1 = list2;
        this.i2 = i;
    }
}
