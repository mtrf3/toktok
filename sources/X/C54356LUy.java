package X;

import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.LUy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54356LUy<T> {
    public static final long[] LJI = new long[3];
    public final WeakReference<T> LIZ;
    public final String LIZIZ;
    public final WeakReference<Object> LIZJ = new WeakReference<>(new Object());
    public final long LIZLLL = SystemClock.uptimeMillis();
    public boolean LJ;
    public boolean LJFF;

    public C54356LUy(T t) {
        this.LIZIZ = t.getClass().getName();
        this.LIZ = new WeakReference<>(t);
    }
}
