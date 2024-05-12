package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: X.UGd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C76903UGd extends FrameLayout {
    public InterfaceC76904UGe LJLIL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC76904UGe interfaceC76904UGe = this.LJLIL;
        if (interfaceC76904UGe != null) {
            interfaceC76904UGe.LJJJJ(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC76904UGe interfaceC76904UGe = this.LJLIL;
        if (interfaceC76904UGe != null) {
            interfaceC76904UGe.LIZ();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIntercepter(InterfaceC76904UGe interfaceC76904UGe) {
        this.LJLIL = interfaceC76904UGe;
    }

    public C76903UGd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
