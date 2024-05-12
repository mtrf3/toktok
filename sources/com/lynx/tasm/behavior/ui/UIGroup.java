package com.lynx.tasm.behavior.ui;

import X.C16880lQ;
import X.C79710VQc;
import X.VNU;
import X.VOT;
import X.VOV;
import X.VPU;
import X.VPY;
import X.VQ3;
import X.VR8;
import X.VR9;
import X.VRK;
import Y.IDComparatorS42S0000000_14;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes15.dex */
public abstract class UIGroup<T extends ViewGroup> extends LynxUI<T> implements VOV {
    public int mCurrentDrawIndex;
    public LynxBaseUI mCurrentDrawUI;
    public VR8 mDrawingOrderHelper;
    public boolean mIsInsertViewCalled;
    public Rect mOverflowClipRect;
    public static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();
    public static final float[] mEventCoords = new float[2];
    public static final PointF mTempPoint = new PointF();
    public static final float[] mMatrixTransformCoords = new float[2];
    public static final Matrix mInverseMatrix = new Matrix();

    @Override // X.VOV
    public void afterDrawChild(Canvas canvas, View view, long j) {
    }

    public boolean enableAutoClipRadius() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    public void layoutChildren() {
        for (int i = 0; i < this.mChildren.size(); i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.mChildren, i);
            if (!needCustomLayout()) {
                if (!lynxBaseUI.isFlatten()) {
                    lynxBaseUI.layout();
                } else {
                    ((LynxFlattenUI) lynxBaseUI).layout(lynxBaseUI.getOriginLeft(), lynxBaseUI.getOriginTop(), null);
                }
            } else if (lynxBaseUI instanceof UIGroup) {
                ((UIGroup) lynxBaseUI).layoutChildren();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean needCustomLayout() {
        return false;
    }

    public void dispatchOnAttach() {
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onAttach();
        }
    }

    public void dispatchOnDetach() {
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onDetach();
        }
    }

    public int getChildCount() {
        return this.mChildren.size();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        if (!this.mView.isLayoutRequested()) {
            return;
        }
        super.layout();
        layoutChildren();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        if (!this.mView.isLayoutRequested()) {
            return;
        }
        measureChildren();
        super.measure();
    }

