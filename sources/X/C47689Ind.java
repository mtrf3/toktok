package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.lang.ref.WeakReference;

/* renamed from: X.Ind, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47689Ind extends TextureView implements InterfaceC46937IbV, InterfaceC47678InS {
    public SurfaceTexture LJLIL;
    public SurfaceWrapper LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public long LJLJJL;
    public TextureView.SurfaceTextureListener LJLJJLL;

    public C47689Ind() {
        throw null;
    }

    @Override // X.InterfaceC46937IbV
    public final void LIZ() {
    }

    @Override // X.InterfaceC46937IbV
    public final void LIZLLL(String str, boolean z) {
    }

    public final /* synthetic */ void LJFF(String str, ViewGroup.LayoutParams layoutParams) {
        C48690J9a.LIZLLL(this, str, layoutParams);
    }

    @Override // X.InterfaceC47678InS
    public /* bridge */ /* synthetic */ String getStackTraceString() {
        return C48690J9a.LIZ();
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    private void LJII() {
        SurfaceWrapper surfaceWrapper;
        WeakReference<InterfaceC47692Ing> weakReference;
        InterfaceC47692Ing interfaceC47692Ing;
        SurfaceTexture surfaceTexture = this.LJLIL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.LJLIL = null;
        }
        IXN ixn = IXN.LIZJ;
        if (ixn != null && ixn.isEnableSurfaceLifeCycleNotification() && (surfaceWrapper = this.LJLILLLLZI) != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC47692Ing = weakReference.get()) != null) {
            interfaceC47692Ing.LIZJ(this.LJLILLLLZI);
        }
        SurfaceWrapper surfaceWrapper2 = this.LJLILLLLZI;
        if (surfaceWrapper2 != null) {
            surfaceWrapper2.release();
            this.LJLILLLLZI = null;
        }
    }

    @Override // X.InterfaceC46937IbV
    public final void LJ() {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        if (this.LJLJJI && (surfaceTextureListener = getSurfaceTextureListener()) != null) {
            if (IXB.LIZ) {
                IXB.LIZIZ("KeepSurfaceTextureView", "refreshSurface.");
            }
            SurfaceWrapper surfaceWrapper = this.LJLILLLLZI;
            if (surfaceWrapper != null) {
                surfaceWrapper.release();
                this.LJLILLLLZI = null;
                if (this.LJLIL != null) {
                    this.LJLILLLLZI = new SurfaceWrapper(this.LJLIL, this);
                    surfaceTextureListener.onSurfaceTextureAvailable(this.LJLIL, getWidth(), getHeight());
                }
            }
        }
    }

    public final void LJIIIIZZ() {
        SurfaceWrapper surfaceWrapper;
        if (this.LJLIL != null && (surfaceWrapper = this.LJLILLLLZI) != null && surfaceWrapper.isValid()) {
            if (!this.LJLJI) {
                if (this.LJLIL != getSurfaceTexture()) {
                    setSurfaceTexture(this.LJLIL);
                    this.LJLJI = true;
                    TextureView.SurfaceTextureListener surfaceTextureListener = this.LJLJJLL;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureAvailable(this.LJLIL, getWidth(), getHeight());
                        return;
                    }
                    return;
                }
                LJII();
                return;
            }
            return;
        }
        LJII();
    }

    @Override // X.InterfaceC47678InS
    public final boolean LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLJJL < 500) {
            return false;
        }
        this.LJLJJL = currentTimeMillis;
        return true;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJJI = true;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJJI = false;
    }

    public final void LJI() {
        LJII();
    }

    public Surface getSurface() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0 && this.LJLJJI) {
            LJIIIIZZ();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LJIIIZ(layoutParams, "UNKNOWN");
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        C48690J9a.LJ(this, f);
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        C48690J9a.LJFF(this, f);
        super.setScaleY(f);
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.LJLJJLL = surfaceTextureListener;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        LIZJ(f, "UNKNOWN");
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        C48690J9a.LJII(this, f);
        super.setTranslationY(f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C48690J9a.LJIIIIZZ(this, i);
        super.setVisibility(i);
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        C48690J9a.LJIIIZ(this);
        super.startAnimation(animation);
    }

    public C47689Ind(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.InterfaceC47678InS
    public final void LIZJ(float f, String str) {
        C48690J9a.LJI(this, str, f);
        super.setTranslationX(f);
    }

    public final void LJIIIZ(ViewGroup.LayoutParams layoutParams, String str) {
        if ("UNKNOWN".equals(str)) {
            str = getStackTraceString();
        }
        LJFF(str, layoutParams);
        super.setLayoutParams(layoutParams);
    }

    public C47689Ind(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC47690Ine(this));
    }
}
