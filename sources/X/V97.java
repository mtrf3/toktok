package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes14.dex */
public final class V97 extends C80627Vkd {
    public final Matrix LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final Matrix LJLJLJ;
    public final RectF LJLJLLL;

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.LJLJL;
        if (i == 5 || i == 7 || this.LJLJJLL % 180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.LJLJL;
        if (i == 5 || i == 7 || this.LJLJJLL % 180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // X.C80627Vkd, X.InterfaceC80626Vkc
    public final void LJIIIZ(Matrix matrix) {
        LJIIL(matrix);
        if (!this.LJLJJL.isIdentity()) {
            matrix.preConcat(this.LJLJJL);
        }
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.LJLJJLL <= 0 && ((i = this.LJLJL) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.LJLJJL);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i;
        Drawable drawable = this.LJLIL;
        int i2 = this.LJLJJLL;
        if (i2 > 0 || ((i = this.LJLJL) != 0 && i != 1)) {
            int i3 = this.LJLJL;
            if (i3 != 2) {
                if (i3 != 7) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.LJLJJL.setRotate(i2, rect.centerX(), rect.centerY());
                        } else {
                            this.LJLJJL.setRotate(270.0f, rect.centerX(), rect.centerY());
                            this.LJLJJL.postScale(1.0f, -1.0f);
                        }
                    } else {
                        this.LJLJJL.setScale(1.0f, -1.0f);
                    }
                } else {
                    this.LJLJJL.setRotate(270.0f, rect.centerX(), rect.centerY());
                    this.LJLJJL.postScale(-1.0f, 1.0f);
                }
            } else {
                this.LJLJJL.setScale(-1.0f, 1.0f);
            }
            this.LJLJLJ.reset();
            this.LJLJJL.invert(this.LJLJLJ);
            this.LJLJLLL.set(rect);
            this.LJLJLJ.mapRect(this.LJLJLLL);
            RectF rectF = this.LJLJLLL;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            return;
        }
        drawable.setBounds(rect);
    }

    public V97(Drawable drawable, int i, int i2) {
        super(drawable);
        boolean z;
        this.LJLJLJ = new Matrix();
        this.LJLJLLL = new RectF();
        boolean z2 = false;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (i2 >= 0 && i2 <= 8) {
            z2 = true;
        }
        C32151Nz.LJI(z2);
        this.LJLJJL = new Matrix();
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }
}
