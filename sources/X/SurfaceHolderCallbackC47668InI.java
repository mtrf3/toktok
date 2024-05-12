package X;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ugc.playerkit.videoview.SurfaceViewWrapper;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.InI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class SurfaceHolderCallbackC47668InI implements SurfaceHolder.Callback {
    public final /* synthetic */ SurfaceViewWrapper LJLIL;

    public SurfaceHolderCallbackC47668InI(SurfaceViewWrapper surfaceViewWrapper) {
        this.LJLIL = surfaceViewWrapper;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("surfaceCreated, surface = ");
            LIZ.append(surfaceHolder.getSurface());
            LIZ.append(", surface frame = ");
            LIZ.append(surfaceHolder.getSurfaceFrame());
            IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZ));
        }
        Surface surface = surfaceHolder.getSurface();
        o.LJIIIZ(surface, "surface");
        C46936IbU.LIZ.put(surface, surfaceHolder);
        Surface surface2 = surfaceHolder.getSurface();
        SurfaceViewWrapper listener = this.LJLIL;
        o.LJIIIZ(surface2, "surface");
        o.LJIIIZ(listener, "listener");
        C46936IbU.LIZJ.put(surface2, listener);
        Surface surface3 = this.LJLIL.getSurface();
        if (surface3 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SurfaceView-");
            LIZ2.append("null");
            J8W.LJFF(X1D.LIZIZ(LIZ2), surface3);
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        Iterator<InterfaceC47667InH> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJJL(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("surfaceDestroyed, surface = ");
            LIZ.append(surfaceHolder.getSurface());
            IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZ));
        }
        Iterator<InterfaceC47667InH> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        this.LJLIL.LJLJLJ = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("surfaceChanged, surface = ");
            LIZ.append(surfaceHolder.getSurface());
            LIZ.append(", widthXheight: ");
            LIZ.append(i2);
            LIZ.append("X");
            LIZ.append(i3);
            IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZ));
        }
        Iterator<InterfaceC47667InH> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJJJJ(i2, i3);
        }
    }
}
