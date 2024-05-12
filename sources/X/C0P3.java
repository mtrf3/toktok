package X;

import android.view.WindowInsetsAnimation;

/* renamed from: X.0P3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0P3 {
    public final C06920Oy LIZ;
    public final C06920Oy LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Bounds{lower=");
        LIZ.append(this.LIZ);
        LIZ.append(" upper=");
        LIZ.append(this.LIZIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public C0P3(WindowInsetsAnimation.Bounds bounds) {
        this.LIZ = C06920Oy.LIZLLL(bounds.getLowerBound());
        this.LIZIZ = C06920Oy.LIZLLL(bounds.getUpperBound());
    }

    public C0P3(C06920Oy c06920Oy, C06920Oy c06920Oy2) {
        this.LIZ = c06920Oy;
        this.LIZIZ = c06920Oy2;
    }
}
