package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C63053Oor;
import X.C66532Q9g;
import X.C66607QCd;
import X.C68074Qne;
import X.C68159Qp1;
import X.C76800UCe;
import X.C85999Xp5;
import X.E2C;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.Q96;
import X.Q9D;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes12.dex */
public class AqS22S2100000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS22S2100000_11 aqS22S2100000_11) {
        FirebaseAnalytics firebaseAnalytics = ((C63053Oor) aqS22S2100000_11.l2).LIZ;
        String str = aqS22S2100000_11.s0;
        String str2 = aqS22S2100000_11.s1;
        C68074Qne c68074Qne = firebaseAnalytics.LIZ;
        c68074Qne.getClass();
        c68074Qne.LIZIZ(new C68159Qp1(c68074Qne, null, str, str2, false));
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$1(AqS22S2100000_11 aqS22S2100000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "Firebase";
        q96.LIZIZ = "setUserProperty";
        q96.LIZJ = C113554cx.LJJL(new OSZ("name", aqS22S2100000_11.s0), new OSZ("value", aqS22S2100000_11.s1));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524356");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS22S2100000_11((C63053Oor) aqS22S2100000_11.l2, aqS22S2100000_11.s0, aqS22S2100000_11.s1, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS22S2100000_11(C63053Oor c63053Oor, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = "allow_personalized_ads";
        this.s1 = str;
        this.l2 = c63053Oor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS22S2100000_11(C63053Oor c63053Oor, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = c63053Oor;
        this.s0 = str;
        this.s1 = str2;
    }
}
