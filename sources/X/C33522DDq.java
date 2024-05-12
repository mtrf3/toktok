package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33522DDq extends AbstractC39455Fe7 {
    public C33522DDq() {
        this.LIZJ.LJIILIIL(12.05f, 22.89f);
        this.LIZJ.LJIIL(2.36f, -2.18f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.41f, 0.06f);
        this.LIZJ.LJIIL(1.35f, 1.45f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.07f, 1.43f);
        this.LIZJ.LJIIL(-5.74f, 5.15f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -2.77f, 0.0f);
        this.LIZJ.LJII(3.3f, 23.62f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.01f, -1.42f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(1.4f, -1.4f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJIIL(1.93f, 1.92f);
        this.LIZJ.LJIIIZ(16.0f, 16.0f, true, true, 5.56f, 13.45f);
        this.LIZJ.LJIIIZ(0.95f, 0.95f, false, true, -0.04f, -1.4f);
        this.LIZJ.LJIIL(1.39f, -1.43f);
        this.LIZJ.LJIIJ(0.38f, -0.4f, 1.01f, -0.4f, 1.44f, -0.05f);
        this.LIZJ.LJIIIZ(12.0f, 12.0f, true, false, -4.35f, -10.4f);
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
