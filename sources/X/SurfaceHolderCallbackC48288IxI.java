package X;

import android.view.SurfaceHolder;
import ccb.t;
import com.ss.texturerender.VideoSurface;
import java.lang.ref.WeakReference;

/* renamed from: X.IxI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class SurfaceHolderCallbackC48288IxI implements SurfaceHolder.Callback {
    public final WeakReference<t> LJLIL;

    public SurfaceHolderCallbackC48288IxI(t tVar) {
        InterfaceC48269Iwz interfaceC48269Iwz;
        this.LJLIL = new WeakReference<>(tVar);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new surface callback:");
        LIZ.append(this);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        if (tVar != null && (interfaceC48269Iwz = tVar.LJLJL) != null) {
            ((VBU) interfaceC48269Iwz).LJ(LIZIZ);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        t tVar;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceCreated, ");
        LIZ.append(surfaceHolder);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        WeakReference<t> weakReference = this.LJLIL;
        if (weakReference != null && (tVar = weakReference.get()) != null) {
            tVar.z1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        t tVar;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceDestroyed, ");
        LIZ.append(surfaceHolder);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        WeakReference<t> weakReference = this.LJLIL;
        if (weakReference != null && (tVar = weakReference.get()) != null) {
            InterfaceC48269Iwz interfaceC48269Iwz = tVar.LJLJL;
            if (interfaceC48269Iwz != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("surfaceDestroyed, ");
                LIZ2.append(surfaceHolder);
                ((VBU) interfaceC48269Iwz).LJ(X1D.LIZIZ(LIZ2));
            }
            VideoSurface videoSurface = tVar.LLD;
            if (videoSurface != null) {
                videoSurface.LJJ(9, 1);
                tVar.A(surfaceHolder.getSurface());
                videoSurface.LJJ(9, 0);
                return;
            }
            tVar.A(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        t tVar;
        VideoSurface videoSurface;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceChanged, ");
        LIZ.append(surfaceHolder);
        LIZ.append(", pixel format: ");
        LIZ.append(i);
        LIZ.append(", width: ");
        LIZ.append(i2);
        LIZ.append(", height: ");
        LIZ.append(i3);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        WeakReference<t> weakReference = this.LJLIL;
        if (weakReference != null && (tVar = weakReference.get()) != null) {
            InterfaceC48269Iwz interfaceC48269Iwz = tVar.LJLJL;
            if (interfaceC48269Iwz != null) {
                ((VBU) interfaceC48269Iwz).LJ(LIZIZ);
            }
            if (tVar.I8 == 1 && surfaceHolder != null && tVar.LLIILZL == EnumC48289IxJ.PAUSED && (videoSurface = tVar.LLD) != null) {
                C46496IMq.LIZJ();
                videoSurface.LJIILLIIL(false);
                videoSurface.LJJIJ(surfaceHolder.getSurface());
                videoSurface.LJJ(25, 1);
            }
        }
    }
}
