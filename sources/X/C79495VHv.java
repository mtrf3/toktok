package X;

import android.view.Choreographer;

/* renamed from: X.VHv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79495VHv implements InterfaceC79497VHx {
    public final Choreographer LIZ;

    public C79495VHv(Choreographer choreographer) {
        this.LIZ = choreographer;
    }

    @Override // X.InterfaceC79497VHx
    public final void LIZ(Runnable runnable) {
        this.LIZ.postFrameCallbackDelayed(new ChoreographerFrameCallbackC79494VHu(runnable), 0L);
    }
}
