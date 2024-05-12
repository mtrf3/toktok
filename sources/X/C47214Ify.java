package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;

/* renamed from: X.Ify, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47214Ify extends AbstractC47210Ifu {
    public C40660FxY LJ;
    public C47217Ig1 LJFF;
    public final OnPreRenderListener LJI;
    public C46539IOh LJII;

    @Override // X.AbstractC47210Ifu
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void resume() {
        InterfaceC47220Ig4 interfaceC47220Ig4;
        C40660FxY c40660FxY = this.LJ;
        if (c40660FxY != null && (interfaceC47220Ig4 = (InterfaceC47220Ig4) c40660FxY.LJLIL) != null) {
            interfaceC47220Ig4.resume();
        }
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void release() {
        super.release();
        C46539IOh c46539IOh = this.LJII;
        if (c46539IOh != null) {
            c46539IOh.LIZJ(this.LJFF);
        }
        C40660FxY c40660FxY = this.LJ;
        if (c40660FxY != null) {
            ((InterfaceC47220Ig4) c40660FxY.LJLJI).release();
        }
    }

    public C47214Ify(OnPreRenderListener onPreRenderListener) {
        this.LJI = onPreRenderListener;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        InterfaceC47220Ig4 interfaceC47220Ig4;
        C40660FxY c40660FxY = this.LJ;
        if (c40660FxY != null && (interfaceC47220Ig4 = (InterfaceC47220Ig4) c40660FxY.LJLIL) != null) {
            interfaceC47220Ig4.LIZ(interfaceC46811IYt);
        }
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LIZIZ(IZ2 iz2) {
        C40660FxY c40660FxY = this.LJ;
        if (c40660FxY == null) {
            return;
        }
        if (iz2.LJJLIIIJLJLI() != null) {
            c40660FxY.LJLIL = c40660FxY.LJLJI;
        } else {
            c40660FxY.LJLIL = c40660FxY.LJLILLLLZI;
        }
        ((InterfaceC47220Ig4) c40660FxY.LJLIL).LIZIZ(iz2);
    }

    @Override // X.AbstractC47210Ifu, X.InterfaceC47232IgG
    public final void LIZJ(IU3 iu3) {
        C40660FxY c40660FxY = this.LJ;
        if (c40660FxY != null && (iu3 instanceof C47228IgC)) {
            C47249IgX c47249IgX = ((C47228IgC) iu3).LIZ;
            InterfaceC47220Ig4 interfaceC47220Ig4 = (InterfaceC47220Ig4) c40660FxY.LJLIL;
            if (interfaceC47220Ig4 != null) {
                interfaceC47220Ig4.LIZJ(c47249IgX);
            }
        }
    }

    @Override // X.AbstractC47210Ifu
    public final void LIZLLL(C46539IOh c46539IOh) {
        this.LJII = c46539IOh;
        C47217Ig1 c47217Ig1 = new C47217Ig1(this.LIZJ, this.LJ);
        this.LJFF = c47217Ig1;
        c46539IOh.LIZ(c47217Ig1);
        C40660FxY c40660FxY = this.LJ;
        if (c40660FxY != null) {
            OnPreRenderListener onPreRenderListener = this.LJI;
            InterfaceC47220Ig4 interfaceC47220Ig4 = (InterfaceC47220Ig4) c40660FxY.LJLIL;
            if (interfaceC47220Ig4 != null) {
                interfaceC47220Ig4.LJ(onPreRenderListener);
            }
        }
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJ(InterfaceC197787pW interfaceC197787pW) {
        InterfaceC47220Ig4 interfaceC47220Ig4;
        C40660FxY c40660FxY = this.LJ;
        if (c40660FxY != null && (interfaceC47220Ig4 = (InterfaceC47220Ig4) c40660FxY.LJLIL) != null) {
            interfaceC47220Ig4.LJJIIJZLJL();
        }
    }

    @Override // X.AbstractC47210Ifu
    public final void LJIIIIZZ(IWH iwh) {
        this.LIZJ = iwh;
        this.LJ = new C40660FxY(iwh);
    }
}
