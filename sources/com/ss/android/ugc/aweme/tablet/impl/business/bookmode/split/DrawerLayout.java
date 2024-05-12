package com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split;

import X.C04270Et;
import X.C16300kU;
import X.C16310kV;
import X.C16360ka;
import X.C17M;
import X.C270714l;
import X.C53946LFe;
import X.C79815VUd;
import X.C79816VUe;
import X.C80722VmA;
import X.C80723VmB;
import X.C80724VmC;
import X.C80726VmE;
import X.C80729VmH;
import X.C80730VmI;
import X.InterfaceC80728VmG;
import X.ViewOnApplyWindowInsetsListenerC80725VmD;
import X.X1D;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.customview.view.AbsSavedState;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes15.dex */
public final class DrawerLayout extends ViewGroup {
    public static final int[] LLIFFJFJJ = {R.attr.colorPrimaryDark};
    public static final int[] LLII = {R.attr.layout_gravity};
    public float LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;
    public final Paint LJLJJL;
    public final C270714l LJLJJLL;
    public final C270714l LJLJL;
    public final C80722VmA LJLJLJ;
    public final C80722VmA LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public InterfaceC80728VmG LJZ;
    public List<InterfaceC80728VmG> LJZI;
    public float LJZL;
    public float LL;
    public Drawable LLD;
    public Object LLF;
    public boolean LLFF;
    public final ArrayList<View> LLFFF;
    public Rect LLFII;
    public Matrix LLFZ;
    public final C80723VmB LLI;

    public static /* synthetic */ void getMLockModeEnd$annotations() {
    }

    public static /* synthetic */ void getMLockModeLeft$annotations() {
    }

    public static /* synthetic */ void getMLockModeRight$annotations() {
    }

