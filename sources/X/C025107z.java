package X;

import X.C025107z;
import X.C16300kU;
import X.C17720mm;
import X.C17760mq;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout$ChildAccessibilityDelegate;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import o3.h0;

/* renamed from: X.07z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C025107z extends ViewGroup {
    public static final boolean CAN_HIDE_DESCENDANTS = true;
    public static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION = true;
    public final DrawerLayout$ChildAccessibilityDelegate mChildAccessibilityDelegate;
    public Rect mChildHitRect;
    public Matrix mChildInvertedMatrix;
    public boolean mChildrenCanceledTouch;
    public boolean mDisallowInterceptRequested;
    public boolean mDrawStatusBarBackground;
    public float mDrawerElevation;
    public int mDrawerState;
    public boolean mFirstLayout;
    public boolean mInLayout;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public Object mLastInsets;
    public final DrawerLayout$ViewDragCallback mLeftCallback;
    public final C270714l mLeftDragger;
    public DrawerLayout$DrawerListener mListener;
    public List<DrawerLayout$DrawerListener> mListeners;
    public int mLockModeEnd;
    public int mLockModeLeft;
    public int mLockModeRight;
    public int mLockModeStart;
    public int mMinDrawerMargin;
    public final ArrayList<View> mNonDrawerViews;
    public final DrawerLayout$ViewDragCallback mRightCallback;
    public final C270714l mRightDragger;
    public int mScrimColor;
    public float mScrimOpacity;
    public Paint mScrimPaint;
    public Drawable mShadowEnd;
    public Drawable mShadowLeft;
    public Drawable mShadowLeftResolved;
    public Drawable mShadowRight;
    public Drawable mShadowRightResolved;
    public Drawable mShadowStart;
    public Drawable mStatusBarBackground;
    public CharSequence mTitleLeft;
    public CharSequence mTitleRight;
    public static final int[] THEME_ATTRS = {R.attr.colorPrimaryDark};
    public static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};

    public void closeDrawers() {
        closeDrawers(false);
    }

    private void resolveShadowDrawables() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        this.mShadowLeftResolved = resolveLeftShadow();
        this.mShadowRightResolved = resolveRightShadow();
    }

    public void cancelChildViewTouch() {
        if (!this.mChildrenCanceledTouch) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DrawerLayout$LayoutParams(-1, -1);
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.mInLayout) {
            super.requestLayout();
        }
    }

    private boolean hasPeekingDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((DrawerLayout$LayoutParams) getChildAt(i).getLayoutParams()).isPeeking) {
                return true;
            }
        }
        return false;
    }

    private boolean hasVisibleDrawer() {
        if (findVisibleDrawer() != null) {
            return true;
        }
        return false;
    }

    private Drawable resolveLeftShadow() {
        int LIZLLL = C16310kV.LIZLLL(this);
        if (LIZLLL == 0) {
            Drawable drawable = this.mShadowStart;
            if (drawable != null) {
                mirror(drawable, LIZLLL);
                return this.mShadowStart;
            }
        } else {
            Drawable drawable2 = this.mShadowEnd;
            if (drawable2 != null) {
                mirror(drawable2, LIZLLL);
                return this.mShadowEnd;
            }
        }
        return this.mShadowLeft;
    }

    private Drawable resolveRightShadow() {
        int LIZLLL = C16310kV.LIZLLL(this);
        if (LIZLLL == 0) {
            Drawable drawable = this.mShadowEnd;
            if (drawable != null) {
                mirror(drawable, LIZLLL);
                return this.mShadowEnd;
            }
        } else {
            Drawable drawable2 = this.mShadowStart;
            if (drawable2 != null) {
                mirror(drawable2, LIZLLL);
                return this.mShadowStart;
            }
        }
        return this.mShadowRight;
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((DrawerLayout$LayoutParams) getChildAt(i).getLayoutParams()).onScreen);
        }
        this.mScrimOpacity = f;
        boolean LJIIIIZZ = this.mLeftDragger.LJIIIIZZ();
        boolean LJIIIIZZ2 = this.mRightDragger.LJIIIIZZ();
        if (LJIIIIZZ || LJIIIIZZ2) {
            C16300kU.LJIIJ(this);
        }
    }

    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((DrawerLayout$LayoutParams) childAt.getLayoutParams()).openState & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        DrawerLayout$SavedState drawerLayout$SavedState = new DrawerLayout$SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = drawerLayout$LayoutParams.openState;
            boolean z = true;
            if (i2 != 1) {
                if (i2 != 2) {
                    z = false;
                }
                if (0 == 0 && !z) {
                }
            }
            drawerLayout$SavedState.openDrawerGravity = drawerLayout$LayoutParams.gravity;
            break;
        }
        drawerLayout$SavedState.lockModeLeft = this.mLockModeLeft;
        drawerLayout$SavedState.lockModeRight = this.mLockModeRight;
        drawerLayout$SavedState.lockModeStart = this.mLockModeStart;
        drawerLayout$SavedState.lockModeEnd = this.mLockModeEnd;
        return drawerLayout$SavedState;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public C025107z(Context context) {
        this(context, null);
    }

    public static String gravityToString(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    public static boolean hasOpaqueBackground(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    public static boolean includeChildForAccessibility(View view) {
        if (C16300kU.LIZJ(view) != 4 && C16300kU.LIZJ(view) != 2) {
            return true;
        }
        return false;
    }

    public void addDrawerListener(DrawerLayout$DrawerListener drawerLayout$DrawerListener) {
        if (drawerLayout$DrawerListener == null) {
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(drawerLayout$DrawerListener);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof DrawerLayout$LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void closeDrawers(boolean z) {
        boolean LJIJJLI;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || drawerLayout$LayoutParams.isPeeking)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    LJIJJLI = this.mLeftDragger.LJIJJLI(-width, childAt.getTop(), childAt);
                } else {
                    LJIJJLI = this.mRightDragger.LJIJJLI(getWidth(), childAt.getTop(), childAt);
                }
                z2 |= LJIJJLI;
                drawerLayout$LayoutParams.isPeeking = false;
            }
        }
        this.mLeftCallback.removeCallbacks();
        this.mRightCallback.removeCallbacks();
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (isInBoundsOfChild(x, y, childAt) && !isContentView(childAt) && dispatchTransformedGenericPointerEvent(motionEvent, childAt)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void dispatchOnDrawerClosed(View view) {
        View rootView;
        DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) view.getLayoutParams();
        if ((drawerLayout$LayoutParams.openState & 1) == 1) {
            drawerLayout$LayoutParams.openState = 0;
            List<DrawerLayout$DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerLayout$DrawerListener) ListProtector.get(this.mListeners, size)).onDrawerClosed(view);
                }
            }
            updateChildrenImportantForAccessibility(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    public void dispatchOnDrawerOpened(View view) {
        DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) view.getLayoutParams();
        if ((drawerLayout$LayoutParams.openState & 1) == 0) {
            drawerLayout$LayoutParams.openState = 1;
            List<DrawerLayout$DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerLayout$DrawerListener) ListProtector.get(this.mListeners, size)).onDrawerOpened(view);
                }
            }
            updateChildrenImportantForAccessibility(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public View findDrawerWithGravity(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C16310kV.LIZLLL(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof DrawerLayout$LayoutParams) {
            return new DrawerLayout$LayoutParams((DrawerLayout$LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new DrawerLayout$LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new DrawerLayout$LayoutParams(layoutParams);
    }

    public int getDrawerLockMode(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int LIZLLL = C16310kV.LIZLLL(this);
        if (i != 3) {
            if (i != 5) {
                if (i != 8388611) {
                    if (i != 8388613) {
                        return 0;
                    }
                    int i6 = this.mLockModeEnd;
                    if (i6 != 3) {
                        return i6;
                    }
                    if (LIZLLL == 0) {
                        i5 = this.mLockModeRight;
                    } else {
                        i5 = this.mLockModeLeft;
                    }
                    if (i5 == 3) {
                        return 0;
                    }
                    return i5;
                }
                int i7 = this.mLockModeStart;
                if (i7 != 3) {
                    return i7;
                }
                if (LIZLLL == 0) {
                    i4 = this.mLockModeLeft;
                } else {
                    i4 = this.mLockModeRight;
                }
                if (i4 == 3) {
                    return 0;
                }
                return i4;
            }
            int i8 = this.mLockModeRight;
            if (i8 != 3) {
                return i8;
            }
            if (LIZLLL == 0) {
                i3 = this.mLockModeEnd;
            } else {
                i3 = this.mLockModeStart;
            }
            if (i3 == 3) {
                return 0;
            }
            return i3;
        }
        int i9 = this.mLockModeLeft;
        if (i9 != 3) {
            return i9;
        }
        if (LIZLLL == 0) {
            i2 = this.mLockModeStart;
        } else {
            i2 = this.mLockModeEnd;
        }
        if (i2 == 3) {
            return 0;
        }
        return i2;
    }

    public CharSequence getDrawerTitle(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C16310kV.LIZLLL(this));
        if (absoluteGravity == 3) {
            return this.mTitleLeft;
        }
        if (absoluteGravity == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    public int getDrawerViewAbsoluteGravity(View view) {
        return Gravity.getAbsoluteGravity(((DrawerLayout$LayoutParams) view.getLayoutParams()).gravity, C16310kV.LIZLLL(this));
    }

    public float getDrawerViewOffset(View view) {
        return ((DrawerLayout$LayoutParams) view.getLayoutParams()).onScreen;
    }

    public boolean isContentView(View view) {
        if (((DrawerLayout$LayoutParams) view.getLayoutParams()).gravity == 0) {
            return true;
        }
        return false;
    }

    public boolean isDrawerOpen(View view) {
        if (isDrawerView(view)) {
            if ((((DrawerLayout$LayoutParams) view.getLayoutParams()).openState & 1) == 1) {
                return true;
            }
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a drawer");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public boolean isDrawerView(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((DrawerLayout$LayoutParams) view.getLayoutParams()).gravity, C16310kV.LIZLLL(view));
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public boolean isDrawerVisible(View view) {
        if (isDrawerView(view)) {
            if (((DrawerLayout$LayoutParams) view.getLayoutParams()).onScreen > 0.0f) {
                return true;
            }
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a drawer");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        int systemWindowInsetTop;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null && (obj = this.mLastInsets) != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r1 = r9.getActionMasked()
            X.14l r0 = r8.mLeftDragger
            boolean r7 = r0.LJIJJ(r9)
            X.14l r0 = r8.mRightDragger
            boolean r0 = r0.LJIJJ(r9)
            r7 = r7 | r0
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L4a
            if (r1 == r5) goto L42
            r0 = 2
            if (r1 == r0) goto L2f
            r0 = 3
            if (r1 == r0) goto L42
        L1d:
            r0 = 0
        L1e:
            if (r7 != 0) goto L2c
            if (r0 != 0) goto L2c
            boolean r0 = r8.hasPeekingDrawer()
            if (r0 != 0) goto L2c
            boolean r0 = r8.mChildrenCanceledTouch
            if (r0 == 0) goto L2d
        L2c:
            return r5
        L2d:
            r5 = 0
            goto L2c
        L2f:
            X.14l r0 = r8.mLeftDragger
            boolean r0 = r0.LJ()
            if (r0 == 0) goto L1d
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r0 = r8.mLeftCallback
            r0.removeCallbacks()
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r0 = r8.mRightCallback
            r0.removeCallbacks()
            goto L1d
        L42:
            r8.closeDrawers(r5)
            r8.mDisallowInterceptRequested = r6
            r8.mChildrenCanceledTouch = r6
            goto L1d
        L4a:
            float r4 = r9.getX()
            float r3 = r9.getY()
            r8.mInitialMotionX = r4
            r8.mInitialMotionY = r3
            float r1 = r8.mScrimOpacity
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L73
            X.14l r2 = r8.mLeftDragger
            int r1 = (int) r4
            int r0 = (int) r3
            android.view.View r0 = r2.LJIIJJI(r1, r0)
            if (r0 == 0) goto L73
            boolean r0 = r8.isContentView(r0)
            if (r0 == 0) goto L73
            r0 = 1
        L6e:
            r8.mDisallowInterceptRequested = r6
            r8.mChildrenCanceledTouch = r6
            goto L1e
        L73:
            r0 = 0
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C025107z.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View findDrawerWithGravity;
        if (!(parcelable instanceof DrawerLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DrawerLayout$SavedState drawerLayout$SavedState = (DrawerLayout$SavedState) parcelable;
        super.onRestoreInstanceState(drawerLayout$SavedState.mSuperState);
        int i = drawerLayout$SavedState.openDrawerGravity;
        if (i != 0 && (findDrawerWithGravity = findDrawerWithGravity(i)) != null) {
            openDrawer(findDrawerWithGravity);
        }
        int i2 = drawerLayout$SavedState.lockModeLeft;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = drawerLayout$SavedState.lockModeRight;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = drawerLayout$SavedState.lockModeStart;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = drawerLayout$SavedState.lockModeEnd;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        resolveShadowDrawables();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View findOpenDrawer;
        this.mLeftDragger.LJIILIIL(motionEvent);
        this.mRightDragger.LJIILIIL(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    closeDrawers(true);
                    this.mDisallowInterceptRequested = false;
                    this.mChildrenCanceledTouch = false;
                }
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View LJIIJJI = this.mLeftDragger.LJIIJJI((int) x, (int) y);
                if (LJIIJJI != null && isContentView(LJIIJJI)) {
                    float f = x - this.mInitialMotionX;
                    float f2 = y - this.mInitialMotionY;
                    int i = this.mLeftDragger.LIZIZ;
                    if ((f2 * f2) + (f * f) < i * i && (findOpenDrawer = findOpenDrawer()) != null && getDrawerLockMode(findOpenDrawer) != 2) {
                        z = false;
                        closeDrawers(z);
                        this.mDisallowInterceptRequested = false;
                    }
                }
                z = true;
                closeDrawers(z);
                this.mDisallowInterceptRequested = false;
            }
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.mInitialMotionX = x2;
            this.mInitialMotionY = y2;
            this.mDisallowInterceptRequested = false;
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void removeDrawerListener(DrawerLayout$DrawerListener drawerLayout$DrawerListener) {
        List<DrawerLayout$DrawerListener> list;
        if (drawerLayout$DrawerListener == null || (list = this.mListeners) == null) {
            return;
        }
        list.remove(drawerLayout$DrawerListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.mDisallowInterceptRequested = z;
        if (z) {
            closeDrawers(true);
        }
    }

    public void setDrawerElevation(float f) {
        this.mDrawerElevation = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt)) {
                C16360ka.LJIJ(childAt, this.mDrawerElevation);
            }
        }
    }

    public void setDrawerListener(DrawerLayout$DrawerListener drawerLayout$DrawerListener) {
        DrawerLayout$DrawerListener drawerLayout$DrawerListener2 = this.mListener;
        if (drawerLayout$DrawerListener2 != null) {
            removeDrawerListener(drawerLayout$DrawerListener2);
        }
        if (drawerLayout$DrawerListener != null) {
            addDrawerListener(drawerLayout$DrawerListener);
        }
        this.mListener = drawerLayout$DrawerListener;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setScrimColor(int i) {
        this.mScrimColor = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C04270Et.LIZIZ(getContext(), i);
        } else {
            drawable = null;
        }
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.mStatusBarBackground = new ColorDrawable(i);
        invalidate();
    }

    public void closeDrawer(View view) {
        closeDrawer(view, true);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new DrawerLayout$LayoutParams(getContext(), attributeSet);
    }

    public int getDrawerLockMode(View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((DrawerLayout$LayoutParams) view.getLayoutParams()).gravity);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a drawer");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public boolean isDrawerOpen(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    public boolean isDrawerVisible(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    public void openDrawer(View view) {
        openDrawer(view, true);
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public C025107z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent transformedMotionEvent = getTransformedMotionEvent(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(transformedMotionEvent);
            transformedMotionEvent.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent getTransformedMotionEvent(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            obtain.transform(this.mChildInvertedMatrix);
        }
        return obtain;
    }

    private boolean mirror(Drawable drawable, int i) {
        if (drawable == null || !C07810Sj.LIZLLL(drawable)) {
            return false;
        }
        C07840Sm.LIZJ(drawable, i);
        return true;
    }

    private void updateChildrenImportantForAccessibility(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (z ? childAt != view : isDrawerView(childAt)) {
                C16300kU.LJIJ(childAt, 4);
            } else {
                C16300kU.LJIJ(childAt, 1);
            }
        }
    }

    public boolean checkDrawerViewAbsoluteGravity(View view, int i) {
        if ((getDrawerViewAbsoluteGravity(view) & i) == i) {
            return true;
        }
        return false;
    }

    public void closeDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) view.getLayoutParams();
            if (this.mFirstLayout) {
                drawerLayout$LayoutParams.onScreen = 0.0f;
                drawerLayout$LayoutParams.openState = 0;
            } else if (z) {
                drawerLayout$LayoutParams.openState |= 4;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.LJIJJLI(-view.getWidth(), view.getTop(), view);
                } else {
                    this.mRightDragger.LJIJJLI(getWidth(), view.getTop(), view);
                }
            } else {
                moveDrawerToOffset(view, 0.0f);
                updateDrawerState(drawerLayout$LayoutParams.gravity, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a sliding drawer");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public void dispatchOnDrawerSlide(View view, float f) {
        List<DrawerLayout$DrawerListener> list = this.mListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((DrawerLayout$DrawerListener) ListProtector.get(this.mListeners, size)).onDrawerSlide(view, f);
            }
        }
    }

    public void moveDrawerToOffset(View view, float f) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        setDrawerViewOffset(view, f);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && hasVisibleDrawer()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View findVisibleDrawer = findVisibleDrawer();
            if (findVisibleDrawer != null) {
                if (getDrawerLockMode(findVisibleDrawer) == 0) {
                    closeDrawers();
                }
                return true;
            }
            return false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.mLastInsets != null && C16300kU.LIZIZ(this)) {
            z = true;
        } else {
            z = false;
        }
        int LIZLLL = C16310kV.LIZLLL(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(drawerLayout$LayoutParams.gravity, LIZLLL);
                    if (C16300kU.LIZIZ(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.mLastInsets;
                        if (absoluteGravity == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.mLastInsets;
                        if (absoluteGravity == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
                        float LJIIIIZZ = C16360ka.LJIIIIZZ(childAt);
                        float f = this.mDrawerElevation;
                        if (LJIIIIZZ != f) {
                            C16360ka.LJIJ(childAt, f);
                        }
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    if (drawerViewAbsoluteGravity == 3) {
                        if (!z2) {
                            z2 = true;
                            childAt.measure(ViewGroup.getChildMeasureSpec(i, this.mMinDrawerMargin + ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).height));
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Child drawer has absolute gravity ");
                            LIZ.append(gravityToString(drawerViewAbsoluteGravity));
                            LIZ.append(" but this ");
                            LIZ.append("DrawerLayout");
                            LIZ.append(" already has a ");
                            LIZ.append("drawer view along that edge");
                            throw new IllegalStateException(X1D.LIZIZ(LIZ));
                        }
                    } else if (!z3) {
                        z3 = true;
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.mMinDrawerMargin + ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).height));
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Child drawer has absolute gravity ");
                        LIZ2.append(gravityToString(drawerViewAbsoluteGravity));
                        LIZ2.append(" but this ");
                        LIZ2.append("DrawerLayout");
                        LIZ2.append(" already has a ");
                        LIZ2.append("drawer view along that edge");
                        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Child ");
                    LIZ3.append(childAt);
                    LIZ3.append(" at index ");
                    LIZ3.append(i3);
                    LIZ3.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    LIZ3.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(X1D.LIZIZ(LIZ3));
                }
            }
        }
    }

    public void openDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) view.getLayoutParams();
            if (this.mFirstLayout) {
                drawerLayout$LayoutParams.onScreen = 1.0f;
                drawerLayout$LayoutParams.openState = 1;
                updateChildrenImportantForAccessibility(view, true);
            } else if (z) {
                drawerLayout$LayoutParams.openState |= 2;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.LJIJJLI(0, view.getTop(), view);
                } else {
                    this.mRightDragger.LJIJJLI(getWidth() - view.getWidth(), view.getTop(), view);
                }
            } else {
                moveDrawerToOffset(view, 1.0f);
                updateDrawerState(drawerLayout$LayoutParams.gravity, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a sliding drawer");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z;
        if (!z && getBackground() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerLockMode(int i, int i2) {
        C270714l c270714l;
        View findDrawerWithGravity;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, C16310kV.LIZLLL(this));
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 8388611) {
                    if (i2 == 8388613) {
                        this.mLockModeEnd = i;
                    }
                } else {
                    this.mLockModeStart = i;
                }
            } else {
                this.mLockModeRight = i;
            }
        } else {
            this.mLockModeLeft = i;
        }
        if (i != 0) {
            if (absoluteGravity == 3) {
                c270714l = this.mLeftDragger;
            } else {
                c270714l = this.mRightDragger;
            }
            c270714l.LIZIZ();
            if (i != 1) {
                if (i != 2 || (findDrawerWithGravity = findDrawerWithGravity(absoluteGravity)) == null) {
                    return;
                }
                openDrawer(findDrawerWithGravity);
                return;
            }
            View findDrawerWithGravity2 = findDrawerWithGravity(absoluteGravity);
            if (findDrawerWithGravity2 == null) {
                return;
            }
            closeDrawer(findDrawerWithGravity2);
        }
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        if ((i & 8388611) == 8388611) {
            this.mShadowStart = drawable;
        } else if ((i & 8388613) == 8388613) {
            this.mShadowEnd = drawable;
        } else if ((i & 3) == 3) {
            this.mShadowLeft = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.mShadowRight = drawable;
        }
        resolveShadowDrawables();
        invalidate();
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C16310kV.LIZLLL(this));
        if (absoluteGravity == 3) {
            this.mTitleLeft = charSequence;
        } else {
            if (absoluteGravity != 5) {
                return;
            }
            this.mTitleRight = charSequence;
        }
    }

    public void setDrawerViewOffset(View view, float f) {
        DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) view.getLayoutParams();
        if (f == drawerLayout$LayoutParams.onScreen) {
            return;
        }
        drawerLayout$LayoutParams.onScreen = f;
        dispatchOnDrawerSlide(view, f);
    }

    public void closeDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No drawer view found with gravity ");
        LIZ.append(gravityToString(i));
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public void openDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No drawer view found with gravity ");
        LIZ.append(gravityToString(i));
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public void setDrawerLockMode(int i, View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i, ((DrawerLayout$LayoutParams) view.getLayoutParams()).gravity);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a ");
        LIZ.append("drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(C04270Et.LIZIZ(getContext(), i), i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.drawerlayout.widget.DrawerLayout$ChildAccessibilityDelegate] */
    public C025107z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildAccessibilityDelegate = new C16120kC() { // from class: androidx.drawerlayout.widget.DrawerLayout$ChildAccessibilityDelegate
            @Override // X.C16120kC
            public void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
                super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                if (!C025107z.includeChildForAccessibility(view)) {
                    c17760mq.LJJI(null);
                }
            }
        };
        this.mScrimColor = -1728053248;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        DrawerLayout$ViewDragCallback drawerLayout$ViewDragCallback = new DrawerLayout$ViewDragCallback(this, 3);
        this.mLeftCallback = drawerLayout$ViewDragCallback;
        DrawerLayout$ViewDragCallback drawerLayout$ViewDragCallback2 = new DrawerLayout$ViewDragCallback(this, 5);
        this.mRightCallback = drawerLayout$ViewDragCallback2;
        C270714l LJIIJ = C270714l.LJIIJ(this, drawerLayout$ViewDragCallback);
        this.mLeftDragger = LJIIJ;
        LJIIJ.LJIILLIIL = 1;
        LJIIJ.LJIILIIL = f2;
        drawerLayout$ViewDragCallback.setDragger(LJIIJ);
        C270714l LJIIJ2 = C270714l.LJIIJ(this, drawerLayout$ViewDragCallback2);
        this.mRightDragger = LJIIJ2;
        LJIIJ2.LJIILLIIL = 2;
        LJIIJ2.LJIILIIL = f2;
        drawerLayout$ViewDragCallback2.setDragger(LJIIJ2);
        setFocusableInTouchMode(true);
        C16300kU.LJIJ(this, 1);
        h0.LJIJI(this, new C16120kC() { // from class: androidx.drawerlayout.widget.DrawerLayout$AccessibilityDelegate
            public final Rect mTmpRect = new Rect();

            private void addChildrenForAccessibility(C17760mq c17760mq, ViewGroup viewGroup) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (C025107z.includeChildForAccessibility(childAt)) {
                        c17760mq.LIZ.addChild(childAt);
                    }
                }
            }

            private void copyNodeInfoNoChildren(C17760mq c17760mq, C17760mq c17760mq2) {
                Rect rect = this.mTmpRect;
                c17760mq2.LIZLLL(rect);
                c17760mq.LJIIJ(rect);
                c17760mq2.LIZ.getBoundsInScreen(rect);
                c17760mq.LJIIJJI(rect);
                c17760mq.LIZ.setVisibleToUser(c17760mq2.LIZ.isVisibleToUser());
                c17760mq.LIZ.setPackageName(c17760mq2.LIZ.getPackageName());
                c17760mq.LJIILJJIL(c17760mq2.LIZ.getClassName());
                c17760mq.LJIJ(c17760mq2.LJ());
                c17760mq.LJIJJ(c17760mq2.LIZ.isEnabled());
                c17760mq.LJIILL(c17760mq2.LIZ.isClickable());
                c17760mq.LJIJJLI(c17760mq2.LIZ.isFocusable());
                c17760mq.LIZ.setFocused(c17760mq2.LIZ.isFocused());
                c17760mq.LJIIIIZZ(c17760mq2.LIZ.isAccessibilityFocused());
                c17760mq.LIZ.setSelected(c17760mq2.LIZ.isSelected());
                c17760mq.LIZ.setLongClickable(c17760mq2.LIZ.isLongClickable());
                c17760mq.LIZ(c17760mq2.LIZ.getActions());
            }

            @Override // X.C16120kC
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                if (accessibilityEvent.getEventType() == 32) {
                    List<CharSequence> text = accessibilityEvent.getText();
                    View findVisibleDrawer = C025107z.this.findVisibleDrawer();
                    if (findVisibleDrawer != null) {
                        CharSequence drawerTitle = C025107z.this.getDrawerTitle(C025107z.this.getDrawerViewAbsoluteGravity(findVisibleDrawer));
                        if (drawerTitle != null) {
                            text.add(drawerTitle);
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }

            @Override // X.C16120kC
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName(C025107z.class.getName());
            }

            @Override // X.C16120kC
            public void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
                if (C025107z.CAN_HIDE_DESCENDANTS) {
                    super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                } else {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(c17760mq.LIZ);
                    C17760mq c17760mq2 = new C17760mq(obtain);
                    super.onInitializeAccessibilityNodeInfo(view, c17760mq2);
                    c17760mq.LIZJ = -1;
                    c17760mq.LIZ.setSource(view);
                    Object LJFF = C16300kU.LJFF(view);
                    if (LJFF instanceof View) {
                        c17760mq.LJJI((View) LJFF);
                    }
                    copyNodeInfoNoChildren(c17760mq, c17760mq2);
                    obtain.recycle();
                    addChildrenForAccessibility(c17760mq, (ViewGroup) view);
                }
                c17760mq.LJIILJJIL(C025107z.class.getName());
                c17760mq.LJIJJLI(false);
                c17760mq.LIZ.setFocused(false);
                c17760mq.LJII(C17720mm.LJ);
                c17760mq.LJII(C17720mm.LJFF);
            }

            @Override // X.C16120kC
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                if (C025107z.CAN_HIDE_DESCENDANTS || C025107z.includeChildForAccessibility(view)) {
                    return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }
                return false;
            }
        });
        setMotionEventSplittingEnabled(false);
        if (C16300kU.LIZIZ(this)) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.drawerlayout.widget.DrawerLayout$1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    boolean z;
                    C025107z c025107z = (C025107z) view;
                    if (windowInsets.getSystemWindowInsetTop() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c025107z.setChildInsets(windowInsets, z);
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
            try {
                this.mStatusBarBackground = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.mDrawerElevation = f * 10.0f;
        this.mNonDrawerViews = new ArrayList<>();
    }

    private boolean isInBoundsOfChild(float f, float f2, View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f, (int) f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (isDrawerView(childAt)) {
                if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.mNonDrawerViews.add(childAt);
            }
        }
        if (!z) {
            int size = this.mNonDrawerViews.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) ListProtector.get(this.mNonDrawerViews, i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.mNonDrawerViews.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            C16300kU.LJIJ(view, 4);
        } else {
            C16300kU.LJIJ(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS) {
            h0.LJIJI(view, this.mChildAccessibilityDelegate);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean isContentView = isContentView(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (isContentView) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && hasOpaqueBackground(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.mScrimOpacity;
        if (f > 0.0f && isContentView) {
            int i4 = this.mScrimColor;
            this.mScrimPaint.setColor((i4 & 16777215) | (((int) ((((-16777216) & i4) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.mScrimPaint);
        } else if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.mLeftDragger.LJIILJJIL, 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (max * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
        } else if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.mRightDragger.LJIILJJIL, 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (max2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return drawChild;
    }

    public void updateDrawerState(int i, int i2, View view) {
        int i3;
        int i4 = this.mLeftDragger.LIZ;
        int i5 = this.mRightDragger.LIZ;
        if (i4 == 1 || i5 == 1) {
            i3 = 1;
        } else {
            i3 = 2;
            if (i4 != 2 && i5 != 2) {
                i3 = 0;
            }
        }
        if (view != null && i2 == 0) {
            float f = ((DrawerLayout$LayoutParams) view.getLayoutParams()).onScreen;
            if (f == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (f == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i3 != this.mDrawerState) {
            this.mDrawerState = i3;
            List<DrawerLayout$DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerLayout$DrawerListener) ListProtector.get(this.mListeners, size)).onDrawerStateChanged(i3);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        boolean z2;
        int i6;
        this.mInLayout = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).leftMargin;
                    C17M.LIZIZ(childAt, ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).topMargin, i9, ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).topMargin, childAt.getMeasuredWidth() + i9);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (drawerLayout$LayoutParams.onScreen * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        i5 = i7 - ((int) (drawerLayout$LayoutParams.onScreen * f3));
                        f = (i7 - i5) / f3;
                    }
                    if (f != drawerLayout$LayoutParams.onScreen) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i10 = drawerLayout$LayoutParams.gravity & 112;
                    if (i10 != 16) {
                        if (i10 != 80) {
                            int i11 = ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).topMargin;
                            childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                        } else {
                            int i12 = i4 - i2;
                            childAt.layout(i5, (i12 - ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).bottomMargin);
                        }
                    } else {
                        int i13 = i4 - i2;
                        int i14 = (i13 - measuredHeight) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight;
                            int i17 = ((ViewGroup.MarginLayoutParams) drawerLayout$LayoutParams).bottomMargin;
                            if (i16 > i13 - i17) {
                                i14 = (i13 - i17) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i14, measuredWidth + i5, measuredHeight + i14);
                    }
                    if (z2) {
                        setDrawerViewOffset(childAt, f);
                    }
                    if (drawerLayout$LayoutParams.onScreen > 0.0f) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }
}
