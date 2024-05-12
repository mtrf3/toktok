package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33588DGe extends AbstractC39455Fe7 {
    public C33588DGe() {
        C32856Cuy.t3(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(0.0f, 10.0f);
        C32856Cuy.Oh(this.LIZJ);
        this.LIZJ.LJIILIIL(-34.0f, 10.0f);
        C32856Cuy.LJJLIIIJLLLLLLLZ(this.LIZJ);
        this.LIZJ.LJIILIIL(34.0f, 10.0f);
        C32856Cuy.Oh(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
