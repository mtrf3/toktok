package X;

import java.util.LinkedHashMap;

/* renamed from: X.6fS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166066fS extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C166866gk LJLILLLLZI;
    public final /* synthetic */ InterfaceC166046fQ LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166066fS(int i, C166866gk c166866gk, InterfaceC166046fQ interfaceC166046fQ, String str, int i2) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = c166866gk;
        this.LJLJI = interfaceC166046fQ;
        this.LJLJJI = str;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        OSZ osz = (OSZ) ((LinkedHashMap) C67662l8.LIZ).get(Integer.valueOf(this.LJLIL));
        if (osz != null) {
            this.LJLILLLLZI.LIZ(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue(), 5000L, new C166056fR(this.LJLJI, this.LJLJJI, this.LJLJJL));
        }
        return C76800UCe.LIZ;
    }
}
