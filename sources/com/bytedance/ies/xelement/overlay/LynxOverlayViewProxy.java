package com.bytedance.ies.xelement.overlay;

import X.C78996UzQ;
import X.VNU;
import X.VOI;
import X.VPA;
import X.VPH;
import X.VRG;
import X.VRK;
import Y.IDLListenerS64S0200000_14;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxOverlayViewProxy extends UIGroup<VRK> implements VOI {
    public final LynxOverlayView LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final int getChildCount() {
        return this.LJLIL.getChildCount();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final List<LynxBaseUI> getChildren() {
        List<LynxBaseUI> children = this.LJLIL.getChildren();
        o.LJFF(children, "mOverlayView.getChildren()");
        return children;
    }

    @Override // X.VOI
    public final boolean isViewVisible() {
        return this.LJLIL.LJLIL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAnimationUpdated() {
        this.LJLIL.onAnimationUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        this.LJLIL.onDetach();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        this.LJLIL.layout();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        super.measure();
        this.LJLIL.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final LynxUI<?> getTransitionUI() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxOverlayViewProxy(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
        LynxOverlayView lynxOverlayView = new LynxOverlayView(context, this);
        this.LJLIL = lynxOverlayView;
        this.LJLILLLLZI = -1;
        super.insertChild(lynxOverlayView, 0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity LJIIJJI = C78996UzQ.LJIIJJI(context);
        if (LJIIJJI != null) {
            WindowManager windowManager = LJIIJJI.getWindowManager();
            o.LJFF(windowManager, "activity.windowManager");
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.LJLJI = displayMetrics.heightPixels;
            this.LJLJJI = displayMetrics.widthPixels;
            return;
        }
        LLog.LIZLLL(4, "LynxOverlayViewProxy", "context is not Activity!");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(VPA vpa) {
        this.LJLIL.afterPropsUpdated(vpa);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        VRG vrg = new VRG(this, context);
        vrg.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS64S0200000_14(vrg, this, 1));
        return vrg;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final LynxBaseUI getChildAt(int i) {
        LynxBaseUI childAt = this.LJLIL.getChildAt(i);
        o.LJFF(childAt, "mOverlayView.getChildAt(index)");
        return childAt;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void insertView(LynxUI<?> lynxUI) {
        this.LJLIL.insertView(lynxUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        this.LJLIL.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeView(LynxBaseUI lynxBaseUI) {
        this.LJLIL.removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBackgroundColor(int i) {
        this.LJLIL.setBackgroundColor(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParent(VPH vph) {
        super.setParent(vph);
        this.LJLIL.setParent(vph);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        this.LJLIL.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        super.updateLayoutInfo(lynxBaseUI);
        this.LJLIL.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updatePropertiesInterval(VPA vpa) {
        this.LJLIL.updatePropertiesInterval(vpa);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.LJLIL.insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        this.LJLIL.insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setSign(int i, String str) {
        super.setSign(i, str);
        this.LJLIL.setSign(i, str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        super.updateDrawingLayoutInfo(i, i2, rect);
        this.LJLIL.updateDrawingLayoutInfo(i, i2, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        this.LJLIL.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
