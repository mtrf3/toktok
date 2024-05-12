package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33519DDn extends AbstractC39455Fe7 {
    public C33519DDn() {
        this.LIZJ.LJIIIIZZ(21.0f, 7.0f);
        C32856Cuy.T0(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(23.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LLZZZZ(this.LIZJ);
        C32856Cuy.R9(this.LIZJ);
        this.LIZJ.LJIIIIZZ(21.0f, 36.0f);
        C32856Cuy.T0(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(4.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LLZZZZ(this.LIZJ);
        C32856Cuy.f1(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
