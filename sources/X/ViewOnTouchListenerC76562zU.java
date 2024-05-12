package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.2zU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC76562zU implements View.OnTouchListener {
    public final float LJLIL;
    public final InterfaceC88471Ynr<View, MotionEvent, Boolean> LJLILLLLZI;

    public ViewOnTouchListenerC76562zU(float f, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC88471Ynr;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
        } else {
            v.animate().scaleX(this.LJLIL).scaleY(this.LJLIL).setDuration(100L).start();
        }
        InterfaceC88471Ynr<View, MotionEvent, Boolean> interfaceC88471Ynr = this.LJLILLLLZI;
        if (interfaceC88471Ynr != null) {
            return interfaceC88471Ynr.invoke(v, event).booleanValue();
        }
        return false;
    }
}
