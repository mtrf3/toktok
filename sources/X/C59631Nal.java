package X;

import android.view.MotionEvent;

/* renamed from: X.Nal, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59631Nal extends SJC {
    public final /* synthetic */ C59613NaT LJLIL;

    public C59631Nal(C59613NaT c59613NaT) {
        this.LJLIL = c59613NaT;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLIL.lastClickTime = System.currentTimeMillis();
        return super.onSingleTapUp(motionEvent);
    }
}
