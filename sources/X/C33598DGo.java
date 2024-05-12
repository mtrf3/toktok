package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33598DGo extends AbstractC39455Fe7 {
    public C33598DGo() {
        C32856Cuy.t3(this.LIZJ);
        this.LIZJ.LJIILIIL(-11.0f, 10.0f);
        C32856Cuy.fo(this.LIZJ);
        this.LIZJ.LJIILIIL(-23.0f, 10.0f);
        C32856Cuy.LJJLIIIJLLLLLLLZ(this.LIZJ);
        this.LIZJ.LJIILIIL(23.0f, 10.0f);
        C32856Cuy.fo(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
