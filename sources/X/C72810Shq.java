package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Shq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72810Shq extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ViewOnTouchListenerC80851VoF LJLIL;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        super.onLongPress(e);
        this.LJLIL.getClass();
    }

    public C72810Shq(ViewOnTouchListenerC80851VoF viewOnTouchListenerC80851VoF, VA9<V92> va9) {
        this.LJLIL = viewOnTouchListenerC80851VoF;
    }
}
