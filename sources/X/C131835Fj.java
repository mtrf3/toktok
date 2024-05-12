package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5Fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C131835Fj extends FrameLayout {
    public float[] LJLIL;
    public Paint LJLILLLLZI;
    public RectF LJLJI;
    public Path LJLJJI;
    public float LJLJJL;
    public int LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;

    public float getShadowDx() {
        return this.LJLJL;
    }

    public float getShadowDy() {
        return this.LJLJLJ;
    }

    public float getShadowRadius() {
        return this.LJLJJL;
    }

    public C131835Fj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.z9, R.attr.zc, R.attr.b6h, R.attr.ba1, R.attr.ba2, R.attr.ba3, R.attr.ba4, R.attr.bke, R.attr.bki});
            float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
            float dimension2 = obtainStyledAttributes.getDimension(7, dimension);
            f2 = obtainStyledAttributes.getDimension(8, dimension);
            f3 = obtainStyledAttributes.getDimension(0, dimension);
            f = obtainStyledAttributes.getDimension(1, dimension);
            this.LJLJJL = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.LJLJJLL = obtainStyledAttributes.getColor(3, -2005568139);
            this.LJLJL = obtainStyledAttributes.getDimension(5, 0.0f);
            this.LJLJLJ = obtainStyledAttributes.getDimension(6, 0.0f);
            obtainStyledAttributes.recycle();
            f4 = dimension2;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.LJLIL = r1;
        float[] fArr = {f4, f4, f2, f2, f, f, f3, f3};
        this.LJLJI = new RectF();
        this.LJLJJI = new Path();
        this.LJLILLLLZI = new Paint();
        int abs = (int) (Math.abs(this.LJLJL) + this.LJLJJL);
        int abs2 = (int) (Math.abs(this.LJLJLJ) + this.LJLJJL);
        setPadding(abs, abs2, abs, abs2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            float f = this.LJLJJL;
            if (f > 0.0f) {
                float f2 = this.LJLJL;
                float f3 = this.LJLJLJ;
                int i5 = this.LJLJJLL;
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                this.LJLJI.set(f, f, i - f, i2 - f);
                if (f3 > 0.0f) {
                    RectF rectF = this.LJLJI;
                    rectF.top += f3;
                    rectF.bottom -= f3;
                } else if (f3 < 0.0f) {
                    RectF rectF2 = this.LJLJI;
                    rectF2.top = Math.abs(f3) + rectF2.top;
                    this.LJLJI.bottom -= Math.abs(f3);
                }
                if (f2 > 0.0f) {
                    RectF rectF3 = this.LJLJI;
                    rectF3.left += f2;
                    rectF3.right -= f2;
                } else if (f2 < 0.0f) {
                    RectF rectF4 = this.LJLJI;
                    rectF4.left = Math.abs(f2) + rectF4.left;
                    this.LJLJI.right -= Math.abs(f2);
                }
                this.LJLILLLLZI.setAntiAlias(true);
                this.LJLILLLLZI.setStyle(Paint.Style.FILL);
                this.LJLILLLLZI.setColor(i5);
                if (!isInEditMode()) {
                    this.LJLILLLLZI.setShadowLayer(f, f2, f3, i5);
                }
                this.LJLJJI.reset();
                this.LJLJJI.addRoundRect(this.LJLJI, this.LJLIL, Path.Direction.CW);
                canvas.drawPath(this.LJLJJI, this.LJLILLLLZI);
                setBackground(new BitmapDrawable(getResources(), createBitmap));
            }
        }
    }
}
