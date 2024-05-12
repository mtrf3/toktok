package X;

/* renamed from: X.XxN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC86513XxN implements Runnable {
    public boolean LJLIL;
    public final /* synthetic */ C86493Xx3 LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLIL) {
                long currentTimeMillis = System.currentTimeMillis();
                C86493Xx3 c86493Xx3 = this.LJLILLLLZI;
                if (currentTimeMillis >= c86493Xx3.LJLJJL && !c86493Xx3.LJLJJI) {
                    InterfaceC86538Xxm interfaceC86538Xxm = c86493Xx3.LJLJLJ;
                    if (interfaceC86538Xxm != null) {
                        interfaceC86538Xxm.LIZ(false);
                    }
                    this.LJLILLLLZI.setMessage(null);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC86513XxN(C86493Xx3 c86493Xx3) {
        this.LJLILLLLZI = c86493Xx3;
    }
}
