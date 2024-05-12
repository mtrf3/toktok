package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.0Ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03050Ab {
    public final C0A2 LIZ;
    public int LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final Rect LIZJ = new Rect();

    public abstract int LIZIZ(View view);

    public abstract int LIZJ(View view);

    public abstract int LIZLLL(View view);

    public abstract int LJ(View view);

    public abstract int LJFF();

    public abstract int LJI();

    public abstract int LJII();

    public abstract int LJIIIIZZ();

    public abstract int LJIIIZ();

    public abstract int LJIIJ();

    public abstract int LJIIJJI();

    public abstract int LJIILIIL(View view);

    public abstract int LJIILJJIL(View view);

    public abstract void LJIILL(int i);

    public final int LJIIL() {
        if (Integer.MIN_VALUE == this.LIZIZ) {
            return 0;
        }
        return LJIIJJI() - this.LIZIZ;
    }

    public AbstractC03050Ab(C0A2 c0a2) {
        this.LIZ = c0a2;
    }

    public static AbstractC03050Ab LIZ(C0A2 c0a2, int i) {
        if (i != 0) {
            if (i == 1) {
                return new C28861Bi(c0a2);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C28851Bh(c0a2);
    }
}
