package X;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: X.Vkb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80625Vkb extends AbstractC80624Vka {
    public C80625Vkb(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // X.AbstractC80624Vka, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C81939WDv.LIZIZ();
        if (this.LJLILLLLZI || this.LJLJI || this.LJLJJI > 0.0f) {
            LJ();
            LIZLLL();
            canvas.clipPath(this.LJLJJL);
            super.draw(canvas);
            C81939WDv.LIZIZ();
            return;
        }
        super.draw(canvas);
        C81939WDv.LIZIZ();
    }
}