    public static /* synthetic */ void getMLockModeStart$annotations() {
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    public final boolean LJIIJJI() {
        C80723VmB c80723VmB = this.LLI;
        if (c80723VmB != null) {
            return c80723VmB.LIZ.LJIIL(c80723VmB.LIZIZ);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C80724VmC();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.LJLLI) {
            super.requestLayout();
        }
    }

    public final View LJI() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
            if ((((C80724VmC) layoutParams).LIZLLL & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View LJII() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            o.LJIIIIZZ(child, "child");
            if (LJIILJJIL(child)) {
                if (LJIILJJIL(child)) {
                    ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
                    if (((C80724VmC) layoutParams).LIZIZ > 0.0f) {
                        return child;
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("View ");
                    LIZ.append(child);
                    LIZ.append(" is not a drawer");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    LIZIZ.toString();
                    throw new IllegalArgumentException(LIZIZ);
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
            f = Math.max(f, ((C80724VmC) layoutParams).LIZIZ);
        }
        this.LJLJJI = f;
        boolean LJIIIIZZ = this.LJLJJLL.LJIIIIZZ();
        boolean LJIIIIZZ2 = this.LJLJL.LJIIIIZZ();
        if (LJIIIIZZ || LJIIIIZZ2) {
            C16300kU.LJIIJ(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLLILLLL = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLLILLLL = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        o.LJI(onSaveInstanceState);
        SavedState savedState = new SavedState(onSaveInstanceState);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
            C80724VmC c80724VmC = (C80724VmC) layoutParams;
            int i2 = c80724VmC.LIZLLL;
            boolean z = true;
            if (i2 != 1) {
                if (i2 != 2) {
                    z = false;
                }
                if (0 == 0 && !z) {
                }
            }
            savedState.openDrawerGravity = c80724VmC.LIZ;
            break;
        }
        savedState.lockModeLeft = this.LJLLJ;
        savedState.lockModeRight = this.LJLLL;
        savedState.lockModeStart = this.LJLLLL;
        savedState.lockModeEnd = this.LJLLLLLL;
        return savedState;
    }

    public final float getDrawerElevation() {
        return this.LJLIL;
    }

    public final Drawable getStatusBarBackgroundDrawable() {
        return this.LLD;
    }

    /* loaded from: classes15.dex */
    public static final class SavedState extends AbsSavedState {
        public int lockModeEnd;
        public int lockModeLeft;
        public int lockModeRight;
        public int lockModeStart;
        public int openDrawerGravity;
        public static final C80730VmI Companion = new C80730VmI();
        public static final Parcelable.Creator<SavedState> CREATOR = new C80726VmE();

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel in, ClassLoader classLoader) {
            super(in, classLoader);
            o.LJIIIZ(in, "in");
            this.openDrawerGravity = in.readInt();
            this.lockModeLeft = in.readInt();
            this.lockModeRight = in.readInt();
            this.lockModeStart = in.readInt();
            this.lockModeEnd = in.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            o.LJIIIZ(dest, "dest");
            super.writeToParcel(dest, i);
            dest.writeInt(this.openDrawerGravity);
            dest.writeInt(this.lockModeLeft);
            dest.writeInt(this.lockModeRight);
            dest.writeInt(this.lockModeStart);
            dest.writeInt(this.lockModeEnd);
        }
    }

    public static boolean LJIIJ(View child) {
        o.LJIIIZ(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
        if (((C80724VmC) layoutParams).LIZ == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL(View view) {
        if (LJIILJJIL(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
            if ((((C80724VmC) layoutParams).LIZLLL & 1) == 1) {
                return true;
            }
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a drawer");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static boolean LJIILJJIL(View child) {
        o.LJIIIZ(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
        int absoluteGravity = Gravity.getAbsoluteGravity(((C80724VmC) layoutParams).LIZ, C16310kV.LIZLLL(child));
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public final void LIZ(InterfaceC80728VmG listener) {
        o.LJIIIZ(listener, "listener");
        if (this.LJZI == null) {
            this.LJZI = new ArrayList();
        }
        List<InterfaceC80728VmG> list = this.LJZI;
        o.LJI(list);
        list.add(listener);
    }

    public final void LJ(boolean z) {
        boolean LJIJJLI;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
            C80724VmC c80724VmC = (C80724VmC) layoutParams;
            if (LJIILJJIL(childAt) && (!z || c80724VmC.LIZJ)) {
                int width = childAt.getWidth();
                if (LIZIZ(childAt, 3)) {
                    LJIJJLI = this.LJLJJLL.LJIJJLI(-width, childAt.getTop(), childAt);
                } else {
                    LJIJJLI = this.LJLJL.LJIJJLI(getWidth(), childAt.getTop(), childAt);
                }
                z2 |= LJIJJLI;
                c80724VmC.LIZJ = false;
            }
        }
        C80722VmA c80722VmA = this.LJLJLJ;
        c80722VmA.LIZLLL.removeCallbacks(c80722VmA.LIZJ);
        C80722VmA c80722VmA2 = this.LJLJLLL;
        c80722VmA2.LIZLLL.removeCallbacks(c80722VmA2.LIZJ);
        if (z2) {
            invalidate();
        }
    }

    public final View LJFF(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C16310kV.LIZLLL(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            o.LJIIIIZZ(child, "child");
            if ((LJIIIZ(child) & 7) == absoluteGravity) {
                return child;
            }
        }
        return null;
    }

    public final int LJIIIIZZ(View drawerView) {
        int i;
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(drawerView, "drawerView");
        if (LJIILJJIL(drawerView)) {
            ViewGroup.LayoutParams layoutParams = drawerView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
            int i5 = ((C80724VmC) layoutParams).LIZ;
            int LIZLLL = C16310kV.LIZLLL(this);
            if (i5 != 3) {
                if (i5 != 5) {
                    if (i5 != 8388611) {
                        if (i5 == 8388613) {
                            int i6 = this.LJLLLLLL;
                            if (i6 != 3) {
                                return i6;
                            }
                            if (LIZLLL == 0) {
                                i4 = this.LJLLL;
                            } else {
                                i4 = this.LJLLJ;
                            }
                            if (i4 != 3) {
                                return i4;
                            }
                        }
                    } else {
                        int i7 = this.LJLLLL;
                        if (i7 != 3) {
                            return i7;
                        }
                        if (LIZLLL == 0) {
                            i3 = this.LJLLJ;
                        } else {
                            i3 = this.LJLLL;
                        }
                        if (i3 != 3) {
                            return i3;
                        }
                    }
                } else {
                    int i8 = this.LJLLL;
                    if (i8 != 3) {
                        return i8;
                    }
                    if (LIZLLL == 0) {
                        i2 = this.LJLLLLLL;
                    } else {
                        i2 = this.LJLLLL;
                    }
                    if (i2 != 3) {
                        return i2;
                    }
                }
            } else {
                int i9 = this.LJLLJ;
                if (i9 != 3) {
                    return i9;
                }
                if (LIZLLL == 0) {
                    i = this.LJLLLL;
                } else {
                    i = this.LJLLLLLL;
                }
                if (i != 3) {
                    return i;
                }
            }
            return 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(drawerView);
        LIZ.append(" is not a drawer");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final int LJIIIZ(View drawerView) {
        o.LJIIIZ(drawerView, "drawerView");
        ViewGroup.LayoutParams layoutParams = drawerView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
        return Gravity.getAbsoluteGravity(((C80724VmC) layoutParams).LIZ, C16310kV.LIZLLL(this));
    }

    public final boolean LJIIL(int i) {
        View LJFF = LJFF(i);
        if (LJFF != null) {
            return LJIILIIL(LJFF);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        o.LJIIIZ(p, "p");
        if ((p instanceof C80724VmC) && super.checkLayoutParams(p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent event) {
        boolean dispatchGenericMotionEvent;
        o.LJIIIZ(event, "event");
        if ((event.getSource() & 2) == 0 || event.getAction() == 10 || this.LJLJJI <= 0.0f) {
            return super.dispatchGenericMotionEvent(event);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = event.getX();
            float y = event.getY();
            for (int i = childCount - 1; -1 < i; i--) {
                View child = getChildAt(i);
                o.LJIIIIZZ(child, "child");
                if (this.LLFII == null) {
                    this.LLFII = new Rect();
                }
                child.getHitRect(this.LLFII);
                Rect rect = this.LLFII;
                o.LJI(rect);
                if (rect.contains((int) x, (int) y) && !LJIIJ(child)) {
                    if (!child.getMatrix().isIdentity()) {
                        float scrollX = getScrollX() - child.getLeft();
                        float scrollY = getScrollY() - child.getTop();
                        MotionEvent obtain = MotionEvent.obtain(event);
                        obtain.offsetLocation(scrollX, scrollY);
                        Matrix matrix = child.getMatrix();
                        if (!matrix.isIdentity()) {
                            if (this.LLFZ == null) {
                                this.LLFZ = new Matrix();
                            }
                            matrix.invert(this.LLFZ);
                            obtain.transform(this.LLFZ);
                        }
                        dispatchGenericMotionEvent = child.dispatchGenericMotionEvent(obtain);
                        obtain.recycle();
                    } else {
                        float scrollX2 = getScrollX() - child.getLeft();
                        float scrollY2 = getScrollY() - child.getTop();
                        event.offsetLocation(scrollX2, scrollY2);
                        dispatchGenericMotionEvent = child.dispatchGenericMotionEvent(event);
                        event.offsetLocation(-scrollX2, -scrollY2);
                    }
                    if (dispatchGenericMotionEvent) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        Integer valueOf;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(ev, "ev");
        C80723VmB c80723VmB = this.LLI;
        if (c80723VmB != null && (valueOf = Integer.valueOf(ev.getActionMasked())) != null) {
            if (valueOf.intValue() == 0) {
                c80723VmB.LJFF = ev.getX();
                c80723VmB.LJI = ev.getY();
                c80723VmB.LJIIIIZZ = false;
                c80723VmB.LJIIIZ = 0;
                c80723VmB.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (valueOf.intValue() == 2) {
                float x = ev.getX() - c80723VmB.LJFF;
                float y = ev.getY() - c80723VmB.LJI;
                if (C80723VmB.LIZIZ(c80723VmB, x, y)) {
                    if (c80723VmB.LJIIIZ == 0) {
                        if (c80723VmB.LJIIIIZZ) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        c80723VmB.LJIIIZ = i;
                        if (i == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (Math.abs(y) * c80723VmB.LJ <= Math.abs(x) && !c80723VmB.LIZ.LJIIL(c80723VmB.LIZIZ)) {
                            if (C16310kV.LIZLLL(c80723VmB.LIZ) == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2 ? x <= 0.0f : x >= 0.0f) {
                                ViewParent parent = c80723VmB.LIZ.getParent();
                                if (c80723VmB.LJII == 2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                parent.requestDisallowInterceptTouchEvent(z3);
                                return false;
                            }
                        }
                        c80723VmB.LIZ.getParent().requestDisallowInterceptTouchEvent(z);
                        return false;
                    }
                } else {
                    c80723VmB.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        o.LJIIIZ(p, "p");
        if (p instanceof C80724VmC) {
            return new C80724VmC((C80724VmC) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new C80724VmC((ViewGroup.MarginLayoutParams) p);
        }
        return new C80724VmC(p);
    }

    @Override // android.view.View
    public final void onDraw(Canvas c) {
        Object obj;
        o.LJIIIZ(c, "c");
        super.onDraw(c);
        if (this.LLFF && this.LLD != null && (obj = this.LLF) != null) {
            o.LJII(obj, "null cannot be cast to non-null type android.view.WindowInsets");
            int systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                Drawable drawable = this.LLD;
                o.LJI(drawable);
                drawable.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                Drawable drawable2 = this.LLD;
                o.LJI(drawable2);
                drawable2.draw(c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cf, code lost:
    
        if (r7.LIZ.LJIIL(r7.LIZIZ) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0115, code lost:
    
        if ((java.lang.Math.abs(r1) * r7.LJ) > java.lang.Math.abs(r2)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        if (r5 != 3) goto L11;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        View LJFF;
        o.LJIIIZ(state, "state");
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.mSuperState);
        int i = savedState.openDrawerGravity;
        if (i != 0 && (LJFF = LJFF(i)) != null) {
            LJIIZILJ(LJFF, true);
        }
        int i2 = savedState.lockModeLeft;
        if (i2 != 3) {
            LJIJ(i2, 3);
        }
        int i3 = savedState.lockModeRight;
        if (i3 != 3) {
            LJIJ(i3, 5);
        }
        int i4 = savedState.lockModeStart;
        if (i4 != 3) {
            LJIJ(i4, 8388611);
        }
        int i5 = savedState.lockModeEnd;
        if (i5 != 3) {
            LJIJ(i5, 8388613);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (LJIIIIZZ(r0) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.14l r0 = r7.LJLJJLL
            r0.LJIILIIL(r8)
            X.14l r0 = r7.LJLJL
            r0.LJIILIIL(r8)
            int r0 = r8.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L62
            if (r1 == r2) goto L25
            r0 = 3
            if (r1 == r0) goto L1f
        L1e:
            return r2
        L1f:
            r7.LJ(r2)
            r7.LJLZ = r3
            goto L1e
        L25:
            float r6 = r8.getX()
            float r5 = r8.getY()
            X.14l r4 = r7.LJLJJLL
            int r1 = (int) r6
            int r0 = (int) r5
            android.view.View r0 = r4.LJIIJJI(r1, r0)
            if (r0 == 0) goto L5d
            boolean r0 = LJIIJ(r0)
            if (r0 == 0) goto L5d
            float r0 = r7.LJZL
            float r6 = r6 - r0
            float r0 = r7.LL
            float r5 = r5 - r0
            X.14l r0 = r7.LJLJJLL
            int r0 = r0.LIZIZ
            float r6 = r6 * r6
            float r5 = r5 * r5
            float r5 = r5 + r6
            int r0 = r0 * r0
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5d
            android.view.View r0 = r7.LJI()
            if (r0 == 0) goto L5d
            int r1 = r7.LJIIIIZZ(r0)
            r0 = 2
            if (r1 != r0) goto L5e
        L5d:
            r3 = 1
        L5e:
            r7.LJ(r3)
            goto L1e
        L62:
            float r1 = r8.getX()
            float r0 = r8.getY()
            r7.LJZL = r1
            r7.LL = r0
            r7.LJLZ = r3
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        C80723VmB c80723VmB = this.LLI;
        if (c80723VmB != null) {
            c80723VmB.LJIIIIZZ = z;
        }
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            LJ(true);
        }
    }

    public final void setDrawerElevation(float f) {
        this.LJLIL = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            o.LJIIIIZZ(child, "child");
            if (LJIILJJIL(child)) {
                C16360ka.LJIJ(child, this.LJLIL);
            }
        }
    }

    public final void setDrawerListener(InterfaceC80728VmG interfaceC80728VmG) {
        InterfaceC80728VmG interfaceC80728VmG2 = this.LJZ;
        if (interfaceC80728VmG2 != null) {
            o.LJI(interfaceC80728VmG2);
            List<InterfaceC80728VmG> list = this.LJZI;
            if (list != null) {
                ((ArrayList) list).remove(interfaceC80728VmG2);
            }
        }
        if (interfaceC80728VmG != null) {
            LIZ(interfaceC80728VmG);
        }
        this.LJZ = interfaceC80728VmG;
    }

    public final void setDrawerLockMode(int i) {
        LJIJ(i, 3);
        LJIJ(i, 5);
    }

    public final void setScrimColor(int i) {
        this.LJLJI = i;
        invalidate();
    }

    public final void setSplitDragType(int i) {
        C270714l c270714l;
        C80723VmB c80723VmB = this.LLI;
        if (c80723VmB == null || c80723VmB.LJII == i) {
            return;
        }
        c80723VmB.LJII = i;
        if (i != 0) {
            if (i != 1 && i != 2) {
                return;
            }
            c80723VmB.LIZ.LJIJ(3, c80723VmB.LIZIZ);
            int i2 = c80723VmB.LJII;
            if (i2 == 0 || (c270714l = c80723VmB.LIZJ) == null) {
                return;
            }
            int i3 = c270714l.LJIILL;
            if (i2 == 1) {
                i3 = C53946LFe.LIZJ(null, null).LIZIZ;
            }
            C270714l c270714l2 = c80723VmB.LIZJ;
            if (i3 == c270714l2.LJIILJJIL) {
                return;
            }
            c270714l2.LJIILJJIL = i3;
            return;
        }
        c80723VmB.LIZ.LJIJ(1, c80723VmB.LIZIZ);
    }

    public final void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C04270Et.LIZIZ(getContext(), i);
        } else {
            drawable = null;
        }
        this.LLD = drawable;
        invalidate();
    }

    public final void setStatusBarBackgroundColor(int i) {
        this.LLD = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o.LJIIIZ(attrs, "attrs");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        return new C80724VmC(context, attrs);
    }

    public final void setStatusBarBackground(Drawable drawable) {
        this.LLD = drawable;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        new C79816VUe();
        this.LJLJI = -1728053248;
        this.LJLJJL = new Paint();
        this.LJLLILLLL = true;
        this.LJLLJ = 3;
        this.LJLLL = 3;
        this.LJLLLL = 3;
        this.LJLLLLLL = 3;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.LJLILLLLZI = (int) ((64 * f) + 0.5f);
        float f2 = LiveChatShowDelayForHotLiveSetting.DEFAULT * f;
        C80722VmA c80722VmA = new C80722VmA(this, 3);
        this.LJLJLJ = c80722VmA;
        C80722VmA c80722VmA2 = new C80722VmA(this, 5);
        this.LJLJLLL = c80722VmA2;
        C270714l LJIIJ = C270714l.LJIIJ(this, c80722VmA);
        this.LJLJJLL = LJIIJ;
        LJIIJ.LJIILLIIL = 1;
        LJIIJ.LJIILIIL = f2;
        c80722VmA.LIZIZ = LJIIJ;
        C270714l LJIIJ2 = C270714l.LJIIJ(this, c80722VmA2);
        this.LJLJL = LJIIJ2;
        LJIIJ2.LJIILLIIL = 2;
        LJIIJ2.LJIILIIL = f2;
        c80722VmA2.LIZIZ = LJIIJ2;
        setFocusableInTouchMode(true);
        C16300kU.LJIJ(this, 1);
        h0.LJIJI(this, new C79815VUd(this));
        setMotionEventSplittingEnabled(false);
        if (C16300kU.LIZIZ(this)) {
            setOnApplyWindowInsetsListener(ViewOnApplyWindowInsetsListenerC80725VmD.LIZ);
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(LLIFFJFJJ);
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttributes(THEME_ATTRS)");
            try {
                this.LLD = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.LJLIL = 10 * f;
        this.LLFFF = new ArrayList<>();
        this.LLI = new C80723VmB(this, LJIIJ2);
    }

    public final boolean LIZIZ(View drawerView, int i) {
        o.LJIIIZ(drawerView, "drawerView");
        if ((LJIIIZ(drawerView) & i) == i) {
            return true;
        }
        return false;
    }

    public final void LIZJ(int i, boolean z) {
        View LJFF = LJFF(i);
        if (LJFF != null) {
            LIZLLL(LJFF, z);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No drawer view found with gravity ");
        LIZ.append(C80729VmH.LIZ(i));
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final void LIZLLL(View view, boolean z) {
        if (LJIILJJIL(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
            C80724VmC c80724VmC = (C80724VmC) layoutParams;
            if (this.LJLLILLLL) {
                c80724VmC.LIZIZ = 0.0f;
                c80724VmC.LIZLLL = 0;
            } else if (z) {
                c80724VmC.LIZLLL |= 4;
                if (LIZIZ(view, 3)) {
                    this.LJLJJLL.LJIJJLI(-view.getWidth(), view.getTop(), view);
                } else {
                    this.LJLJL.LJIJJLI(getWidth(), view.getTop(), view);
                }
            } else {
                LJIILL(view, 0.0f);
                LJIJJLI(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a sliding drawer");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final void LJIILL(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
        float f2 = ((C80724VmC) layoutParams).LIZIZ;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!LIZIZ(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        LJIJI(view, f);
    }

    public final void LJIILLIIL(int i, boolean z) {
        View LJFF = LJFF(i);
        if (LJFF != null) {
            LJIIZILJ(LJFF, z);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No drawer view found with gravity ");
        LIZ.append(C80729VmH.LIZ(i));
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final void LJIIZILJ(View view, boolean z) {
        if (LJIILJJIL(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
            C80724VmC c80724VmC = (C80724VmC) layoutParams;
            if (this.LJLLILLLL) {
                c80724VmC.LIZIZ = 1.0f;
                c80724VmC.LIZLLL = 1;
                LJIJJ(view, true);
            } else if (z) {
                c80724VmC.LIZLLL |= 2;
                if (LIZIZ(view, 3)) {
                    this.LJLJJLL.LJIJJLI(0, view.getTop(), view);
                } else {
                    this.LJLJL.LJIJJLI(getWidth() - view.getWidth(), view.getTop(), view);
                }
            } else {
                LJIILL(view, 1.0f);
                LJIJJLI(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a sliding drawer");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final void LJIJ(int i, int i2) {
        C270714l c270714l;
        View LJFF;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, C16310kV.LIZLLL(this));
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 8388611) {
                    if (i2 == 8388613) {
                        this.LJLLLLLL = i;
                    }
                } else {
                    this.LJLLLL = i;
                }
            } else {
                this.LJLLL = i;
            }
        } else {
            this.LJLLJ = i;
        }
        if (i != 0) {
            if (absoluteGravity == 3) {
                c270714l = this.LJLJJLL;
            } else {
                c270714l = this.LJLJL;
            }
            c270714l.LIZIZ();
            if (i != 1) {
                if (i != 2 || (LJFF = LJFF(absoluteGravity)) == null) {
                    return;
                }
                LJIIZILJ(LJFF, true);
                return;
            }
            View LJFF2 = LJFF(absoluteGravity);
            if (LJFF2 == null) {
                return;
            }
            LIZLLL(LJFF2, true);
        }
    }

    public final void LJIJI(View drawerView, float f) {
        o.LJIIIZ(drawerView, "drawerView");
        ViewGroup.LayoutParams layoutParams = drawerView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
        C80724VmC c80724VmC = (C80724VmC) layoutParams;
        if (f == c80724VmC.LIZIZ) {
            return;
        }
        c80724VmC.LIZIZ = f;
        List<InterfaceC80728VmG> list = this.LJZI;
        if (list != null) {
            for (int size = ((ArrayList) list).size() - 1; -1 < size; size--) {
                List<InterfaceC80728VmG> list2 = this.LJZI;
                o.LJI(list2);
                ((InterfaceC80728VmG) ListProtector.get(list2, size)).onDrawerSlide(drawerView, f);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        X.C16300kU.LJIJ(r1, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1 == r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (LJIILJJIL(r1) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        X.C16300kU.LJIJ(r1, 4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            int r3 = r4.getChildCount()
            r2 = 0
        L5:
            if (r2 >= r3) goto L26
            android.view.View r1 = r4.getChildAt(r2)
            if (r6 != 0) goto L1f
            java.lang.String r0 = "child"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = LJIILJJIL(r1)
            if (r0 == 0) goto L21
        L18:
            r0 = 4
            X.C16300kU.LJIJ(r1, r0)
        L1c:
            int r2 = r2 + 1
            goto L5
        L1f:
            if (r1 != r5) goto L18
        L21:
            r0 = 1
            X.C16300kU.LJIJ(r1, r0)
            goto L1c
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LJIJJ(android.view.View, boolean):void");
    }

    public final void LJIJJLI(int i, View view) {
        int i2;
        boolean z;
        View rootView;
        int i3 = this.LJLJJLL.LIZ;
        int i4 = this.LJLJL.LIZ;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
            float f = ((C80724VmC) layoutParams).LIZIZ;
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
                C80724VmC c80724VmC = (C80724VmC) layoutParams2;
                if ((c80724VmC.LIZLLL & 1) == 1) {
                    c80724VmC.LIZLLL = 0;
                    List<InterfaceC80728VmG> list = this.LJZI;
                    if (list != null) {
                        for (int size = ((ArrayList) list).size() - 1; -1 < size; size--) {
                            List<InterfaceC80728VmG> list2 = this.LJZI;
                            o.LJI(list2);
                            ((InterfaceC80728VmG) ListProtector.get(list2, size)).onDrawerClosed(view);
                        }
                    }
                    LJIJJ(view, false);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
                C80724VmC c80724VmC2 = (C80724VmC) layoutParams3;
                if ((c80724VmC2.LIZLLL & 1) == 0) {
                    c80724VmC2.LIZLLL = 1;
                    List<InterfaceC80728VmG> list3 = this.LJZI;
                    if (list3 != null) {
                        for (int size2 = ((ArrayList) list3).size() - 1; -1 < size2; size2--) {
                            List<InterfaceC80728VmG> list4 = this.LJZI;
                            o.LJI(list4);
                            ((InterfaceC80728VmG) ListProtector.get(list4, size2)).onDrawerOpened(view);
                        }
                    }
                    LJIJJ(view, true);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.LJLL) {
            this.LJLL = i2;
            List<InterfaceC80728VmG> list5 = this.LJZI;
            if (list5 != null) {
                for (int size3 = ((ArrayList) list5).size() - 1; -1 < size3; size3--) {
                    List<InterfaceC80728VmG> list6 = this.LJZI;
                    o.LJI(list6);
                    ((InterfaceC80728VmG) ListProtector.get(list6, size3)).LIZ();
                }
            }
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if (i == 4 && LJII() != null) {
            event.startTracking();
            return true;
        }
        return super.onKeyDown(i, event);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if (i == 4) {
            View LJII = LJII();
            if (LJII == null) {
                return false;
            }
            if (LJIIIIZZ(LJII) == 0) {
                LJ(false);
            }
            return true;
        }
        return super.onKeyUp(i, event);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
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
        if (this.LLF != null && C16300kU.LIZIZ(this)) {
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
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
                C80724VmC c80724VmC = (C80724VmC) layoutParams;
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c80724VmC.LIZ, LIZLLL);
                    if (C16300kU.LIZIZ(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.LLF;
                        if (absoluteGravity != 3) {
                            if (absoluteGravity == 5) {
                                o.LJI(windowInsets);
                                windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                        } else {
                            o.LJI(windowInsets);
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.LLF;
                        if (absoluteGravity != 3) {
                            if (absoluteGravity == 5) {
                                o.LJI(windowInsets2);
                                windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                            }
                        } else {
                            o.LJI(windowInsets2);
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        }
                        o.LJI(windowInsets2);
                        ((ViewGroup.MarginLayoutParams) c80724VmC).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c80724VmC).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c80724VmC).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c80724VmC).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (LJIIJ(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c80724VmC).leftMargin) - ((ViewGroup.MarginLayoutParams) c80724VmC).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c80724VmC).topMargin) - ((ViewGroup.MarginLayoutParams) c80724VmC).bottomMargin, 1073741824));
                } else if (LJIILJJIL(childAt)) {
                    float LJIIIIZZ = C16360ka.LJIIIIZZ(childAt);
                    float f = this.LJLIL;
                    if (LJIIIIZZ != f) {
                        C16360ka.LJIJ(childAt, f);
                    }
                    int LJIIIZ = LJIIIZ(childAt) & 7;
                    if (LJIIIZ == 3) {
                        if (!z2) {
                            z2 = true;
                            childAt.measure(ViewGroup.getChildMeasureSpec(i, this.LJLILLLLZI + ((ViewGroup.MarginLayoutParams) c80724VmC).leftMargin + ((ViewGroup.MarginLayoutParams) c80724VmC).rightMargin, ((ViewGroup.MarginLayoutParams) c80724VmC).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c80724VmC).topMargin + ((ViewGroup.MarginLayoutParams) c80724VmC).bottomMargin, ((ViewGroup.MarginLayoutParams) c80724VmC).height));
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Child drawer has absolute gravity ");
                            LIZ.append(C80729VmH.LIZ(LJIIIZ));
                            LIZ.append(" but this DrawerLayout already has a drawer view along that edge");
                            String LIZIZ = X1D.LIZIZ(LIZ);
                            LIZIZ.toString();
                            throw new IllegalStateException(LIZIZ);
                        }
                    } else if (!z3) {
                        z3 = true;
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.LJLILLLLZI + ((ViewGroup.MarginLayoutParams) c80724VmC).leftMargin + ((ViewGroup.MarginLayoutParams) c80724VmC).rightMargin, ((ViewGroup.MarginLayoutParams) c80724VmC).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c80724VmC).topMargin + ((ViewGroup.MarginLayoutParams) c80724VmC).bottomMargin, ((ViewGroup.MarginLayoutParams) c80724VmC).height));
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Child drawer has absolute gravity ");
                        LIZ2.append(C80729VmH.LIZ(LJIIIZ));
                        LIZ2.append(" but this DrawerLayout already has a drawer view along that edge");
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        LIZIZ2.toString();
                        throw new IllegalStateException(LIZIZ2);
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Child ");
                    LIZ3.append(childAt);
                    LIZ3.append(" at index ");
                    LIZ3.append(i3);
                    LIZ3.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(X1D.LIZIZ(LIZ3));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i, int i2) {
        o.LJIIIZ(views, "views");
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View child = getChildAt(i3);
            o.LJIIIIZZ(child, "child");
            if (LJIILJJIL(child)) {
                if (LJIILIIL(child)) {
                    child.addFocusables(views, i, i2);
                    z = true;
                }
            } else {
                this.LLFFF.add(child);
            }
        }
        if (!z) {
            int size = this.LLFFF.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = ListProtector.get(this.LLFFF, i4);
                o.LJIIIIZZ(obj, "mNonDrawerViews[i]");
                View view = (View) obj;
                if (view.getVisibility() == 0) {
                    view.addFocusables(views, i, i2);
                }
            }
        }
        this.LLFFF.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
        super.addView(child, i, params);
        if (LJI() != null || LJIILJJIL(child)) {
            C16300kU.LJIJ(child, 4);
        } else {
            C16300kU.LJIJ(child, 1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        Drawable background;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(child, "child");
        int height = getHeight();
        boolean LJIIJ = LJIIJ(child);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (LJIIJ) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != child && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && LJIILJJIL(childAt) && childAt.getHeight() >= height) {
                    if (LIZIZ(childAt, 3)) {
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
        boolean drawChild = super.drawChild(canvas, child, j);
        canvas.restoreToCount(save);
        float f = this.LJLJJI;
        if (f > 0.0f && LJIIJ) {
            this.LJLJJL.setColor((((int) ((((-16777216) & r2) >>> 24) * f)) << 24) | (this.LJLJI & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.LJLJJL);
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        boolean z2;
        int i6;
        boolean z3 = true;
        this.LJLLI = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
                C80724VmC c80724VmC = (C80724VmC) layoutParams;
                if (LJIIJ(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) c80724VmC).leftMargin;
                    C17M.LIZIZ(childAt, ((ViewGroup.MarginLayoutParams) c80724VmC).topMargin, i9, ((ViewGroup.MarginLayoutParams) c80724VmC).topMargin, childAt.getMeasuredWidth() + i9);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (LIZIZ(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c80724VmC.LIZIZ * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        i5 = i7 - ((int) (c80724VmC.LIZIZ * f3));
                        f = (i7 - i5) / f3;
                    }
                    if (f == c80724VmC.LIZIZ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z4 = z3 ^ z2;
                    int i10 = c80724VmC.LIZ & 112;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            if (i10 != 80) {
                                int i11 = ((ViewGroup.MarginLayoutParams) c80724VmC).topMargin;
                                childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                            } else {
                                int i12 = i4 - i2;
                                childAt.layout(i5, (i12 - ((ViewGroup.MarginLayoutParams) c80724VmC).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - ((ViewGroup.MarginLayoutParams) c80724VmC).bottomMargin);
                            }
                        } else {
                            int i13 = ((ViewGroup.MarginLayoutParams) c80724VmC).topMargin;
                            childAt.layout(i5, i13, measuredWidth + i5, measuredHeight + i13);
                        }
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) c80724VmC).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight;
                            int i18 = i14 - ((ViewGroup.MarginLayoutParams) c80724VmC).bottomMargin;
                            if (i17 > i18) {
                                i15 = i18 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    }
                    if (z4) {
                        LJIJI(childAt, f);
                    }
                    if (c80724VmC.LIZIZ > 0.0f) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
            i8++;
            z3 = true;
        }
        this.LJLLI = false;
        this.LJLLILLLL = false;
    }
}
