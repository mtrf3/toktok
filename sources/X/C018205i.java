package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.05i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C018205i {
    public static float DEFAULT_BIAS = 0.5f;
    public boolean OPTIMIZE_WRAP;
    public boolean OPTIMIZE_WRAP_ON_RESOLVED;
    public boolean hasBaseline;
    public C44981pe horizontalChainRun;
    public int horizontalGroup;
    public C45021pi horizontalRun;
    public boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    public ArrayList<C017905f> mAnchors;
    public C017905f mBaseline;
    public int mBaselineDistance;
    public C017905f mBottom;
    public boolean mBottomHasCentered;
    public C017905f mCenter;
    public C017905f mCenterX;
    public C017905f mCenterY;
    public float mCircleConstraintAngle;
    public Object mCompanionWidget;
    public int mContainerItemSkip;
    public String mDebugName;
    public float mDimensionRatio;
    public int mDimensionRatioSide;
    public int mDistToBottom;
    public int mDistToLeft;
    public int mDistToRight;
    public int mDistToTop;
    public boolean mGroupsToSolver;
    public int mHeight;
    public float mHorizontalBiasPercent;
    public boolean mHorizontalChainFixedPosition;
    public int mHorizontalChainStyle;
    public C018205i mHorizontalNextWidget;
    public int mHorizontalResolution;
    public boolean mHorizontalWrapVisited;
    public boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    public boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    public int mLastHorizontalMeasureSpec;
    public int mLastVerticalMeasureSpec;
    public C017905f mLeft;
    public boolean mLeftHasCentered;
    public C017905f[] mListAnchors;
    public EnumC018105h[] mListDimensionBehaviors;
    public C018205i[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    public int[] mMaxDimension;
    public boolean mMeasureRequested;
    public int mMinHeight;
    public int mMinWidth;
    public C018205i[] mNextChainWidget;
    public int mOffsetX;
    public int mOffsetY;
    public C018205i mParent;
    public int mRelX;
    public int mRelY;
    public float mResolvedDimensionRatio;
    public int mResolvedDimensionRatioSide;
    public boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public C017905f mRight;
    public boolean mRightHasCentered;
    public C017905f mTop;
    public boolean mTopHasCentered;
    public String mType;
    public float mVerticalBiasPercent;
    public boolean mVerticalChainFixedPosition;
    public int mVerticalChainStyle;
    public C018205i mVerticalNextWidget;
    public int mVerticalResolution;
    public boolean mVerticalWrapVisited;
    public int mVisibility;
    public float[] mWeight;
    public int mWidth;
    public int mX;
    public int mY;
    public boolean measured;
    public boolean resolvedHorizontal;
    public boolean resolvedVertical;
    public AbstractC39241gO[] run;
    public C44981pe verticalChainRun;
    public int verticalGroup;
    public C45031pj verticalRun;

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public void resetFinalResolution() {
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            C017905f c017905f = (C017905f) ListProtector.get(this.mAnchors, i);
            c017905f.LIZJ = false;
            c017905f.LIZIZ = 0;
        }
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean addFirst() {
        if ((this instanceof C40071hj) || (this instanceof C1AC)) {
            return true;
        }
        return false;
    }

    public boolean allowedInBarrier() {
        if (this.mVisibility != 8) {
            return true;
        }
        return false;
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new C45021pi(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new C45031pj(this);
        }
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public EnumC018105h getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        C017905f c017905f = this.mLeft;
        int i = 0;
        if (c017905f != null) {
            i = 0 + c017905f.LJI;
        }
        C017905f c017905f2 = this.mRight;
        if (c017905f2 != null) {
            return i + c017905f2.LJI;
        }
        return i;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getOptimizerWrapHeight() {
        int i;
        int i2 = this.mHeight;
        if (this.mListDimensionBehaviors[1] == EnumC018105h.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultHeight == 1) {
                i = Math.max(this.mMatchConstraintMinHeight, i2);
            } else {
                i = this.mMatchConstraintMinHeight;
                if (i > 0) {
                    this.mHeight = i;
                } else {
                    i = 0;
                }
            }
            int i3 = this.mMatchConstraintMaxHeight;
            if (i3 > 0 && i3 < i) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    public int getOptimizerWrapWidth() {
        int i;
        int i2 = this.mWidth;
        if (this.mListDimensionBehaviors[0] == EnumC018105h.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultWidth == 1) {
                i = Math.max(this.mMatchConstraintMinWidth, i2);
            } else {
                i = this.mMatchConstraintMinWidth;
                if (i > 0) {
                    this.mWidth = i;
                } else {
                    i = 0;
                }
            }
            int i3 = this.mMatchConstraintMaxWidth;
            if (i3 > 0 && i3 < i) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    public int getRootX() {
        return this.mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public EnumC018105h getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i = 0;
        if (this.mLeft != null) {
            i = 0 + this.mTop.LJI;
        }
        if (this.mRight != null) {
            return i + this.mBottom.LJI;
        }
        return i;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getX() {
        C018205i c018205i = this.mParent;
        if (c018205i != null && (c018205i instanceof C40061hi)) {
            return ((C40061hi) c018205i).LJI + this.mX;
        }
        return this.mX;
    }

    public int getY() {
        C018205i c018205i = this.mParent;
        if (c018205i != null && (c018205i instanceof C40061hi)) {
            return ((C40061hi) c018205i).LJII + this.mY;
        }
        return this.mY;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            HashSet<C017905f> hashSet = ((C017905f) ListProtector.get(this.mAnchors, i)).LIZ;
            if (hashSet != null && hashSet.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isInHorizontalChain() {
        C017905f c017905f = this.mLeft;
        C017905f c017905f2 = c017905f.LJFF;
        if (c017905f2 == null || c017905f2.LJFF != c017905f) {
            C017905f c017905f3 = this.mRight;
            C017905f c017905f4 = c017905f3.LJFF;
            if (c017905f4 != null && c017905f4.LJFF == c017905f3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean isInVerticalChain() {
        C017905f c017905f = this.mTop;
        C017905f c017905f2 = c017905f.LJFF;
        if (c017905f2 == null || c017905f2.LJFF != c017905f) {
            C017905f c017905f3 = this.mBottom;
            C017905f c017905f4 = c017905f3.LJFF;
            if (c017905f4 != null && c017905f4.LJFF == c017905f3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean isMeasureRequested() {
        if (this.mMeasureRequested && this.mVisibility != 8) {
            return true;
        }
        return false;
    }

    public boolean isResolvedHorizontally() {
        if (this.resolvedHorizontal || (this.mLeft.LIZJ && this.mRight.LIZJ)) {
            return true;
        }
        return false;
    }

    public boolean isResolvedVertically() {
        if (this.resolvedVertical || (this.mTop.LIZJ && this.mBottom.LIZJ)) {
            return true;
        }
        return false;
    }

    public boolean isRoot() {
        if (this.mParent == null) {
            return true;
        }
        return false;
    }

    public boolean isSpreadHeight() {
        if (this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == EnumC018105h.MATCH_CONSTRAINT) {
            return true;
        }
        return false;
    }

    public boolean isSpreadWidth() {
        if (this.mMatchConstraintDefaultWidth != 0 || this.mDimensionRatio != 0.0f || this.mMatchConstraintMinWidth != 0 || this.mMatchConstraintMaxWidth != 0 || this.mListDimensionBehaviors[0] != EnumC018105h.MATCH_CONSTRAINT) {
            return false;
        }
        return true;
    }

    public boolean oppositeDimensionsTied() {
        EnumC018105h[] enumC018105hArr = this.mListDimensionBehaviors;
        EnumC018105h enumC018105h = enumC018105hArr[0];
        EnumC018105h enumC018105h2 = EnumC018105h.MATCH_CONSTRAINT;
        if (enumC018105h != enumC018105h2 || enumC018105hArr[1] != enumC018105h2) {
            return false;
        }
        return true;
    }

    public void reset() {
        this.mLeft.LJIIIZ();
        this.mTop.LJIIIZ();
        this.mRight.LJIIIZ();
        this.mBottom.LJIIIZ();
        this.mBaseline.LJIIIZ();
        this.mCenterX.LJIIIZ();
        this.mCenterY.LJIIIZ();
        this.mCenter.LJIIIZ();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        EnumC018105h[] enumC018105hArr = this.mListDimensionBehaviors;
        EnumC018105h enumC018105h = EnumC018105h.FIXED;
        enumC018105hArr[0] = enumC018105h;
        enumC018105hArr[1] = enumC018105h;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtuaLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
    }

    public void resetAnchors() {
        C018205i c018205i = this.mParent;
        if (c018205i != null && (c018205i instanceof C40061hi)) {
            c018205i.getClass();
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            ((C017905f) ListProtector.get(this.mAnchors, i)).LJIIIZ();
        }
    }

    public C018205i() {
        this.run = new AbstractC39241gO[2];
        this.isTerminalWidget = new boolean[]{true, true};
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        C017905f c017905f = new C017905f(this, EnumC017805e.LEFT);
        this.mLeft = c017905f;
        C017905f c017905f2 = new C017905f(this, EnumC017805e.TOP);
        this.mTop = c017905f2;
        C017905f c017905f3 = new C017905f(this, EnumC017805e.RIGHT);
        this.mRight = c017905f3;
        C017905f c017905f4 = new C017905f(this, EnumC017805e.BOTTOM);
        this.mBottom = c017905f4;
        C017905f c017905f5 = new C017905f(this, EnumC017805e.BASELINE);
        this.mBaseline = c017905f5;
        this.mCenterX = new C017905f(this, EnumC017805e.CENTER_X);
        this.mCenterY = new C017905f(this, EnumC017805e.CENTER_Y);
        C017905f c017905f6 = new C017905f(this, EnumC017805e.CENTER);
        this.mCenter = c017905f6;
        this.mListAnchors = new C017905f[]{c017905f, c017905f3, c017905f2, c017905f4, c017905f5, c017905f6};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        EnumC018105h enumC018105h = EnumC018105h.FIXED;
        this.mListDimensionBehaviors = new EnumC018105h[]{enumC018105h, enumC018105h};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new C018205i[]{null, null};
        this.mNextChainWidget = new C018205i[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public C018205i getHorizontalChainControlWidget() {
        C017905f c017905f;
        C018205i c018205i;
        if (!isInHorizontalChain()) {
            return null;
        }
        C018205i c018205i2 = this;
        do {
            C017905f anchor = c018205i2.getAnchor(EnumC017805e.LEFT);
            if (anchor == null || (c017905f = anchor.LJFF) == null) {
                c018205i = null;
            } else {
                c018205i = c017905f.LIZLLL;
            }
            if (c018205i == this.mParent) {
                return c018205i2;
            }
            if (c018205i == null) {
                return null;
            }
            C017905f c017905f2 = c018205i.getAnchor(EnumC017805e.RIGHT).LJFF;
            if (c017905f2 != null && c017905f2.LIZLLL != c018205i2) {
                return c018205i2;
            }
            c018205i2 = c018205i;
        } while (c018205i != null);
        return null;
    }

    public int getLeft() {
        return getX();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getTop() {
        return getY();
    }

    public C018205i getVerticalChainControlWidget() {
        C017905f c017905f;
        C018205i c018205i;
        if (!isInVerticalChain()) {
            return null;
        }
        C018205i c018205i2 = this;
        do {
            C017905f anchor = c018205i2.getAnchor(EnumC017805e.TOP);
            if (anchor == null || (c017905f = anchor.LJFF) == null) {
                c018205i = null;
            } else {
                c018205i = c017905f.LIZLLL;
            }
            if (c018205i == this.mParent) {
                return c018205i2;
            }
            if (c018205i == null) {
                return null;
            }
            C017905f c017905f2 = c018205i.getAnchor(EnumC017805e.BOTTOM).LJFF;
            if (c017905f2 != null && c017905f2.LIZLLL != c018205i2) {
                return c018205i2;
            }
            c018205i2 = c018205i;
        } while (c018205i != null);
        return null;
    }

    public void resetAllConstraints() {
        resetAnchors();
        float f = DEFAULT_BIAS;
        this.mVerticalBiasPercent = f;
        this.mHorizontalBiasPercent = f;
    }

    public String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        String str2 = "";
        if (this.mType == null) {
            str = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("type: ");
            str = JBR.LJFF(LIZ2, this.mType, " ", LIZ2);
        }
        LIZ.append(str);
        if (this.mDebugName != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("id: ");
            str2 = JBR.LJFF(LIZ3, this.mDebugName, " ", LIZ3);
        }
        LIZ.append(str2);
        LIZ.append("(");
        LIZ.append(this.mX);
        LIZ.append(", ");
        LIZ.append(this.mY);
        LIZ.append(") - (");
        LIZ.append(this.mWidth);
        LIZ.append(" x ");
        return C08380Uo.LIZ(LIZ, this.mHeight, ")", LIZ);
    }

    public String getType() {
        return this.mType;
    }

    public C018205i(String str) {
        this.run = new AbstractC39241gO[2];
        this.isTerminalWidget = new boolean[]{true, true};
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        C017905f c017905f = new C017905f(this, EnumC017805e.LEFT);
        this.mLeft = c017905f;
        C017905f c017905f2 = new C017905f(this, EnumC017805e.TOP);
        this.mTop = c017905f2;
        C017905f c017905f3 = new C017905f(this, EnumC017805e.RIGHT);
        this.mRight = c017905f3;
        C017905f c017905f4 = new C017905f(this, EnumC017805e.BOTTOM);
        this.mBottom = c017905f4;
        C017905f c017905f5 = new C017905f(this, EnumC017805e.BASELINE);
        this.mBaseline = c017905f5;
        this.mCenterX = new C017905f(this, EnumC017805e.CENTER_X);
        this.mCenterY = new C017905f(this, EnumC017805e.CENTER_Y);
        C017905f c017905f6 = new C017905f(this, EnumC017805e.CENTER);
        this.mCenter = c017905f6;
        this.mListAnchors = new C017905f[]{c017905f, c017905f3, c017905f2, c017905f4, c017905f5, c017905f6};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        EnumC018105h enumC018105h = EnumC018105h.FIXED;
        this.mListDimensionBehaviors = new EnumC018105h[]{enumC018105h, enumC018105h};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new C018205i[]{null, null};
        this.mNextChainWidget = new C018205i[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
        this.mDebugName = str;
    }

    private boolean isChainHead(int i) {
        C017905f c017905f;
        C017905f c017905f2;
        int i2 = i * 2;
        C017905f[] c017905fArr = this.mListAnchors;
        C017905f c017905f3 = c017905fArr[i2];
        C017905f c017905f4 = c017905f3.LJFF;
        if (c017905f4 != null && c017905f4.LJFF != c017905f3 && (c017905f2 = (c017905f = c017905fArr[i2 + 1]).LJFF) != null && c017905f2.LJFF == c017905f) {
            return true;
        }
        return false;
    }

    public void createObjectVariables(C14Z c14z) {
        c14z.LJIIJ(this.mLeft);
        c14z.LJIIJ(this.mTop);
        c14z.LJIIJ(this.mRight);
        c14z.LJIIJ(this.mBottom);
        if (this.mBaselineDistance > 0) {
            c14z.LJIIJ(this.mBaseline);
        }
    }

    public C017905f getAnchor(EnumC017805e enumC017805e) {
        switch (C018005g.LIZ[enumC017805e.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(enumC017805e.name());
        }
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public EnumC018105h getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    public C018205i getNextChainMember(int i) {
        C017905f c017905f;
        C017905f c017905f2;
        if (i == 0) {
            C017905f c017905f3 = this.mRight;
            C017905f c017905f4 = c017905f3.LJFF;
            if (c017905f4 != null && c017905f4.LJFF == c017905f3) {
                return c017905f4.LIZLLL;
            }
            return null;
        }
        if (i == 1 && (c017905f2 = (c017905f = this.mBottom).LJFF) != null && c017905f2.LJFF == c017905f) {
            return c017905f2.LIZLLL;
        }
        return null;
    }

    public C018205i getPreviousChainMember(int i) {
        C017905f c017905f;
        C017905f c017905f2;
        if (i == 0) {
            C017905f c017905f3 = this.mLeft;
            C017905f c017905f4 = c017905f3.LJFF;
            if (c017905f4 != null && c017905f4.LJFF == c017905f3) {
                return c017905f4.LIZLLL;
            }
            return null;
        }
        if (i == 1 && (c017905f2 = (c017905f = this.mTop).LJFF) != null && c017905f2.LJFF == c017905f) {
            return c017905f2.LIZLLL;
        }
        return null;
    }

    public int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    public AbstractC39241gO getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public boolean hasDanglingDimension(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.mLeft.LJFF != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.mRight.LJFF != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.mTop.LJFF != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.mBottom.LJFF != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.mBaseline.LJFF != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
            return true;
        }
        return false;
    }

    public boolean oppositeDimensionDependsOn(int i) {
        char c;
        if (i == 0) {
            c = 1;
        } else {
            c = 0;
        }
        EnumC018105h[] enumC018105hArr = this.mListDimensionBehaviors;
        EnumC018105h enumC018105h = enumC018105hArr[i];
        EnumC018105h enumC018105h2 = enumC018105hArr[c];
        EnumC018105h enumC018105h3 = EnumC018105h.MATCH_CONSTRAINT;
        if (enumC018105h == enumC018105h3 && enumC018105h2 == enumC018105h3) {
            return true;
        }
        return false;
    }

    public void resetAnchor(C017905f c017905f) {
        C018205i c018205i = this.mParent;
        if (c018205i != null && (c018205i instanceof C40061hi)) {
            c018205i.getClass();
        }
        C017905f anchor = getAnchor(EnumC017805e.LEFT);
        C017905f anchor2 = getAnchor(EnumC017805e.RIGHT);
        C017905f anchor3 = getAnchor(EnumC017805e.TOP);
        C017905f anchor4 = getAnchor(EnumC017805e.BOTTOM);
        C017905f anchor5 = getAnchor(EnumC017805e.CENTER);
        C017905f anchor6 = getAnchor(EnumC017805e.CENTER_X);
        C017905f anchor7 = getAnchor(EnumC017805e.CENTER_Y);
        if (c017905f == anchor5) {
            if (anchor.LJII() && anchor2.LJII() && anchor.LJFF == anchor2.LJFF) {
                anchor.LJIIIZ();
                anchor2.LJIIIZ();
            }
            if (anchor3.LJII() && anchor4.LJII() && anchor3.LJFF == anchor4.LJFF) {
                anchor3.LJIIIZ();
                anchor4.LJIIIZ();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (c017905f == anchor6) {
            if (anchor.LJII() && anchor2.LJII() && anchor.LJFF.LIZLLL == anchor2.LJFF.LIZLLL) {
                anchor.LJIIIZ();
                anchor2.LJIIIZ();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (c017905f == anchor7) {
            if (anchor3.LJII() && anchor4.LJII() && anchor3.LJFF.LIZLLL == anchor4.LJFF.LIZLLL) {
                anchor3.LJIIIZ();
                anchor4.LJIIIZ();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (c017905f == anchor || c017905f == anchor2) {
            if (anchor.LJII() && anchor.LJFF == anchor2.LJFF) {
                anchor5.LJIIIZ();
            }
        } else if ((c017905f == anchor3 || c017905f == anchor4) && anchor3.LJII() && anchor3.LJFF == anchor4.LJFF) {
            anchor5.LJIIIZ();
        }
        c017905f.LJIIIZ();
    }

    public void resetSolverVariables(C14X c14x) {
        this.mLeft.LJIIJ();
        this.mTop.LJIIJ();
        this.mRight.LJIIJ();
        this.mBottom.LJIIJ();
        this.mBaseline.LJIIJ();
        this.mCenter.LJIIJ();
        this.mCenterX.LJIIJ();
        this.mCenterY.LJIIJ();
    }

    public void setBaselineDistance(int i) {
        boolean z;
        this.mBaselineDistance = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.hasBaseline = z;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public void setDimensionRatio(String str) {
        float parseFloat;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i = 0;
        int i2 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (!substring.equalsIgnoreCase("W")) {
                if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                } else {
                    i = -1;
                }
            }
            i2 = i;
            i = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        try {
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat2 = CastFloatProtector.parseFloat(substring2);
                    float parseFloat3 = CastFloatProtector.parseFloat(substring3);
                    if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                        if (i2 == 1) {
                            parseFloat = Math.abs(parseFloat3 / parseFloat2);
                        } else {
                            parseFloat = Math.abs(parseFloat2 / parseFloat3);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                String substring4 = str.substring(i);
                if (substring4.length() > 0) {
                    parseFloat = CastFloatProtector.parseFloat(substring4);
                } else {
                    return;
                }
            }
            if (parseFloat > 0.0f) {
                this.mDimensionRatio = parseFloat;
                this.mDimensionRatioSide = i2;
            }
        } catch (NumberFormatException unused) {
        }
    }

    public void setFinalBaseline(int i) {
        if (!this.hasBaseline) {
            return;
        }
        int i2 = i - this.mBaselineDistance;
        int i3 = this.mHeight + i2;
        this.mY = i2;
        this.mTop.LJIIJJI(i2);
        this.mBottom.LJIIJJI(i3);
        this.mBaseline.LJIIJJI(i);
        this.resolvedVertical = true;
    }

    public void setFinalLeft(int i) {
        this.mLeft.LJIIJJI(i);
        this.mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.LJIIJJI(i);
        this.mY = i;
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setHorizontalDimensionBehaviour(EnumC018105h enumC018105h) {
        this.mListDimensionBehaviors[0] = enumC018105h;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setVerticalDimensionBehaviour(EnumC018105h enumC018105h) {
        this.mListDimensionBehaviors[1] = enumC018105h;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public C018205i(int i, int i2) {
        this(0, 0, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x057b, code lost:
    
        if (r10 != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r79.resolvedVertical != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0452 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0520  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addToSolver(X.C14Z r80, boolean r81) {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018205i.addToSolver(X.14Z, boolean):void");
    }

    public void copy(C018205i c018205i, HashMap<C018205i, C018205i> hashMap) {
        C018205i c018205i2;
        C018205i c018205i3;
        this.mHorizontalResolution = c018205i.mHorizontalResolution;
        this.mVerticalResolution = c018205i.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = c018205i.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = c018205i.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = c018205i.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = c018205i.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = c018205i.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = c018205i.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = c018205i.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = c018205i.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = c018205i.mIsWidthWrapContent;
        this.mIsHeightWrapContent = c018205i.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = c018205i.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = c018205i.mResolvedDimensionRatio;
        int[] iArr3 = c018205i.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = c018205i.mCircleConstraintAngle;
        this.hasBaseline = c018205i.hasBaseline;
        this.inPlaceholder = c018205i.inPlaceholder;
        this.mLeft.LJIIIZ();
        this.mTop.LJIIIZ();
        this.mRight.LJIIIZ();
        this.mBottom.LJIIIZ();
        this.mBaseline.LJIIIZ();
        this.mCenterX.LJIIIZ();
        this.mCenterY.LJIIIZ();
        this.mCenter.LJIIIZ();
        this.mListDimensionBehaviors = (EnumC018105h[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        C018205i c018205i4 = null;
        if (this.mParent == null) {
            c018205i2 = null;
        } else {
            c018205i2 = hashMap.get(c018205i.mParent);
        }
        this.mParent = c018205i2;
        this.mWidth = c018205i.mWidth;
        this.mHeight = c018205i.mHeight;
        this.mDimensionRatio = c018205i.mDimensionRatio;
        this.mDimensionRatioSide = c018205i.mDimensionRatioSide;
        this.mX = c018205i.mX;
        this.mY = c018205i.mY;
        this.mRelX = c018205i.mRelX;
        this.mRelY = c018205i.mRelY;
        this.mOffsetX = c018205i.mOffsetX;
        this.mOffsetY = c018205i.mOffsetY;
        this.mBaselineDistance = c018205i.mBaselineDistance;
        this.mMinWidth = c018205i.mMinWidth;
        this.mMinHeight = c018205i.mMinHeight;
        this.mHorizontalBiasPercent = c018205i.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = c018205i.mVerticalBiasPercent;
        this.mCompanionWidget = c018205i.mCompanionWidget;
        this.mContainerItemSkip = c018205i.mContainerItemSkip;
        this.mVisibility = c018205i.mVisibility;
        this.mDebugName = c018205i.mDebugName;
        this.mType = c018205i.mType;
        this.mDistToTop = c018205i.mDistToTop;
        this.mDistToLeft = c018205i.mDistToLeft;
        this.mDistToRight = c018205i.mDistToRight;
        this.mDistToBottom = c018205i.mDistToBottom;
        this.mLeftHasCentered = c018205i.mLeftHasCentered;
        this.mRightHasCentered = c018205i.mRightHasCentered;
        this.mTopHasCentered = c018205i.mTopHasCentered;
        this.mBottomHasCentered = c018205i.mBottomHasCentered;
        this.mHorizontalWrapVisited = c018205i.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = c018205i.mVerticalWrapVisited;
        this.mHorizontalChainStyle = c018205i.mHorizontalChainStyle;
        this.mVerticalChainStyle = c018205i.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = c018205i.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = c018205i.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = c018205i.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        C018205i[] c018205iArr = this.mListNextMatchConstraintsWidget;
        C018205i[] c018205iArr2 = c018205i.mListNextMatchConstraintsWidget;
        c018205iArr[0] = c018205iArr2[0];
        c018205iArr[1] = c018205iArr2[1];
        C018205i[] c018205iArr3 = this.mNextChainWidget;
        C018205i[] c018205iArr4 = c018205i.mNextChainWidget;
        c018205iArr3[0] = c018205iArr4[0];
        c018205iArr3[1] = c018205iArr4[1];
        C018205i c018205i5 = c018205i.mHorizontalNextWidget;
        if (c018205i5 == null) {
            c018205i3 = null;
        } else {
            c018205i3 = hashMap.get(c018205i5);
        }
        this.mHorizontalNextWidget = c018205i3;
        C018205i c018205i6 = c018205i.mVerticalNextWidget;
        if (c018205i6 != null) {
            c018205i4 = hashMap.get(c018205i6);
        }
        this.mVerticalNextWidget = c018205i4;
    }

    public void setDebugSolverName(C14Z c14z, String str) {
        this.mDebugName = str;
        C270014e LJIIJ = c14z.LJIIJ(this.mLeft);
        C270014e LJIIJ2 = c14z.LJIIJ(this.mTop);
        C270014e LJIIJ3 = c14z.LJIIJ(this.mRight);
        C270014e LJIIJ4 = c14z.LJIIJ(this.mBottom);
        LJIIJ.LIZIZ = i0.LJFF(str, ".left");
        LJIIJ2.LIZIZ = i0.LJFF(str, ".top");
        LJIIJ3.LIZIZ = i0.LJFF(str, ".right");
        LJIIJ4.LIZIZ = i0.LJFF(str, ".bottom");
        c14z.LJIIJ(this.mBaseline).LIZIZ = i0.LJFF(str, ".baseline");
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public void setFinalHorizontal(int i, int i2) {
        this.mLeft.LJIIJJI(i);
        this.mRight.LJIIJJI(i2);
        this.mX = i;
        this.mWidth = i2 - i;
        this.resolvedHorizontal = true;
    }

    public void setFinalVertical(int i, int i2) {
        this.mTop.LJIIJJI(i);
        this.mBottom.LJIIJJI(i2);
        this.mY = i;
        this.mHeight = i2 - i;
        if (this.hasBaseline) {
            this.mBaseline.LJIIJJI(i + this.mBaselineDistance);
        }
        this.resolvedVertical = true;
    }

    public void setGoneMargin(EnumC017805e enumC017805e, int i) {
        int i2 = C018005g.LIZ[enumC017805e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    this.mBottom.LJII = i;
                    return;
                }
                this.mRight.LJII = i;
                return;
            }
            this.mTop.LJII = i;
            return;
        }
        this.mLeft.LJII = i;
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.mLastHorizontalMeasureSpec = i;
        this.mLastVerticalMeasureSpec = i2;
        this.mMeasureRequested = false;
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else {
            if (i2 != 1) {
                return;
            }
            setHeight(i);
        }
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else {
            if (i2 != 1) {
                return;
            }
            this.mRelY = i;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        C45021pi c45021pi = this.horizontalRun;
        boolean z3 = z & c45021pi.LJI;
        C45031pj c45031pj = this.verticalRun;
        boolean z4 = z2 & c45031pj.LJI;
        int i3 = c45021pi.LJII.LJI;
        int i4 = c45031pj.LJII.LJI;
        int i5 = c45021pi.LJIIIIZZ.LJI;
        int i6 = c45031pj.LJIIIIZZ.LJI;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.mX = i3;
        }
        if (z4) {
            this.mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (z3) {
            if (this.mListDimensionBehaviors[0] == EnumC018105h.FIXED && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (z4) {
            if (this.mListDimensionBehaviors[1] == EnumC018105h.FIXED && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }

    public void updateFromSolver(C14Z c14z, boolean z) {
        C017905f c017905f = this.mLeft;
        c14z.getClass();
        int LJIILIIL = C14Z.LJIILIIL(c017905f);
        int LJIILIIL2 = C14Z.LJIILIIL(this.mTop);
        int LJIILIIL3 = C14Z.LJIILIIL(this.mRight);
        int LJIILIIL4 = C14Z.LJIILIIL(this.mBottom);
        if (z) {
            C45021pi c45021pi = this.horizontalRun;
            if (c45021pi != null) {
                C39231gN c39231gN = c45021pi.LJII;
                if (c39231gN.LJIIIZ) {
                    C39231gN c39231gN2 = c45021pi.LJIIIIZZ;
                    if (c39231gN2.LJIIIZ) {
                        LJIILIIL = c39231gN.LJI;
                        LJIILIIL3 = c39231gN2.LJI;
                    }
                }
            }
            C45031pj c45031pj = this.verticalRun;
            if (c45031pj != null) {
                C39231gN c39231gN3 = c45031pj.LJII;
                if (c39231gN3.LJIIIZ) {
                    C39231gN c39231gN4 = c45031pj.LJIIIIZZ;
                    if (c39231gN4.LJIIIZ) {
                        LJIILIIL2 = c39231gN3.LJI;
                        LJIILIIL4 = c39231gN4.LJI;
                    }
                }
            }
        }
        int i = LJIILIIL4 - LJIILIIL2;
        if (LJIILIIL3 - LJIILIIL < 0 || i < 0 || LJIILIIL == Integer.MIN_VALUE || LJIILIIL == Integer.MAX_VALUE || LJIILIIL2 == Integer.MIN_VALUE || LJIILIIL2 == Integer.MAX_VALUE || LJIILIIL3 == Integer.MIN_VALUE || LJIILIIL3 == Integer.MAX_VALUE || LJIILIIL4 == Integer.MIN_VALUE || LJIILIIL4 == Integer.MAX_VALUE) {
            LJIILIIL = 0;
            LJIILIIL2 = 0;
            LJIILIIL3 = 0;
            LJIILIIL4 = 0;
        }
        setFrame(LJIILIIL, LJIILIIL2, LJIILIIL3, LJIILIIL4);
    }

    public C018205i(String str, int i, int i2) {
        this(i, i2);
        this.mDebugName = str;
    }

    public void connect(C017905f c017905f, C017905f c017905f2, int i) {
        if (c017905f.LIZLLL == this) {
            connect(c017905f.LJ, c017905f2.LIZLLL, c017905f2.LJ, i);
        }
    }

    public void connectCircularConstraint(C018205i c018205i, float f, int i) {
        EnumC017805e enumC017805e = EnumC017805e.CENTER;
        immediateConnect(enumC017805e, c018205i, enumC017805e, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else {
            if (i3 != 1) {
                return;
            }
            setVerticalDimension(i, i2);
        }
    }

    public void connect(EnumC017805e enumC017805e, C018205i c018205i, EnumC017805e enumC017805e2) {
        connect(enumC017805e, c018205i, enumC017805e2, 0);
    }

    public C018205i(int i, int i2, int i3, int i4) {
        this.run = new AbstractC39241gO[2];
        this.isTerminalWidget = new boolean[]{true, true};
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        C017905f c017905f = new C017905f(this, EnumC017805e.LEFT);
        this.mLeft = c017905f;
        C017905f c017905f2 = new C017905f(this, EnumC017805e.TOP);
        this.mTop = c017905f2;
        C017905f c017905f3 = new C017905f(this, EnumC017805e.RIGHT);
        this.mRight = c017905f3;
        C017905f c017905f4 = new C017905f(this, EnumC017805e.BOTTOM);
        this.mBottom = c017905f4;
        C017905f c017905f5 = new C017905f(this, EnumC017805e.BASELINE);
        this.mBaseline = c017905f5;
        this.mCenterX = new C017905f(this, EnumC017805e.CENTER_X);
        this.mCenterY = new C017905f(this, EnumC017805e.CENTER_Y);
        C017905f c017905f6 = new C017905f(this, EnumC017805e.CENTER);
        this.mCenter = c017905f6;
        this.mListAnchors = new C017905f[]{c017905f, c017905f3, c017905f2, c017905f4, c017905f5, c017905f6};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        EnumC018105h enumC018105h = EnumC018105h.FIXED;
        this.mListDimensionBehaviors = new EnumC018105h[]{enumC018105h, enumC018105h};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new C018205i[]{null, null};
        this.mNextChainWidget = new C018205i[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public void connect(EnumC017805e enumC017805e, C018205i c018205i, EnumC017805e enumC017805e2, int i) {
        EnumC017805e enumC017805e3;
        EnumC017805e enumC017805e4;
        boolean z;
        EnumC017805e enumC017805e5 = EnumC017805e.CENTER;
        if (enumC017805e == enumC017805e5) {
            if (enumC017805e2 == enumC017805e5) {
                EnumC017805e enumC017805e6 = EnumC017805e.LEFT;
                C017905f anchor = getAnchor(enumC017805e6);
                EnumC017805e enumC017805e7 = EnumC017805e.RIGHT;
                C017905f anchor2 = getAnchor(enumC017805e7);
                EnumC017805e enumC017805e8 = EnumC017805e.TOP;
                C017905f anchor3 = getAnchor(enumC017805e8);
                EnumC017805e enumC017805e9 = EnumC017805e.BOTTOM;
                C017905f anchor4 = getAnchor(enumC017805e9);
                boolean z2 = true;
                if ((anchor != null && anchor.LJII()) || (anchor2 != null && anchor2.LJII())) {
                    z = false;
                } else {
                    connect(enumC017805e6, c018205i, enumC017805e6, 0);
                    connect(enumC017805e7, c018205i, enumC017805e7, 0);
                    z = true;
                }
                if ((anchor3 != null && anchor3.LJII()) || (anchor4 != null && anchor4.LJII())) {
                    z2 = false;
                } else {
                    connect(enumC017805e8, c018205i, enumC017805e8, 0);
                    connect(enumC017805e9, c018205i, enumC017805e9, 0);
                }
                if (z) {
                    if (z2) {
                        getAnchor(enumC017805e5).LIZ(c018205i.getAnchor(enumC017805e5), 0);
                        return;
                    } else {
                        EnumC017805e enumC017805e10 = EnumC017805e.CENTER_X;
                        getAnchor(enumC017805e10).LIZ(c018205i.getAnchor(enumC017805e10), 0);
                        return;
                    }
                }
                if (!z2) {
                    return;
                }
                EnumC017805e enumC017805e11 = EnumC017805e.CENTER_Y;
                getAnchor(enumC017805e11).LIZ(c018205i.getAnchor(enumC017805e11), 0);
                return;
            }
            EnumC017805e enumC017805e12 = EnumC017805e.LEFT;
            if (enumC017805e2 == enumC017805e12 || enumC017805e2 == EnumC017805e.RIGHT) {
                connect(enumC017805e12, c018205i, enumC017805e2, 0);
                connect(EnumC017805e.RIGHT, c018205i, enumC017805e2, 0);
                getAnchor(enumC017805e5).LIZ(c018205i.getAnchor(enumC017805e2), 0);
                return;
            }
            EnumC017805e enumC017805e13 = EnumC017805e.TOP;
            if (enumC017805e2 != enumC017805e13 && enumC017805e2 != EnumC017805e.BOTTOM) {
                return;
            }
            connect(enumC017805e13, c018205i, enumC017805e2, 0);
            connect(EnumC017805e.BOTTOM, c018205i, enumC017805e2, 0);
            getAnchor(enumC017805e5).LIZ(c018205i.getAnchor(enumC017805e2), 0);
            return;
        }
        EnumC017805e enumC017805e14 = EnumC017805e.CENTER_X;
        if (enumC017805e == enumC017805e14 && (enumC017805e2 == (enumC017805e4 = EnumC017805e.LEFT) || enumC017805e2 == EnumC017805e.RIGHT)) {
            C017905f anchor5 = getAnchor(enumC017805e4);
            C017905f anchor6 = c018205i.getAnchor(enumC017805e2);
            C017905f anchor7 = getAnchor(EnumC017805e.RIGHT);
            anchor5.LIZ(anchor6, 0);
            anchor7.LIZ(anchor6, 0);
            getAnchor(enumC017805e14).LIZ(anchor6, 0);
            return;
        }
        EnumC017805e enumC017805e15 = EnumC017805e.CENTER_Y;
        if (enumC017805e == enumC017805e15 && (enumC017805e2 == (enumC017805e3 = EnumC017805e.TOP) || enumC017805e2 == EnumC017805e.BOTTOM)) {
            C017905f anchor8 = c018205i.getAnchor(enumC017805e2);
            getAnchor(enumC017805e3).LIZ(anchor8, 0);
            getAnchor(EnumC017805e.BOTTOM).LIZ(anchor8, 0);
            getAnchor(enumC017805e15).LIZ(anchor8, 0);
            return;
        }
        if (enumC017805e == enumC017805e14 && enumC017805e2 == enumC017805e14) {
            EnumC017805e enumC017805e16 = EnumC017805e.LEFT;
            getAnchor(enumC017805e16).LIZ(c018205i.getAnchor(enumC017805e16), 0);
            EnumC017805e enumC017805e17 = EnumC017805e.RIGHT;
            getAnchor(enumC017805e17).LIZ(c018205i.getAnchor(enumC017805e17), 0);
            getAnchor(enumC017805e14).LIZ(c018205i.getAnchor(enumC017805e2), 0);
            return;
        }
        if (enumC017805e == enumC017805e15 && enumC017805e2 == enumC017805e15) {
            EnumC017805e enumC017805e18 = EnumC017805e.TOP;
            getAnchor(enumC017805e18).LIZ(c018205i.getAnchor(enumC017805e18), 0);
            EnumC017805e enumC017805e19 = EnumC017805e.BOTTOM;
            getAnchor(enumC017805e19).LIZ(c018205i.getAnchor(enumC017805e19), 0);
            getAnchor(enumC017805e15).LIZ(c018205i.getAnchor(enumC017805e2), 0);
            return;
        }
        C017905f anchor9 = getAnchor(enumC017805e);
        C017905f anchor10 = c018205i.getAnchor(enumC017805e2);
        if (!anchor9.LJIIIIZZ(anchor10)) {
            return;
        }
        EnumC017805e enumC017805e20 = EnumC017805e.BASELINE;
        if (enumC017805e == enumC017805e20) {
            C017905f anchor11 = getAnchor(EnumC017805e.TOP);
            C017905f anchor12 = getAnchor(EnumC017805e.BOTTOM);
            if (anchor11 != null) {
                anchor11.LJIIIZ();
            }
            if (anchor12 != null) {
                anchor12.LJIIIZ();
            }
            i = 0;
        } else if (enumC017805e == EnumC017805e.TOP || enumC017805e == EnumC017805e.BOTTOM) {
            C017905f anchor13 = getAnchor(enumC017805e20);
            if (anchor13 != null) {
                anchor13.LJIIIZ();
            }
            C017905f anchor14 = getAnchor(enumC017805e5);
            if (anchor14.LJFF != anchor10) {
                anchor14.LJIIIZ();
            }
            C017905f LJFF = getAnchor(enumC017805e).LJFF();
            C017905f anchor15 = getAnchor(enumC017805e15);
            if (anchor15.LJII()) {
                LJFF.LJIIIZ();
                anchor15.LJIIIZ();
            }
        } else if (enumC017805e == EnumC017805e.LEFT || enumC017805e == EnumC017805e.RIGHT) {
            C017905f anchor16 = getAnchor(enumC017805e5);
            if (anchor16.LJFF != anchor10) {
                anchor16.LJIIIZ();
            }
            C017905f LJFF2 = getAnchor(enumC017805e).LJFF();
            C017905f anchor17 = getAnchor(enumC017805e14);
            if (anchor17.LJII()) {
                LJFF2.LJIIIZ();
                anchor17.LJIIIZ();
            }
        }
        anchor9.LIZ(anchor10, i);
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        EnumC018105h[] enumC018105hArr = this.mListDimensionBehaviors;
        EnumC018105h enumC018105h = enumC018105hArr[0];
        EnumC018105h enumC018105h2 = EnumC018105h.FIXED;
        if (enumC018105h == enumC018105h2 && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (enumC018105hArr[1] == enumC018105h2 && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3) {
                if (!z4) {
                    this.mResolvedDimensionRatioSide = 0;
                }
            } else if (z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.LJII() || !this.mBottom.LJII())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.LJII() || !this.mRight.LJII())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.LJII() || !this.mBottom.LJII() || !this.mLeft.LJII() || !this.mRight.LJII())) {
            if (this.mTop.LJII() && this.mBottom.LJII()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.LJII() && this.mRight.LJII()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0) {
                if (this.mMatchConstraintMinHeight == 0) {
                    this.mResolvedDimensionRatioSide = 0;
                }
            } else {
                if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    public C018205i(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        this.mDebugName = str;
    }

    public void addChildrenToSolverByDependency(C40061hi c40061hi, C14Z c14z, HashSet<C018205i> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            C018605m.LIZ(c40061hi, c14z, this);
            hashSet.remove(this);
            addToSolver(c14z, c40061hi.LJIIJJI(64));
        }
        if (i == 0) {
            HashSet<C017905f> hashSet2 = this.mLeft.LIZ;
            if (hashSet2 != null) {
                Iterator<C017905f> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().LIZLLL.addChildrenToSolverByDependency(c40061hi, c14z, hashSet, 0, true);
                }
            }
            HashSet<C017905f> hashSet3 = this.mRight.LIZ;
            if (hashSet3 != null) {
                Iterator<C017905f> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL.addChildrenToSolverByDependency(c40061hi, c14z, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet<C017905f> hashSet4 = this.mTop.LIZ;
        if (hashSet4 != null) {
            Iterator<C017905f> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().LIZLLL.addChildrenToSolverByDependency(c40061hi, c14z, hashSet, i, true);
            }
        }
        HashSet<C017905f> hashSet5 = this.mBottom.LIZ;
        if (hashSet5 != null) {
            Iterator<C017905f> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().LIZLLL.addChildrenToSolverByDependency(c40061hi, c14z, hashSet, i, true);
            }
        }
        HashSet<C017905f> hashSet6 = this.mBaseline.LIZ;
        if (hashSet6 != null) {
            Iterator<C017905f> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().LIZLLL.addChildrenToSolverByDependency(c40061hi, c14z, hashSet, i, true);
            }
        }
    }

    public void immediateConnect(EnumC017805e enumC017805e, C018205i c018205i, EnumC017805e enumC017805e2, int i, int i2) {
        getAnchor(enumC017805e).LIZIZ(c018205i.getAnchor(enumC017805e2), i, i2, true);
    }

    public void setFinalFrame(int i, int i2, int i3, int i4, int i5, int i6) {
        setFrame(i, i2, i3, i4);
        setBaselineDistance(i5);
        if (i6 == 0) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = false;
        } else if (i6 == 1) {
            this.resolvedHorizontal = false;
            this.resolvedVertical = true;
        } else if (i6 == 2) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = true;
        } else {
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025c, code lost:
    
        if (r13 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x025e, code lost:
    
        r9 = r49.LJFF.LIZLLL;
        r10 = r50.LJFF.LIZLLL;
        r11 = r39.mParent;
        r19 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0270, code lost:
    
        if (r20 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0272, code lost:
    
        if (r8 != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0274, code lost:
    
        if (r6 != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0276, code lost:
    
        if (r23 != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x027c, code lost:
    
        if (r22.LJI == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0282, code lost:
    
        if (r21.LJI == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0284, code lost:
    
        r40.LJ(r2, r22, r49.LJ(), 8);
        r40.LJ(r1, r21, -r50.LJ(), 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0299, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x034d, code lost:
    
        r4 = 8;
        r3 = 8;
        r12 = false;
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0356, code lost:
    
        if ((r9 instanceof X.C40051hh) != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x035a, code lost:
    
        if ((r10 instanceof X.C40051hh) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035d, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x035e, code lost:
    
        r36 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0360, code lost:
    
        if (r12 == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0366, code lost:
    
        if (r22 != r21) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0368, code lost:
    
        if (r9 == r11) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x036a, code lost:
    
        r16 = false;
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x036e, code lost:
    
        if (r12 == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0370, code lost:
    
        if (r20 != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0372, code lost:
    
        if (r57 != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0374, code lost:
    
        if (r59 != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0378, code lost:
    
        if (r22 != r45) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x037e, code lost:
    
        if (r21 != r46) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0380, code lost:
    
        r42 = false;
        r36 = 8;
        r4 = 8;
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0388, code lost:
    
        r21 = r21;
        r14 = 8;
        r12 = r22;
        r13 = r1;
        r6 = r2;
        r40.LIZIZ(r2, r22, r49.LJ(), r55, r21, r1, r50.LJ(), r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03ab, code lost:
    
        if (r39.mVisibility != r14) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03ad, code lost:
    
        r1 = r50.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03b2, code lost:
    
        if (r1 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03b9, code lost:
    
        if (r1.size() <= 0) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03bb, code lost:
    
        if (r17 == false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03bd, code lost:
    
        if (r42 == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03c1, code lost:
    
        if (r12 == r21) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03c3, code lost:
    
        if (r20 != false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03c8, code lost:
    
        if ((r9 instanceof X.C40051hh) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03cd, code lost:
    
        if ((r10 instanceof X.C40051hh) == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03cf, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03d0, code lost:
    
        r40.LJFF(r6, r12, r49.LJ(), r4);
        r1 = r13;
        r40.LJI(r13, r21, -r50.LJ(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03e6, code lost:
    
        if (r42 == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03e8, code lost:
    
        if (r60 == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03ed, code lost:
    
        if ((r9 instanceof X.C40051hh) != false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03f2, code lost:
    
        if ((r10 instanceof X.C40051hh) != false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03f4, code lost:
    
        r4 = 6;
        r3 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03f6, code lost:
    
        if (r18 == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03f8, code lost:
    
        if (r59 == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03fa, code lost:
    
        if (r43 == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03fc, code lost:
    
        if (r9 == r11) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03fe, code lost:
    
        if (r10 != r11) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0463, code lost:
    
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0403, code lost:
    
        if ((r9 instanceof X.C1AC) != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0408, code lost:
    
        if ((r10 instanceof X.C1AC) == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x040f, code lost:
    
        if ((r9 instanceof X.C40051hh) != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0414, code lost:
    
        if ((r10 instanceof X.C40051hh) == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0418, code lost:
    
        if (r59 == false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x041a, code lost:
    
        r19 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x041c, code lost:
    
        r3 = java.lang.Math.max(r19, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0416, code lost:
    
        r19 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x040a, code lost:
    
        r19 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0422, code lost:
    
        if (r42 == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0424, code lost:
    
        r3 = java.lang.Math.min(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0428, code lost:
    
        if (r56 == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x042a, code lost:
    
        if (r59 != false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x042c, code lost:
    
        if (r9 == r11) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x042e, code lost:
    
        if (r10 != r11) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0430, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0431, code lost:
    
        r40.LJ(r6, r12, r49.LJ(), r3);
        r40.LJ(r13, r21, -r50.LJ(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0442, code lost:
    
        if (r42 == false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0444, code lost:
    
        if (r45 != r12) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0446, code lost:
    
        r2 = r49.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x044a, code lost:
    
        if (r12 == r45) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x044c, code lost:
    
        r4 = 5;
        r40.LJFF(r6, r45, r2, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0450, code lost:
    
        if (r20 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0452, code lost:
    
        if (r53 != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0454, code lost:
    
        if (r23 != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0457, code lost:
    
        if (r8 != 3) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0459, code lost:
    
        r40.LJFF(r13, r6, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x047c, code lost:
    
        r40.LJFF(r13, r6, 0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x045f, code lost:
    
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0461, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0466, code lost:
    
        if (r16 == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0469, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x046c, code lost:
    
        r21 = r21;
        r12 = r22;
        r13 = r1;
        r6 = r2;
        r14 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0476, code lost:
    
        r17 = r12;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x035c, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x029a, code lost:
    
        r4 = 5;
        r3 = 5;
        r12 = true;
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02a2, code lost:
    
        if (r8 != 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02a4, code lost:
    
        r8 = 1;
        r36 = 6;
        r3 = 4;
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02aa, code lost:
    
        r12 = true;
        r4 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02b0, code lost:
    
        if (r8 != 3) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02b2, code lost:
    
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02b6, code lost:
    
        if (r39.mResolvedDimensionRatioSide != (-1)) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02b8, code lost:
    
        if (r59 == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x02ba, code lost:
    
        if (r42 == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02bc, code lost:
    
        r36 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02be, code lost:
    
        r3 = 5;
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02c2, code lost:
    
        r36 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x02c5, code lost:
    
        r36 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02c8, code lost:
    
        if (r56 == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02cd, code lost:
    
        if (r62 == 2) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02d0, code lost:
    
        if (r62 != 1) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02d9, code lost:
    
        r3 = 5;
        r4 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02d4, code lost:
    
        r12 = true;
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02d2, code lost:
    
        r3 = 4;
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0329, code lost:
    
        if (r6 <= 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x032b, code lost:
    
        r12 = true;
        r18 = true;
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x032f, code lost:
    
        r36 = 6;
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0333, code lost:
    
        if (r6 != 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0324, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0326, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0327, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0335, code lost:
    
        if (r23 != 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0337, code lost:
    
        if (r59 != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0339, code lost:
    
        r12 = true;
        r18 = true;
        r3 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x033f, code lost:
    
        if (r9 == r11) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0341, code lost:
    
        if (r10 == r11) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0343, code lost:
    
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0344, code lost:
    
        r12 = true;
        r36 = 6;
        r18 = true;
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x034b, code lost:
    
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x02dd, code lost:
    
        r12 = false;
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02e5, code lost:
    
        if (r22.LJI == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x02eb, code lost:
    
        if (r21.LJI == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x02ed, code lost:
    
        r40.LIZIZ(r2, r22, r49.LJ(), r55, r21, r1, r50.LJ(), 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0304, code lost:
    
        if (r42 == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0306, code lost:
    
        if (r44 == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x030c, code lost:
    
        if (r50.LJFF == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x030e, code lost:
    
        r4 = r50.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0316, code lost:
    
        if (r21 == r46) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0318, code lost:
    
        r40.LJFF(r46, r1, r4, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x031e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x031f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0321, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0256, code lost:
    
        if (r13 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ad, code lost:
    
        if (r41 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d1, code lost:
    
        if (r12 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025a, code lost:
    
        if (r14 == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void applyConstraints(X.C14Z r40, boolean r41, boolean r42, boolean r43, boolean r44, X.C270014e r45, X.C270014e r46, X.EnumC018105h r47, boolean r48, X.C017905f r49, X.C017905f r50, int r51, int r52, int r53, int r54, float r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60, int r61, int r62, int r63, int r64, float r65, boolean r66) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018205i.applyConstraints(X.14Z, boolean, boolean, boolean, boolean, X.14e, X.14e, X.05h, boolean, X.05f, X.05f, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }
}
