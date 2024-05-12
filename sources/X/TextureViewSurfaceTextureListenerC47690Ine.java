package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.lang.ref.WeakReference;

/* renamed from: X.Ine, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC47690Ine implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C47689Ind LJLIL;

    public TextureViewSurfaceTextureListenerC47690Ine(C47689Ind c47689Ind) {
        this.LJLIL = c47689Ind;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C47689Ind c47689Ind = this.LJLIL;
        c47689Ind.LJLJI = false;
        TextureView.SurfaceTextureListener surfaceTextureListener = c47689Ind.LJLJJLL;
        if (surfaceTextureListener == null || !surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
            return false;
        }
        this.LJLIL.getClass();
        this.LJLIL.LJI();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        SurfaceWrapper surfaceWrapper;
        WeakReference<InterfaceC47692Ing> weakReference;
        InterfaceC47692Ing interfaceC47692Ing;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLJJLL;
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
        C47689Ind c47689Ind = this.LJLIL;
        if (surfaceTexture != c47689Ind.LJLIL) {
            c47689Ind.LJI();
        }
        C47689Ind c47689Ind2 = this.LJLIL;
        if (c47689Ind2.LJLIL == null) {
            c47689Ind2.LJLIL = surfaceTexture;
            C47689Ind c47689Ind3 = this.LJLIL;
            c47689Ind2.LJLILLLLZI = new SurfaceWrapper(c47689Ind3.LJLIL, c47689Ind3);
        }
        C47689Ind c47689Ind4 = this.LJLIL;
        c47689Ind4.LJLJI = true;
        TextureView.SurfaceTextureListener surfaceTextureListener = c47689Ind4.LJLJJLL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(c47689Ind4.LJLIL, i, i2);
        }
        IXN ixn = IXN.LIZJ;
        if (ixn != null && ixn.isEnableSurfaceLifeCycleNotification() && (surfaceWrapper = this.LJLIL.LJLILLLLZI) != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC47692Ing = weakReference.get()) != null) {
            interfaceC47692Ing.LIZ();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLJJLL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}
