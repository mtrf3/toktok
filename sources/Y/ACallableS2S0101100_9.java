package Y;

import X.C26335AVf;
import X.C57412Mg4;
import X.C57413Mg5;
import X.C73969T1h;
import X.C76800UCe;
import X.J8U;
import X.T16;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.ScreenTimeData;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public class ACallableS2S0101100_9 implements Callable {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

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

    public static final Object call$0(ACallableS2S0101100_9 aCallableS2S0101100_9) {
        C57412Mg4.LIZIZ.uploadScreenTime(new ScreenTimeData(aCallableS2S0101100_9.j2, (List) aCallableS2S0101100_9.l0, aCallableS2S0101100_9.i1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new C57413Mg5(aCallableS2S0101100_9.j2, (List) aCallableS2S0101100_9.l0, aCallableS2S0101100_9.i1));
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS2S0101100_9 aCallableS2S0101100_9) {
        J8U j8u = new J8U();
        j8u.LIZLLL = "personal_homepage";
        j8u.LJJL = String.valueOf(aCallableS2S0101100_9.j2);
        j8u.LJIILL = ((AwemePagerAssemV2) aCallableS2S0101100_9.l0).r4(aCallableS2S0101100_9.i1);
        j8u.LJIILIIL();
        Context context = ((AwemePagerAssemV2) aCallableS2S0101100_9.l0).getContext();
        String r4 = ((AwemePagerAssemV2) aCallableS2S0101100_9.l0).r4(aCallableS2S0101100_9.i1);
        if (r4 == null) {
            r4 = "";
        }
        C26335AVf.LJJII(aCallableS2S0101100_9.i1, aCallableS2S0101100_9.j2, context, r4);
        return null;
    }

    public ACallableS2S0101100_9(long j, Object obj, int i, int i2) {
        this.$t = i2;
        this.j2 = j;
        this.l0 = obj;
        this.i1 = i;
    }
}
