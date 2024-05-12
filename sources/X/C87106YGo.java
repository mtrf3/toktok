package X;

import android.view.MotionEvent;

/* renamed from: X.YGo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87106YGo extends SJC {
    public final /* synthetic */ ViewOnTouchListenerC87097YGf LJLIL;

    public C87106YGo(ViewOnTouchListenerC87097YGf viewOnTouchListenerC87097YGf) {
        this.LJLIL = viewOnTouchListenerC87097YGf;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C87098YGg stateContext = this.LJLIL.getStateContext();
        AbstractC87105YGn abstractC87105YGn = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC87105YGn != null) {
            return abstractC87105YGn.LIZJ();
        }
        return false;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLIL.LJIIIIZZ();
        C87098YGg stateContext = this.LJLIL.getStateContext();
        AbstractC87105YGn abstractC87105YGn = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC87105YGn != null) {
            return abstractC87105YGn.LIZJ();
        }
        return false;
    }
}
