package X;

import X.WAA;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes15.dex */
public class WA4<T extends WAA> implements WAA {
    public final T LIZ;

    @Override // X.WAA
    public final int LIZLLL() {
        T t = this.LIZ;
        if (t == null) {
            return -1;
        }
        return t.LIZLLL();
    }

    @Override // X.WAA
    public final int LJFF() {
        T t = this.LIZ;
        if (t == null) {
            return -1;
        }
        return t.LJFF();
    }

    @Override // X.WAA
    public final void clear() {
        T t = this.LIZ;
        if (t != null) {
            t.clear();
        }
    }

    @Override // X.V9G
    public final int getFrameCount() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.getFrameCount();
    }

    @Override // X.V9G
    public int getLoopCount() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.getLoopCount();
    }

    public WA4(WA0 wa0) {
        this.LIZ = wa0;
    }

    @Override // X.V9G
    public final int LIZIZ(int i) {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.LIZIZ(i);
    }

    @Override // X.WAA
    public final void LIZJ(int i) {
        T t = this.LIZ;
        if (t != null) {
            t.LIZJ(i);
        }
    }

    @Override // X.WAA
    public final void LJI(Rect rect) {
        T t = this.LIZ;
        if (t != null) {
            t.LJI(rect);
        }
    }

    @Override // X.WAA
    public final void LJII(ColorFilter colorFilter) {
        T t = this.LIZ;
        if (t != null) {
            t.LJII(colorFilter);
        }
    }

    @Override // X.WAA
    public final boolean LJIIIIZZ(int i) {
        T t = this.LIZ;
        if (t != null) {
            return t.LJIIIIZZ(i);
        }
        return false;
    }

    public WA4(T t) {
        this.LIZ = t;
    }

    @Override // X.WAA
    public boolean LIZ(int i, Canvas canvas, Drawable drawable) {
        T t = this.LIZ;
        if (t != null && t.LIZ(i, canvas, drawable)) {
            return true;
        }
        return false;
    }
}
