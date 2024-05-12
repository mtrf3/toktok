package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33409D9h extends AbstractC39455Fe7 {
    public C33409D9h() {
        this.LIZJ.LJIIIIZZ(14.21f, 4.0f);
        this.LIZJ.LIZJ(7.2f, 7.2f, false, false, 7.0f, 11.18f);
        this.LIZJ.LJIILL(26.15f);
        this.LIZJ.LJ(7.0f, 41.02f, 10.0f, 44.0f, 13.7f, 44.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(25.24f);
        this.LIZJ.LJIIJ(1.14f, 0.0f, 2.06f, -0.92f, 2.06f, -2.05f);
        this.LIZJ.LJIILL(-2.07f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(13.98f);
        this.LIZJ.LJIIIZ(2.86f, 2.86f, true, true, 0.0f, -5.7f);
        C32856Cuy.S6(this.LIZJ);
        this.LIZJ.LJIJ(6.05f);
        this.LIZJ.LJ(41.0f, 4.92f, 40.08f, 4.0f, 38.94f, 4.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(14.2f);
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
