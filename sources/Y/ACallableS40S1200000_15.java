package Y;

import X.C76800UCe;
import X.C84778XPa;
import X.XTK;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ACallableS40S1200000_15 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS40S1200000_15 aCallableS40S1200000_15) {
        C84778XPa c84778XPa = (C84778XPa) aCallableS40S1200000_15.l1;
        String str = aCallableS40S1200000_15.s0;
        o.LJII(str, "null cannot be cast to non-null type kotlin.String");
        Aweme aweme = (Aweme) aCallableS40S1200000_15.l2;
        o.LJII(aweme, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        c84778XPa.LIZJ(aweme, str);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS40S1200000_15 aCallableS40S1200000_15) {
        ((XTK) aCallableS40S1200000_15.l1).LIZ.LIZ(aCallableS40S1200000_15.s0, (MusicWaveBean) aCallableS40S1200000_15.l2);
        return C76800UCe.LIZ;
    }

    public ACallableS40S1200000_15(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
