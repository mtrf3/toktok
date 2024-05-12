package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cys, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33098Cys extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33098Cys() {
        this.LIZJ.LJIIIIZZ(44.5f, 16.5f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -2.25f, -1.3f);
        this.LIZJ.LJIIL(-14.26f, 8.27f);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, false, 26.0f, 26.93f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(43.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.5f, 1.5f, false, false, 2.25f, 1.3f);
        this.LIZJ.LJIIL(14.26f, -8.27f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 1.99f, -3.46f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(16.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-9.17f, 9.86f);
        C32856Cuy.LLILLJJLI(this.LIZJ);
        this.LIZJ.LJIIIIZZ(30.0f, 33.88f);
        C32856Cuy.LLILLJJLI(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16595489);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(5.65f, 15.2f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, -2.25f, 1.3f);
        dij.LJIILL(16.57f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 2.0f, 3.46f);
        dij.LJIIL(14.25f, 8.26f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, 2.25f, -1.3f);
        dij.LJIJ(26.94f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -2.0f, -3.46f);
        dij.LJII(5.66f, 15.21f);
        dij.LIZLLL();
        dij.LJIIIIZZ(40.37f, 9.81f);
        dij.LJIIJ(1.0f, 0.58f, 1.0f, 2.02f, 0.0f, 2.6f);
        dij.LJIIL(-14.33f, 8.27f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 0.0f);
        dij.LJII(7.7f, 12.4f);
        dij.LJIIJ(-1.0f, -0.58f, -1.0f, -2.02f, 0.0f, -2.6f);
        dij.LJIIL(14.33f, -8.27f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 0.0f);
        dij.LJII(40.37f, 9.8f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-49299);
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
