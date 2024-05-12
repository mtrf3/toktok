package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33283D4l extends AbstractC39455Fe7 {
    public C33283D4l() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 5.0f);
        C32856Cuy.Pc(this.LIZJ);
        C32856Cuy.LJJIII(this.LIZJ);
        C32856Cuy.Lf(this.LIZJ);
        C32856Cuy.m9(this.LIZJ);
        C32856Cuy.Jf(this.LIZJ);
        this.LIZJ.LJI(24.1f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -1.26f, -0.28f);
        this.LIZJ.LJIIL(-4.5f, -2.08f);
        this.LIZJ.LIZJ(7.0f, 7.0f, false, false, 15.4f, 5.0f);
        C32856Cuy.Y6(this.LIZJ);
        this.LIZJ.LJIILIIL(22.92f, 18.92f);
        this.LIZJ.LJIIJ(0.83f, 0.48f, 0.83f, 1.68f, 0.0f, 2.16f);
        this.LIZJ.LJIIL(-11.88f, 6.86f);
        this.LIZJ.LJIIIZ(1.25f, 1.25f, false, true, -1.87f, -1.08f);
        this.LIZJ.LJIJ(18.14f);
        this.LIZJ.LJIIJ(0.0f, -0.96f, 1.04f, -1.56f, 1.87f, -1.08f);
        this.LIZJ.LJIIL(11.88f, 6.86f);
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
