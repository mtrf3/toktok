package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;

/* loaded from: classes7.dex */
public final class FF5 {
    public static final /* synthetic */ int LIZJ = 0;
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;

    static {
        C16880lQ.LJLLJ(FF5.class);
    }

    public static void LIZ() {
        FAJ.LIZ("application_initbefore_init_ab", false);
        AwemeConfigCenter.LIZ();
        FKB.LJII = SystemClock.uptimeMillis();
        FAJ.LJFF("application_initbefore_init_ab", false);
    }
}
