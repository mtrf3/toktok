package X;

import android.graphics.Paint;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WGA {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public Paint LJIIIIZZ;
    public Paint LJIIIZ;
    public float[] LJIIJ = new float[0];
    public int LJIIJJI = -1;

    public final void LIZ(int i) {
        this.LJIIJJI = i;
        Paint paint = this.LJIIIIZZ;
        if (paint != null) {
            paint.setColor(i);
            Paint paint2 = this.LJIIIZ;
            if (paint2 != null) {
                paint2.setColor(i);
                Paint paint3 = this.LJIIIZ;
                if (paint3 != null) {
                    paint3.setAlpha(76);
                    return;
                } else {
                    o.LJIJI("mOuterPaint");
                    throw null;
                }
            }
            o.LJIJI("mOuterPaint");
            throw null;
        }
        o.LJIJI("mPaint");
        throw null;
    }
}
