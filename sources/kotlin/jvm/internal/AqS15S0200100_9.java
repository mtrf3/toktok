package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C225248si;
import X.C76800UCe;
import X.EnumC54527Lad;
import X.InterfaceC88472Yns;
import android.os.SystemClock;

/* loaded from: classes10.dex */
public class AqS15S0200100_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS15S0200100_9 aqS15S0200100_9, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        C225248si.LJJII(it, SystemClock.elapsedRealtime() - aqS15S0200100_9.j2, ((EnumC54527Lad) aqS15S0200100_9.l0).getScene(), true, false);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS15S0200100_9.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(it);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS15S0200100_9 aqS15S0200100_9, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        C225248si.LJJII(it, SystemClock.elapsedRealtime() - aqS15S0200100_9.j2, ((EnumC54527Lad) aqS15S0200100_9.l0).getScene(), false, true);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS15S0200100_9.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(it);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS15S0200100_9 aqS15S0200100_9, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        C225248si.LJJII(it, SystemClock.elapsedRealtime() - aqS15S0200100_9.j2, ((EnumC54527Lad) aqS15S0200100_9.l0).getScene(), false, false);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS15S0200100_9.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(it);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AqS15S0200100_9) (LINE:67108867) kotlin.jvm.internal.AqS15S0200100_9.j2 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AqS15S0200100_9) (LINE:67108869) kotlin.jvm.internal.AqS15S0200100_9.l0 java.lang.Object, block:B:1:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.AqS15S0200100_9, X.Prl] */
    public AqS15S0200100_9(long j, long j2, EnumC54527Lad enumC54527Lad, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        long j3;
        Object obj;
        r2.$t = interfaceC88472Yns;
        r2.j2 = j3;
        r2.l0 = obj;
        r2.l1 = enumC54527Lad;
        ?? abstractC65781Prl = new AbstractC65781Prl(1);
    }
}
