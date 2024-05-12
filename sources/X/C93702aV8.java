package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.aV8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93702aV8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C93703aV9 LJLIL;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C93702aV8(C93703aV9 c93703aV9) {
        this.LJLIL = c93703aV9;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.LJLIL.LJIILIIL.onLongPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LJIIIIZZ = e.getX();
        this.LJLIL.LJIIIZ = e.getY();
        this.LJLIL.LJIILIIL.onSingleTapUp(e);
        return true;
    }
}
