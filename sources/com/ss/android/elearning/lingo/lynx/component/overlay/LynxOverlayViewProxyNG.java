package com.ss.android.elearning.lingo.lynx.component.overlay;

import X.C78996UzQ;
import X.VNA;
import X.VNU;
import X.VOI;
import X.VPA;
import X.VPH;
import X.VRE;
import X.VRI;
import X.VRK;
import Y.IDLListenerS64S0200000_14;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxOverlayViewProxyNG extends UIGroup<VRK> implements VOI {
    public static final VRI Companion = new VRI();
    public int mLastVisibleState;
    public final LynxOverlayViewNG mOverlayView;
    public int screenHeight;
    public int screenWidth;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isUserInteractionEnabled() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public int getChildCount() {
        return this.mOverlayView.getChildCount();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public List<LynxBaseUI> getChildren() {
        List<LynxBaseUI> children = this.mOverlayView.getChildren();
        o.LJIIIIZZ(children, "mOverlayView.getChildren()");
        return children;
    }

    @Override // X.VOI
    public boolean isViewVisible() {
        return this.mOverlayView.LJLJI;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAnimationUpdated() {
        this.mOverlayView.onAnimationUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        this.mOverlayView.onDetach();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        super.layout();
        this.mOverlayView.layout();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        super.measure();
        this.mOverlayView.measure();
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public LynxUI<?> getTransitionUI() {
        return this.mOverlayView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxOverlayViewProxyNG(VNU context) {
        super(context);
        o.LJIIIZ(context, "context");
        LynxOverlayViewNG lynxOverlayViewNG = new LynxOverlayViewNG(context, this);
        this.mOverlayView = lynxOverlayViewNG;
        this.mLastVisibleState = -1;
        super.insertChild(lynxOverlayViewNG, 0);
        Activity LJIIJJI = C78996UzQ.LJIIJJI(context);
        if (LJIIJJI != null) {
            DisplayMetrics LIZ = DisplayMetricsHolder.LIZ(LJIIJJI);
            this.screenHeight = LIZ.heightPixels;
            this.screenWidth = LIZ.widthPixels;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void afterPropsUpdated(VPA vpa) {
        this.mOverlayView.afterPropsUpdated(vpa);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public VRK createView(Context context) {
        o.LJIIIZ(context, "context");
        VRE vre = new VRE(context, this);
        vre.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS64S0200000_14(vre, this, 2));
        return vre;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public LynxBaseUI getChildAt(int i) {
        LynxBaseUI childAt = this.mOverlayView.getChildAt(i);
        o.LJIIIIZZ(childAt, "mOverlayView.getChildAt(index)");
        return childAt;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void insertView(LynxUI<?> lynxUI) {
        this.mOverlayView.insertView(lynxUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void removeChild(LynxBaseUI lynxBaseUI) {
        this.mOverlayView.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void removeView(LynxBaseUI lynxBaseUI) {
        this.mOverlayView.removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setBackgroundColor(int i) {
        this.mOverlayView.setBackgroundColor(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, VNA> map) {
        this.mOverlayView.setEvents(map);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setParent(VPH vph) {
        super.setParent(vph);
        this.mOverlayView.setParent(vph);
    }

    public final void setScreenHeight(int i) {
        this.screenHeight = i;
    }

    public final void setScreenWidth(int i) {
        this.screenWidth = i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateExtraData(Object obj) {
        this.mOverlayView.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        super.updateLayoutInfo(lynxBaseUI);
        this.mOverlayView.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updatePropertiesInterval(VPA vpa) {
        this.mOverlayView.updatePropertiesInterval(vpa);
    }

    public static final void createView$lambda$2$lambda$1(VRE this_apply, LynxOverlayViewProxyNG this$0) {
        int i;
        o.LJIIIZ(this_apply, "$this_apply");
        o.LJIIIZ(this$0, "this$0");
        int[] iArr = new int[2];
        this_apply.getLocationOnScreen(iArr);
        if (this_apply.getWidth() != 0 && this_apply.getHeight() != 0) {
            int i2 = iArr[0];
            if (i2 >= this$0.screenWidth || i2 <= (-this_apply.getWidth()) || (i = iArr[1]) >= this$0.screenHeight || i <= 0 - this_apply.getHeight()) {
                this$0.onDetach();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.mOverlayView.insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        this.mOverlayView.insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setSign(int i, String str) {
        super.setSign(i, str);
        this.mOverlayView.setSign(i, str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        super.updateDrawingLayoutInfo(i, i2, rect);
        this.mOverlayView.updateDrawingLayoutInfo(i, i2, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
        DisplayMetrics LIZ = DisplayMetricsHolder.LIZ(this.mContext);
        this.mOverlayView.updateLayout(0, 0, LIZ.widthPixels, LIZ.heightPixels, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
    }
}
