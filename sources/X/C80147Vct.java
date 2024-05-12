package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Vct, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80147Vct extends VW3 {
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public double LJLL;

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return false;
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80147Vct(Context context) {
        super(context);
        new LinkedHashMap();
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new C80151Vcx(getContext()));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void setIsFullScreenDialog(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setPanelMaxHeightRatio(double d) {
        this.LJLL = d;
    }

    public final void setShouldAdjustHeightDynamically(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setShouldLimitHeight(boolean z) {
        this.LJLJL = z;
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        int LJJIIZ;
        super.onMeasure(i, i2);
        int i3 = 0;
        if (!this.LJLJLJ && this.LJLJLLL) {
            View childAt = getChildAt(getCurrentItem());
            if (childAt == null) {
                return;
            }
            childAt.measure(i, 0);
            int measuredHeight = childAt.getMeasuredHeight();
            if (this.LJLL <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                LJJIIZ = Integer.MAX_VALUE;
            } else {
                LJJIIZ = ((int) (getContext().getResources().getDisplayMetrics().heightPixels * this.LJLL)) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(52.5f)));
            }
            int min = Math.min(measuredHeight, LJJIIZ);
            if (min != 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(min, LiveLayoutPreloadThreadPriority.DEFAULT);
            }
            super.onMeasure(i, i2);
            int i4 = getResources().getDisplayMetrics().heightPixels;
            View LIZ = C80148Vcu.LIZ(this);
            if (LIZ != null) {
                ViewPagerBottomSheetBehavior.LIZ(LIZ).setPeekHeight(i4);
            }
            requestLayout();
            return;
        }
        if (!this.LJLJL) {
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i));
        View childAt2 = getChildAt(getCurrentItem());
        if (childAt2 == null) {
            return;
        }
        childAt2.measure(makeMeasureSpec, 0);
        int measuredHeight2 = childAt2.getMeasuredHeight();
        if (measuredHeight2 > 0) {
            i3 = measuredHeight2;
        }
        int max = Math.max(measuredHeight2, (int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.6d));
        if (i3 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(max, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
    }
}
