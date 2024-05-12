package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33451DAx extends AbstractC39455Fe7 {
    public C33451DAx() {
        this.LIZJ.LJIIIIZZ(22.76f, 26.0f);
        this.LIZJ.LJIIJ(0.0f, 7.17f, 5.84f, 13.0f, 13.0f, 13.0f);
        this.LIZJ.LJIIJ(7.17f, 0.0f, 13.0f, -5.83f, 13.0f, -13.0f);
        this.LIZJ.LJIILJJIL(-5.83f, -13.0f, -13.0f, -13.0f, true);
        this.LIZJ.LJIIJ(-7.16f, 0.0f, -13.0f, 5.83f, -13.0f, 13.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.12f, 0.11f);
        this.LIZJ.LJIIJ(0.0f, -5.51f, 4.48f, -10.0f, 10.0f, -10.0f);
        this.LIZJ.LJIIJ(5.51f, 0.0f, 10.0f, 4.49f, 10.0f, 10.0f);
        this.LIZJ.LJIIJ(0.0f, 5.52f, -4.49f, 10.0f, -10.0f, 10.0f);
        this.LIZJ.LJIIJ(-5.52f, 0.0f, -10.0f, -4.48f, -10.0f, -10.0f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 35.0f);
        C32856Cuy.Y1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(49.0f, 35.0f);
        C32856Cuy.Y1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(54.53f, 58.0f);
        this.LIZJ.LIZJ(19.0f, 19.0f, false, false, 17.0f, 58.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(3.05f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, false, true, 31.43f, 0.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(3.05f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(20.8f, 46.27f);
        this.LIZJ.LIZJ(14.0f, 14.0f, false, false, 1.0f, 58.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(3.01f);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, true, 14.75f, -9.33f);
        this.LIZJ.LJIIJ(0.62f, -0.85f, 1.3f, -1.65f, 2.04f, -2.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(32.05f, 2.52f);
        this.LIZJ.LJIIIZ(21.1f, 21.1f, false, false, -2.0f, -2.4f);
        this.LIZJ.LIZJ(14.0f, 14.0f, false, true, 70.93f, 58.0f);
        C32856Cuy.LJ(this.LIZJ);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, false, -15.07f, -9.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
