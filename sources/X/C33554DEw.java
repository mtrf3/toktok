package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33554DEw extends AbstractC39455Fe7 {
    public C33554DEw() {
        this.LIZJ.LJIIIIZZ(31.21f, 35.46f);
        this.LIZJ.LJIIIZ(17.0f, 17.0f, true, true, 4.24f, -4.24f);
        this.LIZJ.LJIIL(8.96f, 8.95f);
        C32856Cuy.wk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-2.82f, 2.83f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJIIL(-8.96f, -8.96f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(32.9f, 21.5f);
        this.LIZJ.LJIIIZ(11.4f, 11.4f, true, true, -22.8f, 0.0f);
        this.LIZJ.LJIIIZ(11.4f, 11.4f, false, true, 22.8f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
