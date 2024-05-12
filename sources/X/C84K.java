package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.84K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84K extends C80766Vms implements C84O {
    public boolean LLJJJIL;
    public final C5H3 LLJJJJ;
    public boolean LLJJJJJIL;

    private final C84M getEdgeDragHandler() {
        return (C84M) this.LLJJJJ.getValue();
    }

    public final boolean getDisableScrollOnEdge() {
        return this.LLJJJJJIL;
    }

    @Override // X.C80769Vmv, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (!this.LLJJJIL) {
            return false;
        }
        if (this.LLJJJJJIL && getEdgeDragHandler().LIZ) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        boolean z = false;
        if (!this.LLJJJIL) {
            return false;
        }
        C84M edgeDragHandler = getEdgeDragHandler();
        int width = getWidth();
        edgeDragHandler.getClass();
        int action = e.getAction() & 255;
        if (action != 0) {
            if (action == 1 || action == 3) {
                edgeDragHandler.LIZ = false;
            }
        } else {
            if (e.getX() > width - ((Number) edgeDragHandler.LIZIZ.getValue()).intValue()) {
                z = true;
            }
            edgeDragHandler.LIZ = z;
        }
        return super.onInterceptTouchEvent(e);
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (!this.LLJJJIL) {
            return false;
        }
        return super.onTouchEvent(ev);
    }

    public final void setDisableScrollOnEdge(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setSlideSupported(boolean z) {
        this.LLJJJIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLJJJJ = C221108m2.LIZ(EnumC221088m0.NONE, C84L.LJLIL);
    }
}
