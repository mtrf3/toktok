package com.bytedance.ies.xelement.viewpager.childitem;

import X.VNU;
import X.VPD;
import X.VUR;
import X.VUU;
import X.ViewOnTouchListenerC79814VUc;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxFoldSlotDrag extends AbsLynxUIScroll<VUU> {
    public LynxTabBarView LJLIL;

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJ(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJI(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBoundRectForOverflow() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void scrollToIndex(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setLowerThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollLeft(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        T mView = this.mView;
        o.LJFF(mView, "mView");
        return mView.getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        T mView = this.mView;
        o.LJFF(mView, "mView");
        return mView.getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        boolean z;
        T mView = this.mView;
        o.LJFF(mView, "mView");
        if (((VUU) mView).getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        int width = getWidth();
        int height = getHeight();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LynxBaseUI child = getChildAt(i);
            if (z) {
                o.LJFF(child, "child");
                width = Math.max(width, child.getLeft() + child.getWidth());
            } else {
                o.LJFF(child, "child");
                height = Math.max(height, child.getTop() + child.getHeight());
            }
        }
        VUU vuu = (VUU) this.mView;
        vuu.LLIIJI = height;
        vuu.LLIIIZ = width;
        VUR vur = vuu.LLIFFJFJJ;
        if (vur != null) {
            vur.requestLayout();
        }
        super.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((VUU) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxFoldSlotDrag(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        return new VUU(context);
    }

    @VPD(defaultBoolean = true, name = "enable-drag")
    public final void setEnableDrag(boolean z) {
        setEnableScroll(z);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setEnableScroll(boolean z) {
        this.mView.setOnTouchListener(new ViewOnTouchListenerC79814VUc(z));
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        super.insertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxUI) {
            lynxBaseUI.setParent(this);
            if (lynxBaseUI instanceof LynxTabBarView) {
                this.LJLIL = (LynxTabBarView) lynxBaseUI;
            }
        }
    }
}
