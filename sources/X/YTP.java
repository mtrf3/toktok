package X;

import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes16.dex */
public class YTP implements SurfaceHolder.Callback {
    public final /* synthetic */ YTN LJLIL;

    public YTP(YTN ytn) {
        this.LJLIL = ytn;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        YTN ytn = this.LJLIL;
        ytn.LIZIZ = true;
        Iterator it = ((ArrayList) ytn.LJFF).iterator();
        while (it.hasNext()) {
            ((SurfaceHolder.Callback) it.next()).surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        YTN ytn = this.LJLIL;
        ytn.LIZIZ = false;
        Iterator it = ((ArrayList) ytn.LJFF).iterator();
        while (it.hasNext()) {
            ((SurfaceHolder.Callback) it.next()).surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        YTN ytn = this.LJLIL;
        ytn.LIZJ = i;
        ytn.LIZLLL = i2;
        ytn.LJ = i3;
        Iterator it = ((ArrayList) ytn.LJFF).iterator();
        while (it.hasNext()) {
            ((SurfaceHolder.Callback) it.next()).surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }
}
