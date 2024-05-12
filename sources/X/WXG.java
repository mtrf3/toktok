package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* loaded from: classes15.dex */
public interface WXG {
    void LIZ();

    void LJIIIIZZ(MotionEvent motionEvent);

    boolean LJJIIZI(MotionEvent motionEvent);

    boolean LJJIZ(float f);

    boolean LJJJ(MotionEvent motionEvent);

    void LJJJI();

    void LJJJIL();

    boolean LJJLIL(C82537WaL c82537WaL, float f, float f2);

    boolean LJLI(C82537WaL c82537WaL);

    boolean LJLJI(float f);

    void LJLJJI(C82537WaL c82537WaL);

    boolean LLLLLLLZIL(C82536WaK c82536WaK);

    boolean LLLLLLZ(float f);

    void LLLLLLZZ(MotionEvent motionEvent, int[] iArr);

    void LLLLLZ(MotionEvent motionEvent, int[] iArr);

    void LLLLLZL(MotionEvent motionEvent, int[] iArr);

    void LLLLZ(MotionEvent motionEvent, int[] iArr);

    void LLLLZI(MotionEvent motionEvent, int[] iArr);

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onScale(ScaleGestureDetector scaleGestureDetector);

    boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onSingleTapConfirmed(MotionEvent motionEvent);

    boolean onSingleTapUp(MotionEvent motionEvent);
}
