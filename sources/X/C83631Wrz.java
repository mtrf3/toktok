package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.o;

/* renamed from: X.Wrz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83631Wrz extends C83709WtF implements InterfaceC83720WtQ {
    public boolean LIZ;
    public final ScaleGestureDetector LIZIZ;
    public final C16230kN LIZJ;
    public final Context LIZLLL;
    public final InterfaceC83624Wrs LJ;
    public final InterfaceC83863Wvj LJFF;

    @Override // X.InterfaceC83720WtQ
    public final void LIZIZ(boolean z) {
        this.LIZ = z;
    }

    public C83631Wrz(Context context, InterfaceC83624Wrs rootView, InterfaceC83863Wvj cameraController) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(cameraController, "cameraController");
        this.LIZLLL = context;
        this.LJ = rootView;
        this.LJFF = cameraController;
        this.LIZ = true;
        this.LIZIZ = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC83654WsM(this));
        C16230kN c16230kN = new C16230kN(context, new GestureDetector.SimpleOnGestureListener());
        c16230kN.LIZIZ(new GestureDetectorOnDoubleTapListenerC83628Wrw(this));
        this.LIZJ = c16230kN;
    }
}
