package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.QGp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66723QGp {
    public static final long LIZIZ = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern LIZJ = PatternProtector.compile("\\AA[\\w-]{38}\\z");
    public static C66723QGp LIZLLL;
    public final C72083SQt LIZ;

    public C66723QGp(C72083SQt c72083SQt) {
        this.LIZ = c72083SQt;
    }

    public final boolean LIZ(C66720QGm c66720QGm) {
        if (TextUtils.isEmpty(c66720QGm.LIZLLL)) {
            return true;
        }
        long j = c66720QGm.LJFF + c66720QGm.LJI;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.LIZ.getClass();
        if (j < timeUnit.toSeconds(System.currentTimeMillis()) + LIZIZ) {
            return true;
        }
        return false;
    }
}
