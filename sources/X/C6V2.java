package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.6V2, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C6V2 {
    void LJIIIIZZ(MotionEvent motionEvent);

    boolean LJJIIZI(MotionEvent motionEvent);

    boolean LJJIZ(float f);

    boolean LJJJ(MotionEvent motionEvent);

    boolean LJJJI();

    boolean LJJJIL();

    boolean LJJLIL(C82537WaL c82537WaL, float f, float f2);

    boolean LJLI(C82537WaL c82537WaL);

    boolean LJLJI(float f);

    void LJLJJI(C82537WaL c82537WaL);

    boolean LLLLLLLZIL(C82536WaK c82536WaK);

    boolean LLLLLLZ(float f);

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onScale(ScaleGestureDetector scaleGestureDetector);

    boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onSingleTapConfirmed(MotionEvent motionEvent);

    boolean onSingleTapUp(MotionEvent motionEvent);
}
