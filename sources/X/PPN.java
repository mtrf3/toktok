package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.lynx.animax.AnimaXElement;
import com.lynx.animax.UIAnimaX;
import com.lynx.canvas.FirstFrameAwareSurfaceTexture;
import com.lynx.tasm.base.LLog;

/* loaded from: classes12.dex */
public final class PPN extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC63882P5i {
    public final UIAnimaX LJLIL;
    public AnimaXElement LJLILLLLZI;
    public Surface LJLJI;
    public final FirstFrameAwareSurfaceTexture LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public float LJLLI;
    public boolean LJLLILLLL;

    @Override // X.InterfaceC63882P5i
    public final void onFirstFrameAvailable() {
        setNeedAlphaWorkaround(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        if (this.LJLL) {
            return;
        }
        super.onAttachedToWindow();
        AnimaXElement animaXElement = this.LJLILLLLZI;
        if (animaXElement.LIZIZ && this.LJLJLLL && !animaXElement.LJFF()) {
            this.LJLILLLLZI.LJIIIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.LJLL) {
            return;
        }
        if (this.LJLILLLLZI.LJFF()) {
            this.LJLJLLL = true;
        }
        super.onDetachedFromWindow();
        this.LJLILLLLZI.LJJII();
    }

    private void setNeedAlphaWorkaround(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setNeedAlphaWorkaround with ");
        LIZ.append(z);
        C77125UOr.LJIJI("UIAnimaXView", X1D.LIZIZ(LIZ));
        if (Build.VERSION.SDK_INT > 27) {
            return;
        }
        this.LJLLILLLL = z;
        if (z) {
            super.setAlpha(0.0f);
        } else {
            super.setAlpha(this.LJLLI);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceTextureDestroyed: ");
        LIZ.append(surfaceTexture);
        C77125UOr.LJIJI("UIAnimaXView", X1D.LIZIZ(LIZ));
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.LJLLI = f;
        if (!this.LJLLILLLL) {
            super.setAlpha(f);
        }
    }

    public void setIgnoreAttachStatus(boolean z) {
        this.LJLL = z;
    }

    public PPN(Context context, UIAnimaX uIAnimaX) {
        super(context);
        this.LJLLI = 1.0f;
        this.LJLIL = uIAnimaX;
        setSurfaceTextureListener(this);
        FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture = new FirstFrameAwareSurfaceTexture();
        this.LJLJJI = firstFrameAwareSurfaceTexture;
        firstFrameAwareSurfaceTexture.detachFromGLContext();
        firstFrameAwareSurfaceTexture.LJLILLLLZI = this;
        if (firstFrameAwareSurfaceTexture.LJLJI) {
            onFirstFrameAvailable();
        }
        this.LJLJI = new Surface(firstFrameAwareSurfaceTexture);
        setOpaque(false);
        setNeedAlphaWorkaround(true);
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (firstFrameAwareSurfaceTexture.equals(surfaceTexture)) {
            return;
        }
        if (surfaceTexture != null) {
            C77125UOr.LJIJI("UIAnimaXView", "Init TextureView but it has already another st.");
        }
        setSurfaceTexture(firstFrameAwareSurfaceTexture);
    }

    public final void LIZ(int i, int i2) {
        boolean z = this.LJLJL;
        if (z && this.LJLJJL == i && this.LJLJJLL == i2) {
            return;
        }
        if (i == 0 || i2 == 0) {
            String LIZLLL = C48263Iwt.LIZLLL("onSurfaceTextureSizeChanged with invalid size ", i, " / ", i2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[AnimaX]");
            LIZ.append("UIAnimaXView");
            LLog.LIZLLL(3, X1D.LIZIZ(LIZ), LIZLLL);
            return;
        }
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        if (!z) {
            UIAnimaX uIAnimaX = this.LJLIL;
            uIAnimaX.LJLJJI.LJII(this.LJLJI, this.LJLJJI, i, i2);
            this.LJLJL = true;
            return;
        }
        this.LJLIL.LJLJJI.LJI(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.LJLJLJ) {
            C77125UOr.LJIJI("UIAnimaXView", "onSurfaceTextureAvailable failed as view is destroyed.");
            return;
        }
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (!this.LJLJJI.equals(surfaceTexture2)) {
            if (surfaceTexture2 != null) {
                C77125UOr.LJIJI("UIAnimaXView", "Init TextureView but it has already another st.");
            }
            setSurfaceTexture(this.LJLJJI);
        }
        LIZ(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.LJLJLJ) {
            C77125UOr.LJIJI("UIAnimaXView", "onSurfaceTextureSizeChanged failed as view is destroyed.");
        } else {
            LIZ(i, i2);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super.onSizeChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
            C77125UOr.LJIILJJIL("UIAnimaXView", "onSizeChanged before added to view tree, may produce npe on some devices");
        }
    }
}
