package com.lynx.tasm.behavior.ui.scroll;

import X.C16310kV;
import X.C49615Jdb;
import X.EWS;
import X.V9Y;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VPR;
import X.VQH;
import X.VUD;
import X.VUE;
import X.VUF;
import X.VUG;
import X.VUH;
import X.VUI;
import X.VUK;
import X.VUM;
import X.VUN;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.HashMap;
import java.util.Map;
import o3.h0;

/* loaded from: classes15.dex */
public class UIScrollView extends AbsLynxUIScroll<VUG> implements VQH {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public UIBounceView LJLLLL;
    public UIBounceView LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public int LJZI;

    @Override // X.VQH
    public final void LJIIJ() {
        this.LJLJLLL = true;
        LJJIIJ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
        return true;
    }

    public final int LJJII() {
        int contentWidth;
        if (this.LJLIL) {
            contentWidth = ((VUG) this.mView).getContentHeight();
        } else {
            contentWidth = ((VUG) this.mView).getContentWidth();
        }
        return contentWidth - LJJIII();
    }

    public final int LJJIII() {
        int width;
        int paddingRight;
        if (this.LJLIL) {
            width = getHeight() - this.mView.getPaddingBottom();
            paddingRight = this.mView.getPaddingTop();
        } else {
            width = getWidth() - this.mView.getPaddingLeft();
            paddingRight = this.mView.getPaddingRight();
        }
        return width - paddingRight;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ() {
        /*
            r7 = this;
            boolean r0 = r7.LJLZ
            if (r0 != 0) goto L3c
            com.lynx.tasm.behavior.ui.scroll.UIBounceView r4 = r7.LJLLLL
            if (r4 == 0) goto L3c
            boolean r0 = r7.LJLIL
            r6 = 1
            r5 = 0
            r2 = 0
            if (r0 == 0) goto L5c
            int r1 = r4.LJLIL
            r0 = 3
            if (r1 != r0) goto L44
            int r4 = r4.getTop()
            int r1 = r7.getScrollY()
            int r0 = r7.getHeight()
            int r0 = r0 + r1
            if (r4 >= r0) goto L44
            com.lynx.tasm.behavior.ui.scroll.UIBounceView r0 = r7.LJLLLL
            int r4 = r0.getTop()
            int r0 = r7.getHeight()
            int r4 = r4 - r0
        L2f:
            if (r4 <= 0) goto L3c
            T extends android.view.View r1 = r7.mView
            if (r1 != 0) goto L3d
        L35:
            T extends android.view.View r0 = r7.mView
            X.VUG r0 = (X.VUG) r0
            r0.LJFF(r5, r4, r6)
        L3c:
            return
        L3d:
            X.VUG r1 = (X.VUG) r1
            int r0 = (int) r2
            r1.fling(r0)
            goto L35
        L44:
            com.lynx.tasm.behavior.ui.scroll.UIBounceView r4 = r7.LJLLLL
            int r1 = r4.LJLIL
            r0 = 2
            if (r1 != r0) goto L3c
            int r1 = r4.getHeight()
            int r0 = r7.getScrollY()
            if (r1 <= r0) goto L3c
            com.lynx.tasm.behavior.ui.scroll.UIBounceView r0 = r7.LJLLLL
            int r4 = r0.getHeight()
            goto L2f
        L5c:
            int r0 = r4.LJLIL
            if (r0 != 0) goto L93
            int r4 = r4.getLeft()
            int r1 = r7.getScrollX()
            int r0 = r7.getWidth()
            int r0 = r0 + r1
            if (r4 >= r0) goto L93
            com.lynx.tasm.behavior.ui.scroll.UIBounceView r0 = r7.LJLLLL
            int r4 = r0.getLeft()
            int r0 = r7.getWidth()
            int r4 = r4 - r0
        L7a:
            if (r4 <= 0) goto L3c
            T extends android.view.View r0 = r7.mView
            if (r0 != 0) goto L88
        L80:
            T extends android.view.View r0 = r7.mView
            X.VUG r0 = (X.VUG) r0
            r0.LJFF(r4, r5, r6)
            goto L3c
        L88:
            X.VUG r0 = (X.VUG) r0
            X.VUH r1 = r0.getHScrollView()
            int r0 = (int) r2
            r1.fling(r0)
            goto L80
        L93:
            com.lynx.tasm.behavior.ui.scroll.UIBounceView r1 = r7.LJLLLL
            int r0 = r1.LJLIL
            if (r0 != r6) goto L3c
            int r1 = r1.getWidth()
            int r0 = r7.getScrollX()
            if (r1 <= r0) goto L3c
            com.lynx.tasm.behavior.ui.scroll.UIBounceView r0 = r7.LJLLLL
            int r4 = r0.getWidth()
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.scroll.UIScrollView.LJJIIZ():void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getOverflow() {
        int i;
        if (!this.LJLIL) {
            i = 2;
        } else {
            i = 1;
        }
        return i & this.mOverflow;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getRealParentView() {
        VUG vug = (VUG) this.mView;
        if (!this.LJLIL && vug != null) {
            return vug.getHScrollView();
        }
        return vug;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        return ((VUG) this.mView).getHScrollView().getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        return this.mView.getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public final void invalidate() {
        ((VUG) this.mView).getLinearLayout().invalidate();
        this.mView.invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        boolean z;
        if (((VUG) this.mView).getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        int width = getWidth();
        int height = getHeight();
        for (int i = 0; i < getChildCount(); i++) {
            LynxBaseUI childAt = getChildAt(i);
            if (z) {
                width = Math.max(width, childAt.getLeft() + childAt.getWidth() + childAt.mMarginRight + this.mPaddingRight);
            } else {
                height = Math.max(height, childAt.getTop() + childAt.getHeight() + childAt.mMarginBottom + this.mPaddingBottom);
            }
        }
        if (((VUG) this.mView).getContentWidth() != width || ((VUG) this.mView).getContentHeight() != height) {
            float f = width;
            float f2 = height;
            if (this.LJLJLJ && DisplayMetricsHolder.LIZIZ() != null) {
                C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "contentsizechanged");
                c49615Jdb.LIZJ(Float.valueOf(f / DisplayMetricsHolder.LIZIZ().density), "scrollWidth");
                c49615Jdb.LIZJ(Float.valueOf(f2 / DisplayMetricsHolder.LIZIZ().density), "scrollHeight");
                VNU vnu = this.mContext;
                if (vnu != null) {
                    vnu.LJLJJL.LIZIZ(c49615Jdb);
                }
            }
            VUG vug = (VUG) this.mView;
            vug.LJZI = height;
            vug.LJZ = width;
            VUM vum = vug.LJLLI;
            if (vum != null) {
                vum.requestLayout();
            }
        }
        super.measure();
    }

    public final void LJJIIJ() {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        for (int i = 0; i < this.mChildren.size(); i++) {
            ((LynxBaseUI) ListProtector.get(this.mChildren, i)).checkStickyOnParentScroll(scrollX, scrollY);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getAccessibilityHostView() {
        return getRealParentView();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        int i;
        int i2;
        if (getOverflow() != 0) {
            ((ViewGroup) this.mView).setClipChildren(false);
            if (((VUG) this.mView).getHScrollView() != null) {
                ((VUG) this.mView).getHScrollView().setClipChildren(false);
            }
            if (((VUG) this.mView).getLinearLayout() != null) {
                ((VUG) this.mView).getLinearLayout().setClipToPadding(false);
            }
        }
        if (this.LJLZ) {
            if (!this.LJLIL) {
                UIBounceView uIBounceView = this.LJLLLLLL;
                if (uIBounceView != null) {
                    i2 = uIBounceView.getWidth();
                } else {
                    i2 = 0;
                }
                VUH hScrollView = ((VUG) this.mView).getHScrollView();
                int LJJII = LJJII();
                VUK vuk = hScrollView.LJZ;
                if (vuk != null) {
                    if (LJJII != vuk.LJ || i2 != vuk.LJFF) {
                        hScrollView.requestLayout();
                    }
                    VUK vuk2 = hScrollView.LJZ;
                    vuk2.LJ = LJJII;
                    vuk2.LJFF = i2;
                }
            } else if (this.LJLIL) {
                UIBounceView uIBounceView2 = this.LJLLLLLL;
                if (uIBounceView2 != null) {
                    i = uIBounceView2.getHeight();
                } else {
                    i = 0;
                }
                VUI vui = (VUI) this.mView;
                int LJJII2 = LJJII();
                VUK vuk3 = vui.LJLJLLL;
                if (vuk3 != null) {
                    if (LJJII2 != vuk3.LJ || i != vuk3.LJFF) {
                        vui.requestLayout();
                    }
                    VUK vuk4 = vui.LJLJLLL;
                    vuk4.LJ = LJJII2;
                    vuk4.LJFF = i;
                }
            }
        }
        super.layout();
        int i3 = this.LJLLI;
        if (i3 > 0) {
            if (this.LJLIL && getHeight() + i3 <= ((VUG) this.mView).getContentHeight()) {
                ((VUG) this.mView).LJFF(((VUG) this.mView).getRealScrollX(), this.LJLLI, false);
                this.LJLLI = 0;
            } else {
                if (this.LJLIL) {
                    return;
                }
                if (getWidth() + this.LJLLI > ((VUG) this.mView).getContentWidth()) {
                    return;
                }
                ((VUG) this.mView).LJFF(this.LJLLI, ((VUG) this.mView).getRealScrollY(), false);
                this.LJLLI = 0;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((VUG) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        super.onNodeReady();
        int i = this.LJZI;
        if (i > 0) {
            this.mView.setFadingEdgeLength(i);
            this.mView.setHorizontalFadingEdgeEnabled(!this.LJLIL);
            this.mView.setVerticalFadingEdgeEnabled(this.LJLIL);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LJLIL) {
            ((VUI) this.mView).setEnableNewBounce(this.LJLZ);
        } else {
            ((VUG) this.mView).getHScrollView().setEnableNewBounce(this.LJLZ);
        }
        if (this.mContext.LJLJLLL.LJLILLLLZI) {
            if (this.LJLIL) {
                h0.LJIJI(this.mView, new VUF(this));
                h0.LJIJI(((VUG) this.mView).getHScrollView(), null);
            } else {
                h0.LJIJI(this.mView, null);
                h0.LJIJI(((VUG) this.mView).getHScrollView(), new VUF(this));
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityDirectionVertical() {
        return this.LJLIL;
    }

    public UIScrollView(VNU vnu) {
        super(vnu);
        this.LJLLL = 1;
        this.LJZ = true;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJ(boolean z) {
        boolean z2 = !z;
        this.LJLIL = z2;
        if (z2) {
            ((VUG) this.mView).setOrientation(1);
        } else {
            ((VUG) this.mView).setOrientation(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJI(boolean z) {
        this.LJLIL = z;
        if (z) {
            ((VUG) this.mView).setOrientation(1);
        } else {
            ((VUG) this.mView).setOrientation(0);
        }
    }

    public final void LJJIIJZLJL(int i) {
        if (!this.LJLJL) {
            if (i != 0 && i != 3) {
                recognizeGesturere();
                return;
            }
            return;
        }
        if (i != 1 && i != 4) {
            return;
        }
        recognizeGesturere();
    }

    @EWS
    public void autoScroll(ReadableMap readableMap) {
        if (this.LJZ) {
            VUG vug = (VUG) this.mView;
            vug.getClass();
            double d = readableMap.getDouble("rate", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            if (readableMap.getBoolean("start", true)) {
                if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && !vug.LLFII) {
                    int max = (int) Math.max(V9Y.LIZ((float) (d / 60.0d)), 1.0d);
                    vug.LLFII = true;
                    vug.LLI = max;
                    vug.post(new VUE(vug));
                    return;
                }
                return;
            }
            vug.LLFII = false;
            vug.LLI = 0;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        VUG vug = new VUG(context, this);
        vug.setOnScrollListener(new VUD(this, vug));
        return vug;
    }

    @EWS
    public void scrollTo(ReadableMap readableMap) {
        if (!this.LJZ) {
            return;
        }
        double d = readableMap.getDouble("offset", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        int i = readableMap.getInt("index", -1);
        double d2 = d * DisplayMetricsHolder.LIZIZ().density;
        boolean z = readableMap.getBoolean("smooth", false);
        if (this.LJLIL) {
            if (i >= 0 && i < this.mChildren.size()) {
                d2 += ((LynxBaseUI) ListProtector.get(this.mChildren, i)).getTop();
            }
            ((VUG) this.mView).LJFF(0, (int) d2, z);
            return;
        }
        if (i >= 0 && i < this.mChildren.size()) {
            if (this.mLynxDirection == 2) {
                d2 = Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, ((((LynxBaseUI) ListProtector.get(this.mChildren, i)).getWidth() + ((LynxBaseUI) ListProtector.get(this.mChildren, i)).getLeft()) - getWidth()) - d2);
            } else {
                d2 += ((LynxBaseUI) ListProtector.get(this.mChildren, i)).getLeft();
            }
        }
        ((VUG) this.mView).LJFF((int) d2, 0, z);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void scrollToIndex(int i) {
        if (i < 0 || i >= this.mChildren.size()) {
            return;
        }
        if (this.LJLIL) {
            ((VUG) this.mView).LJFF(((VUG) this.mView).getRealScrollX(), ((LynxBaseUI) ListProtector.get(this.mChildren, i)).getTop(), false);
        } else {
            int realScrollY = ((VUG) this.mView).getRealScrollY();
            ((VUG) this.mView).LJFF(((LynxBaseUI) ListProtector.get(this.mChildren, i)).getLeft(), realScrollY, false);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setBlockDescendantFocusability(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((VUG) t).setBlockDescendantFocusability(z);
        }
    }

    @VPD(defaultBoolean = false, name = "enable-nested-scroll")
    public void setEnableNestedScroll(boolean z) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((VUI) t).setNestedScrollingEnabled(z);
        if (((VUG) this.mView).getHScrollView() != null) {
            ((VUG) this.mView).getHScrollView().setNestedScrollingEnabled(z);
        }
    }

    @VPD(defaultBoolean = false, name = "android-enable-new-bounce")
    public void setEnableNewBounce(boolean z) {
        this.LJLZ = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setEnableNewNested(boolean z) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((VUI) t).setEnableNewNested(z);
        if (((VUG) this.mView).getHScrollView() != null) {
            ((VUG) this.mView).getHScrollView().setEnableNewNested(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setEnableScroll(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((VUG) t).setEnableScroll(z);
        }
        this.LJZ = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map == null) {
            return;
        }
        this.LJLILLLLZI = false;
        this.LJLJI = false;
        this.LJLJJI = false;
        this.LJLJJLL = false;
        if (map.containsKey("scrolltolower")) {
            this.LJLJI = true;
        }
        if (map.containsKey("scrolltoupper")) {
            this.LJLILLLLZI = true;
        }
        if (map.containsKey("scroll")) {
            this.LJLJJI = true;
        }
        if (map.containsKey("scrollstart")) {
            this.LJLJJL = true;
        }
        if (map.containsKey("scrollend")) {
            this.LJLJJLL = true;
        }
        if (map.containsKey("contentsizechanged")) {
            this.LJLJLJ = true;
        }
    }

    @VPD(name = "fading-edge-length")
    public void setFadingEdgeLength(String str) {
        T t;
        int LIZIZ = (int) VPR.LIZIZ(str, 0.0f);
        this.LJZI = LIZIZ;
        if (LIZIZ <= 0 && (t = this.mView) != 0) {
            t.setHorizontalFadingEdgeEnabled(false);
            this.mView.setVerticalFadingEdgeEnabled(false);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setForbidFlingFocusChange(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((VUG) t).LLIIII = true;
        }
    }

    @VPD(defaultBoolean = false, name = "force-can-scroll")
    public void setForceCanScroll(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((VUG) t).setForceCanScroll(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setLowerThreshole(int i) {
        this.LJLLILLLL = i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        boolean z;
        T t = this.mView;
        VUG vug = (VUG) t;
        if (i != this.mLynxDirection) {
            z = true;
        } else {
            z = false;
        }
        vug.LLII = z;
        this.mLynxDirection = i;
        if (i == 2) {
            C16310kV.LJIIIZ(t, 1);
            C16310kV.LJIIIZ(((VUG) this.mView).getHScrollView(), 1);
            C16310kV.LJIIIZ(((VUG) this.mView).getLinearLayout(), 1);
        } else {
            C16310kV.LJIIIZ(t, 0);
            C16310kV.LJIIIZ(((VUG) this.mView).getHScrollView(), 0);
            C16310kV.LJIIIZ(((VUG) this.mView).getLinearLayout(), 0);
        }
    }

    @VPD(defaultBoolean = false, name = "android-preference-consume-gesture")
    public void setPreferenceConsumeGesture(boolean z) {
        this.LJLL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
        try {
            ((VUG) this.mView).setScrollBarEnable(Boolean.valueOf(z).booleanValue());
        } catch (Exception e) {
            LLog.LIZLLL(4, "UIScrollView", e.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollLeft(int i) {
        int realScrollY = ((VUG) this.mView).getRealScrollY();
        int LIZ = (int) V9Y.LIZ(i);
        if (getWidth() + LIZ <= ((VUG) this.mView).getContentWidth()) {
            ((VUG) this.mView).LJFF(LIZ, realScrollY, false);
            this.LJLLI = 0;
        } else {
            this.LJLLI = LIZ;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
        this.LJLJL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i) {
        int realScrollX = ((VUG) this.mView).getRealScrollX();
        int LIZ = (int) V9Y.LIZ(i);
        if (getHeight() + LIZ <= ((VUG) this.mView).getContentHeight()) {
            ((VUG) this.mView).LJFF(realScrollX, LIZ, false);
            this.LJLLI = 0;
        } else {
            this.LJLLI = LIZ;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i) {
        this.LJLLJ = i;
    }

    public final int LJJIJ(int i, int i2) {
        if (this.LJLIL) {
            return LJJIFFI(i2, this.LJLLJ, this.LJLLILLLL, 1, 2);
        }
        if (this.mLynxDirection == 2) {
            return LJJIFFI(i, this.LJLLILLLL, this.LJLLJ, 2, 1);
        }
        return LJJIFFI(i, this.LJLLJ, this.LJLLILLLL, 1, 2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        super.drawChild(lynxFlattenUI, canvas);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        super.insertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof UIBounceView) {
            UIBounceView uIBounceView = (UIBounceView) lynxBaseUI;
            if (this.LJLZ) {
                int i2 = uIBounceView.LJLIL;
                if (i2 != 1 && i2 != 2) {
                    return;
                }
                this.LJLLLLLL = uIBounceView;
                return;
            }
            this.LJLLLL = uIBounceView;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellPrepareForReuse(String str, UIList uIList) {
        super.onListCellPrepareForReuse(str, uIList);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Object obj = ((HashMap) uIList.LLFF).get(constructListStateCacheKey(getTagName(), str, getIdSelector()));
        if (obj != null) {
            int intValue = ((Integer) obj).intValue();
            T t = this.mView;
            if (((VUG) t).LJLLLLLL) {
                ((VUG) t).LJFF(intValue, 0, false);
            } else {
                ((VUG) t).LJFF(0, intValue, false);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellDisAppear(String str, UIList uIList, boolean z) {
        super.onListCellDisAppear(str, uIList, z);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String constructListStateCacheKey = constructListStateCacheKey(getTagName(), str, getIdSelector());
        if (z) {
            ((HashMap) uIList.LLFF).put(constructListStateCacheKey, Integer.valueOf(((VUG) this.mView).getRealScrollX()));
            return;
        }
        ((HashMap) uIList.LLFF).remove(constructListStateCacheKey);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean requestChildUIRectangleOnScreen(LynxBaseUI lynxBaseUI, Rect rect, boolean z) {
        if (!this.LJZ || lynxBaseUI == null) {
            return false;
        }
        rect.offset(lynxBaseUI.getLeft() - lynxBaseUI.getScrollX(), lynxBaseUI.getTop() - lynxBaseUI.getScrollY());
        if (this.LJLIL) {
            int computeScrollDeltaToGetChildRectOnScreen = ((VUG) this.mView).computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen == 0) {
                return false;
            }
            T t = this.mView;
            ((VUG) t).LJFF(((VUG) t).getRealScrollX(), ((VUG) this.mView).getRealScrollY() + computeScrollDeltaToGetChildRectOnScreen, z);
        } else {
            int computeScrollDeltaToGetChildRectOnScreen2 = ((VUG) this.mView).getHScrollView().computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen2 == 0) {
                return false;
            }
            T t2 = this.mView;
            ((VUG) t2).LJFF(((VUG) t2).getRealScrollX() + computeScrollDeltaToGetChildRectOnScreen2, ((VUG) this.mView).getRealScrollY(), z);
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJIJJLI(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
        LJIL(lynxBaseUI, z, str, str2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.lynx.tasm.behavior.ui.LynxBaseUI r6, boolean r7, java.lang.String r8, java.lang.String r9, int r10) {
        /*
            r5 = this;
            boolean r4 = r5.LJLIL
            java.lang.String r3 = "end"
            java.lang.String r1 = "center"
            java.lang.String r0 = "nearest"
            r2 = 0
            if (r4 == 0) goto L50
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L12
            return
        L12:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L3a
            T extends android.view.View r0 = r5.mView
            int r1 = r0.getHeight()
            int r0 = r6.getHeight()
            int r1 = r1 - r0
            int r0 = r1 / 2
            int r3 = -r0
        L26:
            if (r6 == r5) goto Lb2
            int r0 = r6.getTop()
            int r3 = r3 + r0
            com.lynx.tasm.behavior.ui.LynxBaseUI r6 = r6.getParentBaseUI()
        L31:
            boolean r0 = r6 instanceof com.lynx.tasm.behavior.ui.LynxFlattenUI
            if (r0 == 0) goto L26
            X.VPH r6 = r6.mParent
            com.lynx.tasm.behavior.ui.LynxBaseUI r6 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r6
            goto L31
        L3a:
            boolean r0 = r3.equals(r8)
            if (r0 == 0) goto L4e
            T extends android.view.View r0 = r5.mView
            int r1 = r0.getHeight()
            int r0 = r6.getHeight()
            int r1 = r1 - r0
            int r3 = -r1
            int r3 = r3 + r10
            goto L26
        L4e:
            r3 = 0
            goto L26
        L50:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L57
            return
        L57:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L7f
            T extends android.view.View r0 = r5.mView
            int r1 = r0.getWidth()
            int r0 = r6.getWidth()
            int r1 = r1 - r0
            int r1 = r1 / 2
        L6a:
            int r3 = -r1
        L6b:
            if (r6 == r5) goto L93
            int r0 = r6.getLeft()
            int r3 = r3 + r0
            com.lynx.tasm.behavior.ui.LynxBaseUI r6 = r6.getParentBaseUI()
        L76:
            boolean r0 = r6 instanceof com.lynx.tasm.behavior.ui.LynxFlattenUI
            if (r0 == 0) goto L6b
            X.VPH r6 = r6.mParent
            com.lynx.tasm.behavior.ui.LynxBaseUI r6 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r6
            goto L76
        L7f:
            boolean r0 = r3.equals(r9)
            if (r0 == 0) goto L91
            T extends android.view.View r0 = r5.mView
            int r1 = r0.getWidth()
            int r0 = r6.getWidth()
            int r1 = r1 - r0
            goto L6a
        L91:
            r3 = 0
            goto L6b
        L93:
            T extends android.view.View r0 = r5.mView
            X.VUG r0 = (X.VUG) r0
            int r1 = r0.getContentWidth()
            T extends android.view.View r0 = r5.mView
            int r0 = r0.getWidth()
            int r1 = r1 - r0
            int r0 = java.lang.Math.min(r3, r1)
            int r1 = java.lang.Math.max(r2, r0)
            T extends android.view.View r0 = r5.mView
            X.VUG r0 = (X.VUG) r0
            r0.LJFF(r1, r2, r7)
            goto Ld0
        Lb2:
            T extends android.view.View r0 = r5.mView
            X.VUG r0 = (X.VUG) r0
            int r1 = r0.getContentHeight()
            T extends android.view.View r0 = r5.mView
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            int r0 = java.lang.Math.min(r3, r1)
            int r1 = java.lang.Math.max(r2, r0)
            T extends android.view.View r0 = r5.mView
            X.VUG r0 = (X.VUG) r0
            r0.LJFF(r2, r1, r7)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.scroll.UIScrollView.LJIL(com.lynx.tasm.behavior.ui.LynxBaseUI, boolean, java.lang.String, java.lang.String, int):void");
    }

    public final int LJJIFFI(int i, int i2, int i3, int i4, int i5) {
        int measuredWidth;
        int measuredWidth2;
        if (i <= i2) {
            return 0 | i4;
        }
        if (((VUG) this.mView).getHScrollView() == null) {
            return 0;
        }
        View childAt = ((VUG) this.mView).getHScrollView().getChildAt(0);
        if (this.LJLIL) {
            measuredWidth = childAt.getMeasuredHeight();
            measuredWidth2 = this.mView.getMeasuredHeight();
        } else {
            measuredWidth = childAt.getMeasuredWidth();
            measuredWidth2 = this.mView.getMeasuredWidth();
        }
        if (i < (measuredWidth - measuredWidth2) - i3) {
            return 0;
        }
        return 0 | i5;
    }

    public final void LJJIIZI(int i, int i2, int i3, int i4, String str) {
        VUN vun = new VUN(getSign(), str);
        vun.LIZLLL(i, i2, ((VUG) this.mView).getContentHeight(), ((VUG) this.mView).getContentWidth(), i - i3, i2 - i4);
        VNU vnu = this.mContext;
        if (vnu != null) {
            vnu.LJLJJL.LIZIZ(vun);
        }
    }
}
