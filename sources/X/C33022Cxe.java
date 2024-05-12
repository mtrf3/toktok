package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33022Cxe extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33022Cxe() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(3.0f, 23.0f);
        this.LIZJ.LIZJ(19.0f, 19.0f, false, true, 22.0f, 4.0f);
        C32856Cuy.C0(this.LIZJ);
        this.LIZJ.LJIIIZ(19.0f, 19.0f, false, true, 19.0f, 19.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(9.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-2.0f);
        p3.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.LJL(this.LIZJ);
        this.LIZJ.LJIIIZ(13.0f, 13.0f, false, false, -13.0f, -13.0f);
        C32856Cuy.LJFF(this.LIZJ);
        this.LIZJ.LIZJ(13.0f, 13.0f, false, false, 9.0f, 23.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(9.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(5.0f);
        p5.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-9.0f);
        p6.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(11.0f, 30.0f);
        dij.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        dij.LJIIJJI(3.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 4.0f);
        dij.LJIILL(8.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        C32856Cuy.LJ(dij);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        dij.LJIJ(30.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(37.0f, 42.0f);
        C32856Cuy.vm(dij);
        C32856Cuy.LJ(dij);
        C32856Cuy.mj(dij);
        C32856Cuy.LJJZZIII(dij);
        C32856Cuy.oj(dij);
        C32856Cuy.T7(dij);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
