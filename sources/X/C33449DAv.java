package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33449DAv extends AbstractC39455Fe7 {
    public C33449DAv() {
        this.LIZJ.LJIIIIZZ(32.0f, 32.93f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(38.0f);
        p.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p.LJI(18.0f);
        p.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        this.LIZJ.LJIILL(-5.07f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, true, true, 16.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.17f, -13.18f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 0.0f, -2.5f);
        this.LIZJ.LJIIL(-9.0f, -6.0f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -2.33f, 1.25f);
        C32856Cuy.LJLIL(this.LIZJ);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 2.33f, 1.25f);
        this.LIZJ.LJIIL(9.0f, -6.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(19.0f, 42.0f);
        C32856Cuy.c7(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
