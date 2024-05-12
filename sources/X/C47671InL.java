package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.InL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47671InL implements InterfaceC47247IgV {
    public final C47687Inb LJLIL;
    public final CopyOnWriteArrayList<InterfaceC47667InH> LJLILLLLZI = new CopyOnWriteArrayList<>();

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
    public final void LLJJIII() {
        SurfaceWrapper surfaceWrapper;
        C47687Inb c47687Inb = this.LJLIL;
        if (c47687Inb != null && (surfaceWrapper = c47687Inb.LJLILLLLZI) != null && surfaceWrapper.isValid() && c47687Inb.LJLJI) {
            c47687Inb.LJLILLLLZI.release();
            c47687Inb.LJLILLLLZI = new SurfaceWrapper(c47687Inb.LJLIL, null);
            c47687Inb.LJLJI = false;
        }
    }

    @Override // X.InterfaceC47247IgV
    public final void LLLI() {
        C47687Inb c47687Inb = this.LJLIL;
        if (c47687Inb != null) {
            c47687Inb.LJLJI = true;
        }
    }

    @Override // X.InterfaceC47247IgV
    public final boolean d4() {
        SurfaceWrapper surfaceWrapper = this.LJLIL.LJLILLLLZI;
        if (surfaceWrapper != null && surfaceWrapper.isValid()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47247IgV
    public final Surface getSurface() {
        return this.LJLIL.getSurface();
    }

    @Override // X.InterfaceC47247IgV
    public final void release() {
        SurfaceWrapper surfaceWrapper;
        WeakReference<InterfaceC47692Ing> weakReference;
        InterfaceC47692Ing interfaceC47692Ing;
        C47687Inb c47687Inb = this.LJLIL;
        SurfaceTexture surfaceTexture = c47687Inb.LJLIL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            c47687Inb.LJLIL = null;
        }
        IXN ixn = IXN.LIZJ;
        if (ixn != null && ixn.isEnableSurfaceLifeCycleNotification() && (surfaceWrapper = c47687Inb.LJLILLLLZI) != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC47692Ing = weakReference.get()) != null) {
            interfaceC47692Ing.LIZJ(c47687Inb.LJLILLLLZI);
        }
        SurfaceWrapper surfaceWrapper2 = c47687Inb.LJLILLLLZI;
        if (surfaceWrapper2 != null) {
            surfaceWrapper2.release();
            c47687Inb.LJLILLLLZI = null;
        }
        c47687Inb.setSurfaceTextureListener(null);
    }

    @Override // X.InterfaceC47247IgV
    public final View getView() {
        return this.LJLIL;
    }

    public C47671InL(ViewGroup viewGroup) {
        C47687Inb c47687Inb = new C47687Inb(viewGroup.getContext());
        this.LJLIL = c47687Inb;
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(c47687Inb, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(c47687Inb, 0, layoutParams);
        } else {
            viewGroup.addView(c47687Inb, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        c47687Inb.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC47666InG(this));
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
