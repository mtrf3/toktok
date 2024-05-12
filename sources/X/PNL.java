package X;

import java.util.List;

/* loaded from: classes12.dex */
public final class PNL extends RunnableC39007FSp {
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ List LJLJJLL;

    public final void LIZJ() {
        if (PNK.LIZJ == null) {
            synchronized (PNK.class) {
                if (PNK.LIZJ == null) {
                    PNK.LIZJ = new PNK();
                }
            }
        }
        PNK.LIZJ.LIZ(this.LJLJJL, this.LJLJJLL);
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PNL(boolean z, List list) {
        super((Object) null);
        this.LJLJJL = z;
        this.LJLJJLL = list;
    }
}
