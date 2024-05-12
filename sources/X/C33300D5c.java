package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33300D5c extends AbstractC39455Fe7 {
    public C33300D5c() {
        this.LIZJ.LJIIIIZZ(2.5f, 12.0f);
        this.LIZJ.LIZJ(9.5f, 9.5f, false, true, 12.0f, 2.5f);
        C32856Cuy.LJIL(this.LIZJ);
        this.LIZJ.LJIIIZ(9.5f, 9.5f, false, true, 9.5f, 9.5f);
        C32856Cuy.LJLLI(this.LIZJ);
        this.LIZJ.LJIIIZ(9.5f, 9.5f, false, true, -9.5f, 9.5f);
        C32856Cuy.n6(this.LIZJ);
        this.LIZJ.LIZJ(9.5f, 9.5f, false, true, 2.5f, 36.0f);
        C32856Cuy.LLZLLIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(12.0f, 5.5f);
        this.LIZJ.LIZJ(6.5f, 6.5f, false, false, 5.5f, 12.0f);
        C32856Cuy.LJLLI(this.LIZJ);
        C32856Cuy.Cc(this.LIZJ);
        C32856Cuy.LJIL(this.LIZJ);
        this.LIZJ.LJIIIZ(6.5f, 6.5f, false, false, 6.5f, -6.5f);
        C32856Cuy.j9(this.LIZJ);
        this.LIZJ.LIZJ(6.5f, 6.5f, false, false, 36.0f, 5.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(12.0f);
        p.LIZLLL();
        p.LJIILIIL(10.2f, 9.0f);
        this.LIZJ.LJIIIZ(7.7f, 7.7f, true, false, 0.0f, 15.4f);
        this.LIZJ.LJIIIZ(7.7f, 7.7f, false, false, 0.0f, -15.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-10.7f, 7.7f);
        this.LIZJ.LJIIIZ(10.7f, 10.7f, true, true, 19.25f, 6.43f);
        this.LIZJ.LJIIL(5.6f, 5.6f);
        C32856Cuy.L3(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-5.6f, -5.6f);
        this.LIZJ.LIZJ(10.7f, 10.7f, false, true, 11.5f, 22.2f);
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
