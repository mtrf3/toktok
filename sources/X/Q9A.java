package X;

import kotlin.jvm.internal.AqS17S0102000_6;

/* loaded from: classes12.dex */
public final class Q9A extends AbstractC65781Prl implements InterfaceC65784Pro<C66531Q9f<C76800UCe>> {
    public final /* synthetic */ String[] LJLIL;
    public final /* synthetic */ int LJLILLLLZI = 0;
    public final /* synthetic */ int LJLJI = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q9A(String[] strArr) {
        super(0);
        this.LJLIL = strArr;
    }

    @Override // X.InterfaceC65784Pro
    public final C66531Q9f<C76800UCe> invoke() {
        Q96 q96 = new Q96();
        q96.LIZ = "Facebook";
        q96.LIZIZ = "setDataProcessingOptions";
        q96.LIZJ = C113554cx.LJJL(new OSZ("options", this.LJLIL), new OSZ("country", Integer.valueOf(this.LJLILLLLZI)), new OSZ("state", Integer.valueOf(this.LJLJI)));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524614");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS17S0102000_6(this.LJLILLLLZI, this.LJLJI, this.LJLIL, 1));
    }
}
