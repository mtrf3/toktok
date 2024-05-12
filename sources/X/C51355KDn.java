package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.KDn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51355KDn extends FrameLayout {
    public Float LJLIL;
    public InterfaceC88472Yns<? super MotionEvent, C76800UCe> LJLILLLLZI;

    public final InterfaceC88472Yns<MotionEvent, C76800UCe> getTouchHandle() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Float f;
        InterfaceC88472Yns<? super MotionEvent, C76800UCe> interfaceC88472Yns;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LJLIL = Float.valueOf(motionEvent.getY());
            }
            if (motionEvent.getAction() == 2 && (f = this.LJLIL) != null && C1I1.LIZIZ(motionEvent, f.floatValue()) > 9.0f && (interfaceC88472Yns = this.LJLILLLLZI) != null) {
                interfaceC88472Yns.invoke(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setTouchHandle(InterfaceC88472Yns<? super MotionEvent, C76800UCe> interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51355KDn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
