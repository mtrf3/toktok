package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.Sii, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72864Sii extends AppCompatImageView {
    public final void LIZ() {
        float f;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        Matrix imageMatrix = getImageMatrix();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth * height > intrinsicHeight * width) {
            f = height / intrinsicHeight;
        } else {
            f = width / intrinsicWidth;
        }
        imageMatrix.setScale(f, f);
        setImageMatrix(imageMatrix);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public C72864Sii(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        LIZ();
        return super.setFrame(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LIZ();
    }
}
