package com.google.android.material.appbar;

import X.AbstractC80210Vdu;
import X.C06C;
import X.C06F;
import X.C17720mm;
import X.C45621qg;
import X.C78609UtB;
import X.C80217Ve1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import o3.h0;

/* loaded from: classes15.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC80210Vdu {
    public AppBarLayout$ScrollingViewBehavior() {
    }

    @Override // X.AbstractC80210Vdu
    public final C80217Ve1 LIZ(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) ListProtector.get(arrayList, i);
            if (view instanceof C80217Ve1) {
                return (C80217Ve1) view;
            }
        }
        return null;
    }

    @Override // X.AbstractC80210Vdu
    public final float LIZIZ(View view) {
        int i;
        int i2;
        if (view instanceof C80217Ve1) {
            C80217Ve1 c80217Ve1 = (C80217Ve1) view;
            int totalScrollRange = c80217Ve1.getTotalScrollRange();
            int downNestedPreScrollRange = c80217Ve1.getDownNestedPreScrollRange();
            C06C c06c = ((C06F) c80217Ve1.getLayoutParams()).LIZ;
            if (c06c instanceof AppBarLayout$BaseBehavior) {
                i = ((HeaderBehavior) c06c).getTopBottomOffsetForScrollingSibling();
            } else {
                i = 0;
            }
            if ((downNestedPreScrollRange == 0 || totalScrollRange + i > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                return (i / i2) + 1.0f;
            }
        }
        return 0.0f;
    }

    @Override // X.AbstractC80210Vdu
    public final int LIZJ(View view) {
        if (view instanceof C80217Ve1) {
            return ((C80217Ve1) view).getTotalScrollRange();
        }
        return view.getMeasuredHeight();
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yi});
        this.LIZLLL = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // X.C06C
    public final boolean layoutDependsOn(C45621qg c45621qg, View view, View view2) {
        return view2 instanceof C80217Ve1;
    }

    @Override // X.C06C
    public boolean onDependentViewChanged(C45621qg c45621qg, View view, View view2) {
        int LJJIIZ;
        C06C c06c = ((C06F) view2.getLayoutParams()).LIZ;
        if (c06c instanceof AppBarLayout$BaseBehavior) {
            int bottom = (view2.getBottom() - view.getTop()) + ((AppBarLayout$BaseBehavior) c06c).offsetDelta + this.LIZJ;
            if (this.LIZLLL == 0) {
                LJJIIZ = 0;
            } else {
                float LIZIZ = LIZIZ(view2);
                int i = this.LIZLLL;
                LJJIIZ = C78609UtB.LJJIIZ((int) (LIZIZ * i), 0, i);
            }
            h0.LJIIL(bottom - LJJIIZ, view);
        }
        if (view2 instanceof C80217Ve1) {
            C80217Ve1 c80217Ve1 = (C80217Ve1) view2;
            if (c80217Ve1.LJLLI) {
                c80217Ve1.LJ(c80217Ve1.LJFF(view));
            }
        }
        return false;
    }

    @Override // X.C06C
    public final void onDependentViewRemoved(C45621qg c45621qg, View view, View view2) {
        if (view2 instanceof C80217Ve1) {
            h0.LJIILL(C17720mm.LJIIIZ.LIZ(), c45621qg);
            h0.LJIIJ(0, c45621qg);
            h0.LJIILL(C17720mm.LJIIJ.LIZ(), c45621qg);
            h0.LJIIJ(0, c45621qg);
        }
    }

    @Override // X.C06C
    public final boolean onRequestChildRectangleOnScreen(C45621qg c45621qg, View view, Rect rect, boolean z) {
        ArrayList arrayList = (ArrayList) c45621qg.LIZLLL(view);
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            View view2 = (View) ListProtector.get(arrayList, i);
            if (view2 instanceof C80217Ve1) {
                C80217Ve1 c80217Ve1 = (C80217Ve1) view2;
                if (c80217Ve1 != null) {
                    rect.offset(view.getLeft(), view.getTop());
                    Rect rect2 = this.LIZ;
                    rect2.set(0, 0, c45621qg.getWidth(), c45621qg.getHeight());
                    if (!rect2.contains(rect)) {
                        c80217Ve1.LIZLLL(false, !z, true);
                        return true;
                    }
                }
            } else {
                i++;
            }
        }
        return false;
    }
}
