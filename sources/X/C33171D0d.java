package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33171D0d extends AbstractC39455Fe7 {
    public C33171D0d() {
        C32856Cuy.R(this.LIZJ);
        this.LIZJ.LJIIJ(3.37f, 0.0f, 6.33f, 0.75f, 8.78f, 2.11f);
        this.LIZJ.LJIIJ(-0.5f, 0.97f, -0.78f, 2.06f, -0.78f, 3.22f);
        C32856Cuy.z1(this.LIZJ);
        this.LIZJ.LJIIJ(-2.07f, -1.5f, -4.75f, -2.33f, -8.0f, -2.33f);
        this.LIZJ.LJIIJ(-8.08f, 0.0f, -12.68f, 5.16f, -12.98f, 13.0f);
        this.LIZJ.LJIIJ(-0.02f, 0.55f, -0.46f, 1.0f, -1.02f, 1.0f);
        C32856Cuy.Sn(this.LIZJ);
        this.LIZJ.LJIIIIZZ(46.0f, 24.66f);
        this.LIZJ.LJIIIZ(2.25f, 2.25f, false, false, -3.94f, -1.49f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-4.84f, 5.49f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.5f, 0.67f);
        C32856Cuy.L6(this.LIZJ);
        C32856Cuy.hl(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(5.95f);
        C32856Cuy.jl(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(1.83f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.0f, 2.0f, false, true, 1.44f, 0.61f);
        this.LIZJ.LJIIL(4.86f, 5.05f);
        this.LIZJ.LIZJ(2.25f, 2.25f, false, false, 46.0f, 45.38f);
        DIK.LIZIZ(this.LIZJ, "p", 24.66f);
        this.LIZJ.LJIILIIL(-5.78f, 6.64f);
        this.LIZJ.LJII(42.0f, 29.3f);
        this.LIZJ.LJIILL(11.75f);
        this.LIZJ.LJIIL(-1.85f, -1.92f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -4.32f, -1.84f);
        C32856Cuy.M6(this.LIZJ);
        this.LIZJ.LJIILL(-3.95f);
        this.LIZJ.LJIIJJI(0.72f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, 4.5f, -2.03f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
