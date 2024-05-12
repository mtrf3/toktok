package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WGy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class GestureDetectorOnDoubleTapListenerC82020WGy implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ C82016WGu LJLIL;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC82020WGy(C82016WGu c82016WGu) {
        this.LJLIL = c82016WGu;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LIZ.onDoubleTap(e);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LIZ.onSingleTapConfirmed(e);
        return true;
    }
}
