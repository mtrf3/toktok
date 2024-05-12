package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.9aS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239409aS extends FrameLayout {
    public InterfaceC239449aW LJLIL;

    public final InterfaceC239449aW getDispatchTouchEventListener() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC239449aW interfaceC239449aW = this.LJLIL;
        if (interfaceC239449aW != null) {
            interfaceC239449aW.LIZ();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setDispatchTouchEventListener(InterfaceC239449aW interfaceC239449aW) {
        this.LJLIL = interfaceC239449aW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C239409aS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
