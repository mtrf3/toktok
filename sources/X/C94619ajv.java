package X;

import kotlin.jvm.internal.IDqS446S0100000_42;

/* renamed from: X.ajv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94619ajv extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ IDqS446S0100000_42 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94619ajv(IDqS446S0100000_42 iDqS446S0100000_42, boolean z, String str) {
        super(0);
        this.LJLIL = iDqS446S0100000_42;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLILLLLZI) {
            ((C94207adH) this.LJLIL.l0).onSuccess(this.LJLJI);
        } else {
            ((C94207adH) this.LJLIL.l0).onFail();
        }
        return C76800UCe.LIZ;
    }
}
