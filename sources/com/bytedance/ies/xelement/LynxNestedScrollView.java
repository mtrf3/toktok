package com.bytedance.ies.xelement;

import X.C79813VUb;
import X.VNA;
import X.VNU;
import X.VUN;
import X.VUS;
import X.VUT;
import X.VUZ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import java.util.Map;

/* loaded from: classes15.dex */
public class LynxNestedScrollView extends AbsLynxUIScroll<VUT> implements VUZ {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // X.VUZ
    public final void LIZ(int i) {
    }

    @Override // X.VUZ
    public final void LIZIZ() {
    }

    @Override // X.VUZ
    public final void LIZJ() {
    }

    @Override // X.VUZ
    public final void LJ() {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJIJJLI(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJIL(LynxBaseUI lynxBaseUI, boolean z, String str, String str2, int i) {
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
    public final void setScrollLeft(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        return ((VUT) this.mView).getHScrollView().getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        return this.mView.getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public final void invalidate() {
        ((VUT) this.mView).getLinearLayout().invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        boolean z;
        if (((VUT) this.mView).getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        int width = getWidth();
        int height = getHeight();
        for (int i = 0; i < getChildCount(); i++) {
            LynxBaseUI childAt = getChildAt(i);
            if (z) {
                width = Math.max(width, childAt.getLeft() + childAt.getWidth());
            } else {
                height = Math.max(height, childAt.getTop() + childAt.getHeight());
            }
        }
        VUT vut = (VUT) this.mView;
        vut.LLIIJI = height;
        vut.LLIIIZ = width;
        VUS vus = vut.LLIFFJFJJ;
        if (vus != null) {
            vus.requestLayout();
        }
        super.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((VUT) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public LynxNestedScrollView(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJ(boolean z) {
        if (!z) {
            ((VUT) this.mView).setOrientation(1);
        } else {
            ((VUT) this.mView).setOrientation(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJI(boolean z) {
        if (z) {
            ((VUT) this.mView).setOrientation(1);
        } else {
            ((VUT) this.mView).setOrientation(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        VUT vut = new VUT(context);
        vut.setOnScrollListener(new C79813VUb(this));
        return vut;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map == null) {
            return;
        }
        this.LJLIL = false;
        this.LJLILLLLZI = false;
        this.LJLJI = false;
        if (map.containsKey("scrolltolower")) {
            this.LJLILLLLZI = true;
        }
        if (map.containsKey("scrolltoupper")) {
            this.LJLIL = true;
        }
        if (map.containsKey("scroll")) {
            this.LJLJI = true;
        }
        if (this.LJLILLLLZI || this.LJLIL || this.LJLJI) {
            ((VUT) this.mView).setOnScrollListener(this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
        try {
            ((VUT) this.mView).setScrollBarEnable(Boolean.valueOf(z).booleanValue());
        } catch (Exception e) {
            LLog.LIZLLL(4, "UIScrollView", e.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
        this.LJLJJI = z;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        lynxFlattenUI.draw(canvas);
    }

    @Override // X.VUZ
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        View childAt;
        if (this.LJLJI) {
            LJJIFFI(i, i2, i3, i4, "scroll");
        }
        if (i == i3 && i == 0) {
            if (i2 == 0) {
                if (this.LJLIL) {
                    LJJIFFI(0, 0, i3, i4, "scrolltoupper");
                    return;
                }
                return;
            }
            View childAt2 = ((ViewGroup) this.mView).getChildAt(0);
            if (childAt2 != null) {
                if (childAt2.getMeasuredHeight() == this.mView.getMeasuredHeight() + getScrollY() && this.LJLILLLLZI) {
                    LJJIFFI(0, i2, i3, i4, "scrolltolower");
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == i4 && i2 == 0) {
            if (i == 0 || (i > 0 && i3 == 0)) {
                if (this.LJLIL) {
                    LJJIFFI(i, 0, i3, i4, "scrolltoupper");
                }
            } else {
                if (((VUT) this.mView).getHScrollView() == null || (childAt = ((VUT) this.mView).getHScrollView().getChildAt(0)) == null || i != childAt.getMeasuredWidth() - this.mView.getMeasuredWidth() || !this.LJLILLLLZI) {
                    return;
                }
                LJJIFFI(i, 0, i3, i4, "scrolltolower");
            }
        }
    }

    public final void LJJIFFI(int i, int i2, int i3, int i4, String str) {
        VUN vun = new VUN(getSign(), str);
        vun.LIZLLL(i, i2, ((VUT) this.mView).getContentHeight(), ((VUT) this.mView).getContentWidth(), i3 - i, i4 - i2);
        VNU vnu = this.mContext;
        if (vnu != null) {
            vnu.LJLJJL.LIZIZ(vun);
        }
    }
}
