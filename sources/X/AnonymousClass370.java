package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.370, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass370 extends FrameLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public long LJLJI;
    public InterfaceC88471Ynr<? super Float, ? super Float, C76800UCe> LJLJJI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC88471Ynr<? super Float, ? super Float, C76800UCe> interfaceC88471Ynr;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LJLIL = motionEvent.getX();
                this.LJLILLLLZI = motionEvent.getY();
                this.LJLJI = System.currentTimeMillis();
            }
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.LJLIL) < 20.0f && Math.abs(y - this.LJLILLLLZI) < 20.0f && System.currentTimeMillis() - this.LJLJI < 120 && (interfaceC88471Ynr = this.LJLJJI) != null) {
                    interfaceC88471Ynr.invoke(Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI));
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass370(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
