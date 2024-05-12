package X;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.QZx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67225QZx {
    public static final AtomicInteger LIZ = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean LIZ(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            return false;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
