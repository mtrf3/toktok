package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33492DCm extends AbstractC39455Fe7 {
    public C33492DCm() {
        this.LIZJ.LJIIIIZZ(9.0f, 12.5f);
        C32856Cuy.LLJJJJJIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(9.0f, 23.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        p.LJIIJJI(29.0f);
        p.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        p.LJIILL(2.0f);
        p.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        p.LJIIJJI(-29.0f);
        this.LIZJ.LIZJ(0.5f, 0.5f, false, true, 9.0f, 25.0f);
        C32856Cuy.d1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(9.0f, 33.5f);
        C32856Cuy.LLJJJJJIL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
