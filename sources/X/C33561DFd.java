package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33561DFd extends AbstractC39455Fe7 {
    public C33561DFd() {
        C32856Cuy.s1(this.LIZJ);
        this.LIZJ.LJIILIIL(0.99f, 12.78f);
        C32856Cuy.Ao(this.LIZJ);
        this.LIZJ.LJIILIIL(6.6f, 2.25f);
        this.LIZJ.LJIIJ(1.22f, 0.0f, 2.2f, -1.01f, 2.2f, -2.25f);
        this.LIZJ.LJIILJJIL(-0.98f, -2.25f, -2.2f, -2.25f, true);
        this.LIZJ.LJIIJ(-1.21f, 0.0f, -2.2f, 1.0f, -2.2f, 2.25f);
        this.LIZJ.LJIIJ(0.0f, 1.24f, 0.99f, 2.25f, 2.2f, 2.25f);
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
