package X;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.VhO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80426VhO {
    public static final int[] LJIIIIZZ = new int[3];
    public static final float[] LJIIIZ = {0.0f, 0.5f, 1.0f};
    public static final int[] LJIIJ = new int[4];
    public static final float[] LJIIJJI = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint LIZ;
    public final Paint LIZIZ;
    public final Paint LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public final Path LJI = new Path();
    public final Paint LJII;

    public C80426VhO() {
        Paint paint = new Paint();
        this.LJII = paint;
        this.LIZ = new Paint();
        LIZ(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.LIZIZ = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.LIZJ = new Paint(paint2);
    }

    public final void LIZ(int i) {
        this.LIZLLL = C07290Qj.LJIIL(i, 68);
        this.LJ = C07290Qj.LJIIL(i, 20);
        this.LJFF = C07290Qj.LJIIL(i, 0);
        this.LIZ.setColor(this.LIZLLL);
    }
}
