package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import o3.h0;

/* renamed from: X.1qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C45621qg extends ViewGroup implements C1V0, InterfaceC43251mr {
    public static final String LL;
    public static final Class<?>[] LLD;
    public static final ThreadLocal<java.util.Map<String, Constructor<C06C>>> LLF;
    public static final C06H LLFF;
    public static final C43051mX LLFFF;
    public final List<View> LJLIL;
    public final C00G<View> LJLILLLLZI;
    public final List<View> LJLJI;
    public final List<View> LJLJJI;
    public Paint LJLJJL;
    public final int[] LJLJJLL;
    public final int[] LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final int[] LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public C06G LJLLJ;
    public boolean LJLLL;
    public C16800lI LJLLLL;
    public boolean LJLLLLLL;
    public Drawable LJLZ;
    public ViewGroup.OnHierarchyChangeListener LJZ;
    public C1AK LJZI;
    public final C16690l7 LJZL;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.06H] */
    static {
        String str;
        Package r0 = C45621qg.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        LL = str;
        LLFF = new Comparator<View>() { // from class: X.06H
            @Override // java.util.Comparator
            public final int compare(View view, View view2) {
                float LJIIL = C16360ka.LJIIL(view);
                float LJIIL2 = C16360ka.LJIIL(view2);
                if (LJIIL > LJIIL2) {
                    return -1;
                }
                if (LJIIL < LJIIL2) {
                    return 1;
                }
                return 0;
            }
        };
        LLD = new Class[]{Context.class, AttributeSet.class};
        LLF = new ThreadLocal<>();
        LLFFF = new C43051mX(12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect LIZ() {
        Rect rect = (Rect) LLFFF.LIZIZ();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILIIL() {
        View childAt;
        int LIZLLL;
        int absoluteGravity;
        C06C c06c;
        ((ArrayList) this.LJLIL).clear();
        C00G<View> c00g = this.LJLILLLLZI;
        int i = c00g.LIZIZ.LJLJI;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> LJIIJJI = c00g.LIZIZ.LJIIJJI(i2);
            if (LJIIJJI != null) {
                LJIIJJI.clear();
                c00g.LIZ.LIZ(LJIIJJI);
            }
        }
        c00g.LIZIZ.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C06F LJI = LJI(childAt2);
            if (LJI.LJFF == -1) {
                LJI.LJIIJJI = null;
                LJI.LJIIJ = null;
            } else {
                View view = LJI.LJIIJ;
                if (view != null && view.getId() == LJI.LJFF) {
                    View view2 = LJI.LJIIJ;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt2) {
                            LJI.LJIIJJI = null;
                            LJI.LJIIJ = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    LJI.LJIIJJI = view2;
                }
                View findViewById = findViewById(LJI.LJFF);
                LJI.LJIIJ = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            LJI.LJIIJJI = null;
                            LJI.LJIIJ = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt2) {
                                if (isInEditMode()) {
                                    LJI.LJIIJJI = null;
                                    LJI.LJIIJ = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = parent2;
                                }
                            }
                        }
                        LJI.LJIIJJI = findViewById;
                    }
                } else if (isInEditMode()) {
                    LJI.LJIIJJI = null;
                    LJI.LJIIJ = null;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Could not find CoordinatorLayout descendant view with id ");
                    LIZ.append(getResources().getResourceName(LJI.LJFF));
                    LIZ.append(" to anchor view ");
                    LIZ.append(childAt2);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            }
            C00G<View> c00g2 = this.LJLILLLLZI;
            if (!c00g2.LIZIZ.containsKey(childAt2)) {
                c00g2.LIZIZ.put(childAt2, null);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3 && ((childAt = getChildAt(i4)) == LJI.LJIIJJI || (((absoluteGravity = Gravity.getAbsoluteGravity(((C06F) childAt.getLayoutParams()).LJI, (LIZLLL = C16310kV.LIZLLL(this)))) != 0 && (Gravity.getAbsoluteGravity(LJI.LJII, LIZLLL) & absoluteGravity) == absoluteGravity) || ((c06c = LJI.LIZ) != null && c06c.layoutDependsOn(this, childAt2, childAt))))) {
                    if (!this.LJLILLLLZI.LIZIZ.containsKey(childAt)) {
                        C00G<View> c00g3 = this.LJLILLLLZI;
                        if (!c00g3.LIZIZ.containsKey(childAt)) {
                            c00g3.LIZIZ.put(childAt, null);
                        }
                    }
                    C00G<View> c00g4 = this.LJLILLLLZI;
                    if (c00g4.LIZIZ.containsKey(childAt) && c00g4.LIZIZ.containsKey(childAt2)) {
                        ArrayList<View> orDefault = c00g4.LIZIZ.getOrDefault(childAt, null);
                        if (orDefault == null) {
                            orDefault = (ArrayList) c00g4.LIZ.LIZIZ();
                            if (orDefault == null) {
                                orDefault = new ArrayList<>();
                            }
                            c00g4.LIZIZ.put(childAt, orDefault);
                        }
                        orDefault.add(childAt2);
                    } else {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                }
            }
        }
        List<View> list = this.LJLIL;
        C00G<View> c00g5 = this.LJLILLLLZI;
        c00g5.LIZJ.clear();
        c00g5.LIZLLL.clear();
        int i5 = c00g5.LIZIZ.LJLJI;
        for (int i6 = 0; i6 < i5; i6++) {
            c00g5.LIZ(c00g5.LIZIZ.LJIIIIZZ(i6), c00g5.LIZJ, c00g5.LIZLLL);
        }
        ((ArrayList) list).addAll(c00g5.LIZJ);
        Collections.reverse(this.LJLIL);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C06F(-2, -2);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LJZL;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        CoordinatorLayout$SavedState coordinatorLayout$SavedState = new CoordinatorLayout$SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C06C c06c = ((C06F) childAt.getLayoutParams()).LIZ;
            if (id != -1 && c06c != null && (onSaveInstanceState = c06c.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        coordinatorLayout$SavedState.LJLIL = sparseArray;
        return coordinatorLayout$SavedState;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1AK] */
    public final void LJIJJ() {
        if (C16300kU.LIZIZ(this)) {
            if (this.LJZI == null) {
                this.LJZI = new InterfaceC16710l9() { // from class: X.1AK
                    @Override // X.InterfaceC16710l9
                    public final C16800lI LIZ(View view, C16800lI c16800lI) {
                        boolean z;
                        C06C c06c;
                        C45621qg c45621qg = C45621qg.this;
                        if (!Objects.equals(c45621qg.LJLLLL, c16800lI)) {
                            c45621qg.LJLLLL = c16800lI;
                            boolean z2 = true;
                            if (c16800lI.LJ() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c45621qg.LJLLLLLL = z;
                            if (z || c45621qg.getBackground() != null) {
                                z2 = false;
                            }
                            c45621qg.setWillNotDraw(z2);
                            if (!c16800lI.LJI()) {
                                int childCount = c45621qg.getChildCount();
                                for (int i = 0; i < childCount; i++) {
                                    View childAt = c45621qg.getChildAt(i);
                                    if (C16300kU.LIZIZ(childAt) && (c06c = ((C06F) childAt.getLayoutParams()).LIZ) != null) {
                                        c06c.onApplyWindowInsets(c45621qg, childAt, c16800lI);
                                        if (c16800lI.LJI()) {
                                            break;
                                        }
                                    }
                                }
                            }
                            c45621qg.requestLayout();
                        }
                        return c16800lI;
                    }
                };
            }
            C16360ka.LJIJJ(this, this.LJZI);
            setSystemUiVisibility(1280);
            return;
        }
        C16360ka.LJIJJ(this, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LJLZ;
        if (drawable != null && drawable.isStateful() && (false | drawable.setState(drawableState))) {
            invalidate();
        }
    }

    public final List<View> getDependencySortedChildren() {
        LJIILIIL();
        return Collections.unmodifiableList(this.LJLIL);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJIIZILJ(false);
        if (this.LJLLL) {
            if (this.LJLLJ == null) {
                this.LJLLJ = new C06G(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.LJLLJ);
        }
        if (this.LJLLLL == null && C16300kU.LIZIZ(this)) {
            C16340kY.LIZJ(this);
        }
        this.LJLJLLL = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJIIZILJ(false);
        if (this.LJLLL && this.LJLLJ != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.LJLLJ);
        }
        View view = this.LJLLILLLL;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.LJLJLLL = false;
    }

    public final C16800lI getLastWindowInsets() {
        return this.LJLLLL;
    }

    public Drawable getStatusBarBackground() {
        return this.LJLZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C06F LJI(View view) {
        C06F c06f = (C06F) view.getLayoutParams();
        if (!c06f.LIZIZ) {
            if (view instanceof C06B) {
                c06f.LIZIZ(((C06B) view).getBehavior());
                c06f.LIZIZ = true;
            } else {
                Class<?> cls = view.getClass();
                while (true) {
                    if (cls == null) {
                        break;
                    }
                    C06D c06d = (C06D) cls.getAnnotation(C06D.class);
                    if (c06d == null) {
                        cls = cls.getSuperclass();
                    } else {
                        try {
                            c06f.LIZIZ(c06d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
                c06f.LIZIZ = true;
            }
        }
        return c06f;
    }

    public static void LJIILLIIL(Rect rect) {
        rect.setEmpty();
        LLFFF.LIZ(rect);
    }

    public final List<View> LIZLLL(View view) {
        C00G<View> c00g = this.LJLILLLLZI;
        int i = c00g.LIZIZ.LJLJI;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> LJIIJJI = c00g.LIZIZ.LJIIJJI(i2);
            if (LJIIJJI != null && LJIIJJI.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c00g.LIZIZ.LJIIIIZZ(i2));
            }
        }
        ((ArrayList) this.LJLJJI).clear();
        if (arrayList != null) {
            ((ArrayList) this.LJLJJI).addAll(arrayList);
        }
        return this.LJLJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r26) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45621qg.LJIIIZ(int):void");
    }

    public final void LJIIZILJ(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C06C c06c = ((C06F) childAt.getLayoutParams()).LIZ;
            if (c06c != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    c06c.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    c06c.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C06F) getChildAt(i2).getLayoutParams()).LJIIL = false;
        }
        this.LJLLI = null;
        this.LJLJLJ = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C06F) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C06F) {
            return new C06F((C06F) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C06F((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C06F(layoutParams);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C16800lI c16800lI;
        int LJ;
        super.onDraw(canvas);
        if (this.LJLLLLLL && this.LJLZ != null && (c16800lI = this.LJLLLL) != null && (LJ = c16800lI.LJ()) > 0) {
            this.LJLZ.setBounds(0, 0, getWidth(), LJ);
            this.LJLZ.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            LJIIZILJ(true);
        }
        boolean LJIIL = LJIIL(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            LJIIZILJ(true);
        }
        return LJIIL;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof CoordinatorLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CoordinatorLayout$SavedState coordinatorLayout$SavedState = (CoordinatorLayout$SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout$SavedState.mSuperState);
        SparseArray<Parcelable> sparseArray = coordinatorLayout$SavedState.LJLIL;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C06C c06c = LJI(childAt).LIZ;
            if (id != -1 && c06c != null && (parcelable2 = sparseArray.get(id)) != null) {
                c06c.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        LJIILJJIL(0, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r4 != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r2 = r13.getActionMasked()
            android.view.View r0 = r12.LJLLI
            r3 = 1
            r11 = 0
            if (r0 != 0) goto L4d
            boolean r4 = r12.LJIIL(r13, r3)
            if (r4 == 0) goto L4b
        L10:
            android.view.View r0 = r12.LJLLI
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.06F r0 = (X.C06F) r0
            X.06C r1 = r0.LIZ
            if (r1 == 0) goto L4b
            android.view.View r0 = r12.LJLLI
            boolean r1 = r1.onTouchEvent(r12, r0, r13)
        L22:
            android.view.View r0 = r12.LJLLI
            if (r0 != 0) goto L34
            boolean r0 = super.onTouchEvent(r13)
            r1 = r1 | r0
        L2b:
            if (r2 == r3) goto L30
            r0 = 3
            if (r2 != r0) goto L33
        L30:
            r12.LJIIZILJ(r11)
        L33:
            return r1
        L34:
            if (r4 == 0) goto L2b
            long r4 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r6 = r4
            r10 = r9
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            super.onTouchEvent(r0)
            if (r0 == 0) goto L2b
            r0.recycle()
            goto L2b
        L4b:
            r1 = 0
            goto L22
        L4d:
            r4 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45621qg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.LJLJLJ) {
            LJIIZILJ(false);
            this.LJLJLJ = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        LJIJJ();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.LJZ = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.LJLZ;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.LJLZ = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.LJLZ.setState(getDrawableState());
                }
                C07840Sm.LIZJ(this.LJLZ, C16310kV.LIZLLL(this));
                Drawable drawable4 = this.LJLZ;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.LJLZ.setCallback(this);
            }
            C16300kU.LJIIJ(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C04270Et.LIZIZ(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.LJLZ;
        if (drawable != null && drawable.isVisible() != z) {
            this.LJLZ.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LJLZ) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C06F(getContext(), attributeSet);
    }

    public C45621qg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a7h);
    }

    public static void LJIJ(int i, View view) {
        C06F c06f = (C06F) view.getLayoutParams();
        int i2 = c06f.LJIIIIZZ;
        if (i2 != i) {
            h0.LJIIJJI(i - i2, view);
            c06f.LJIIIIZZ = i;
        }
    }

    public static void LJIJI(int i, View view) {
        C06F c06f = (C06F) view.getLayoutParams();
        int i2 = c06f.LJIIIZ;
        if (i2 != i) {
            h0.LJIIL(i - i2, view);
            c06f.LJIIIZ = i;
        }
    }

    public final void LJ(Rect rect, View view) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal = C00H.LIZ;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        C00H.LIZ(this, view, matrix);
        ThreadLocal<RectF> threadLocal2 = C00H.LIZIZ;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void LJIIJ(int i, View view) {
        Rect LIZ;
        Rect LIZ2;
        C43051mX c43051mX;
        int i2;
        C06F c06f = (C06F) view.getLayoutParams();
        View view2 = c06f.LJIIJ;
        int i3 = 0;
        if (view2 == null) {
            if (c06f.LJFF != -1) {
                throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            }
            int i4 = c06f.LJ;
            if (i4 >= 0) {
                C06F c06f2 = (C06F) view.getLayoutParams();
                int i5 = c06f2.LIZJ;
                if (i5 == 0) {
                    i5 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
                int i6 = absoluteGravity & 7;
                int i7 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (i == 1) {
                    i4 = width - i4;
                }
                int[] iArr = this.LJLL;
                if (iArr == null || i4 < 0 || i4 >= iArr.length) {
                    i2 = 0;
                } else {
                    i2 = iArr[i4];
                }
                int i8 = i2 - measuredWidth;
                if (i6 != 1) {
                    if (i6 == 5) {
                        i8 += measuredWidth;
                    }
                } else {
                    i8 += measuredWidth / 2;
                }
                if (i7 != 16) {
                    if (i7 == 80) {
                        i3 = measuredHeight;
                    }
                } else {
                    i3 = 0 + (measuredHeight / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c06f2).leftMargin, Math.min(i8, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c06f2).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c06f2).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c06f2).bottomMargin));
                view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
                return;
            }
            C06F c06f3 = (C06F) view.getLayoutParams();
            LIZ = LIZ();
            LIZ.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c06f3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c06f3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c06f3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c06f3).bottomMargin);
            if (this.LJLLLL != null && C16300kU.LIZIZ(this) && !C16300kU.LIZIZ(view)) {
                LIZ.left = this.LJLLLL.LIZJ() + LIZ.left;
                LIZ.top = this.LJLLLL.LJ() + LIZ.top;
                LIZ.right -= this.LJLLLL.LIZLLL();
                LIZ.bottom -= this.LJLLLL.LIZIZ();
            }
            LIZ2 = LIZ();
            int i9 = c06f3.LIZJ;
            if ((i9 & 7) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            Gravity.apply(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), LIZ, LIZ2, i);
            view.layout(LIZ2.left, LIZ2.top, LIZ2.right, LIZ2.bottom);
            return;
        }
        LIZ = LIZ();
        LIZ2 = LIZ();
        try {
            LJ(LIZ, view2);
            C06F c06f4 = (C06F) view.getLayoutParams();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            LJFF(i, LIZ, LIZ2, c06f4, measuredWidth2, measuredHeight2);
            LIZIZ(c06f4, LIZ2, measuredWidth2, measuredHeight2);
            view.layout(LIZ2.left, LIZ2.top, LIZ2.right, LIZ2.bottom);
        } finally {
            LIZ.setEmpty();
            c43051mX = LLFFF;
            c43051mX.LIZ(LIZ);
            LIZ2.setEmpty();
            c43051mX.LIZ(LIZ2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x007b, code lost:
    
        if (r13 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(android.view.MotionEvent r24, int r25) {
        /*
            r23 = this;
            r8 = r24
            int r14 = r8.getActionMasked()
            r9 = r23
            java.util.List<android.view.View> r7 = r9.LJLJI
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.clear()
            boolean r3 = r9.isChildrenDrawingOrderEnabled()
            int r2 = r9.getChildCount()
            int r1 = r2 + (-1)
        L19:
            if (r1 < 0) goto L2d
            if (r3 == 0) goto L2b
            int r0 = r9.getChildDrawingOrder(r2, r1)
        L21:
            android.view.View r0 = r9.getChildAt(r0)
            r7.add(r0)
            int r1 = r1 + (-1)
            goto L19
        L2b:
            r0 = r1
            goto L21
        L2d:
            X.06H r0 = X.C45621qg.LLFF
            if (r0 == 0) goto L34
            java.util.Collections.sort(r7, r0)
        L34:
            int r6 = r7.size()
            r5 = 0
            r12 = 0
            r4 = 0
            r13 = 0
            r1 = 0
        L3d:
            if (r4 >= r6) goto L8d
            java.lang.Object r10 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r4)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()
            X.06F r3 = (X.C06F) r3
            X.06C r0 = r3.LIZ
            r2 = 1
            r11 = r25
            if (r13 != 0) goto L54
            if (r1 == 0) goto L7d
        L54:
            if (r14 == 0) goto L7b
            if (r0 == 0) goto L70
            if (r12 != 0) goto L6c
            long r15 = android.os.SystemClock.uptimeMillis()
            r19 = 3
            r20 = 0
            r17 = r15
            r21 = r20
            r22 = r5
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
        L6c:
            if (r11 == 0) goto L77
            if (r11 == r2) goto L73
        L70:
            int r4 = r4 + 1
            goto L3d
        L73:
            r0.onTouchEvent(r9, r10, r12)
            goto L70
        L77:
            r0.onInterceptTouchEvent(r9, r10, r12)
            goto L70
        L7b:
            if (r13 != 0) goto L83
        L7d:
            if (r0 == 0) goto L83
            if (r11 == 0) goto Lac
            if (r11 == r2) goto La7
        L83:
            X.06C r0 = r3.LIZ
            if (r0 != 0) goto L89
            r3.LJIIL = r5
        L89:
            boolean r1 = r3.LJIIL
            if (r1 == 0) goto L91
        L8d:
            r7.clear()
            return r13
        L91:
            if (r0 == 0) goto La5
            boolean r0 = r0.blocksInteractionBelow(r9, r10)
        L97:
            r3.LJIIL = r0
            if (r0 == 0) goto L9f
            if (r1 != 0) goto L8d
        L9d:
            r1 = r2
            goto L70
        L9f:
            r2 = 0
            if (r0 == 0) goto L9d
            if (r5 != 0) goto L9d
            goto L8d
        La5:
            r0 = 0
            goto L97
        La7:
            boolean r13 = r0.onTouchEvent(r9, r10, r8)
            goto Lb0
        Lac:
            boolean r13 = r0.onInterceptTouchEvent(r9, r10, r8)
        Lb0:
            if (r13 == 0) goto L83
            r9.LJLLI = r10
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45621qg.LJIIL(android.view.MotionEvent, int):boolean");
    }

    @Override // X.C1V0
    public void LJIILJJIL(int i, View view) {
        this.LJZL.LIZIZ(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C06F c06f = (C06F) childAt.getLayoutParams();
            if (c06f.LIZ(i)) {
                C06C c06c = c06f.LIZ;
                if (c06c != null) {
                    c06c.onStopNestedScroll(this, childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        c06f.LJIILJJIL = false;
                    }
                } else {
                    c06f.LJIILIIL = false;
                }
                c06f.LJIILL = false;
            }
        }
        this.LJLLILLLL = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
    
        if (r21 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0157, code lost:
    
        r29 = java.lang.Math.max(0, (r20 - r22) - r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
    
        if (r21 != false) goto L62;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45621qg.onMeasure(int, int):void");
    }

    public C45621qg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new C00G<>();
        this.LJLJI = new ArrayList();
        this.LJLJJI = new ArrayList();
        this.LJLJJLL = new int[2];
        this.LJLJL = new int[2];
        this.LJZL = new C16690l7();
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ajx, R.attr.bet}, 0, R.style.a2g);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ajx, R.attr.bet}, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, new int[]{R.attr.ajx, R.attr.bet}, attributeSet, obtainStyledAttributes, 0, R.style.a2g);
            } else {
                saveAttributeDataForStyleable(context, new int[]{R.attr.ajx, R.attr.bet}, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.LJLL = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.LJLL[i2] = (int) (r1[i2] * f);
            }
        }
        this.LJLZ = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        LJIJJ();
        super.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.06E
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = C45621qg.this.LJZ;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
                C45621qg.this.LJIIIZ(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = C45621qg.this.LJZ;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
            }
        });
        if (C16300kU.LIZJ(this) == 0) {
            C16300kU.LJIJ(this, 1);
        }
    }

    public final void LIZJ(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            LJ(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final boolean LJII(int i, int i2, View view) {
        Rect LIZ = LIZ();
        LJ(LIZ, view);
        try {
            return LIZ.contains(i, i2);
        } finally {
            LJIILLIIL(LIZ);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C06F c06f = (C06F) view.getLayoutParams();
        C06C c06c = c06f.LIZ;
        if (c06c != null) {
            float scrimOpacity = c06c.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.LJLJJL == null) {
                    this.LJLJJL = new Paint();
                }
                this.LJLJJL.setColor(c06f.LIZ.getScrimColor(this, view));
                Paint paint = this.LJLJJL;
                int round = Math.round(scrimOpacity * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.LJLJJL);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        C06C c06c;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C06F c06f = (C06F) childAt.getLayoutParams();
                if (c06f.LIZ(0) && (c06c = c06f.LIZ) != null) {
                    z |= c06c.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        LJIILL(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return LJJLIIJ(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C06C c06c = ((C06F) view.getLayoutParams()).LIZ;
        if (c06c != null && c06c.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public final void LIZIZ(C06F c06f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c06f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c06f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c06f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c06f).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // X.C1V0
    public final void LJIILL(View view, View view2, int i, int i2) {
        C06C c06c;
        this.LJZL.LIZ(i, i2);
        this.LJLLILLLL = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C06F c06f = (C06F) childAt.getLayoutParams();
            if (c06f.LIZ(i2) && (c06c = c06f.LIZ) != null) {
                c06c.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // X.C1V0
    public boolean LJJLIIJ(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C06F c06f = (C06F) childAt.getLayoutParams();
                C06C c06c = c06f.LIZ;
                if (c06c != null) {
                    boolean onStartNestedScroll = c06c.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            c06f.LJIILJJIL = onStartNestedScroll;
                        }
                    } else {
                        c06f.LJIILIIL = onStartNestedScroll;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        c06f.LJIILJJIL = false;
                    }
                } else {
                    c06f.LJIILIIL = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C06C c06c;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C06F c06f = (C06F) childAt.getLayoutParams();
                if (c06f.LIZ(0) && (c06c = c06f.LIZ) != null) {
                    z2 |= c06c.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            LJIIIZ(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        LJJIIJ(view, i, i2, iArr, 0);
    }

    public final void LJIIJJI(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // X.C1V0
    public void LJJIIJ(View view, int i, int i2, int[] iArr, int i3) {
        C06C c06c;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C06F c06f = (C06F) childAt.getLayoutParams();
                if (c06f.LIZ(i3) && (c06c = c06f.LIZ) != null) {
                    int[] iArr2 = this.LJLJJLL;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    c06c.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.LJLJJLL;
                    if (i > 0) {
                        i4 = Math.max(i4, iArr3[0]);
                    } else {
                        i4 = Math.min(i4, iArr3[0]);
                    }
                    int[] iArr4 = this.LJLJJLL;
                    if (i2 > 0) {
                        i5 = Math.max(i5, iArr4[1]);
                    } else {
                        i5 = Math.min(i5, iArr4[1]);
                    }
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            LJIIIZ(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C06C c06c;
        int LIZLLL = C16310kV.LIZLLL(this);
        int size = ((ArrayList) this.LJLIL).size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) ListProtector.get(this.LJLIL, i5);
            if (view.getVisibility() != 8 && ((c06c = ((C06F) view.getLayoutParams()).LIZ) == null || !c06c.onLayoutChild(this, view, LIZLLL))) {
                LJIIJ(LIZLLL, view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        LJJ(view, i, i2, i3, i4, 0);
    }

    public static void LJFF(int i, Rect rect, Rect rect2, C06F c06f, int i2, int i3) {
        int width;
        int height;
        int i4 = c06f.LIZJ;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c06f.LIZLLL;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    @Override // X.C1V0
    public void LJJ(View view, int i, int i2, int i3, int i4, int i5) {
        LJJIJIL(view, i, i2, i3, i4, 0, this.LJLJL);
    }

    @Override // X.InterfaceC43251mr
    public void LJJIJIL(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C06C c06c;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C06F c06f = (C06F) childAt.getLayoutParams();
                if (c06f.LIZ(i5) && (c06c = c06f.LIZ) != null) {
                    int[] iArr2 = this.LJLJJLL;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    c06c.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.LJLJJLL;
                    if (i3 > 0) {
                        i6 = Math.max(i6, iArr3[0]);
                    } else {
                        i6 = Math.min(i6, iArr3[0]);
                    }
                    if (i4 > 0) {
                        i7 = Math.max(i7, this.LJLJJLL[1]);
                    } else {
                        i7 = Math.min(i7, this.LJLJJLL[1]);
                    }
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            LJIIIZ(1);
        }
    }
}
