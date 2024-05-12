package X;

import android.view.MotionEvent;

/* renamed from: X.O7n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61391O7n extends O8G {
    public final /* synthetic */ O7W LJLIL;

    public C61391O7n(O7W o7w) {
        this.LJLIL = o7w;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) >= Math.abs(motionEvent.getRawX() - motionEvent2.getRawX())) {
            O79.LIZIZ().LJII(this.LJLIL.LLIFFJFJJ, "slide_up");
            return false;
        }
        return false;
    }
}
