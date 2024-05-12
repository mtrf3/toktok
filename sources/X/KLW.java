package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes9.dex */
public final class KLW extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ KLU LJLIL;

    public KLW(KLU klu) {
        this.LJLIL = klu;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        KLU klu = this.LJLIL;
        View.OnLongClickListener onLongClickListener = klu.LJZI;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(klu.LJFF());
        }
    }
}
