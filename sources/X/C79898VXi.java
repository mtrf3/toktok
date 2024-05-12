package X;

import Y.ARunnableS2S0100002_14;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.List;

/* renamed from: X.VXi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79898VXi extends TextureViewSurfaceTextureListenerC88419Yn1 implements InterfaceC79452VGe {
    public volatile boolean LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public DataSource.ScaleType LJLLLLLL;
    public InterfaceC79896VXg LJLZ;
    public IPlayerController LJZ;
    public Surface LJZI;
    public boolean LJZL;
    public final C79897VXh LL;

    @Override // X.InterfaceC79452VGe
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC79452VGe
    public final void LJIIIZ() {
        this.LJLZ.LJIIIZ();
    }

    @Override // X.InterfaceC79452VGe
    public final void onCompletion() {
        this.LJLZ.onCompletion();
    }

    @Override // X.InterfaceC79452VGe
    public final void release() {
        C79897VXh c79897VXh = this.LL;
        if (c79897VXh != null) {
            Surface surface = c79897VXh.LIZ.LJZI;
            if (surface != null) {
                surface.release();
            }
            c79897VXh.LIZ.LJLLJ = false;
            c79897VXh.LIZ.LJZI = null;
        }
    }

    @Override // X.TextureViewSurfaceTextureListenerC88419Yn1, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJI(new ARunnableS47S0100000_11(this, 106));
    }

    @Override // X.InterfaceC79452VGe
    public final boolean LIZJ() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC79452VGe
    public boolean getLastFrameHold() {
        return this.LJZL;
    }

    @Override // X.InterfaceC79452VGe
    public DataSource.ScaleType getScaleType() {
        return this.LJLLLLLL;
    }

    public C79898VXi(Context context) {
        super(context);
        C79897VXh c79897VXh = new C79897VXh(this);
        this.LL = c79897VXh;
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLConfigChooser(new C88423Yn5(this, 8, 16));
            InterfaceC79896VXg interfaceC79896VXg = this.LJLZ;
            if (interfaceC79896VXg != null) {
                interfaceC79896VXg.LJ(c79897VXh);
            }
            setPreserveEGLContextOnPause(true);
            setOpaque(false);
        }
    }

    @Override // X.InterfaceC79452VGe
    public final void LIZIZ(List<MaskSrc> list) {
        LJI(new ARunnableS33S0200000_14(this, list, 68));
    }

    @Override // X.InterfaceC79452VGe
    public final boolean LIZLLL(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        C16880lQ.LJLLL(this, viewGroup);
        return true;
    }

    @Override // X.InterfaceC79452VGe
    public final boolean LJFF(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        if (viewGroup2 == viewGroup) {
            return true;
        }
        LIZLLL(viewGroup2);
        if (viewGroup.indexOfChild(this) != -1) {
            return false;
        }
        viewGroup.addView(this);
        return true;
    }

    @Override // X.InterfaceC79452VGe
    public void setConfigParams(DataSource.DataInfo dataInfo) {
        this.LJLLLLLL = dataInfo.getScaleType();
        if (this.LJLZ == null) {
            return;
        }
        LJI(new ARunnableS33S0200000_14(this, dataInfo, 67));
    }

    @Override // X.InterfaceC79452VGe
    public void setFirstGLFrameListener(VGY vgy) {
        this.LJLZ.setFirstGLFrameListener(vgy);
    }

    @Override // X.InterfaceC79452VGe
    public void setLastFrameHold(boolean z) {
        this.LJZL = z;
    }

    @Override // X.InterfaceC79452VGe
    public void setPlayerController(IPlayerController iPlayerController) {
        this.LJZ = iPlayerController;
    }

    @Override // X.InterfaceC79452VGe
    public void setVideoRenderer(InterfaceC79896VXg interfaceC79896VXg) {
        this.LJLZ = interfaceC79896VXg;
        setRenderer(interfaceC79896VXg);
        InterfaceC79896VXg interfaceC79896VXg2 = this.LJLZ;
        if (interfaceC79896VXg2 != null) {
            interfaceC79896VXg2.LJ(this.LL);
        }
        setRenderMode(0);
    }

    @Override // X.InterfaceC79452VGe
    public final void LJ(float f, float f2) {
        if (f > 0.0f && f2 > 0.0f) {
            this.LJLLL = f;
            this.LJLLLL = f2;
        }
        if (this.LJLZ == null) {
            return;
        }
        LJI(new ARunnableS2S0100002_14(this, getMeasuredWidth(), getMeasuredHeight(), 1));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        LJ(this.LJLLL, this.LJLLLL);
    }
}
