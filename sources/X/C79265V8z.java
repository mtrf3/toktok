package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.V8z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79265V8z extends C80627Vkd {
    public InterfaceC78716Uuu LJLJJL;
    public Object LJLJJLL;
    public PointF LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public Matrix LJLL;
    public final Matrix LJLLI;

    public final void LJIILJJIL() {
        float f;
        float f2;
        Drawable drawable = this.LJLIL;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.LJLJLJ = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.LJLJLLL = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.LJLL = null;
            return;
        }
        if (intrinsicWidth == width && intrinsicHeight == height) {
            drawable.setBounds(bounds);
            this.LJLL = null;
            return;
        }
        if (this.LJLJJL == InterfaceC78716Uuu.LJJJLZIJ) {
            drawable.setBounds(bounds);
            this.LJLL = null;
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        InterfaceC78716Uuu interfaceC78716Uuu = this.LJLJJL;
        Matrix matrix = this.LJLLI;
        PointF pointF = this.LJLJL;
        if (pointF != null) {
            f = pointF.x;
            f2 = pointF.y;
        } else {
            f = 0.5f;
            f2 = 0.5f;
        }
        interfaceC78716Uuu.LJJJJI(f, f2, intrinsicWidth, intrinsicHeight, bounds, matrix);
        this.LJLL = this.LJLLI;
    }

    public final void LJIILL() {
        boolean z;
        InterfaceC78716Uuu interfaceC78716Uuu = this.LJLJJL;
        if (interfaceC78716Uuu instanceof InterfaceC79079V1v) {
            Object state = ((InterfaceC79079V1v) interfaceC78716Uuu).getState();
            if (state == null || !state.equals(this.LJLJJLL)) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJJLL = state;
        } else {
            z = false;
        }
        if (this.LJLJLJ != this.LJLIL.getIntrinsicWidth() || this.LJLJLLL != this.LJLIL.getIntrinsicHeight() || z) {
            LJIILJJIL();
        }
    }

    @Override // X.C80627Vkd, X.InterfaceC80626Vkc
    public final void LJIIIZ(Matrix matrix) {
        LJIIL(matrix);
        LJIILL();
        Matrix matrix2 = this.LJLL;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // X.C80627Vkd
    public final Drawable LJIILIIL(Drawable drawable) {
        Drawable LJIILIIL = super.LJIILIIL(drawable);
        LJIILJJIL();
        return LJIILIIL;
    }

    public final void LJIILLIIL(PointF pointF) {
        if (C81256Vum.LIZ(this.LJLJL, pointF)) {
            return;
        }
        if (this.LJLJL == null) {
            this.LJLJL = new PointF();
        }
        this.LJLJL.set(pointF);
        LJIILJJIL();
        invalidateSelf();
    }

    public final void LJIIZILJ(InterfaceC78716Uuu interfaceC78716Uuu) {
        if (C81256Vum.LIZ(this.LJLJJL, interfaceC78716Uuu)) {
            return;
        }
        this.LJLJJL = interfaceC78716Uuu;
        this.LJLJJLL = null;
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        LJIILL();
        if (this.LJLL != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.LJLL);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // X.C80627Vkd, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        LJIILJJIL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79265V8z(Drawable drawable, InterfaceC78716Uuu interfaceC78716Uuu) {
        super(drawable);
        drawable.getClass();
        this.LJLJL = null;
        this.LJLJLJ = 0;
        this.LJLJLLL = 0;
        this.LJLLI = new Matrix();
        this.LJLJJL = interfaceC78716Uuu;
    }
}
