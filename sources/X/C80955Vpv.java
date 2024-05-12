package X;

import Y.ARunnableS14S0301000_14;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.a1;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.Vpv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80955Vpv extends FrameLayout {
    public final C5H3 LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final ARunnableS50S0100000_14 LJLJL;

    public final Rect getFixedRect() {
        return (Rect) this.LJLIL.getValue();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.LJLILLLLZI && getParent() != null && !getFixedRect().isEmpty() && isAttachedToWindow()) {
            if (!this.LJLJI) {
                postOnAnimation(this.LJLJL);
            }
            this.LJLJI = true;
        } else if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) && isAttachedToWindow()) {
            post(new ARunnableS50S0100000_14(this, 10));
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJJL = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJJL = true;
        getFixedRect().setEmpty();
    }

    public final boolean getEnableFixedSize() {
        return this.LJLILLLLZI;
    }

    public final boolean getEnableSizeChange() {
        return this.LJLJJLL;
    }

    public static final /* synthetic */ void LIZIZ(C80955Vpv c80955Vpv) {
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            return super.dispatchApplyWindowInsets(windowInsets);
        } catch (NullPointerException e) {
            V0N.LJFF(e, new Exception(i0.LJFF("current view ids: ", C0YI.LIZIZ(this))));
            throw e;
        }
    }

    public final void setEnableFixedSize(boolean z) {
        this.LJLILLLLZI = z;
        if (!z) {
            removeCallbacks(this.LJLJL);
        }
    }

    public final void setEnableSizeChange(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        if (i != getVisibility()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = z;
        super.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80955Vpv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C78996UzQ.LJJIJIIJI(C80956Vpw.LJLIL);
        this.LJLJJLL = true;
        this.LJLJL = new ARunnableS50S0100000_14(this, 233);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.LJLJJLL && this.LJLILLLLZI && !this.LJLJJL && !this.LJLJJI && !getFixedRect().isEmpty()) {
            setMeasuredDimension(getMeasuredWidthAndState(), getMeasuredHeightAndState());
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) && isAttachedToWindow()) {
            post(new ARunnableS14S0301000_14(this, view, i, layoutParams, 0));
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.LJLILLLLZI) {
            getFixedRect().left = i;
            getFixedRect().top = i2;
            getFixedRect().right = i3;
            getFixedRect().bottom = i4;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.LJLJJL = false;
    }
}
