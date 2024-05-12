package X;

/* renamed from: X.22E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22E extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public final /* synthetic */ C22K LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22E(C22K c22k, String str, int i) {
        super(0);
        this.LJLIL = c22k;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        i = super/*X.1mf*/.getInt(this.LJLILLLLZI, this.LJLJI);
        return Integer.valueOf(i);
    }
}
