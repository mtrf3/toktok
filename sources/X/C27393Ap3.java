package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.Ap3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27393Ap3 extends FrameLayout {
    public InterfaceC27398Ap8 LJLIL;

    public final InterfaceC27398Ap8 getOnInterceptTouchEventListener() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC27398Ap8 interfaceC27398Ap8 = this.LJLIL;
        if (interfaceC27398Ap8 != null) {
            return interfaceC27398Ap8.LIZ();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnInterceptTouchEventListener(InterfaceC27398Ap8 interfaceC27398Ap8) {
        this.LJLIL = interfaceC27398Ap8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27393Ap3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
