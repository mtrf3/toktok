package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class VSZ extends GestureDetector.SimpleOnGestureListener {
    public final VSW LJLIL;

    public VSZ(VSW vsw) {
        this.LJLIL = vsw;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        VSW vsw = this.LJLIL;
        vsw.LIZ();
        vsw.LJLJLLL = vsw.LJLJLJ.scheduleWithFixedDelay(new VSY(vsw, f2), 0L, 5L, TimeUnit.MILLISECONDS);
        return true;
    }
}
