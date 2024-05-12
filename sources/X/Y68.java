package X;

import android.graphics.Rect;

/* loaded from: classes16.dex */
public final class Y68 extends Y6D {
    static {
        C16880lQ.LJLLJ(Y68.class);
    }

    @Override // X.Y6D
    public final float LIZ(Y64 y64, Y64 y642) {
        int i;
        int i2 = y64.LJLIL;
        if (i2 <= 0 || (i = y64.LJLILLLLZI) <= 0) {
            return 0.0f;
        }
        int i3 = y642.LJLIL;
        float f = (i2 * 1.0f) / i3;
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        int i4 = y642.LJLILLLLZI;
        float f2 = (i * 1.0f) / i4;
        if (f2 < 1.0f) {
            f2 = 1.0f / f2;
        }
        float f3 = (1.0f / f) / f2;
        float f4 = ((i2 * 1.0f) / i) / ((i3 * 1.0f) / i4);
        if (f4 < 1.0f) {
            f4 = 1.0f / f4;
        }
        return (((1.0f / f4) / f4) / f4) * f3;
    }

    @Override // X.Y6D
    public final Rect LIZIZ(Y64 y64, Y64 y642) {
        return new Rect(0, 0, y642.LJLIL, y642.LJLILLLLZI);
    }
}
