package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.broadcast.preview.virtual.StartLivePreviewFragment;

/* renamed from: X.C3l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30709C3l extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ StartLivePreviewFragment LJLIL;

    public C30709C3l(StartLivePreviewFragment startLivePreviewFragment) {
        this.LJLIL = startLivePreviewFragment;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (motionEvent != null && motionEvent2 != null) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > 200.0f && Math.abs(f) > 100.0f) {
                if (x > 0.0f) {
                    z = true;
                }
                C1MZ c1mz = this.LJLIL.mLiveFilterHelper;
                if (c1mz != null) {
                    if (z) {
                        c1mz.LIZLLL();
                    } else {
                        c1mz.LJ();
                    }
                    this.LJLIL.showFilterName(z);
                }
                return true;
            }
        }
        return false;
    }
}
