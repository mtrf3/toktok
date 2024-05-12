package X;

import android.view.MotionEvent;

/* renamed from: X.Nak, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59630Nak extends SJC {
    public final /* synthetic */ C59612NaS LJLIL;

    public C59630Nak(C59612NaS c59612NaS) {
        this.LJLIL = c59612NaS;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLIL.LJLLI = System.currentTimeMillis();
        return super.onSingleTapUp(motionEvent);
    }
}
