package X;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class TextureViewSurfaceTextureListenerC83872Wvs implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ TextureView.SurfaceTextureListener LJLIL;
    public final /* synthetic */ C83866Wvm LJLILLLLZI;
    public final /* synthetic */ InterfaceC83927Wwl LJLJI;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture texture) {
        o.LJIIIZ(texture, "texture");
        this.LJLILLLLZI.getMediaController().LLZZ(C83881Ww1.LJLIL, this.LJLJI.LJJJJJL().LJIJJLI());
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(texture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture texture) {
        o.LJIIIZ(texture, "texture");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(texture);
        }
    }

    public TextureViewSurfaceTextureListenerC83872Wvs(TextureView.SurfaceTextureListener surfaceTextureListener, C83866Wvm c83866Wvm, C83924Wwi c83924Wwi) {
        this.LJLIL = surfaceTextureListener;
        this.LJLILLLLZI = c83866Wvm;
        this.LJLJI = c83924Wwi;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture texture, int i, int i2) {
        o.LJIIIZ(texture, "texture");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(texture, i, i2);
        }
        Surface surface = new Surface(texture);
        InterfaceC83865Wvl mediaController = this.LJLILLLLZI.getMediaController();
        String str = Build.DEVICE;
        o.LJIIIIZZ(str, "Build.DEVICE");
        mediaController.u8(surface, str, C83880Ww0.LJLIL);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture texture, int i, int i2) {
        o.LJIIIZ(texture, "texture");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(texture, i, i2);
        }
    }
}
