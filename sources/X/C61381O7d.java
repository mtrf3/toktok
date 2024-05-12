package X;

import android.view.MotionEvent;

/* renamed from: X.O7d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61381O7d extends O8G {
    public final /* synthetic */ O7W LJLIL;

    public C61381O7d(O7W o7w) {
        this.LJLIL = o7w;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLIL.LLILIL = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent.getRawY() >= motionEvent2.getRawY() && motionEvent.getRawY() - motionEvent2.getRawY() >= Math.abs(motionEvent.getRawX() - motionEvent2.getRawX())) {
            C1DJ.LJIJJ("slide up ad view with speed");
            this.LJLIL.LJIILIIL();
            O7F o7f = (O7F) this.LJLIL.LLII;
            O86 o86 = o7f.LIZ;
            O8I o8i = new O8I();
            o8i.LIZ = 4;
            o86.LIZJ(o8i);
            o7f.LIZIZ();
            O7W o7w = this.LJLIL;
            if (o7w.LLIL != null) {
                o7w.LLFFF = 8;
                o7w.LJIILL();
            }
            O79.LIZIZ().LJII(this.LJLIL.LLIFFJFJJ, "swipe_up");
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.LJLIL.LLILIL = true;
        return true;
    }
}
