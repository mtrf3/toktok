package X;

import Y.IDHandlerS25S0100000_15;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Y5l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class ViewOnTouchListenerC86817Y5l implements View.OnTouchListener {
    public final IDHandlerS25S0100000_15 LJLIL = new IDHandlerS25S0100000_15(this, C16880lQ.LLJJJJ(), 1);
    public long LJLILLLLZI;
    public float LJLJI;
    public final /* synthetic */ Y5O LJLJJI;

    public ViewOnTouchListenerC86817Y5l(Y5O y5o) {
        this.LJLJJI = y5o;
    }

    public static float LIZ(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            float x = motionEvent.getX(0);
            float y = motionEvent.getY(0);
            float x2 = x - motionEvent.getX(1);
            float y2 = y - motionEvent.getY(1);
            return (float) Math.sqrt((y2 * y2) + (x2 * x2));
        }
        return -1.0f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.LJLJJI.LIZIZ()) {
            this.LJLJJI.LIZ.getClass();
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount == 1) {
            if (motionEvent.getAction() == 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = 300;
                if (elapsedRealtime - this.LJLILLLLZI < j) {
                    this.LJLIL.removeMessages(1);
                    this.LJLJJI.LIZ.LLFZ(3);
                } else {
                    this.LJLIL.sendEmptyMessageDelayed(1, j);
                }
                this.LJLILLLLZI = elapsedRealtime;
            }
        } else if (pointerCount >= 2) {
            int action = motionEvent.getAction() & 255;
            if (action != 2) {
                if (action == 5) {
                    this.LJLJI = LIZ(motionEvent);
                }
            } else {
                float LIZ = LIZ(motionEvent);
                if (LIZ == -1.0f) {
                    return false;
                }
                float f = this.LJLJI;
                float f2 = 5;
                if (LIZ > f + f2) {
                    this.LJLJJI.LIZ.LLFZ(1);
                } else {
                    if (LIZ >= f - f2) {
                        return false;
                    }
                    this.LJLJJI.LIZ.LLFZ(2);
                }
                this.LJLJI = LIZ;
            }
        }
        return true;
    }
}
