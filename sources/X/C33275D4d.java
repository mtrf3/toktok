package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33275D4d extends AbstractC39455Fe7 {
    public C33275D4d() {
        this.LIZJ.LJIIIIZZ(6.85f, 10.9f);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, true, 9.0f, 10.0f);
        C32856Cuy.LJJIII(this.LIZJ);
        C32856Cuy.fl(this.LIZJ);
        C32856Cuy.LJLJLJ(this.LIZJ);
        C32856Cuy.k2(this.LIZJ);
        C32856Cuy.k9(this.LIZJ);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 0.85f, -2.1f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.6f, 12.0f);
        this.LIZJ.LJIIL(13.76f, 11.64f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.3f, 0.0f);
        this.LIZJ.LJII(38.4f, 12.0f);
        DIL.LIZ(this.LIZJ, "p", 9.6f);
        this.LIZJ.LJIIIIZZ(40.0f, 13.28f);
        this.LIZJ.LJIIL(-14.06f, 11.9f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, -3.88f, 0.0f);
        this.LIZJ.LJII(8.0f, 13.27f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(34.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(30.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        this.LIZJ.LJIJ(13.28f);
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
