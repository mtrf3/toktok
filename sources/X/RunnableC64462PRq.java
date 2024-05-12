package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.PRq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64462PRq implements Runnable {
    public final /* synthetic */ C64460PRo LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C64464PRs LJLJJI;

    public RunnableC64462PRq(C64460PRo c64460PRo, long j, long j2, C64464PRs c64464PRs) {
        this.LJLIL = c64460PRo;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = c64464PRs;
    }

    public final void LIZ() {
        C64460PRo c64460PRo = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI / 1000000;
        C64464PRs c64464PRs = this.LJLJJI;
        c64460PRo.getClass();
        long j3 = j2 + j;
        CopyOnWriteArrayList<C64466PRu> copyOnWriteArrayList = c64464PRs.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<C64466PRu> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C64466PRu next = it.next();
            C64466PRu c64466PRu = next;
            if (c64466PRu.LIZIZ >= j2 && c64466PRu.LIZ <= j3) {
                arrayList.add(next);
            }
        }
        Iterator<InterfaceC64469PRx> it2 = c64460PRo.LIZJ.iterator();
        while (it2.hasNext() && !it2.next().LIZ(c64464PRs, arrayList, j)) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
