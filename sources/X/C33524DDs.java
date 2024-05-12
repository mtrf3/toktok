package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33524DDs extends AbstractC39455Fe7 {
    public C33524DDs() {
        C32856Cuy.LLJI(this.LIZJ);
        this.LIZJ.LJIILIIL(-4.34f, -32.38f);
        this.LIZJ.LJIIL(14.62f, 8.88f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, true, 0.0f, 3.0f);
        this.LIZJ.LJIIL(-14.62f, 8.88f);
        this.LIZJ.LJIIIZ(1.75f, 1.75f, false, true, -2.66f, -1.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(15.12f);
        this.LIZJ.LJIIJ(0.0f, -1.36f, 1.5f, -2.2f, 2.66f, -1.5f);
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
