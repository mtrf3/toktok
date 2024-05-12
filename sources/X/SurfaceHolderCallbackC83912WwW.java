package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.creativex.camerakit.camera.session.recorder.impl.RecorderImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.WwW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class SurfaceHolderCallbackC83912WwW implements SurfaceHolder.Callback {
    public final /* synthetic */ RecorderImpl LJLIL;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        o.LJIIIZ(holder, "holder");
    }

    public SurfaceHolderCallbackC83912WwW(RecorderImpl recorderImpl) {
        this.LJLIL = recorderImpl;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLIL.LIZIZ();
        InterfaceC83865Wvl mediaController = this.LJLIL.getMediaController();
        Surface surface = holder.getSurface();
        o.LJIIIIZZ(surface, "holder.surface");
        mediaController.u8(surface, "", C83913WwX.LJLIL);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLIL.getMediaController().LIZ();
    }
}
