package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* loaded from: classes15.dex */
public interface WXD {
    boolean LIZ(MotionEvent motionEvent);

    boolean h7(float f, float f2);

    boolean i7();

    boolean j7();

    boolean k7(float f);

    boolean onScale(ScaleGestureDetector scaleGestureDetector);

    boolean onScaleBegin();

    void onScaleEnd();

    boolean setExposureSeekBarProgress(float f);
}
