package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33454DBa extends AbstractC39455Fe7 {
    public C33454DBa() {
        this.LIZJ.LJIIIIZZ(3.5f, 21.44f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJ(3.5f, 11.47f, 13.04f, 4.0f, 24.0f, 4.0f);
        this.LIZJ.LJIILJJIL(20.5f, 7.47f, 20.5f, 17.44f, true);
        this.LIZJ.LJIIJ(0.0f, 5.85f, -2.93f, 10.69f, -6.47f, 14.37f);
        C32856Cuy.xi(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(11.79f, 3.07f);
        C32856Cuy.f3(this.LIZJ);
        this.LIZJ.LJIILIIL(8.71f, 0.0f);
        C32856Cuy.f3(this.LIZJ);
        this.LIZJ.LJIILIIL(11.27f, -2.56f);
        this.LIZJ.LJIIIZ(2.56f, 2.56f, true, false, -5.12f, 0.0f);
        this.LIZJ.LJIIIZ(2.56f, 2.56f, false, false, 5.12f, 0.0f);
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
