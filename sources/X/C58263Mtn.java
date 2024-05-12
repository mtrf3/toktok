package X;

import com.bytedance.pumbaa.network.adapter.NetworkServiceImpl;
import com.bytedance.pumbaa.network.adapter.api.INetworkService;
import com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl.SandboxServiceImpl;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask;
import yq4.a;

/* renamed from: X.Mtn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58263Mtn implements InterfaceC65954PuY {
    public final /* synthetic */ PumbaaTask LIZ;

    @Override // X.InterfaceC65954PuY
    public final void LIZ() {
        this.LIZ.getClass();
        INetworkService LJIILIIL = NetworkServiceImpl.LJIILIIL();
        InterfaceC65943PuN LJJIIJ = a.LJFF().LJJIIJ();
        if (LJJIIJ != null) {
            LJIILIIL.LJII(LJJIIJ);
        }
        if (C19N.LJ("pns_pl_net_monitor_switch", false)) {
            NetworkServiceImpl.LJIILIIL().LJII(new C65959Pud());
        }
        SandboxServiceImpl.LIZ().initDFIDNetMonitor();
    }

    public C58263Mtn(PumbaaTask pumbaaTask) {
        this.LIZ = pumbaaTask;
    }
}
