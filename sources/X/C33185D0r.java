package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33185D0r extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33185D0r() {
        this.LIZJ.LJIIIIZZ(5.67f, 22.67f);
        this.LIZJ.LJIIIZ(17.0f, 17.0f, false, true, 17.0f, -17.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.66f);
        this.LIZJ.LJIIIZ(17.0f, 17.0f, false, true, 17.0f, 17.0f);
        C32856Cuy.M4(this.LIZJ);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, false, -15.0f, -15.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-2.66f);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, false, -15.0f, 15.0f);
        C32856Cuy.M4(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Zc(dij);
        dij.LJIILIIL(2.0f, 0.0f);
        dij.LJIILL(12.0f);
        dij.LJIIJJI(2.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        C32856Cuy.LJJZZIII(dij);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        dij.LJIIJJI(-2.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(33.0f, 27.0f);
        C32856Cuy.LLLZLL(dij);
        C32856Cuy.LLIZ(dij);
        C32856Cuy.z0(dij);
        C32856Cuy.LJLIL(dij);
        dij.LJIIJJI(-2.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        dij.LJIILL(-8.0f);
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
