package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33040Cxw extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33040Cxw() {
        this.LIZJ.LJIIIIZZ(15.0f, 26.4f);
        C32856Cuy.Zj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(12.62f);
        this.LIZJ.LJIIL(-2.98f, 3.43f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.1f, 1.41f);
        this.LIZJ.LJIIL(1.52f, 1.31f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.4f, -0.1f);
        this.LIZJ.LJIIL(6.42f, -7.4f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.3f);
        this.LIZJ.LJIIL(-6.41f, -7.4f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, -0.1f);
        this.LIZJ.LJIIL(-1.52f, 1.3f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.1f, 1.41f);
        this.LIZJ.LJIIL(2.98f, 3.44f);
        C32856Cuy.LLLLILI(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(9.0f, 42.5f);
        C32856Cuy.mj(dij);
        dij.LJIJ(14.58f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 1.7f, -3.27f);
        dij.LJIIL(7.27f, -5.09f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 2.3f, -0.72f);
        dij.LJIIJJI(15.02f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 2.22f, 0.67f);
        dij.LJIIL(7.7f, 5.14f);
        dij.LIZJ(4.0f, 4.0f, false, true, 43.0f, 14.64f);
        dij.LJIJ(38.5f);
        C32856Cuy.tg(dij);
        dij.LJIILIIL(-0.2f, -25.2f);
        dij.LJIILL(21.2f);
        dij.LJIIJ(0.0f, 0.11f, 0.09f, 0.2f, 0.2f, 0.2f);
        C32856Cuy.LJJIII(dij);
        dij.LJIIIZ(0.2f, 0.2f, false, false, 0.2f, -0.2f);
        dij.LJIJ(17.3f);
        dij.LJI(8.8f);
        dij.LIZLLL();
        dij.LJIILIIL(28.85f, -3.8f);
        dij.LJII(31.4f, 9.33f);
        dij.LJIIIZ(0.2f, 0.2f, false, false, -0.11f, -0.03f);
        dij.LJI(16.26f);
        dij.LJIIIZ(0.2f, 0.2f, false, false, -0.11f, 0.04f);
        dij.LJII(10.2f, 13.5f);
        dij.LJIIJJI(27.45f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
