package X;

import com.ss.android.ugc.aweme.utils.RecommendConsumeParams;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JCM {
    public static int LIZIZ;
    public static int LIZJ;
    public static long LIZLLL;
    public static final JCM LIZ = new JCM();
    public static RecommendConsumeParams LJ = new RecommendConsumeParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    public static final ArrayList<String> LJFF = new ArrayList<>();

    public final synchronized long LIZLLL() {
        return LIZLLL;
    }

    public final synchronized void LIZ(long j) {
        LIZLLL += j;
    }

    public final synchronized int LIZIZ(boolean z) {
        if (z) {
            LIZJ++;
        }
        return LIZJ;
    }

    public final synchronized int LIZJ(boolean z) {
        if (z) {
            LIZIZ++;
        }
        return LIZIZ;
    }

    public static int LJ(Integer num, Boolean bool) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return (i << 1) | (o.LJ(bool, Boolean.TRUE) ? 1 : 0);
    }
}
