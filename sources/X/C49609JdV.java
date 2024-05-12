package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;

/* renamed from: X.JdV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49609JdV extends C49608JdU {
    public float LJLJJI;
    public float LJLJJL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTouchEvent event: ");
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append('}');
        X1D.LIZIZ(LIZ);
        if (motionEvent == null) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && C49608JdU.LIZ(this.LJLJJI, this.LJLJJL, x, y)) {
                if (C78842Uww.LJIILL(getCoreAreaXRange(), this.LJLJJI) && C78842Uww.LJIILL(getCoreAreaYRange(), this.LJLJJL)) {
                    InterfaceC49610JdW interactiveListener = getInteractiveListener();
                    if (interactiveListener != null) {
                        interactiveListener.LJ();
                    }
                } else {
                    InterfaceC49610JdW interactiveListener2 = getInteractiveListener();
                    if (interactiveListener2 != null) {
                        interactiveListener2.LIZIZ();
                    }
                }
            }
            return false;
        }
        this.LJLJJI = x;
        this.LJLJJL = y;
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49609JdV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
