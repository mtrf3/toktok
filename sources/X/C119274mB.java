package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;

/* renamed from: X.4mB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119274mB extends LinearLayout {
    public boolean LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119274mB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aci, R.attr.acj, R.attr.ack}, 0, 0);
        this.LJLILLLLZI = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.LJLJI = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C115534g9 LJJJJ = OJ4.LJJJJ(C78924UyG.LIZLLL(this), C119294mD.LJLIL);
        if (OJ4.LJJJI(LJJJJ) != 2 || getLayoutParams().width != -2 || getLayoutParams().width != -2) {
            super.onMeasure(i, i2);
            return;
        }
        C115524g8 c115524g8 = new C115524g8(LJJJJ);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            ViewGroup.LayoutParams layoutParams = null;
            if (!c115524g8.hasNext()) {
                break;
            }
            View view = (View) c115524g8.next();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams != null) {
                i7 = marginLayoutParams.leftMargin;
            } else {
                i7 = 0;
            }
            int i17 = paddingRight + i7;
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            if (marginLayoutParams2 != null) {
                i8 = marginLayoutParams2.rightMargin;
            } else {
                i8 = 0;
            }
            int childMeasureSpec = LinearLayout.getChildMeasureSpec(i, i17 + i8, view.getLayoutParams().width);
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams4 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
            if (marginLayoutParams3 != null) {
                i9 = marginLayoutParams3.topMargin;
            } else {
                i9 = 0;
            }
            int i18 = paddingBottom + i9;
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams5 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (marginLayoutParams4 != null) {
                i10 = marginLayoutParams4.bottomMargin;
            } else {
                i10 = 0;
            }
            view.measure(childMeasureSpec, LinearLayout.getChildMeasureSpec(i2, i18 + i10, view.getLayoutParams().height));
            int measuredWidth = view.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
            if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams6 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (marginLayoutParams5 != null) {
                i11 = marginLayoutParams5.leftMargin;
            } else {
                i11 = 0;
            }
            int i19 = measuredWidth + i11;
            ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
            if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams7 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams7;
            if (marginLayoutParams6 != null) {
                i12 = marginLayoutParams6.rightMargin;
            } else {
                i12 = 0;
            }
            i15 = Math.max(i19 + i12, i15);
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
            if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams8 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams8;
            if (marginLayoutParams7 != null) {
                i13 = marginLayoutParams7.topMargin;
            } else {
                i13 = 0;
            }
            int i20 = measuredHeight + i13;
            ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
            if (layoutParams9 instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = layoutParams9;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams8 != null) {
                i14 = marginLayoutParams8.bottomMargin;
            } else {
                i14 = 0;
            }
            i16 = Math.max(i20 + i14, i16);
        }
        C115524g8 c115524g82 = new C115524g8(LJJJJ);
        while (c115524g82.hasNext()) {
            View view2 = (View) c115524g82.next();
            ViewGroup.LayoutParams layoutParams10 = view2.getLayoutParams();
            if (!(layoutParams10 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams10 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams10;
            if (marginLayoutParams9 != null) {
                i3 = marginLayoutParams9.leftMargin;
            } else {
                i3 = 0;
            }
            int i21 = i15 - i3;
            ViewGroup.LayoutParams layoutParams11 = view2.getLayoutParams();
            if (!(layoutParams11 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams11 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams11;
            if (marginLayoutParams10 != null) {
                i4 = marginLayoutParams10.rightMargin;
            } else {
                i4 = 0;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i4, 1073741824);
            ViewGroup.LayoutParams layoutParams12 = view2.getLayoutParams();
            if (!(layoutParams12 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams12 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams12;
            if (marginLayoutParams11 != null) {
                i5 = marginLayoutParams11.topMargin;
            } else {
                i5 = 0;
            }
            int i22 = i16 - i5;
            ViewGroup.LayoutParams layoutParams13 = view2.getLayoutParams();
            if (!(layoutParams13 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams13 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams13;
            if (marginLayoutParams12 != null) {
                i6 = marginLayoutParams12.bottomMargin;
            } else {
                i6 = 0;
            }
            view2.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i22 - i6, 1073741824));
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + (getChildCount() * i15) + this.LJLILLLLZI;
        int paddingBottom2 = getPaddingBottom() + getPaddingTop() + (getChildCount() * i16) + this.LJLJI;
        if (this.LJLJJI < paddingRight2) {
            this.LJLIL = false;
            setMeasuredDimension(i15, paddingBottom2);
        } else {
            this.LJLIL = true;
            setMeasuredDimension(paddingRight2, i16);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (OJ4.LJJJI(OJ4.LJJJJ(C78924UyG.LIZLLL(this), C119284mC.LJLIL)) != 2) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        if (this.LJLIL) {
            List LJJIJLIJ = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJ(C78924UyG.LIZLLL(this), C2NB.LJLIL)));
            int paddingLeft = getPaddingLeft();
            if (C16310kV.LIZLLL(this) != 0) {
                LJJIJLIJ = ORZ.LLIILII(LJJIJLIJ);
            }
            int i13 = 0;
            for (Object obj : LJJIJLIJ) {
                int i14 = i13 + 1;
                if (i13 >= 0) {
                    View view = (View) obj;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams != null) {
                        i9 = marginLayoutParams.leftMargin;
                    } else {
                        i9 = 0;
                    }
                    int i15 = paddingLeft + i9;
                    int paddingTop = getPaddingTop();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams2 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams2 != null) {
                        i10 = marginLayoutParams2.topMargin;
                    } else {
                        i10 = 0;
                    }
                    int i16 = paddingTop + i10;
                    int measuredWidth = view.getMeasuredWidth() + i15;
                    int paddingTop2 = getPaddingTop();
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams3 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (marginLayoutParams3 != null) {
                        i11 = marginLayoutParams3.topMargin;
                    } else {
                        i11 = 0;
                    }
                    view.layout(i15, i16, measuredWidth, view.getMeasuredHeight() + paddingTop2 + i11);
                    int measuredWidth2 = view.getMeasuredWidth() + i15;
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams4 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    if (marginLayoutParams4 != null) {
                        i12 = marginLayoutParams4.rightMargin;
                    } else {
                        i12 = 0;
                    }
                    int i17 = measuredWidth2 + i12;
                    if (i13 == 0) {
                        i17 += this.LJLILLLLZI;
                    }
                    paddingLeft = i17;
                    i13 = i14;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return;
        }
        List LLIILII = ORZ.LLIILII(C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJ(C78924UyG.LIZLLL(this), C2NC.LJLIL))));
        int paddingTop3 = getPaddingTop();
        int i18 = 0;
        for (Object obj2 : LLIILII) {
            int i19 = i18 + 1;
            if (i18 >= 0) {
                View view2 = (View) obj2;
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams5 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                if (marginLayoutParams5 != null) {
                    i5 = marginLayoutParams5.topMargin;
                } else {
                    i5 = 0;
                }
                int i20 = paddingTop3 + i5;
                int paddingLeft2 = getPaddingLeft();
                ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
                if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams6 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                if (marginLayoutParams6 != null) {
                    i6 = marginLayoutParams6.leftMargin;
                } else {
                    i6 = 0;
                }
                int i21 = paddingLeft2 + i6;
                int paddingLeft3 = getPaddingLeft();
                ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
                if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams7 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
                if (marginLayoutParams7 != null) {
                    i7 = marginLayoutParams7.leftMargin;
                } else {
                    i7 = 0;
                }
                view2.layout(i21, i20, view2.getMeasuredWidth() + paddingLeft3 + i7, view2.getMeasuredHeight() + i20);
                int measuredHeight = view2.getMeasuredHeight() + i20;
                ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
                if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams8 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
                if (marginLayoutParams8 != null) {
                    i8 = marginLayoutParams8.topMargin;
                } else {
                    i8 = 0;
                }
                int i22 = measuredHeight + i8;
                if (i18 == 0) {
                    i22 += this.LJLJI;
                }
                paddingTop3 = i22;
                i18 = i19;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
