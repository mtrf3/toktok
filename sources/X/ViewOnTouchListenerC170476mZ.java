package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.6mZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC170476mZ implements View.OnTouchListener {
    public final float LJLIL;
    public final long LJLILLLLZI;
    public final View LJLJI;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            this.LJLJI.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.LJLILLLLZI).start();
            return false;
        }
        this.LJLJI.animate().scaleX(this.LJLIL).scaleY(this.LJLIL).setDuration(this.LJLILLLLZI).start();
        return false;
    }

    public ViewOnTouchListenerC170476mZ(float f, long j, View animateView) {
        o.LJIIIZ(animateView, "animateView");
        this.LJLIL = f;
        this.LJLILLLLZI = j;
        this.LJLJI = animateView;
    }
}
