package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;

/* loaded from: classes11.dex */
public class OX6 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ ScanQRCodeActivityV2 LJLIL;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public OX6(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.LJLIL = scanQRCodeActivityV2;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLIL.LJLJLLL.processTouchEvent(motionEvent.getX() / C60996Nwm.LJIIIIZZ(this.LJLIL), motionEvent.getY() / C60996Nwm.LJ(this.LJLIL));
        return true;
    }
}
