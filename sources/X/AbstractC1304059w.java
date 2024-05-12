package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59w */
/* loaded from: classes3.dex */
public abstract class AbstractC1304059w extends FrameLayout {
    public final int LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> LJLJJI;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public float LJLJLLL;

    public abstract void LIZ(View view);

    public int getMaxScrollY() {
        return 0;
    }

    public void setOnBlankClickListener$editor_trackpanel_release(View.OnClickListener onClickListener) {
    }

    public final int getMaxScrollX() {
        return Math.max(this.LJLJL, this.LJLJLJ);
    }

    public final int getDesireMaxScrollX() {
        return this.LJLJL;
    }

    public final int getScreenWidth() {
        return this.LJLIL;
    }

    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> getScrollChangeListener() {
        return this.LJLJJI;
    }

    public final float getTimelineScale() {
        return this.LJLJLLL;
    }

    @Override // android.view.ViewGroup
    public final void addView(View child) {
        o.LJIIIZ(child, "child");
        LIZ(child);
        super.addView(child);
    }

    public final void setMustUpdateScrollXListener(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLJJL = interfaceC88472Yns;
    }

    public final void setScrollChangeListener(InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        this.LJLJJI = interfaceC88471Ynr;
    }

    public void setTimelineScale(float f) {
        this.LJLJLLL = f;
        this.LJLJL = (int) (((float) this.LJLJJLL) * f);
        this.LJLJLJ = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC1304059w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View child, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
        LIZ(child);
        super.addView(child, params);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        AqS103S0101000_2 aqS103S0101000_2 = new AqS103S0101000_2(i, this, 0);
        if (getChildCount() == 0) {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(((Number) aqS103S0101000_2.invoke()).intValue(), View.MeasureSpec.getSize(i2));
                return;
            } else {
                setMeasuredDimension(0, 0);
                return;
            }
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(1073741823, LiveLayoutPreloadThreadPriority.DEFAULT), i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                paddingBottom = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paddingBottom;
            }
        }
        setMeasuredDimension(((Number) aqS103S0101000_2.invoke()).intValue(), paddingBottom);
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i) {
        o.LJIIIZ(child, "child");
        LIZ(child);
        super.addView(child, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1304059w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C134845Qy.LIZJ(context);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(context, 43));
        this.LJLJI = true;
        this.LJLJLLL = C1300758p.LIZIZ();
    }

    public final int LIZIZ(int i, int i2, boolean z) {
        if (z && ((Boolean) this.LJLILLLLZI.getValue()).booleanValue()) {
            if (i > 0) {
                return 0;
            }
            int i3 = -i2;
            if (i >= i3) {
                return i;
            }
            return i3;
        }
        if (i < 0) {
            return 0;
        }
        if (i <= i2) {
            return i;
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
        LIZ(child);
        super.addView(child, i, params);
    }

    public static /* synthetic */ void LIZLLL(AbstractC1304059w abstractC1304059w, int i, int i2, boolean z) {
        abstractC1304059w.LIZJ(z, false, i, i2, false);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> interfaceC88471Ynr;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LJLJI && (interfaceC88471Ynr = this.LJLJJI) != null) {
            interfaceC88471Ynr.invoke(Integer.valueOf(getScrollX()), Integer.valueOf(i - i3));
        }
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(getScrollX()));
        }
    }

    public final void LIZJ(boolean z, boolean z2, int i, int i2, boolean z3) {
        this.LJLJI = z;
        if (!z2) {
            i = LIZIZ(i, getMaxScrollX(), true);
        }
        if (!z3) {
            i2 = LIZIZ(i2, getMaxScrollY(), false);
        }
        scrollTo(i, i2);
    }
}
