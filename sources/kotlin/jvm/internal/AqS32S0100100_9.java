package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C35908E7k;
import X.C56569MIb;
import X.C58620MzY;
import X.C76800UCe;
import X.C85299Xdn;
import X.EnumC56571MId;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.os.Build;

/* loaded from: classes10.dex */
public class AqS32S0100100_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final Object invoke$0(AqS32S0100100_9 aqS32S0100100_9, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS32S0100100_9.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C85299Xdn.LIZ(System.currentTimeMillis() - aqS32S0100100_9.j1, true);
        if (Build.VERSION.SDK_INT < 23) {
            C35908E7k.LIZIZ().storeBoolean("key_has_pre_popup_deny_location", true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS32S0100100_9 aqS32S0100100_9, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS32S0100100_9.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C85299Xdn.LIZ(System.currentTimeMillis() - aqS32S0100100_9.j1, false);
        if (Build.VERSION.SDK_INT < 23) {
            C35908E7k.LIZIZ().storeBoolean("key_has_pre_popup_deny_location", false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS32S0100100_9 aqS32S0100100_9, Object obj) {
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        C56569MIb.LIZ.getClass();
        log.LJII(C56569MIb.LJIIL, (EnumC56571MId) aqS32S0100100_9.l0);
        log.LJII(C56569MIb.LJIILJJIL, Long.valueOf(aqS32S0100100_9.j1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S0100100_9(EnumC56571MId enumC56571MId, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC56571MId;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0000: IPUT (r6 I:int), (r2 I:kotlin.jvm.internal.AqS32S0100100_9) (LINE:50397184) kotlin.jvm.internal.AqS32S0100100_9.$t int, block:B:1:0x0000 */
    public AqS32S0100100_9(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, long j) {
        super(1);
        int i;
        this.$t = i;
        this.l0 = interfaceC65784Pro;
        this.j1 = interfaceC65784Pro2;
    }
}
