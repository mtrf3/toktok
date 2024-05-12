package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.2G0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2G0 extends C47151t9 {
    public int LJLJJL;
    public boolean LJLJJLL;
    public Paint LJLJL;

    @Override // X.C45071pn, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LJLJJLL) {
            if (this.LJLJL == null) {
                Paint paint = new Paint(1);
                this.LJLJL = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            int LIZ = C0EL.LIZ(canvas, getWidth(), getHeight(), this.LJLJL);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(LIZ);
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // X.C47151t9, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public void setCutout(boolean z) {
        if (this.LJLJJLL != z) {
            this.LJLJJLL = z;
            invalidate();
        }
    }

    public void setIcon(int i) {
        C20110qd.LIZ(getContext(), i).getClass();
        throw null;
    }

    public void setIconSize(int i) {
        if (i == this.LJLJJL) {
            return;
        }
        this.LJLJJL = i;
        throw null;
    }

    public void setText(int i) {
        throw null;
    }

    public void setIcon(Drawable drawable) {
        drawable.getClass();
        throw null;
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            size = Math.min(size, 0);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), i2);
    }
}
