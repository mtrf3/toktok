package com.google.android.material.bottomsheet;

import X.AbstractC26257ASf;
import X.AbstractC270614k;
import X.C06C;
import X.C06F;
import X.C16300kU;
import X.C16330kX;
import X.C16360ka;
import X.C16880lQ;
import X.C17720mm;
import X.C1I1;
import X.C270714l;
import X.C45621qg;
import X.C80250VeY;
import X.C80253Veb;
import X.C80285Vf7;
import X.C80416VhE;
import X.C80418VhG;
import X.C80452Vho;
import X.C80453Vhp;
import X.C80454Vhq;
import X.C80456Vhs;
import X.InterfaceC17830mx;
import X.KMP;
import X.RunnableC80455Vhr;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o3.h0;

/* loaded from: classes15.dex */
public class BottomSheetBehavior<V extends View> extends C06C<V> {
    public static final int DEF_STYLE_RES = 2131886965;
    public int activePointerId;
    public final ArrayList<AbstractC26257ASf> callbacks;
    public int childHeight;
    public int collapsedOffset;
    public final AbstractC270614k dragCallback;
    public boolean draggable;
    public float elevation;
    public int expandHalfwayActionId;
    public int expandedOffset;
    public boolean fitToContents;
    public int fitToContentsOffset;
    public int gestureInsetBottom;
    public boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public float halfExpandedRatio;
    public boolean hideable;
    public boolean ignoreEvents;
    public Map<View, Integer> importantForAccessibilityMap;
    public int initialY;
    public ValueAnimator interpolatorAnimator;
    public boolean isShapeExpanded;
    public int lastNestedScrollDy;
    public C80418VhG materialShapeDrawable;
    public float maximumVelocity;
    public boolean nestedScrolled;
    public WeakReference<View> nestedScrollingChildRef;
    public int parentHeight;
    public int parentWidth;
    public int peekHeight;
    public boolean peekHeightAuto;
    public int peekHeightGestureInsetBuffer;
    public int peekHeightMin;
    public int saveFlags;
    public BottomSheetBehavior<V>.g settleRunnable;
    public C80416VhE shapeAppearanceModelDefault;
    public boolean shapeThemingEnabled;
    public boolean skipCollapsed;
    public int state;
    public boolean touchingScrollingChild;
    public boolean updateImportantForAccessibilityOnSiblings;
    public VelocityTracker velocityTracker;
    public C270714l viewDragHelper;
    public WeakReference<V> viewRef;

