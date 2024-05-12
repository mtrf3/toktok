package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes14.dex */
public final class V90 extends C80627Vkd {
    public int LJLJJL;
    public int LJLJJLL;

    public final void LJIILJJIL() {
        Drawable drawable = this.LJLIL;
        Rect bounds = getBounds();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.LJLJJL = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.LJLJJLL = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }

    @Override // X.C80627Vkd, X.InterfaceC80626Vkc
    public final void LJIIIZ(Matrix matrix) {
        LJIIL(matrix);
    }

    @Override // X.C80627Vkd
    public final Drawable LJIILIIL(Drawable drawable) {
        Drawable LJIILIIL = super.LJIILIIL(drawable);
        LJIILJJIL();
        return LJIILIIL;
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LJLJJL != this.LJLIL.getIntrinsicWidth() || this.LJLJJLL != this.LJLIL.getIntrinsicHeight()) {
            LJIILJJIL();
        }
        super.draw(canvas);
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LJIILJJIL();
    }
}
