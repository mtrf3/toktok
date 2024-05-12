package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CXw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31500CXw extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public Paint LJLJJLL;
    public int LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public int LJLL;
    public ViewPager LJLLI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LJLJLJ = getPaddingLeft();
        this.LJLJLLL = getPaddingTop();
        this.LJLJJLL.setColor(this.LJLILLLLZI);
        float f = this.LJLJLJ;
        for (int i = 0; i < this.LJLJL; i++) {
            if (this.LJLL == i) {
                this.LJLJJLL.setColor(this.LJLIL);
            } else {
                this.LJLJJLL.setColor(this.LJLILLLLZI);
            }
            float f2 = this.LJLJJL;
            canvas.drawCircle(f + f2, this.LJLJLLL + f2, f2, this.LJLJJLL);
            f += this.LJLJJI + this.LJLJI;
        }
    }

    public void setCount(int i) {
        this.LJLJL = i;
        measure(0, 0);
        invalidate();
    }

    public void setPosition(int i) {
        this.LJLL = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.LJLLI = viewPager;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new C31501CXx(this));
        }
    }

    public C31500CXw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b7v, R.attr.b7w, R.attr.b7x, R.attr.b7y, R.attr.b7z, R.attr.bp7, R.attr.bp8, R.attr.bp9, R.attr.bp_, R.attr.bpa}, 0, 0);
        this.LJLJI = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        this.LJLJJI = dimension;
        this.LJLJJL = dimension / 2.0f;
        this.LJLILLLLZI = obtainStyledAttributes.getColor(1, -1726079458);
        this.LJLIL = obtainStyledAttributes.getColor(2, -10704);
        this.LJLJL = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LJLJJLL = paint;
        paint.setAntiAlias(true);
        this.LJLL = 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = getPaddingRight() + getPaddingLeft();
            int i3 = this.LJLJL;
            if (i3 > 0) {
                size = (int) (((i3 - 1) * this.LJLJI) + (i3 * this.LJLJJI) + size);
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.max(size, getSuggestedMinimumWidth());
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingTop() + getPaddingBottom();
            if (this.LJLJL > 0) {
                size2 += (int) this.LJLJJI;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.max(size2, getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }
}
