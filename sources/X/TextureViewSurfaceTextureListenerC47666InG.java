package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Iterator;

/* renamed from: X.InG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC47666InG implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C47671InL LJLIL;

    public TextureViewSurfaceTextureListenerC47666InG(C47671InL c47671InL) {
        this.LJLIL = c47671InL;
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
