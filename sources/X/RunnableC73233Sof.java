package X;

import Y.ARunnableS31S0200000_12;
import java.util.List;

/* renamed from: X.Sof, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73233Sof implements Runnable {
    public final /* synthetic */ C73231Sod LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ List LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJL;

    public RunnableC73233Sof(C73231Sod c73231Sod, List list, List list2, int i, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = c73231Sod;
        this.LJLILLLLZI = list;
        this.LJLJI = list2;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZ.execute(new ARunnableS31S0200000_12(C03200Aq.LIZ(new C73244Soq(this), true), this, 22));
        } finally {
            if (LIZ) {
            }
        }
    }
}
