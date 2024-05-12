package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.It0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC48022It0 extends FrameLayout implements InterfaceC48020Isy, TextureView.SurfaceTextureListener {
    public C48023It1 LJLIL;
    public InterfaceC48024It2 LJLILLLLZI;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public Surface getSurface() {
        C48023It1 c48023It1 = this.LJLIL;
        if (c48023It1 != null) {
            return c48023It1.getSurface();
        }
        return null;
    }

    public Context getViewContext() {
        return getContext();
    }

    public TextureViewSurfaceTextureListenerC48022It0(Context context) {
        super(context);
        C48023It1 c48023It1 = new C48023It1(context);
        this.LJLIL = c48023It1;
        c48023It1.setSurfaceTextureListener(this);
        addView(this.LJLIL, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z = false;
        this.LJLIL.setKeepScreenOn(false);
        InterfaceC48024It2 interfaceC48024It2 = this.LJLILLLLZI;
        if (interfaceC48024It2 != null) {
            interfaceC48024It2.onSurfaceTextureDestroyed(surfaceTexture);
        }
        C48023It1 c48023It1 = this.LJLIL;
        if (c48023It1.LJLILLLLZI && c48023It1.LJLJJI) {
            z = true;
        }
        return !z;
    }

    public void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            this.LJLIL.setLayoutParams(layoutParams);
        }
    }

    public void setSurfaceViewVisibility(int i) {
        C48023It1 c48023It1 = this.LJLIL;
        if (c48023It1 != null) {
            c48023It1.setVisibility(i);
        }
    }

    public void setTextureViewOnTouchListener(View.OnTouchListener onTouchListener) {
        this.LJLIL.setOnTouchListener(onTouchListener);
    }

    public void setVideoViewCallback(InterfaceC48024It2 interfaceC48024It2) {
        this.LJLILLLLZI = interfaceC48024It2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.LJLIL.setKeepScreenOn(true);
        InterfaceC48024It2 interfaceC48024It2 = this.LJLILLLLZI;
        if (interfaceC48024It2 != null) {
            interfaceC48024It2.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }
}
