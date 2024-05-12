package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.374, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass374 extends FrameLayout {
    public boolean LJLIL;
    public InterfaceC88472Yns<? super MotionEvent, C76800UCe> LJLILLLLZI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL) {
            InterfaceC88472Yns<? super MotionEvent, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(motionEvent);
                return true;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setHideKeyBoard$e_commerce_influencer_release(InterfaceC88472Yns<? super MotionEvent, C76800UCe> interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    public final void setInterceptTouchEvent$e_commerce_influencer_release(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass374(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
