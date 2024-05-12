package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C40741Fyr;
import X.C76800UCe;
import X.FBJ;
import X.FBS;
import X.InterfaceC35877E6f;
import X.InterfaceC65784Pro;
import X.X1D;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AqS36S0100100_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final Object invoke$0(AqS36S0100100_6 aqS36S0100100_6) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Additional server time: ");
        LIZ.append(SystemClock.elapsedRealtime() - aqS36S0100100_6.j1);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        ((InterfaceC35877E6f) aqS36S0100100_6.l0).LJJJJI().invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS36S0100100_6 aqS36S0100100_6) {
        ((JSONObject) aqS36S0100100_6.l0).put("isSuccess", 1).put("duration", System.currentTimeMillis() - aqS36S0100100_6.j1);
        FBS fbs = FBJ.LIZ;
        if (fbs != null) {
            fbs.LIZIZ((JSONObject) aqS36S0100100_6.l0);
            return C76800UCe.LIZ;
        }
        o.LJIJI("hostDepend");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS36S0100100_6(long j, ComponentDependencies componentDependencies, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = componentDependencies;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS36S0100100_6(JSONObject jSONObject, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = jSONObject;
        this.j1 = j;
    }
}
