package X;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.0A9, reason: invalid class name */
/* loaded from: classes.dex */
public class C0A9 {
    public boolean LJFF;
    public int LIZLLL = -1;
    public int LIZ = 0;
    public int LIZIZ = 0;
    public int LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public Interpolator LJ = null;

    public final void LIZ(RecyclerView recyclerView) {
        int i = this.LIZLLL;
        if (i >= 0) {
            this.LIZLLL = -1;
            recyclerView.LJJJLZIJ(i);
            this.LJFF = false;
        } else if (this.LJFF) {
            Interpolator interpolator = this.LJ;
            if (interpolator == null || this.LIZJ >= 1) {
                int i2 = this.LIZJ;
                if (i2 >= 1) {
                    recyclerView.LLIZLLLIL.LIZJ(this.LIZ, this.LIZIZ, i2, interpolator);
                    this.LJFF = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
    }

    public final void LIZIZ(int i, int i2, int i3, Interpolator interpolator) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LJ = interpolator;
        this.LJFF = true;
    }
}
