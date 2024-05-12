package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.InK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47670InK implements InterfaceC47247IgV {
    public static final String LJLJJL;
    public final C47689Ind LJLIL;
    public final CopyOnWriteArrayList<InterfaceC47667InH> LJLILLLLZI = new CopyOnWriteArrayList<>();
    public boolean LJLJI;
    public SurfaceTexture LJLJJI;

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
        this.LJLJI = true;
    }

    @Override // X.InterfaceC47247IgV
    public final int P7() {
        return 0;
    }

    @Override // X.InterfaceC47247IgV
    public final void Q7() {
        this.LJLJI = false;
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

    static {
        String str;
        if (((Boolean) IZ8.LJJJZ.getValue()).booleanValue()) {
            str = "TextureViewWrapper<init>";
        } else {
            str = "UNKNOWN";
        }
        LJLJJL = str;
    }

    @Override // X.InterfaceC47247IgV
    public final boolean d4() {
        return this.LJLIL.LJLJI;
    }

    @Override // X.InterfaceC47247IgV
    public final Surface getSurface() {
        return this.LJLIL.getSurface();
    }

    @Override // X.InterfaceC47247IgV
    public final void release() {
        SurfaceTexture surfaceTexture = this.LJLJJI;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // X.InterfaceC47247IgV
    public final void resume() {
        this.LJLIL.LJIIIIZZ();
    }

    @Override // X.InterfaceC47247IgV
    public final View getView() {
        return this.LJLIL;
    }

    public C47670InK(ViewGroup viewGroup) {
        C47689Ind c47689Ind = new C47689Ind(viewGroup.getContext(), null);
        this.LJLIL = c47689Ind;
        if (viewGroup instanceof FrameLayout) {
            c47689Ind.LJIIIZ(new FrameLayout.LayoutParams(-1, -1, 17), LJLJJL);
            viewGroup.addView(c47689Ind, 0);
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            c47689Ind.LJIIIZ(layoutParams, LJLJJL);
            viewGroup.addView(c47689Ind, 0);
        } else {
            c47689Ind.LJIIIZ(new ViewGroup.LayoutParams(-1, -1), LJLJJL);
            viewGroup.addView(c47689Ind, 0);
        }
        c47689Ind.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC47664InE(this));
    }

    @Override // X.InterfaceC47247IgV
    public final void N7(InterfaceC47667InH interfaceC47667InH) {
        try {
            if (!((Boolean) C47673InN.LIZ.getValue()).booleanValue()) {
                this.LJLILLLLZI.add(interfaceC47667InH);
            } else if (!this.LJLILLLLZI.contains(interfaceC47667InH)) {
                this.LJLILLLLZI.add(interfaceC47667InH);
            }
        } catch (Throwable unused) {
            this.LJLILLLLZI.add(interfaceC47667InH);
        }
    }

    @Override // X.InterfaceC47247IgV
    public final void R7(IQH iqh) {
        this.LJLILLLLZI.remove(iqh);
    }

    public C47670InK(C47689Ind c47689Ind) {
        this.LJLIL = c47689Ind;
        c47689Ind.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC47664InE(this));
    }
}
