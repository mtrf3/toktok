package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.concurrent.TimeUnit;

/* renamed from: X.VSf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79765VSf extends GestureDetector.SimpleOnGestureListener {
    public final C79762VSc LJLIL;

    public C79765VSf(C79762VSc c79762VSc) {
        this.LJLIL = c79762VSc;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C79762VSc c79762VSc = this.LJLIL;
        c79762VSc.LIZ();
        c79762VSc.LJLJLLL = c79762VSc.LJLJLJ.scheduleWithFixedDelay(new C79764VSe(c79762VSc, f2), 0L, 5L, TimeUnit.MILLISECONDS);
        return true;
    }
}
