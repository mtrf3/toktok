package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Hzi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45890Hzi extends ConstraintLayout {
    public float LJLIL;
    public InterfaceC45901Hzt LJLILLLLZI;

    public final InterfaceC45901Hzt getGestureListener() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getActionMasked())) == null) {
            return false;
        }
        if (valueOf.intValue() == 0) {
            this.LJLIL = motionEvent.getY();
            return false;
        }
        if (valueOf.intValue() != 1 || Math.abs(motionEvent.getY() - this.LJLIL) <= 80.0f) {
            return false;
        }
        InterfaceC45901Hzt interfaceC45901Hzt = this.LJLILLLLZI;
        if (interfaceC45901Hzt != null) {
            if (motionEvent.getY() > this.LJLIL) {
                interfaceC45901Hzt.LIZIZ();
            } else {
                interfaceC45901Hzt.LIZ();
            }
        }
        return true;
    }

    public final void setGestureListener(InterfaceC45901Hzt interfaceC45901Hzt) {
        this.LJLILLLLZI = interfaceC45901Hzt;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C45890Hzi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45890Hzi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
