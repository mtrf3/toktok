package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@RemoteViews.RemoteView
/* loaded from: classes15.dex */
public class WFG extends RelativeLayout {
    public static final int[] LJLLILLLL = {2, 3, 4, 6, 8};
    public static final int[] LJLLJ = {0, 1, 5, 7, 16, 17, 18, 19};
    public View LJLIL;
    public final Rect LJLILLLLZI;
    public final Rect LJLJI;
    public boolean LJLJJI;
    public View[] LJLJJL;
    public View[] LJLJJLL;
    public final WFF LJLJL;
    public java.util.Map<View, Integer> LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    public static void setOptimizeConfig(WFK wfk) {
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.LJLLI) {
            return new WFH();
        }
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return WFG.class.getName();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public int getBaseline() {
        if (this.LJLLI) {
            View view = this.LJLIL;
            if (view != null) {
                return view.getBaseline();
            }
            return super.getBaseline();
        }
        return super.getBaseline();
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.LJLJJI = true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (this.LJLLI && view != null && view.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof WFH) && (layoutParams instanceof RelativeLayout.LayoutParams)) {
                view.setLayoutParams(new WFH((RelativeLayout.LayoutParams) layoutParams));
            }
        }
        super.addView(view);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.LJLLI) {
            return layoutParams instanceof WFH;
        }
        return super.checkLayoutParams(layoutParams);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.LJLLI) {
            if (layoutParams instanceof WFH) {
                return new WFH((WFH) layoutParams);
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                return new WFH((RelativeLayout.LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new WFH((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new WFH(layoutParams);
        }
        return super.generateLayoutParams(layoutParams);
    }

    public void setEnableOptimize(boolean z) {
        this.LJLLI = z;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.LJLLI) {
            return new WFH(getContext(), attributeSet);
        }
        return super.generateLayoutParams(attributeSet);
    }

    public WFG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        boolean z;
        this.LJLILLLLZI = new Rect();
        this.LJLJI = new Rect();
        this.LJLJL = new WFF();
        this.LJLJLJ = null;
        this.LJLJLLL = false;
        this.LJLL = false;
        this.LJLLI = false;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i <= 17) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJLLL = z;
        this.LJLL = i >= 18;
    }

    public static boolean LJFF(View view, WFH wfh) {
        if (wfh.getRules()[4] != 0) {
            if ((view instanceof TextView) || (view instanceof RelativeLayout) || (view instanceof ImageView) || (view instanceof ViewAnimator)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final View LIZLLL(int i, int[] iArr) {
        WFI wfi;
        View view;
        int i2 = iArr[i];
        if (i2 == 0 || (wfi = this.LJLJL.LIZIZ.get(i2)) == null) {
            return null;
        }
        View view2 = wfi.LIZ;
        while (view2.getVisibility() == 8) {
            WFI wfi2 = this.LJLJL.LIZIZ.get(((WFH) view2.getLayoutParams()).getRules()[i]);
            if (wfi2 == null || view2 == (view = wfi2.LIZ)) {
                return null;
            }
            view2 = view;
        }
        return view2;
    }

    public final WFH LJ(int i, int[] iArr) {
        View LIZLLL = LIZLLL(i, iArr);
        if (LIZLLL != null && (LIZLLL.getLayoutParams() instanceof WFH)) {
            return (WFH) LIZLLL.getLayoutParams();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.LJLLI && view != null && layoutParams != null && !(layoutParams instanceof WFH) && (layoutParams instanceof RelativeLayout.LayoutParams)) {
            layoutParams = new WFH((RelativeLayout.LayoutParams) layoutParams);
        }
        super.addView(view, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x02f3, code lost:
    
        if (LJIIIIZZ(r4, r3, r10, r6) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02f5, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0379, code lost:
    
        if (LJIIIIZZ(r4, r3, r10, r6) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x039a, code lost:
    
        if (LJIIIIZZ(r4, r3, r10, r6) != false) goto L162;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFG.onMeasure(int, int):void");
    }

    public void onSetLayoutParams(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.LJLLI && !(layoutParams instanceof WFH)) {
            view.setLayoutParams(generateLayoutParams(layoutParams));
        } else {
            requestLayout();
        }
    }

    public final void LIZ(WFH wfh, int i, int[] iArr) {
        wfh.LIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        wfh.LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        WFH LJ = LJ(0, iArr);
        if (LJ != null) {
            wfh.LIZJ = LJ.LIZ - (((RelativeLayout.LayoutParams) LJ).leftMargin + ((RelativeLayout.LayoutParams) wfh).rightMargin);
        } else if (((RelativeLayout.LayoutParams) wfh).alignWithParent && iArr[0] != 0 && i >= 0) {
            wfh.LIZJ = (i - getPaddingRight()) - ((RelativeLayout.LayoutParams) wfh).rightMargin;
        }
        WFH LJ2 = LJ(1, iArr);
        if (LJ2 != null) {
            wfh.LIZ = ((RelativeLayout.LayoutParams) LJ2).rightMargin + ((RelativeLayout.LayoutParams) wfh).leftMargin + LJ2.LIZJ;
        } else if (((RelativeLayout.LayoutParams) wfh).alignWithParent && iArr[1] != 0) {
            wfh.LIZ = getPaddingLeft() + ((RelativeLayout.LayoutParams) wfh).leftMargin;
        }
        WFH LJ3 = LJ(5, iArr);
        if (LJ3 != null) {
            wfh.LIZ = LJ3.LIZ + ((RelativeLayout.LayoutParams) wfh).leftMargin;
        } else if (((RelativeLayout.LayoutParams) wfh).alignWithParent && iArr[5] != 0) {
            wfh.LIZ = getPaddingLeft() + ((RelativeLayout.LayoutParams) wfh).leftMargin;
        }
        WFH LJ4 = LJ(7, iArr);
        if (LJ4 != null) {
            wfh.LIZJ = LJ4.LIZJ - ((RelativeLayout.LayoutParams) wfh).rightMargin;
        } else if (((RelativeLayout.LayoutParams) wfh).alignWithParent && iArr[7] != 0 && i >= 0) {
            wfh.LIZJ = (i - getPaddingRight()) - ((RelativeLayout.LayoutParams) wfh).rightMargin;
        }
        if (iArr[9] != 0) {
            wfh.LIZ = getPaddingLeft() + ((RelativeLayout.LayoutParams) wfh).leftMargin;
        }
        if (iArr[11] != 0 && i >= 0) {
            wfh.LIZJ = (i - getPaddingRight()) - ((RelativeLayout.LayoutParams) wfh).rightMargin;
        }
    }

    public final void LIZIZ(WFH wfh, int i, int i2) {
        int i3;
        int baseline;
        int[] rules = wfh.getRules();
        View LIZLLL = LIZLLL(4, rules);
        if (LIZLLL != null && (baseline = LIZLLL.getBaseline()) != -1 && (LIZLLL.getLayoutParams() instanceof WFH)) {
            i3 = ((WFH) LIZLLL.getLayoutParams()).LIZIZ + baseline;
        } else {
            i3 = -1;
        }
        if (i3 != -1) {
            if (i2 != -1) {
                i3 -= i2;
            }
            wfh.LIZIZ = i3;
            wfh.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
            return;
        }
        wfh.LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        wfh.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        WFH LJ = LJ(2, rules);
        if (LJ != null) {
            wfh.LIZLLL = LJ.LIZIZ - (((RelativeLayout.LayoutParams) LJ).topMargin + ((RelativeLayout.LayoutParams) wfh).bottomMargin);
        } else if (((RelativeLayout.LayoutParams) wfh).alignWithParent && rules[2] != 0 && i >= 0) {
            wfh.LIZLLL = (i - getPaddingBottom()) - ((RelativeLayout.LayoutParams) wfh).bottomMargin;
        }
        WFH LJ2 = LJ(3, rules);
        if (LJ2 != null) {
            wfh.LIZIZ = ((RelativeLayout.LayoutParams) LJ2).bottomMargin + ((RelativeLayout.LayoutParams) wfh).topMargin + LJ2.LIZLLL;
        } else if (((RelativeLayout.LayoutParams) wfh).alignWithParent && rules[3] != 0) {
            wfh.LIZIZ = getPaddingTop() + ((RelativeLayout.LayoutParams) wfh).topMargin;
        }
        WFH LJ3 = LJ(6, rules);
        if (LJ3 != null) {
            wfh.LIZIZ = LJ3.LIZIZ + ((RelativeLayout.LayoutParams) wfh).topMargin;
        } else if (((RelativeLayout.LayoutParams) wfh).alignWithParent && rules[6] != 0) {
            wfh.LIZIZ = getPaddingTop() + ((RelativeLayout.LayoutParams) wfh).topMargin;
        }
        WFH LJ4 = LJ(8, rules);
        if (LJ4 != null) {
            wfh.LIZLLL = LJ4.LIZLLL - ((RelativeLayout.LayoutParams) wfh).bottomMargin;
        } else if (((RelativeLayout.LayoutParams) wfh).alignWithParent && rules[8] != 0 && i >= 0) {
            wfh.LIZLLL = (i - getPaddingBottom()) - ((RelativeLayout.LayoutParams) wfh).bottomMargin;
        }
        if (rules[10] != 0) {
            wfh.LIZIZ = getPaddingTop() + ((RelativeLayout.LayoutParams) wfh).topMargin;
        }
        if (rules[12] != 0 && i >= 0) {
            wfh.LIZLLL = (i - getPaddingBottom()) - ((RelativeLayout.LayoutParams) wfh).bottomMargin;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.LJLLI && view != null && layoutParams != null && !(layoutParams instanceof WFH) && (layoutParams instanceof RelativeLayout.LayoutParams)) {
            layoutParams = new WFH((RelativeLayout.LayoutParams) layoutParams);
        }
        super.addView(view, i, layoutParams);
    }

    public final void LJI(View view, WFH wfh, int i, int i2) {
        view.measure(LIZJ(wfh.LIZ, wfh.LIZJ, ((RelativeLayout.LayoutParams) wfh).width, ((RelativeLayout.LayoutParams) wfh).leftMargin, ((RelativeLayout.LayoutParams) wfh).rightMargin, getPaddingLeft(), getPaddingRight(), i), LIZJ(wfh.LIZIZ, wfh.LIZLLL, ((RelativeLayout.LayoutParams) wfh).height, ((RelativeLayout.LayoutParams) wfh).topMargin, ((RelativeLayout.LayoutParams) wfh).bottomMargin, getPaddingTop(), getPaddingBottom(), i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
    
        if (r1 == Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.view.View r6, X.WFH r7, int r8, boolean r9) {
        /*
            r5 = this;
            r5.getLayoutDirection()
            int[] r4 = r7.getRules()
            int r1 = r7.LIZ
            r3 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L22
            int r1 = r7.LIZJ
            if (r1 == r2) goto L32
            int r0 = r6.getMeasuredWidth()
            int r1 = r1 - r0
            r7.LIZ = r1
        L19:
            r0 = 21
            r0 = r4[r0]
            if (r0 == 0) goto L20
        L1f:
            return r3
        L20:
            r3 = 0
            goto L1f
        L22:
            if (r1 == r2) goto L32
            int r0 = r7.LIZJ
            if (r0 != r2) goto L30
            int r0 = r6.getMeasuredWidth()
            int r0 = r0 + r1
            r7.LIZJ = r0
            goto L19
        L30:
            if (r1 != r2) goto L19
        L32:
            int r0 = r7.LIZJ
            if (r0 != r2) goto L19
            r0 = 13
            r0 = r4[r0]
            if (r0 != 0) goto L42
            r0 = 14
            r0 = r4[r0]
            if (r0 == 0) goto L62
        L42:
            if (r9 != 0) goto L51
            int r1 = r6.getMeasuredWidth()
            int r8 = r8 - r1
            int r0 = r8 / 2
            r7.LIZ = r0
            int r0 = r0 + r1
            r7.LIZJ = r0
        L50:
            return r3
        L51:
            int r1 = r5.getPaddingLeft()
            int r0 = r7.leftMargin
            int r1 = r1 + r0
            r7.LIZ = r1
            int r0 = r6.getMeasuredWidth()
            int r0 = r0 + r1
            r7.LIZJ = r0
            goto L50
        L62:
            int r1 = r5.getPaddingLeft()
            int r0 = r7.leftMargin
            int r1 = r1 + r0
            r7.LIZ = r1
            int r0 = r6.getMeasuredWidth()
            int r0 = r0 + r1
            r7.LIZJ = r0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFG.LJII(android.view.View, X.WFH, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        if (r1 == Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(android.view.View r6, X.WFH r7, int r8, boolean r9) {
        /*
            r5 = this;
            int[] r4 = r7.getRules()
            int r1 = r7.LIZIZ
            r3 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L1f
            int r1 = r7.LIZLLL
            if (r1 == r2) goto L2f
            int r0 = r6.getMeasuredHeight()
            int r1 = r1 - r0
            r7.LIZIZ = r1
        L16:
            r0 = 12
            r0 = r4[r0]
            if (r0 == 0) goto L1d
        L1c:
            return r3
        L1d:
            r3 = 0
            goto L1c
        L1f:
            if (r1 == r2) goto L2f
            int r0 = r7.LIZLLL
            if (r0 != r2) goto L2d
            int r0 = r6.getMeasuredHeight()
            int r0 = r0 + r1
            r7.LIZLLL = r0
            goto L16
        L2d:
            if (r1 != r2) goto L16
        L2f:
            int r0 = r7.LIZLLL
            if (r0 != r2) goto L16
            r0 = 13
            r0 = r4[r0]
            if (r0 != 0) goto L3f
            r0 = 15
            r0 = r4[r0]
            if (r0 == 0) goto L5f
        L3f:
            if (r9 != 0) goto L4e
            int r1 = r6.getMeasuredHeight()
            int r8 = r8 - r1
            int r0 = r8 / 2
            r7.LIZIZ = r0
            int r0 = r0 + r1
            r7.LIZLLL = r0
        L4d:
            return r3
        L4e:
            int r1 = r5.getPaddingTop()
            int r0 = r7.topMargin
            int r1 = r1 + r0
            r7.LIZIZ = r1
            int r0 = r6.getMeasuredHeight()
            int r0 = r0 + r1
            r7.LIZLLL = r0
            goto L4d
        L5f:
            int r1 = r5.getPaddingTop()
            int r0 = r7.topMargin
            int r1 = r1 + r0
            r7.LIZIZ = r1
            int r0 = r6.getMeasuredHeight()
            int r0 = r0 + r1
            r7.LIZLLL = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFG.LJIIIIZZ(android.view.View, X.WFH, int, boolean):boolean");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.LJLLI) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                WFH wfh = (WFH) childAt.getLayoutParams();
                childAt.layout(wfh.LIZ, wfh.LIZIZ, wfh.LIZJ, wfh.LIZLLL);
            }
        }
    }

    public final int LIZJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int i9;
        int i10;
        int i11 = 0;
        if (i8 < 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = 1073741824;
        if (z && !this.LJLJLLL) {
            if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
                i3 = Math.max(0, i2 - i);
            } else if (i3 < 0) {
                i3 = 0;
                return View.MeasureSpec.makeMeasureSpec(i3, i11);
            }
            i11 = 1073741824;
            return View.MeasureSpec.makeMeasureSpec(i3, i11);
        }
        if (i == Integer.MIN_VALUE) {
            i9 = i6 + i4;
        } else {
            i9 = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            i10 = (i8 - i7) - i5;
        } else {
            i10 = i2;
        }
        int i13 = i10 - i9;
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
            if (z) {
                i12 = 0;
            }
            i3 = Math.max(0, i13);
        } else {
            if (i3 >= 0) {
                if (i13 >= 0) {
                    i3 = Math.min(i13, i3);
                }
                i11 = 1073741824;
            } else if (i3 == -1) {
                if (z) {
                    i12 = 0;
                }
                i3 = Math.max(0, i13);
            } else if (i3 == -2 && i13 >= 0) {
                i3 = i13;
                i11 = LiveLayoutPreloadThreadPriority.DEFAULT;
            } else {
                i3 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i11);
        }
        i11 = i12;
        return View.MeasureSpec.makeMeasureSpec(i3, i11);
    }
}
