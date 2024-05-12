package X;

/* renamed from: X.Itl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48069Itl implements Runnable {
    public final /* synthetic */ InterfaceC47447Ijj LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ AbstractRunnableC48101IuH LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            InterfaceC47447Ijj interfaceC47447Ijj = this.LJLIL;
            C47448Ijk c47448Ijk = (C47448Ijk) interfaceC47447Ijj;
            c47448Ijk.LIZIZ(this.LJLJI, this.LJLJJI, this.LJLJJL.LJLJL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC48069Itl(AbstractRunnableC48101IuH abstractRunnableC48101IuH, InterfaceC47447Ijj interfaceC47447Ijj, int i, int i2, int i3) {
        this.LJLJJL = abstractRunnableC48101IuH;
        this.LJLIL = interfaceC47447Ijj;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
    }
}
