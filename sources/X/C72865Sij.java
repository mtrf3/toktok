package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;

/* renamed from: X.Sij, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72865Sij extends AbstractC030309z {
    public static final int[] LJLJI = {R.attr.listDivider};
    public Drawable LJLIL;
    public int LJLILLLLZI;

    public C72865Sij(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(LJLJI);
        this.LJLIL = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.LJLILLLLZI = 3;
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
        boolean z;
        int top;
        int intrinsicHeight;
        int left;
        int right;
        int i;
        int i2;
        int left2;
        int intrinsicWidth;
        int max;
        int bottom;
        int i3;
        int min;
        if ((this.LJLILLLLZI & 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int i4 = flexboxLayoutManager.LJLZ;
            int left3 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int paddingRight = recyclerView.getPaddingRight() + recyclerView.getRight();
            int childCount = recyclerView.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = recyclerView.getChildAt(i5);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                if (i4 == 3) {
                    intrinsicHeight = childAt.getBottom() + marginLayoutParams.bottomMargin;
                    top = this.LJLIL.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top = childAt.getTop() - marginLayoutParams.topMargin;
                    intrinsicHeight = top - this.LJLIL.getIntrinsicHeight();
                }
                if (flexboxLayoutManager.LJIILLIIL()) {
                    if (flexboxLayoutManager.LLD) {
                        i2 = Math.min(this.LJLIL.getIntrinsicWidth() + childAt.getRight() + marginLayoutParams.rightMargin, paddingRight);
                        left = childAt.getLeft() - marginLayoutParams.leftMargin;
                        this.LJLIL.setBounds(left, intrinsicHeight, i2, top);
                        this.LJLIL.draw(canvas);
                    } else {
                        left = Math.max((childAt.getLeft() - marginLayoutParams.leftMargin) - this.LJLIL.getIntrinsicWidth(), left3);
                        right = childAt.getRight();
                        i = marginLayoutParams.rightMargin;
                    }
                } else {
                    left = childAt.getLeft() - marginLayoutParams.leftMargin;
                    right = childAt.getRight();
                    i = marginLayoutParams.rightMargin;
                }
                i2 = right + i;
                this.LJLIL.setBounds(left, intrinsicHeight, i2, top);
                this.LJLIL.draw(canvas);
            }
        }
        if ((this.LJLILLLLZI & 2) > 0) {
            FlexboxLayoutManager flexboxLayoutManager2 = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top2 = recyclerView.getTop() - recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom() + recyclerView.getBottom();
            int childCount2 = recyclerView.getChildCount();
            int i6 = flexboxLayoutManager2.LJLZ;
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = recyclerView.getChildAt(i7);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                if (flexboxLayoutManager2.LLD) {
                    intrinsicWidth = childAt2.getRight() + marginLayoutParams2.rightMargin;
                    left2 = this.LJLIL.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left2 = childAt2.getLeft() - marginLayoutParams2.leftMargin;
                    intrinsicWidth = left2 - this.LJLIL.getIntrinsicWidth();
                }
                if (flexboxLayoutManager2.LJIILLIIL()) {
                    max = childAt2.getTop() - marginLayoutParams2.topMargin;
                    bottom = childAt2.getBottom();
                    i3 = marginLayoutParams2.bottomMargin;
                } else if (i6 == 3) {
                    min = Math.min(this.LJLIL.getIntrinsicHeight() + childAt2.getBottom() + marginLayoutParams2.bottomMargin, paddingBottom);
                    max = childAt2.getTop() - marginLayoutParams2.topMargin;
                    this.LJLIL.setBounds(intrinsicWidth, max, left2, min);
                    this.LJLIL.draw(canvas);
                } else {
                    max = Math.max((childAt2.getTop() - marginLayoutParams2.topMargin) - this.LJLIL.getIntrinsicHeight(), top2);
                    bottom = childAt2.getBottom();
                    i3 = marginLayoutParams2.bottomMargin;
                }
                min = bottom + i3;
                this.LJLIL.setBounds(intrinsicWidth, max, left2, min);
                this.LJLIL.draw(canvas);
            }
        }
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        recyclerView.getClass();
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        if (LJJJJIZL == 0) {
            return;
        }
        int i = this.LJLILLLLZI;
        if ((i & 1) > 0 || (i & 2) > 0) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            flexboxLayoutManager.getClass();
            ArrayList arrayList = new ArrayList(flexboxLayoutManager.LLFF.size());
            int size = flexboxLayoutManager.LLFF.size();
            for (int i2 = 0; i2 < size; i2++) {
                C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(flexboxLayoutManager.LLFF, i2);
                if (c80134Vcg.LJII != 0) {
                    arrayList.add(c80134Vcg);
                }
            }
            int i3 = flexboxLayoutManager.LJLZ;
            int i4 = flexboxLayoutManager.LLFFF.LIZJ[LJJJJIZL];
            if ((i4 == -1 || i4 >= flexboxLayoutManager.LLFF.size() || ((C80134Vcg) ListProtector.get(flexboxLayoutManager.LLFF, i4)).LJIILJJIL != LJJJJIZL) && (arrayList.size() == 0 || ((C80134Vcg) AnonymousClass028.LIZIZ(arrayList, 1, arrayList)).LJIILL != LJJJJIZL - 1)) {
                if (flexboxLayoutManager.LJIILLIIL()) {
                    if ((this.LJLILLLLZI & 2) > 0) {
                        if (flexboxLayoutManager.LLD) {
                            rect.right = this.LJLIL.getIntrinsicWidth();
                            rect.left = 0;
                        } else {
                            rect.left = this.LJLIL.getIntrinsicWidth();
                            rect.right = 0;
                        }
                    } else {
                        rect.left = 0;
                        rect.right = 0;
                    }
                } else if ((this.LJLILLLLZI & 1) > 0) {
                    if (i3 == 3) {
                        rect.bottom = this.LJLIL.getIntrinsicHeight();
                        rect.top = 0;
                    } else {
                        rect.top = this.LJLIL.getIntrinsicHeight();
                        rect.bottom = 0;
                    }
                } else {
                    rect.top = 0;
                    rect.bottom = 0;
                }
            }
            if (arrayList.size() == 0 || flexboxLayoutManager.LLFFF.LIZJ[LJJJJIZL] == 0) {
                return;
            }
            if (flexboxLayoutManager.LJIILLIIL()) {
                if ((this.LJLILLLLZI & 1) > 0) {
                    rect.top = this.LJLIL.getIntrinsicHeight();
                    rect.bottom = 0;
                    return;
                } else {
                    rect.top = 0;
                    rect.bottom = 0;
                    return;
                }
            }
            if ((this.LJLILLLLZI & 2) <= 0) {
                return;
            }
            if (flexboxLayoutManager.LLD) {
                rect.right = this.LJLIL.getIntrinsicWidth();
                rect.left = 0;
                return;
            } else {
                rect.left = this.LJLIL.getIntrinsicWidth();
                rect.right = 0;
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }
}
