package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePullPureAudioSetting;

/* renamed from: X.VBz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class SurfaceHolderCallbackC79343VBz implements SurfaceHolder.Callback {
    public final /* synthetic */ C79340VBw LJLIL;

    public SurfaceHolderCallbackC79343VBz(C79340VBw c79340VBw) {
        this.LJLIL = c79340VBw;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        B4I.LIZ("LivePlayController", "surfaceCreated");
        Surface surface = this.LJLIL.LJLJL;
        if (surface != null) {
            surface.release();
            this.LJLIL.LJLJL = null;
        }
        C79340VBw c79340VBw = this.LJLIL;
        c79340VBw.LJLJLJ = surfaceHolder;
        c79340VBw.LJJLIIIJJI(true);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        B4I.LIZ("LivePlayController", "surfaceDestroyed");
        VBT vbt = this.LJLIL.LJLIL;
        if (vbt != null) {
            ((VAE) vbt).LJII(null);
            if (LivePullPureAudioSetting.INSTANCE.getCurrentValue().getEnable()) {
                VAE vae = (VAE) this.LJLIL.LJLIL;
                vae.getClass();
                vae.LJI(VAE.LIZJ(29, null));
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        B4I.LIZ("RenderView", C48690J9a.LJIIJJI("surfaceChanged -> width: ", i2, ",height: ", i3, ","));
    }
}
