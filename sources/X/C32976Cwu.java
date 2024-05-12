package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32976Cwu extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C32976Cwu() {
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
        dij2.LJIIIIZZ(13.5f, 34.3f);
        C32856Cuy.z6(dij2);
        C32856Cuy.An(dij2);
        C32856Cuy.m1(dij2);
        C32856Cuy.yn(dij2);
        C32856Cuy.xb(dij2);
        dij2.LJIIJ(-6.28f, 0.0f, -11.2f, -5.38f, -11.2f, -11.8f);
        dij2.LJIIJ(0.0f, -2.72f, 0.88f, -5.24f, 2.37f, -7.25f);
        dij2.LJIIIZ(0.94f, 0.94f, false, true, 1.38f, -0.11f);
        dij2.LJIIL(1.05f, 0.92f);
        dij2.LJIIJ(0.41f, 0.37f, 0.44f, 1.0f, 0.13f, 1.45f);
        dij2.LJIIIZ(8.77f, 8.77f, false, false, -1.53f, 5.0f);
        dij2.LJIIJ(0.0f, 4.73f, 3.59f, 8.39f, 7.8f, 8.39f);
        dij2.LIZLLL();
        dij2.LJIIIIZZ(32.39f, 39.0f);
        dij2.LJIIJJI(-2.68f);
        dij2.LJIJ(28.36f);
        dij2.LJIIL(-3.17f, 3.42f);
        dij2.LJIILL(-3.22f);
        dij2.LJIIL(2.05f, -2.25f);
        dij2.LJIIJJI(3.8f);
        dij2.LJIJ(39.0f);
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
