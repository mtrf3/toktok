package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.J9j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48699J9j extends CVR {
    public SurfaceTexture LJLJL;
    public Surface LJLJLJ;
    public boolean LJLJLLL;
    public TextureView.SurfaceTextureListener LJLL;

    public final void LIZIZ() {
        SurfaceTexture surfaceTexture = this.LJLJL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.LJLJL = null;
        }
        Surface surface = this.LJLJLJ;
        if (surface != null) {
            surface.release();
            this.LJLJLJ = null;
        }
    }

    public Surface getSurface() {
        return this.LJLJLJ;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C48699J9j(Context context) {
        super(context, 0);
        super.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC48700J9k(this));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        Surface surface;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            C0NB.LJIIIZ("KeepSurfaceTextureRenderView", "resume");
            if (this.LJLJL != null && (surface = this.LJLJLJ) != null && surface.isValid()) {
                if (!this.LJLJLLL) {
                    if (this.LJLJL != getSurfaceTexture()) {
                        try {
                            setSurfaceTexture(this.LJLJL);
                        } catch (Exception unused) {
                        }
                        this.LJLJLLL = true;
                        TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLL;
                        if (surfaceTextureListener != null) {
                            surfaceTextureListener.onSurfaceTextureAvailable(this.LJLJL, getWidth(), getHeight());
                            return;
                        }
                        return;
                    }
                    LIZIZ();
                    return;
                }
                return;
            }
            LIZIZ();
        }
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LJLL = surfaceTextureListener;
    }
}
