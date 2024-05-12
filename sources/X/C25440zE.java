package X;

import android.os.SystemClock;

/* renamed from: X.0zE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25440zE {
    public final long[] LIZ = new long[4];

    public final boolean LIZIZ() {
        long[] jArr = this.LIZ;
        if (jArr[0] - jArr[2] <= 100) {
            return false;
        }
        return true;
    }

    public final void LIZ(long j) {
        long[] jArr = this.LIZ;
        if (jArr[0] == 0) {
            jArr[0] = SystemClock.uptimeMillis();
        }
        long[] jArr2 = this.LIZ;
        jArr2[1] = jArr2[1] + 1;
        if (j < jArr2[2]) {
            jArr2[2] = j;
        }
        if (j > jArr2[3]) {
            jArr2[3] = j;
        }
    }
}
