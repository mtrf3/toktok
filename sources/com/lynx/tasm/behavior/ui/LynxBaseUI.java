package com.lynx.tasm.behavior.ui;

import X.C40154FpO;
import X.C46534IOc;
import X.C79285V9t;
import X.C79411VEp;
import X.C79646VNq;
import X.C79669VOn;
import X.C79699VPr;
import X.C79708VQa;
import X.C79727VQt;
import X.C80036Vb6;
import X.EWS;
import X.EnumC79545VJt;
import X.EnumC79647VNr;
import X.EnumC79725VQr;
import X.F5B;
import X.InterfaceC79641VNl;
import X.PPO;
import X.U26;
import X.UPJ;
import X.V9H;
import X.V9X;
import X.V9Y;
import X.VNA;
import X.VNN;
import X.VNU;
import X.VOC;
import X.VOE;
import X.VOG;
import X.VOJ;
import X.VOR;
import X.VOT;
import X.VPA;
import X.VPD;
import X.VPE;
import X.VPH;
import X.VPJ;
import X.VPR;
import X.VPV;
import X.VPY;
import X.VQ3;
import X.VQ4;
import X.VQ5;
import X.VQ6;
import X.VQ7;
import X.VQ8;
import X.VQA;
import X.VQB;
import X.VQC;
import X.VQD;
import X.VQE;
import X.VQF;
import X.VQG;
import X.VQH;
import X.VQI;
import X.VQZ;
import X.VR1;
import X.VRO;
import X.VRQ;
import X.X1D;
import Y.ARunnableS33S0200000_14;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class LynxBaseUI implements VPH, VPY {
    public boolean hasTransformChanged;
    public int mAccessibilityElementStatus;
    public ArrayList<String> mAccessibilityElements;
    public ArrayList<String> mAccessibilityElementsA11y;
    public boolean mAccessibilityEnableTap;
    public String mAccessibilityId;
    public boolean mAccessibilityKeepFocused;
    public String mAccessibilityLabel;
    public int mBackgroundColor;
    public Bitmap.Config mBitmapConfig;
    public boolean mBlockListEvent;
    public boolean mBlockNativeEvent;
    public ArrayList<ArrayList<C46534IOc>> mBlockNativeEventAreas;
    public int mBorderBottomWidth;
    public int mBorderLeftWidth;
    public int mBorderRightWidth;
    public int mBorderTopWidth;
    public Rect mBound;
    public ArrayList<Callback> mBoundingClientRectCallbacks;
    public int mCSSPosition;
    public final List<LynxBaseUI> mChildren;
    public boolean mClipToRadius;
    public ArrayList<ArrayList<Float>> mConsumeSlideEventAngles;
    public VNU mContext;
    public ReadableMap mDataset;
    public VPH mDrawParent;
    public VQA mDrawableCallback;
    public Boolean mEnableExposureUIMargin;
    public boolean mEnableScrollMonitor;
    public boolean mEnableTouchPseudoPropagation;
    public EnumC79647VNr mEventThrough;
    public Map<String, VNA> mEvents;
    public String mExposureArea;
    public String mExposureID;
    public String mExposureScene;
    public float mExposureScreenMarginBottom;
    public float mExposureScreenMarginLeft;
    public float mExposureScreenMarginRight;
    public float mExposureScreenMarginTop;
    public String mExposureUIMarginBottom;
    public String mExposureUIMarginLeft;
    public String mExposureUIMarginRight;
    public String mExposureUIMarginTop;
    public float mExtraOffsetX;
    public float mExtraOffsetY;
    public int mFlattenChildrenCount;
    public boolean mFocusable;
    public float mFontSize;
    public boolean mHasRadius;
    public int mHeight;
    public Matrix mHitTestMatrix;
    public String mIdSelector;
    public boolean mIgnoreFocus;
    public boolean mIsFirstAnimatedReady;
    public boolean mIsTransformNode;
    public final Point mLastSize;
    public float mLastTranslateZ;
    public final Point mLatestSize;
    public int mLeft;
    public VQ3 mLynxBackground;
    public int mLynxDirection;
    public int mMarginBottom;
    public int mMarginLeft;
    public int mMarginRight;
    public int mMarginTop;
    public float mMaxHeight;
    public String mName;
    public boolean mNeedSortChildren;
    public LynxBaseUI mNextDrawUI;
    public WeakReference<int[]> mOffsetDescendantRectToLynxView;
    public boolean mOnResponseChain;
    public int mOriginLeft;
    public int mOriginTop;
    public int mOverflow;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public Object mParam;
    public VPH mParent;
    public ReadableArray mPerspective;
    public LynxBaseUI mPreviousDrawUI;
    public final JavaOnlyMap mProps;
    public int mPseudoStatus;
    public String mRefId;
    public String mScrollMonitorTag;
    public volatile VQG mScrollStateChangeListener;
    public boolean mShouldAttachChildrenView;
    public int mSign;
    public float mSkewX;
    public float mSkewY;
    public volatile Set<VQG> mStateChangeListeners;
    public Sticky mSticky;
    public String mTagName;
    public String mTestTagName;
    public int mTop;
    public float mTouchSlop;
    public Matrix mTransformMatrix;
    public VQ7 mTransformOrigin;
    public List<VQ4> mTransformRaw;
    public float mTranslationZ;
    public F5B mUseLocalCache;
    public int mWidth;
    public boolean nativeInteractionEnabled;
    public boolean userInteractionEnabled;
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    public static final int[] sDefaultOffsetToLynxView = {LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT};
    public static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);

    /* loaded from: classes15.dex */
    public class Sticky extends RectF {
        public float LJLIL;
        public float LJLILLLLZI;
    }

    private synchronized void initScrollStateChangeListener() {
        if (this.mScrollStateChangeListener != null) {
            return;
        }
        this.mScrollStateChangeListener = new VQ8(this);
    }

    public boolean canHaveFlattenChild() {
        return true;
    }

    public boolean dispatchEvent(C40154FpO c40154FpO) {
        return false;
    }

    public void dispatchProperties(VPA vpa) {
    }

    public boolean dispatchTouch(MotionEvent motionEvent) {
        return false;
    }

    public boolean enableLayoutAnimation() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    public int getInitialOverflowType() {
        return 1;
    }

    public VQZ getKeyframeManager() {
        return null;
    }

    public C79669VOn getLayoutAnimator() {
        return null;
    }

    public float getScaleX() {
        return 1.0f;
    }

    public float getScaleY() {
        return 1.0f;
    }

    public int getScrollX() {
        return 0;
    }

    public int getScrollY() {
        return 0;
    }

    public C79708VQa getTransitionAnimator() {
        return null;
    }

    public float getTranslationX() {
        return 0.0f;
    }

    public float getTranslationY() {
        return 0.0f;
    }

    public boolean getVisibility() {
        return true;
    }

    public int getZIndex() {
        return 0;
    }

    public void initTransitionAnimator(ReadableMap readableMap) {
    }

    public void initialize() {
    }

    @Override // X.VPH
    public void invalidate() {
    }

    public boolean isAccessibilityDirectionVertical() {
        return true;
    }

    public boolean isAccessibilityHostUI() {
        return false;
    }

    public boolean isCustomHittest() {
        return false;
    }

    public boolean isFlatten() {
        return false;
    }

    public boolean isScrollContainer() {
        return false;
    }

    public boolean isScrollable() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public boolean needCustomLayout() {
        return false;
    }

    @Override // X.VPY
    public void offResponseChain() {
        this.mOnResponseChain = false;
    }

    public void onAnimationUpdated() {
    }

    public void onBeforeAnimation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public void onBorderRadiusUpdated(int i) {
    }

    public void onDrawingPositionChanged() {
    }

    public void onFocusChanged(boolean z, boolean z2) {
    }

    public void onLayoutFinish(long j) {
    }

    public void onLayoutFinish(long j, LynxBaseUI lynxBaseUI) {
    }

    @Override // X.VPY
    public void onResponseChain() {
        this.mOnResponseChain = true;
    }

    public void renderIfNeeded() {
    }

    public boolean requestChildUIRectangleOnScreen(LynxBaseUI lynxBaseUI, Rect rect, boolean z) {
        return false;
    }

    @Override // X.VPH
    public void requestLayout() {
    }

    public float[] scrollBy(float f, float f2) {
        return new float[]{0.0f, 0.0f, f, f2};
    }

    public void setAnimation(ReadableArray readableArray) {
    }

    @VPD(name = "caret-color")
    public void setCaretColor(String str) {
    }

    public void updateExtraData(Object obj) {
    }

    private float getTouchSlop() {
        if (this.mOnResponseChain) {
            return this.mTouchSlop * this.mContext.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    private boolean isImageConfigBadCase() {
        if (Build.VERSION.SDK_INT == 25 && isMeizu15()) {
            return true;
        }
        return false;
    }

    public static boolean isMeizu() {
        String str = Build.BRAND;
        if (str == null || str.toLowerCase(Locale.ENGLISH).indexOf("meizu") <= -1) {
            return false;
        }
        return true;
    }

    private void sendLayoutChangeEvent() {
        Map<String, VNA> map = this.mEvents;
        if (map != null && map.containsKey("layoutchange")) {
            this.mContext.LJLJJL.LIZIZ(new VNN(getSign(), "layoutchange", getPositionInfo()));
        }
    }

    private boolean shouldHandleA11yMutation() {
        VOR LJFF = this.mContext.LJFF();
        if (LJFF != null) {
            return LJFF.LJIJI(this.mContext.LJLJLLL.LJLJJI);
        }
        return false;
    }

    public void destroy() {
        VOR LJFF;
        List<InterfaceC79641VNl> list;
        List<VOJ> list2;
        if ((this instanceof VOJ) && (list2 = this.mContext.LLD) != null) {
            ((ArrayList) list2).remove(this);
        }
        if ((this instanceof InterfaceC79641VNl) && (LJFF = this.mContext.LJFF()) != null && (list = LJFF.LJFF) != null) {
            ((ArrayList) list).remove(this);
        }
        C79646VNq LIZJ = this.mContext.LIZJ();
        LIZJ.getClass();
        C79411VEp.LJ(new ARunnableS33S0200000_14(LIZJ, this, 76));
        this.mLynxBackground.LIZLLL();
    }

    public boolean eventThrough() {
        EnumC79647VNr enumC79647VNr = this.mEventThrough;
        if (enumC79647VNr == EnumC79647VNr.Enable) {
            return true;
        }
        if (enumC79647VNr == EnumC79647VNr.Disable || parent() == null) {
            return false;
        }
        VPY parent = parent();
        if (parent instanceof UIBody) {
            return false;
        }
        return parent.eventThrough();
    }

    public void flattenChildrenCountDecrement() {
        this.mFlattenChildrenCount--;
    }

    public void flattenChildrenCountIncrement() {
        this.mFlattenChildrenCount++;
    }

    public Rect getBoundingClientRect() {
        int i;
        UIBody uIBody = this.mContext.LJLJLLL;
        ViewGroup viewGroup = uIBody.LJLIL;
        int i2 = 0;
        if (viewGroup == null) {
            return new Rect(0, 0, getWidth(), getHeight());
        }
        if (this instanceof LynxUI) {
            View view = ((LynxUI) this).mView;
            if (view instanceof C79727VQt) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (viewGroup2.getChildCount() > 0) {
                    view = viewGroup2.getChildAt(0);
                }
            }
            Rect rect = new Rect();
            View rootView = view.getRootView();
            if (viewGroup.getRootView() != rootView && (rootView instanceof ViewGroup)) {
                viewGroup = (ViewGroup) rootView;
            }
            try {
                viewGroup.offsetDescendantRectToMyCoords(view, rect);
                rect.offset(view.getScrollX(), view.getScrollY());
            } catch (IllegalArgumentException unused) {
            }
            int[] offsetDescendantRectToLynxView = getOffsetDescendantRectToLynxView();
            int i3 = offsetDescendantRectToLynxView[0];
            if (i3 != Integer.MIN_VALUE) {
                rect.offset(i3, offsetDescendantRectToLynxView[1]);
            }
            i = rect.top;
            i2 = rect.left;
        } else if (this instanceof LynxFlattenUI) {
            VPH vph = this.mParent;
            if (vph != null && vph != uIBody) {
                i = 0;
                LynxBaseUI lynxBaseUI = this;
                while ((lynxBaseUI instanceof LynxFlattenUI) && lynxBaseUI != this.mContext.LJLJLLL) {
                    i2 += lynxBaseUI.getOriginLeft();
                    i += lynxBaseUI.getOriginTop();
                    lynxBaseUI = lynxBaseUI.getParentBaseUI();
                }
                if (lynxBaseUI != null) {
                    Rect boundingClientRect = lynxBaseUI.getBoundingClientRect();
                    int scrollX = (boundingClientRect.left - lynxBaseUI.getScrollX()) + i2;
                    i = (boundingClientRect.top - lynxBaseUI.getScrollY()) + i;
                    i2 = scrollX;
                }
            } else {
                i2 = this.mLeft;
                i = this.mTop;
            }
        } else {
            i = 0;
        }
        return new Rect(i2, i, getWidth() + i2, getHeight() + i);
    }

    public LynxBaseUI getDrawParent() {
        return (LynxBaseUI) this.mDrawParent;
    }

    public boolean getEnableExposureUIMargin() {
        Boolean bool = this.mEnableExposureUIMargin;
        if (bool != null) {
            return bool.booleanValue();
        }
        return this.mContext.LLIIL;
    }

    public Matrix getHitTestMatrix() {
        this.mHitTestMatrix.reset();
        return this.mHitTestMatrix;
    }

    public final int getLatestHeight() {
        return this.mLatestSize.y;
    }

    public final int getLatestWidth() {
        return this.mLatestSize.x;
    }

    public int[] getOffsetDescendantRectToLynxView() {
        int[] iArr = this.mOffsetDescendantRectToLynxView.get();
        if (iArr != null) {
            return iArr;
        }
        return sDefaultOffsetToLynxView;
    }

    public LynxBaseUI getParentBaseUI() {
        VPH vph = this.mParent;
        if (vph instanceof UIShadowProxy) {
            return (LynxBaseUI) ((LynxBaseUI) vph).mParent;
        }
        return (LynxBaseUI) vph;
    }

    public JSONObject getPlatformCustomInfo() {
        return new JSONObject();
    }

    public Rect getRectToWindow() {
        VOT vot = this.mContext.LJLJLLL.LJLIL;
        if (vot == null) {
            return new Rect();
        }
        int[] iArr = new int[2];
        vot.getLocationOnScreen(iArr);
        Rect boundingClientRect = getBoundingClientRect();
        boundingClientRect.offset(iArr[0], iArr[1]);
        return boundingClientRect;
    }

    public String getTestID() {
        String str = this.mTestTagName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public Matrix getTransformMatrix() {
        this.mTransformMatrix.reset();
        return this.mTransformMatrix;
    }

    public final boolean hasSizeChanged() {
        return !this.mLastSize.equals(this.mLatestSize);
    }

    public boolean isClickable() {
        Map<String, VNA> map = this.mEvents;
        if (map != null && map.containsKey("tap")) {
            return true;
        }
        return false;
    }

    public boolean isLongClickable() {
        Map<String, VNA> map = this.mEvents;
        if (map != null && map.containsKey("longpress")) {
            return true;
        }
        return false;
    }

    public void layout() {
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().layout();
        }
    }

    public void measure() {
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().measure();
        }
    }

    public void onAnimatedNodeReady() {
        if (this.mIsFirstAnimatedReady) {
            this.mIsFirstAnimatedReady = false;
        }
        Point point = this.mLastSize;
        Point point2 = this.mLatestSize;
        point.x = point2.x;
        point.y = point2.y;
        this.hasTransformChanged = false;
    }

    public void onAttach() {
        BackgroundDrawable backgroundDrawable = this.mLynxBackground.LIZIZ;
        if (backgroundDrawable == null) {
            return;
        }
        Iterator it = ((ArrayList) backgroundDrawable.LJIJJLI.LJLIL).iterator();
        while (it.hasNext()) {
            ((VR1) it.next()).LIZLLL();
        }
    }

    public void onDetach() {
        this.mLynxBackground.LIZLLL();
    }

    public void onLayoutUpdated() {
        VQ3 vq3 = this.mLynxBackground;
        float f = this.mPaddingTop;
        float f2 = this.mPaddingRight;
        float f3 = this.mPaddingBottom;
        float f4 = this.mPaddingLeft;
        BackgroundDrawable backgroundDrawable = vq3.LIZIZ;
        if (backgroundDrawable != null) {
            backgroundDrawable.LJIIJ(f, 1);
            backgroundDrawable.LJIIJ(f2, 2);
            backgroundDrawable.LJIIJ(f3, 3);
            backgroundDrawable.LJIIJ(f4, 0);
        }
        invalidate();
        requestLayout();
    }

    public void onNodeReady() {
        if (this.mContext.LLILII) {
            onAnimatedNodeReady();
        }
    }

    public void onPropsUpdated() {
        VNU vnu = this.mContext;
        if (vnu != null) {
            VOE voe = vnu.LLFZ;
            if (voe == null) {
                LLog.LIZLLL(4, "LynxContext", "addUIToExposuredMap failed, since mExposure is null");
            } else if (this.mExposureID != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.mExposureScene);
                LIZ.append("_");
                LIZ.append(this.mExposureID);
                LIZ.append("_");
                LIZ.append(getSign());
                voe.LJIILL.put(X1D.LIZIZ(LIZ), new WeakReference<>(this));
                if (voe.LJIILL.size() == 1) {
                    voe.LIZIZ();
                }
            }
        }
        invalidate();
    }

    @Override // X.VPY
    public VPY parent() {
        VPH vph = this.mParent;
        if (vph instanceof VPY) {
            return (VPY) vph;
        }
        return null;
    }

    public void recognizeGesturere() {
        VPV vpv;
        HashSet<Integer> hashSet;
        VNU vnu = this.mContext;
        if (vnu != null && (vpv = vnu.LJLJJLL) != null && (hashSet = vpv.LJIILJJIL) != null) {
            hashSet.add(Integer.valueOf(getSign()));
        }
    }

    public final boolean shouldDoTransform() {
        VQ7 vq7;
        if (this.hasTransformChanged) {
            return true;
        }
        if ((VQ4.LIZ(this.mTransformRaw) || ((vq7 = this.mTransformOrigin) != null && ((vq7.LIZ != 0.5f || vq7.LIZIZ != 1 || vq7.LIZJ != 0.5f || vq7.LIZLLL != 1) && (vq7.LIZIZ == 1 || vq7.LIZLLL == 1)))) && hasSizeChanged()) {
            return true;
        }
        return false;
    }

    public void uiOwnerDidPerformLayout() {
        if (this.mBoundingClientRectCallbacks.isEmpty()) {
            return;
        }
        JavaOnlyMap positionInfo = getPositionInfo();
        Iterator<Callback> it = this.mBoundingClientRectCallbacks.iterator();
        while (it.hasNext()) {
            it.next().invoke(0, positionInfo);
        }
        this.mBoundingClientRectCallbacks.clear();
    }

    private JavaOnlyMap getPositionInfo() {
        Rect boundingClientRect = getBoundingClientRect();
        float f = this.mContext.LJLZ.density;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("id", getIdSelector());
        javaOnlyMap.putMap("dataset", (WritableMap) this.mDataset);
        javaOnlyMap.putDouble("left", boundingClientRect.left / f);
        javaOnlyMap.putDouble("top", boundingClientRect.top / f);
        javaOnlyMap.putDouble("right", boundingClientRect.right / f);
        javaOnlyMap.putDouble("bottom", boundingClientRect.bottom / f);
        javaOnlyMap.putDouble("width", boundingClientRect.width() / f);
        javaOnlyMap.putDouble("height", boundingClientRect.height() / f);
        return javaOnlyMap;
    }

    public static boolean isMeizu15() {
        if (isMeizu()) {
            String str = Build.DEVICE;
            if (!TextUtils.isEmpty(str)) {
                return str.contains("15");
            }
            return false;
        }
        return false;
    }

    public Rect getBoundRectForOverflow() {
        if (getOverflow() == 3) {
            return null;
        }
        return getClipBounds();
    }

    public Rect getClipBounds() {
        int i;
        int width = getWidth();
        int height = getHeight();
        DisplayMetrics displayMetrics = this.mContext.LJLZ;
        int i2 = 0;
        if ((getOverflow() & 1) != 0) {
            int i3 = displayMetrics.widthPixels;
            i = -i3;
            width += i3 * 2;
        } else {
            i = 0;
        }
        if ((getOverflow() & 2) != 0) {
            int i4 = displayMetrics.heightPixels;
            i2 = -i4;
            height += i4 * 2;
        }
        return new Rect(i, i2, width + i, height + i2);
    }

    public Rect getRect() {
        float scaleX = getScaleX() * getWidth();
        float scaleY = getScaleY() * getHeight();
        float translationX = getTranslationX() + (((getWidth() / 2.0f) + getOriginLeft()) - (scaleX / 2.0f));
        float translationY = getTranslationY() + (((getHeight() / 2.0f) + getOriginTop()) - (scaleY / 2.0f));
        return new Rect((int) translationX, (int) translationY, (int) (translationX + scaleX), (int) (translationY + scaleY));
    }

    public Rect getRectWithoutTransform() {
        float originLeft = getOriginLeft();
        float originTop = getOriginTop();
        return new Rect((int) originLeft, (int) originTop, (int) (originLeft + getWidth()), (int) (originTop + getHeight()));
    }

    @Override // X.VPY
    public boolean enableTouchPseudoPropagation() {
        return this.mEnableTouchPseudoPropagation;
    }

    public CharSequence getAccessibilityLabel() {
        return this.mAccessibilityLabel;
    }

    public Rect getBound() {
        return this.mBound;
    }

    public List<LynxBaseUI> getChildren() {
        return this.mChildren;
    }

    @Override // X.VPY
    public Map<String, VNA> getEvents() {
        return this.mEvents;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public String getIdSelector() {
        return this.mIdSelector;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getOriginLeft() {
        return this.mOriginLeft;
    }

    public int getOriginTop() {
        return this.mOriginTop;
    }

    public int getOverflow() {
        return this.mOverflow;
    }

    public JavaOnlyMap getProps() {
        return this.mProps;
    }

    @Override // X.VPY
    public int getPseudoStatus() {
        return this.mPseudoStatus;
    }

    public String getRefIdSelector() {
        return this.mRefId;
    }

    @Override // X.VPY
    public int getSign() {
        return this.mSign;
    }

    public String getTagName() {
        return this.mTagName;
    }

    public int getTop() {
        return this.mTop;
    }

    public float getTranslationZ() {
        return this.mTranslationZ;
    }

    public int getWidth() {
        return this.mWidth;
    }

    @Override // X.VPY
    public boolean ignoreFocus() {
        return this.mIgnoreFocus;
    }

    public boolean isFirstAnimatedReady() {
        return this.mIsFirstAnimatedReady;
    }

    public boolean isFocusable() {
        return this.mFocusable;
    }

    public boolean isOnResponseChain() {
        return this.mOnResponseChain;
    }

    public boolean isUserInteractionEnabled() {
        return this.userInteractionEnabled;
    }

    public LynxBaseUI(Context context) {
        this((VNU) context);
    }

    private void setBorderColorForAllSpacingIndex(Integer num) {
        float intValue;
        float f = 1.0E21f;
        if (num == null) {
            intValue = 1.0E21f;
        } else {
            intValue = num.intValue() & 16777215;
            f = num.intValue() >>> 24;
        }
        int i = 1;
        do {
            this.mLynxBackground.LJFF(intValue, f, SPACING_TYPES[i]);
            i++;
        } while (i <= 4);
    }

    private float toPix(String str) {
        return VPR.LIZLLL(str, this.mContext.LJLJLLL.mFontSize, this.mFontSize, r1.getWidth(), r1.getHeight(), 1.0E21f, this.mContext.LJLZ);
    }

    public void afterPropsUpdated(VPA vpa) {
        ReadableMap readableMap;
        onPropsUpdated();
        onAnimationUpdated();
        if (shouldHandleA11yMutation() && (readableMap = vpa.LIZ) != null) {
            VPJ vpj = this.mContext.LJLJLLL.LJLJJI;
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                vpj.LIZJ(4, this, keySetIterator.nextKey());
            }
        }
    }

    @Override // X.VPY
    public boolean blockNativeEvent(MotionEvent motionEvent) {
        if (this.mBlockNativeEvent) {
            return true;
        }
        if (this.mBlockNativeEventAreas == null) {
            return false;
        }
        PPO LIZ = new PPO(motionEvent.getX(), motionEvent.getY()).LIZ(this.mContext.LJLJLLL.getBoundingClientRect(), getBoundingClientRect());
        boolean z = false;
        for (int i = 0; i < this.mBlockNativeEventAreas.size(); i++) {
            ArrayList arrayList = (ArrayList) ListProtector.get(this.mBlockNativeEventAreas, i);
            if (arrayList != null && arrayList.size() == 4) {
                float LIZ2 = ((C46534IOc) ListProtector.get(arrayList, 0)).LIZ(r6.right - r6.left);
                float LIZ3 = ((C46534IOc) ListProtector.get(arrayList, 1)).LIZ(r6.bottom - r6.top);
                float LIZ4 = ((C46534IOc) ListProtector.get(arrayList, 2)).LIZ(r6.right - r6.left) + LIZ2;
                float LIZ5 = ((C46534IOc) ListProtector.get(arrayList, 3)).LIZ(r6.bottom - r6.top) + LIZ3;
                float f = LIZ.LIZ;
                if (f >= LIZ2 && f < LIZ4) {
                    float f2 = LIZ.LIZIZ;
                    if (f2 >= LIZ3 && f2 < LIZ5) {
                        LLog.LIZLLL(2, "LynxBaseUI", "blocked this point!");
                        return true;
                    }
                }
                z = false;
            }
        }
        return z;
    }

    @Override // X.VPY
    public boolean consumeSlideEvent(float f) {
        ArrayList<ArrayList<Float>> arrayList = this.mConsumeSlideEventAngles;
        if (arrayList == null) {
            return false;
        }
        Iterator<ArrayList<Float>> it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList<Float> next = it.next();
            if (f >= ((Float) ListProtector.get(next, 0)).floatValue() && f <= ((Float) ListProtector.get(next, 1)).floatValue()) {
                return true;
            }
        }
        return false;
    }

    public void copyPropFromOldUiInUpdateFlatten(LynxBaseUI lynxBaseUI) {
        this.mIsFirstAnimatedReady = lynxBaseUI.mIsFirstAnimatedReady;
        Point point = this.mLastSize;
        Point point2 = lynxBaseUI.mLastSize;
        point.set(point2.x, point2.y);
        Point point3 = this.mLatestSize;
        Point point4 = lynxBaseUI.mLatestSize;
        point3.set(point4.x, point4.y);
        this.mFlattenChildrenCount = lynxBaseUI.mFlattenChildrenCount;
        setEvents(lynxBaseUI.getEvents());
    }

    public LynxBaseUI getChildAt(int i) {
        return (LynxBaseUI) ListProtector.get(this.mChildren, i);
    }

    public int getIndex(LynxBaseUI lynxBaseUI) {
        return this.mChildren.indexOf(lynxBaseUI);
    }

    public float[] getLocationOnScreen(float[] fArr) {
        View view;
        int[] iArr = new int[2];
        if (isFlatten()) {
            fArr[0] = fArr[0] + getLeft();
            fArr[1] = fArr[1] + getTop();
        }
        if (isFlatten()) {
            VPH vph = this.mDrawParent;
            if (vph == null) {
                LLog.LIZLLL(4, "LynxBaseUI", "mDrawParent of flattenUI is null, which causes the value getLocationOnScreen returns is not the correct coordinates relative to the screen!");
                return fArr;
            }
            view = ((LynxUI) vph).mView;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
        } else {
            view = ((LynxUI) this).mView;
        }
        view.getRootView().getLocationOnScreen(iArr);
        transformFromViewToRootView(view, fArr);
        fArr[0] = fArr[0] + iArr[0];
        fArr[1] = fArr[1] + iArr[1];
        return fArr;
    }

    public void notifyScrollStateChanged(int i) {
        VQG[] vqgArr;
        if (this.mStateChangeListeners == null) {
            return;
        }
        synchronized (this) {
            vqgArr = (VQG[]) this.mStateChangeListeners.toArray(new VQG[this.mStateChangeListeners.size()]);
        }
        for (VQG vqg : vqgArr) {
            vqg.LIZ(i);
        }
    }

    public void registerScrollStateListener(VQG vqg) {
        if (vqg == null) {
            return;
        }
        synchronized (this) {
            if (this.mStateChangeListeners == null) {
                this.mStateChangeListeners = new HashSet();
            }
            this.mStateChangeListeners.add(vqg);
            if (this.mStateChangeListeners.size() != 1) {
                return;
            }
            initScrollStateChangeListener();
            VPH vph = this.mParent;
            if (vph instanceof LynxBaseUI) {
                ((LynxBaseUI) vph).registerScrollStateListener(this.mScrollStateChangeListener);
            }
        }
    }

    public void removeChild(LynxBaseUI lynxBaseUI) {
        this.mChildren.remove(lynxBaseUI);
        lynxBaseUI.setParent(null);
    }

    @EWS
    public void scrollIntoView(ReadableMap readableMap) {
        HashMap hashMap;
        String str;
        String str2;
        String str3;
        if (readableMap == null || (hashMap = (HashMap) readableMap.asHashMap().get("scrollIntoViewOptions")) == null) {
            return;
        }
        if (hashMap.containsKey("behavior")) {
            str = (String) hashMap.get("behavior");
        } else {
            str = "auto";
        }
        if (hashMap.containsKey("block")) {
            str2 = (String) hashMap.get("block");
        } else {
            str2 = "start";
        }
        if (hashMap.containsKey("inline")) {
            str3 = (String) hashMap.get("inline");
        } else {
            str3 = "nearest";
        }
        scrollIntoView(str.equals("smooth"), str2, str3);
    }

    @VPD(name = "a11y-id")
    public void setA11yId(F5B f5b) {
        String str;
        if (f5b != null && ReadableType.String == f5b.getType()) {
            str = f5b.asString();
        } else {
            str = "";
        }
        this.mAccessibilityId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @VPD(name = "accessibility-element")
    public void setAccessibilityElement(F5B f5b) {
        ?? r2 = 1;
        r2 = 1;
        r2 = 1;
        if (f5b != null) {
            ReadableType type = f5b.getType();
            if (type == ReadableType.String) {
                r2 = Boolean.parseBoolean(f5b.asString());
            } else if (type == ReadableType.Int || type == ReadableType.Number || type == ReadableType.Long) {
                if (f5b.asInt() == 0) {
                    r2 = 0;
                }
            } else if (type == ReadableType.Boolean) {
                r2 = f5b.asBoolean();
            }
        }
        this.mAccessibilityElementStatus = r2;
    }

    @VPD(name = "accessibility-elements")
    public void setAccessibilityElements(F5B f5b) {
        if (f5b != null && f5b.getType() == ReadableType.String) {
            String[] split = f5b.asString().split(",");
            if (split.length > 0) {
                if (this.mAccessibilityElements == null) {
                    this.mAccessibilityElements = new ArrayList<>();
                }
                this.mAccessibilityElements.clear();
                for (String str : split) {
                    this.mAccessibilityElements.add(str);
                }
            }
        }
    }

    @VPD(name = "accessibility-elements-a11y")
    public void setAccessibilityElementsA11y(F5B f5b) {
        if (f5b != null && f5b.getType() == ReadableType.String) {
            String[] split = f5b.asString().split(",");
            if (split.length > 0) {
                if (this.mAccessibilityElementsA11y == null) {
                    this.mAccessibilityElementsA11y = new ArrayList<>();
                }
                this.mAccessibilityElementsA11y.clear();
                for (String str : split) {
                    this.mAccessibilityElementsA11y.add(str);
                }
            }
        }
    }

    @VPD(name = "accessibility-enable-tap")
    public void setAccessibilityEnableTap(F5B f5b) {
        boolean z;
        if (f5b != null) {
            ReadableType type = f5b.getType();
            if (type == ReadableType.String) {
                z = Boolean.parseBoolean(f5b.asString());
            } else if (type == ReadableType.Boolean) {
                z = f5b.asBoolean();
            }
            this.mAccessibilityEnableTap = z;
        }
        z = false;
        this.mAccessibilityEnableTap = z;
    }

    @VPD(name = "android-accessibility-keep-focused")
    public void setAccessibilityKeepFocused(F5B f5b) {
        boolean z;
        if (f5b != null) {
            ReadableType type = f5b.getType();
            if (type == ReadableType.String) {
                z = Boolean.parseBoolean(f5b.asString());
            } else if (type == ReadableType.Boolean) {
                z = f5b.asBoolean();
            }
            this.mAccessibilityKeepFocused = z;
        }
        z = false;
        this.mAccessibilityKeepFocused = z;
    }

    @VPD(name = "accessibility-label")
    public void setAccessibilityLabel(F5B f5b) {
        String str;
        if (f5b != null) {
            ReadableType type = f5b.getType();
            if (type == ReadableType.String) {
                str = f5b.asString();
            } else if (type == ReadableType.Int || type == ReadableType.Number || type == ReadableType.Long) {
                str = String.valueOf(f5b.asInt());
            } else if (type == ReadableType.Boolean) {
                str = String.valueOf(f5b.asBoolean());
            }
            this.mAccessibilityLabel = str;
        }
        str = "";
        this.mAccessibilityLabel = str;
    }

    @VPD(name = "background-clip")
    public void setBackgroundClip(ReadableArray readableArray) {
        BackgroundDrawable LIZJ = this.mLynxBackground.LIZJ();
        VQ5 vq5 = LIZJ.LJIJJLI;
        ((ArrayList) vq5.LJLJJI).clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = readableArray.getInt(i);
                if (i2 < 0 || i2 > 2) {
                    ((ArrayList) vq5.LJLJJI).add(1);
                } else {
                    ((ArrayList) vq5.LJLJJI).add(Integer.valueOf(i2));
                }
            }
        }
        LIZJ.invalidateSelf();
    }

    @VPD(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
        if (getKeyframeManager() != null) {
            getKeyframeManager().LIZIZ(Integer.valueOf(i), "BackgroundColor");
        }
        if (getTransitionAnimator() != null && getTransitionAnimator().LIZIZ(64)) {
            getTransitionAnimator().LIZ(this, 64, Integer.valueOf(i));
        } else {
            this.mLynxBackground.LJ(i);
            invalidate();
        }
    }

    @VPD(name = "background-image")
    public void setBackgroundImage(ReadableArray readableArray) {
        BackgroundDrawable LIZJ = this.mLynxBackground.LIZJ();
        VQ5 vq5 = LIZJ.LJIJJLI;
        Iterator it = ((ArrayList) vq5.LJLIL).iterator();
        while (it.hasNext()) {
            ((VR1) it.next()).LJ();
        }
        ((ArrayList) vq5.LJLIL).clear();
        if (readableArray != null) {
            Rect bounds = vq5.LJLJLJ.getBounds();
            int size = readableArray.size();
            int i = 0;
            while (i < size) {
                int i2 = readableArray.getInt(i);
                if (i2 == 1) {
                    i++;
                    if (LynxEnv.LJIIIZ().LJIJ == null) {
                        i++;
                    } else {
                        C80036Vb6 c80036Vb6 = LynxEnv.LJIIIZ().LJIJ;
                        VNU vnu = vq5.LJLJL;
                        String string = readableArray.getString(i);
                        c80036Vb6.getClass();
                        V9X v9x = new V9X(vnu, string);
                        v9x.LJLJLLL = new WeakReference<>(this);
                        VQB LIZ = VQ6.LIZ(this.mUseLocalCache);
                        V9H v9h = v9x.LJLILLLLZI;
                        boolean z = LIZ.LIZ;
                        C79285V9t c79285V9t = v9h.LJJIIJ;
                        c79285V9t.LJIIL = z;
                        c79285V9t.LJIILIIL = LIZ.LIZIZ;
                        v9x.setCallback(vq5);
                        ((ArrayList) vq5.LJLIL).add(v9x);
                    }
                } else if (i2 == 2) {
                    i++;
                    ((ArrayList) vq5.LJLIL).add(new VRQ(readableArray.getArray(i)));
                } else if (i2 == 3) {
                    i++;
                    ((ArrayList) vq5.LJLIL).add(new VRO(readableArray.getArray(i)));
                } else if (i2 == 0) {
                    i++;
                    ((ArrayList) vq5.LJLIL).add(new VQF());
                }
                if (!bounds.isEmpty()) {
                    List<VR1> list = vq5.LJLIL;
                    ((VR1) U26.LIZIZ((ArrayList) list, 1, list)).LJFF(bounds.width(), bounds.height());
                }
                i++;
            }
        }
        LIZJ.invalidateSelf();
        invalidate();
    }

    @VPD(name = "background-origin")
    public void setBackgroundOrigin(ReadableArray readableArray) {
        BackgroundDrawable LIZJ = this.mLynxBackground.LIZJ();
        VQ5 vq5 = LIZJ.LJIJJLI;
        ((ArrayList) vq5.LJLJI).clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                int i2 = readableArray.getInt(i);
                if (i2 < 0 || i2 > 2) {
                    i2 = 1;
                }
                ((ArrayList) vq5.LJLJI).add(Integer.valueOf(i2));
            }
        }
        LIZJ.invalidateSelf();
        invalidate();
    }

    @VPD(name = "background-position")
    public void setBackgroundPosition(ReadableArray readableArray) {
        BackgroundDrawable LIZJ = this.mLynxBackground.LIZJ();
        VQ5 vq5 = LIZJ.LJIJJLI;
        ((ArrayList) vq5.LJLILLLLZI).clear();
        if (readableArray != null && readableArray.size() % 2 == 0) {
            for (int i = 0; i < readableArray.size(); i += 2) {
                int i2 = readableArray.getInt(i + 1);
                if (i2 == 2) {
                    ReadableArray array = readableArray.getArray(i);
                    double d = array.getDouble(0);
                    double d2 = array.getDouble(1);
                    ((ArrayList) vq5.LJLILLLLZI).add(new VQD(d, d2, i2));
                } else {
                    ((ArrayList) vq5.LJLILLLLZI).add(new VQD(readableArray.getDouble(i), i2));
                }
            }
        }
        LIZJ.invalidateSelf();
        invalidate();
    }

    @VPD(name = "background-repeat")
    public void setBackgroundRepeat(ReadableArray readableArray) {
        BackgroundDrawable LIZJ = this.mLynxBackground.LIZJ();
        VQ5 vq5 = LIZJ.LJIJJLI;
        ((ArrayList) vq5.LJLJJL).clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                ((ArrayList) vq5.LJLJJL).add(VQI.valueOf(readableArray.getInt(i)));
            }
        }
        LIZJ.invalidateSelf();
        invalidate();
    }

    @VPD(name = "background-size")
    public void setBackgroundSize(ReadableArray readableArray) {
        BackgroundDrawable LIZJ = this.mLynxBackground.LIZJ();
        VQ5 vq5 = LIZJ.LJIJJLI;
        ((ArrayList) vq5.LJLJJLL).clear();
        if (readableArray != null && readableArray.size() % 2 == 0) {
            int size = readableArray.size();
            for (int i = 0; i < size; i += 2) {
                ((ArrayList) vq5.LJLJJLL).add(new VQE(readableArray.getDouble(i), readableArray.getInt(i + 1)));
            }
        }
        LIZJ.invalidateSelf();
        invalidate();
    }

    @VPD(defaultBoolean = false, name = "block-list-event")
    public void setBlockListEvent(boolean z) {
        this.mBlockListEvent = z;
    }

    @VPD(defaultBoolean = false, name = "block-native-event")
    public void setBlockNativeEvent(boolean z) {
        this.mBlockNativeEvent = z;
    }

    @VPD(name = "block-native-event-areas")
    public void setBlockNativeEventAreas(F5B f5b) {
        this.mBlockNativeEventAreas = null;
        if (f5b == null || f5b.getType() != ReadableType.Array || f5b.asArray() == null) {
            LLog.LIZLLL(3, "LynxBaseUI", "setBlockNativeEventAreas input type error");
            return;
        }
        ReadableArray asArray = f5b.asArray();
        ArrayList<ArrayList<C46534IOc>> arrayList = new ArrayList<>();
        for (int i = 0; i < asArray.size(); i++) {
            ReadableArray array = asArray.getArray(i);
            if (array == null || array.size() != 4) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setBlockNativeEventAreas ");
                LIZ.append(i);
                LIZ.append("th type error, size != 4");
                LLog.LIZLLL(3, "LynxBaseUI", X1D.LIZIZ(LIZ));
            } else {
                C46534IOc LIZIZ = C46534IOc.LIZIZ(array.getString(0));
                C46534IOc LIZIZ2 = C46534IOc.LIZIZ(array.getString(1));
                C46534IOc LIZIZ3 = C46534IOc.LIZIZ(array.getString(2));
                C46534IOc LIZIZ4 = C46534IOc.LIZIZ(array.getString(3));
                if (LIZIZ != null && LIZIZ2 != null && LIZIZ3 != null && LIZIZ4 != null) {
                    ArrayList<C46534IOc> arrayList2 = new ArrayList<>();
                    arrayList2.add(LIZIZ);
                    arrayList2.add(LIZIZ2);
                    arrayList2.add(LIZIZ3);
                    arrayList2.add(LIZIZ4);
                    arrayList.add(arrayList2);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("setBlockNativeEventAreas ");
                    LIZ2.append(i);
                    LIZ2.append("th type error");
                    LLog.LIZLLL(3, "LynxBaseUI", X1D.LIZIZ(LIZ2));
                }
            }
        }
        if (arrayList.size() > 0) {
            this.mBlockNativeEventAreas = arrayList;
        } else {
            LLog.LIZLLL(3, "LynxBaseUI", "setBlockNativeEventAreas empty areas");
        }
    }

    public void setBorderColor(String str) {
        new RuntimeException("setBorderColor(String) is deprecated.This has no effect.");
    }

    public void setBound(Rect rect) {
        this.mBound = rect;
    }

    @VPD(name = "box-shadow")
    public void setBoxShadow(ReadableArray readableArray) {
        VPH vph = this.mParent;
        if (vph instanceof UIShadowProxy) {
            ((LynxBaseUI) vph).setBoxShadow(readableArray);
        }
    }

    @VPD(defaultFloat = 1.0f, name = "position")
    public final void setCSSPosition(int i) {
        this.mCSSPosition = i;
    }

    @VPD(name = "clip-radius")
    public void setClipToRadius(F5B f5b) {
        boolean z;
        if (f5b == null) {
            return;
        }
        ReadableType type = f5b.getType();
        if (type == ReadableType.Boolean) {
            this.mClipToRadius = f5b.asBoolean();
            return;
        }
        if (type != ReadableType.String) {
            return;
        }
        String asString = f5b.asString();
        if (asString.equalsIgnoreCase("true") || asString.equalsIgnoreCase("yes")) {
            z = true;
        } else {
            z = false;
        }
        this.mClipToRadius = z;
    }

    @VPD(name = "consume-slide-event")
    public void setConsumeSlideEvent(ReadableArray readableArray) {
        VNU vnu;
        VPV vpv;
        if (readableArray == null) {
            this.mConsumeSlideEventAngles = null;
            return;
        }
        try {
            ArrayList<Object> arrayList = readableArray.toArrayList();
            this.mConsumeSlideEventAngles = new ArrayList<>();
            Iterator<Object> it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof ArrayList) && ((ArrayList) next).size() == 2 && (ListProtector.get((ArrayList) next, 0) instanceof Number) && (ListProtector.get((ArrayList) next, 1) instanceof Number)) {
                    ArrayList<Float> arrayList2 = new ArrayList<>();
                    arrayList2.add(Float.valueOf(((Number) ListProtector.get((ArrayList) next, 0)).floatValue()));
                    arrayList2.add(Float.valueOf(((Number) ListProtector.get((ArrayList) next, 1)).floatValue()));
                    this.mConsumeSlideEventAngles.add(arrayList2);
                }
            }
            ArrayList<ArrayList<Float>> arrayList3 = this.mConsumeSlideEventAngles;
            if (arrayList3 != null && !arrayList3.isEmpty() && (vnu = this.mContext) != null && (vpv = vnu.LJLJJLL) != null) {
                vpv.LJI = true;
            }
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setConsumeSlideEvent failed since ");
            LIZ.append(th.getMessage());
            LLog.LIZLLL(4, "LynxBaseUI", X1D.LIZIZ(LIZ));
        }
    }

    @VPD(name = "dataset")
    public void setDataset(ReadableMap readableMap) {
        this.mDataset = readableMap;
    }

    @VPD(name = "bitmap-gradient")
    public void setEnableBitmapGradient(boolean z) {
        BackgroundDrawable LIZJ = this.mLynxBackground.LIZJ();
        LIZJ.LJIJJLI.LJLL = z;
        LIZJ.invalidateSelf();
        invalidate();
    }

    @VPD(name = "enable-exposure-ui-margin")
    public void setEnableExposureUIMargin(boolean z) {
        this.mEnableExposureUIMargin = Boolean.valueOf(z);
    }

    @VPD(name = "enable-scroll-monitor")
    public void setEnableScrollMonitor(boolean z) {
        this.mEnableScrollMonitor = z;
    }

    @VPD(name = "enable-touch-pseudo-propagation")
    public void setEnableTouchPseudoPropagation(F5B f5b) {
        if (f5b == null) {
            this.mEnableTouchPseudoPropagation = true;
            return;
        }
        try {
            this.mEnableTouchPseudoPropagation = f5b.asBoolean();
        } catch (Throwable th) {
            LLog.LIZLLL(2, "LynxBaseUI", th.toString());
            this.mEnableTouchPseudoPropagation = true;
        }
    }

    @VPD(name = "event-through")
    public void setEventThrough(F5B f5b) {
        EnumC79647VNr enumC79647VNr;
        if (f5b == null) {
            this.mEventThrough = EnumC79647VNr.Undefined;
        }
        try {
            if (f5b.asBoolean()) {
                enumC79647VNr = EnumC79647VNr.Enable;
            } else {
                enumC79647VNr = EnumC79647VNr.Disable;
            }
            this.mEventThrough = enumC79647VNr;
        } catch (Throwable th) {
            LLog.LIZLLL(2, "LynxBaseUI", th.toString());
            this.mEventThrough = EnumC79647VNr.Undefined;
        }
    }

    public void setEvents(Map<String, VNA> map) {
        this.mEvents = map;
    }

    @VPD(name = "exposure-area")
    public void setExposureArea(String str) {
        this.mExposureArea = str;
    }

    @VPD(name = "exposure-id")
    public void setExposureID(F5B f5b) {
        this.mContext.LJIIIZ(this);
        String str = "";
        if (f5b != null) {
            ReadableType type = f5b.getType();
            if (type == ReadableType.String) {
                str = f5b.asString();
            } else if (type == ReadableType.Int || type == ReadableType.Number || type == ReadableType.Long) {
                str = String.valueOf(f5b.asInt());
            }
        }
        if (str.isEmpty()) {
            this.mExposureID = null;
            LLog.LIZLLL(4, "LynxBaseUI", "setExposureID(Dynamic exposureID) failed, since it is not number/string, or it is empty string");
            new RuntimeException("setExposureID(Dynamic exposureID) failed, since it is not number/string, or it is empty string");
            return;
        }
        this.mExposureID = str;
    }

    @VPD(name = "exposure-scene")
    public void setExposureScene(String str) {
        this.mContext.LJIIIZ(this);
        this.mExposureScene = str;
    }

    @VPD(name = "exposure-screen-margin-bottom")
    public void setExposureScreenMarginBottom(String str) {
        this.mExposureScreenMarginBottom = VPR.LIZIZ(str, 0.0f);
    }

    @VPD(name = "exposure-screen-margin-left")
    public void setExposureScreenMarginLeft(String str) {
        this.mExposureScreenMarginLeft = VPR.LIZIZ(str, 0.0f);
    }

    @VPD(name = "exposure-screen-margin-right")
    public void setExposureScreenMarginRight(String str) {
        this.mExposureScreenMarginRight = VPR.LIZIZ(str, 0.0f);
    }

    @VPD(name = "exposure-screen-margin-top")
    public void setExposureScreenMarginTop(String str) {
        this.mExposureScreenMarginTop = VPR.LIZIZ(str, 0.0f);
    }

    @VPD(name = "exposure-ui-margin-bottom")
    public void setExposureUIMarginBottom(String str) {
        this.mExposureUIMarginBottom = str;
    }

    @VPD(name = "exposure-ui-margin-left")
    public void setExposureUIMarginLeft(String str) {
        this.mExposureUIMarginLeft = str;
    }

    @VPD(name = "exposure-ui-margin-right")
    public void setExposureUIMarginRight(String str) {
        this.mExposureUIMarginRight = str;
    }

    @VPD(name = "exposure-ui-margin-top")
    public void setExposureUIMarginTop(String str) {
        this.mExposureUIMarginTop = str;
    }

    @VPD(name = "focusable")
    public void setFocusable(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.mFocusable = z;
    }

    @VPD(defaultFloat = 1.0E21f, name = "font-size")
    public void setFontSize(float f) {
        if (f != 1.0E21f) {
            this.mFontSize = f;
            this.mLynxBackground.LIZLLL = f;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        onLayoutUpdated();
    }

    @VPD(name = "idSelector")
    public void setIdSelector(String str) {
        this.mIdSelector = str;
    }

    @VPD(name = "ignore-focus")
    public void setIgnoreFocus(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.mIgnoreFocus = z;
    }

    @VPD(name = "image-config")
    public void setImageConfig(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.mBitmapConfig = null;
            return;
        }
        if (str.equalsIgnoreCase("ALPHA_8")) {
            this.mBitmapConfig = Bitmap.Config.ALPHA_8;
        } else if (str.equalsIgnoreCase("RGB_565")) {
            if (!isImageConfigBadCase()) {
                this.mBitmapConfig = Bitmap.Config.RGB_565;
            } else {
                LLog.LIZLLL(3, "LynxBaseUI setImageConfig warn: ", "RGB_565 can't be set on Meizu15");
                this.mBitmapConfig = null;
            }
        } else if (str.equalsIgnoreCase("ARGB_8888")) {
            this.mBitmapConfig = Bitmap.Config.ARGB_8888;
        } else if (str.equalsIgnoreCase("RGBA_F16")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mBitmapConfig = Bitmap.Config.RGBA_F16;
            } else {
                LLog.LIZLLL(3, "LynxBaseUI setImageConfig warn: ", "RGBA_F16 requires build version >= VERSION_CODES.O");
                this.mBitmapConfig = null;
            }
        } else if (str.equalsIgnoreCase("HARDWARE")) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mBitmapConfig = Bitmap.Config.HARDWARE;
            } else {
                this.mBitmapConfig = null;
                LLog.LIZLLL(3, "LynxBaseUI setImageConfig warn: ", "HARDWARE requires build version >= VERSION_CODES.O");
            }
        } else {
            this.mBitmapConfig = null;
        }
        VQ3 vq3 = this.mLynxBackground;
        if (vq3 != null) {
            Bitmap.Config config = this.mBitmapConfig;
            BackgroundDrawable LIZJ = vq3.LIZJ();
            VQ5 vq5 = LIZJ.LJIJJLI;
            if (vq5 == null) {
                return;
            }
            vq5.LJLJLLL = config;
            List<VR1> list = vq5.LJLIL;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    VR1 vr1 = (VR1) it.next();
                    if (vr1 != null) {
                        vr1.LJI(vq5.LJLJLLL);
                    }
                }
            }
            LIZJ.invalidateSelf();
        }
    }

    @VPD(name = "intersection-observers")
    public void setIntersectionObservers(ReadableArray readableArray) {
        C79646VNq LIZJ = this.mContext.LIZJ();
        LIZJ.getClass();
        C79411VEp.LJ(new ARunnableS33S0200000_14(LIZJ, this, 76));
        if (readableArray == null || !this.mEvents.containsKey("intersection")) {
            return;
        }
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            if (map != null) {
                VOC voc = new VOC(this.mContext.LIZJ(), map, this);
                C79646VNq LIZJ2 = this.mContext.LIZJ();
                LIZJ2.getClass();
                C79411VEp.LJ(new ARunnableS33S0200000_14(LIZJ2, voc, 75));
            }
        }
    }

    public void setLeft(int i) {
        this.mLeft = i;
        this.mOriginLeft = i;
        onLayoutUpdated();
    }

    @VPD(name = "local-cache")
    public void setLocalCache(F5B f5b) {
        this.mUseLocalCache = f5b;
    }

    @VPD(defaultInt = 3, name = "direction")
    public void setLynxDirection(int i) {
        this.mLynxDirection = i;
    }

    @VPD(name = "name")
    public void setName(String str) {
        this.mName = str;
    }

    @VPD(defaultBoolean = false, name = "native-interaction-enabled")
    public void setNativeInteractionEnabled(boolean z) {
        this.nativeInteractionEnabled = z;
    }

    public void setOffsetDescendantRectToLynxView(int[] iArr) {
        this.mOffsetDescendantRectToLynxView = new WeakReference<>(iArr);
    }

    @VPD(defaultInt = -16777216, name = "outline-color")
    public void setOutlineColor(int i) {
        VPH vph = this.mParent;
        if (vph instanceof UIShadowProxy) {
            ((LynxBaseUI) vph).setOutlineColor(i);
        }
    }

    @VPD(defaultInt = -1, name = "outline-style")
    public void setOutlineStyle(int i) {
        VPH vph = this.mParent;
        if (vph instanceof UIShadowProxy) {
            ((UIShadowProxy) vph).LJIJJLI().LIZ = EnumC79725VQr.parse(i);
        }
    }

    @VPD(defaultInt = 0, name = "outline-width")
    public void setOutlineWidth(float f) {
        VPH vph = this.mParent;
        if (vph instanceof UIShadowProxy) {
            ((LynxBaseUI) vph).setOutlineWidth(f);
        }
    }

    @VPD(name = "overflow")
    public void setOverflow(Integer num) {
        int intValue;
        if (num == null) {
            intValue = getInitialOverflowType();
        } else {
            intValue = num.intValue();
        }
        setOverflow(intValue);
    }

    @VPD(name = "overflow-x")
    public void setOverflowX(Integer num) {
        int intValue;
        if (num == null) {
            intValue = getInitialOverflowType();
        } else {
            intValue = num.intValue();
        }
        setOverflowWithMask((short) 1, intValue);
    }

    @VPD(name = "overflow-y")
    public void setOverflowY(Integer num) {
        int intValue;
        if (num == null) {
            intValue = getInitialOverflowType();
        } else {
            intValue = num.intValue();
        }
        setOverflowWithMask((short) 2, intValue);
    }

    public void setParent(VPH vph) {
        VQG[] vqgArr;
        VQG[] vqgArr2;
        if (this.mStateChangeListeners == null) {
            this.mParent = vph;
            return;
        }
        int i = 0;
        if (vph instanceof LynxBaseUI) {
            synchronized (this) {
                vqgArr2 = (VQG[]) this.mStateChangeListeners.toArray(new VQG[this.mStateChangeListeners.size()]);
            }
            int length = vqgArr2.length;
            while (i < length) {
                ((LynxBaseUI) vph).registerScrollStateListener(vqgArr2[i]);
                i++;
            }
        } else if (this.mParent instanceof LynxBaseUI) {
            synchronized (this) {
                vqgArr = (VQG[]) this.mStateChangeListeners.toArray(new VQG[this.mStateChangeListeners.size()]);
            }
            int length2 = vqgArr.length;
            while (i < length2) {
                ((LynxBaseUI) this.mParent).unRegisterScrollStateListener(vqgArr[i]);
                i++;
            }
        }
        this.mParent = vph;
    }

    @VPD(name = "perspective")
    public void setPerspective(ReadableArray readableArray) {
        this.mPerspective = readableArray;
    }

    @VPD(name = "react-ref")
    public void setRefIdSelector(String str) {
        this.mRefId = str;
    }

    @VPD(name = "scroll-monitor-tag")
    public void setScrollMonitorTag(String str) {
        this.mScrollMonitorTag = str;
    }

    @VPD(name = "lynx-test-tag")
    public void setTestID(String str) {
        this.mTestTagName = str;
    }

    public void setTop(int i) {
        this.mTop = i;
        this.mOriginTop = i;
        onLayoutUpdated();
    }

    public void setTransform(ReadableArray readableArray) {
        this.hasTransformChanged = true;
        List<VQ4> LIZJ = VQ4.LIZJ(readableArray);
        this.mTransformRaw = LIZJ;
        float f = 0.0f;
        if (LIZJ != null && !LIZJ.isEmpty()) {
            for (VQ4 vq4 : LIZJ) {
                int i = vq4.LIZ;
                if (i != 8) {
                    if (i == 16) {
                        f = vq4.LJFF;
                    }
                } else {
                    f = vq4.LIZIZ;
                }
            }
        }
        setTranslationZ(f);
        VPH vph = this.mParent;
        if (vph instanceof UIShadowProxy) {
        }
    }

    @VPD(name = "transform-origin")
    public void setTransformOrigin(ReadableArray readableArray) {
        VQ7 vq7;
        this.hasTransformChanged = true;
        VQ7 vq72 = VQ7.LJ;
        this.mTransformOrigin = vq72;
        if (readableArray == null) {
            return;
        }
        if (readableArray.size() < 2) {
            vq7 = null;
        } else {
            vq7 = new VQ7(readableArray);
        }
        this.mTransformOrigin = vq7;
        if (vq7 == null) {
            LLog.LIZLLL(4, "LynxBaseUI", "transform params error.");
            this.mTransformOrigin = vq72;
        }
    }

    public void setTranslationZ(float f) {
        this.mTranslationZ = f;
    }

    @VPD(defaultBoolean = true, name = "user-interaction-enabled")
    public void setUserInteractionEnabled(boolean z) {
        this.userInteractionEnabled = z;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        onLayoutUpdated();
    }

    public void unRegisterScrollStateListener(VQG vqg) {
        boolean isEmpty;
        if (vqg == null || this.mStateChangeListeners == null) {
            return;
        }
        synchronized (this) {
            this.mStateChangeListeners.remove(vqg);
            isEmpty = this.mStateChangeListeners.isEmpty();
        }
        if (isEmpty) {
            VPH vph = this.mParent;
            if (vph instanceof LynxBaseUI) {
                ((LynxBaseUI) vph).unRegisterScrollStateListener(this.mScrollStateChangeListener);
            }
        }
    }

    public void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        updateLayoutInfo(lynxBaseUI.getLeft(), lynxBaseUI.getTop(), lynxBaseUI.getWidth(), lynxBaseUI.getHeight(), lynxBaseUI.mPaddingLeft, lynxBaseUI.mPaddingTop, lynxBaseUI.mPaddingRight, lynxBaseUI.mPaddingBottom, lynxBaseUI.mMarginLeft, lynxBaseUI.mMarginTop, lynxBaseUI.mMarginRight, lynxBaseUI.mMarginBottom, lynxBaseUI.mBorderLeftWidth, lynxBaseUI.mBorderTopWidth, lynxBaseUI.mBorderRightWidth, lynxBaseUI.mBorderBottomWidth, lynxBaseUI.getBound());
        this.mOriginLeft = lynxBaseUI.getOriginLeft();
        this.mOriginTop = lynxBaseUI.getOriginTop();
    }

    public final void updateProperties(VPA vpa) {
        updatePropertiesInterval(vpa);
        afterPropsUpdated(vpa);
    }

    public void updatePropertiesInterval(VPA vpa) {
        this.mProps.merge(vpa.LIZ);
        PropsUpdater.LIZJ(vpa, this);
    }

    public void updateSticky(float[] fArr) {
        if (fArr == null || fArr.length < 4) {
            this.mSticky = null;
            return;
        }
        Sticky sticky = new Sticky();
        this.mSticky = sticky;
        ((RectF) sticky).left = fArr[0];
        ((RectF) sticky).top = fArr[1];
        ((RectF) sticky).right = fArr[2];
        ((RectF) sticky).bottom = fArr[3];
        sticky.LJLILLLLZI = 0.0f;
        sticky.LJLIL = 0.0f;
        VPH parentBaseUI = getParentBaseUI();
        if (parentBaseUI instanceof VQH) {
            ((VQH) parentBaseUI).LJIIJ();
        }
    }

    public LynxBaseUI(VNU vnu) {
        this(vnu, null);
    }

    public void setBorderColor(Integer num) {
        setBorderColorForAllSpacingIndex(num);
    }

    public void setOverflow(int i) {
        setOverflowWithMask((short) 3, i);
    }

    public LynxBaseUI(VNU vnu, Object obj) {
        this.mChildren = new ArrayList();
        this.mProps = new JavaOnlyMap();
        this.mDataset = new JavaOnlyMap();
        this.mHasRadius = false;
        this.mOverflow = 0;
        this.mClipToRadius = false;
        this.mFocusable = false;
        this.mIgnoreFocus = false;
        this.mPerspective = null;
        this.hasTransformChanged = false;
        this.userInteractionEnabled = true;
        this.nativeInteractionEnabled = false;
        this.mSticky = null;
        this.mMaxHeight = -1.0f;
        this.mBackgroundColor = 0;
        this.mEnableExposureUIMargin = null;
        this.mSkewX = 0.0f;
        this.mSkewY = 0.0f;
        this.mShouldAttachChildrenView = false;
        this.mExtraOffsetX = 0.0f;
        this.mExtraOffsetY = 0.0f;
        this.mAccessibilityLabel = "";
        this.mAccessibilityId = "";
        this.mAccessibilityElementStatus = -1;
        this.mAccessibilityEnableTap = false;
        this.mAccessibilityKeepFocused = false;
        this.mDrawableCallback = new VQA(this);
        this.mBitmapConfig = null;
        this.mCSSPosition = 1;
        this.mTouchSlop = 8.0f;
        this.mOnResponseChain = false;
        this.mBlockNativeEvent = false;
        this.mBlockNativeEventAreas = null;
        this.mEventThrough = EnumC79647VNr.Undefined;
        this.mFlattenChildrenCount = 0;
        this.mNeedSortChildren = false;
        this.mLastTranslateZ = 0.0f;
        this.mEnableTouchPseudoPropagation = true;
        this.mTransformMatrix = new Matrix();
        this.mHitTestMatrix = new Matrix();
        this.mConsumeSlideEventAngles = null;
        this.mBlockListEvent = false;
        this.mOffsetDescendantRectToLynxView = new WeakReference<>(null);
        this.mUseLocalCache = null;
        this.mBoundingClientRectCallbacks = new ArrayList<>();
        this.mIsFirstAnimatedReady = true;
        this.mLynxDirection = 3;
        this.mContext = vnu;
        this.mParam = obj;
        VQ3 vq3 = new VQ3(vnu);
        this.mLynxBackground = vq3;
        vq3.LIZJ = this.mDrawableCallback;
        float LIZ = V9Y.LIZ(14.0f);
        this.mFontSize = LIZ;
        this.mLynxBackground.LIZLLL = LIZ;
        this.mLatestSize = new Point();
        this.mLastSize = new Point();
        initialize();
    }

    private void boundingClientRectInner(ReadableMap readableMap, Callback callback) {
        callback.invoke(0, getPositionInfo());
    }

    @EWS
    public void boundingClientRect(ReadableMap readableMap, Callback callback) {
        VOR LJFF = this.mContext.LJFF();
        if (LJFF == null) {
            boundingClientRectInner(readableMap, callback);
            return;
        }
        UIBody uIBody = LJFF.LIZIZ;
        if (uIBody == null) {
            boundingClientRectInner(readableMap, callback);
            return;
        }
        T t = uIBody.mView;
        if (t == 0) {
            boundingClientRectInner(readableMap, callback);
        } else if (!t.isLayoutRequested()) {
            boundingClientRectInner(readableMap, callback);
        } else {
            this.mContext.LJFF().LJII.add(this);
            this.mBoundingClientRectCallbacks.add(callback);
        }
    }

    public boolean checkStickyOnParentScroll(int i, int i2) {
        if (this.mSticky == null) {
            return false;
        }
        float left = getLeft() - i;
        float top = getTop() - i2;
        Sticky sticky = this.mSticky;
        float f = ((RectF) sticky).left;
        if (left < f) {
            sticky.LJLIL = f - left;
        } else {
            if (getParentBaseUI() == null) {
                LLog.LIZLLL(4, "LynxBaseUI", "checkStickyOnParentScroll failed, parent is null.");
                return false;
            }
            int width = getParentBaseUI().getWidth();
            float width2 = getWidth() + left;
            Sticky sticky2 = this.mSticky;
            float f2 = ((RectF) sticky2).right;
            float f3 = width;
            if (width2 + f2 > f3) {
                sticky2.LJLIL = Math.max((f3 - width2) - f2, ((RectF) sticky2).left - left);
            } else {
                sticky2.LJLIL = 0.0f;
            }
        }
        Sticky sticky3 = this.mSticky;
        float f4 = ((RectF) sticky3).top;
        if (top < f4) {
            sticky3.LJLILLLLZI = f4 - top;
            return true;
        }
        if (getParentBaseUI() == null) {
            LLog.LIZLLL(4, "LynxBaseUI", "checkStickyOnParentScroll failed, parent is null.");
            return false;
        }
        int height = getParentBaseUI().getHeight();
        float height2 = getHeight() + top;
        Sticky sticky4 = this.mSticky;
        float f5 = ((RectF) sticky4).bottom;
        float f6 = height;
        if (height2 + f5 > f6) {
            sticky4.LJLILLLLZI = Math.max((f6 - height2) - f5, ((RectF) sticky4).top - top);
            return true;
        }
        sticky4.LJLILLLLZI = 0.0f;
        return true;
    }

    public boolean childrenContainPoint(float f, float f2) {
        if (this.mContext.LLII) {
            for (LynxBaseUI lynxBaseUI : this.mChildren) {
                float[] targetPoint = getTargetPoint(f, f2, getScrollX(), getScrollY(), lynxBaseUI.getRectWithoutTransform(), lynxBaseUI.getTransformMatrix());
                if (lynxBaseUI.isUserInteractionEnabled() && lynxBaseUI.containsPoint(targetPoint[0], targetPoint[1])) {
                    return true;
                }
            }
            return false;
        }
        float scrollX = ((f + getScrollX()) - getOriginLeft()) - getTranslationX();
        float scrollY = ((f2 + getScrollY()) - getOriginTop()) - getTranslationY();
        for (LynxBaseUI lynxBaseUI2 : this.mChildren) {
            if (lynxBaseUI2.isUserInteractionEnabled() && lynxBaseUI2.containsPoint(scrollX, scrollY)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsPoint(float f, float f2) {
        float touchSlop = getTouchSlop();
        if (this.mContext.LLII) {
            Rect rectWithoutTransform = getRectWithoutTransform();
            float f3 = -touchSlop;
            if (f >= f3 && f <= (rectWithoutTransform.right - rectWithoutTransform.left) + touchSlop && f2 >= f3 && f2 <= (rectWithoutTransform.bottom - rectWithoutTransform.top) + touchSlop) {
                return true;
            }
            if (getOverflow() == 0) {
                return false;
            }
            if (getOverflow() == 1) {
                if (f2 < rectWithoutTransform.top || f2 > rectWithoutTransform.bottom) {
                    return false;
                }
            } else if (getOverflow() == 2 && (f < rectWithoutTransform.left || f > rectWithoutTransform.right)) {
                return false;
            }
            return childrenContainPoint(f, f2);
        }
        Rect rect = getRect();
        if (rect.left - touchSlop < f && rect.right + touchSlop > f && rect.top - touchSlop < f2 && rect.bottom + touchSlop > f2) {
            return true;
        }
        if (getOverflow() == 0) {
            return false;
        }
        if (getOverflow() == 1) {
            if (rect.top - touchSlop >= f2 || rect.bottom + touchSlop <= f2) {
                return false;
            }
        } else if (getOverflow() == 2 && (rect.left - touchSlop >= f || rect.right + touchSlop <= f)) {
            return false;
        }
        return childrenContainPoint(f, f2);
    }

    @EWS
    public void fetchAccessibilityTargets(ReadableMap readableMap, Callback callback) {
        UIBody uIBody = this.mContext.LJLJLLL;
        if (uIBody != null) {
            if (uIBody.LJLJJI == null) {
                callback.invoke(1, "Lynx accessibility delegate is null, please use Android new accessibility!");
                return;
            }
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            VPJ.LIZIZ(this, false, javaOnlyArray);
            callback.invoke(0, javaOnlyArray);
        }
    }

    public VPY hitTest(float f, float f2) {
        boolean containsPoint;
        int size = this.mChildren.size() - 1;
        LynxBaseUI lynxBaseUI = null;
        float f3 = f;
        float f4 = f2;
        while (true) {
            if (size >= 0) {
                LynxBaseUI lynxBaseUI2 = (LynxBaseUI) ListProtector.get(this.mChildren, size);
                if (lynxBaseUI2 instanceof UIShadowProxy) {
                    lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI2).LJLIL;
                }
                if (lynxBaseUI2.isUserInteractionEnabled() && lynxBaseUI2.getVisibility()) {
                    float[] fArr = {f, f2};
                    if (this.mContext.LLII) {
                        fArr = getTargetPoint(f, f2, getScrollX(), getScrollY(), lynxBaseUI2.getRectWithoutTransform(), lynxBaseUI2.getTransformMatrix());
                        containsPoint = lynxBaseUI2.containsPoint(fArr[0], fArr[1]);
                    } else {
                        containsPoint = lynxBaseUI2.containsPoint(f, f2);
                    }
                    if (!containsPoint) {
                        continue;
                    } else {
                        if (lynxBaseUI2.isOnResponseChain()) {
                            f3 = fArr[0];
                            f4 = fArr[1];
                            lynxBaseUI = lynxBaseUI2;
                            break;
                        }
                        if (lynxBaseUI == null || lynxBaseUI.getZIndex() < lynxBaseUI2.getZIndex() || (lynxBaseUI.getZIndex() == lynxBaseUI2.getZIndex() && lynxBaseUI.getTranslationZ() < lynxBaseUI2.getTranslationZ())) {
                            f3 = fArr[0];
                            f4 = fArr[1];
                            lynxBaseUI = lynxBaseUI2;
                        }
                    }
                }
                size--;
            } else if (lynxBaseUI == null) {
                return this;
            }
        }
        if (!lynxBaseUI.isCustomHittest() && lynxBaseUI.needCustomLayout() && (lynxBaseUI instanceof UIGroup)) {
            if (this.mContext.LLII) {
                UIGroup uIGroup = (UIGroup) lynxBaseUI;
                return uIGroup.findUIWithCustomLayout(f3, f4, uIGroup);
            }
            UIGroup uIGroup2 = (UIGroup) lynxBaseUI;
            return uIGroup2.findUIWithCustomLayout(f - lynxBaseUI.getOriginLeft(), f2 - lynxBaseUI.getOriginTop(), uIGroup2);
        }
        if (this.mContext.LLII) {
            return lynxBaseUI.hitTest(f3, f4);
        }
        return lynxBaseUI.hitTest(((lynxBaseUI.getScrollX() + f) - lynxBaseUI.getOriginLeft()) - lynxBaseUI.getTranslationX(), ((lynxBaseUI.getScrollY() + f2) - lynxBaseUI.getOriginTop()) - lynxBaseUI.getTranslationY());
    }

    @EWS
    public void innerText(ReadableMap readableMap, Callback callback) {
        UIBody uIBody = this.mContext.LJLJLLL;
        if (uIBody != null) {
            if (uIBody.LJLJJI == null) {
                callback.invoke(1, "Lynx accessibility delegate is null, please use Android new accessibility!");
                return;
            }
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            uIBody.LJLJJI.getClass();
            VPJ.LIZIZ(this, true, javaOnlyArray);
            callback.invoke(0, javaOnlyArray);
        }
    }

    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        ListProtector.add(this.mChildren, i, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    public void onListCellAppear(String str, UIList uIList) {
        if (this.mBlockListEvent) {
            return;
        }
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onListCellAppear(str, uIList);
        }
    }

    public void onListCellPrepareForReuse(String str, UIList uIList) {
        if (this.mBlockListEvent) {
            return;
        }
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onListCellPrepareForReuse(str, uIList);
        }
    }

    @Override // X.VPY
    public void onPseudoStatusChanged(int i, int i2) {
        this.mPseudoStatus = i2;
    }

    @EWS
    public void requestAccessibilityFocus(ReadableMap readableMap, Callback callback) {
        int LJIIIIZZ;
        UIBody uIBody = this.mContext.LJLJLLL;
        if (uIBody != null) {
            VPJ vpj = uIBody.LJLJJI;
            if (vpj == null) {
                callback.invoke(1, "Lynx accessibility delegate is null, please use Android new accessibility!");
                return;
            }
            if (!vpj.LIZLLL()) {
                callback.invoke(1, "System accessibility is disable!");
                return;
            } else if (vpj.LIZLLL() && vpj.LJFF.LJIILJJIL(this) && (LJIIIIZZ = vpj.LJFF.LJIIIIZZ(this)) != -1 && vpj.LJFF(LJIIIIZZ)) {
                callback.invoke(0, "Accessibility element on focused");
                return;
            }
        }
        callback.invoke(1, "No accessibility element found!");
    }

    @EWS
    public void requestUIInfo(ReadableMap readableMap, Callback callback) {
        ArrayList arrayList = new ArrayList();
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (readableMap.getBoolean(nextKey, false)) {
                    arrayList.add(nextKey);
                }
            }
        }
        JavaOnlyMap positionInfo = getPositionInfo();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (arrayList.contains("id")) {
            javaOnlyMap.put("id", getIdSelector());
        }
        if (arrayList.contains("dataset")) {
            javaOnlyMap.put("dataset", this.mDataset);
        }
        if (arrayList.contains("rect")) {
            javaOnlyMap.put("left", positionInfo.get("left"));
            javaOnlyMap.put("top", positionInfo.get("top"));
            javaOnlyMap.put("right", positionInfo.get("right"));
            javaOnlyMap.put("bottom", positionInfo.get("bottom"));
        }
        if (arrayList.contains("size")) {
            javaOnlyMap.put("width", positionInfo.get("width"));
            javaOnlyMap.put("height", positionInfo.get("height"));
        }
        if (arrayList.contains("scrollOffset")) {
            float f = this.mContext.LJLZ.density;
            javaOnlyMap.put("scrollLeft", Float.valueOf(getScrollX() / f));
            javaOnlyMap.put("scrollTop", Float.valueOf(getScrollY() / f));
        }
        if (arrayList.contains("node")) {
            javaOnlyMap.put("node", new JavaOnlyMap());
        }
        callback.invoke(0, javaOnlyMap);
    }

    @VPE(customType = "Color", names = {"border-left-color", "border-right-color", "border-top-color", "border-bottom-color"})
    public void setBorderColor(int i, Integer num) {
        this.mLynxBackground.LJI(SPACING_TYPES[i + 1], num);
    }

    public void setBorderRadius(int i, float f) {
        if (!VQC.LIZ(f) && f < 0.0f) {
            f = 1.0E21f;
        }
        C79699VPr c79699VPr = new C79699VPr();
        c79699VPr.LIZ = f;
        c79699VPr.LIZIZ = f;
        EnumC79545VJt enumC79545VJt = EnumC79545VJt.NUMBER;
        c79699VPr.LIZJ = enumC79545VJt;
        c79699VPr.LIZLLL = enumC79545VJt;
        if (i == 0) {
            int i2 = 1;
            do {
                this.mLynxBackground.LJIIIIZZ(i2, c79699VPr);
                i2++;
            } while (i2 < 5);
        } else {
            this.mLynxBackground.LJIIIIZZ(i, c79699VPr);
        }
        onBorderRadiusUpdated(i);
    }

    @VPE(defaultInt = -1, names = {"border-style", "border-left-style", "border-right-style", "border-top-style", "border-bottom-style"})
    public void setBorderStyle(int i, int i2) {
        this.mLynxBackground.LJIIIZ(SPACING_TYPES[i], i2);
    }

    @VPE(names = {"border-width", "border-left-width", "border-right-width", "border-top-width", "border-bottom-width"})
    public void setBorderWidth(int i, int i2) {
        this.mLynxBackground.LJIIJ(i2, SPACING_TYPES[i]);
    }

    public void setOverflowWithMask(short s, int i) {
        int i2;
        int i3 = this.mOverflow;
        if (i == 0) {
            i2 = i3 | s;
        } else {
            i2 = i3 & (~s);
        }
        this.mOverflow = i2;
        VPH vph = this.mParent;
        if (vph instanceof UIShadowProxy) {
            ((LynxBaseUI) vph).setOverflowWithMask(s, i);
        }
        requestLayout();
    }

    public void setPosition(int i, int i2) {
        this.mLeft = i;
        this.mTop = i2;
        this.mOriginTop = i2;
        this.mOriginLeft = i;
    }

    public void setSign(int i, String str) {
        this.mSign = i;
        this.mTagName = str;
    }

    public void transformFromViewToRootView(View view, float[] fArr) {
        if (!view.getMatrix().isIdentity()) {
            view.getMatrix().mapPoints(fArr);
        }
        View rootView = view.getRootView();
        while (view != rootView) {
            View view2 = (View) view.getParent();
            if (view2 == null) {
                LLog.LIZLLL(4, "LynxBaseUI", "transformFromViewToRootView failed, parent is null.");
                return;
            }
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            fArr[0] = fArr[0] - view2.getScrollX();
            fArr[1] = fArr[1] - view2.getScrollY();
            if (!view2.getMatrix().isIdentity()) {
                view2.getMatrix().mapPoints(fArr);
            }
            view = view2;
        }
    }

    public final void updateLayoutSize(int i, int i2) {
        Point point = this.mLatestSize;
        point.x = i;
        point.y = i2;
    }

    @VPE(names = {"border-radius", "border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius"})
    public void setBorderRadius(int i, ReadableArray readableArray) {
        this.mHasRadius = false;
        if (this.mLynxBackground.LJII(i, readableArray)) {
            this.mHasRadius = true;
        }
        onBorderRadiusUpdated(i);
    }

    public void setBorderWidth(int i, String str) {
        new RuntimeException("setBorderWidth(int, String) is deprecated.This has no effect.");
    }

    public void setBorderRadius(int i, String str) {
        new RuntimeException("setBorderWidth(int, String) is deprecated.This has no effect.");
    }

    public String constructListStateCacheKey(String str, String str2, String str3) {
        return UPJ.LIZIZ(str, "_", str2, "_", str3);
    }

    public void onListCellDisAppear(String str, UIList uIList, boolean z) {
        if (this.mBlockListEvent) {
            return;
        }
        Iterator<LynxBaseUI> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onListCellDisAppear(str, uIList, z);
        }
    }

    public void scrollIntoView(boolean z, String str, String str2) {
        Boolean bool = Boolean.FALSE;
        LynxBaseUI lynxBaseUI = (LynxBaseUI) this.mParent;
        while (true) {
            if (lynxBaseUI == null) {
                break;
            }
            if (lynxBaseUI instanceof AbsLynxUIScroll) {
                ((AbsLynxUIScroll) lynxBaseUI).LJIJJLI(this, z, str, str2);
                bool = Boolean.TRUE;
                break;
            }
            lynxBaseUI = (LynxBaseUI) lynxBaseUI.mParent;
        }
        if (!bool.booleanValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("scrollIntoView failed for nodeId:");
            LIZ.append(getSign());
            LLog.LIZLLL(4, "LynxBaseUI", X1D.LIZIZ(LIZ));
        }
    }

    public void updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        boolean z;
        boolean z2 = true;
        if (this.mLeft != i) {
            this.mLeft = i;
            z = true;
        } else {
            z = false;
        }
        if (this.mTop != i2) {
            this.mTop = i2;
        } else {
            z2 = z;
        }
        this.mBound = rect;
        if (z2) {
            onDrawingPositionChanged();
        }
    }

    public VOG getTransformValue(float f, float f2, float f3, float f4) {
        VOG vog = new VOG();
        float[] fArr = {f, f3};
        getLocationOnScreen(fArr);
        vog.LIZ = fArr;
        float[] fArr2 = {this.mWidth + f2, f3};
        getLocationOnScreen(fArr2);
        vog.LIZIZ = fArr2;
        float[] fArr3 = {this.mWidth + f2, this.mHeight + f4};
        getLocationOnScreen(fArr3);
        vog.LIZJ = fArr3;
        float[] fArr4 = {f, this.mHeight + f4};
        getLocationOnScreen(fArr4);
        vog.LIZLLL = fArr4;
        return vog;
    }

    public float[] getTargetPoint(float f, float f2, int i, int i2, Rect rect, Matrix matrix) {
        float[] fArr = {(f + i) - rect.left, (f2 + i2) - rect.top};
        Matrix hitTestMatrix = getHitTestMatrix();
        if (matrix.invert(hitTestMatrix)) {
            float[] fArr2 = {fArr[0], fArr[1]};
            hitTestMatrix.mapPoints(fArr2);
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
        } else {
            fArr[0] = Float.MAX_VALUE;
            fArr[1] = Float.MAX_VALUE;
        }
        return fArr;
    }

    public float[] getTargetPoint(float f, float f2, int i, int i2, View view, Matrix matrix) {
        return getTargetPoint(f, f2, i, i2, new Rect(view.getLeft(), view.getTop(), 0, 0), matrix);
    }

    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, 0, 0, 0, 0, i9, i10, i11, i12, rect);
        onLayoutUpdated();
    }

    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        onLayoutUpdated();
        sendLayoutChangeEvent();
    }

    public void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        setPosition(i, i2);
        this.mWidth = i3;
        this.mHeight = i4;
        this.mPaddingLeft = i5;
        this.mPaddingRight = i7;
        this.mPaddingBottom = i8;
        this.mPaddingTop = i6;
        this.mMarginLeft = i9;
        this.mMarginTop = i10;
        this.mMarginRight = i11;
        this.mMarginBottom = i12;
        this.mBorderTopWidth = i14;
        this.mBorderBottomWidth = i16;
        this.mBorderLeftWidth = i13;
        this.mBorderRightWidth = i15;
        this.mBound = rect;
    }
}
