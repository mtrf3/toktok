package X;

import android.graphics.Rect;

/* loaded from: classes16.dex */
public final class Y66 extends Y6D {
    static {
        C16880lQ.LJLLJ(Y66.class);
    }

    @Override // X.Y6D
    public final float LIZ(Y64 y64, Y64 y642) {
        if (y64.LJLIL <= 0 || y64.LJLILLLLZI <= 0) {
            return 0.0f;
        }
        Y64 LIZLLL = y64.LIZLLL(y642);
        float f = (LIZLLL.LJLIL * 1.0f) / y64.LJLIL;
        if (f > 1.0f) {
            f = (float) Math.pow(1.0f / f, 1.1d);
        }
        float f2 = ((y642.LJLILLLLZI * 1.0f) / LIZLLL.LJLILLLLZI) * ((y642.LJLIL * 1.0f) / LIZLLL.LJLIL);
        return (((1.0f / f2) / f2) / f2) * f;
    }

    @Override // X.Y6D
    public final Rect LIZIZ(Y64 y64, Y64 y642) {
        Y64 LIZLLL = y64.LIZLLL(y642);
        int i = (LIZLLL.LJLIL - y642.LJLIL) / 2;
        int i2 = (LIZLLL.LJLILLLLZI - y642.LJLILLLLZI) / 2;
        return new Rect(-i, -i2, LIZLLL.LJLIL - i, LIZLLL.LJLILLLLZI - i2);
    }
}
