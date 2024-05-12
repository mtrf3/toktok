package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5FH, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5FH extends FrameLayout {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final int LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> LJLJJI;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public float LJLJLJ;

    public abstract void LJFF(View view);

    public int getMaxScrollY() {
        return 0;
    }

    public void setOnBlankClickListener$tools_camera_edit_release(View.OnClickListener onClickListener) {
    }

    public final int getMaxScrollX() {
        return Math.max(this.LJLJL, 0);
    }

    public final int getDesireMaxScrollX() {
        return this.LJLJL;
    }

    public final boolean getFromUser() {
        return this.LJLJI;
    }

    public final int getScreenWidth() {
        return this.LJLIL;
    }

    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> getScrollChangeListener() {
        return this.LJLJJI;
    }

    public final float getTimelineScale() {
        return this.LJLJLJ;
    }

    public final long getTotalDuration() {
        return this.LJLJJLL;
    }

    @Override // android.view.ViewGroup
    public final void addView(View child) {
        o.LJIIIZ(child, "child");
        LJFF(child);
        super.addView(child);
    }

    public final void setFromUser(boolean z) {
        this.LJLJI = z;
    }

    public final void setMustUpdateScrollXListener(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLJJL = interfaceC88472Yns;
    }

    public final void setScrollChangeListener(InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        this.LJLJJI = interfaceC88471Ynr;
    }

    public void setTimelineScale(float f) {
        this.LJLJLJ = f;
        long j = this.LJLJJLL;
        long j2 = 1000;
        if (j >= 1000) {
            long j3 = 1000;
            j2 = j3 * (j / j3);
        }
        this.LJLJL = (int) (((float) j2) * f);
    }

    public final void setTotalDuration(long j) {
        this.LJLJJLL = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5FH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View child, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
        LJFF(child);
        super.addView(child, params);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        AqS103S0101000_2 aqS103S0101000_2 = new AqS103S0101000_2(i, this, 2);
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
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(0, 0), i2);
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
        LJFF(child);
        super.addView(child, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5FH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C81184Vtc.LJ(context);
        this.LJLILLLLZI = true;
        this.LJLJLJ = C17N.LJIILL(30.0d) / 1000.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
        LJFF(child);
        super.addView(child, i, params);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> interfaceC88471Ynr;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LJLILLLLZI && (interfaceC88471Ynr = this.LJLJJI) != null) {
            interfaceC88471Ynr.invoke(Integer.valueOf(getScrollX()), Integer.valueOf(i - i3));
        }
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(getScrollX()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        if (r4 < r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        if (r4 > r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(boolean r2, boolean r3, int r4, int r5, boolean r6) {
        /*
            r1 = this;
            r1.LJLILLLLZI = r2
            if (r3 == 0) goto L16
        L4:
            if (r6 == 0) goto La
        L6:
            r1.scrollTo(r4, r5)
            return
        La:
            int r0 = r1.getMaxScrollY()
            if (r5 >= 0) goto L12
            r5 = 0
            goto L6
        L12:
            if (r5 <= r0) goto L6
            r5 = r0
            goto L6
        L16:
            boolean r0 = X.C90193gN.LIZ()
            if (r0 == 0) goto L24
            int r0 = r1.getMaxScrollX()
            if (r4 <= 0) goto L2e
        L22:
            r4 = 0
            goto L4
        L24:
            int r0 = r1.getMaxScrollX()
            if (r4 >= 0) goto L2b
            goto L22
        L2b:
            if (r4 <= r0) goto L4
            goto L31
        L2e:
            int r0 = -r0
            if (r4 >= r0) goto L4
        L31:
            r4 = r0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5FH.LJI(boolean, boolean, int, int, boolean):void");
    }
}
