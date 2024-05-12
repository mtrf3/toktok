package X;

/* renamed from: X.22F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22F extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public final /* synthetic */ C22K LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22F(C22K c22k, String str, long j) {
        super(0);
        this.LJLIL = c22k;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        j = super/*X.1mf*/.getLong(this.LJLILLLLZI, this.LJLJI);
        return Long.valueOf(j);
    }
}
