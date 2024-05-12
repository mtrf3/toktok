package X;

import android.view.MotionEvent;
import com.ss.android.vesdk.VETouchPointer;

/* loaded from: classes15.dex */
public abstract class WXC extends C6P6 {
    @Override // X.C6P6, X.C6V2
    public void LJIIIIZZ(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int pointerCount = motionEvent.getPointerCount();
        VETouchPointer vETouchPointer = new VETouchPointer();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action != 6) {
                                return;
                            }
                            vETouchPointer.setEvent(VETouchPointer.TouchEvent.ENDED);
                            LJJIFFI(vETouchPointer, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                            return;
                        }
                        vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
                        LJJIFFI(vETouchPointer, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                        return;
                    }
                    vETouchPointer.setEvent(VETouchPointer.TouchEvent.CANCELED);
                    LJJIFFI(vETouchPointer, motionEvent, 0);
                    return;
                }
                vETouchPointer.setEvent(VETouchPointer.TouchEvent.MOVED);
                for (int i = 0; i < pointerCount; i++) {
                    LJJIFFI(vETouchPointer, motionEvent, i);
                }
                return;
            }
            vETouchPointer.setEvent(VETouchPointer.TouchEvent.ENDED);
            LJJIFFI(vETouchPointer, motionEvent, 0);
            return;
        }
        vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
        LJJIFFI(vETouchPointer, motionEvent, 0);
    }

    public static void LJJIFFI(VETouchPointer vETouchPointer, MotionEvent motionEvent, int i) {
        int pointerId = motionEvent.getPointerId(i);
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        vETouchPointer.setForce(motionEvent.getPressure(i));
        vETouchPointer.setPointerId(pointerId);
        vETouchPointer.setX(x);
        vETouchPointer.setY(y);
        vETouchPointer.setMajorRadius(30.0f);
    }
}
