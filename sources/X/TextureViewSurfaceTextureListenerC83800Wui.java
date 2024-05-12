package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Wui, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class TextureViewSurfaceTextureListenerC83800Wui implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C83802Wuk LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    public TextureViewSurfaceTextureListenerC83800Wui(C83802Wuk c83802Wuk) {
        this.LJLIL = c83802Wuk;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        C83802Wuk c83802Wuk = this.LJLIL;
        c83802Wuk.LIZJ = true;
        synchronized (c83802Wuk.LIZ) {
            Iterator<InterfaceC83803Wul> it = this.LJLIL.LIZ.iterator();
            while (it.hasNext()) {
                InterfaceC83803Wul next = it.next();
                o.LJI(this.LJLIL.LIZIZ);
                next.LIZ();
            }
        }
        Surface surface2 = this.LJLIL.LIZIZ;
        o.LJI(surface2);
        surface2.release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        C83802Wuk c83802Wuk = this.LJLIL;
        c83802Wuk.LIZJ = false;
        c83802Wuk.LIZIZ = new Surface(surface);
        synchronized (this.LJLIL.LIZ) {
            Iterator<InterfaceC83803Wul> it = this.LJLIL.LIZ.iterator();
            while (it.hasNext()) {
                InterfaceC83803Wul next = it.next();
                Surface surface2 = this.LJLIL.LIZIZ;
                o.LJI(surface2);
                next.LIZJ(surface2);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        synchronized (this.LJLIL.LIZ) {
            Iterator<InterfaceC83803Wul> it = this.LJLIL.LIZ.iterator();
            while (it.hasNext()) {
                InterfaceC83803Wul next = it.next();
                Surface surface2 = this.LJLIL.LIZIZ;
                o.LJI(surface2);
                next.LIZIZ(i, i2, surface2);
            }
        }
    }
}
