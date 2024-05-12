package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IRQ implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C70756Rpo LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture p0, int i, int i2) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        o.LJIIIZ(surface, "surface");
        SurfaceTexture surfaceTexture = this.LJLIL.LJLL.LIZ;
        if (surfaceTexture == null || IQ9.LJIIIIZZ(surfaceTexture)) {
            return true;
        }
        return false;
    }

    public IRQ(View view, C70756Rpo c70756Rpo) {
        this.LJLIL = c70756Rpo;
        this.LJLILLLLZI = view;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        C73044Slc c73044Slc;
        o.LJIIIZ(surface, "surface");
        C70756Rpo c70756Rpo = this.LJLIL;
        if (!c70756Rpo.LLFFF) {
            return;
        }
        SurfaceTexture surfaceTexture = c70756Rpo.LJLL.LIZ;
        if (surfaceTexture == null || IQ9.LJIIIIZZ(surfaceTexture)) {
            IQ9 iq9 = this.LJLIL.LJLL;
            iq9.LIZ = surface;
            iq9.LJI(new Surface(surface));
        } else {
            SurfaceTexture surfaceTexture2 = this.LJLIL.LJLL.LIZ;
            if (surfaceTexture2 != null) {
                View view = this.LJLILLLLZI;
                if (!o.LJ(surfaceTexture2, ((TextureView) view.findViewById(R.id.hst).findViewById(R.id.n8n)).getSurfaceTexture())) {
                    ((TextureView) view.findViewById(R.id.hst).findViewById(R.id.n8n)).setSurfaceTexture(surfaceTexture2);
                }
            }
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null && (c73044Slc = (C73044Slc) view2.findViewById(R.id.hst)) != null) {
            c73044Slc.LJIIJ();
        }
    }
}
