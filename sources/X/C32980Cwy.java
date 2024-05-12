package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32980Cwy extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;
    public final Paint LJII;
    public final DIJ LJIIIIZZ;
    public final Paint LJIIIZ;
    public final DIJ LJIIJ;

    public C32980Cwy() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.L5(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -16777216);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(29.93f, 8.94f);
        dij.LIZJ(7.82f, 7.82f, false, true, 29.68f, 7.0f);
        dij.LJIIJJI(-5.56f);
        C32856Cuy.cm(dij);
        dij.LIZJ(10.42f, 10.42f, false, false, 9.13f, 29.1f);
        dij.LJIIJ(0.0f, 5.77f, 4.65f, 10.44f, 10.4f, 10.44f);
        dij.LJIIJ(5.66f, 0.0f, 10.27f, -4.54f, 10.4f, -10.2f);
        dij.LJIJ(18.03f);
        dij.LJIIIZ(13.2f, 13.2f, false, false, 7.5f, 2.33f);
        dij.LJIILL(-5.59f);
        dij.LJIIIZ(7.75f, 7.75f, false, true, -7.5f, -5.83f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-14289682);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ2);
        this.LJII = LIZ;
        DIJ dij2 = new DIJ();
        this.LJIIIIZZ = dij2;
        dij2.LJIIIIZZ(31.38f, 10.4f);
        dij2.LJIIIZ(7.82f, 7.82f, false, true, -0.24f, -1.94f);
        dij2.LJIIJJI(-5.57f);
        C32856Cuy.cm(dij2);
        dij2.LJIIIZ(10.42f, 10.42f, false, false, -11.85f, 10.34f);
        dij2.LJIIJ(0.0f, 5.76f, 4.65f, 10.44f, 10.4f, 10.44f);
        dij2.LJIIJ(5.66f, 0.0f, 10.27f, -4.54f, 10.4f, -10.2f);
        C32856Cuy.eh(dij2);
        dij2.LJIIIZ(7.75f, 7.75f, false, true, -7.5f, -5.84f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIJ = dij3;
        dij3.LJIIIIZZ(29.82f, 8.46f);
        dij3.LJIIIZ(7.7f, 7.7f, false, false, 2.9f, 4.71f);
        dij3.LJIIIZ(7.75f, 7.75f, false, true, -1.59f, -4.71f);
        dij3.LJIIJJI(-1.31f);
        dij3.LIZLLL();
        dij3.LJIILIIL(7.6f, 7.63f);
        dij3.LJIILL(4.27f);
        dij3.LJIIIZ(13.2f, 13.2f, false, true, -7.5f, -2.33f);
        dij3.LJIILL(11.31f);
        dij3.LJIIIZ(10.42f, 10.42f, false, true, -10.4f, 10.2f);
        dij3.LJIIJ(-2.5f, 0.0f, -4.8f, -0.89f, -6.59f, -2.37f);
        dij3.LJIIJ(1.9f, 2.34f, 4.8f, 3.83f, 8.05f, 3.83f);
        dij3.LJIIJ(5.66f, 0.0f, 10.27f, -4.55f, 10.4f, -10.2f);
        C32856Cuy.eh(dij3);
        dij3.LJIIJ(-0.5f, 0.0f, -0.99f, -0.05f, -1.46f, -0.14f);
        dij3.LIZLLL();
        dij3.LJIILIIL(-16.44f, 4.02f);
        dij3.LJIILL(4.61f);
        dij3.LJIIIZ(4.6f, 4.6f, false, false, -3.9f, 8.29f);
        dij3.LJIIIZ(4.6f, 4.6f, false, true, 5.35f, -6.83f);
        dij3.LJIJ(20.2f);
        dij3.LJIIJ(-0.48f, -0.06f, -0.96f, -0.1f, -1.45f, -0.1f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-119723);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
        canvas.drawPath(this.LJIIJ.LIZ, this.LJIIIZ);
    }
}
