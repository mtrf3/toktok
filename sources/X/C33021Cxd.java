package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33021Cxd extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33021Cxd() {
        C32856Cuy.Ln(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(39.25f, 33.0f);
        C32856Cuy.LLJJIJI(dij);
        C32856Cuy.rb(dij);
        C32856Cuy.z5(dij);
        dij.LJIILL(3.75f);
        C32856Cuy.K6(dij);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        dij.LJIILL(1.5f);
        dij.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        dij.LJIIJJI(3.75f);
        dij.LJIJ(43.0f);
        dij.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        dij.LJIIJJI(1.5f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        dij.LJIILL(-3.75f);
        dij.LJI(43.0f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        dij.LJIILL(-1.5f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        dij.LJIIJJI(-3.75f);
        C32856Cuy.G9(dij);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
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
