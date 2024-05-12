package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0NB;
import X.C76788UBs;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.X1D;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class AqS43S1300000_8 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AqS43S1300000_8 aqS43S1300000_8, Object obj, Object obj2) {
        String value = (String) obj;
        ((Number) obj2).longValue();
        o.LJIIIZ(value, "value");
        if ((!ujb.o.LJJJJJL(value)) && !o.LJ(value, "{}")) {
            ((C76788UBs) aqS43S1300000_8.l1).LIZ(aqS43S1300000_8.s0, (JSONObject) aqS43S1300000_8.l2, (JSONObject) aqS43S1300000_8.l3, false);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("recordId ");
            LIZ.append(aqS43S1300000_8.s0);
            LIZ.append(" is empty");
            C0NB.LJ("LiveLogBaseService", X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS43S1300000_8 aqS43S1300000_8, Object obj, Object obj2) {
        String value = (String) obj;
        ((Number) obj2).longValue();
        o.LJIIIZ(value, "value");
        if ((!ujb.o.LJJJJJL(value)) && !o.LJ(value, "{}")) {
            ((C76788UBs) aqS43S1300000_8.l1).LIZ(aqS43S1300000_8.s0, (JSONObject) aqS43S1300000_8.l2, (JSONObject) aqS43S1300000_8.l3, true);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS43S1300000_8(C76788UBs c76788UBs, String str, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        super(2);
        this.$t = i;
        this.l1 = c76788UBs;
        this.s0 = str;
        this.l2 = jSONObject;
        this.l3 = jSONObject2;
    }
}
