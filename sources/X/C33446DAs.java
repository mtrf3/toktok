package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33446DAs extends AbstractC39455Fe7 {
    public C33446DAs() {
        this.LIZJ.LJIIIIZZ(23.4f, 35.36f);
        this.LIZJ.LJII(6.7f, 18.56f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, true, 0.6f, -1.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(9.18f);
        this.LIZJ.LJIJ(2.79f);
        this.LIZJ.LJIIJ(0.0f, -0.44f, 0.35f, -0.79f, 0.79f, -0.79f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(13.46f);
        this.LIZJ.LJIIJ(0.43f, 0.0f, 0.79f, 0.35f, 0.79f, 0.8f);
        this.LIZJ.LJIILL(14.46f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(9.18f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, true, 0.6f, 1.3f);
        this.LIZJ.LJIIL(-16.7f, 16.8f);
        this.LIZJ.LJIIIZ(0.79f, 0.79f, false, true, -1.2f, 0.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.LLFF(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
