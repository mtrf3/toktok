package Y;

import X.C194757kd;
import X.C194767ke;
import X.C226068u2;
import X.C35979EAd;
import X.C47261Igj;
import X.C72085SQv;
import X.C76800UCe;
import X.FMX;
import X.OSZ;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS41S1000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACallableS2S1000000_3 implements Callable {
    public final int $t;
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

    public static final Object call$0(ACallableS2S1000000_3 aCallableS2S1000000_3) {
        List LJJIJIL = C47261Igj.LJJIJIL(new OSZ(aCallableS2S1000000_3.s0, "action_type"), new OSZ("left_bottom", "location"));
        if (o.LJ(aCallableS2S1000000_3.s0, "show")) {
            LJJIJIL.add(new OSZ(Long.valueOf(C226068u2.LIZJ()), "lastshow_to_show"));
        }
        OSZ[] oszArr = (OSZ[]) LJJIJIL.toArray(new OSZ[0]);
        FMX.LJIILL("friends_fyp_enter_guide", (OSZ[]) Arrays.copyOf(oszArr, oszArr.length));
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS2S1000000_3 aCallableS2S1000000_3) {
        List LJJIJIL = C47261Igj.LJJIJIL(new OSZ(aCallableS2S1000000_3.s0, "action_type"), new OSZ("middle_bottom", "location"));
        if (o.LJ(aCallableS2S1000000_3.s0, "show")) {
            LJJIJIL.add(new OSZ(Long.valueOf(C226068u2.LIZJ()), "lastshow_to_show"));
        }
        OSZ[] oszArr = (OSZ[]) LJJIJIL.toArray(new OSZ[0]);
        FMX.LJIILL("friends_fyp_enter_guide", (OSZ[]) Arrays.copyOf(oszArr, oszArr.length));
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS2S1000000_3 aCallableS2S1000000_3) {
        String str = aCallableS2S1000000_3.s0;
        C194757kd c194757kd = (C194757kd) ((C35979EAd) C194767ke.LIZ.getValue()).LIZIZ(str);
        if (c194757kd != null) {
            if (System.currentTimeMillis() - c194757kd.LIZ >= 1800000) {
                C72085SQv.LJ(new AqS41S1000000_3(str, 2));
            }
            Aweme aweme = c194757kd.LIZIZ;
            if (aweme != null) {
                return aweme;
            }
        }
        return C194767ke.LIZLLL.getValue();
    }

    public ACallableS2S1000000_3(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
