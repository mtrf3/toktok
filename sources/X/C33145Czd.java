package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33145Czd extends AbstractC39455Fe7 {
    public C33145Czd() {
        this.LIZJ.LJIIIIZZ(8.5f, 4.5f);
        C32856Cuy.rj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(31.0f);
        C32856Cuy.tj(this.LIZJ);
        C32856Cuy.LJJIIJ(this.LIZJ);
        C32856Cuy.sj(this.LIZJ);
        this.LIZJ.LJIILL(-31.0f);
        C32856Cuy.qj(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", -31.0f);
        C32856Cuy.J0(this.LIZJ);
        C32856Cuy.LJJIIJ(this.LIZJ);
        this.LIZJ.LJIILL(23.12f);
        this.LIZJ.LJIIL(-18.07f, -9.25f);
        this.LIZJ.LJIIL(-0.07f, -0.02f);
        this.LIZJ.LJIIJ(-3.02f, -1.21f, -6.11f, -1.05f, -8.54f, 1.27f);
        this.LIZJ.LJIIL(-0.02f, 0.02f);
        this.LIZJ.LJIIL(-4.3f, 3.73f);
        C32856Cuy.LLZZLLIL(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, 24.0f);
        this.LIZJ.LJIIL(7.1f, -6.0f);
        this.LIZJ.LJIIJ(1.0f, -0.94f, 2.28f, -1.22f, 4.21f, -0.47f);
        this.LIZJ.LJII(39.5f, 36.11f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(3.39f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-31.0f);
        C78269Unh.LIZJ(this.LIZJ, "p", -7.0f);
        this.LIZJ.LJIILIIL(22.0f, -10.5f);
        C32856Cuy.Ah(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
