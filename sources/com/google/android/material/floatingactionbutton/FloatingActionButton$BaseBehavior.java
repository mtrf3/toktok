package com.google.android.material.floatingactionbutton;

import X.C06C;
import X.C06F;
import X.C45621qg;
import X.C73022SlG;
import X.C80217Ve1;
import X.C80474ViA;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class FloatingActionButton$BaseBehavior<T extends C80474ViA> extends C06C<T> {
    public Rect LIZ;
    public final boolean LIZIZ;

    public FloatingActionButton$BaseBehavior() {
        this.LIZIZ = true;
    }

    @Override // X.C06C
    public final void onAttachedToLayoutParams(C06F c06f) {
        if (c06f.LJII == 0) {
            c06f.LJII = 80;
        }
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ya});
        this.LIZIZ = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public final boolean LIZ(View view, C80474ViA c80474ViA) {
        C06F c06f = (C06F) c80474ViA.getLayoutParams();
        if (!this.LIZIZ || c06f.LJFF != view.getId() || c80474ViA.getUserSetVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final boolean LIZJ(View view, C80474ViA c80474ViA) {
        if (!LIZ(view, c80474ViA)) {
            return false;
        }
        if (view.getTop() < (c80474ViA.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) c80474ViA.getLayoutParams()).topMargin) {
            c80474ViA.LJFF(null, false);
            return true;
        }
        c80474ViA.LJIIIZ(null, false);
        return true;
    }

    public final boolean LIZIZ(C45621qg c45621qg, C80217Ve1 c80217Ve1, C80474ViA c80474ViA) {
        if (!LIZ(c80217Ve1, c80474ViA)) {
            return false;
        }
        if (this.LIZ == null) {
            this.LIZ = new Rect();
        }
        Rect rect = this.LIZ;
        C73022SlG.LIZ(c45621qg, c80217Ve1, rect);
        if (rect.bottom <= c80217Ve1.getMinimumHeightForVisibleOverlappingContent()) {
            c80474ViA.LJFF(null, false);
            return true;
        }
        c80474ViA.LJIIIZ(null, false);
        return true;
    }

    @Override // X.C06C
    public final boolean getInsetDodgeRect(C45621qg c45621qg, View view, Rect rect) {
        view.getClass();
        view.getLeft();
        throw null;
    }

    @Override // X.C06C
    public final boolean onDependentViewChanged(C45621qg c45621qg, View view, View view2) {
        C80474ViA c80474ViA = (C80474ViA) view;
        if (view2 instanceof C80217Ve1) {
            LIZIZ(c45621qg, (C80217Ve1) view2, c80474ViA);
        } else {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof C06F) && (((C06F) layoutParams).LIZ instanceof BottomSheetBehavior)) {
                LIZJ(view2, c80474ViA);
            }
        }
        return false;
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, View view, int i) {
        C80474ViA c80474ViA = (C80474ViA) view;
        ArrayList arrayList = (ArrayList) c45621qg.LIZLLL(c80474ViA);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) ListProtector.get(arrayList, i2);
            if (view2 instanceof C80217Ve1) {
                if (LIZIZ(c45621qg, (C80217Ve1) view2, c80474ViA)) {
                    break;
                }
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C06F) && (((C06F) layoutParams).LIZ instanceof BottomSheetBehavior) && LIZJ(view2, c80474ViA)) {
                    break;
                }
            }
        }
        c45621qg.LJIIJ(i, c80474ViA);
        return true;
    }
}
