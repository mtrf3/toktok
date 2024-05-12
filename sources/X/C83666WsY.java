package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.WsY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83666WsY implements InterfaceC83720WtQ {
    public final C83631Wrz LIZ;
    public final InterfaceC83721WtR LIZIZ;

    @Override // X.InterfaceC83720WtQ
    public final void LIZIZ(boolean z) {
        this.LIZ.LIZ = z;
    }

    public C83666WsY(Context context, InterfaceC83624Wrs rootView, InterfaceC83863Wvj cameraController) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(cameraController, "cameraController");
        C83631Wrz c83631Wrz = new C83631Wrz(context, rootView, cameraController);
        this.LIZ = c83631Wrz;
        this.LIZIZ = c83631Wrz;
    }
}
