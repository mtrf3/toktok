package X;

/* renamed from: X.22C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22C extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ C22K LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22C(C22K c22k, String str, boolean z) {
        super(0);
        this.LJLIL = c22k;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        z = super/*X.1mf*/.getBoolean(this.LJLILLLLZI, this.LJLJI);
        return Boolean.valueOf(z);
    }
}
