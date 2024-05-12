package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33520DDo extends AbstractC39455Fe7 {
    public C33520DDo() {
        C32856Cuy.zo(this.LIZJ);
        this.LIZJ.LJIILIIL(25.0f, 8.0f);
        C32856Cuy.rh(this.LIZJ);
        this.LIZJ.LJIILIIL(-4.0f, -19.0f);
        C32856Cuy.LLFZ(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(14.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.T(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
