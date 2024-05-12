package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5D7, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5D7 extends AppCompatImageView {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final Path LJLJJL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(this.LJLILLLLZI, this.LJLJJI) + Math.max(this.LJLIL, this.LJLJI);
        int max2 = Math.max(this.LJLJI, this.LJLJJI) + Math.max(this.LJLIL, this.LJLILLLLZI);
        if (width >= max && height > max2) {
            this.LJLJJL.reset();
            this.LJLJJL.moveTo(this.LJLIL, 0.0f);
            this.LJLJJL.lineTo(width - this.LJLILLLLZI, 0.0f);
            float f = width;
            this.LJLJJL.quadTo(f, 0.0f, f, this.LJLILLLLZI);
            this.LJLJJL.lineTo(f, height - this.LJLJJI);
            float f2 = height;
            this.LJLJJL.quadTo(f, f2, width - this.LJLJJI, f2);
            this.LJLJJL.lineTo(this.LJLJI, f2);
            this.LJLJJL.quadTo(0.0f, f2, 0.0f, height - this.LJLJI);
            this.LJLJJL.lineTo(0.0f, this.LJLIL);
            this.LJLJJL.quadTo(0.0f, 0.0f, this.LJLIL, 0.0f);
            canvas.clipPath(this.LJLJJL);
        }
        super.onDraw(canvas);
    }

    public C5D7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = new Path();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bp2, R.attr.bp3, R.attr.bp4, R.attr.bp5, R.attr.bp6});
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.LJLIL = dimensionPixelOffset2;
            int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
            this.LJLILLLLZI = dimensionPixelOffset3;
            int dimensionPixelOffset4 = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            this.LJLJI = dimensionPixelOffset4;
            int dimensionPixelOffset5 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            this.LJLJJI = dimensionPixelOffset5;
            if (dimensionPixelOffset2 == 0) {
                this.LJLIL = dimensionPixelOffset;
            }
            if (dimensionPixelOffset3 == 0) {
                this.LJLILLLLZI = dimensionPixelOffset;
            }
            if (dimensionPixelOffset4 == 0) {
                this.LJLJI = dimensionPixelOffset;
            }
            if (dimensionPixelOffset5 == 0) {
                this.LJLJJI = dimensionPixelOffset;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
