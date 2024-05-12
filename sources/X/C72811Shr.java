package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Shr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72811Shr extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ViewOnTouchListenerC81187Vtf LJLIL;

    public C72811Shr(ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf) {
        this.LJLIL = viewOnTouchListenerC81187Vtf;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        this.LJLIL.getClass();
    }
}
