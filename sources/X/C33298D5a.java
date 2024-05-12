package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33298D5a extends AbstractC39455Fe7 {
    public C33298D5a() {
        this.LIZJ.LJIIIIZZ(7.35f, 6.47f);
        C32856Cuy.LLJJIII(this.LIZJ);
        this.LIZJ.LJII(40.6f, 40.42f);
        C32856Cuy.a4(this.LIZJ);
        C32856Cuy.u(this.LIZJ);
        C32856Cuy.y5(this.LIZJ);
        C32856Cuy.LIZIZ(this.LIZJ);
        this.LIZJ.LJ(43.7f, 31.0f, 45.52f, 26.95f, 46.0f, 24.5f);
        this.LIZJ.LJ(45.0f, 19.35f, 38.0f, 7.0f, 24.0f, 7.0f);
        this.LIZJ.LJIIJ(-3.49f, 0.0f, -6.54f, 0.77f, -9.17f, 2.0f);
        this.LIZJ.LJIIL(-4.65f, -4.65f);
        C32856Cuy.A5(this.LIZJ);
        this.LIZJ.LJII(7.34f, 6.47f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(14.3f, 9.34f);
        this.LIZJ.LJIIIZ(9.01f, 9.01f, false, true, 11.04f, 11.05f);
        this.LIZJ.LJII(21.64f, 15.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(2.0f, 24.5f);
        this.LIZJ.LJIIJ(0.5f, -2.56f, 2.48f, -6.9f, 6.06f, -10.61f);
        this.LIZJ.LJIIL(7.5f, 7.5f);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, false, false, 11.56f, 11.56f);
        this.LIZJ.LJIIL(6.73f, 6.72f);
        this.LIZJ.LIZJ(21.4f, 21.4f, false, true, 24.0f, 42.0f);
        this.LIZJ.LJ(10.0f, 42.0f, 3.0f, 29.65f, 2.0f, 24.5f);
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
