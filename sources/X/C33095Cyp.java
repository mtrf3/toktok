package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33095Cyp extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33095Cyp() {
        this.LIZJ.LJIIIIZZ(38.0f, 7.1f);
        this.LIZJ.LJIIJ(2.8f, 0.0f, 4.2f, 0.0f, 5.27f, 0.48f);
        this.LIZJ.LJIIJ(0.94f, 0.42f, 1.7f, 1.09f, 2.18f, 1.91f);
        this.LIZJ.LJIIJ(0.55f, 0.94f, 0.55f, 2.17f, 0.55f, 4.62f);
        C32856Cuy.m9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 2.45f, 0.0f, 3.68f, -0.55f, 4.62f);
        this.LIZJ.LJIIIZ(4.74f, 4.74f, false, true, -2.18f, 1.91f);
        C32856Cuy.Gh(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(-2.8f, 0.0f, -4.2f, 0.0f, -5.27f, -0.48f);
        this.LIZJ.LJIIIZ(4.74f, 4.74f, false, true, -2.19f, -1.91f);
        this.LIZJ.LJ(2.0f, 18.67f, 2.0f, 17.44f, 2.0f, 14.99f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-0.88f);
        this.LIZJ.LJIIJ(0.0f, -2.45f, 0.0f, -3.68f, 0.54f, -4.62f);
        this.LIZJ.LJIIIZ(4.74f, 4.74f, false, true, 2.19f, -1.91f);
        this.LIZJ.LJ(5.8f, 7.1f, 7.2f, 7.1f, 10.0f, 7.1f);
        C40084FoG.LJ(this.LIZJ, "p", 28.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -49299);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(23.7f, 26.0f);
        dij.LJIIJ(2.8f, 0.0f, 4.2f, 0.0f, 5.27f, 0.48f);
        dij.LJIIJ(0.94f, 0.42f, 1.7f, 1.1f, 2.19f, 1.93f);
        dij.LJIIJ(0.54f, 0.94f, 0.54f, 2.18f, 0.54f, 4.65f);
        dij.LJIILL(0.88f);
        dij.LJIIJ(0.0f, 2.47f, 0.0f, 3.7f, -0.54f, 4.65f);
        dij.LJIIIZ(4.75f, 4.75f, false, true, -2.19f, 1.93f);
        dij.LJ(27.9f, 41.0f, 26.5f, 41.0f, 23.7f, 41.0f);
        dij.LJI(10.0f);
        dij.LJIIJ(-2.8f, 0.0f, -4.2f, 0.0f, -5.27f, -0.48f);
        dij.LJIIIZ(4.75f, 4.75f, false, true, -2.19f, -1.93f);
        dij.LJ(2.0f, 37.65f, 2.0f, 36.41f, 2.0f, 33.94f);
        dij.LJIILL(-0.88f);
        dij.LJIIJ(0.0f, -2.47f, 0.0f, -3.7f, 0.54f, -4.65f);
        dij.LJIIIZ(4.75f, 4.75f, false, true, 2.19f, -1.93f);
        dij.LJ(5.8f, 26.0f, 7.2f, 26.0f, 10.0f, 26.0f);
        dij.LJIIJJI(13.7f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-16595489);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
