package X;

import java.util.List;

/* renamed from: X.Wzn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC84115Wzn implements Runnable {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C84092WzQ LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            int tryRestore = this.LJLJJL.tryRestore(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            InterfaceC84052Wym interfaceC84052Wym = this.LJLJJL.LJIJJLI;
            if (interfaceC84052Wym != null) {
                interfaceC84052Wym.LIZ(tryRestore);
                this.LJLJJL.LJIJJLI = null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC84115Wzn(C84092WzQ c84092WzQ, List list, String str, int i, int i2) {
        this.LJLJJL = c84092WzQ;
        this.LJLIL = list;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
