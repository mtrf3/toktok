package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.191, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass191 extends LinearLayoutCompat implements C02K, C02Q {
    public C281318n LJLLLLLL;
    public Context LJLZ;
    public int LJZ;
    public boolean LJZI;
    public ActionMenuPresenter LJZL;
    public C02N LL;
    public C02J LLD;
    public boolean LLF;
    public int LLFF;
    public final int LLFFF;
    public final int LLFII;
    public C02W LLFZ;

    public AnonymousClass191() {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: LJ */
    public final C010402i generateDefaultLayoutParams() {
        C282518z c282518z = new C282518z();
        ((LinearLayout.LayoutParams) c282518z).gravity = 16;
        return c282518z;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C282518z c282518z = new C282518z();
        ((LinearLayout.LayoutParams) c282518z).gravity = 16;
        return c282518z;
    }

    public Menu getMenu() {
        if (this.LJLLLLLL == null) {
            Context context = getContext();
            C281318n c281318n = new C281318n(context);
            this.LJLLLLLL = c281318n;
            c281318n.LJ = new C02J() { // from class: X.190
                @Override // X.C02J
                public final void LIZ(C281318n c281318n2) {
                    C02J c02j = AnonymousClass191.this.LLD;
                    if (c02j != null) {
                        c02j.LIZ(c281318n2);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
                
                    return true;
                 */
                @Override // X.C02J
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LIZIZ(X.C281318n r5, android.view.MenuItem r6) {
                    /*
                        r4 = this;
                        X.191 r0 = X.AnonymousClass191.this
                        X.02W r3 = r0.LLFZ
                        r2 = 0
                        if (r3 == 0) goto L26
                        X.197 r3 = (X.AnonymousClass197) r3
                        X.02x r0 = r3.LIZ
                        X.0ku r0 = r0.LLIIIJ
                        java.util.concurrent.CopyOnWriteArrayList<X.0kw> r0 = r0.LIZIZ
                        java.util.Iterator r1 = r0.iterator()
                    L13:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto L27
                        java.lang.Object r0 = r1.next()
                        X.0kw r0 = (X.InterfaceC16580kw) r0
                        boolean r0 = r0.LIZIZ()
                        if (r0 == 0) goto L13
                    L25:
                        r2 = 1
                    L26:
                        return r2
                    L27:
                        X.02x r0 = r3.LIZ
                        X.02w r0 = r0.LLIIIZ
                        if (r0 == 0) goto L26
                        X.18b r0 = (X.C280118b) r0
                        X.18e r0 = r0.LIZ
                        android.view.Window$Callback r0 = r0.LIZIZ
                        boolean r0 = r0.onMenuItemSelected(r2, r6)
                        if (r0 == 0) goto L26
                        goto L25
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass190.LIZIZ(X.18n, android.view.MenuItem):boolean");
                }
            };
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.LJZL = actionMenuPresenter;
            actionMenuPresenter.LJLLJ = true;
            actionMenuPresenter.LJLLL = true;
            C02N c02n = this.LL;
            if (c02n == null) {
                c02n = new C02N() { // from class: X.18y
                    @Override // X.C02N
                    public final void LIZ(C281318n c281318n2, boolean z) {
                    }

                    @Override // X.C02N
                    public final boolean LIZIZ(C281318n c281318n2) {
                        return false;
                    }
                };
            }
            actionMenuPresenter.LJLJJL = c02n;
            this.LJLLLLLL.LIZIZ(actionMenuPresenter, this.LJLZ);
            ActionMenuPresenter actionMenuPresenter2 = this.LJZL;
            actionMenuPresenter2.LJLJLJ = this;
            this.LJLLLLLL = actionMenuPresenter2.LJLJI;
        }
        return this.LJLLLLLL;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.LJZL;
        C282118v c282118v = actionMenuPresenter.LJLL;
        if (c282118v != null) {
            return c282118v.getDrawable();
        }
        if (actionMenuPresenter.LJLLILLLL) {
            return actionMenuPresenter.LJLLI;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.LJZL;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIIJJI();
            C281818s c281818s = actionMenuPresenter.LL;
            if (c281818s != null && c281818s.LIZIZ()) {
                c281818s.LJIIIZ.dismiss();
            }
        }
    }

    public int getPopupTheme() {
        return this.LJZ;
    }

    public static C282518z LJIIIZ(ViewGroup.LayoutParams layoutParams) {
        C282518z c282518z;
        if (layoutParams != null) {
            if (layoutParams instanceof C282518z) {
                c282518z = new C282518z((C282518z) layoutParams);
            } else {
                c282518z = new C282518z(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c282518z).gravity <= 0) {
                ((LinearLayout.LayoutParams) c282518z).gravity = 16;
            }
            return c282518z;
        }
        C282518z c282518z2 = new C282518z();
        ((LinearLayout.LayoutParams) c282518z2).gravity = 16;
        return c282518z2;
    }

    @Override // X.C02Q
    public final void LIZ(C281318n c281318n) {
        this.LJLLLLLL = c281318n;
    }

    @Override // X.C02K
    public final boolean LIZIZ(C281618q c281618q) {
        return this.LJLLLLLL.LJIILLIIL(c281618q, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: LJFF */
    public final C010402i generateLayoutParams(AttributeSet attributeSet) {
        return new C282518z(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: LJI */
    public final /* bridge */ /* synthetic */ C010402i generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LJIIIZ(layoutParams);
    }

    public final boolean LJIIJ(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C02V)) {
            z = false | ((C02V) childAt).LJIJJ();
        }
        if (i > 0 && (childAt2 instanceof C02V)) {
            return z | ((C02V) childAt2).LIZLLL();
        }
        return z;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C282518z;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C282518z(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.LJZL;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LIZJ(false);
            if (this.LJZL.LJIIL()) {
                this.LJZL.LJIIJJI();
                this.LJZL.LJIILIIL();
            }
        }
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.LJZL.LJZ = z;
    }

    public void setOnMenuItemClickListener(C02W c02w) {
        this.LLFZ = c02w;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.LJZL;
        C282118v c282118v = actionMenuPresenter.LJLL;
        if (c282118v != null) {
            c282118v.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.LJLLILLLL = true;
            actionMenuPresenter.LJLLI = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.LJZI = z;
    }

    public void setPopupTheme(int i) {
        if (this.LJZ != i) {
            this.LJZ = i;
            if (i == 0) {
                this.LJLZ = getContext();
            } else {
                this.LJLZ = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.LJZL = actionMenuPresenter;
        actionMenuPresenter.LJLJLJ = this;
        this.LJLLLLLL = actionMenuPresenter.LJLJI;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LJIIIZ(layoutParams);
    }

    public AnonymousClass191(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.LLFFF = (int) (56.0f * f);
        this.LLFII = (int) (f * 4.0f);
        this.LJLZ = context;
        this.LJZ = 0;
    }

    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v99 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        ?? r0;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        ViewOnClickListenerC39821hK viewOnClickListenerC39821hK;
        C281318n c281318n;
        boolean z7 = this.LLF;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.LLF = z;
        if (z7 != z) {
            this.LLFF = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.LLF && (c281318n = this.LJLLLLLL) != null && size != this.LLFF) {
            this.LLFF = size;
            c281318n.LJIILL(true);
        }
        int childCount = getChildCount();
        if (this.LLF) {
            if (childCount > 0) {
                int mode = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
                int i6 = size2 - paddingRight;
                int i7 = this.LLFFF;
                int i8 = i6 / i7;
                int i9 = i6 % i7;
                if (i8 == 0) {
                    setMeasuredDimension(i6, 0);
                    return;
                }
                int i10 = (i9 / i8) + i7;
                int childCount2 = getChildCount();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z8 = false;
                long j = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8) {
                        boolean z9 = childAt instanceof ViewOnClickListenerC39821hK;
                        i12++;
                        if (z9) {
                            int i16 = this.LLFII;
                            r0 = 0;
                            childAt.setPadding(i16, 0, i16, 0);
                        } else {
                            r0 = 0;
                        }
                        C282518z c282518z = (C282518z) childAt.getLayoutParams();
                        c282518z.LJFF = r0;
                        c282518z.LIZJ = r0;
                        c282518z.LIZIZ = r0;
                        c282518z.LIZLLL = r0;
                        ((LinearLayout.LayoutParams) c282518z).leftMargin = r0;
                        ((LinearLayout.LayoutParams) c282518z).rightMargin = r0;
                        if (z9 && ((ViewOnClickListenerC39821hK) childAt).LJJIJIL()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c282518z.LJ = z4;
                        if (c282518z.LIZ) {
                            i4 = 1;
                        } else {
                            i4 = i8;
                        }
                        C282518z c282518z2 = (C282518z) childAt.getLayoutParams();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                        if (z9 && (viewOnClickListenerC39821hK = (ViewOnClickListenerC39821hK) childAt) != null && viewOnClickListenerC39821hK.LJJIJIL()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i4 > 0 && (!z5 || i4 >= 2)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i4 * i10, LiveLayoutPreloadThreadPriority.DEFAULT), makeMeasureSpec);
                            int measuredWidth = childAt.getMeasuredWidth();
                            i5 = measuredWidth / i10;
                            if (measuredWidth % i10 != 0) {
                                i5++;
                            }
                            if (z5 && i5 < 2) {
                                i5 = 2;
                            }
                        } else {
                            i5 = 0;
                        }
                        if (!c282518z2.LIZ && z5) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        c282518z2.LIZLLL = z6;
                        c282518z2.LIZIZ = i5;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i5, 1073741824), makeMeasureSpec);
                        i13 = Math.max(i13, i5);
                        if (c282518z.LIZLLL) {
                            i14++;
                        }
                        if (c282518z.LIZ) {
                            z8 = true;
                        }
                        i8 -= i5;
                        i11 = Math.max(i11, childAt.getMeasuredHeight());
                        if (i5 == 1) {
                            j |= 1 << i15;
                        }
                    }
                }
                if (z8 && i12 == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z10 = false;
                if (i14 > 0) {
                    while (i8 > 0) {
                        int i17 = Integer.MAX_VALUE;
                        int i18 = 0;
                        long j2 = 0;
                        for (int i19 = 0; i19 < childCount2; i19++) {
                            C282518z c282518z3 = (C282518z) getChildAt(i19).getLayoutParams();
                            if (c282518z3.LIZLLL) {
                                int i20 = c282518z3.LIZIZ;
                                if (i20 < i17) {
                                    j2 = 1 << i19;
                                    i17 = i20;
                                    i18 = 1;
                                } else if (i20 == i17) {
                                    j2 |= 1 << i19;
                                    i18++;
                                }
                            }
                        }
                        j |= j2;
                        if (i18 > i8) {
                            break;
                        }
                        int i21 = i17 + 1;
                        for (int i22 = 0; i22 < childCount2; i22++) {
                            View childAt2 = getChildAt(i22);
                            C282518z c282518z4 = (C282518z) childAt2.getLayoutParams();
                            long j3 = 1 << i22;
                            if ((j2 & j3) == 0) {
                                if (c282518z4.LIZIZ == i21) {
                                    j |= j3;
                                }
                            } else {
                                if (z2 && c282518z4.LJ && i8 == 1) {
                                    int i23 = this.LLFII;
                                    childAt2.setPadding(i23 + i10, 0, i23, 0);
                                }
                                c282518z4.LIZIZ++;
                                c282518z4.LJFF = true;
                                i8--;
                            }
                        }
                        z10 = true;
                    }
                }
                if (!z8 && i12 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i8 > 0 && j != 0 && (i8 < i12 - 1 || z3 || i13 > 1)) {
                    float bitCount = Long.bitCount(j);
                    if (!z3) {
                        if ((j & 1) != 0 && !((C282518z) getChildAt(0).getLayoutParams()).LJ) {
                            bitCount -= 0.5f;
                        }
                        int i24 = childCount2 - 1;
                        if ((j & (1 << i24)) != 0 && !((C282518z) getChildAt(i24).getLayoutParams()).LJ) {
                            bitCount -= 0.5f;
                        }
                    }
                    if (bitCount > 0.0f) {
                        i3 = (int) ((i8 * i10) / bitCount);
                    } else {
                        i3 = 0;
                    }
                    for (int i25 = 0; i25 < childCount2; i25++) {
                        if ((j & (1 << i25)) != 0) {
                            View childAt3 = getChildAt(i25);
                            C282518z c282518z5 = (C282518z) childAt3.getLayoutParams();
                            if (childAt3 instanceof ViewOnClickListenerC39821hK) {
                                c282518z5.LIZJ = i3;
                                c282518z5.LJFF = true;
                                if (i25 == 0 && !c282518z5.LJ) {
                                    ((LinearLayout.LayoutParams) c282518z5).leftMargin = (-i3) / 2;
                                }
                            } else if (c282518z5.LIZ) {
                                c282518z5.LIZJ = i3;
                                c282518z5.LJFF = true;
                                ((LinearLayout.LayoutParams) c282518z5).rightMargin = (-i3) / 2;
                            } else {
                                if (i25 != 0) {
                                    ((LinearLayout.LayoutParams) c282518z5).leftMargin = i3 / 2;
                                }
                                if (i25 != childCount2 - 1) {
                                    ((LinearLayout.LayoutParams) c282518z5).rightMargin = i3 / 2;
                                }
                            }
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    for (int i26 = 0; i26 < childCount2; i26++) {
                        View childAt4 = getChildAt(i26);
                        C282518z c282518z6 = (C282518z) childAt4.getLayoutParams();
                        if (c282518z6.LJFF) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec((c282518z6.LIZIZ * i10) + c282518z6.LIZJ, 1073741824), childMeasureSpec);
                        }
                    }
                }
                if (mode == 1073741824) {
                    i11 = size3;
                }
                setMeasuredDimension(i6, i11);
                return;
            }
        } else {
            for (int i27 = 0; i27 < childCount; i27++) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i27).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.LLF) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean LIZ = C03Q.LIZ(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C282518z c282518z = (C282518z) childAt.getLayoutParams();
                if (c282518z.LIZ) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (LJIIJ(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (LIZ) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) c282518z).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c282518z).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c282518z).leftMargin) + ((LinearLayout.LayoutParams) c282518z).rightMargin;
                    LJIIJ(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (LIZ) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C282518z c282518z2 = (C282518z) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c282518z2.LIZ) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c282518z2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c282518z2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C282518z c282518z3 = (C282518z) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c282518z3.LIZ) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) c282518z3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = AnonymousClass036.LIZIZ(measuredWidth4, ((LinearLayout.LayoutParams) c282518z3).rightMargin, max, i20);
            }
        }
    }
}
