package X;

import android.os.Build;
import android.view.SurfaceHolder;

/* loaded from: classes16.dex */
public class Y67 implements SurfaceHolder.Callback {
    public final /* synthetic */ Y61 LJLIL;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public Y67(Y61 y61) {
        this.LJLIL = y61;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (!Build.BRAND.equalsIgnoreCase("Meizu")) {
            this.LJLIL.LJLLLLLL = null;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == null) {
            return;
        }
        Y61 y61 = this.LJLIL;
        y61.LJLLLLLL = new Y64(i2, i3);
        y61.LJFF();
    }
}
