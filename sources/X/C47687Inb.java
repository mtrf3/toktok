package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;

/* renamed from: X.Inb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47687Inb extends TextureView {
    public SurfaceTexture LJLIL;
    public SurfaceWrapper LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public TextureView.SurfaceTextureListener LJLJJL;

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LJLIL != null) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.LJLIL;
            if (surfaceTexture != surfaceTexture2) {
                setSurfaceTexture(surfaceTexture2);
                this.LJLJJI = true;
            }
        }
        if (this.LJLJJI) {
            this.LJLJJI = false;
            post(new ARunnableS44S0100000_8(this, 66));
        }
    }

    public Surface getSurface() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C47687Inb(Context context) {
        super(context, null, 0);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC47693Inh());
        super.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC47688Inc(this));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LJLJJL = surfaceTextureListener;
    }
}
