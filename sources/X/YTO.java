package X;

import android.view.SurfaceHolder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes16.dex */
public class YTO implements SurfaceHolder.Callback {
    public final /* synthetic */ YTM LJLIL;

    public YTO(YTM ytm) {
        this.LJLIL = ytm;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        YTM ytm = this.LJLIL;
        ytm.LIZIZ = true;
        ytm.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL.LJFF).iterator();
        while (it.hasNext()) {
            ((SurfaceHolder.Callback) it.next()).surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        YTM ytm = this.LJLIL;
        ytm.LIZIZ = false;
        ytm.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL.LJFF).iterator();
        while (it.hasNext()) {
            ((SurfaceHolder.Callback) it.next()).surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        YTM ytm = this.LJLIL;
        ytm.LIZJ = i;
        ytm.LIZLLL = i2;
        ytm.LJ = i3;
        ytm.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL.LJFF).iterator();
        while (it.hasNext()) {
            ((SurfaceHolder.Callback) it.next()).surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }
}
