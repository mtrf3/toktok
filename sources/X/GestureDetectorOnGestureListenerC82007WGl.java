package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WGl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class GestureDetectorOnGestureListenerC82007WGl implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C82002WGg LJLIL;

    public GestureDetectorOnGestureListenerC82007WGl(C82002WGg c82002WGg) {
        this.LJLIL = c82002WGg;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        o.LJIIIZ(e, "e");
        GestureDetectorOnGestureListenerC82008WGm gestureDetectorOnGestureListenerC82008WGm = this.LJLIL.LIZJ;
        if (gestureDetectorOnGestureListenerC82008WGm != null) {
            return gestureDetectorOnGestureListenerC82008WGm.onDown(e);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        GestureDetectorOnGestureListenerC82008WGm gestureDetectorOnGestureListenerC82008WGm = this.LJLIL.LIZJ;
        if (gestureDetectorOnGestureListenerC82008WGm != null) {
            gestureDetectorOnGestureListenerC82008WGm.onLongPress(e);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        o.LJIIIZ(e, "e");
        o.LJI(this.LJLIL.LIZJ);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        GestureDetectorOnGestureListenerC82008WGm gestureDetectorOnGestureListenerC82008WGm = this.LJLIL.LIZJ;
        if (gestureDetectorOnGestureListenerC82008WGm != null) {
            gestureDetectorOnGestureListenerC82008WGm.onScroll(e1, e2, f, f2);
            return true;
        }
        return false;
    }
}
