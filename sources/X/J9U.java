package X;

import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.simkit.impl.player.SurfaceViewHolder;

/* loaded from: classes9.dex */
public final class J9U implements SurfaceHolder.Callback {
    public final /* synthetic */ SurfaceViewHolder LJLIL;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public J9U(SurfaceViewHolder surfaceViewHolder) {
        this.LJLIL = surfaceViewHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.LJLIL.LIZIZ == null) {
            this.LJLIL.LIZIZ = surfaceHolder.getSurface();
        }
        J9W j9w = this.LJLIL.LIZJ;
        if (j9w != null) {
            j9w.LIZ();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        J9W j9w = this.LJLIL.LIZJ;
        if (j9w != null) {
            j9w.onSurfaceDestroy();
        }
        this.LJLIL.LIZIZ = null;
    }
}
