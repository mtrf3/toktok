package X;

import kotlin.jvm.internal.AqS163S0100000_13;

/* loaded from: classes14.dex */
public final class UOC extends AbstractC792639e {
    public final C47121t6 LJ;
    public final C2A4 LJFF;
    public final C135365Sy LJI;
    public final InterfaceC65784Pro<C76800UCe> LJII;

    @Override // X.AbstractC792639e
    public final int LIZIZ() {
        return 2;
    }

    @Override // X.AbstractC792639e
    public final void LIZ() {
        if (!InterfaceC30442Bx8.g1.LIZJ().booleanValue()) {
            return;
        }
        if (!this.LIZ) {
            KL2.LJIILLIIL(8, this.LJ);
            KL2.LJIILLIIL(0, this.LJFF);
            KL2.LJIILLIIL(4, this.LJI);
            this.LIZIZ = false;
            C2A4 c2a4 = this.LJFF;
            if (c2a4 != null && !c2a4.LJFF()) {
                C15490jB.LJ(c2a4, "tiktok_live_watch_resource_demand_1", "ttlive_caption_loading.webp");
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJII;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJII;
        if (interfaceC65784Pro2 != null) {
            interfaceC65784Pro2.invoke();
        }
        this.LIZIZ = true;
    }

    public UOC(C47121t6 c47121t6, C2A4 c2a4, C135365Sy c135365Sy, AqS163S0100000_13 aqS163S0100000_13) {
        this.LJ = c47121t6;
        this.LJFF = c2a4;
        this.LJI = c135365Sy;
        this.LJII = aqS163S0100000_13;
        this.LIZJ = 10000L;
    }
}
