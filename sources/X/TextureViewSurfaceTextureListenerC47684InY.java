package X;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.TextureView;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import kotlin.jvm.internal.o;

/* renamed from: X.InY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC47684InY implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C47683InX LJLIL;

    public TextureViewSurfaceTextureListenerC47684InY(C47683InX c47683InX) {
        this.LJLIL = c47683InX;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLILLLLZI;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surface);
        }
        C47686Ina c47686Ina = C47683InX.LJLJL;
        boolean z = false;
        if (c47686Ina.LJLJJI.size() < c47686Ina.LJLIL) {
            c47686Ina.LJLJJI.put(surface, Long.valueOf(SystemClock.elapsedRealtime()));
            long j = c47686Ina.LJLILLLLZI;
            if (!c47686Ina.LJLJI.hasMessages(0)) {
                c47686Ina.LJLJI.sendEmptyMessageDelayed(0, j);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DTextureView: tryStoreOrRelease: ");
            LIZ.append(c47686Ina);
            LIZ.append(" Store, -> store.size = ");
            LIZ.append(c47686Ina.LJLJJI.size());
            SimRadar.keyScan("TextureView", X1D.LIZIZ(LIZ), new Object[0]);
            z = true;
        } else {
            SimRadar.keyScan("TextureView", "DTextureView: tryStoreOrRelease: " + c47686Ina + " -> Release, store.size = " + c47686Ina.LJLJJI.size(), new Object[0]);
        }
        return !z;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLILLLLZI;
        if (surfaceTextureListener == null) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureUpdated(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        C47683InX c47683InX = this.LJLIL;
        c47683InX.LIZIZ();
        c47683InX.LJLJI = new SurfaceWrapper(surface, c47683InX);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c47683InX.LJLIL);
        LIZ.append(": updateSurface: ");
        LIZ.append(surface);
        LIZ.append(" -> ");
        LIZ.append(c47683InX.LJLJI);
        SimRadar.keyScan("TextureView", X1D.LIZIZ(LIZ), new Object[0]);
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLILLLLZI;
        if (surfaceTextureListener == null) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureAvailable(surface, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        o.LJIIIZ(surface, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLIL.LJLILLLLZI;
        if (surfaceTextureListener == null) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureSizeChanged(surface, i, i2);
    }
}
