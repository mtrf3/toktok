package X;

import Y.ARunnableS9S0101000_5;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.lang.ref.WeakReference;

/* renamed from: X.Inc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC47688Inc implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C47687Inb LJLIL;

    public TextureViewSurfaceTextureListenerC47688Inc(C47687Inb c47687Inb) {
        this.LJLIL = c47687Inb;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLJJL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        this.LJLIL.post(new ARunnableS9S0101000_5(3, this, 7));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        SurfaceWrapper surfaceWrapper;
        WeakReference<InterfaceC47692Ing> weakReference;
        InterfaceC47692Ing interfaceC47692Ing;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLJJL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        IXN ixn = IXN.LIZJ;
        if (ixn != null && ixn.isEnableSurfaceLifeCycleNotification() && (surfaceWrapper = this.LJLIL.LJLILLLLZI) != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC47692Ing = weakReference.get()) != null) {
            interfaceC47692Ing.LIZIZ();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceWrapper surfaceWrapper;
        WeakReference<InterfaceC47692Ing> weakReference;
        InterfaceC47692Ing interfaceC47692Ing;
        C47687Inb c47687Inb = this.LJLIL;
        if (c47687Inb.LJLILLLLZI == null) {
            c47687Inb.LJLILLLLZI = new SurfaceWrapper(surfaceTexture, null);
        }
        C47687Inb c47687Inb2 = this.LJLIL;
        c47687Inb2.LJLIL = surfaceTexture;
        TextureView.SurfaceTextureListener surfaceTextureListener = c47687Inb2.LJLJJL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        IXN ixn = IXN.LIZJ;
        if (ixn != null && ixn.isEnableSurfaceLifeCycleNotification() && (surfaceWrapper = this.LJLIL.LJLILLLLZI) != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC47692Ing = weakReference.get()) != null) {
            interfaceC47692Ing.LIZ();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLJJL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}
