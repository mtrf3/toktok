package X;

import Y.ARunnableS18S0000000_11;
import Y.ARunnableS2S0100002_14;
import Y.ARunnableS33S0200000_14;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.List;

/* renamed from: X.VXf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79895VXf extends GLSurfaceView implements InterfaceC79452VGe {
    public volatile boolean LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public DataSource.ScaleType LJLJJI;
    public InterfaceC79896VXg LJLJJL;
    public IPlayerController LJLJJLL;
    public Surface LJLJL;
    public boolean LJLJLJ;
    public final C79894VXe LJLJLLL;

    public static void setNewInstanceCallback(InterfaceC79899VXj interfaceC79899VXj) {
    }

    @Override // X.InterfaceC79452VGe
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC79452VGe
    public final void LJIIIZ() {
        this.LJLJJL.LJIIIZ();
    }

    @Override // X.InterfaceC79452VGe
    public final void onCompletion() {
        this.LJLJJL.onCompletion();
    }

    @Override // X.InterfaceC79452VGe
    public final void release() {
        C79894VXe c79894VXe = this.LJLJLLL;
        if (c79894VXe != null) {
            Surface surface = c79894VXe.LIZ.LJLJL;
            if (surface != null) {
                surface.release();
            }
            c79894VXe.LIZ.LJLIL = false;
            c79894VXe.LIZ.LJLJL = null;
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        queueEvent(new ARunnableS18S0000000_11(24));
    }

    @Override // X.InterfaceC79452VGe
    public final boolean LIZJ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC79452VGe
    public boolean getLastFrameHold() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC79452VGe
    public DataSource.ScaleType getScaleType() {
        return this.LJLJJI;
    }

    public C79895VXf(Context context) {
        super(context, null);
        C79894VXe c79894VXe = new C79894VXe(this);
        this.LJLJLLL = c79894VXe;
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(-3);
            InterfaceC79896VXg interfaceC79896VXg = this.LJLJJL;
            if (interfaceC79896VXg != null) {
                interfaceC79896VXg.LJ(c79894VXe);
            }
            setZOrderOnTop(true);
            setPreserveEGLContextOnPause(true);
        }
    }

    @Override // X.InterfaceC79452VGe
    public final void LIZIZ(List<MaskSrc> list) {
        queueEvent(new ARunnableS33S0200000_14(this, list, 66));
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
        this.LJLJJI = dataInfo.getScaleType();
        if (this.LJLJJL == null) {
            return;
        }
        queueEvent(new ARunnableS33S0200000_14(this, dataInfo, 65));
    }

    @Override // X.InterfaceC79452VGe
    public void setFirstGLFrameListener(VGY vgy) {
        this.LJLJJL.setFirstGLFrameListener(vgy);
    }

    @Override // X.InterfaceC79452VGe
    public void setLastFrameHold(boolean z) {
        this.LJLJLJ = z;
    }

    @Override // X.InterfaceC79452VGe
    public void setPlayerController(IPlayerController iPlayerController) {
        this.LJLJJLL = iPlayerController;
    }

    @Override // X.InterfaceC79452VGe
    public void setVideoRenderer(InterfaceC79896VXg interfaceC79896VXg) {
        this.LJLJJL = interfaceC79896VXg;
        setRenderer(interfaceC79896VXg);
        InterfaceC79896VXg interfaceC79896VXg2 = this.LJLJJL;
        if (interfaceC79896VXg2 != null) {
            interfaceC79896VXg2.LJ(this.LJLJLLL);
        }
        setRenderMode(0);
    }

    @Override // X.InterfaceC79452VGe
    public final void LJ(float f, float f2) {
        if (f > 0.0f && f2 > 0.0f) {
            this.LJLILLLLZI = f;
            this.LJLJI = f2;
        }
        if (this.LJLJJL == null) {
            return;
        }
        queueEvent(new ARunnableS2S0100002_14(this, getMeasuredWidth(), getMeasuredHeight(), 0));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        LJ(this.LJLILLLLZI, this.LJLJI);
    }
}
