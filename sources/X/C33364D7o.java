package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33364D7o extends AbstractC39455Fe7 {
    public C33364D7o() {
        this.LIZJ.LJIIIIZZ(20.99f, 3.66f);
        this.LIZJ.LJIIJ(-2.2f, 1.01f, -3.85f, 4.09f, -7.16f, 10.24f);
        this.LIZJ.LJII(6.29f, 27.9f);
        this.LIZJ.LJIIJ(-3.03f, 5.63f, -4.54f, 8.45f, -4.26f, 10.75f);
        this.LIZJ.LJIIJ(0.26f, 2.0f, 1.33f, 3.82f, 2.98f, 5.0f);
        this.LIZJ.LJ(6.89f, 45.0f, 10.08f, 45.0f, 16.46f, 45.0f);
        this.LIZJ.LJIIJJI(15.08f);
        this.LIZJ.LJIIJ(6.38f, 0.0f, 9.57f, 0.0f, 11.45f, -1.35f);
        this.LIZJ.LJIIIZ(7.25f, 7.25f, false, false, 2.98f, -4.99f);
        this.LIZJ.LJIIJ(0.28f, -2.3f, -1.23f, -5.12f, -4.26f, -10.75f);
        this.LIZJ.LJII(34.17f, 13.9f);
        this.LIZJ.LJIIJ(-3.3f, -6.15f, -4.96f, -9.23f, -7.16f, -10.24f);
        this.LIZJ.LJIIIZ(7.2f, 7.2f, false, false, -6.02f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(21.0f, 28.0f);
        C32856Cuy.n9(this.LIZJ);
        C32856Cuy.T0(this.LIZJ);
        C32856Cuy.Rc(this.LIZJ);
        C32856Cuy.LLZZZZ(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.5f, 7.5f);
        C32856Cuy.en(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
