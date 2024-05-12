package X;

/* loaded from: classes8.dex */
public final class HMM implements Runnable {
    public final /* synthetic */ InterfaceC88472Yns<C43933HMb, C76800UCe> LJLIL;
    public final /* synthetic */ HMO LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public HMM(InterfaceC88472Yns<? super C43933HMb, C76800UCe> interfaceC88472Yns, HMO hmo, long j, String str) {
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = hmo;
        this.LJLJI = j;
        this.LJLJJI = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            InterfaceC88472Yns<C43933HMb, C76800UCe> interfaceC88472Yns = this.LJLIL;
            this.LJLILLLLZI.getClass();
            interfaceC88472Yns.invoke(new C43933HMb(0, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LJLJI, this.LJLJJI, "", true));
        } finally {
            if (LIZ) {
            }
        }
    }
}
