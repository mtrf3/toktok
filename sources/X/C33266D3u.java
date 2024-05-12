package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33266D3u extends AbstractC39455Fe7 {
    public C33266D3u() {
        this.LIZJ.LJIIIIZZ(9.02f, 21.18f);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, true, 29.96f, 0.0f);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, false, 37.0f, 24.0f);
        C32856Cuy.D1(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.75f, 0.27f, 1.43f, 0.72f, 1.95f);
        this.LIZJ.LJIIL(-2.6f, 6.77f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 33.25f, 39.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(29.6f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -2.6f, -1.5f);
        C32856Cuy.LJII(this.LIZJ);
        C32856Cuy.hl(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(1.0f);
        p2.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, 3.0f);
        C32856Cuy.E0(this.LIZJ);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, 2.6f, -1.5f);
        this.LIZJ.LJIIJJI(3.65f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, 5.6f, -3.85f);
        this.LIZJ.LJII(41.6f, 32.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(0.4f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -3.0f);
        p4.LJIILL(-5.0f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -2.02f, -2.84f);
        this.LIZJ.LJIIIZ(19.0f, 19.0f, false, false, -37.96f, 0.0f);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, false, 3.0f, 24.0f);
        C32856Cuy.D1(this.LIZJ);
        C32856Cuy.jl(this.LIZJ);
        C32856Cuy.z0(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -3.0f);
        p5.LJIILL(-5.0f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -1.98f, -2.82f);
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
