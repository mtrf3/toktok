package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33124CzI extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33124CzI() {
        C32856Cuy.yo(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-119723);
        this.LIZIZ.setAlpha(96);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Sh(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-119723);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, paint);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        C32856Cuy.LLIIIJ(dij2);
        dij2.LJIIIIZZ(27.0f, 37.7f);
        dij2.LJIILL(3.5f);
        dij2.LJIIJ(0.0f, 0.33f, 0.38f, 0.52f, 0.64f, 0.32f);
        dij2.LJIIL(6.93f, -5.2f);
        dij2.LJIIIZ(0.4f, 0.4f, false, false, 0.0f, -0.64f);
        dij2.LJIIL(-6.93f, -5.2f);
        dij2.LJIIIZ(0.4f, 0.4f, false, false, -0.64f, 0.32f);
        dij2.LJIILL(3.5f);
        dij2.LJI(13.5f);
        dij2.LJIIJ(-4.21f, 0.0f, -7.8f, -3.66f, -7.8f, -8.4f);
        dij2.LJIIJ(0.0f, -1.87f, 0.57f, -3.6f, 1.53f, -4.99f);
        dij2.LJIIJ(0.31f, -0.45f, 0.28f, -1.08f, -0.13f, -1.45f);
        dij2.LJIIL(-1.05f, -0.92f);
        dij2.LJIIIZ(0.94f, 0.94f, false, false, -1.38f, 0.11f);
        dij2.LJIIJ(-1.49f, 2.0f, -2.37f, 4.53f, -2.37f, 7.26f);
        dij2.LJIIJ(0.0f, 6.41f, 4.92f, 11.79f, 11.2f, 11.79f);
        dij2.LJI(27.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
