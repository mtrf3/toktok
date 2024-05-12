package X;

import android.view.MotionEvent;

/* renamed from: X.YLl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87233YLl extends SJC {
    public final /* synthetic */ C87231YLj LJLIL;

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C87233YLl(C87231YLj c87231YLj) {
        this.LJLIL = c87231YLj;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.LJLIL.LIZJ.onLongPress(motionEvent);
        }
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (motionEvent != null) {
            C87231YLj c87231YLj = this.LJLIL;
            c87231YLj.LJIIJJI = motionEvent.getX();
            c87231YLj.LJIIL = motionEvent.getY();
            return false;
        }
        return false;
    }
}
