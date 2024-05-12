package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.RuC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71028RuC extends FrameLayout implements C1V0 {
    public InterfaceC70554RmY LJLIL;
    public C1V0 LJLILLLLZI;
    public View LJLJI;

    public final InterfaceC70554RmY getDispatchTouchInterceptor() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            InterfaceC70554RmY interfaceC70554RmY = this.LJLIL;
            if (interfaceC70554RmY != null) {
                interfaceC70554RmY.LIZ(motionEvent);
            }
        } catch (Exception unused) {
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setDispatchTouchInterceptor(InterfaceC70554RmY interfaceC70554RmY) {
        this.LJLIL = interfaceC70554RmY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71028RuC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View target) {
        C1V0 c1v0;
        o.LJIIIZ(target, "target");
        if (this.LJLJI == target && (c1v0 = this.LJLILLLLZI) != null) {
            c1v0.LJIILJJIL(i, target);
        }
    }

    @Override // X.C1V0
    public final void LJIILL(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        C1V0 c1v0 = this.LJLILLLLZI;
        if (c1v0 != null) {
            c1v0.onNestedScrollAccepted(child, target, i);
        }
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        C1V0 c1v0;
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        if (i == 2) {
            ViewParent parent = getParent();
            while (true) {
                if (parent != null) {
                    if (parent instanceof C1V0) {
                        c1v0 = (C1V0) parent;
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    c1v0 = null;
                    break;
                }
            }
            this.LJLILLLLZI = c1v0;
            this.LJLJI = target;
            if (c1v0 != null) {
                return c1v0.LJJLIIJ(child, target, i, i2);
            }
            return false;
        }
        return true;
    }

    @Override // X.C1V0
    public final void LJJIIJ(View target, int i, int i2, int[] iArr, int i3) {
        o.LJIIIZ(target, "target");
        C1V0 c1v0 = this.LJLILLLLZI;
        if (c1v0 != null) {
            c1v0.LJJIIJ(target, i, i2, iArr, i3);
        }
    }

    @Override // X.C1V0
    public final void LJJ(View target, int i, int i2, int i3, int i4, int i5) {
        o.LJIIIZ(target, "target");
        C1V0 c1v0 = this.LJLILLLLZI;
        if (c1v0 != null) {
            c1v0.LJJ(target, i, i2, i3, i4, i5);
        }
    }
}
