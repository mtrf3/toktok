package X;

import android.os.Build;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.playerkit.videoview.SurfaceViewWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.IgU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47246IgU implements InterfaceC47247IgV {
    public static int LJLILLLLZI = -1;
    public InterfaceC47247IgV LJLIL;

    @Override // X.InterfaceC47247IgV
    public final void LLJJIII() {
        InterfaceC47247IgV interfaceC47247IgV = this.LJLIL;
        if (interfaceC47247IgV != null) {
            interfaceC47247IgV.LLJJIII();
        }
    }

    @Override // X.InterfaceC47247IgV
    public final void LLLI() {
        InterfaceC47247IgV interfaceC47247IgV = this.LJLIL;
        if (interfaceC47247IgV != null) {
            interfaceC47247IgV.LLLI();
        }
    }

    @Override // X.InterfaceC47247IgV
    public final void O7() {
        this.LJLIL.O7();
    }

    @Override // X.InterfaceC47247IgV
    public final int P7() {
        return this.LJLIL.P7();
    }

    @Override // X.InterfaceC47247IgV
    public final void Q7() {
        this.LJLIL.Q7();
    }

    @Override // X.InterfaceC47247IgV
    public final boolean S7() {
        return this.LJLIL.S7();
    }

    @Override // X.InterfaceC47247IgV
    public final void T7() {
        this.LJLIL.T7();
    }

    @Override // X.InterfaceC47247IgV
    public final boolean d4() {
        return this.LJLIL.d4();
    }

    @Override // X.InterfaceC47247IgV
    public final Surface getSurface() {
        return this.LJLIL.getSurface();
    }

    @Override // X.InterfaceC47247IgV
    public final View getView() {
        return this.LJLIL.getView();
    }

    @Override // X.InterfaceC47247IgV
    public final void onPagePause() {
        InterfaceC47247IgV interfaceC47247IgV = this.LJLIL;
        if (interfaceC47247IgV != null) {
            interfaceC47247IgV.onPagePause();
        }
    }

    @Override // X.InterfaceC47247IgV
    public final void release() {
        InterfaceC47247IgV interfaceC47247IgV = this.LJLIL;
        if (interfaceC47247IgV != null) {
            interfaceC47247IgV.release();
        }
    }

    @Override // X.InterfaceC47247IgV
    public final void resume() {
        this.LJLIL.resume();
    }

    public static C47246IgU LIZJ(C47689Ind c47689Ind) {
        Object tag = c47689Ind.getTag();
        if (tag instanceof C47246IgU) {
            return (C47246IgU) tag;
        }
        C47246IgU c47246IgU = new C47246IgU();
        c47246IgU.LJLIL = new C47670InK(c47689Ind);
        c47689Ind.setTag(c47246IgU);
        return c47246IgU;
    }

    @Override // X.InterfaceC47247IgV
    public final void N7(InterfaceC47667InH interfaceC47667InH) {
        this.LJLIL.N7(interfaceC47667InH);
    }

    @Override // X.InterfaceC47247IgV
    public final void O(boolean z) {
        InterfaceC47247IgV interfaceC47247IgV = this.LJLIL;
        if (interfaceC47247IgV != null) {
            interfaceC47247IgV.O(z);
        }
    }

    @Override // X.InterfaceC47247IgV
    public final void R7(IQH iqh) {
        this.LJLIL.R7(iqh);
    }

    @Override // X.InterfaceC47247IgV
    public final void V3(boolean z) {
        InterfaceC47247IgV interfaceC47247IgV = this.LJLIL;
        if (interfaceC47247IgV != null) {
            interfaceC47247IgV.V3(z);
        }
    }

    public static void LIZIZ(boolean z, C47246IgU c47246IgU, ViewGroup viewGroup) {
        if (z) {
            c47246IgU.LJLIL = new C47671InL(viewGroup);
            return;
        }
        Object value = IZ8.LJLIIIL.getValue();
        o.LJIIIIZZ(value, "<get-enableSurfaceTextureReuse>(...)");
        if (((Boolean) value).booleanValue()) {
            c47246IgU.LJLIL = new C47672InM(viewGroup);
        } else {
            c47246IgU.LJLIL = new C47670InK(viewGroup);
        }
    }

    public static C47246IgU LIZ(ViewGroup viewGroup, boolean z, boolean z2, int i, int i2) {
        C47246IgU c47246IgU = new C47246IgU();
        IXN ixn = IXN.LIZJ;
        if (ixn.isUseSurfaceControl() && z) {
            c47246IgU.LJLIL = new C47680InU(viewGroup);
        } else if ((Build.VERSION.SDK_INT >= 24 && z2) || (ixn.isUseSurfaceView() && z)) {
            c47246IgU.LJLIL = new SurfaceViewWrapper(i, i2, viewGroup);
        } else {
            LIZIZ(false, c47246IgU, viewGroup);
        }
        c47246IgU.getView().setTag(c47246IgU);
        return c47246IgU;
    }
}
