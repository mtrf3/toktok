package X;

import android.view.MotionEvent;

/* renamed from: X.NWn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59493NWn extends SJC {
    public final /* synthetic */ NWF LJLIL;

    public C59493NWn(NWF nwf) {
        this.LJLIL = nwf;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        this.LJLIL.LJJI();
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.LJLIL.LJJI();
        return true;
    }
}
