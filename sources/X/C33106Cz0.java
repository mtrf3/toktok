package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cz0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33106Cz0 extends AbstractC39455Fe7 {
    public C33106Cz0() {
        this.LIZJ.LJIIIIZZ(10.0f, 5.5f);
        C32856Cuy.J1(this.LIZJ);
        C32856Cuy.LJJIFFI(this.LIZJ);
        C32856Cuy.Gm(this.LIZJ);
        C32856Cuy.B1(this.LIZJ);
        C32856Cuy.X3(this.LIZJ);
        C32856Cuy.e1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(7.21f, 16.14f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 9.1f, 12.0f);
        this.LIZJ.LJIIJJI(29.8f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 1.89f, 4.14f);
        this.LIZJ.LJIIL(-8.8f, 10.1f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(43.5f);
        C32856Cuy.S1(this.LIZJ);
        this.LIZJ.LJIJ(26.25f);
        this.LIZJ.LJII(7.22f, 16.14f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(19.35f, 24.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(9.3f);
        this.LIZJ.LJIIL(6.96f, -8.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(12.39f);
        this.LIZJ.LJIIL(6.96f, 8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.0f, 28.0f);
        C32856Cuy.LJIIIZ(this.LIZJ);
        C32856Cuy.LJLJI(this.LIZJ);
        C32856Cuy.G0(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 28.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
