package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33338D6o extends AbstractC39455Fe7 {
    public C33338D6o() {
        C32856Cuy.R(this.LIZJ);
        this.LIZJ.LJIIJ(3.64f, 0.0f, 6.8f, 0.88f, 9.36f, 2.45f);
        this.LIZJ.LJIIL(-1.42f, 3.84f);
        this.LIZJ.LJ(24.87f, 31.8f, 22.2f, 31.0f, 19.0f, 31.0f);
        C32856Cuy.Sl(this.LIZJ);
        this.LIZJ.LJIIIIZZ(36.12f, 30.47f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -3.8f, -0.17f);
        this.LIZJ.LJIIL(-2.6f, 6.99f);
        C32856Cuy.B6(this.LIZJ);
        C32856Cuy.Zj(this.LIZJ);
        this.LIZJ.LJIIJJI(6.12f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.87f, -1.31f);
        this.LIZJ.LJIIL(0.9f, -2.44f);
        this.LIZJ.LJIIL(2.46f, 8.99f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 3.7f, 0.41f);
        this.LIZJ.LJIIL(3.01f, -5.65f);
        this.LIZJ.LJI(47.0f);
        C32856Cuy.xa(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-5.14f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.76f, 1.05f);
        this.LIZJ.LJIIL(-1.22f, 2.28f);
        this.LIZJ.LJIIL(-2.76f, -10.15f);
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
