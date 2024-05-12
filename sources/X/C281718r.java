package X;

import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.18r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C281718r extends AnonymousClass031 {
    public CharSequence LJLJLLL;
    public CharSequence LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public LinearLayout LJLLL;
    public TextView LJLLLL;
    public TextView LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public boolean LJZI;
    public final int LJZL;

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void LJI() {
        int i;
        if (this.LJLLL == null) {
            C16880lQ.LLLZIIL(R.layout.ct, C16880lQ.LLZIL(getContext()), this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.LJLLL = linearLayout;
            this.LJLLLL = (TextView) linearLayout.findViewById(R.id.nt);
            this.LJLLLLLL = (TextView) this.LJLLL.findViewById(R.id.ns);
            if (this.LJLZ != 0) {
                this.LJLLLL.setTextAppearance(getContext(), this.LJLZ);
            }
            if (this.LJZ != 0) {
                this.LJLLLLLL.setTextAppearance(getContext(), this.LJZ);
            }
        }
        this.LJLLLL.setText(this.LJLJLLL);
        this.LJLLLLLL.setText(this.LJLL);
        boolean z = !TextUtils.isEmpty(this.LJLJLLL);
        boolean z2 = !TextUtils.isEmpty(this.LJLL);
        TextView textView = this.LJLLLLLL;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.LJLLL;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.LJLLL.getParent() == null) {
            addView(this.LJLLL);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final void LJII() {
        removeAllViews();
        this.LJLLJ = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        View view = this.LJLLILLLL;
        if (view != null) {
            C16880lQ.LJIIJ(null, view);
        }
    }

    @Override // X.AnonymousClass031
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // X.AnonymousClass031
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.LJLJJI;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIIJJI();
            C281818s c281818s = this.LJLJJI.LL;
            if (c281818s != null && c281818s.LIZIZ()) {
                c281818s.LJIIIZ.dismiss();
            }
        }
    }

    public CharSequence getSubtitle() {
        return this.LJLL;
    }

    public CharSequence getTitle() {
        return this.LJLJLLL;
    }

    public final void LJFF(AbstractC25580zS abstractC25580zS) {
        View view = this.LJLLI;
        if (view == null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), this.LJZL, this, false);
            this.LJLLI = LLLLIILL;
            addView(LLLLIILL);
        } else if (view.getParent() == null) {
            addView(this.LJLLI);
        }
        View findViewById = this.LJLLI.findViewById(R.id.ok);
        this.LJLLILLLL = findViewById;
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(abstractC25580zS, 4), findViewById);
        C281318n LJ = abstractC25580zS.LJ();
        ActionMenuPresenter actionMenuPresenter = this.LJLJJI;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIIJJI();
            C281818s c281818s = actionMenuPresenter.LL;
            if (c281818s != null && c281818s.LIZIZ()) {
                c281818s.LJIIIZ.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.LJLJJI = actionMenuPresenter2;
        actionMenuPresenter2.LJLLJ = true;
        actionMenuPresenter2.LJLLL = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        LJ.LIZIZ(this.LJLJJI, this.LJLILLLLZI);
        ActionMenuPresenter actionMenuPresenter3 = this.LJLJJI;
        C02Q c02q = actionMenuPresenter3.LJLJLJ;
        if (c02q == null) {
            C02Q c02q2 = (C02Q) C16880lQ.LLLLIILL(actionMenuPresenter3.LJLJJI, actionMenuPresenter3.LJLJJLL, this, false);
            actionMenuPresenter3.LJLJLJ = c02q2;
            c02q2.LIZ(actionMenuPresenter3.LJLJI);
            actionMenuPresenter3.LIZJ(true);
        }
        C02Q c02q3 = actionMenuPresenter3.LJLJLJ;
        if (c02q != c02q3) {
            ((AnonymousClass191) c02q3).setPresenter(actionMenuPresenter3);
        }
        AnonymousClass191 anonymousClass191 = (AnonymousClass191) c02q3;
        this.LJLJI = anonymousClass191;
        C16300kU.LJIILLIIL(anonymousClass191, null);
        addView(this.LJLJI, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // X.AnonymousClass031
    public void setContentHeight(int i) {
        this.LJLJJL = i;
    }

    public void setCustomView(View view) {
        View view2 = this.LJLLJ;
        if (view2 != null) {
            if (C78996UzQ.LJJIIJZLJL(view2)) {
                C78996UzQ.LJI();
            }
            removeView(view2);
        }
        this.LJLLJ = view;
        if (view != null) {
            LinearLayout linearLayout = this.LJLLL;
            if (linearLayout != null) {
                if (C78996UzQ.LJJIIJZLJL(linearLayout)) {
                    C78996UzQ.LJI();
                }
                removeView(linearLayout);
                this.LJLLL = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.LJLL = charSequence;
        LJI();
    }

    public void setTitle(CharSequence charSequence) {
        this.LJLJLLL = charSequence;
        LJI();
        h0.LJIJJLI(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.LJZI) {
            requestLayout();
        }
        this.LJZI = z;
    }

    @Override // X.AnonymousClass031, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public C281718r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.uq);
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(context, attributeSet, new int[]{R.attr.x8, R.attr.xi, R.attr.a43, R.attr.afg, R.attr.bfl, R.attr.bjt}, R.attr.uq, 0);
        C16300kU.LJIILLIIL(this, LJIILIIL.LJ(0));
        this.LJLZ = LJIILIIL.LJIIIIZZ(5, 0);
        this.LJZ = LJIILIIL.LJIIIIZZ(4, 0);
        this.LJLJJL = LJIILIIL.LIZIZ.getLayoutDimension(3, 0);
        this.LJZL = LJIILIIL.LJIIIIZZ(2, R.layout.cy);
        LJIILIIL.LJIILJJIL();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i6 = this.LJLJJL;
                if (i6 <= 0) {
                    i6 = View.MeasureSpec.getSize(i2);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i7 = i6 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, LiveLayoutPreloadThreadPriority.DEFAULT);
                View view = this.LJLLI;
                if (view != null) {
                    int LIZJ = AnonymousClass031.LIZJ(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLLI.getLayoutParams();
                    paddingLeft = LIZJ - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                AnonymousClass191 anonymousClass191 = this.LJLJI;
                if (anonymousClass191 != null && anonymousClass191.getParent() == this) {
                    paddingLeft = AnonymousClass031.LIZJ(this.LJLJI, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.LJLLL;
                if (linearLayout != null && this.LJLLJ == null) {
                    if (this.LJZI) {
                        this.LJLLL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.LJLLL.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                            paddingLeft -= measuredWidth;
                        } else {
                            z = false;
                        }
                        LinearLayout linearLayout2 = this.LJLLL;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        linearLayout2.setVisibility(i4);
                    } else {
                        paddingLeft = AnonymousClass031.LIZJ(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.LJLLJ;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i8 = layoutParams.width;
                    if (i8 != -2) {
                        i3 = 1073741824;
                        if (i8 >= 0) {
                            paddingLeft = Math.min(i8, paddingLeft);
                        }
                    } else {
                        i3 = LiveLayoutPreloadThreadPriority.DEFAULT;
                    }
                    int i9 = layoutParams.height;
                    if (i9 != -2) {
                        if (i9 >= 0) {
                            i7 = Math.min(i9, i7);
                        }
                    } else {
                        i5 = LiveLayoutPreloadThreadPriority.DEFAULT;
                    }
                    this.LJLLJ.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
                }
                if (this.LJLJJL <= 0) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i10) {
                            i10 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i10);
                    return;
                }
                setMeasuredDimension(size, i6);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LJLLJ(getClass()));
            LIZ.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LJLLJ(getClass()));
        LIZ2.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        boolean LIZ = C03Q.LIZ(this);
        if (LIZ) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.LJLLI;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLLI.getLayoutParams();
            if (LIZ) {
                int i8 = marginLayoutParams.rightMargin;
                i5 = marginLayoutParams.leftMargin;
                i6 = paddingLeft - i8;
            } else {
                int i9 = marginLayoutParams.leftMargin;
                i5 = marginLayoutParams.rightMargin;
                i6 = paddingLeft + i9;
            }
            int LIZLLL = AnonymousClass031.LIZLLL(this.LJLLI, LIZ, i6, paddingTop, paddingTop2) + i6;
            if (LIZ) {
                i7 = LIZLLL - i5;
            } else {
                i7 = LIZLLL + i5;
            }
            paddingLeft = i7;
        }
        LinearLayout linearLayout = this.LJLLL;
        if (linearLayout != null && this.LJLLJ == null && linearLayout.getVisibility() != 8) {
            paddingLeft += AnonymousClass031.LIZLLL(this.LJLLL, LIZ, paddingLeft, paddingTop, paddingTop2);
        }
        View view2 = this.LJLLJ;
        if (view2 != null) {
            AnonymousClass031.LIZLLL(view2, LIZ, paddingLeft, paddingTop, paddingTop2);
        }
        if (LIZ) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        AnonymousClass191 anonymousClass191 = this.LJLJI;
        if (anonymousClass191 != null) {
            AnonymousClass031.LIZLLL(anonymousClass191, !LIZ, paddingRight, paddingTop, paddingTop2);
        }
    }
}
