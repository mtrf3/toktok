package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aPe, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93362aPe extends Drawable {
    public final Drawable LIZ;
    public final Drawable LIZIZ;
    public int LIZJ = -1;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C93362aPe(Context context) {
        this.LIZIZ = C04270Et.LIZIZ(context, R.drawable.df1);
        this.LIZ = C04270Et.LIZIZ(context, R.drawable.df2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LIZIZ.draw(canvas);
        canvas.drawColor(this.LIZJ, PorterDuff.Mode.SRC_IN);
        this.LIZ.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.LIZIZ.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        this.LIZIZ.setBounds(rect);
        this.LIZ.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        this.LIZIZ.setBounds(i, i2, i3, i4);
        this.LIZ.setBounds(i, i2, i3, i4);
    }
}
