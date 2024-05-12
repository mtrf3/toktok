package X;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class H6A extends AbstractC44430HcA {
    public static final H6A LIZIZ = new H6A();

    @Override // X.AbstractC44430HcA
    public final long LIZ() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis());
    }
}
