package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.PRr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64463PRr implements Runnable {
    public final /* synthetic */ C64458PRm LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ List<C64466PRu> LJLJI;
    public final /* synthetic */ C64464PRs LJLJJI;

    public RunnableC64463PRr(C64458PRm c64458PRm, long j, List<C64466PRu> list, C64464PRs c64464PRs) {
        this.LJLIL = c64458PRm;
        this.LJLILLLLZI = j;
        this.LJLJI = list;
        this.LJLJJI = c64464PRs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C64458PRm c64458PRm = this.LJLIL;
            long j = this.LJLILLLLZI;
            List<C64466PRu> list = this.LJLJI;
            C64464PRs c64464PRs = this.LJLJJI;
            Iterator<InterfaceC64469PRx> it = c64458PRm.LIZJ.iterator();
            while (it.hasNext() && !it.next().LIZ(c64464PRs, list, j)) {
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
