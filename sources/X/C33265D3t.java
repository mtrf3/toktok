package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33265D3t extends AbstractC39455Fe7 {
    public C33265D3t() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(4.0f, 23.0f);
        this.LIZJ.LJIIIZ(20.0f, 20.0f, true, true, 40.0f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(20.0f);
        C32856Cuy.LLLLLLLLLL(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 23.0f);
        this.LIZJ.LJIILIIL(14.5f, 16.0f);
        C32856Cuy.LJIIL(this.LIZJ);
        this.LIZJ.LJIJ(24.75f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, true, false, -11.0f, -0.25f);
        DIK.LIZIZ(this.LIZJ, "p", 39.0f);
        this.LIZJ.LJIILIIL(4.83f, -23.98f);
        this.LIZJ.LIZJ(10.75f, 10.75f, false, false, 8.0f, 24.75f);
        C32856Cuy.M9(this.LIZJ);
        C32856Cuy.p0(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(24.5f);
        this.LIZJ.LJIIIZ(9.5f, 9.5f, false, true, 8.83f, -9.48f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(10.12f, 8.47f);
        this.LIZJ.LJIIJ(0.03f, 0.33f, 0.05f, 0.67f, 0.05f, 1.01f);
        C32856Cuy.M9(this.LIZJ);
        C32856Cuy.R6(this.LIZJ);
        C32856Cuy.v9(this.LIZJ);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, false, false, -26.57f, -12.01f);
        this.LIZJ.LJIIIZ(14.75f, 14.75f, false, true, 20.02f, 12.5f);
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
