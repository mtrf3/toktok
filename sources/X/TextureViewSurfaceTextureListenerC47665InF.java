package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Iterator;

/* renamed from: X.InF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC47665InF implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C47672InM LJLIL;

    public TextureViewSurfaceTextureListenerC47665InF(C47672InM c47672InM) {
        this.LJLIL = c47672InM;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Iterator<InterfaceC47667InH> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Iterator<InterfaceC47667InH> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Iterator<InterfaceC47667InH> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJJL(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Iterator<InterfaceC47667InH> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJJJJ(i, i2);
        }
    }
}
