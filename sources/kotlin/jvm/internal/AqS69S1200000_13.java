package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.U15;
import X.U18;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class AqS69S1200000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AqS69S1200000_13 aqS69S1200000_13, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            HashMap<String, Boolean> hashMap = ((U15) aqS69S1200000_13.l1).LJLJJL;
            String str = aqS69S1200000_13.s0;
            Boolean bool = Boolean.TRUE;
            hashMap.put(str, bool);
            ((InterfaceC88472Yns) aqS69S1200000_13.l2).invoke(bool);
        } else {
            ((InterfaceC88472Yns) aqS69S1200000_13.l2).invoke(Boolean.FALSE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS69S1200000_13 aqS69S1200000_13, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            ((U18) aqS69S1200000_13.l1).LJLILLLLZI.put(aqS69S1200000_13.s0, Boolean.TRUE);
            ((InterfaceC65784Pro) aqS69S1200000_13.l2).invoke();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS69S1200000_13(U15 u15, U15 u152, String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(2);
        this.$t = interfaceC88472Yns;
        this.l1 = u15;
        this.s0 = u152;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS69S1200000_13(U18 u18, U18 u182, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        this.$t = interfaceC65784Pro;
        this.l1 = u18;
        this.s0 = u182;
        this.l2 = str;
    }
}
