package X;

import android.graphics.Rect;

/* loaded from: classes16.dex */
public final class Y65 extends Y6D {
    static {
        C16880lQ.LJLLJ(Y65.class);
    }

    @Override // X.Y6D
    public final float LIZ(Y64 y64, Y64 y642) {
        if (y64.LJLIL <= 0 || y64.LJLILLLLZI <= 0) {
            return 0.0f;
        }
        Y64 LIZJ = y64.LIZJ(y642);
        float f = (LIZJ.LJLIL * 1.0f) / y64.LJLIL;
        if (f > 1.0f) {
            f = (float) Math.pow(1.0f / f, 1.1d);
        }
        float f2 = ((LIZJ.LJLILLLLZI * 1.0f) / y642.LJLILLLLZI) + ((LIZJ.LJLIL * 1.0f) / y642.LJLIL);
        return ((1.0f / f2) / f2) * f;
    }

    @Override // X.Y6D
    public final Rect LIZIZ(Y64 y64, Y64 y642) {
        Y64 LIZJ = y64.LIZJ(y642);
        int i = (LIZJ.LJLIL - y642.LJLIL) / 2;
        int i2 = (LIZJ.LJLILLLLZI - y642.LJLILLLLZI) / 2;
        return new Rect(-i, -i2, LIZJ.LJLIL - i, LIZJ.LJLILLLLZI - i2);
    }
}
