package Y;

import X.C10I;
import X.C10K;
import X.C27605AsT;
import X.C76800UCe;
import X.C95J;
import X.C9OT;
import X.FMX;
import X.IQ5;
import X.InterfaceC247459nR;
import com.bytedance.touchpoint.core.model.NormalPendant;
import com.bytedance.touchpoint.data.request.INetworkApi;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ACallableS32S1100000_4 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS32S1100000_4 aCallableS32S1100000_4) {
        INetworkApi LJFF;
        int i;
        int i2;
        NormalPendant normalPendant;
        Integer num;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR == null || (LJFF = interfaceC247459nR.LJFF()) == null) {
            return null;
        }
        if (o.LJ(aCallableS32S1100000_4.s0, "widget")) {
            i = 2;
        } else {
            i = 1;
        }
        C9OT c9ot = (C9OT) aCallableS32S1100000_4.l1;
        if (c9ot != null && (normalPendant = c9ot.LJLIL) != null && (num = normalPendant.LIZJ) != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        C10K<String> requestTouchPointClick = LJFF.requestTouchPointClick(1, i, i2);
        if (requestTouchPointClick == null) {
            return null;
        }
        return requestTouchPointClick.LJ(new C10I() { // from class: X.9iI
            @Override // X.C10I
            public final Object then(C10K c10k) {
                return c10k;
            }
        }, C10K.LJI, null);
    }

    public static final Object call$1(ACallableS32S1100000_4 aCallableS32S1100000_4) {
        FMX.LJIILJJIL(aCallableS32S1100000_4.s0, (JSONObject) aCallableS32S1100000_4.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS32S1100000_4 aCallableS32S1100000_4) {
        C27605AsT c27605AsT = ((IQ5) aCallableS32S1100000_4.l1).LIZ;
        String str = aCallableS32S1100000_4.s0;
        o.LJI(str);
        c27605AsT.L(str);
        return C76800UCe.LIZ;
    }

    public ACallableS32S1100000_4(JSONObject jSONObject, int i) {
        this.$t = i;
        this.s0 = "story_show";
        this.l1 = jSONObject;
    }

    public ACallableS32S1100000_4(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
