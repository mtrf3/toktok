package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33015CxX extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33015CxX() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(2.0f, 11.0f);
        C32856Cuy.Hf(this.LIZJ);
        C32856Cuy.LJJIII(this.LIZJ);
        C32856Cuy.If(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(20.0f);
        p2.LJIIIZ(7.0f, 7.0f, false, true, -7.0f, 7.0f);
        this.LIZJ.LJI(13.46f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.56f, 0.74f);
        this.LIZJ.LJII(5.56f, 46.6f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 2.0f, 45.34f);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(20.4f, 16.64f);
        dij.LJIIJ(0.0f, -1.65f, 2.37f, -2.24f, 3.64f, -2.24f);
        C32856Cuy.Ui(dij);
        dij.LJIIJ(0.52f, 0.0f, 0.93f, -0.41f, 0.93f, -0.93f);
        dij.LIZLLL();
        C32856Cuy.ja(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
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
