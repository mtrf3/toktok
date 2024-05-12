package com.lynx.tasm.behavior.ui;

import X.C16880lQ;
import X.C32035Chj;
import X.C60502Noo;
import X.C65304Pk4;
import X.C79669VOn;
import X.C79670VOo;
import X.C79672VOq;
import X.C79676VOu;
import X.C79699VPr;
import X.C79708VQa;
import X.C79709VQb;
import X.C79710VQc;
import X.C79713VQf;
import X.C79714VQg;
import X.C79715VQh;
import X.C79716VQi;
import X.C79720VQm;
import X.C79732VQy;
import X.C79733VQz;
import X.EWS;
import X.EnumC79545VJt;
import X.F5B;
import X.InterfaceC60501Non;
import X.OCV;
import X.VNU;
import X.VPD;
import X.VPH;
import X.VQ7;
import X.VQQ;
import X.VQZ;
import X.VR0;
import X.VR6;
import X.VR9;
import X.VRC;
import X.VRK;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public abstract class LynxUI<T extends View> extends LynxBaseUI {
    public static final boolean ENABLE_ZINDEX = false;
    public C79715VQh mBackgroundManager;
    public C79710VQc mClipPath;
    public LynxBaseUI mDrawHead;
    public C79720VQm mHeroAnimOwner;
    public VQZ mKeyframeManager;
    public C79669VOn mLayoutAnimator;
    public boolean mOverlappingRendering;
    public boolean mSetVisibleByCSS;
    public C79708VQa mTransitionAnimator;
    public T mView;
    public int mZIndex;

    public T createView(Context context) {
        return null;
    }

    public T createView(Context context, Object obj) {
        return null;
    }

    public LynxUI getTransitionUI() {
        return null;
    }

    public void setLayoutAnimationCreateTimingFunc(String str) {
    }

    private void prepareKeyframeManager() {
        if (this.mKeyframeManager == null) {
            this.mKeyframeManager = new VQZ(this);
        }
    }

    private void prepareLayoutAnimator() {
        if (this.mLayoutAnimator == null) {
            this.mLayoutAnimator = new C79669VOn();
        }
    }

    private boolean shouldDoTransformTransition() {
        C79708VQa c79708VQa;
        if (!this.mIsFirstAnimatedReady && this.hasTransformChanged && (c79708VQa = this.mTransitionAnimator) != null && c79708VQa.LIZIZ(4096)) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean enableLayoutAnimation() {
        C79676VOu c79676VOu;
        C79670VOo c79670VOo;
        C79669VOn c79669VOn = this.mLayoutAnimator;
        if (c79669VOn == null) {
            return false;
        }
        C79672VOq c79672VOq = c79669VOn.LJIJI;
        if ((c79672VOq == null || !c79672VOq.LIZJ()) && (((c79676VOu = c79669VOn.LJIJJLI) == null || !c79676VOu.LIZJ()) && ((c79670VOo = c79669VOn.LJIJJ) == null || !c79670VOo.LIZJ()))) {
            return false;
        }
        return true;
    }

    public void execPauseAnim() {
        C79713VQf c79713VQf;
        C79720VQm c79720VQm = this.mHeroAnimOwner;
        c79720VQm.getClass();
        if (!C60502Noo.LIZ.LJI || c79720VQm.LIZ() || (c79713VQf = c79720VQm.LJI) == null) {
            return;
        }
        c79720VQm.LIZ.setAnimation(c79713VQf);
        if (c79720VQm.LIZ.getKeyframeManager() == null) {
            return;
        }
        c79720VQm.LIZ.getKeyframeManager().LIZ();
    }

    public void execResumeAnim() {
        C79713VQf c79713VQf;
        C79720VQm c79720VQm = this.mHeroAnimOwner;
        c79720VQm.getClass();
        if (!C60502Noo.LIZ.LJI || c79720VQm.LIZ() || (c79713VQf = c79720VQm.LJII) == null) {
            return;
        }
        c79720VQm.LIZ.setAnimation(c79713VQf);
        if (c79720VQm.LIZ.getKeyframeManager() == null) {
            return;
        }
        c79720VQm.LIZ.getKeyframeManager().LIZ();
    }

    public int getBackgroundColor() {
        return this.mBackgroundManager.LJ;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getScaleX() {
        T t = this.mView;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getScaleY() {
        T t = this.mView;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public Matrix getTransformMatrix() {
        T t = this.mView;
        if (t == null || t.getMatrix() == null) {
            return super.getTransformMatrix();
        }
        return this.mView.getMatrix();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationX() {
        return this.mView.getTranslationX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationY() {
        return this.mView.getTranslationY();
    }

    public boolean hasAnimationRunning() {
        T t;
        HashMap<String, C79714VQg> hashMap;
        VQZ vqz = this.mKeyframeManager;
        if (vqz != null && (hashMap = vqz.LIZJ) != null) {
            Iterator<C79714VQg> it = hashMap.values().iterator();
            while (it.hasNext()) {
                if (it.next().LJII == VR0.RUNNING) {
                    break;
                }
            }
        }
        if ((this.mTransitionAnimator == null || !(!r0.LJII.isEmpty())) && ((t = this.mView) == null || t.getAnimation() == null)) {
            return false;
        }
        return true;
    }

    public boolean hasOverlappingRenderingEnabled() {
        if ("HUAWEI".equals(Build.MANUFACTURER)) {
            if (C79732VQy.LIZJ == -1) {
                if (C79732VQy.LIZLLL == null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        if (Build.SUPPORTED_ABIS.length > 0) {
                            int i = 0;
                            while (true) {
                                String[] strArr = Build.SUPPORTED_ABIS;
                                if (i >= strArr.length) {
                                    break;
                                }
                                sb.append(strArr[i]);
                                if (i != strArr.length - 1) {
                                    sb.append(", ");
                                }
                                i++;
                            }
                        } else {
                            sb = new StringBuilder(Build.CPU_ABI);
                        }
                        if (TextUtils.isEmpty(sb.toString())) {
                            C79732VQy.LIZLLL = "unknown";
                        }
                        C79732VQy.LIZLLL = sb.toString();
                    } catch (Exception unused) {
                        LLog.LIZLLL(4, "DeviceUtils", "Lynx get unknown CPU ABIs");
                        C79732VQy.LIZLLL = "unknown";
                    }
                }
                C79732VQy.LIZJ = C79732VQy.LIZLLL.contains("64") ? 1 : 0;
            }
            if (C79732VQy.LIZJ != 1) {
                LLog.LIZLLL(2, "LynxUI", "Disable overlap rendering for Huawei 32bit machine");
                return false;
            }
        }
        return this.mOverlappingRendering;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public void invalidate() {
        this.mView.invalidate();
    }

    public boolean isRtl() {
        if (this.mLynxDirection == 2) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isUserInteractionEnabled() {
        T t;
        if (this.userInteractionEnabled && (t = this.mView) != null && t.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isVisible() {
        T t = this.mView;
        if (t == null || t.getVisibility() != 0 || this.mView.getAlpha() == 0.0f) {
            return false;
        }
        return this.mView.isAttachedToWindow();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDrawingPositionChanged() {
        if (!this.mView.isLayoutRequested()) {
            handleLayout();
            invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public void requestLayout() {
        this.mView.requestLayout();
    }

    public void setLayoutParamsInternal() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams generateLayoutParams;
        VPH vph = this.mParent;
        if (vph != null && (vph instanceof UIGroup) && ((LynxBaseUI) vph).needCustomLayout() && (generateLayoutParams = ((LynxBaseUI) this.mParent).generateLayoutParams((layoutParams = this.mView.getLayoutParams()))) != null && layoutParams != generateLayoutParams) {
            updateLayoutParams(generateLayoutParams);
        }
    }

    public void updatePerspectiveToView() {
        int height;
        float f;
        float f2;
        float f3;
        double d;
        double d2;
        int height2;
        float f4 = this.mContext.LJLZ.density;
        ReadableArray readableArray = this.mPerspective;
        if (readableArray != null && readableArray.size() > 1 && this.mPerspective.getInt(1) != 3) {
            if (this.mPerspective.getInt(1) == 0) {
                double d3 = f4;
                f3 = (float) (this.mPerspective.getDouble(0) * d3 * d3 * LynxBaseUI.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.mView.setCameraDistance(f3);
            }
            if (this.mPerspective.getInt(1) == 1) {
                d2 = this.mPerspective.getDouble(0) / 100.0d;
                height2 = this.mContext.LJI().getWidth();
            } else if (this.mPerspective.getInt(1) == 2) {
                d2 = this.mPerspective.getDouble(0) / 100.0d;
                height2 = this.mContext.LJI().getHeight();
            } else {
                d = this.mPerspective.getDouble(0);
                f = ((float) d) * f4;
                f2 = LynxBaseUI.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            d = d2 * height2;
            f = ((float) d) * f4;
            f2 = LynxBaseUI.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            if (getWidth() > getHeight()) {
                height = getWidth();
            } else {
                height = getHeight();
            }
            f = height * f4 * LynxBaseUI.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            f2 = 100.0f;
        }
        f3 = f2 * f;
        this.mView.setCameraDistance(f3);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        C79708VQa c79708VQa = this.mTransitionAnimator;
        if (c79708VQa != null) {
            c79708VQa.LJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        if (r1 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleLayout() {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "LynxUI."
            r1.append(r0)
            java.lang.String r0 = r8.getTagName()
            r1.append(r0)
            java.lang.String r0 = ".layout"
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            com.lynx.tasm.base.TraceEvent.LIZIZ(r2)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r2)
            java.lang.String r0 = ".mView"
            r1.append(r0)
            java.lang.String r7 = X.X1D.LIZIZ(r1)
            com.lynx.tasm.base.TraceEvent.LIZIZ(r7)
            T extends android.view.View r6 = r8.mView
            int r5 = r8.getLeft()
            int r4 = r8.getTop()
            int r0 = r8.getLeft()
            int r3 = r8.getWidth()
            int r3 = r3 + r0
            int r1 = r8.getTop()
            int r0 = r8.getHeight()
            int r0 = r0 + r1
            r6.layout(r5, r4, r3, r0)
            com.lynx.tasm.base.TraceEvent.LJ(r7)
            X.VPH r1 = r8.mParent
            boolean r0 = r1 instanceof com.lynx.tasm.behavior.ui.UIShadowProxy
            if (r0 == 0) goto L59
            com.lynx.tasm.behavior.ui.UIShadowProxy r1 = (com.lynx.tasm.behavior.ui.UIShadowProxy) r1
        L59:
            T extends android.view.View r0 = r8.mView
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L90
            T extends android.view.View r0 = r8.mView
            android.view.ViewParent r4 = r0.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            float r0 = r8.mSkewX
            r3 = 0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L79
            float r0 = r8.mSkewY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb5
        L79:
            r1 = 1
        L7a:
            int r0 = r8.getOverflow()
            if (r0 != 0) goto L82
            if (r1 == 0) goto L87
        L82:
            r4.setClipChildren(r3)
            if (r1 != 0) goto L90
        L87:
            T extends android.view.View r1 = r8.mView
            android.graphics.Rect r0 = r8.getBoundRectForOverflow()
            X.C16320kW.LIZJ(r1, r0)
        L90:
            int r0 = r8.getOverflow()
            if (r0 == 0) goto Lb1
            int r0 = r8.getWidth()
            if (r0 == 0) goto La2
            int r0 = r8.getHeight()
            if (r0 != 0) goto Lb1
        La2:
            T extends android.view.View r1 = r8.mView
            boolean r0 = r1 instanceof X.VS2
            if (r0 == 0) goto Lb1
            X.VS2 r1 = (X.VS2) r1
            int r0 = r8.getOverflow()
            r1.setOverflow(r0)
        Lb1:
            com.lynx.tasm.base.TraceEvent.LJ(r2)
            return
        Lb5:
            r1 = 0
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxUI.handleLayout():void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void initialize() {
        super.initialize();
        T createView = createView(this.mContext, this.mParam);
        this.mView = createView;
        if (createView == null) {
            this.mView = createView(this.mContext);
        }
        if (this.mView == null) {
            return;
        }
        this.mHeroAnimOwner = new C79720VQm(this);
        C79715VQh c79715VQh = new C79715VQh(this, this.mContext);
        this.mBackgroundManager = c79715VQh;
        this.mLynxBackground = c79715VQh;
        c79715VQh.LIZJ = this.mDrawableCallback;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxUI.");
        LIZ.append(getTagName());
        LIZ.append("measure");
        String LIZIZ = X1D.LIZIZ(LIZ);
        TraceEvent.LIZIZ(LIZIZ);
        setLayoutParamsInternal();
        this.mView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        TraceEvent.LJ(LIZIZ);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAnimatedNodeReady() {
        C79708VQa c79708VQa;
        updatePerspectiveToView();
        if (shouldDoTransform()) {
            C79715VQh c79715VQh = this.mBackgroundManager;
            VQ7 vq7 = this.mTransformOrigin;
            LynxUI lynxUI = c79715VQh.LJFF.get();
            if (lynxUI != null && lynxUI.mView != null && vq7 != null) {
                float latestWidth = lynxUI.getLatestWidth();
                float latestHeight = lynxUI.getLatestHeight();
                C79716VQi c79716VQi = new C79716VQi();
                c79716VQi.LIZ = latestWidth * 0.5f;
                c79716VQi.LIZIZ = latestHeight * 0.5f;
                if (vq7 != VQ7.LJ) {
                    float f = vq7.LIZ;
                    if (f != 0.5f || vq7.LIZIZ != 1) {
                        if (vq7.LIZIZ == 1) {
                            f *= latestWidth;
                        }
                        c79716VQi.LIZ = f;
                    }
                    float f2 = vq7.LIZJ;
                    if (f2 != 0.5f || vq7.LIZLLL != 1) {
                        if (vq7.LIZLLL == 1) {
                            f2 *= latestHeight;
                        }
                        c79716VQi.LIZIZ = f2;
                    }
                }
                lynxUI.mView.setPivotX(c79716VQi.LIZ);
                lynxUI.mView.setPivotY(c79716VQi.LIZIZ);
                lynxUI.mView.invalidate();
            }
            if (shouldDoTransformTransition()) {
                C79708VQa c79708VQa2 = this.mTransitionAnimator;
                LynxBaseUI lynxBaseUI = c79708VQa2.LJI;
                if (lynxBaseUI == null) {
                    lynxBaseUI = this;
                }
                c79708VQa2.LIZ(lynxBaseUI, 4096, lynxBaseUI.mTransformRaw);
            } else {
                C79708VQa c79708VQa3 = this.mTransitionAnimator;
                if (c79708VQa3 != null) {
                    c79708VQa3.LJFF(4096);
                }
                this.mBackgroundManager.LJIIJJI(this.mTransformRaw);
            }
        }
        if (!this.mIsFirstAnimatedReady && (c79708VQa = this.mTransitionAnimator) != null && !c79708VQa.LJIIIIZZ.isEmpty()) {
            for (Map.Entry<Integer, Animator> entry : c79708VQa.LJIIIIZZ.entrySet()) {
                Animator animator = c79708VQa.LJII.get(entry.getKey());
                if (animator != null) {
                    animator.cancel();
                }
                Animator clone = entry.getValue().clone();
                clone.setDuration(10000000L);
                clone.setStartDelay(0L);
                if (clone instanceof AnimatorSet) {
                    Iterator<Animator> it = ((AnimatorSet) clone).getChildAnimations().iterator();
                    while (it.hasNext()) {
                        C16880lQ.LJLJJI(it.next());
                    }
                }
                C16880lQ.LJLJJI(clone);
                clone.addListener(new VR6());
                clone.start();
                entry.getValue().start();
                c79708VQa.LJII.put(entry.getKey(), entry.getValue());
            }
            c79708VQa.LJIIIIZZ.clear();
        }
        VQZ vqz = this.mKeyframeManager;
        if (vqz != null) {
            vqz.LIZ();
        }
        super.onAnimatedNodeReady();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        HashMap<String, C79714VQg> hashMap;
        int length;
        super.onAttach();
        VQZ vqz = this.mKeyframeManager;
        if (vqz == null || (hashMap = vqz.LIZJ) == null) {
            return;
        }
        for (C79714VQg c79714VQg : hashMap.values()) {
            ObjectAnimator[] objectAnimatorArr = c79714VQg.LJI;
            if (objectAnimatorArr != null && (length = objectAnimatorArr.length) > 0) {
                objectAnimatorArr[length - 1].addListener(new C79709VQb(c79714VQg));
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        HashMap<String, C79714VQg> hashMap;
        super.onDetach();
        VQZ vqz = this.mKeyframeManager;
        if (vqz != null && (hashMap = vqz.LIZJ) != null) {
            Iterator<C79714VQg> it = hashMap.values().iterator();
            while (it.hasNext()) {
                ObjectAnimator[] objectAnimatorArr = it.next().LJI;
                if (objectAnimatorArr != null) {
                    for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                        C16880lQ.LJLJJLL(objectAnimator);
                    }
                }
            }
        }
        C79669VOn c79669VOn = this.mLayoutAnimator;
        if (c79669VOn != null) {
            c79669VOn.LIZIZ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        if (getBound() == null || (getBound().width() > 0 && getBound().height() > 0)) {
            if (this.mSetVisibleByCSS) {
                this.mView.setVisibility(0);
                return;
            }
            return;
        }
        this.mView.setVisibility(8);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public VQZ getKeyframeManager() {
        return this.mKeyframeManager;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public C79669VOn getLayoutAnimator() {
        return this.mLayoutAnimator;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public C79708VQa getTransitionAnimator() {
        return this.mTransitionAnimator;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean getVisibility() {
        return this.mSetVisibleByCSS;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getZIndex() {
        return this.mZIndex;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        handleLayout();
    }

    public LynxUI(Context context) {
        this((VNU) context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execEnterAnim(X.OCW r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxUI.execEnterAnim(X.OCW):void");
    }

    public void execExitAnim(InterfaceC60501Non interfaceC60501Non) {
        C79713VQf c79713VQf;
        C79720VQm c79720VQm = this.mHeroAnimOwner;
        c79720VQm.getClass();
        if (!C60502Noo.LIZ.LJI || c79720VQm.LIZ() || (c79713VQf = c79720VQm.LJFF) == null) {
            return;
        }
        c79720VQm.LJIIJJI.put(c79713VQf.LJLIL, new C79733VQz(c79720VQm, interfaceC60501Non));
        if (c79720VQm.LJIIIIZZ != null) {
            c79720VQm.LJIIJ = true;
            ViewGroup viewGroup = (ViewGroup) c79720VQm.LIZ.mContext.LJLJLLL.LJLIL.getRootView();
            T t = c79720VQm.LIZ.mView;
            t.getLocationInWindow(new int[2]);
            ViewParent parent = t.getParent();
            if (parent != null) {
                C16880lQ.LJLLL(t, (ViewGroup) parent);
            }
            viewGroup.addView(t);
            c79720VQm.LIZ.setAnimation(c79720VQm.LJFF);
            if (c79720VQm.LIZ.getKeyframeManager() == null) {
                return;
            }
            c79720VQm.LIZ.getKeyframeManager().LIZ();
            return;
        }
        c79720VQm.LIZ.setAnimation(c79720VQm.LJFF);
        if (c79720VQm.LIZ.getKeyframeManager() == null) {
            return;
        }
        c79720VQm.LIZ.getKeyframeManager().LIZ();
    }

    public ReadableMap getKeyframes(String str) {
        JavaOnlyMap javaOnlyMap;
        VNU vnu = this.mContext;
        if (vnu == null || (javaOnlyMap = vnu.LJLJI) == null || !javaOnlyMap.hasKey(str)) {
            return null;
        }
        return vnu.LJLJI.getMap(str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void initTransitionAnimator(ReadableMap readableMap) {
        if (this.mTransitionAnimator == null) {
            this.mTransitionAnimator = new C79708VQa(getTransitionUI());
        }
        C79708VQa c79708VQa = this.mTransitionAnimator;
        c79708VQa.getClass();
        if (readableMap != null) {
            ReadableArray array = readableMap.getArray("transition");
            if (array == null) {
                c79708VQa.LJ();
            } else {
                SparseArray<C79713VQf> sparseArray = c79708VQa.LJIIIZ;
                c79708VQa.LJIIIZ = new SparseArray<>();
                int i = 0;
                while (true) {
                    if (i >= array.size()) {
                        break;
                    }
                    ReadableArray array2 = array.getArray(i);
                    int i2 = array2.getInt(0);
                    C79713VQf c79713VQf = new C79713VQf();
                    c79713VQf.LJLJJI = i2;
                    c79713VQf.LJLILLLLZI = (long) array2.getDouble(1);
                    c79713VQf.LJLJI = (long) array2.getDouble(c79713VQf.LIZJ(2, array2));
                    c79713VQf.LJLLLLLL = i;
                    int i3 = c79713VQf.LJLJJI;
                    if (i3 == 16369) {
                        c79708VQa.LJIIIZ.clear();
                        int[] iArr = C65304Pk4.LJLILLLLZI;
                        int i4 = 0;
                        int i5 = 0;
                        do {
                            int i6 = iArr[i4];
                            C79713VQf c79713VQf2 = new C79713VQf(c79713VQf);
                            c79713VQf2.LJLLLLLL = i5;
                            c79713VQf2.LJLJJI = i6;
                            c79708VQa.LJIIIZ.put(i6, c79713VQf2);
                            i4++;
                            i5++;
                        } while (i4 < 10);
                    } else {
                        c79708VQa.LJIIIZ.put(i3, c79713VQf);
                        i++;
                    }
                }
                C79713VQf.LIZIZ(c79708VQa.LJIIIZ, 256, 1024);
                C79713VQf.LIZIZ(c79708VQa.LJIIIZ, 512, 2048);
                if (sparseArray != null) {
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        int keyAt = sparseArray.keyAt(i7);
                        if (c79708VQa.LJIIIZ.indexOfKey(keyAt) < 0) {
                            c79708VQa.LJFF(Integer.valueOf(keyAt));
                        }
                    }
                }
                if (c79708VQa.LJIIIZ.size() != 0) {
                    return;
                }
            }
        }
        this.mTransitionAnimator = null;
    }

    public void onAnimationEnd(String str) {
        C79720VQm c79720VQm = this.mHeroAnimOwner;
        VRC vrc = c79720VQm.LJIIJJI.get(str);
        if (vrc != null) {
            vrc.LIZ(str);
            c79720VQm.LJIIJJI.remove(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @VPD(name = "accessibility-label")
    public void setAccessibilityLabel(F5B f5b) {
        super.setAccessibilityLabel(f5b);
        T t = this.mView;
        if (t != null) {
            t.setFocusable(true);
            this.mView.setContentDescription(getAccessibilityLabel());
        }
    }

    @VPD(defaultFloat = 1.0f, name = "opacity")
    public void setAlpha(float f) {
        if (getKeyframeManager() != null) {
            getKeyframeManager().LIZIZ(Float.valueOf(f), "Alpha");
        }
        C79708VQa c79708VQa = this.mTransitionAnimator;
        if (c79708VQa != null && c79708VQa.LIZIZ(1)) {
            this.mTransitionAnimator.LIZ(this, 1, Float.valueOf(f));
            return;
        }
        if (f != this.mView.getAlpha()) {
            this.mView.setAlpha(f);
        }
        C79669VOn c79669VOn = this.mLayoutAnimator;
        if (c79669VOn != null) {
            c79669VOn.LJJ = f;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setAnimation(ReadableArray readableArray) {
        prepareKeyframeManager();
        if (readableArray == null) {
            VQZ vqz = this.mKeyframeManager;
            HashMap<String, C79714VQg> hashMap = vqz.LIZJ;
            if (hashMap == null) {
                return;
            }
            Iterator<C79714VQg> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().LJ();
            }
            vqz.LIZJ = null;
            vqz.LIZIZ = null;
            return;
        }
        int size = readableArray.size();
        C79713VQf[] c79713VQfArr = new C79713VQf[size];
        for (int i = 0; i < size; i++) {
            c79713VQfArr[i] = C79713VQf.LIZLLL(readableArray.getArray(i));
        }
        this.mKeyframeManager.LIZIZ = c79713VQfArr;
    }

    @VPD(name = "clip-path")
    public void setClipPath(ReadableArray readableArray) {
        C79710VQc c79710VQc;
        int i;
        EnumC79545VJt enumC79545VJt;
        EnumC79545VJt enumC79545VJt2;
        float f = this.mContext.LJLZ.scaledDensity;
        if (readableArray != null && readableArray.size() > 1) {
            int size = readableArray.size();
            int i2 = 0;
            int i3 = readableArray.getInt(0);
            if (i3 == 3) {
                if (size == 2) {
                    c79710VQc = new C79710VQc(readableArray.getString(1), f);
                }
            } else if (i3 == 4) {
                if (size == 11) {
                    c79710VQc = new C79710VQc(4);
                    VR9[] vr9Arr = new VR9[4];
                    c79710VQc.LJ = vr9Arr;
                    vr9Arr[0] = new VR9(readableArray.getDouble(1), readableArray.getInt(2));
                    c79710VQc.LJ[1] = new VR9(readableArray.getDouble(3), readableArray.getInt(4));
                    c79710VQc.LJ[2] = new VR9(readableArray.getDouble(7), readableArray.getInt(8));
                    c79710VQc.LJ[3] = new VR9(readableArray.getDouble(9), readableArray.getInt(10));
                    c79710VQc.LJFF = r4;
                    double[] dArr = {readableArray.getDouble(5)};
                    c79710VQc.LJFF[1] = readableArray.getDouble(6);
                }
            } else if (i3 == 1) {
                if (size == 7) {
                    c79710VQc = new C79710VQc(1);
                    VR9[] vr9Arr2 = new VR9[3];
                    c79710VQc.LJ = vr9Arr2;
                    vr9Arr2[0] = new VR9(readableArray.getDouble(1), readableArray.getInt(2));
                    c79710VQc.LJ[1] = new VR9(readableArray.getDouble(3), readableArray.getInt(4));
                    c79710VQc.LJ[2] = new VR9(readableArray.getDouble(5), readableArray.getInt(6));
                }
            } else if (i3 == 2) {
                if (size == 9) {
                    c79710VQc = new C79710VQc(2);
                    VR9[] vr9Arr3 = new VR9[4];
                    c79710VQc.LJ = vr9Arr3;
                    vr9Arr3[0] = new VR9(readableArray.getDouble(1), readableArray.getInt(2));
                    c79710VQc.LJ[1] = new VR9(readableArray.getDouble(3), readableArray.getInt(4));
                    c79710VQc.LJ[2] = new VR9(readableArray.getDouble(5), readableArray.getInt(6));
                    c79710VQc.LJ[3] = new VR9(readableArray.getDouble(7), readableArray.getInt(8));
                }
            } else if (i3 == 5) {
                c79710VQc = new C79710VQc(5);
                c79710VQc.LJ = new VR9[4];
                if (readableArray.size() == 9) {
                    c79710VQc.LJII = 1;
                } else if (readableArray.size() == 25) {
                    c79710VQc.LJII = 2;
                } else if (readableArray.size() == 27) {
                    c79710VQc.LJII = 3;
                }
                int i4 = 0;
                do {
                    int i5 = i4 * 2;
                    c79710VQc.LJ[i4] = new VR9(readableArray.getDouble(i5 + 1), readableArray.getInt(i5 + 2));
                    i4++;
                } while (i4 < 4);
                int i6 = c79710VQc.LJII;
                if (i6 != 2) {
                    if (i6 == 3) {
                        c79710VQc.LJFF = r5;
                        double[] dArr2 = {readableArray.getDouble(9)};
                        c79710VQc.LJFF[1] = readableArray.getDouble(10);
                        i = 11;
                    }
                } else {
                    i = 9;
                }
                c79710VQc.LJI = new VQQ();
                do {
                    C79699VPr c79699VPr = new C79699VPr();
                    int i7 = (i2 * 4) + i;
                    c79699VPr.LIZ = (float) readableArray.getDouble(i7);
                    if (readableArray.getInt(i7 + 1) == 1) {
                        enumC79545VJt = EnumC79545VJt.PERCENTAGE;
                    } else {
                        enumC79545VJt = EnumC79545VJt.NUMBER;
                    }
                    c79699VPr.LIZJ = enumC79545VJt;
                    EnumC79545VJt enumC79545VJt3 = EnumC79545VJt.PERCENTAGE;
                    if (enumC79545VJt == enumC79545VJt3) {
                        c79699VPr.LIZ *= 100.0f;
                    }
                    c79699VPr.LIZIZ = (float) readableArray.getDouble(i7 + 2);
                    if (readableArray.getInt(i7 + 3) == 1) {
                        enumC79545VJt2 = enumC79545VJt3;
                    } else {
                        enumC79545VJt2 = EnumC79545VJt.NUMBER;
                    }
                    c79699VPr.LIZLLL = enumC79545VJt2;
                    if (enumC79545VJt2 == enumC79545VJt3) {
                        c79699VPr.LIZIZ *= 100.0f;
                    }
                    c79710VQc.LJI.LIZLLL(i2, c79699VPr);
                    i2++;
                } while (i2 < 4);
            }
            this.mClipPath = c79710VQc;
        }
        c79710VQc = null;
        this.mClipPath = c79710VQc;
    }

    public void setEnterAnim(C79713VQf c79713VQf) {
        this.mHeroAnimOwner.LJ = c79713VQf;
    }

    @VPD(name = "enter-transition-name")
    public void setEnterTransitionName(ReadableArray readableArray) {
        C79713VQf LIZLLL = C79713VQf.LIZLLL(readableArray);
        if (LIZLLL != null) {
            OCV ocv = C60502Noo.LIZ;
            synchronized (ocv) {
                ocv.LIZJ.put(this, LIZLLL);
                setEnterAnim(LIZLLL);
            }
        }
    }

    public void setExitAnim(C79713VQf c79713VQf) {
        this.mHeroAnimOwner.LJFF = c79713VQf;
    }

    @VPD(name = "exit-transition-name")
    public void setExitTransitionName(ReadableArray readableArray) {
        C79713VQf LIZLLL = C79713VQf.LIZLLL(readableArray);
        if (LIZLLL != null) {
            OCV ocv = C60502Noo.LIZ;
            synchronized (ocv) {
                ocv.LIZIZ.put(this, LIZLLL);
                setExitAnim(LIZLLL);
            }
        }
    }

    @VPD(name = "filter")
    public void setFilter(ReadableArray readableArray) {
        if (this.mView == null) {
            return;
        }
        if (readableArray != null && readableArray.size() == 3) {
            int i = readableArray.getInt(0);
            double d = readableArray.getDouble(1);
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    T t = this.mView;
                    if (!(t instanceof VRK)) {
                        return;
                    }
                    ((VRK) t).setBlur((float) d);
                    return;
                }
                Double valueOf = Double.valueOf(1.0d - d);
                Double valueOf2 = Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                Double valueOf3 = Double.valueOf(1.0d);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                } else if (valueOf.compareTo(valueOf3) > 0) {
                    valueOf = valueOf3;
                }
                double doubleValue = valueOf.doubleValue();
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation((float) doubleValue);
                Paint paint = new Paint(1);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                this.mView.setLayerType(2, paint);
                return;
            }
        }
        this.mView.setLayerType(0, null);
        T t2 = this.mView;
        if (!(t2 instanceof VRK)) {
            return;
        }
        ((VRK) t2).removeBlur();
    }

    @VPD(name = "layout-animation-create-delay")
    public void setLayoutAnimationCreateDelay(double d) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.LIZLLL().LIZ.LJLJI = (long) d;
    }

    @VPD(name = "layout-animation-create-duration")
    public void setLayoutAnimationCreateDuration(double d) {
        prepareLayoutAnimator();
        C79669VOn c79669VOn = this.mLayoutAnimator;
        c79669VOn.LIZLLL().LIZ.LJLILLLLZI = (long) d;
        if (!c79669VOn.LIZLLL().LIZJ()) {
            c79669VOn.LIZJ("layout-animation-create");
        }
    }

    @VPD(name = "layout-animation-create-property")
    public void setLayoutAnimationCreateProperty(int i) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.LIZLLL().LIZ.LJLJJI = i;
    }

    @VPD(name = "layout-animation-create-timing-function")
    public void setLayoutAnimationCreateTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.LIZLLL().LIZ.LIZJ(0, readableArray);
    }

    @VPD(name = "layout-animation-delete-delay")
    public void setLayoutAnimationDeleteDelay(double d) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.LJ().LIZ.LJLJI = (long) d;
    }

    @VPD(name = "layout-animation-delete-duration")
    public void setLayoutAnimationDeleteDuration(double d) {
        prepareLayoutAnimator();
        C79669VOn c79669VOn = this.mLayoutAnimator;
        c79669VOn.LJ().LIZ.LJLILLLLZI = (long) d;
        if (!c79669VOn.LJ().LIZJ()) {
            c79669VOn.LIZJ("layout-animation-delete");
        }
    }

    @VPD(name = "layout-animation-delete-property")
    public void setLayoutAnimationDeleteProperty(int i) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.LJ().LIZ.LJLJJI = i;
    }

    @VPD(name = "layout-animation-delete-timing-function")
    public void setLayoutAnimationDeleteTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.LJ().LIZ.LIZJ(0, readableArray);
    }

    @VPD(name = "layout-animation-update-delay")
    public void setLayoutAnimationUpdateDelay(double d) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.LJFF().LIZ.LJLJI = (long) d;
    }

    @VPD(name = "layout-animation-update-duration")
    public void setLayoutAnimationUpdateDuration(double d) {
        prepareLayoutAnimator();
        C79669VOn c79669VOn = this.mLayoutAnimator;
        c79669VOn.LJFF().LIZ.LJLILLLLZI = (long) d;
        if (!c79669VOn.LJFF().LIZJ()) {
            c79669VOn.LIZJ("layout-animation-update");
        }
    }

    @VPD(name = "layout-animation-update-property")
    public void setLayoutAnimationUpdateProperty(int i) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.LJFF().LIZ.LJLJJI = i;
    }

    @VPD(name = "layout-animation-update-timing-function")
    public void setLayoutAnimationUpdateTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.LJFF().LIZ.LIZJ(0, readableArray);
    }

    @VPD(name = "overlap")
    public void setOverlap(F5B f5b) {
        if (f5b == null) {
            this.mOverlappingRendering = true;
            return;
        }
        ReadableType type = f5b.getType();
        if (type == ReadableType.Boolean) {
            this.mOverlappingRendering = f5b.asBoolean();
        } else {
            if (type != ReadableType.String) {
                return;
            }
            this.mOverlappingRendering = f5b.asString().equalsIgnoreCase("true");
        }
    }

    public void setPauseAnim(C79713VQf c79713VQf) {
        this.mHeroAnimOwner.LJI = c79713VQf;
    }

    @VPD(name = "pause-transition-name")
    public void setPauseTransitionName(ReadableArray readableArray) {
        C79713VQf LIZLLL = C79713VQf.LIZLLL(readableArray);
        if (LIZLLL != null) {
            OCV ocv = C60502Noo.LIZ;
            synchronized (ocv) {
                ocv.LJ.put(this, LIZLLL);
                setPauseAnim(LIZLLL);
            }
        }
    }

    @VPD(name = "hardware-layer")
    public void setRenderToHardwareTexture(boolean z) {
        int i;
        T t = this.mView;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        t.setLayerType(i, null);
    }

    public void setResumeAnim(C79713VQf c79713VQf) {
        this.mHeroAnimOwner.LJII = c79713VQf;
    }

    @VPD(name = "resume-transition-name")
    public void setResumeTransitionName(ReadableArray readableArray) {
        C79713VQf LIZLLL = C79713VQf.LIZLLL(readableArray);
        if (LIZLLL != null) {
            OCV ocv = C60502Noo.LIZ;
            synchronized (ocv) {
                ocv.LIZLLL.put(this, LIZLLL);
                setResumeAnim(LIZLLL);
            }
        }
    }

    @VPD(name = "shared-element")
    public void setShareElement(String str) {
        C79720VQm c79720VQm = this.mHeroAnimOwner;
        c79720VQm.LJIIIIZZ = str;
        OCV ocv = C60502Noo.LIZ;
        LynxUI lynxUI = c79720VQm.LIZ;
        synchronized (ocv) {
            ocv.LJFF.put(lynxUI, str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @VPD(name = "lynx-test-tag")
    public void setTestID(String str) {
        this.mView.setTag(str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @VPD(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        super.setTransform(readableArray);
        if (getKeyframeManager() != null) {
            getKeyframeManager().LIZIZ(this.mTransformRaw, "Transform");
        }
    }

    @VPD(name = "transform-order")
    public void setTransformOrder(F5B f5b) {
        if (f5b == null) {
            this.mBackgroundManager.LJIIIIZZ = true;
            return;
        }
        ReadableType type = f5b.getType();
        if (type == ReadableType.Boolean) {
            this.mBackgroundManager.LJIIIIZZ = f5b.asBoolean();
        } else {
            if (type != ReadableType.String) {
                return;
            }
            String asString = f5b.asString();
            this.mBackgroundManager.LJIIIIZZ = asString.equalsIgnoreCase("true");
        }
    }

    @VPD(defaultInt = 1, name = "visibility")
    public void setVisibility(int i) {
        C79708VQa c79708VQa = this.mTransitionAnimator;
        if (c79708VQa != null && c79708VQa.LIZIZ(128)) {
            this.mTransitionAnimator.LIZ(this, 128, Integer.valueOf(i));
            return;
        }
        int visibility = this.mView.getVisibility();
        if (i == 1) {
            this.mSetVisibleByCSS = true;
            this.mView.setVisibility(0);
            visibility = 0;
        } else if (i == 0) {
            this.mSetVisibleByCSS = false;
            visibility = 4;
            this.mView.setVisibility(4);
        }
        VPH vph = this.mParent;
        if (vph instanceof UIShadowProxy) {
            ((LynxUI) vph).setVisibilityForView(visibility);
        }
    }

    public void setVisibilityForView(int i) {
        if (i == 0) {
            this.mSetVisibleByCSS = true;
            this.mView.setVisibility(0);
        } else {
            if (i != 4) {
                return;
            }
            this.mSetVisibleByCSS = false;
            this.mView.setVisibility(4);
        }
    }

    public void updateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.width = getWidth();
            layoutParams.height = getHeight();
            if (layoutParams != this.mView.getLayoutParams()) {
                this.mView.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        throw new RuntimeException("LayoutPrams should not be null");
    }

    public LynxUI(VNU vnu) {
        this(vnu, null);
    }

    public void setAnimation(C79713VQf c79713VQf) {
        prepareKeyframeManager();
        VQZ vqz = this.mKeyframeManager;
        vqz.getClass();
        vqz.LIZIZ = new C79713VQf[]{c79713VQf};
    }

    public LynxUI(VNU vnu, Object obj) {
        super(vnu, obj);
        this.mSetVisibleByCSS = true;
        this.mOverlappingRendering = true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean checkStickyOnParentScroll(int i, int i2) {
        PointF pointF;
        boolean checkStickyOnParentScroll = super.checkStickyOnParentScroll(i, i2);
        if (this.mSticky != null) {
            LynxBaseUI.Sticky sticky = this.mSticky;
            pointF = new PointF(sticky.LJLIL, sticky.LJLILLLLZI);
        } else {
            pointF = null;
        }
        C79715VQh c79715VQh = this.mBackgroundManager;
        c79715VQh.LJII = pointF;
        c79715VQh.LJIIL();
        return checkStickyOnParentScroll;
    }

    public void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        lynxBaseUI2.mDrawParent = this;
        if (lynxBaseUI == null) {
            LynxBaseUI lynxBaseUI3 = this.mDrawHead;
            if (lynxBaseUI3 != null) {
                lynxBaseUI3.mPreviousDrawUI = lynxBaseUI2;
                lynxBaseUI2.mNextDrawUI = lynxBaseUI3;
            }
            this.mDrawHead = lynxBaseUI2;
            return;
        }
        LynxBaseUI lynxBaseUI4 = lynxBaseUI.mNextDrawUI;
        if (lynxBaseUI4 != null) {
            lynxBaseUI4.mPreviousDrawUI = lynxBaseUI2;
            lynxBaseUI2.mNextDrawUI = lynxBaseUI4;
        }
        lynxBaseUI2.mPreviousDrawUI = lynxBaseUI;
        lynxBaseUI.mNextDrawUI = lynxBaseUI2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPY
    public void onFocusChanged(boolean z, boolean z2) {
        if (!z2) {
            LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
            if (LJIIIZ.LJIJI == null) {
                LJIIIZ.LJIJI = (InputMethodManager) C16880lQ.LLIZ("input_method", LJIIIZ.LIZ);
            }
            InputMethodManager inputMethodManager = LJIIIZ.LJIJI;
            if (inputMethodManager == null) {
                LLog.LIZLLL(3, "LynxUI", "Failed to get InputMethodManager");
            } else if (z) {
                inputMethodManager.showSoftInput(this.mView, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setSign(int i, String str) {
        super.setSign(i, str);
    }

    @EWS
    public void takeScreenshot(ReadableMap readableMap, Callback callback) {
        Bitmap.Config config;
        Bitmap.CompressFormat compressFormat;
        String str;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (this.mView == null) {
            callback.invoke(6, javaOnlyMap);
            return;
        }
        if (readableMap.getString("format", "jpeg").equals("png")) {
            config = Bitmap.Config.ARGB_8888;
            compressFormat = Bitmap.CompressFormat.PNG;
            str = "data:image/png;base64,";
        } else {
            config = Bitmap.Config.RGB_565;
            compressFormat = Bitmap.CompressFormat.JPEG;
            str = "data:image/jpeg;base64,";
        }
        float f = (float) readableMap.getDouble("scale", 1.0d);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.mView.getWidth(), this.mView.getHeight(), config);
            Canvas canvas = new Canvas(createBitmap);
            boolean isDirty = this.mView.isDirty();
            this.mView.draw(canvas);
            if (isDirty) {
                this.mView.postInvalidate();
            }
            if (f != 1.0f) {
                Matrix matrix = new Matrix();
                matrix.setScale(f, f);
                createBitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
            }
            String LIZ = C32035Chj.LIZ(createBitmap, compressFormat);
            javaOnlyMap.putInt("width", createBitmap.getWidth());
            javaOnlyMap.putInt("height", createBitmap.getHeight());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(LIZ);
            javaOnlyMap.putString("data", X1D.LIZIZ(LIZ2));
            callback.invoke(0, javaOnlyMap);
        } catch (Throwable unused) {
            callback.invoke(1, javaOnlyMap);
        }
    }
}
