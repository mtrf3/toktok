package X;

/* renamed from: X.8eB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216238eB extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC216018dp, Comparable<?>> {
    public static final C216238eB LJLIL = new C216238eB();

    public C216238eB() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final Comparable<?> invoke(AbstractC216018dp abstractC216018dp) {
        long j;
        AbstractC216018dp abstractC216018dp2 = abstractC216018dp;
        if ((abstractC216018dp2 instanceof InterfaceC215558d5) && ((InterfaceC215558d5) abstractC216018dp2).LJFF()) {
            return Long.MAX_VALUE;
        }
        if (abstractC216018dp2 != 0) {
            j = abstractC216018dp2.LIZJ;
        } else {
            j = 0;
        }
        return Long.valueOf(j);
    }
}
