package com.google.android.material.floatingactionbutton;

import X.C06C;
import X.C06F;
import X.C45621qg;
import X.C73022SlG;
import X.C80217Ve1;
import X.C80376Vga;
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
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T extends C80376Vga> extends C06C<T> {
    public Rect LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.LIZJ = true;
    }

    @Override // X.C06C
    public final void onAttachedToLayoutParams(C06F c06f) {
        if (c06f.LJII == 0) {
            c06f.LJII = 80;
        }
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ya, R.attr.yb});
        this.LIZIZ = obtainStyledAttributes.getBoolean(0, false);
        this.LIZJ = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    public final void LIZIZ(View view, C80376Vga c80376Vga) {
        C06F c06f = (C06F) c80376Vga.getLayoutParams();
        if ((!this.LIZIZ && !this.LIZJ) || c06f.LJFF != view.getId()) {
            return;
        }
        if (view.getTop() < (c80376Vga.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) c80376Vga.getLayoutParams()).topMargin) {
            throw null;
        }
        throw null;
    }

    public final void LIZ(C45621qg c45621qg, C80217Ve1 c80217Ve1, C80376Vga c80376Vga) {
        C06F c06f = (C06F) c80376Vga.getLayoutParams();
        if ((!this.LIZIZ && !this.LIZJ) || c06f.LJFF != c80217Ve1.getId()) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = new Rect();
        }
        Rect rect = this.LIZ;
        C73022SlG.LIZ(c45621qg, c80217Ve1, rect);
        if (rect.bottom <= c80217Ve1.getMinimumHeightForVisibleOverlappingContent()) {
            throw null;
        }
        throw null;
    }

    @Override // X.C06C
    public final boolean getInsetDodgeRect(C45621qg c45621qg, View view, Rect rect) {
        return super.getInsetDodgeRect(c45621qg, view, rect);
    }

    @Override // X.C06C
    public final boolean onDependentViewChanged(C45621qg c45621qg, View view, View view2) {
        C80376Vga c80376Vga = (C80376Vga) view;
        if (view2 instanceof C80217Ve1) {
            LIZ(c45621qg, (C80217Ve1) view2, c80376Vga);
        } else {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof C06F) && (((C06F) layoutParams).LIZ instanceof BottomSheetBehavior)) {
                LIZIZ(view2, c80376Vga);
            }
        }
        return false;
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, View view, int i) {
        C80376Vga c80376Vga = (C80376Vga) view;
        ArrayList arrayList = (ArrayList) c45621qg.LIZLLL(c80376Vga);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) ListProtector.get(arrayList, i2);
            if (view2 instanceof C80217Ve1) {
                LIZ(c45621qg, (C80217Ve1) view2, c80376Vga);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C06F) && (((C06F) layoutParams).LIZ instanceof BottomSheetBehavior)) {
                    LIZIZ(view2, c80376Vga);
                }
            }
        }
        c45621qg.LJIIJ(i, c80376Vga);
        return true;
    }
}
