package X;

import android.view.MotionEvent;

/* renamed from: X.O7o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61392O7o extends O8G {
    public final /* synthetic */ O7W LJLIL;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public C61392O7o(O7W o7w) {
        this.LJLIL = o7w;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLIL.LLILIL = false;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        O7W o7w = this.LJLIL;
        if (o7w.LLILIL) {
            return true;
        }
        o7w.LLILIL = true;
        if (f2 > 0.0f) {
            O79.LIZIZ().LJII(this.LJLIL.LLIFFJFJJ, "slide_up");
        }
        return true;
    }
}
