package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33365D7p extends AbstractC39455Fe7 {
    public C33365D7p() {
        this.LIZJ.LJIIIIZZ(23.81f, 4.0f);
        C32856Cuy.LJLILLLLZI(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 1.1f, 0.89f, 2.0f, 1.98f, 2.0f);
        C32856Cuy.R6(this.LIZJ);
        C32856Cuy.LJLJLJ(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 2.2f, -1.77f, 4.0f, -3.95f, 4.0f);
        this.LIZJ.LJIIJJI(-24.1f);
        this.LIZJ.LIZJ(3.98f, 3.98f, false, true, 8.0f, 40.0f);
        C32856Cuy.f(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -2.2f, 1.77f, -4.0f, 3.95f, -4.0f);
        this.LIZJ.LJIIJJI(11.86f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(4.15f, 1.07f);
        this.LIZJ.LJIIL(10.56f, 9.92f);
        this.LIZJ.LJIIJJI(-9.77f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.98f, -0.88f);
        this.LIZJ.LJIJ(4.9f);
        this.LIZJ.LJIIL(0.2f, 0.17f);
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
