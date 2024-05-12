package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperManager;

/* renamed from: X.FjK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39778FjK implements InterfaceC40458FuI {
    public final /* synthetic */ GatekeeperManager LIZ;
    public final /* synthetic */ InterfaceC39779FjL LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC40458FuI
    public final void LIZ() {
        GatekeeperManager gatekeeperManager = this.LIZ;
        gatekeeperManager.LIZJ.getClass();
        gatekeeperManager.LIZJ = new C233919Fz(true, "");
        Bundle bundle = new Bundle();
        bundle.putString("key", this.LIZJ);
        FMX.LJIIJJI("gate_keeper_task_completed", bundle);
    }

    @Override // X.InterfaceC40458FuI
    public final void LIZIZ() {
        GatekeeperManager gatekeeperManager = this.LIZ;
        C233919Fz c233919Fz = gatekeeperManager.LIZJ;
        if (c233919Fz.LIZ) {
            String LIZJ = this.LIZIZ.LIZJ();
            c233919Fz.getClass();
            gatekeeperManager.LIZJ = new C233919Fz(false, LIZJ);
        }
        Bundle bundle = new Bundle();
        bundle.putString("key", this.LIZJ);
        FMX.LJIIJJI("gate_keeper_task_shown", bundle);
    }

    public C39778FjK(GatekeeperManager gatekeeperManager, InterfaceC39779FjL interfaceC39779FjL, String str) {
        this.LIZ = gatekeeperManager;
        this.LIZIZ = interfaceC39779FjL;
        this.LIZJ = str;
    }
}
