package X;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.InM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47672InM implements InterfaceC47247IgV {
    public final C47683InX LJLIL;
    public final CopyOnWriteArrayList<InterfaceC47667InH> LJLILLLLZI = new CopyOnWriteArrayList<>();

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
        return 0;
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
    public final boolean d4() {
        SurfaceWrapper surfaceWrapper = this.LJLIL.LJLJI;
        if (surfaceWrapper == null) {
            return false;
        }
        return surfaceWrapper.isValid();
    }

    @Override // X.InterfaceC47247IgV
    public final Surface getSurface() {
        return this.LJLIL.getSurface();
    }

    @Override // X.InterfaceC47247IgV
    public final void release() {
        C47683InX c47683InX = this.LJLIL;
        if (c47683InX != null) {
            c47683InX.LIZIZ();
            c47683InX.LJLJJL = true;
        }
    }

    @Override // X.InterfaceC47247IgV
    public final View getView() {
        return this.LJLIL;
    }

    public C47672InM(ViewGroup viewGroup) {
        C47683InX c47683InX = new C47683InX(viewGroup.getContext());
        this.LJLIL = c47683InX;
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(c47683InX, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(c47683InX, 0, layoutParams);
        } else {
            viewGroup.addView(c47683InX, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        c47683InX.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC47665InF(this));
    }

    @Override // X.InterfaceC47247IgV
    public final void N7(InterfaceC47667InH interfaceC47667InH) {
        this.LJLILLLLZI.add(interfaceC47667InH);
    }

    @Override // X.InterfaceC47247IgV
    public final void R7(IQH iqh) {
        this.LJLILLLLZI.remove(iqh);
    }
}
