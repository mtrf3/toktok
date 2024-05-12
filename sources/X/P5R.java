package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.vesdk.VEEditor;

/* loaded from: classes12.dex */
public class P5R implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ VEEditor LJLIL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public P5R(VEEditor vEEditor) {
        this.LJLIL = vEEditor;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.LJLIL.LJJIIZ();
        Surface surface = this.LJLIL.LLIIIJ;
        if (surface != null) {
            surface.release();
            return true;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        VEEditor vEEditor = this.LJLIL;
        if (vEEditor.LLIIIILZ == surfaceTexture) {
            vEEditor.LJJIIJZLJL(vEEditor.LLIIIJ);
        } else {
            vEEditor.LLIIIJ = new Surface(surfaceTexture);
            VEEditor vEEditor2 = this.LJLIL;
            vEEditor2.LJJIIJZLJL(vEEditor2.LLIIIJ);
        }
        this.LJLIL.LLIIIILZ = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        VEEditor vEEditor = this.LJLIL;
        vEEditor.LLFFF = i;
        vEEditor.LLFII = i2;
        vEEditor.LJJJJJL();
    }
}
