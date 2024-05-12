package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33556DEy extends AbstractC39455Fe7 {
    public C33556DEy() {
        C32856Cuy.LLLILZ(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-2.83f, -2.83f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.4f, 0.0f);
        C32856Cuy.G1(this.LIZJ);
        C32856Cuy.Ek(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(2.83f, -2.83f);
        C32856Cuy.s2(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
