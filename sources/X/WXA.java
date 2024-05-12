package X;

import android.view.MotionEvent;
import com.ss.android.vesdk.VETouchPointer;

/* loaded from: classes15.dex */
public abstract class WXA extends WXB {
    public boolean LIZIZ() {
        return this instanceof W17;
    }

    public void LJFF(VETouchPointer vETouchPointer, int i) {
    }

    @Override // X.WXG
    public final void LJIIIIZZ(MotionEvent motionEvent) {
        LJ(motionEvent, 0);
    }

    public final void LIZLLL(MotionEvent motionEvent, int[] iArr) {
        if (!LIZIZ() || motionEvent.getPointerCount() != 2) {
            return;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getX() + iArr[0], motionEvent.getY() + iArr[1]);
        LJ(obtain, 1);
    }

    public final void LJ(MotionEvent motionEvent, int i) {
        int action = motionEvent.getAction() & 255;
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > i) {
            pointerCount -= i;
        }
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
                            LIZJ(vETouchPointer, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                            LJFF(vETouchPointer, pointerCount);
                            return;
                        }
                        vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
                        LIZJ(vETouchPointer, motionEvent, (motionEvent.getAction() & 65280) >> 8);
                        LJFF(vETouchPointer, pointerCount);
                        return;
                    }
                    vETouchPointer.setEvent(VETouchPointer.TouchEvent.CANCELED);
                    LIZJ(vETouchPointer, motionEvent, 0);
                    LJFF(vETouchPointer, pointerCount);
                    return;
                }
                vETouchPointer.setEvent(VETouchPointer.TouchEvent.MOVED);
                if (i < 0 || i >= motionEvent.getPointerCount()) {
                    i = 0;
                }
                while (i < motionEvent.getPointerCount()) {
                    LIZJ(vETouchPointer, motionEvent, i);
                    LJFF(vETouchPointer, pointerCount);
                    i++;
                }
                return;
            }
            vETouchPointer.setEvent(VETouchPointer.TouchEvent.ENDED);
            LIZJ(vETouchPointer, motionEvent, 0);
            LJFF(vETouchPointer, pointerCount);
            return;
        }
        vETouchPointer.setEvent(VETouchPointer.TouchEvent.BEGAN);
        LIZJ(vETouchPointer, motionEvent, 0);
        LJFF(vETouchPointer, pointerCount);
    }

    @Override // X.WXG
    public final void LLLLLLZZ(MotionEvent motionEvent, int[] iArr) {
        LIZLLL(motionEvent, iArr);
    }

    @Override // X.WXG
    public void LLLLLZ(MotionEvent motionEvent, int[] iArr) {
        LIZLLL(motionEvent, iArr);
    }

    @Override // X.WXG
    public void LLLLLZL(MotionEvent motionEvent, int[] iArr) {
        LIZLLL(motionEvent, iArr);
    }

    @Override // X.WXG
    public void LLLLZ(MotionEvent motionEvent, int[] iArr) {
        LIZLLL(motionEvent, iArr);
    }

    @Override // X.WXG
    public void LLLLZI(MotionEvent motionEvent, int[] iArr) {
        LIZLLL(motionEvent, iArr);
    }

    public static void LIZJ(VETouchPointer vETouchPointer, MotionEvent motionEvent, int i) {
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
