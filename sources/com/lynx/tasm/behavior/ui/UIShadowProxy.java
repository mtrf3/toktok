package com.lynx.tasm.behavior.ui;

import X.C16320kW;
import X.C79669VOn;
import X.C79708VQa;
import X.C79726VQs;
import X.C79727VQt;
import X.C79729VQv;
import X.VNU;
import X.VPA;
import X.VPY;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import java.util.List;

/* loaded from: classes15.dex */
public class UIShadowProxy extends UIGroup<C79727VQt> {
    public final LynxBaseUI LJLIL;
    public List<C79729VQv> LJLILLLLZI;
    public C79726VQs LJLJI;
    public final Matrix LJLJJI;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBoundRectForOverflow() {
        return null;
    }

    public final C79726VQs LJIJJLI() {
        if (this.LJLJI == null) {
            C79726VQs c79726VQs = new C79726VQs();
            this.LJLJI = c79726VQs;
            T t = this.mView;
            if (t != 0) {
                ((C79727VQt) t).LJLJI = c79726VQs;
            }
        }
        return this.LJLJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0216, code lost:
    
        if (r15 < 1.0f) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL() {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.UIShadowProxy.LJIL():void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean enableLayoutAnimation() {
        return this.LJLIL.enableLayoutAnimation();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBound() {
        return this.LJLIL.getBound();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final int getChildCount() {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI instanceof UIGroup) {
            return ((UIGroup) lynxBaseUI).getChildCount();
        }
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final List<LynxBaseUI> getChildren() {
        return this.LJLIL.getChildren();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getHeight() {
        return this.LJLIL.getHeight();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final String getIdSelector() {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI != null) {
            return lynxBaseUI.getIdSelector();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C79669VOn getLayoutAnimator() {
        return this.LJLIL.getLayoutAnimator();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getLeft() {
        return this.LJLIL.getLeft();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getOriginLeft() {
        return this.LJLIL.getOriginLeft();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getOriginTop() {
        return this.LJLIL.getOriginTop();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final JavaOnlyMap getProps() {
        return this.LJLIL.getProps();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final String getRefIdSelector() {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI != null) {
            return lynxBaseUI.getRefIdSelector();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final String getTagName() {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI != null) {
            return lynxBaseUI.getTagName();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getTop() {
        return this.LJLIL.getTop();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C79708VQa getTransitionAnimator() {
        return this.LJLIL.getTransitionAnimator();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float getTranslationZ() {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI instanceof LynxUI) {
            return lynxBaseUI.getTranslationZ();
        }
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getWidth() {
        return this.LJLIL.getWidth();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isFirstAnimatedReady() {
        return this.LJLIL.isFirstAnimatedReady();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isFlatten() {
        return this.LJLIL.isFlatten();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final boolean isInsertViewCalled() {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI instanceof UIGroup) {
            return ((UIGroup) lynxBaseUI).isInsertViewCalled();
        }
        return super.isInsertViewCalled();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        View view = (View) this.mView.getParent();
        if (view == null) {
            return;
        }
        ((ViewGroup) this.mView).layout(0, 0, view.getWidth(), view.getHeight());
        if (this.mView.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.mView.getParent();
            if (getOverflow() != 0) {
                viewGroup.setClipChildren(false);
            }
            C16320kW.LIZJ(this.mView, getBoundRectForOverflow());
        }
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI instanceof LynxUI) {
            lynxBaseUI.layout();
        }
        LJIL();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        this.LJLIL.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI != null) {
            lynxBaseUI.onPropsUpdated();
        }
        super.onPropsUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C79727VQt(this, context);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final LynxBaseUI getChildAt(int i) {
        return (LynxBaseUI) ListProtector.get(this.LJLIL.mChildren, i);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void insertView(LynxUI lynxUI) {
        ((UIGroup) this.LJLIL).insertView(lynxUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        this.LJLIL.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeView(LynxBaseUI lynxBaseUI) {
        ((UIGroup) this.LJLIL).removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBound(Rect rect) {
        this.LJLIL.setBound(rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBoxShadow(ReadableArray readableArray) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        this.LJLILLLLZI = C79729VQv.LIZIZ(readableArray);
        LJIL();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLeft(int i) {
        this.LJLIL.setLeft(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOutlineColor(int i) {
        LJIJJLI().LIZIZ = Integer.valueOf(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOutlineWidth(float f) {
        LJIJJLI().LIZJ = f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setTop(int i) {
        this.LJLIL.setTop(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        this.LJLIL.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        this.LJLIL.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updatePropertiesInterval(VPA vpa) {
        this.LJLIL.updateProperties(vpa);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateSticky(float[] fArr) {
        this.LJLIL.updateSticky(fArr);
        invalidate();
    }

    public UIShadowProxy(VNU vnu, LynxBaseUI lynxBaseUI) {
        super(vnu);
        this.LJLJJI = new Matrix();
        this.mOverflow = 3;
        this.LJLIL = lynxBaseUI;
        lynxBaseUI.setParent(this);
        setSign(lynxBaseUI.getSign(), lynxBaseUI.getTagName());
        initialize();
        onInsertChild(lynxBaseUI, 0);
        super.insertDrawList(null, lynxBaseUI);
        super.insertView((LynxUI) lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean checkStickyOnParentScroll(int i, int i2) {
        boolean checkStickyOnParentScroll = this.LJLIL.checkStickyOnParentScroll(i, i2);
        if (checkStickyOnParentScroll) {
            invalidate();
        }
        return checkStickyOnParentScroll;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean childrenContainPoint(float f, float f2) {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI == null) {
            return false;
        }
        return lynxBaseUI.childrenContainPoint(f, f2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean containsPoint(float f, float f2) {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI == null) {
            return false;
        }
        return lynxBaseUI.containsPoint(f, f2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final VPY hitTest(float f, float f2) {
        LynxBaseUI lynxBaseUI = this.LJLIL;
        if (lynxBaseUI == null) {
            return null;
        }
        return lynxBaseUI.hitTest(f, f2);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.LJLIL.insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        ((LynxUI) this.LJLIL).insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        this.LJLIL.updateDrawingLayoutInfo(i, i2, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.LJLIL.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
