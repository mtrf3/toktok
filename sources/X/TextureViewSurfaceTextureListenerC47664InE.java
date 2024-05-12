package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.InE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC47664InE implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C47670InK LJLIL;

    public TextureViewSurfaceTextureListenerC47664InE(C47670InK c47670InK) {
        this.LJLIL = c47670InK;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        List list = this.LJLIL.LJLILLLLZI;
        if (!((IZD) IZ8.LLZLLLL.getValue()).LJLIL) {
            list = new ArrayList(this.LJLIL.LJLILLLLZI);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC47667InH) it.next()).LIZ();
        }
        C47670InK c47670InK = this.LJLIL;
        boolean z = c47670InK.LJLJI;
        if (!z) {
            surfaceTexture = null;
        }
        c47670InK.LJLJJI = surfaceTexture;
        return !z;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        List list = this.LJLIL.LJLILLLLZI;
        if (!((IZD) IZ8.LLZLLLL.getValue()).LJLIL) {
            list = new ArrayList(this.LJLIL.LJLILLLLZI);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC47667InH) it.next()).onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C47670InK c47670InK = this.LJLIL;
        c47670InK.LJLJI = false;
        Surface surface = c47670InK.getSurface();
        if (surface != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TextureView-");
            LIZ.append("null");
            J8W.LJFF(X1D.LIZIZ(LIZ), surface);
        }
        List list = this.LJLIL.LJLILLLLZI;
        if (!((IZD) IZ8.LLZLLLL.getValue()).LJLIL) {
            list = new ArrayList(this.LJLIL.LJLILLLLZI);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC47667InH) it.next()).LJJL(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        List list = this.LJLIL.LJLILLLLZI;
        if (!((IZD) IZ8.LLZLLLL.getValue()).LJLIL) {
            list = new ArrayList(this.LJLIL.LJLILLLLZI);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC47667InH) it.next()).LJJJJ(i, i2);
        }
    }
}
