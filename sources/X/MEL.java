package X;

import com.ss.android.ugc.feed.platform.cell.pinch.PinchComponent;

/* loaded from: classes10.dex */
public final class MEL implements InterfaceC222998p5 {
    public final /* synthetic */ PinchComponent LJLIL;

    @Override // X.InterfaceC222998p5
    public final void LLJLIL() {
        PinchComponent.c4(this.LJLIL, false);
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LLI;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.LLJLIL();
        }
        ((AbstractC48820JEa) this.LJLIL.LLFII.getValue()).LJIIJ(MEN.LJLIL);
    }

    @Override // X.InterfaceC222998p5
    public final void m() {
        PinchComponent.c4(this.LJLIL, true);
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LLI;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.m();
        }
        ((AbstractC48820JEa) this.LJLIL.LLFII.getValue()).LJIIJ(MEM.LJLIL);
    }

    @Override // X.InterfaceC222998p5
    public final void onScaleBegin() {
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LLI;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.onScaleBegin();
        }
    }

    @Override // X.InterfaceC222998p5
    public final void onScaleEnd() {
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LLI;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.onScaleEnd();
        }
    }

    public MEL(PinchComponent pinchComponent) {
        this.LJLIL = pinchComponent;
    }

    @Override // X.InterfaceC222998p5
    public final void Y1(float f) {
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LLI;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.Y1(f);
        }
    }

    @Override // X.InterfaceC222998p5
    public final void onScale(float f) {
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LLI;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.onScale(f);
        }
    }
}
