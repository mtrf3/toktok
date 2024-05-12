package X;

import android.os.SystemClock;

/* renamed from: X.O2u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61268O2u {
    public final long LIZ;
    public long LIZIZ;

    public C61268O2u() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.LIZ = uptimeMillis;
        this.LIZIZ = uptimeMillis;
    }

    public final long LIZ() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.LIZIZ;
        this.LIZIZ = uptimeMillis;
        return j;
    }

    public final long LIZIZ() {
        return SystemClock.uptimeMillis() - this.LIZ;
    }
}
