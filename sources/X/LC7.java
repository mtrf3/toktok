package X;

/* loaded from: classes10.dex */
public final class LC7 implements Runnable {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public final /* synthetic */ C56K LJLILLLLZI;
    public final /* synthetic */ C56K LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public LC7(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, C56K c56k, C56K c56k2, int i, int i2) {
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = c56k;
        this.LJLJI = c56k2;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJLIL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Integer.valueOf((int) (this.LJLILLLLZI.element + this.LJLJI.element + this.LJLJJI + this.LJLJJL)));
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
