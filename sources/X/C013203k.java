package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.03k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C013203k {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJII;

    public final void LIZ(int i, int i2) {
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJII = true;
        if (this.LJI) {
            if (i2 != Integer.MIN_VALUE) {
                this.LIZ = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.LIZIZ = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.LIZ = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.LIZIZ = i2;
    }
}
