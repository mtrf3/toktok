package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aIu, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92944aIu extends AbstractC65781Prl implements InterfaceC88472Yns<C15010iP, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C15010iP> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92944aIu(String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC35811ar<C15010iP> interfaceC35811ar) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC35811ar;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C15010iP c15010iP) {
        C15010iP it = c15010iP;
        o.LJIIIZ(it, "it");
        this.LJLJI.setValue(it);
        if (!o.LJ(this.LJLIL, it.LIZ.LJLIL)) {
            this.LJLILLLLZI.invoke(it.LIZ.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
