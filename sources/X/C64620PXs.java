package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.PXs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64620PXs {
    public boolean LIZ;
    public int LIZIZ = -1;
    public boolean LIZJ;

    public final void LIZ(TimeUnit timeUnit) {
        int i = Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i = (int) seconds;
        }
        this.LIZIZ = i;
    }
}
