package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.VwU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81362VwU {
    public final RectF LIZ = new RectF();
    public final Paint LIZIZ;
    public final Paint LIZJ;
    public final Drawable.Callback LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public int[] LJIIIZ;
    public int LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public boolean LJIILJJIL;
    public Path LJIILL;
    public float LJIILLIIL;
    public double LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public final Paint LJIJJLI;
    public int LJIL;
    public int LJJ;

    public final void LIZ() {
        this.LIZLLL.invalidateDrawable(null);
    }

    public C81362VwU(C81365VwX c81365VwX) {
        Paint paint = new Paint();
        this.LIZIZ = paint;
        Paint paint2 = new Paint();
        this.LIZJ = paint2;
        this.LJ = 0.0f;
        this.LJFF = 0.0f;
        this.LJI = 0.0f;
        this.LJII = 5.0f;
        this.LJIIIIZZ = 2.5f;
        this.LJIJJLI = new Paint(1);
        this.LIZLLL = c81365VwX;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
    }

    public final void LIZIZ(int i) {
        this.LJIIJ = i;
        this.LJJ = this.LJIIIZ[i];
    }
}
