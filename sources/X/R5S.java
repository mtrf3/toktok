package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5S extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5S(int i, String str, InterfaceC65784Pro interfaceC65784Pro) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        R5Q.LJFF(this.LJLILLLLZI, this.LJLIL, false);
        this.LJLJI.invoke();
        return C76800UCe.LIZ;
    }
}
