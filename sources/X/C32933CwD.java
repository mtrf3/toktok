package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32933CwD extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32933CwD() {
        this.LIZJ.LJIIIIZZ(18.0f, 33.08f);
        C32856Cuy.Jb(this.LIZJ);
        this.LIZJ.LJIIJJI(7.16f);
        C32856Cuy.Vg(this.LIZJ);
        this.LIZJ.LJ(37.53f, 5.0f, 36.4f, 5.0f, 35.08f, 5.0f);
        this.LIZJ.LJIIJJI(-7.16f);
        C32856Cuy.Vk(this.LIZJ);
        this.LIZJ.LJIIJ(-0.07f, 0.92f, -0.07f, 2.04f, -0.07f, 3.37f);
        this.LIZJ.LJIIJ(0.0f, 0.32f, 0.26f, 0.58f, 0.58f, 0.58f);
        C32856Cuy.U0(this.LIZJ);
        this.LIZJ.LJ(25.6f, 9.0f, 26.57f, 9.0f, 28.0f, 9.0f);
        C32856Cuy.F0(this.LIZJ);
        C32856Cuy.Bg(this.LIZJ);
        C32856Cuy.LJIIIIZZ(this.LIZJ);
        C32856Cuy.ng(this.LIZJ);
        this.LIZJ.LJ(22.0f, 35.4f, 22.0f, 34.43f, 22.0f, 33.0f);
        C32856Cuy.LLJJIJI(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-2.92f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.58f, 0.58f, false, false, -0.58f, 0.58f);
        p2.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(13.3f, 13.3f);
        C32856Cuy.m17do(dij);
        dij.LJII(8.83f, 26.0f);
        C32856Cuy.H6(dij);
        C32856Cuy.xa(dij);
        dij.LJI(8.83f);
        C32856Cuy.pl(dij);
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
