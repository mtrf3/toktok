package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VWY extends C45621qg implements InterfaceC33971Uz {
    public InterfaceC65784Pro<C76800UCe> LLFII;
    public InterfaceC65784Pro<C76800UCe> LLFZ;
    public C16610kz LLI;
    public InterfaceC88473Ynt<? super View, ? super Float, ? super Float, Boolean> LLIFFJFJJ;
    public boolean LLII;

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        C16610kz c16610kz = this.LLI;
        if (c16610kz != null) {
            return c16610kz.LIZLLL;
        }
        o.LJIJI("childHelper");
        throw null;
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        C16610kz c16610kz = this.LLI;
        if (c16610kz != null) {
            c16610kz.LJIIL(i);
        } else {
            o.LJIJI("childHelper");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (motionEvent != null && motionEvent.getAction() == 0 && (interfaceC65784Pro = this.LLFZ) != null) {
            interfaceC65784Pro.invoke();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && dispatchTouchEvent && this.LLII) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return dispatchTouchEvent;
    }

    public final void setActionDownCallBack(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LLFZ = interfaceC65784Pro;
    }

    public final void setIsIntercept(boolean z) {
        this.LLII = z;
    }

    public final void setNeedInterceptScroll(InterfaceC88473Ynt<? super View, ? super Float, ? super Float, Boolean> needInterceptScroll) {
        o.LJIIIZ(needInterceptScroll, "needInterceptScroll");
        this.LLIFFJFJJ = needInterceptScroll;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C16610kz c16610kz = this.LLI;
        if (c16610kz != null) {
            c16610kz.LJIIJ(z);
        } else {
            o.LJIJI("childHelper");
            throw null;
        }
    }

    public final void setStopScrollAction(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LLFII = interfaceC65784Pro;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        C16610kz c16610kz = this.LLI;
        if (c16610kz != null) {
            return c16610kz.LJIIJJI(i, 0);
        }
        o.LJIJI("childHelper");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VWY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16610kz c16610kz = new C16610kz(this);
        this.LLI = c16610kz;
        c16610kz.LJIIJ(true);
    }

    @Override // X.C45621qg, X.C1V0
    public final void LJIILJJIL(int i, View target) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIZ(target, "target");
        super.LJIILJJIL(i, target);
        if ((target instanceof C45631qh) && (interfaceC65784Pro = this.LLFII) != null) {
            interfaceC65784Pro.invoke();
        }
        LJIIIIZZ(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        C16610kz c16610kz = this.LLI;
        if (c16610kz != null) {
            return c16610kz.LIZIZ(f, f2);
        }
        o.LJIJI("childHelper");
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        C16610kz c16610kz = this.LLI;
        if (c16610kz != null) {
            return c16610kz.LIZ(f, f2, z);
        }
        o.LJIJI("childHelper");
        throw null;
    }

    @Override // X.C45621qg, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        o.LJIIIZ(target, "target");
        boolean onNestedPreFling = super.onNestedPreFling(target, f, f2);
        InterfaceC88473Ynt<? super View, ? super Float, ? super Float, Boolean> interfaceC88473Ynt = this.LLIFFJFJJ;
        if (((interfaceC88473Ynt == null || !interfaceC88473Ynt.invoke(target, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) && dispatchNestedPreFling(f, f2)) || onNestedPreFling) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C45621qg, X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        if (i2 == 0) {
            LJIIIIZZ(1);
            if (child instanceof InterfaceC33971Uz) {
                ((InterfaceC33971Uz) child).LJIIIIZZ(1);
            }
        }
        boolean LJJLIIJ = super.LJJLIIJ(child, target, i, i2);
        C16610kz c16610kz = this.LLI;
        if (c16610kz != null) {
            if (c16610kz.LJIIJJI(i, i2) || LJJLIIJ) {
                return true;
            }
            return false;
        }
        o.LJIJI("childHelper");
        throw null;
    }

    @Override // X.C45621qg, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f, float f2, boolean z) {
        o.LJIIIZ(target, "target");
        boolean onNestedFling = super.onNestedFling(target, f, f2, z);
        InterfaceC88473Ynt<? super View, ? super Float, ? super Float, Boolean> interfaceC88473Ynt = this.LLIFFJFJJ;
        if (((interfaceC88473Ynt == null || !interfaceC88473Ynt.invoke(target, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) && dispatchNestedFling(f, f2, z)) || onNestedFling) {
            return true;
        }
        return false;
    }

    @Override // X.C45621qg, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View target, int i, int i2, int[] consumed) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        int[] iArr = new int[2];
        InterfaceC88473Ynt<? super View, ? super Float, ? super Float, Boolean> interfaceC88473Ynt = this.LLIFFJFJJ;
        if (interfaceC88473Ynt == null || !interfaceC88473Ynt.invoke(target, Float.valueOf(i), Float.valueOf(i2)).booleanValue()) {
            dispatchNestedPreScroll(i, i2, iArr, null);
            consumed[0] = consumed[0] + iArr[0];
            consumed[1] = consumed[1] + iArr[1];
            iArr[0] = 0;
            iArr[1] = 0;
        }
        super.onNestedPreScroll(target, i - consumed[0], i2 - consumed[1], iArr);
        consumed[0] = consumed[0] + iArr[0];
        consumed[1] = consumed[1] + iArr[1];
    }

    @Override // X.C45621qg, X.C1V0
    public final void LJJIIJ(View target, int i, int i2, int[] consumed, int i3) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        int[] iArr = new int[2];
        InterfaceC88473Ynt<? super View, ? super Float, ? super Float, Boolean> interfaceC88473Ynt = this.LLIFFJFJJ;
        if (interfaceC88473Ynt == null || !interfaceC88473Ynt.invoke(target, Float.valueOf(i), Float.valueOf(i2)).booleanValue()) {
            C16610kz c16610kz = this.LLI;
            if (c16610kz != null) {
                c16610kz.LIZJ(i, i2, i3, iArr, null);
                consumed[0] = consumed[0] + iArr[0];
                consumed[1] = consumed[1] + iArr[1];
                iArr[0] = 0;
                iArr[1] = 0;
            } else {
                o.LJIJI("childHelper");
                throw null;
            }
        }
        super.LJJIIJ(target, i - consumed[0], i2 - consumed[1], iArr, i3);
        consumed[0] = consumed[0] + iArr[0];
        consumed[1] = consumed[1] + iArr[1];
    }

    @Override // X.C45621qg, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View target, int i, int i2, int i3, int i4) {
        o.LJIIIZ(target, "target");
        target.getLocationInWindow(r5);
        int i5 = r5[0];
        int i6 = r5[1];
        super.onNestedScroll(target, i, i2, i3, i4);
        target.getLocationInWindow(r5);
        int i7 = r5[0] - i5;
        int i8 = r5[1] - i6;
        int[] iArr = {i7, i8};
        dispatchNestedScroll(i, i2, i3 + i7, i4 + i8, null);
    }

    @Override // X.C45621qg, X.C1V0
    public final void LJJ(View target, int i, int i2, int i3, int i4, int i5) {
        o.LJIIIZ(target, "target");
        target.getLocationInWindow(r5);
        int i6 = r5[0];
        int i7 = r5[1];
        super.LJJ(target, i, i2, i3, i4, i5);
        target.getLocationInWindow(r5);
        int i8 = r5[0] - i6;
        int i9 = r5[1] - i7;
        int[] iArr = {i8, i9};
        int i10 = i3 + i8;
        int i11 = i4 + i9;
        C16610kz c16610kz = this.LLI;
        if (c16610kz != null) {
            c16610kz.LJI(i, i2, i10, i11, null, i5);
        } else {
            o.LJIJI("childHelper");
            throw null;
        }
    }
}
