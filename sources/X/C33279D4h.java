package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33279D4h extends AbstractC39455Fe7 {
    public C33279D4h() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(6.0f, 23.0f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, 36.0f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(18.0f);
        p2.LJI(6.0f);
        DIK.LIZIZ(this.LIZJ, "p", 23.0f);
        this.LIZJ.LJIILIIL(12.63f, 15.0f);
        this.LIZJ.LJIIJJI(10.75f);
        this.LIZJ.LJIJ(24.6f);
        this.LIZJ.LJIIJ(0.0f, -0.28f, -0.02f, -0.55f, -0.04f, -0.83f);
        this.LIZJ.LJIIIZ(5.38f, 5.38f, false, false, -10.71f, 0.6f);
        DIK.LIZIZ(this.LIZJ, "p", 38.0f);
        this.LIZJ.LJIILIIL(6.06f, -21.97f);
        this.LIZJ.LIZJ(10.19f, 10.19f, false, false, 9.0f, 24.6f);
        C32856Cuy.L9(this.LIZJ);
        this.LIZJ.LJIIJJI(6.63f);
        this.LIZJ.LJIJ(24.37f);
        this.LIZJ.LJIIIZ(8.37f, 8.37f, false, true, 9.06f, -8.34f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.64f, 7.45f);
        this.LIZJ.LJIIJ(0.03f, 0.3f, 0.05f, 0.6f, 0.05f, 0.9f);
        C32856Cuy.L9(this.LIZJ);
        C32856Cuy.Q6(this.LIZJ);
        C32856Cuy.v9(this.LIZJ);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, false, -26.27f, -9.9f);
        this.LIZJ.LJIIIZ(13.19f, 13.19f, false, true, 19.6f, 10.38f);
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
