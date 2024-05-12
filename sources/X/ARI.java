package X;

import Y.ACListenerS17S0301000_4;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ARI extends AbstractC243009gG {
    public static final /* synthetic */ int LJII = 0;
    public final List<ARN> LJ;
    public final List<ARL> LJFF;
    public boolean LJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, X.4mE, android.view.ViewGroup] */
    @Override // X.ARS
    public final View LIZIZ() {
        ARR LIZLLL;
        final Context context = (Context) this.LIZIZ;
        ?? r3 = new ViewGroup(context) { // from class: X.4mE
            public Drawable LJLIL;
            public int LJLILLLLZI;
            public boolean LJLJI;
            public boolean LJLJJI;
            public final List<Integer> LJLJJL;

            public final Drawable getDividerLine() {
                return this.LJLIL;
            }

            public final int getDividerLineSize() {
                return this.LJLILLLLZI;
            }

            public final boolean getForceVertical() {
                return this.LJLJI;
            }

            public final boolean getLayoutHorizontal() {
                return this.LJLJJI;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, null, 0);
                a1.LJFF(context, "context");
                this.LJLJI = true;
                this.LJLJJI = true;
                this.LJLJJL = new ArrayList();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.bqn, R.attr.bqo, R.attr.br0}, 0, 0);
                this.LJLJI = obtainStyledAttributes.getBoolean(2, false);
                this.LJLIL = obtainStyledAttributes.getDrawable(0);
                this.LJLILLLLZI = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                obtainStyledAttributes.recycle();
            }

            @Override // android.view.ViewGroup, android.view.View
            public final void dispatchDraw(Canvas canvas) {
                if (canvas == null) {
                    super.dispatchDraw(canvas);
                    return;
                }
                Drawable drawable = this.LJLIL;
                if (drawable != null) {
                    Iterator<Integer> it = this.LJLJJL.iterator();
                    while (it.hasNext()) {
                        int intValue = it.next().intValue();
                        if (this.LJLJJI) {
                            drawable.setBounds(intValue, getPaddingTop(), this.LJLILLLLZI + intValue, getMeasuredHeight() + getPaddingTop());
                        } else {
                            drawable.setBounds(getPaddingLeft(), intValue, getMeasuredWidth() + getPaddingRight(), this.LJLILLLLZI + intValue);
                        }
                        drawable.draw(canvas);
                    }
                }
                super.dispatchDraw(canvas);
            }

            @Override // android.view.ViewGroup
            public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
                return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
            }

            public final void setDividerLine(Drawable drawable) {
                this.LJLIL = drawable;
            }

            public final void setDividerLineSize(int i) {
                this.LJLILLLLZI = i;
            }

            public final void setForceVertical(boolean z) {
                this.LJLJI = z;
            }

            @Override // android.view.View
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
                int i15;
                int i16;
                int i17;
                int i18;
                C40517FvF LJJ = C78842Uww.LJJ(0, getChildCount());
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJJ, 10));
                Iterator<Integer> it = LJJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(getChildAt(((AbstractC118224kU) it).nextInt()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((View) next).getVisibility() != 8) {
                        arrayList2.add(next);
                    }
                }
                int size = arrayList2.size();
                this.LJLJJI = true;
                int mode = View.MeasureSpec.getMode(i);
                int size2 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size3 = View.MeasureSpec.getSize(i2);
                Iterator it3 = arrayList2.iterator();
                int i19 = 0;
                int i20 = 0;
                while (it3.hasNext()) {
                    View it4 = (View) it3.next();
                    int paddingRight = getPaddingRight() + getPaddingLeft();
                    o.LJIIIIZZ(it4, "it");
                    ViewGroup.LayoutParams layoutParams = it4.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams != null) {
                        i11 = marginLayoutParams.leftMargin;
                    } else {
                        i11 = 0;
                    }
                    int i21 = paddingRight + i11;
                    ViewGroup.LayoutParams layoutParams2 = it4.getLayoutParams();
                    if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams2 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams2 != null) {
                        i12 = marginLayoutParams2.rightMargin;
                    } else {
                        i12 = 0;
                    }
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i21 + i12, it4.getLayoutParams().width);
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    ViewGroup.LayoutParams layoutParams3 = it4.getLayoutParams();
                    if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams3 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (marginLayoutParams3 != null) {
                        i13 = marginLayoutParams3.topMargin;
                    } else {
                        i13 = 0;
                    }
                    int i22 = paddingBottom + i13;
                    ViewGroup.LayoutParams layoutParams4 = it4.getLayoutParams();
                    if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams4 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    if (marginLayoutParams4 != null) {
                        i14 = marginLayoutParams4.bottomMargin;
                    } else {
                        i14 = 0;
                    }
                    it4.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i2, i22 + i14, it4.getLayoutParams().height));
                    int measuredWidth = it4.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams5 = it4.getLayoutParams();
                    if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams5 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    if (marginLayoutParams5 != null) {
                        i15 = marginLayoutParams5.leftMargin;
                    } else {
                        i15 = 0;
                    }
                    int i23 = measuredWidth + i15;
                    ViewGroup.LayoutParams layoutParams6 = it4.getLayoutParams();
                    if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams6 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                    if (marginLayoutParams6 != null) {
                        i16 = marginLayoutParams6.rightMargin;
                    } else {
                        i16 = 0;
                    }
                    i19 = Math.max(i23 + i16, i19);
                    int measuredHeight = it4.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams7 = it4.getLayoutParams();
                    if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams7 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
                    if (marginLayoutParams7 != null) {
                        i17 = marginLayoutParams7.topMargin;
                    } else {
                        i17 = 0;
                    }
                    int i24 = measuredHeight + i17;
                    ViewGroup.LayoutParams layoutParams8 = it4.getLayoutParams();
                    if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams8 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
                    if (marginLayoutParams8 != null) {
                        i18 = marginLayoutParams8.bottomMargin;
                    } else {
                        i18 = 0;
                    }
                    i20 = Math.max(i24 + i18, i20);
                }
                if (this.LJLJI) {
                    LIZ(i, i2, i19, i20);
                    return;
                }
                int i25 = size - 1;
                int paddingRight2 = getPaddingRight() + getPaddingLeft() + (this.LJLILLLLZI * i25) + (i19 * size);
                if (mode == 0 || (mode == Integer.MIN_VALUE && getLayoutParams().width == -2)) {
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        View it6 = (View) it5.next();
                        o.LJIIIIZZ(it6, "it");
                        ViewGroup.LayoutParams layoutParams9 = it6.getLayoutParams();
                        if (!(layoutParams9 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams9 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams9;
                        if (marginLayoutParams9 != null) {
                            i3 = marginLayoutParams9.leftMargin;
                        } else {
                            i3 = 0;
                        }
                        int i26 = i19 - i3;
                        ViewGroup.LayoutParams layoutParams10 = it6.getLayoutParams();
                        if (!(layoutParams10 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams10 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams10;
                        if (marginLayoutParams10 != null) {
                            i4 = marginLayoutParams10.rightMargin;
                        } else {
                            i4 = 0;
                        }
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i4, 1073741824);
                        ViewGroup.LayoutParams layoutParams11 = it6.getLayoutParams();
                        if (!(layoutParams11 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams11 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams11;
                        if (marginLayoutParams11 != null) {
                            i5 = marginLayoutParams11.topMargin;
                        } else {
                            i5 = 0;
                        }
                        int i27 = i20 - i5;
                        ViewGroup.LayoutParams layoutParams12 = it6.getLayoutParams();
                        if (!(layoutParams12 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams12 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams12;
                        if (marginLayoutParams12 != null) {
                            i6 = marginLayoutParams12.bottomMargin;
                        } else {
                            i6 = 0;
                        }
                        it6.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i27 - i6, 1073741824));
                    }
                    if (mode2 != 1073741824) {
                        size3 = getPaddingBottom() + getPaddingTop() + i20;
                    }
                    setMeasuredDimension(paddingRight2, size3);
                    return;
                }
                if (size == 0) {
                    if (mode2 != 1073741824) {
                        size3 = getPaddingBottom() + getPaddingTop();
                    }
                    setMeasuredDimension(size2, size3);
                    return;
                }
                if (size2 < paddingRight2) {
                    LIZ(i, i2, i19, i20);
                    return;
                }
                int paddingRight3 = (size2 - (getPaddingRight() + (getPaddingLeft() + (this.LJLILLLLZI * i25)))) / size;
                Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    View it8 = (View) it7.next();
                    o.LJIIIIZZ(it8, "it");
                    ViewGroup.LayoutParams layoutParams13 = it8.getLayoutParams();
                    if (!(layoutParams13 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams13 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams13 = (ViewGroup.MarginLayoutParams) layoutParams13;
                    if (marginLayoutParams13 != null) {
                        i7 = marginLayoutParams13.leftMargin;
                    } else {
                        i7 = 0;
                    }
                    int i28 = paddingRight3 - i7;
                    ViewGroup.LayoutParams layoutParams14 = it8.getLayoutParams();
                    if (!(layoutParams14 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams14 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams14 = (ViewGroup.MarginLayoutParams) layoutParams14;
                    if (marginLayoutParams14 != null) {
                        i8 = marginLayoutParams14.rightMargin;
                    } else {
                        i8 = 0;
                    }
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i28 - i8, 1073741824);
                    ViewGroup.LayoutParams layoutParams15 = it8.getLayoutParams();
                    if (!(layoutParams15 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams15 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams15 = (ViewGroup.MarginLayoutParams) layoutParams15;
                    if (marginLayoutParams15 != null) {
                        i9 = marginLayoutParams15.topMargin;
                    } else {
                        i9 = 0;
                    }
                    int i29 = i20 - i9;
                    ViewGroup.LayoutParams layoutParams16 = it8.getLayoutParams();
                    if (!(layoutParams16 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams16 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams16 = (ViewGroup.MarginLayoutParams) layoutParams16;
                    if (marginLayoutParams16 != null) {
                        i10 = marginLayoutParams16.bottomMargin;
                    } else {
                        i10 = 0;
                    }
                    it8.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i29 - i10, 1073741824));
                }
                if (mode2 != 1073741824) {
                    size3 = getPaddingBottom() + getPaddingTop() + i20;
                }
                setMeasuredDimension(size2, size3);
            }

            public final void LIZ(int i, int i2, int i3, int i4) {
                boolean z;
                boolean z2;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                C115534g9 LJJJJ = OJ4.LJJJJ(C78924UyG.LIZLLL(this), C119314mF.LJLIL);
                int LJJJI = OJ4.LJJJI(LJJJJ);
                int i14 = 0;
                this.LJLJJI = false;
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i2);
                if (mode == 1073741824 || (mode == Integer.MIN_VALUE && getLayoutParams().width == -1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && getLayoutParams().height == -1)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    i5 = (size - getPaddingLeft()) - getPaddingRight();
                } else {
                    i5 = i3;
                    size = i3;
                }
                if (!z2) {
                    C115524g8 c115524g8 = new C115524g8(LJJJJ);
                    while (c115524g8.hasNext()) {
                        View view = (View) c115524g8.next();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams != null) {
                            i10 = marginLayoutParams.leftMargin;
                        } else {
                            i10 = 0;
                        }
                        int i15 = i5 - i10;
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams2 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (marginLayoutParams2 != null) {
                            i11 = marginLayoutParams2.rightMargin;
                        } else {
                            i11 = 0;
                        }
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i11, 1073741824);
                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams3 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        if (marginLayoutParams3 != null) {
                            i12 = marginLayoutParams3.topMargin;
                        } else {
                            i12 = 0;
                        }
                        int i16 = i4 - i12;
                        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                        if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams4 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        if (marginLayoutParams4 != null) {
                            i13 = marginLayoutParams4.bottomMargin;
                        } else {
                            i13 = 0;
                        }
                        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16 - i13, 1073741824));
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop() + ((LJJJI - 1) * this.LJLILLLLZI) + (i4 * LJJJI);
                    if (paddingBottom > 0) {
                        i14 = paddingBottom;
                    }
                    setMeasuredDimension(size, i14);
                    return;
                }
                int paddingBottom2 = (size2 - (getPaddingBottom() + (getPaddingTop() + ((LJJJI - 1) * this.LJLILLLLZI)))) / LJJJI;
                C115524g8 c115524g82 = new C115524g8(LJJJJ);
                while (c115524g82.hasNext()) {
                    View view2 = (View) c115524g82.next();
                    ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                    if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams5 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    if (marginLayoutParams5 != null) {
                        i6 = marginLayoutParams5.leftMargin;
                    } else {
                        i6 = 0;
                    }
                    int i17 = i3 - i6;
                    ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
                    if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams6 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                    if (marginLayoutParams6 != null) {
                        i7 = marginLayoutParams6.rightMargin;
                    } else {
                        i7 = 0;
                    }
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17 - i7, 1073741824);
                    ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
                    if (!(layoutParams7 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams7 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
                    if (marginLayoutParams7 != null) {
                        i8 = marginLayoutParams7.topMargin;
                    } else {
                        i8 = 0;
                    }
                    int i18 = paddingBottom2 - i8;
                    ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
                    if (!(layoutParams8 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams8 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
                    if (marginLayoutParams8 != null) {
                        i9 = marginLayoutParams8.bottomMargin;
                    } else {
                        i9 = 0;
                    }
                    view2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i18 - i9, 1073741824));
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i3, size2);
            }

            @Override // android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                ((ArrayList) this.LJLJJL).clear();
                if (this.LJLJJI) {
                    List<View> LJJIJLIJ = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJ(C78924UyG.LIZLLL(this), C2N9.LJLIL)));
                    int paddingLeft = getPaddingLeft();
                    if (C16310kV.LIZLLL(this) != 0) {
                        LJJIJLIJ = ORZ.LLIILII(LJJIJLIJ);
                    }
                    for (View view : LJJIJLIJ) {
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
                        int i13 = paddingLeft + i9;
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
                        int i14 = paddingTop + i10;
                        int measuredWidth = view.getMeasuredWidth() + i13;
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
                        view.layout(i13, i14, measuredWidth, view.getMeasuredHeight() + paddingTop2 + i11);
                        int measuredWidth2 = view.getMeasuredWidth() + i13;
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
                        int i15 = measuredWidth2 + i12;
                        ((ArrayList) this.LJLJJL).add(Integer.valueOf(i15));
                        paddingLeft = this.LJLILLLLZI + i15;
                    }
                    return;
                }
                C115534g9 LJJJJ = OJ4.LJJJJ(C78924UyG.LIZLLL(this), C2NA.LJLIL);
                int paddingTop3 = getPaddingTop();
                C115524g8 c115524g8 = new C115524g8(LJJJJ);
                while (c115524g8.hasNext()) {
                    View view2 = (View) c115524g8.next();
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
                    int i16 = paddingTop3 + i5;
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
                    int i17 = paddingLeft2 + i6;
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
                    view2.layout(i17, i16, view2.getMeasuredWidth() + paddingLeft3 + i7, view2.getMeasuredHeight() + i16);
                    int measuredHeight = view2.getMeasuredHeight() + i16;
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
                    int i18 = measuredHeight + i8;
                    ((ArrayList) this.LJLJJL).add(Integer.valueOf(i18));
                    paddingTop3 = i18 + this.LJLILLLLZI;
                }
            }
        };
        r3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        r3.setForceVertical(this.LJI);
        Double valueOf = Double.valueOf(0.5d);
        r3.setDividerLineSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf)));
        r3.setDividerLine(new ColorDrawable(((ARJ) this.LIZJ).LJIIJJI));
        Context context2 = r3.getContext();
        o.LJIIIIZZ(context2, "context");
        int i = 0;
        if (C26338AVi.LIZJ(context2)) {
            C16310kV.LJIIIZ(r3, 0);
        } else {
            C16310kV.LJIIIZ(r3, 1);
        }
        Iterator it = ((ArrayList) this.LJFF).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                ARL arl = (ARL) next;
                ARN arn = (ARN) ListProtector.get(this.LJ, i);
                int i3 = arl.LIZ;
                if (i3 != 1) {
                    if (i3 != 2) {
                        LIZLLL = LIZLLL((Context) this.LIZIZ);
                        LIZLLL.setTextColor(((ARJ) this.LIZJ).LJII);
                        LIZLLL.setTuxFont(((ARJ) this.LIZJ).LJ);
                    } else {
                        LIZLLL = LIZLLL((Context) this.LIZIZ);
                        LIZLLL.setTextColor(((ARJ) this.LIZJ).LJIIL);
                        LIZLLL.setTuxFont(((ARJ) this.LIZJ).LJ);
                    }
                } else {
                    LIZLLL = LIZLLL((Context) this.LIZIZ);
                    LIZLLL.setTextColor(((ARJ) this.LIZJ).LJIIIIZZ);
                    LIZLLL.setTuxFont(((ARJ) this.LIZJ).LIZLLL);
                }
                LIZLLL.setText(arl.LJFF);
                LIZLLL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS17S0301000_4(arl, arn, this, i, 0)));
                LIZLLL.setEnabled(arl.LJ);
                InterfaceC88472Yns<? super SY4, C76800UCe> interfaceC88472Yns = arl.LIZLLL;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(LIZLLL);
                }
                ((ArrayList) arl.LIZJ).add(LIZLLL);
                r3.addView(LIZLLL);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LinearLayout linearLayout = new LinearLayout((Context) this.LIZIZ);
        linearLayout.setOrientation(1);
        View view = new View(linearLayout.getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf))));
        view.setBackground(new ColorDrawable(((ARJ) this.LIZJ).LJIIJJI));
        linearLayout.addView(view);
        linearLayout.addView(r3);
        return linearLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARI(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
    }

    @Override // X.ARS
    public final void LIZ(C26231ARf dialog) {
        o.LJIIIZ(dialog, "dialog");
        this.LIZLLL = dialog;
        for (ARN arn : this.LJ) {
            arn.getClass();
            arn.LIZIZ = dialog;
        }
    }

    public final ARR LIZLLL(Context context) {
        ARR arr = new ARR(context);
        arr.setMaskPressed(true);
        arr.setButtonSize(((ARJ) this.LIZJ).LJFF);
        arr.setMinWidth(0);
        arr.setMaxWidth(Integer.MAX_VALUE);
        arr.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, AnonymousClass391.LIZ(47.5d)));
        arr.setGravity(17);
        arr.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0);
        return arr;
    }

    public final void LJ(int i, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        CharSequence text = ((Context) this.LIZIZ).getText(i);
        o.LJIIIIZZ(text, "context.getText(resId)");
        LJFF(text, interfaceC88472Yns);
    }

    public final void LJFF(CharSequence text, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(text, "text");
        LIZJ(2, text, interfaceC88472Yns);
    }

    public final void LJI(int i, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        CharSequence text = ((Context) this.LIZIZ).getText(i);
        o.LJIIIIZZ(text, "context.getText(resId)");
        LJII(text, interfaceC88472Yns);
    }

    public final void LJII(CharSequence text, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(text, "text");
        LIZJ(0, text, interfaceC88472Yns);
    }

    public final void LJIIIIZZ(int i, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        CharSequence text = ((Context) this.LIZIZ).getText(i);
        o.LJIIIIZZ(text, "context.getText(resId)");
        LJIIIZ(text, interfaceC88472Yns);
    }

    public final void LJIIIZ(CharSequence text, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(text, "text");
        LIZJ(1, text, interfaceC88472Yns);
    }

    public final void LIZJ(int i, CharSequence charSequence, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns) {
        ((ArrayList) this.LJ).add(new ARN(((ArrayList) this.LJ).size()));
        ((ArrayList) this.LJFF).add(new ARL((ARJ) this.LIZJ, i, charSequence, interfaceC88472Yns));
    }
}
