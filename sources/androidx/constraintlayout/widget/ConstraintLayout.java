package androidx.constraintlayout.widget;

import X.AbstractC019505v;
import X.AnonymousClass064;
import X.AnonymousClass065;
import X.AnonymousClass066;
import X.C018205i;
import X.C018905p;
import X.C019005q;
import X.C019105r;
import X.C019805y;
import X.C14Z;
import X.C1AC;
import X.C1AE;
import X.C1AG;
import X.C269614a;
import X.C40061hi;
import X.EnumC017805e;
import X.EnumC018105h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public SparseArray<View> mChildrenByIds;
    public ArrayList<AbstractC019505v> mConstraintHelpers;
    public C019805y mConstraintLayoutSpec;
    public AnonymousClass064 mConstraintSet;
    public int mConstraintSetId;
    public AnonymousClass066 mConstraintsChangedListener;
    public HashMap<String, Integer> mDesignIds;
    public boolean mDirtyHierarchy;
    public int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    public int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public C40061hi mLayoutWidget;
    public int mMaxHeight;
    public int mMaxWidth;
    public C1AG mMeasurer;
    public C269614a mMetrics;
    public int mMinHeight;
    public int mMinWidth;
    public int mOnMeasureHeightMeasureSpec;
    public int mOnMeasureWidthMeasureSpec;
    public int mOptimizationLevel;
    public SparseArray<C018205i> mTempMapIdToWidget;

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C018205i viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).mDebugName = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof AnonymousClass065)) {
                    this.mConstraintSet = ((AnonymousClass065) childAt2).getConstraintSet();
                }
            }
        }
        AnonymousClass064 anonymousClass064 = this.mConstraintSet;
        if (anonymousClass064 != null) {
            anonymousClass064.LIZJ(this);
        }
        this.mLayoutWidget.LIZ.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            int i4 = 0;
            do {
                ((AbstractC019505v) ListProtector.get(this.mConstraintHelpers, i4)).updatePreLayout(this);
                i4++;
            } while (i4 < size);
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C019105r) {
                C019105r c019105r = (C019105r) childAt3;
                if (c019105r.LJLIL == -1 && !c019105r.isInEditMode()) {
                    c019105r.setVisibility(c019105r.LJLJI);
                }
                View findViewById = findViewById(c019105r.LJLIL);
                c019105r.LJLILLLLZI = findViewById;
                if (findViewById != null) {
                    ((C018905p) findViewById.getLayoutParams()).isInPlaceholder = true;
                    c019105r.LJLILLLLZI.setVisibility(0);
                    c019105r.setVisibility(0);
                }
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C018205i viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                C018905p c018905p = (C018905p) childAt5.getLayoutParams();
                C40061hi c40061hi = this.mLayoutWidget;
                c40061hi.LIZ.add(viewWidget2);
                C018205i c018205i = viewWidget2.mParent;
                if (c018205i != null) {
                    ((C1AE) c018205i).LIZ.remove(viewWidget2);
                    viewWidget2.reset();
                }
                viewWidget2.mParent = c40061hi;
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, c018905p, this.mTempMapIdToWidget);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public C018905p generateDefaultLayoutParams() {
        return new C018905p(-2, -2);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.LJIIL;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                setChildrenConstraints();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public boolean isRtl() {
        if ((getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C40061hi();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1AG(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private final C018205i getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null) {
            view = findViewById(i);
            if (view != null) {
                if (view != this && view.getParent() == this) {
                    onViewAdded(view);
                }
            }
            return null;
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view != null) {
            return ((C018905p) view.getLayoutParams()).widget;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C018905p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC019505v> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            int i = 0;
            do {
                ((AbstractC019505v) ListProtector.get(this.mConstraintHelpers, i)).updatePreDraw(this);
                i++;
            } while (i < size);
        }
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas2);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = CastIntegerProtector.parseInt(split[0]);
                        int parseInt2 = CastIntegerProtector.parseInt(split[1]);
                        int parseInt3 = CastIntegerProtector.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        int parseInt4 = (int) ((CastIntegerProtector.parseInt(split[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas2.drawLine(f, f2, f3, f2, paint);
                        float f4 = i4 + parseInt4;
                        Canvas canvas3 = canvas2;
                        canvas3.drawLine(f3, f2, f3, f4, paint);
                        canvas3.drawLine(f3, f4, f, f4, paint);
                        canvas3.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas3.drawLine(f, f2, f3, f4, paint);
                        canvas2 = canvas3;
                        canvas2.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(C269614a c269614a) {
        this.mLayoutWidget.LJFF.getClass();
    }

    @Override // android.view.ViewGroup
    public C018905p generateLayoutParams(AttributeSet attributeSet) {
        return new C018905p(getContext(), attributeSet);
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final C018205i getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C018905p) view.getLayoutParams()).widget;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C019805y(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C018205i viewWidget = getViewWidget(view);
        if ((view instanceof C019005q) && !(viewWidget instanceof C1AC)) {
            C018905p c018905p = (C018905p) view.getLayoutParams();
            C1AC c1ac = new C1AC();
            c018905p.widget = c1ac;
            c018905p.isGuideline = true;
            c1ac.LJ(c018905p.orientation);
        }
        if (view instanceof AbstractC019505v) {
            AbstractC019505v abstractC019505v = (AbstractC019505v) view;
            abstractC019505v.validateParams();
            ((C018905p) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(abstractC019505v)) {
                this.mConstraintHelpers.add(abstractC019505v);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C018205i viewWidget = getViewWidget(view);
        this.mLayoutWidget.LIZ.remove(viewWidget);
        viewWidget.reset();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C019805y(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    public void setConstraintSet(AnonymousClass064 anonymousClass064) {
        this.mConstraintSet = anonymousClass064;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AnonymousClass066 anonymousClass066) {
        C019805y c019805y = this.mConstraintLayoutSpec;
        if (c019805y != null) {
            c019805y.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        C40061hi c40061hi = this.mLayoutWidget;
        c40061hi.LJIIL = i;
        C14Z.LJIILL = c40061hi.LJIIJJI(512);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C018905p(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C40061hi();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1AG(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public Object getDesignInformation(int i, Object obj) {
        HashMap<String, Integer> hashMap;
        if (i == 0 && (obj instanceof String) && (hashMap = this.mDesignIds) != null && hashMap.containsKey(obj)) {
            return this.mDesignIds.get(obj);
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i3++;
            }
        }
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (i4 == i && this.mOnMeasureHeightMeasureSpec == i2) {
                int width = this.mLayoutWidget.getWidth();
                int height = this.mLayoutWidget.getHeight();
                C40061hi c40061hi = this.mLayoutWidget;
                resolveMeasuredDimension(i, i2, width, height, c40061hi.LJIILIIL, c40061hi.LJIILJJIL);
                return;
            }
            if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.getHeight()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                int width2 = this.mLayoutWidget.getWidth();
                int height2 = this.mLayoutWidget.getHeight();
                C40061hi c40061hi2 = this.mLayoutWidget;
                resolveMeasuredDimension(i, i2, width2, height2, c40061hi2.LJIILIIL, c40061hi2.LJIILJJIL);
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.LJ = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                C40061hi c40061hi3 = this.mLayoutWidget;
                c40061hi3.LIZIZ.LIZJ(c40061hi3);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int width3 = this.mLayoutWidget.getWidth();
        int height3 = this.mLayoutWidget.getHeight();
        C40061hi c40061hi4 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, width3, height3, c40061hi4.LJIILIIL, c40061hi4.LJIILJJIL);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C40061hi();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1AG(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        C40061hi c40061hi = this.mLayoutWidget;
        c40061hi.mCompanionWidget = this;
        C1AG c1ag = this.mMeasurer;
        c40061hi.LIZLLL = c1ag;
        c40061hi.LIZJ.LJFF = c1ag;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.elevation, com.zhiliaoapp.musically.R.attr.xw, com.zhiliaoapp.musically.R.attr.xx, com.zhiliaoapp.musically.R.attr.xy, com.zhiliaoapp.musically.R.attr.a1p, com.zhiliaoapp.musically.R.attr.a6s, com.zhiliaoapp.musically.R.attr.a6v, com.zhiliaoapp.musically.R.attr.a6w, com.zhiliaoapp.musically.R.attr.adm, com.zhiliaoapp.musically.R.attr.adn, com.zhiliaoapp.musically.R.attr.ado, com.zhiliaoapp.musically.R.attr.adp, com.zhiliaoapp.musically.R.attr.adq, com.zhiliaoapp.musically.R.attr.adr, com.zhiliaoapp.musically.R.attr.ads, com.zhiliaoapp.musically.R.attr.adt, com.zhiliaoapp.musically.R.attr.adu, com.zhiliaoapp.musically.R.attr.adv, com.zhiliaoapp.musically.R.attr.adw, com.zhiliaoapp.musically.R.attr.adx, com.zhiliaoapp.musically.R.attr.ady, com.zhiliaoapp.musically.R.attr.ae0, com.zhiliaoapp.musically.R.attr.ae1, com.zhiliaoapp.musically.R.attr.ae2, com.zhiliaoapp.musically.R.attr.ae3, com.zhiliaoapp.musically.R.attr.ae4, com.zhiliaoapp.musically.R.attr.akw, com.zhiliaoapp.musically.R.attr.alr, com.zhiliaoapp.musically.R.attr.als, com.zhiliaoapp.musically.R.attr.alt, com.zhiliaoapp.musically.R.attr.alu, com.zhiliaoapp.musically.R.attr.alv, com.zhiliaoapp.musically.R.attr.alw, com.zhiliaoapp.musically.R.attr.alx, com.zhiliaoapp.musically.R.attr.aly, com.zhiliaoapp.musically.R.attr.alz, com.zhiliaoapp.musically.R.attr.am0, com.zhiliaoapp.musically.R.attr.am1, com.zhiliaoapp.musically.R.attr.am2, com.zhiliaoapp.musically.R.attr.am3, com.zhiliaoapp.musically.R.attr.am4, com.zhiliaoapp.musically.R.attr.am5, com.zhiliaoapp.musically.R.attr.am6, com.zhiliaoapp.musically.R.attr.am7, com.zhiliaoapp.musically.R.attr.am8, com.zhiliaoapp.musically.R.attr.am9, com.zhiliaoapp.musically.R.attr.am_, com.zhiliaoapp.musically.R.attr.ama, com.zhiliaoapp.musically.R.attr.amb, com.zhiliaoapp.musically.R.attr.amc, com.zhiliaoapp.musically.R.attr.amd, com.zhiliaoapp.musically.R.attr.ame, com.zhiliaoapp.musically.R.attr.amf, com.zhiliaoapp.musically.R.attr.amg, com.zhiliaoapp.musically.R.attr.amh, com.zhiliaoapp.musically.R.attr.ami, com.zhiliaoapp.musically.R.attr.amj, com.zhiliaoapp.musically.R.attr.amk, com.zhiliaoapp.musically.R.attr.aml, com.zhiliaoapp.musically.R.attr.amm, com.zhiliaoapp.musically.R.attr.amn, com.zhiliaoapp.musically.R.attr.amo, com.zhiliaoapp.musically.R.attr.amp, com.zhiliaoapp.musically.R.attr.amq, com.zhiliaoapp.musically.R.attr.amr, com.zhiliaoapp.musically.R.attr.ams, com.zhiliaoapp.musically.R.attr.amt, com.zhiliaoapp.musically.R.attr.amu, com.zhiliaoapp.musically.R.attr.amv, com.zhiliaoapp.musically.R.attr.amx, com.zhiliaoapp.musically.R.attr.amy, com.zhiliaoapp.musically.R.attr.an2, com.zhiliaoapp.musically.R.attr.an3, com.zhiliaoapp.musically.R.attr.an4, com.zhiliaoapp.musically.R.attr.an5, com.zhiliaoapp.musically.R.attr.an6, com.zhiliaoapp.musically.R.attr.an7, com.zhiliaoapp.musically.R.attr.ang}, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 10) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 7) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 8) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 90) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 39) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                        this.mConstraintSet = anonymousClass064;
                        anonymousClass064.LJIILLIIL(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        C40061hi c40061hi2 = this.mLayoutWidget;
        c40061hi2.LJIIL = this.mOptimizationLevel;
        C14Z.LJIILL = c40061hi2.LJIIJJI(512);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setState(int i, int i2, int i3) {
        C019805y c019805y = this.mConstraintLayoutSpec;
        if (c019805y != null) {
            c019805y.LIZIZ(i2, i3, i);
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C40061hi();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1AG(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0428, code lost:
    
        if (r12 != r11) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x065a, code lost:
    
        if (r17 != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x01f4, code lost:
    
        if (r4 != X.EnumC018105h.WRAP_CONTENT) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x01f6, code lost:
    
        r13.LIZ.setVerticalDimensionBehaviour(X.EnumC018105h.FIXED);
        r1 = r13.LIZ;
        r1.setHeight(r13.LIZLLL(r1, 1));
        r2 = r13.LIZ;
        r2.verticalRun.LJ.LIZLLL(r2.getHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x01f0, code lost:
    
        if (r15 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0053, code lost:
    
        if (isRtl() != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resolveSystem(X.C40061hi r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.resolveSystem(X.1hi, int, int, int):void");
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, C018205i c018205i, C018905p c018905p, SparseArray<C018205i> sparseArray) {
        C018205i c018205i2;
        C018205i c018205i3;
        C018205i c018205i4;
        C018205i c018205i5;
        int i;
        C018205i c018205i6 = c018205i;
        c018905p.validate();
        c018905p.helped = false;
        c018205i6.mVisibility = view.getVisibility();
        if (c018905p.isInPlaceholder) {
            c018205i6.inPlaceholder = true;
            c018205i6.mVisibility = 8;
        }
        c018205i6.mCompanionWidget = view;
        if (view instanceof AbstractC019505v) {
            ((AbstractC019505v) view).resolveRtl(c018205i6, this.mLayoutWidget.LJ);
        }
        if (c018905p.isGuideline) {
            C1AC c1ac = (C1AC) c018205i6;
            int i2 = c018905p.resolvedGuideBegin;
            int i3 = c018905p.resolvedGuideEnd;
            float f = c018905p.resolvedGuidePercent;
            if (f != -1.0f) {
                if (f > -1.0f) {
                    c1ac.LIZ = f;
                    c1ac.LIZIZ = -1;
                    c1ac.LIZJ = -1;
                    return;
                }
                return;
            }
            if (i2 != -1) {
                if (i2 <= -1) {
                    return;
                }
                c1ac.LIZ = -1.0f;
                c1ac.LIZIZ = i2;
                c1ac.LIZJ = -1;
                return;
            }
            if (i3 == -1 || i3 <= -1) {
                return;
            }
            c1ac.LIZ = -1.0f;
            c1ac.LIZIZ = -1;
            c1ac.LIZJ = i3;
            return;
        }
        int i4 = c018905p.resolvedLeftToLeft;
        int i5 = c018905p.resolvedLeftToRight;
        int i6 = c018905p.resolvedRightToLeft;
        int i7 = c018905p.resolvedRightToRight;
        int i8 = c018905p.resolveGoneLeftMargin;
        int i9 = c018905p.resolveGoneRightMargin;
        float f2 = c018905p.resolvedHorizontalBias;
        int i10 = c018905p.circleConstraint;
        if (i10 != -1) {
            C018205i c018205i7 = sparseArray.get(i10);
            if (c018205i7 != null) {
                c018205i6.connectCircularConstraint(c018205i7, c018905p.circleAngle, c018905p.circleRadius);
            }
        } else {
            if (i4 != -1) {
                C018205i c018205i8 = sparseArray.get(i4);
                if (c018205i8 != null) {
                    EnumC017805e enumC017805e = EnumC017805e.LEFT;
                    c018205i6.immediateConnect(enumC017805e, c018205i8, enumC017805e, ((ViewGroup.MarginLayoutParams) c018905p).leftMargin, i8);
                }
            } else if (i5 != -1 && (c018205i2 = sparseArray.get(i5)) != null) {
                c018205i6.immediateConnect(EnumC017805e.LEFT, c018205i2, EnumC017805e.RIGHT, ((ViewGroup.MarginLayoutParams) c018905p).leftMargin, i8);
            }
            if (i6 != -1) {
                C018205i c018205i9 = sparseArray.get(i6);
                if (c018205i9 != null) {
                    c018205i6 = c018205i6;
                    c018205i6.immediateConnect(EnumC017805e.RIGHT, c018205i9, EnumC017805e.LEFT, ((ViewGroup.MarginLayoutParams) c018905p).rightMargin, i9);
                }
            } else if (i7 != -1 && (c018205i3 = sparseArray.get(i7)) != null) {
                EnumC017805e enumC017805e2 = EnumC017805e.RIGHT;
                c018205i6 = c018205i6;
                c018205i6.immediateConnect(enumC017805e2, c018205i3, enumC017805e2, ((ViewGroup.MarginLayoutParams) c018905p).rightMargin, i9);
            }
            int i11 = c018905p.topToTop;
            if (i11 != -1) {
                C018205i c018205i10 = sparseArray.get(i11);
                if (c018205i10 != null) {
                    EnumC017805e enumC017805e3 = EnumC017805e.TOP;
                    c018205i6.immediateConnect(enumC017805e3, c018205i10, enumC017805e3, ((ViewGroup.MarginLayoutParams) c018905p).topMargin, c018905p.goneTopMargin);
                }
            } else {
                int i12 = c018905p.topToBottom;
                if (i12 != -1 && (c018205i4 = sparseArray.get(i12)) != null) {
                    c018205i6.immediateConnect(EnumC017805e.TOP, c018205i4, EnumC017805e.BOTTOM, ((ViewGroup.MarginLayoutParams) c018905p).topMargin, c018905p.goneTopMargin);
                }
            }
            int i13 = c018905p.bottomToTop;
            if (i13 != -1) {
                C018205i c018205i11 = sparseArray.get(i13);
                if (c018205i11 != null) {
                    c018205i6.immediateConnect(EnumC017805e.BOTTOM, c018205i11, EnumC017805e.TOP, ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin, c018905p.goneBottomMargin);
                }
            } else {
                int i14 = c018905p.bottomToBottom;
                if (i14 != -1 && (c018205i5 = sparseArray.get(i14)) != null) {
                    EnumC017805e enumC017805e4 = EnumC017805e.BOTTOM;
                    c018205i6.immediateConnect(enumC017805e4, c018205i5, enumC017805e4, ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin, c018905p.goneBottomMargin);
                }
            }
            int i15 = c018905p.baselineToBaseline;
            if (i15 != -1) {
                View view2 = this.mChildrenByIds.get(i15);
                C018205i c018205i12 = sparseArray.get(c018905p.baselineToBaseline);
                if (c018205i12 != null && view2 != null && (view2.getLayoutParams() instanceof C018905p)) {
                    C018905p c018905p2 = (C018905p) view2.getLayoutParams();
                    c018905p.needsBaseline = true;
                    c018905p2.needsBaseline = true;
                    EnumC017805e enumC017805e5 = EnumC017805e.BASELINE;
                    c018205i6.getAnchor(enumC017805e5).LIZIZ(c018205i12.getAnchor(enumC017805e5), 0, -1, true);
                    c018205i6.hasBaseline = true;
                    c018905p2.widget.hasBaseline = true;
                    c018205i6.getAnchor(EnumC017805e.TOP).LJIIIZ();
                    c018205i6.getAnchor(EnumC017805e.BOTTOM).LJIIIZ();
                }
            }
            if (f2 >= 0.0f) {
                c018205i6.mHorizontalBiasPercent = f2;
            }
            float f3 = c018905p.verticalBias;
            if (f3 >= 0.0f) {
                c018205i6.mVerticalBiasPercent = f3;
            }
        }
        if (z && ((i = c018905p.editorAbsoluteX) != -1 || c018905p.editorAbsoluteY != -1)) {
            c018205i6.setOrigin(i, c018905p.editorAbsoluteY);
        }
        if (!c018905p.horizontalDimensionFixed) {
            if (((ViewGroup.MarginLayoutParams) c018905p).width == -1) {
                if (c018905p.constrainedWidth) {
                    c018205i6.setHorizontalDimensionBehaviour(EnumC018105h.MATCH_CONSTRAINT);
                } else {
                    c018205i6.setHorizontalDimensionBehaviour(EnumC018105h.MATCH_PARENT);
                }
                c018205i6.getAnchor(EnumC017805e.LEFT).LJI = ((ViewGroup.MarginLayoutParams) c018905p).leftMargin;
                c018205i6.getAnchor(EnumC017805e.RIGHT).LJI = ((ViewGroup.MarginLayoutParams) c018905p).rightMargin;
            } else {
                c018205i6.setHorizontalDimensionBehaviour(EnumC018105h.MATCH_CONSTRAINT);
                c018205i6.setWidth(0);
            }
        } else {
            c018205i6.setHorizontalDimensionBehaviour(EnumC018105h.FIXED);
            c018205i6.setWidth(((ViewGroup.MarginLayoutParams) c018905p).width);
            if (((ViewGroup.MarginLayoutParams) c018905p).width == -2) {
                c018205i6.setHorizontalDimensionBehaviour(EnumC018105h.WRAP_CONTENT);
            }
        }
        if (!c018905p.verticalDimensionFixed) {
            if (((ViewGroup.MarginLayoutParams) c018905p).height == -1) {
                if (c018905p.constrainedHeight) {
                    c018205i6.setVerticalDimensionBehaviour(EnumC018105h.MATCH_CONSTRAINT);
                } else {
                    c018205i6.setVerticalDimensionBehaviour(EnumC018105h.MATCH_PARENT);
                }
                c018205i6.getAnchor(EnumC017805e.TOP).LJI = ((ViewGroup.MarginLayoutParams) c018905p).topMargin;
                c018205i6.getAnchor(EnumC017805e.BOTTOM).LJI = ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin;
            } else {
                c018205i6.setVerticalDimensionBehaviour(EnumC018105h.MATCH_CONSTRAINT);
                c018205i6.setHeight(0);
            }
        } else {
            c018205i6.setVerticalDimensionBehaviour(EnumC018105h.FIXED);
            c018205i6.setHeight(((ViewGroup.MarginLayoutParams) c018905p).height);
            if (((ViewGroup.MarginLayoutParams) c018905p).height == -2) {
                c018205i6.setVerticalDimensionBehaviour(EnumC018105h.WRAP_CONTENT);
            }
        }
        c018205i6.setDimensionRatio(c018905p.dimensionRatio);
        c018205i6.setHorizontalWeight(c018905p.horizontalWeight);
        c018205i6.setVerticalWeight(c018905p.verticalWeight);
        c018205i6.mHorizontalChainStyle = c018905p.horizontalChainStyle;
        c018205i6.mVerticalChainStyle = c018905p.verticalChainStyle;
        c018205i6.setHorizontalMatchStyle(c018905p.matchConstraintDefaultWidth, c018905p.matchConstraintMinWidth, c018905p.matchConstraintMaxWidth, c018905p.matchConstraintPercentWidth);
        c018205i6.setVerticalMatchStyle(c018905p.matchConstraintDefaultHeight, c018905p.matchConstraintMinHeight, c018905p.matchConstraintMaxHeight, c018905p.matchConstraintPercentHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C018905p c018905p = (C018905p) childAt.getLayoutParams();
            C018205i c018205i = c018905p.widget;
            if ((childAt.getVisibility() != 8 || c018905p.isGuideline || c018905p.isHelper || c018905p.isVirtualGroup || isInEditMode) && !c018905p.isInPlaceholder) {
                int x = c018205i.getX();
                int y = c018205i.getY();
                int width = c018205i.getWidth() + x;
                int height = c018205i.getHeight() + y;
                childAt.layout(x, y, width, height);
                if ((childAt instanceof C019105r) && (content = ((C019105r) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x, y, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size <= 0) {
            return;
        }
        do {
            ((AbstractC019505v) ListProtector.get(this.mConstraintHelpers, i5)).updatePostLayout(this);
            i5++;
        } while (i5 < size);
    }

    public void setSelfDimensionBehaviour(C40061hi c40061hi, int i, int i2, int i3, int i4) {
        EnumC018105h enumC018105h;
        C1AG c1ag = this.mMeasurer;
        int i5 = c1ag.LJ;
        int i6 = c1ag.LIZLLL;
        EnumC018105h enumC018105h2 = EnumC018105h.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i != 1073741824) {
                    enumC018105h = enumC018105h2;
                    i2 = 0;
                } else {
                    i2 = Math.min(this.mMaxWidth - i6, i2);
                    enumC018105h = enumC018105h2;
                }
            } else {
                enumC018105h = EnumC018105h.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
                i2 = 0;
            }
        } else {
            enumC018105h = EnumC018105h.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 != 0) {
                if (i3 == 1073741824) {
                    i4 = Math.min(this.mMaxHeight - i5, i4);
                }
                i4 = 0;
            } else {
                enumC018105h2 = EnumC018105h.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
                i4 = 0;
            }
        } else {
            enumC018105h2 = EnumC018105h.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (i2 != c40061hi.getWidth() || i4 != c40061hi.getHeight()) {
            c40061hi.LIZJ.LIZJ = true;
        }
        c40061hi.mX = 0;
        c40061hi.mY = 0;
        c40061hi.setMaxWidth(this.mMaxWidth - i6);
        c40061hi.setMaxHeight(this.mMaxHeight - i5);
        c40061hi.setMinWidth(0);
        c40061hi.setMinHeight(0);
        c40061hi.setHorizontalDimensionBehaviour(enumC018105h);
        c40061hi.setWidth(i2);
        c40061hi.setVerticalDimensionBehaviour(enumC018105h2);
        c40061hi.setHeight(i4);
        c40061hi.setMinWidth(this.mMinWidth - i6);
        c40061hi.setMinHeight(this.mMinHeight - i5);
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C1AG c1ag = this.mMeasurer;
        int i5 = c1ag.LJ;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + c1ag.LIZLLL, i, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }
}
