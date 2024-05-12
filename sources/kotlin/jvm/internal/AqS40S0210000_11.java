package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C66322Q1e;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.Q1B;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AqS40S0210000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS40S0210000_11 aqS40S0210000_11) {
        aqS40S0210000_11.invoke$0();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS40S0210000_11 aqS40S0210000_11) {
        aqS40S0210000_11.invoke$1();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        C66322Q1e c66322Q1e = new C66322Q1e();
        ((InterfaceC88472Yns) this.l1).invoke(c66322Q1e);
        Q1B q1b = (Q1B) this.l0;
        String str = c66322Q1e.LIZ;
        JSONObject jSONObject = c66322Q1e.LIZIZ;
        if (jSONObject != null) {
            jSONObject.put("is_main_thread", this.z2);
        } else {
            jSONObject = null;
        }
        q1b.LIZIZ(str, jSONObject, c66322Q1e.LIZJ, c66322Q1e.LIZLLL);
    }

    public final void invoke$1() {
        C66322Q1e c66322Q1e = new C66322Q1e();
        ((InterfaceC88472Yns) this.l1).invoke(c66322Q1e);
        Q1B q1b = (Q1B) this.l0;
        String str = c66322Q1e.LIZ;
        JSONObject jSONObject = c66322Q1e.LIZIZ;
        if (jSONObject != null) {
            jSONObject.put("is_main_thread", this.z2);
        } else {
            jSONObject = null;
        }
        q1b.LIZIZ(str, jSONObject, c66322Q1e.LIZJ, c66322Q1e.LIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS40S0210000_11(Q1B q1b, InterfaceC88472Yns interfaceC88472Yns, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = q1b;
        this.l1 = interfaceC88472Yns;
        this.z2 = z;
    }
}
