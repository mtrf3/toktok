package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9LN, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9LN extends AbstractC65781Prl implements InterfaceC88472Yns<C9LO, C9LO> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9LN(int i, int i2, long j) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C9LO invoke(C9LO setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C9LO(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }
}
