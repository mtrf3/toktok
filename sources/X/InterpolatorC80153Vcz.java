package X;

import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.Vcz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class InterpolatorC80153Vcz implements Interpolator {
    public static final float LIZIZ = Resources.getSystem().getDisplayMetrics().density;
    public static final float LIZJ;
    public static final float LIZLLL;
    public final int LIZ;

    static {
        float LJI = 1.0f / LJI(1.0f);
        LIZJ = LJI;
        LIZLLL = 1.0f - (LJI(1.0f) * LJI);
    }

    public InterpolatorC80153Vcz(int i) {
        this.LIZ = i;
    }

    public static int LIZJ(float f) {
        return (int) ((f * LIZIZ) + 0.5f);
    }

    public static boolean LIZLLL(View view) {
        if (!(view instanceof AbsListView) && !(view instanceof ScrollView) && !(view instanceof InterfaceC16140kE) && !(view instanceof WebView) && !(view instanceof InterfaceC16600ky) && !(view instanceof ViewPager) && !(view instanceof InterfaceC16670l5)) {
            return false;
        }
        return true;
    }

    public static int LJFF(View view) {
        int makeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        if (i > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
        return view.getMeasuredHeight();
    }

    public static float LJI(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp(-f2)));
        }
        return C06420Na.LIZIZ(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.LIZ == 1) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
        float LJI = LJI(f) * LIZJ;
        if (LJI > 0.0f) {
            return LJI + LIZLLL;
        }
        return LJI;
    }

    public static boolean LIZIZ(View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            while (childCount > 0) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                if (LJ(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ("fixed".equals(childAt.getTag()) || "fixed-bottom".equals(childAt.getTag())) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean LIZIZ2 = LIZIZ(childAt, pointF);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return LIZIZ2;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean LIZ(View view, PointF pointF, boolean z) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !(view instanceof AbsListView) && !(view instanceof ScrollView) && !(view instanceof InterfaceC16140kE) && !(view instanceof WebView) && !(view instanceof InterfaceC16600ky)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            while (childCount > 0) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                if (LJ(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ("fixed".equals(childAt.getTag()) || "fixed-top".equals(childAt.getTag())) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean LIZ = LIZ(childAt, pointF, z);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return LIZ;
                }
            }
        }
        if (z || view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public static boolean LJ(View view, View view2, float f, float f2, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f3 = fArr[0];
        if (f3 >= 0.0f && scrollY >= 0.0f && f3 < view2.getWidth() && fArr[1] < view2.getHeight()) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
            return true;
        }
        return false;
    }
}
