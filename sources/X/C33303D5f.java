package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33303D5f extends AbstractC39455Fe7 {
    public C33303D5f() {
        this.LIZJ.LJIIIIZZ(8.0f, 22.0f);
        this.LIZJ.LJIIJ(0.0f, -6.85f, 6.8f, -13.0f, 16.0f, -13.0f);
        this.LIZJ.LJIILJJIL(16.0f, 6.15f, 16.0f, 13.0f, true);
        this.LIZJ.LJIIJ(0.0f, 4.3f, -2.14f, 8.07f, -5.2f, 11.24f);
        this.LIZJ.LIZJ(34.6f, 34.6f, false, true, 28.0f, 38.6f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(35.0f);
        p.LJIIJJI(-4.0f);
        this.LIZJ.LJIIJ(-9.2f, 0.0f, -16.0f, -6.15f, -16.0f, -13.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.r7(this.LIZJ);
        this.LIZJ.LJ(13.31f, 5.0f, 4.0f, 12.29f, 4.0f, 22.0f);
        this.LIZJ.LJIILJJIL(9.31f, 17.0f, 20.0f, 17.0f, true);
        C32856Cuy.B1(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.9f, 1.79f);
        this.LIZJ.LIZJ(40.65f, 40.65f, false, false, 37.7f, 36.0f);
        this.LIZJ.LJ(41.13f, 32.43f, 44.0f, 27.71f, 44.0f, 22.0f);
        this.LIZJ.LJIIJ(0.0f, -9.71f, -9.31f, -17.0f, -20.0f, -17.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-6.0f, 17.5f);
        C32856Cuy.Q3(this.LIZJ);
        this.LIZJ.LJIILIIL(8.5f, 0.0f);
        C32856Cuy.Q3(this.LIZJ);
        this.LIZJ.LJIILIIL(6.0f, 2.5f);
        C32856Cuy.ug(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
