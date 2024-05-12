package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.acF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC94143acF implements InterfaceC93699aV5 {
    public abstract void LIZIZ(float f, float f2, float f3, float f4);

    @Override // X.InterfaceC93699aV5
    public abstract void LJJIIZI(MotionEvent motionEvent);

    @Override // X.InterfaceC93699aV5
    public final void LJJJI() {
    }

    @Override // X.InterfaceC93699aV5
    public final void LJJJIL() {
    }

    @Override // X.InterfaceC93699aV5
    public final void onDown(MotionEvent event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC93699aV5
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
    }
}