    /* loaded from: classes15.dex */
    public class g implements Runnable {
        public final View LJLIL;
        public boolean LJLILLLLZI;
        public int LJLJI;

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                C270714l c270714l = BottomSheetBehavior.this.viewDragHelper;
                if (c270714l != null && c270714l.LJIIIIZZ()) {
                    C16300kU.LJIIL(this.LJLIL, this);
                } else {
                    BottomSheetBehavior.this.setStateInternal(this.LJLJI);
                }
                this.LJLILLLLZI = false;
            } finally {
                if (LIZ) {
                }
            }
        }

        public g(View view, int i) {
            this.LJLIL = view;
            this.LJLJI = i;
        }
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new C80453Vhp(this));
    }

    private float getYVelocity() {
        return com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_getYVelocity(this);
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    @Override // X.C06C
    public void onNestedScroll(C45621qg c45621qg, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // X.C06C
    public boolean onTouchEvent(C45621qg c45621qg, View view, MotionEvent motionEvent) {
        return com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onTouchEvent(this, c45621qg, view, motionEvent);
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private int calculatePeekHeight() {
        int i;
        if (this.peekHeightAuto) {
            return Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight);
        }
        if (!this.gestureInsetBottomIgnored && (i = this.gestureInsetBottom) > 0) {
            return Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
        }
        return this.peekHeight;
    }

    private void updateAccessibilityActions() {
        V v;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        h0.LJIILL(524288, v);
        h0.LJIIJ(0, v);
        h0.LJIILL(262144, v);
        h0.LJIIJ(0, v);
        h0.LJIILL(1048576, v);
        h0.LJIIJ(0, v);
        int i = this.expandHalfwayActionId;
        if (i != -1) {
            h0.LJIILL(i, v);
            h0.LJIIJ(0, v);
        }
        int i2 = 6;
        if (this.state != 6) {
            this.expandHalfwayActionId = addAccessibilityActionForState(v, R.string.cdv, 6);
        }
        if (this.hideable && this.state != 5) {
            replaceAccessibilityActionForState(v, C17720mm.LJIILIIL, 5);
        }
        int i3 = this.state;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 6) {
                    return;
                }
                replaceAccessibilityActionForState(v, C17720mm.LJIIL, 4);
                replaceAccessibilityActionForState(v, C17720mm.LJIIJJI, 3);
                return;
            }
            if (this.fitToContents) {
                i2 = 3;
            }
            replaceAccessibilityActionForState(v, C17720mm.LJIIJJI, i2);
            return;
        }
        if (this.fitToContents) {
            i2 = 4;
        }
        replaceAccessibilityActionForState(v, C17720mm.LJIIL, i2);
    }

    public float com_google_android_material_bottomsheet_BottomSheetBehavior__getYVelocity$___twin___() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return this.expandedOffset;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public BottomSheetBehavior() {
        this.fitToContents = true;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new C80452Vho(this);
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    @Override // X.C06C
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public static float com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_getYVelocity(BottomSheetBehavior bottomSheetBehavior) {
        try {
            return bottomSheetBehavior.com_google_android_material_bottomsheet_BottomSheetBehavior__getYVelocity$___twin___();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return 0.0f;
        }
    }

    private InterfaceC17830mx createAccessibilityViewCommandForState(int i) {
        return new C80456Vhs(this, i);
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C06F) {
            C06C c06c = ((C06F) layoutParams).LIZ;
            if (c06c instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) c06c;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void restoreOptionalState(SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.LJLILLLLZI;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.LJLJI;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.LJLJJI;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.LJLJJL;
        }
    }

    private void setSystemGestureInsets(View view) {
        if (Build.VERSION.SDK_INT >= 29 && !isGestureInsetBottomIgnored() && !this.peekHeightAuto) {
            C80250VeY.LIZ(view, new C80253Veb(this));
        }
    }

    private void settleToStatePendingLayout(int i) {
        V v = this.viewRef.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C16330kX.LIZIZ(v)) {
            v.post(new RunnableC80455Vhr(this, v, i));
        } else {
            settleToState(v, i);
        }
    }

    private void updateDrawableForTargetState(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i == 2) {
            return;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (this.isShapeExpanded != z) {
            this.isShapeExpanded = z;
            if (this.materialShapeDrawable != null && (valueAnimator = this.interpolatorAnimator) != null) {
                if (valueAnimator.isRunning()) {
                    this.interpolatorAnimator.reverse();
                    return;
                }
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                this.interpolatorAnimator.setFloatValues(1.0f - f, f);
                this.interpolatorAnimator.start();
            }
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof C45621qg)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        if (z) {
            if (this.importantForAccessibilityMap == null) {
                this.importantForAccessibilityMap = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this.viewRef.get()) {
                if (z) {
                    this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.updateImportantForAccessibilityOnSiblings) {
                        C16300kU.LJIJ(childAt, 4);
                    }
                } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                    C16300kU.LJIJ(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                }
            }
        }
        if (!z) {
            this.importantForAccessibilityMap = null;
        } else {
            if (!this.updateImportantForAccessibilityOnSiblings) {
                return;
            }
            this.viewRef.get().sendAccessibilityEvent(8);
        }
    }

    public void addBottomSheetCallback(AbstractC26257ASf abstractC26257ASf) {
        if (!this.callbacks.contains(abstractC26257ASf)) {
            this.callbacks.add(abstractC26257ASf);
        }
    }

    public void dispatchOnSlide(int i) {
        float f;
        float f2;
        V v = this.viewRef.get();
        if (v != null && !this.callbacks.isEmpty()) {
            int i2 = this.collapsedOffset;
            if (i > i2 || i2 == getExpandedOffset()) {
                int i3 = this.collapsedOffset;
                f = i3 - i;
                f2 = this.parentHeight - i3;
            } else {
                int i4 = this.collapsedOffset;
                f = i4 - i;
                f2 = i4 - getExpandedOffset();
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.callbacks.size(); i5++) {
                ((AbstractC26257ASf) ListProtector.get(this.callbacks, i5)).LIZ(v, f3);
            }
        }
    }

    public View findScrollingChild(View view) {
        if (C16360ka.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.C06C
    public void onAttachedToLayoutParams(C06F c06f) {
        super.onAttachedToLayoutParams(c06f);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    public void removeBottomSheetCallback(AbstractC26257ASf abstractC26257ASf) {
        this.callbacks.remove(abstractC26257ASf);
    }

    public void setBottomSheetCallback(AbstractC26257ASf abstractC26257ASf) {
        this.callbacks.clear();
        if (abstractC26257ASf != null) {
            this.callbacks.add(abstractC26257ASf);
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setExpandedOffset(int i) {
        if (i >= 0) {
            this.expandedOffset = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void setFitToContents(boolean z) {
        int i;
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        if (this.fitToContents && this.state == 6) {
            i = 3;
        } else {
            i = this.state;
        }
        setStateInternal(i);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.halfExpandedRatio = f;
            if (this.viewRef != null) {
                calculateHalfExpandedOffset();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        if (i == this.state) {
            return;
        }
        if (this.viewRef == null) {
            if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
                this.state = i;
                return;
            }
            return;
        }
        settleToStatePendingLayout(i);
    }

    public void setStateInternal(int i) {
        V v;
        if (this.state == i) {
            return;
        }
        this.state = i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            ((AbstractC26257ASf) ListProtector.get(this.callbacks, i2)).LIZIZ(i, v);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    public void updatePeekHeight(boolean z) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state == 4 && (v = this.viewRef.get()) != null) {
                if (z) {
                    settleToStatePendingLayout(this.state);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80454Vhq();
        public final int LJLIL;
        public final int LJLILLLLZI;
        public final boolean LJLJI;
        public final boolean LJLJJI;
        public final boolean LJLJJL;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            boolean z2;
            this.LJLIL = parcel.readInt();
            this.LJLILLLLZI = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJI = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLJJI = z2;
            this.LJLJJL = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LJLIL);
            parcel.writeInt(this.LJLILLLLZI);
            parcel.writeInt(this.LJLJI ? 1 : 0);
            parcel.writeInt(this.LJLJJI ? 1 : 0);
            parcel.writeInt(this.LJLJJL ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.LJLIL = bottomSheetBehavior.state;
            this.LJLILLLLZI = bottomSheetBehavior.peekHeight;
            this.LJLJI = bottomSheetBehavior.fitToContents;
            this.LJLJJI = bottomSheetBehavior.hideable;
            this.LJLJJL = bottomSheetBehavior.skipCollapsed;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.fitToContents = true;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new C80452Vho(this);
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.a2t);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.elevation, R.attr.xk, R.attr.yc, R.attr.yd, R.attr.ye, R.attr.yf, R.attr.yg, R.attr.yj, R.attr.yk, R.attr.yl, R.attr.af0, R.attr.ba5, R.attr.ba8});
        this.shapeThemingEnabled = obtainStyledAttributes.hasValue(11);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            createMaterialShapeDrawable(context, attributeSet, hasValue, C80285Vf7.LIZ(context, obtainStyledAttributes, 1));
        } else {
            createMaterialShapeDrawable(context, attributeSet, hasValue);
        }
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(6, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(10, false));
        setFitToContents(obtainStyledAttributes.getBoolean(4, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(9, false));
        setDraggable(obtainStyledAttributes.getBoolean(2, true));
        setSaveFlags(obtainStyledAttributes.getInt(8, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(5, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        }
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // X.C06C
    public Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return new SavedState(super.onSaveInstanceState(c45621qg, v), (BottomSheetBehavior<?>) this);
    }

    public final void setPeekHeight(int i, boolean z) {
        if (i == -1) {
            if (!this.peekHeightAuto) {
                this.peekHeightAuto = true;
            } else {
                return;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        updatePeekHeight(z);
    }

    public void settleToState(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.collapsedOffset;
        } else if (i == 6) {
            i2 = this.halfExpandedOffset;
            if (this.fitToContents && i2 <= (i3 = this.fitToContentsOffset)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = getExpandedOffset();
        } else if (this.hideable && i == 5) {
            i2 = this.parentHeight;
        } else {
            throw new IllegalArgumentException(KMP.LJ("Illegal state argument: ", i));
        }
        startSettlingAnimation(view, i, i2, false);
    }

    public boolean shouldHide(View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        if (Math.abs(((f * 0.1f) + view.getTop()) - this.collapsedOffset) / calculatePeekHeight() > 0.5f) {
            return true;
        }
        return false;
    }

    private int addAccessibilityActionForState(V v, int i, int i2) {
        int i3;
        boolean z;
        String string = v.getResources().getString(i);
        InterfaceC17830mx createAccessibilityViewCommandForState = createAccessibilityViewCommandForState(i2);
        List<C17720mm> LJI = h0.LJI(v);
        int i4 = 0;
        while (true) {
            if (i4 < LJI.size()) {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C17720mm) ListProtector.get(LJI, i4)).LIZ).getLabel())) {
                    i3 = ((C17720mm) ListProtector.get(LJI, i4)).LIZ();
                    break;
                }
                i4++;
            } else {
                i3 = -1;
                int i5 = 0;
                while (true) {
                    int[] iArr = h0.LJFF;
                    if (i5 >= iArr.length || i3 != -1) {
                        break;
                    }
                    int i6 = iArr[i5];
                    boolean z2 = true;
                    for (int i7 = 0; i7 < LJI.size(); i7++) {
                        if (((C17720mm) ListProtector.get(LJI, i7)).LIZ() != i6) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        i3 = i6;
                    }
                    i5++;
                }
            }
        }
        if (i3 != -1) {
            C17720mm c17720mm = new C17720mm(null, i3, string, createAccessibilityViewCommandForState, null);
            h0.LIZLLL(v);
            h0.LJIILL(c17720mm.LIZ(), v);
            h0.LJI(v).add(c17720mm);
            h0.LJIIJ(0, v);
        }
        return i3;
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z) {
        createMaterialShapeDrawable(context, attributeSet, z, null);
    }

    private void replaceAccessibilityActionForState(V v, C17720mm c17720mm, int i) {
        h0.LJIILLIIL(v, c17720mm, null, createAccessibilityViewCommandForState(i));
    }

    public boolean com_google_android_material_bottomsheet_BottomSheetBehavior__onTouchEvent$___twin___(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        C270714l c270714l = this.viewDragHelper;
        if (c270714l != null) {
            c270714l.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (this.viewDragHelper != null && actionMasked == 2 && !this.ignoreEvents) {
            float LIZIZ = C1I1.LIZIZ(motionEvent, this.initialY);
            C270714l c270714l2 = this.viewDragHelper;
            if (LIZIZ > c270714l2.LIZIZ) {
                c270714l2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.ignoreEvents;
    }

    @Override // X.C06C
    public boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        boolean z;
        WeakReference<View> weakReference;
        View view;
        C270714l c270714l;
        if (!v.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.touchingScrollingChild = false;
                this.activePointerId = -1;
                if (this.ignoreEvents) {
                    this.ignoreEvents = false;
                    return false;
                }
            }
        } else {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2 && (weakReference = this.nestedScrollingChildRef) != null && (view = weakReference.get()) != null && c45621qg.LJII(x, this.initialY, view)) {
                this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.touchingScrollingChild = true;
            }
            if (this.activePointerId == -1 && !c45621qg.LJII(x, this.initialY, v)) {
                z = true;
            } else {
                z = false;
            }
            this.ignoreEvents = z;
        }
        if (!this.ignoreEvents && (c270714l = this.viewDragHelper) != null && c270714l.LJIJJ(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || c45621qg.LJII((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.viewDragHelper == null || C1I1.LIZIZ(motionEvent, this.initialY) <= this.viewDragHelper.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        boolean z;
        float f;
        C80418VhG c80418VhG;
        if (C16300kU.LIZIZ(c45621qg) && !C16300kU.LIZIZ(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = c45621qg.getResources().getDimensionPixelSize(R.dimen.m6);
            setSystemGestureInsets(v);
            this.viewRef = new WeakReference<>(v);
            if (this.shapeThemingEnabled && (c80418VhG = this.materialShapeDrawable) != null) {
                C16300kU.LJIILLIIL(v, c80418VhG);
            }
            C80418VhG c80418VhG2 = this.materialShapeDrawable;
            if (c80418VhG2 != null) {
                float f2 = this.elevation;
                if (f2 == -1.0f) {
                    f2 = C16360ka.LJIIIIZZ(v);
                }
                c80418VhG2.LJIIJ(f2);
                if (this.state == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.isShapeExpanded = z;
                C80418VhG c80418VhG3 = this.materialShapeDrawable;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                c80418VhG3.LJIIL(f);
            }
            updateAccessibilityActions();
            if (C16300kU.LIZJ(v) == 0) {
                C16300kU.LJIJ(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = C270714l.LJIIIZ(c45621qg, this.dragCallback);
        }
        int top = v.getTop();
        c45621qg.LJIIJ(i, v);
        this.parentWidth = c45621qg.getWidth();
        this.parentHeight = c45621qg.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        this.fitToContentsOffset = Math.max(0, this.parentHeight - height);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i2 = this.state;
        if (i2 == 3) {
            h0.LJIIL(getExpandedOffset(), v);
        } else if (i2 == 6) {
            h0.LJIIL(this.halfExpandedOffset, v);
        } else if (this.hideable && i2 == 5) {
            h0.LJIIL(this.parentHeight, v);
        } else if (i2 == 4) {
            h0.LJIIL(this.collapsedOffset, v);
        } else if (i2 == 1 || i2 == 2) {
            h0.LJIIL(top - v.getTop(), v);
        }
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C06C
    public void onRestoreInstanceState(C45621qg c45621qg, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c45621qg, v, savedState.mSuperState);
        restoreOptionalState(savedState);
        int i = savedState.LJLIL;
        if (i == 1 || i == 2) {
            this.state = 4;
        } else {
            this.state = i;
        }
    }

    public static boolean com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onTouchEvent(BottomSheetBehavior bottomSheetBehavior, C45621qg c45621qg, View view, MotionEvent motionEvent) {
        try {
            return bottomSheetBehavior.com_google_android_material_bottomsheet_BottomSheetBehavior__onTouchEvent$___twin___(c45621qg, view, motionEvent);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = C80416VhE.LIZIZ(context, attributeSet, R.attr.ze, DEF_STYLE_RES).LIZ();
            C80418VhG c80418VhG = new C80418VhG(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = c80418VhG;
            c80418VhG.LJIIIIZZ(context);
            if (z && colorStateList != null) {
                this.materialShapeDrawable.LJIIJJI(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        }
    }

    @Override // X.C06C
    public void onStopNestedScroll(C45621qg c45621qg, V v, View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference == null || view != weakReference.get() || !this.nestedScrolled) {
            return;
        }
        if (this.lastNestedScrollDy > 0) {
            if (this.fitToContents) {
                i2 = this.fitToContentsOffset;
            } else {
                int top = v.getTop();
                i2 = this.halfExpandedOffset;
                if (top <= i2) {
                    i2 = this.expandedOffset;
                }
                i3 = 6;
            }
        } else if (this.hideable && shouldHide(v, getYVelocity())) {
            i2 = this.parentHeight;
            i3 = 5;
        } else if (this.lastNestedScrollDy == 0) {
            int top2 = v.getTop();
            if (this.fitToContents) {
                if (Math.abs(top2 - this.fitToContentsOffset) < Math.abs(top2 - this.collapsedOffset)) {
                    i2 = this.fitToContentsOffset;
                } else {
                    i2 = this.collapsedOffset;
                    i3 = 4;
                }
            } else {
                int i4 = this.halfExpandedOffset;
                if (top2 < i4) {
                    if (top2 < Math.abs(top2 - this.collapsedOffset)) {
                        i2 = this.expandedOffset;
                    } else {
                        i2 = this.halfExpandedOffset;
                    }
                } else if (Math.abs(top2 - i4) < Math.abs(top2 - this.collapsedOffset)) {
                    i2 = this.halfExpandedOffset;
                } else {
                    i2 = this.collapsedOffset;
                    i3 = 4;
                }
                i3 = 6;
            }
        } else {
            if (this.fitToContents) {
                i2 = this.collapsedOffset;
            } else {
                int top3 = v.getTop();
                if (Math.abs(top3 - this.halfExpandedOffset) < Math.abs(top3 - this.collapsedOffset)) {
                    i2 = this.halfExpandedOffset;
                    i3 = 6;
                } else {
                    i2 = this.collapsedOffset;
                }
            }
            i3 = 4;
        }
        startSettlingAnimation(v, i3, i2, false);
        this.nestedScrolled = false;
    }

    public void startSettlingAnimation(View view, int i, int i2, boolean z) {
        C270714l c270714l = this.viewDragHelper;
        if (c270714l != null && (!z ? c270714l.LJIJJLI(view.getLeft(), i2, view) : c270714l.LJIJI(view.getLeft(), i2))) {
            setStateInternal(2);
            updateDrawableForTargetState(i);
            if (this.settleRunnable == null) {
                this.settleRunnable = new g(view, i);
            }
            BottomSheetBehavior<V>.g gVar = this.settleRunnable;
            if (!gVar.LJLILLLLZI) {
                gVar.LJLJI = i;
                C16300kU.LJIIL(view, gVar);
                this.settleRunnable.LJLILLLLZI = true;
                return;
            }
            gVar.LJLJI = i;
            return;
        }
        setStateInternal(i);
    }

    @Override // X.C06C
    public boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.state == 3 && !super.onNestedPreFling(c45621qg, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public void onNestedPreScroll(C45621qg c45621qg, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                h0.LJIIL(-expandedOffset, v);
                setStateInternal(3);
            } else {
                if (!this.draggable) {
                    return;
                }
                iArr[1] = i2;
                h0.LJIIL(-i2, v);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.collapsedOffset;
            if (i4 <= i5 || this.hideable) {
                if (!this.draggable) {
                    return;
                }
                iArr[1] = i2;
                h0.LJIIL(-i2, v);
                setStateInternal(1);
            } else {
                int i6 = top - i5;
                iArr[1] = i6;
                h0.LJIIL(-i6, v);
                setStateInternal(4);
            }
        }
        dispatchOnSlide(v.getTop());
        this.lastNestedScrollDy = i2;
        this.nestedScrolled = true;
    }
}
