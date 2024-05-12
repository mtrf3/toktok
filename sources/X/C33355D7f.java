package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33355D7f extends AbstractC39455Fe7 {
    public C33355D7f() {
        this.LIZJ.LJIIIIZZ(2.0f, 13.74f);
        this.LIZJ.LJIIJJI(8.4f);
        this.LIZJ.LJIIL(4.88f, 12.78f);
        this.LIZJ.LJIIL(4.95f, -12.78f);
        this.LIZJ.LJIIJJI(8.17f);
        this.LIZJ.LJII(16.1f, 44.0f);
        this.LIZJ.LJI(7.87f);
        this.LIZJ.LJIIL(3.37f, -8.02f);
        this.LIZJ.LJII(2.0f, 13.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(35.91f, 10.21f);
        this.LIZJ.LJIIJJI(-9.15f);
        this.LIZJ.LJII(36.88f, 4.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(46.0f);
        this.LIZJ.LJIIL(-8.09f, 19.95f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-6.75f, 1.91f);
        this.LIZJ.LJIIJ(2.8f, 0.0f, 5.08f, 2.33f, 5.08f, 5.2f);
        this.LIZJ.LJIILJJIL(-2.27f, 5.2f, -5.08f, 5.2f, true);
        this.LIZJ.LJIIIZ(5.14f, 5.14f, false, true, -5.09f, -5.2f);
        this.LIZJ.LJIIJ(0.0f, -2.87f, 2.28f, -5.2f, 5.09f, -5.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-10550831);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
