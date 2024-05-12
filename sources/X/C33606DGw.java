package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DGw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33606DGw extends AbstractC39455Fe7 {
    public C33606DGw() {
        this.LIZJ.LJIIIIZZ(25.3f, 4.85f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.59f, -1.11f);
        this.LIZJ.LJIIL(-1.85f, 0.73f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.11f, 2.6f);
        this.LIZJ.LJIIL(6.5f, 16.18f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, 1.5f);
        this.LIZJ.LJIIL(-6.5f, 16.17f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.11f, 2.6f);
        this.LIZJ.LJIIL(1.85f, 0.74f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.6f, -1.11f);
        this.LIZJ.LJIIL(7.39f, -18.4f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, -1.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-7.4f, -18.4f);
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
