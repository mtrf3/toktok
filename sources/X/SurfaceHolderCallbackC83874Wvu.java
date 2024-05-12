package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class SurfaceHolderCallbackC83874Wvu implements SurfaceHolder.Callback {
    public final /* synthetic */ C83866Wvm LJLIL;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        o.LJIIIZ(holder, "holder");
    }

    public SurfaceHolderCallbackC83874Wvu(C83866Wvm c83866Wvm) {
        this.LJLIL = c83866Wvm;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLIL.LJIIL();
        InterfaceC83865Wvl mediaController = this.LJLIL.LJLJJLL.getMediaController();
        Surface surface = holder.getSurface();
        o.LJIIIIZZ(surface, "holder.surface");
        mediaController.u8(surface, "", C83882Ww2.LJLIL);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLIL.LJLJJLL.getMediaController().LIZ();
    }
}
