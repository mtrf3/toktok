package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C35857E5l;
import X.C35858E5m;
import X.C76800UCe;
import X.FBJ;
import X.FBS;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AqS30S0100100_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS30S0100100_6 aqS30S0100100_6, Object exception) {
        o.LJIIIZ(exception, "exception");
        C35857E5l.LIZIZ(-110, aqS30S0100100_6.j1);
        ((InterfaceC65784Pro) aqS30S0100100_6.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS30S0100100_6 aqS30S0100100_6, Object obj) {
        String str;
        JSONObject put = ((JSONObject) aqS30S0100100_6.l0).put("isSuccess", 0).put("duration", System.currentTimeMillis() - aqS30S0100100_6.j1);
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        put.put("error", str);
        FBS fbs = FBJ.LIZ;
        if (fbs != null) {
            fbs.LIZIZ((JSONObject) aqS30S0100100_6.l0);
            return C76800UCe.LIZ;
        }
        o.LJIJI("hostDepend");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S0100100_6(C35858E5m c35858E5m, long j, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c35858E5m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S0100100_6(JSONObject jSONObject, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = jSONObject;
        this.j1 = j;
    }
}
