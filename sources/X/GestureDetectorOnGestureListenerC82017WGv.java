package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WGv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class GestureDetectorOnGestureListenerC82017WGv implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C82016WGu LJLIL;

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnGestureListenerC82017WGv(C82016WGu c82016WGu) {
        this.LJLIL = c82016WGu;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return this.LJLIL.LIZ.onDown(e);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LIZ.onLongPress(e);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        this.LJLIL.LIZ.onFling(e1, e2, f, f2);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        return this.LJLIL.LIZ.onScroll(e1, e2, f, f2);
    }
}
