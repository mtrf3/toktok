package X;

import android.view.View;

/* renamed from: X.Ey3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38143Ey3 {
    public volatile boolean LIZ;
    public volatile View LIZIZ;

    public abstract View LIZIZ();

    public final View LIZ() {
        if (!this.LIZ) {
            synchronized (this) {
                if (!this.LIZ) {
                    this.LIZ = true;
                    this.LIZIZ = LIZIZ();
                }
            }
        }
        return this.LIZIZ;
    }
}
