package X;

import android.app.ActivityManager;

/* loaded from: classes15.dex */
public final class W6B implements W4P<C81738W6c> {
    public final ActivityManager LIZ;
    public final int LIZIZ;

    @Override // X.W4P
    public final C81738W6c get() {
        int i = this.LIZIZ;
        if (i <= 0) {
            int min = Math.min(this.LIZ.getMemoryClass() * 1048576, Integer.MAX_VALUE);
            if (min < 33554432) {
                i = 4194304;
            } else if (min < 67108864) {
                i = 6291456;
            } else {
                i = min / 8;
            }
        }
        return new C81738W6c(i, 256, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public W6B(ActivityManager activityManager, int i) {
        this.LIZ = activityManager;
        this.LIZIZ = i;
    }
}
