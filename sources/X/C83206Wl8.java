package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wl8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83206Wl8 implements InterfaceC73032SlQ {
    public final /* synthetic */ C83204Wl6 LIZ;

    @Override // X.InterfaceC73032SlQ
    public final void LIZ() {
        C83203Wl5 c83203Wl5 = this.LIZ.LJI;
        InterfaceC83233WlZ interfaceC83233WlZ = c83203Wl5.LIZJ;
        if (interfaceC83233WlZ != null) {
            interfaceC83233WlZ.LIZJ();
        }
        C68249QqT c68249QqT = c83203Wl5.LIZLLL;
        String selectedCategoryName = c83203Wl5.LIZ.K7();
        c68249QqT.getClass();
        o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
        InterfaceC83246Wlm interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ;
        if (interfaceC83246Wlm != null) {
            interfaceC83246Wlm.LJIIJJI("cancel", selectedCategoryName);
        }
    }

    @Override // X.InterfaceC73032SlQ
    public final void LIZIZ() {
        this.LIZ.LJI.LIZLLL();
        this.LIZ.LJ();
    }

    public C83206Wl8(C83204Wl6 c83204Wl6) {
        this.LIZ = c83204Wl6;
    }
}
