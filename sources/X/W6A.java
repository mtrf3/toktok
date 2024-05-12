package X;

import android.app.ActivityManager;

/* loaded from: classes15.dex */
public class W6A implements W4P<C81738W6c> {
    public final ActivityManager LIZ;

    @Override // X.W4P
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public C81738W6c get() {
        int i;
        int min = Math.min(this.LIZ.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i = 4194304;
        } else if (min < 67108864) {
            i = 6291456;
        } else {
            i = min / 4;
        }
        return new C81738W6c(i, 256, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public W6A(ActivityManager activityManager) {
        this.LIZ = activityManager;
    }
}
