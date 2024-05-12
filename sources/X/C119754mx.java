package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.4mx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119754mx extends ViewGroup {
    public final List<View> LJLIL;
    public final int LJLILLLLZI;
    public Drawable LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public final boolean LJLLI;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final int getVisibleViewCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLJI == null) {
            return;
        }
        int size = ((ArrayList) this.LJLIL).size();
        for (int i = 0; i < size; i++) {
            View view = (View) ListProtector.get(this.LJLIL, i);
            if (i > 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int left = ((view.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.LJLJJLL) - this.LJLJL;
                Drawable drawable = this.LJLJI;
                if (drawable != null) {
                    drawable.setBounds(this.LJLJJL + left, getPaddingTop() + this.LJLJJI, (left + this.LJLJL) - this.LJLJJL, (getHeight() - getPaddingBottom()) - this.LJLJJI);
                }
                Drawable drawable2 = this.LJLJI;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
            }
        }
    }

    public final void setChildHorizontalMargin(int i) {
        if (i != this.LJLJJLL) {
            this.LJLJJLL = i;
            requestLayout();
        }
    }

    public final void setDividerDrawable(Drawable drawable) {
        if (o.LJ(drawable, this.LJLJI)) {
            return;
        }
        this.LJLJI = drawable;
        boolean z = false;
        if (drawable != null) {
            this.LJLJL = (this.LJLJJL * 2) + drawable.getIntrinsicWidth();
            this.LJLJLJ = drawable.getIntrinsicHeight();
        } else {
            this.LJLJL = 0;
            this.LJLJLJ = 0;
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public final void setMaxTagCount(int i) {
        if (i != this.LJLJLLL) {
            this.LJLJLLL = i;
            requestLayout();
        }
    }

    public final void setVisibleDependOnOrder(boolean z) {
        if (z != this.LJLL) {
            this.LJLL = z;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119754mx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList();
        this.LJLJLLL = -1;
        this.LJLL = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a25, R.attr.a_b, R.attr.a_r, R.attr.a_s, R.attr.af5, R.attr.ag4, R.attr.b0p, R.attr.bwd});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ble.SingleLineFlowLayout)");
        int i = obtainStyledAttributes.getInt(4, -1);
        this.LJLILLLLZI = i;
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.LJLJJL = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.LJLJJLL = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.LJLJLLL = obtainStyledAttributes.getInt(6, -1);
        this.LJLL = obtainStyledAttributes.getBoolean(7, true);
        this.LJLLI = obtainStyledAttributes.getBoolean(0, false);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            this.LJLILLLLZI = i == -1 ? 1 : -1;
        }
        setDividerDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (r4 > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        r3 = r19.LJLJL;
        r1 = r19.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        if (r5 < (r3 + r1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        r5 = r5 - (r3 + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        if (r13 == (-2)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0116, code lost:
    
        r13 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
    
        if (r13 == (-2)) goto L56;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119754mx.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        ((ArrayList) this.LJLIL).clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                if (((ArrayList) this.LJLIL).isEmpty()) {
                    i5 = 0;
                } else {
                    i5 = this.LJLJL + this.LJLJJLL;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i9 = measuredWidth + i7;
                if (i9 > (width - getPaddingLeft()) - getPaddingRight()) {
                    if (this.LJLL) {
                        break;
                    }
                } else {
                    i8 = Math.max(i8, measuredHeight);
                    ((ArrayList) this.LJLIL).add(childAt);
                    int i10 = this.LJLJLLL;
                    if (i10 > 0 && i10 <= ((ArrayList) this.LJLIL).size()) {
                        i7 = i9;
                        break;
                    }
                    i7 = i9;
                }
            }
            i6++;
        }
        int paddingLeft = getPaddingLeft();
        int i11 = this.LJLILLLLZI;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    paddingLeft = (width - (getPaddingLeft() + i7)) - getPaddingRight();
                    List<View> list = this.LJLIL;
                    o.LJIIIZ(list, "<this>");
                    Collections.reverse(list);
                }
            } else {
                paddingLeft = getPaddingLeft() + ((width - i7) / 2);
            }
        } else {
            paddingLeft = getPaddingLeft();
        }
        int size = ((ArrayList) this.LJLIL).size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) ListProtector.get(this.LJLIL, i12);
            if (view.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                int i13 = marginLayoutParams2.leftMargin + paddingLeft;
                int paddingTop = getPaddingTop() + marginLayoutParams2.topMargin;
                view.layout(i13, paddingTop, view.getMeasuredWidth() + i13, view.getMeasuredHeight() + paddingTop);
                paddingLeft = view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.LJLJL + this.LJLJJLL + paddingLeft;
            }
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if (!((ArrayList) this.LJLIL).contains(childAt2)) {
                childAt2.layout(0, 0, 0, 0);
            }
        }
    }
}
