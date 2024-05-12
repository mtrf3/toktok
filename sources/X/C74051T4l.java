package X;

import Y.ALAdapterS1S0101000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.T4l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74051T4l extends LinearLayout {
    public ValueAnimator LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;
    public final Paint LJLJJL;
    public final /* synthetic */ C74053T4n LJLJJLL;

    public final void LIZ() {
        int selectedTabPosition = this.LJLJJLL.getSelectedTabPosition();
        this.LJLILLLLZI = selectedTabPosition;
        View childAt = getChildAt(selectedTabPosition);
        C74053T4n c74053T4n = this.LJLJJLL;
        if (c74053T4n.LJLILLLLZI != null) {
            Drawable indicator = c74053T4n.getTabSelectedIndicator();
            o.LJIIIZ(indicator, "indicator");
            RectF LIZ = C74046T4g.LIZ(c74053T4n, childAt);
            indicator.setBounds((int) LIZ.left, indicator.getBounds().top, (int) LIZ.right, indicator.getBounds().bottom);
        }
    }

    public final int getSelectedPosition() {
        return this.LJLILLLLZI;
    }

    public final float getSelectionOffset() {
        return this.LJLJI;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        C74053T4n c74053T4n = this.LJLJJLL;
        if (c74053T4n.LJLJLLL) {
            this.LJLJJL.setColor(c74053T4n.LJLJJL);
            canvas.drawLine(0.0f, getHeight() - 1.0f, getWidth() + getPaddingLeft() + getPaddingRight(), getHeight(), this.LJLJJL);
        }
        int height = this.LJLJJLL.getTabSelectedIndicator().getBounds().height();
        if (height < 0) {
            height = this.LJLJJLL.getTabSelectedIndicator().getIntrinsicHeight();
        }
        int height2 = getHeight() - height;
        int height3 = getHeight();
        if (this.LJLJJLL.getTabSelectedIndicator().getBounds().width() > 0) {
            Rect bounds = this.LJLJJLL.getTabSelectedIndicator().getBounds();
            o.LJIIIIZZ(bounds, "tabSelectedIndicator.bounds");
            this.LJLJJLL.getTabSelectedIndicator().setBounds(bounds.left, height2, bounds.right, height3);
            this.LJLJJLL.getTabSelectedIndicator().draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT < 23 && this.LJLJJI != i) {
            requestLayout();
            this.LJLJJI = i;
        }
    }

    public final void setSelectedIndicatorHeight(int i) {
        Rect bounds = this.LJLJJLL.getTabSelectedIndicator().getBounds();
        o.LJIIIIZZ(bounds, "tabSelectedIndicator.bounds");
        this.LJLJJLL.getTabSelectedIndicator().setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void setSelectedPosition(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setSelectionOffset(float f) {
        this.LJLJI = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74051T4l(C74053T4n c74053T4n, Context context) {
        super(context);
        this.LJLJJLL = c74053T4n;
        new LinkedHashMap();
        this.LJLILLLLZI = -1;
        this.LJLJJI = -1;
        this.LJLJJL = new Paint();
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.LJLJJLL.LLFF) {
            Iterator<Integer> it = C78842Uww.LJJ(0, getChildCount()).iterator();
            while (it.hasNext()) {
                ViewGroup.LayoutParams layoutParams = getChildAt(((AbstractC118224kU) it).nextInt()).getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -1;
            }
            this.LJLJJLL.LLFF = false;
        }
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2);
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        if (this.LJLJJLL.LJLJLJ == 1) {
            i3 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)) * childCount;
        } else {
            Iterator<Integer> it2 = C78842Uww.LJJ(0, childCount).iterator();
            i3 = 0;
            while (it2.hasNext()) {
                i3 += getChildAt(((AbstractC118224kU) it2).nextInt()).getMeasuredWidth();
            }
        }
        int i5 = measuredWidth - i3;
        if (i5 < 0) {
            if (this.LJLJJLL.LJLJLJ == 1) {
                int LIZ = (int) (C47135Ieh.LIZ(16, getMeasuredWidth()) / (((int) (((getMeasuredWidth() - C32151Nz.LJIIZILJ(16)) / C7MY.LIZIZ(48)) - 0.5d)) + 0.5d));
                Iterator<Integer> it3 = C78842Uww.LJJ(0, getChildCount()).iterator();
                while (it3.hasNext()) {
                    getChildAt(((AbstractC118224kU) it3).nextInt()).getLayoutParams().width = LIZ;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
                return;
            }
            return;
        }
        int i6 = measuredWidth / childCount;
        C40517FvF LJJ = C78842Uww.LJJ(0, childCount);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it4 = LJJ.iterator();
        while (it4.hasNext()) {
            Integer next = it4.next();
            if (getChildAt(next.intValue()).getMeasuredWidth() < i6) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = i5 / arrayList.size();
        int size2 = i5 - (arrayList.size() * size);
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            View childAt = getChildAt(((Number) it5.next()).intValue());
            if (size2 > 0) {
                size2--;
                i4 = 1;
            } else {
                i4 = 0;
            }
            childAt.getLayoutParams().width = childAt.getMeasuredWidth() + i4 + size;
        }
        super.onMeasure(i, i2);
    }

    public final void LIZIZ(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            C74053T4n c74053T4n = this.LJLJJLL;
            if (c74053T4n.LJLILLLLZI != null) {
                Drawable indicator = c74053T4n.getTabSelectedIndicator();
                o.LJIIIZ(indicator, "indicator");
                RectF LIZ = C74046T4g.LIZ(c74053T4n, view);
                RectF LIZ2 = C74046T4g.LIZ(c74053T4n, view2);
                float f2 = LIZ.left;
                float f3 = 1.0f - f;
                int i = (int) ((LIZ2.left * f) + (f2 * f3));
                int i2 = indicator.getBounds().top;
                float f4 = LIZ.right;
                indicator.setBounds(i, i2, (int) ((f * LIZ2.right) + (f3 * f4)), indicator.getBounds().bottom);
            }
        } else {
            this.LJLJJLL.getTabSelectedIndicator().setBounds(-1, this.LJLJJLL.getTabSelectedIndicator().getBounds().top, -1, this.LJLJJLL.getTabSelectedIndicator().getBounds().bottom);
        }
        C16300kU.LJIIJ(this);
    }

    public final void LIZJ(boolean z, int i, int i2) {
        View childAt = getChildAt(this.LJLILLLLZI);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            LIZ();
            return;
        }
        C74052T4m c74052T4m = new C74052T4m(this, childAt, childAt2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LJLIL = valueAnimator;
            valueAnimator.setInterpolator(C80237VeL.LIZIZ);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(c74052T4m);
            valueAnimator.addListener(new ALAdapterS1S0101000_12(i, this, 0));
            valueAnimator.start();
            return;
        }
        ValueAnimator valueAnimator2 = this.LJLIL;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.LJLIL;
        if (valueAnimator3 == null) {
            return;
        }
        valueAnimator3.addUpdateListener(c74052T4m);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.LJLIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            LIZJ(false, this.LJLILLLLZI, -1);
        } else {
            LIZ();
        }
    }
}
