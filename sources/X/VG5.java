package X;

import android.graphics.SurfaceTexture;

/* loaded from: classes15.dex */
public class VG5 implements SurfaceTexture.OnFrameAvailableListener {
    public boolean LJLIL = true;

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C79445VFx c79445VFx = (C79445VFx) surfaceTexture;
        c79445VFx.mHasFrameCome = true;
        if (this.LJLIL) {
            VGA vga = c79445VFx.mVsyncHelper;
            if (vga == null || !vga.LIZLLL() || !c79445VFx.mConfig.LIZ(8)) {
                c79445VFx.sendRenderMsg(1, false);
                return;
            }
            return;
        }
        c79445VFx.sendRenderMsg(0, false);
    }
}
