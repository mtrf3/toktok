package X;

import android.view.SurfaceHolder;

/* renamed from: X.Wsb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class SurfaceHolderCallbackC83669Wsb implements SurfaceHolder.Callback {
    public final /* synthetic */ C83621Wrp LJLIL;

    public SurfaceHolderCallbackC83669Wsb(C83621Wrp c83621Wrp) {
        this.LJLIL = c83621Wrp;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C83621Wrp c83621Wrp = this.LJLIL;
        c83621Wrp.LLJZIJLIL = false;
        c83621Wrp.LLLLJI(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C83621Wrp c83621Wrp = this.LJLIL;
        c83621Wrp.LLJZIJLIL = true;
        c83621Wrp.LLLLLIL();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LJLIL.LLLLJ(surfaceHolder.getSurface(), i2, i3);
    }
}
