package X;

import android.view.SurfaceHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Wtb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class SurfaceHolderCallbackC83731Wtb implements SurfaceHolder.Callback {
    public final /* synthetic */ C83758Wu2 LJLIL;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        o.LJIIIZ(surfaceHolder, "surfaceHolder");
    }

    public SurfaceHolderCallbackC83731Wtb(C83758Wu2 c83758Wu2) {
        this.LJLIL = c83758Wu2;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        InterfaceC83863Wvj cameraController;
        o.LJIIIZ(surfaceHolder, "surfaceHolder");
        C83866Wvm c83866Wvm = this.LJLIL.LIZ;
        if (c83866Wvm != null && (cameraController = c83866Wvm.getCameraController()) != null) {
            cameraController.LJJIJIL(YZL.AS_CAMERA_LENS_BACK.ordinal(), null, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_QR_CODE_SCAN_SURFACE_CREATE, WYE.QR));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        InterfaceC83863Wvj cameraController;
        o.LJIIIZ(surfaceHolder, "surfaceHolder");
        C83866Wvm c83866Wvm = this.LJLIL.LIZ;
        if (c83866Wvm != null && (cameraController = c83866Wvm.getCameraController()) != null) {
            cameraController.LJIILLIIL(C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.CLOSE_CAMERA_QR_SURFACE_DESTROY, EnumC158826Le.PAGE_INVISIBLE), false);
        }
    }
}
