package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.WGg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82002WGg {
    public final ScaleGestureDetector LIZ;
    public final GestureDetector LIZIZ;
    public final GestureDetectorOnGestureListenerC82008WGm LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public MotionEvent LJFF;

    public C82002WGg(Context context, C82001WGf c82001WGf) {
        o.LJIIIZ(context, "context");
        GestureDetectorOnGestureListenerC82007WGl gestureDetectorOnGestureListenerC82007WGl = new GestureDetectorOnGestureListenerC82007WGl(this);
        ScaleGestureDetectorOnScaleGestureListenerC82006WGk scaleGestureDetectorOnScaleGestureListenerC82006WGk = new ScaleGestureDetectorOnScaleGestureListenerC82006WGk(this);
        this.LIZJ = c82001WGf;
        GestureDetector gestureDetector = new GestureDetector(context, gestureDetectorOnGestureListenerC82007WGl);
        this.LIZIZ = gestureDetector;
        gestureDetector.setOnDoubleTapListener(c82001WGf);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, scaleGestureDetectorOnScaleGestureListenerC82006WGk);
        this.LIZ = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        try {
            Field declaredField = ScaleGestureDetector.class.getDeclaredField("mMinSpan");
            declaredField.setAccessible(true);
            declaredField.set(scaleGestureDetector, 1);
        } catch (Throwable unused) {
        }
    }
}
