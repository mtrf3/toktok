package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ipl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47821Ipl {
    public static volatile boolean LIZ = true;
    public static volatile boolean LIZIZ = true;
    public static volatile boolean LIZJ = true;
    public static volatile boolean LIZLLL = true;
    public static volatile boolean LJ = true;
    public static volatile boolean LJFF = true;
    public static volatile boolean LJI = true;
    public static volatile boolean LJII = true;
    public static volatile boolean LJIIIIZZ;
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);

    public static int LIZ(Request request) {
        if (request == null) {
            return -1;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            return -1;
        }
        if (path.contains("/aweme/v1/feed/")) {
            return 1;
        }
        if (!path.contains("/aweme/v2/feed/")) {
            return -1;
        }
        return 2;
    }
}