    public void measureChildren() {
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().measure();
        }
    }

    public void removeAll() {
        for (LynxBaseUI lynxBaseUI = this.mDrawHead; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            lynxBaseUI.mDrawParent = null;
        }
        this.mDrawHead = null;
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().setParent(null);
        }
        this.mChildren.clear();
        T t = this.mView;
        if (t != 0) {
            ((ViewGroup) t).removeAllViews();
        }
    }

    public void updateDrawingOrder() {
        VR8 vr8 = this.mDrawingOrderHelper;
        boolean z = false;
        vr8.LIZIZ = 0;
        for (int i = 0; i < vr8.LIZ.getChildCount(); i++) {
            if (getViewZIndex(vr8.LIZ.getChildAt(i)) != null) {
                vr8.LIZIZ++;
            }
        }
        vr8.LIZJ = null;
        if (this.mDrawingOrderHelper.LIZIZ > 0) {
            z = true;
        }
        setChildrenDrawingOrderEnabledHelper(z);
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    @Override // X.VOV
    public boolean hasOverlappingRendering() {
        return hasOverlappingRenderingEnabled();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void initialize() {
        super.initialize();
        T t = this.mView;
        this.mDrawingOrderHelper = new VR8((ViewGroup) t);
        if (t instanceof VPU) {
            ((VPU) t).bindDrawChildHook(this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        dispatchOnAttach();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        dispatchOnDetach();
    }

    public View getAccessibilityHostView() {
        return this.mView;
    }

    public View getRealParentView() {
        return this.mView;
    }

    public boolean isInsertViewCalled() {
        return this.mIsInsertViewCalled;
    }

    @Override // X.VOV
    public void performLayoutChildrenUI() {
        layoutChildren();
    }

    @Override // X.VOV
    public void performMeasureChildrenUI() {
        measureChildren();
    }

    public UIGroup(VNU vnu) {
        this(vnu, null);
    }

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    private void onRemoveChildUI(LynxUI lynxUI) {
        boolean z;
        if (!LynxUI.ENABLE_ZINDEX) {
            return;
        }
        VR8 vr8 = this.mDrawingOrderHelper;
        T t = lynxUI.mView;
        vr8.getClass();
        if (getViewZIndex(t) != null) {
            vr8.LIZIZ--;
        }
        vr8.LIZJ = null;
        if (this.mDrawingOrderHelper.LIZIZ > 0) {
            z = true;
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabledHelper(z);
    }

    private void setChildrenDrawingOrderEnabledHelper(boolean z) {
        T t = this.mView;
        if (t instanceof VRK) {
            ((VRK) t).setChildrenDrawingOrderEnabled(z);
        } else {
            if (!(t instanceof VOT)) {
                return;
            }
            ((VOT) t).setChildrenDrawingOrderEnabled(z);
        }
    }

    @Override // X.VOV
    public void afterDispatchDraw(Canvas canvas) {
        for (LynxBaseUI lynxBaseUI = this.mCurrentDrawUI; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            if (lynxBaseUI.isFlatten() && !(lynxBaseUI instanceof UIShadowProxy)) {
                drawChild((LynxFlattenUI) lynxBaseUI, canvas);
            }
        }
    }

    @Override // X.VOV
    public void beforeDispatchDraw(Canvas canvas) {
        VQ3 vq3;
        BackgroundDrawable backgroundDrawable;
        this.mCurrentDrawUI = this.mDrawHead;
        boolean z = false;
        this.mCurrentDrawIndex = 0;
        if (this.mSkewX != 0.0f || this.mSkewY != 0.0f) {
            z = true;
        }
        if ((this.mClipToRadius || (this.mContext.LJZ && this.mOverflow == 0 && enableAutoClipRadius())) && (vq3 = this.mLynxBackground) != null && (backgroundDrawable = vq3.LIZIZ) != null) {
            Path LJII = backgroundDrawable.LJII();
            if (LJII != null) {
                canvas.clipPath(LJII);
            } else {
                if (!z) {
                    return;
                }
                canvas.clipRect(getClipBounds());
            }
        }
    }

    @Override // X.VOV
    public void beforeDraw(Canvas canvas) {
        Path path;
        double[] dArr;
        VR9[] vr9Arr;
        canvas.skew(this.mSkewX, this.mSkewY);
        C79710VQc c79710VQc = this.mClipPath;
        if (c79710VQc != null) {
            int width = getWidth();
            int height = getHeight();
            int i = c79710VQc.LIZIZ;
            if (i == 3) {
                path = c79710VQc.LIZ;
            } else {
                if (i == 0) {
                    return;
                }
                if (width != c79710VQc.LIZJ || height != c79710VQc.LIZLLL || (path = c79710VQc.LIZ) == null) {
                    c79710VQc.LIZJ = width;
                    c79710VQc.LIZLLL = height;
                    Path path2 = c79710VQc.LIZ;
                    if (path2 == null) {
                        c79710VQc.LIZ = new Path();
                    } else {
                        path2.reset();
                    }
                    int i2 = c79710VQc.LIZIZ;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 4) {
                                if (i2 == 5 && (vr9Arr = c79710VQc.LJ) != null && vr9Arr.length == 4) {
                                    double d = height;
                                    double LIZIZ = C79710VQc.LIZIZ(vr9Arr[0], d);
                                    double d2 = width;
                                    double LIZIZ2 = C79710VQc.LIZIZ(c79710VQc.LJ[1], d2);
                                    double LIZIZ3 = C79710VQc.LIZIZ(c79710VQc.LJ[2], d);
                                    double LIZIZ4 = C79710VQc.LIZIZ(c79710VQc.LJ[3], d2);
                                    double d3 = LIZIZ + LIZIZ3;
                                    double d4 = LIZIZ4 + LIZIZ2;
                                    if (d3 != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d3 > d) {
                                        double d5 = d / d3;
                                        LIZIZ *= d5;
                                        LIZIZ3 *= d5;
                                    }
                                    if (d4 != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d4 > d2) {
                                        double d6 = d2 / d4;
                                        LIZIZ4 *= d6;
                                        LIZIZ2 *= d6;
                                    }
                                    RectF rectF = new RectF((float) LIZIZ4, (float) LIZIZ, (float) (d2 - LIZIZ2), (float) (d - LIZIZ3));
                                    int i3 = c79710VQc.LJII;
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 == 3) {
                                                c79710VQc.LJI.LJ(rectF.width(), rectF.height());
                                                float[] LIZ = c79710VQc.LJI.LIZ();
                                                if (LIZ.length >= 8) {
                                                    float f = LIZ[4];
                                                    float f2 = LIZ[5];
                                                    float f3 = rectF.right - f;
                                                    float f4 = rectF.bottom - f2;
                                                    double[] dArr2 = c79710VQc.LJFF;
                                                    float f5 = (float) dArr2[0];
                                                    float f6 = (float) dArr2[1];
                                                    C79710VQc.LIZ(c79710VQc.LIZ, f, f2, f3, f4, f5, f6, 1);
                                                    float f7 = LIZ[7];
                                                    C79710VQc.LIZ(c79710VQc.LIZ, f7, f2, rectF.left + f7, rectF.bottom - f2, f5, f6, 2);
                                                    float f8 = LIZ[0];
                                                    float f9 = LIZ[1];
                                                    C79710VQc.LIZ(c79710VQc.LIZ, f8, f9, rectF.left + f8, rectF.top + f9, f5, f6, 3);
                                                    float f10 = LIZ[2];
                                                    float f11 = LIZ[3];
                                                    C79710VQc.LIZ(c79710VQc.LIZ, f10, f11, rectF.right - f10, rectF.top + f11, f5, f6, 4);
                                                    c79710VQc.LIZ.close();
                                                }
                                            }
                                        } else {
                                            c79710VQc.LJI.LJ(rectF.width(), rectF.height());
                                            c79710VQc.LIZ.addRoundRect(rectF, c79710VQc.LJI.LIZ(), Path.Direction.CW);
                                        }
                                    } else {
                                        c79710VQc.LIZ.addRect(rectF, Path.Direction.CW);
                                    }
                                }
                            } else {
                                VR9[] vr9Arr2 = c79710VQc.LJ;
                                if (vr9Arr2 != null && vr9Arr2.length == 4 && (dArr = c79710VQc.LJFF) != null && dArr.length == 2) {
                                    double d7 = width;
                                    float LIZIZ5 = (float) C79710VQc.LIZIZ(vr9Arr2[0], d7);
                                    float LIZIZ6 = (float) C79710VQc.LIZIZ(c79710VQc.LJ[1], d7);
                                    float LIZIZ7 = (float) C79710VQc.LIZIZ(c79710VQc.LJ[2], d7);
                                    float LIZIZ8 = (float) C79710VQc.LIZIZ(c79710VQc.LJ[3], height);
                                    double[] dArr3 = c79710VQc.LJFF;
                                    float f12 = (float) dArr3[0];
                                    float f13 = (float) dArr3[1];
                                    if (LIZIZ5 != 0.0f || LIZIZ6 != 0.0f) {
                                        int i4 = 1;
                                        do {
                                            C79710VQc.LIZ(c79710VQc.LIZ, LIZIZ5, LIZIZ6, LIZIZ7, LIZIZ8, f12, f13, i4);
                                            i4++;
                                        } while (i4 <= 4);
                                        c79710VQc.LIZ.close();
                                    }
                                }
                            }
                        } else {
                            VR9[] vr9Arr3 = c79710VQc.LJ;
                            if (vr9Arr3 != null && vr9Arr3.length == 4) {
                                double d8 = width;
                                float LIZIZ9 = (float) C79710VQc.LIZIZ(vr9Arr3[0], d8);
                                float LIZIZ10 = (float) C79710VQc.LIZIZ(c79710VQc.LJ[1], d8);
                                float LIZIZ11 = (float) C79710VQc.LIZIZ(c79710VQc.LJ[2], d8);
                                float LIZIZ12 = (float) C79710VQc.LIZIZ(c79710VQc.LJ[3], height);
                                if (LIZIZ9 != 0.0f || LIZIZ10 != 0.0f) {
                                    c79710VQc.LIZ.addOval(LIZIZ11 - LIZIZ9, LIZIZ12 - LIZIZ10, LIZIZ11 + LIZIZ9, LIZIZ12 + LIZIZ10, Path.Direction.CW);
                                }
                            }
                        }
                    } else {
                        VR9[] vr9Arr4 = c79710VQc.LJ;
                        if (vr9Arr4 != null && vr9Arr4.length == 3) {
                            c79710VQc.LIZ.addCircle((float) C79710VQc.LIZIZ(c79710VQc.LJ[1], width), (float) C79710VQc.LIZIZ(c79710VQc.LJ[2], height), (float) C79710VQc.LIZIZ(vr9Arr4[0], Math.sqrt((height * height) + (width * width)) / C79710VQc.LJIIIZ), Path.Direction.CW);
                        }
                    }
                    path = c79710VQc.LIZ;
                }
                canvas.clipPath(path);
            }
            if (path == null) {
                return;
            }
            canvas.clipPath(path);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public LynxBaseUI getChildAt(int i) {
        return (LynxBaseUI) ListProtector.get(this.mChildren, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getIndex(LynxBaseUI lynxBaseUI) {
        return this.mChildren.indexOf(lynxBaseUI);
    }

    public void insertView(LynxUI lynxUI) {
        int i = -1;
        for (LynxBaseUI lynxBaseUI = this.mDrawHead; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            if (lynxBaseUI instanceof LynxUI) {
                i++;
            }
            if (lynxBaseUI == lynxUI) {
                break;
            }
        }
        if (lynxUI.mView.getParent() != null && (lynxUI.mView.getParent() instanceof ViewGroup)) {
            C16880lQ.LJLLL(lynxUI.mView, (ViewGroup) lynxUI.mView.getParent());
            onRemoveChildUI(lynxUI);
        }
        ((ViewGroup) this.mView).addView(lynxUI.mView, i);
        onAddChildUI(lynxUI, i);
    }

    public boolean onRemoveChild(LynxBaseUI lynxBaseUI) {
        if (!this.mChildren.remove(lynxBaseUI)) {
            return false;
        }
        lynxBaseUI.setParent(null);
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void removeChild(LynxBaseUI lynxBaseUI) {
        if (onRemoveChild(lynxBaseUI)) {
            removeView(lynxBaseUI);
        }
    }

    public void removeView(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            C16880lQ.LJLLL(lynxUI.mView, (ViewGroup) this.mView);
            if (lynxBaseUI instanceof UIList) {
                C16880lQ.LJLLL(((UIList) lynxBaseUI).LJLLLLLL, (ViewGroup) this.mView);
            }
            onRemoveChildUI(lynxUI);
            return;
        }
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
    }

    public UIGroup(VNU vnu, Object obj) {
        super(vnu, obj);
        this.mCurrentDrawUI = this.mDrawHead;
        this.mOverflowClipRect = new Rect();
        this.mIsInsertViewCalled = false;
    }

    private void onAddChildUI(LynxUI lynxUI, int i) {
        if (!LynxUI.ENABLE_ZINDEX) {
            return;
        }
        VR8 vr8 = this.mDrawingOrderHelper;
        T t = lynxUI.mView;
        vr8.getClass();
        boolean z = true;
        if (getViewZIndex(t) != null) {
            vr8.LIZIZ++;
        }
        vr8.LIZJ = null;
        if (this.mDrawingOrderHelper.LIZIZ <= 0) {
            z = false;
        }
        setChildrenDrawingOrderEnabledHelper(z);
    }

    public static void setViewZIndex(View view, int i) {
        mZIndexHash.put(view, Integer.valueOf(i));
    }

    public void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        Rect bound = lynxFlattenUI.getBound();
        canvas.save();
        if (bound != null) {
            canvas.clipRect(bound);
        }
        lynxFlattenUI.innerDraw(canvas);
        canvas.restore();
    }

    @Override // X.VOV
    public int getChildDrawingOrder(int i, int i2) {
        VR8 vr8 = this.mDrawingOrderHelper;
        if (vr8 != null) {
            if (vr8.LIZJ == null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < i; i3++) {
                    arrayList.add(vr8.LIZ.getChildAt(i3));
                }
                Collections.sort(arrayList, new IDComparatorS42S0000000_14(2));
                vr8.LIZJ = new int[i];
                for (int i4 = 0; i4 < i; i4++) {
                    vr8.LIZJ[i4] = vr8.LIZ.indexOfChild((View) ListProtector.get(arrayList, i4));
                }
            }
            return vr8.LIZJ[i2];
        }
        return i2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        onInsertChild(lynxBaseUI, i);
        this.mIsInsertViewCalled = true;
    }

    public void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
        lynxBaseUI.setOffsetDescendantRectToLynxView(getOffsetDescendantRectToLynxView());
        ListProtector.add(this.mChildren, i, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    private Rect drawFlattenUIBefore(Canvas canvas, View view, long j) {
        for (LynxBaseUI lynxBaseUI = this.mCurrentDrawUI; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            if (!lynxBaseUI.isFlatten()) {
                if (((LynxUI) lynxBaseUI).mView == view) {
                    Rect bound = lynxBaseUI.getBound();
                    this.mCurrentDrawUI = lynxBaseUI.mNextDrawUI;
                    return bound;
                }
            } else if (lynxBaseUI.isFlatten()) {
                drawChild((LynxFlattenUI) lynxBaseUI, canvas);
            }
        }
        return null;
    }

    private LynxUI findTouchTargetOnViewChian(float[] fArr, ViewGroup viewGroup, Map<View, LynxUI> map) {
        LynxUI lynxUI = null;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (this.mContext.LLII) {
                float[] fArr2 = new float[2];
                if (!isTransformedTouchPointInView(fArr, viewGroup, childAt, fArr2)) {
                    continue;
                } else if (map.containsKey(childAt)) {
                    lynxUI = map.get(childAt);
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    if (lynxUI != null) {
                        return lynxUI;
                    }
                } else if ((childAt instanceof ViewGroup) && (lynxUI = findTouchTargetOnViewChian(fArr2, (ViewGroup) childAt, map)) != null) {
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    return lynxUI;
                }
            } else {
                PointF pointF = mTempPoint;
                if (isTransformedTouchPointInView(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                    float f = fArr[0];
                    float f2 = fArr[1];
                    fArr[0] = pointF.x;
                    fArr[1] = pointF.y;
                    if (map.containsKey(childAt)) {
                        lynxUI = map.get(childAt);
                    } else {
                        if (childAt instanceof ViewGroup) {
                            lynxUI = findTouchTargetOnViewChian(fArr, (ViewGroup) childAt, map);
                        }
                        fArr[0] = f;
                        fArr[1] = f2;
                    }
                    if (lynxUI != null) {
                        return lynxUI;
                    }
                    fArr[0] = f;
                    fArr[1] = f2;
                } else {
                    continue;
                }
            }
        }
        return lynxUI;
    }

    @Override // X.VOV
    public Rect beforeDrawChild(Canvas canvas, View view, long j) {
        return drawFlattenUIBefore(canvas, view, j);
    }

    public VPY findUIWithCustomLayout(float f, float f2, UIGroup uIGroup) {
        HashMap hashMap = new HashMap();
        for (int childCount = uIGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            LynxBaseUI childAt = uIGroup.getChildAt(childCount);
            if (childAt instanceof UIShadowProxy) {
                childAt = ((UIShadowProxy) childAt).LJLIL;
            }
            if (childAt instanceof LynxUI) {
                LynxUI lynxUI = (LynxUI) childAt;
                hashMap.put(lynxUI.mView, lynxUI);
            } else {
                new RuntimeException("ui that need custom layout should not have flatten child!");
            }
        }
        return findUIWithCustomLayoutByChildren(f, f2, uIGroup, hashMap);
    }

    private boolean isTransformedTouchPointInView(float[] fArr, View view, View view2, float[] fArr2) {
        float[] targetPoint = getTargetPoint(fArr[0], fArr[1], view.getScrollX(), view.getScrollY(), view2, view2.getMatrix());
        float f = targetPoint[0];
        fArr2[0] = f;
        fArr2[1] = targetPoint[1];
        if (f >= 0.0f && f < view2.getRight() - view2.getLeft()) {
            float f2 = fArr2[1];
            if (f2 >= 0.0f && f2 < view2.getBottom() - view2.getTop()) {
                return true;
            }
        }
        return false;
    }

    public VPY findUIWithCustomLayoutByChildren(float f, float f2, UIGroup uIGroup, Map<View, LynxUI> map) {
        float[] fArr = {f, f2};
        LynxUI findTouchTargetOnViewChian = findTouchTargetOnViewChian(fArr, (ViewGroup) uIGroup.mView, map);
        if (findTouchTargetOnViewChian == null) {
            return uIGroup;
        }
        if (findTouchTargetOnViewChian.needCustomLayout() && (findTouchTargetOnViewChian instanceof UIGroup)) {
            UIGroup uIGroup2 = (UIGroup) findTouchTargetOnViewChian;
            return uIGroup2.findUIWithCustomLayout(fArr[0], fArr[1], uIGroup2);
        }
        if (this.mContext.LLII) {
            return findTouchTargetOnViewChian.hitTest(fArr[0], fArr[1]);
        }
        return findTouchTargetOnViewChian.hitTest(fArr[0] + findTouchTargetOnViewChian.getScrollX(), fArr[1] + findTouchTargetOnViewChian.getScrollY());
    }

    private boolean isTransformedTouchPointInView(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = mMatrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = mInverseMatrix;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (scrollX < 0.0f || scrollX >= view.getRight() - view.getLeft() || scrollY < 0.0f || scrollY >= view.getBottom() - view.getTop()) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
