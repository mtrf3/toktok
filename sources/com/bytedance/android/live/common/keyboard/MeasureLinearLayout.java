package com.bytedance.android.live.common.keyboard;

import X.C0P1;
import X.C15430j5;
import X.C15E;
import X.C15G;
import X.C15H;
import X.C16880lQ;
import X.C1GQ;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class MeasureLinearLayout extends LinearLayout {
    public C15E LJLIL;
    public C15H LJLILLLLZI;
    public C15G LJLJI;
    public final int LJLJJI;
    public boolean LJLJJL;
    public ValueAnimator LJLJJLL;
    public boolean LJLJL;
    public Rect LJLJLJ;
    public boolean LJLJLLL;

    public C15E getKeyBoardObservable() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        if (this.LJLJLLL) {
            super.saveHierarchyState(sparseArray);
        }
    }

    public void setCanSaveState(boolean z) {
        this.LJLJLLL = z;
    }

    public void setKeyboardAnimatorObserver(C15H c15h) {
        this.LJLILLLLZI = c15h;
    }

    public void setWindowInsetsEnable(boolean z) {
        this.LJLJL = z;
        if (z) {
            setFitsSystemWindows(false);
            C1GQ c1gq = new C1GQ(this);
            C0P1.LIZIZ(this, c1gq);
            C0P1.LIZJ(this, c1gq);
        }
    }

    public void setWindowInsetsKeyboardObserver(C15G c15g) {
        this.LJLJI = c15g;
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLJ = new Rect();
        this.LJLJLLL = true;
        this.LJLIL = new C15E();
        this.LJLJJI = C15430j5.LIZ(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.LJLJL) {
            this.LJLIL.LIZIZ(i2, getContext());
        }
        try {
            super.onMeasure(i, i2);
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
