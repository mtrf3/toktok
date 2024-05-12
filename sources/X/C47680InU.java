package X;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.LinkedHashSet;

/* renamed from: X.InU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47680InU implements InterfaceC47247IgV {
    public final SurfaceView LJLIL;
    public boolean LJLILLLLZI;
    public final java.util.Set<InterfaceC47667InH> LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public SurfaceControl LJLJJLL = new SurfaceControl.Builder().setName("surface_view").setBufferSize(0, 0).build();
    public Surface LJLJL;
    public final ViewGroup LJLJLJ;

    @Override // X.InterfaceC47247IgV
    public final /* synthetic */ void LLJJIII() {
    }

    @Override // X.InterfaceC47247IgV
    public final /* synthetic */ void LLLI() {
    }

    @Override // X.InterfaceC47247IgV
    public final /* synthetic */ void O(boolean z) {
    }

    @Override // X.InterfaceC47247IgV
    public final void O7() {
    }

    @Override // X.InterfaceC47247IgV
    public final int P7() {
        return 2;
    }

    @Override // X.InterfaceC47247IgV
    public final void Q7() {
    }

    @Override // X.InterfaceC47247IgV
    public final boolean S7() {
        return false;
    }

    @Override // X.InterfaceC47247IgV
    public final void T7() {
    }

    @Override // X.InterfaceC47247IgV
    public final void V3(boolean z) {
    }

    @Override // X.InterfaceC47247IgV
    public final /* synthetic */ void onPagePause() {
    }

    @Override // X.InterfaceC47247IgV
    public final void resume() {
    }

    @Override // X.InterfaceC47247IgV
    public final void release() {
        SurfaceControl surfaceControl = this.LJLJJLL;
        if (surfaceControl != null) {
            surfaceControl.release();
            this.LJLJJLL = null;
        }
        Surface surface = this.LJLJL;
        if (surface != null) {
            surface.release();
            this.LJLJL = null;
        }
    }

    @Override // X.InterfaceC47247IgV
    public final boolean d4() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC47247IgV
    public final Surface getSurface() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC47247IgV
    public final View getView() {
        return this.LJLIL;
    }

    public C47680InU(ViewGroup viewGroup) {
        SurfaceView surfaceView = new SurfaceView(viewGroup.getContext());
        this.LJLIL = surfaceView;
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(surfaceView, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(surfaceView, 0, layoutParams);
        } else {
            viewGroup.addView(surfaceView, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        this.LJLJLJ = viewGroup;
        viewGroup.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC47681InV(this));
        viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC47682InW(this, viewGroup));
        this.LJLJI = new LinkedHashSet();
        surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC47669InJ(this));
    }

    public final void LIZ(SurfaceView surfaceView) {
        int i;
        int i2;
        if (surfaceView == null) {
            new SurfaceControl.Transaction().reparent(this.LJLJJLL, null).setBufferSize(this.LJLJJLL, 0, 0).setVisibility(this.LJLJJLL, false).apply();
            return;
        }
        SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
        int width = surfaceView.getWidth();
        int height = surfaceView.getHeight();
        int width2 = this.LJLJLJ.getWidth();
        int height2 = this.LJLJLJ.getHeight();
        int i3 = surfaceView.getLayoutParams().width;
        int i4 = surfaceView.getLayoutParams().height;
        if (i3 == -1) {
            width = width2;
        } else if (i3 != -2) {
            width = i3;
        }
        if (i4 == -1) {
            height = height2;
        } else if (i4 != -2) {
            height = i4;
        }
        if (width > width2) {
            i = (width - width2) / 2;
        } else {
            width2 = width;
            i = 0;
        }
        if (height > height2) {
            i2 = (height - height2) / 2;
        } else {
            height2 = height;
            i2 = 0;
        }
        int i5 = -i;
        int i6 = -i2;
        int i7 = width2 + i;
        int i8 = height2 + i2;
        new SurfaceControl.Transaction().reparent(this.LJLJJLL, surfaceControl).setBufferSize(this.LJLJJLL, width, height).setGeometry(this.LJLJJLL, new Rect(i5, i6, i7, i8), new Rect(i5, i6, i7, i8), 0).setVisibility(this.LJLJJLL, true).apply();
    }

    @Override // X.InterfaceC47247IgV
    public final void N7(InterfaceC47667InH interfaceC47667InH) {
        this.LJLJI.add(interfaceC47667InH);
    }

    @Override // X.InterfaceC47247IgV
    public final void R7(IQH iqh) {
        this.LJLJI.remove(iqh);
    }
}
