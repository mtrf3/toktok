package X;

import ujb.s;

/* renamed from: X.aBQ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92480aBQ extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92480aBQ(String str, String str2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        int LJJLIIIJL = s.LJJLIIIJL(this.LJLIL, this.LJLILLLLZI, 0, false, 6);
        if (intValue < s.LJJLIIIJL(this.LJLIL, this.LJLILLLLZI, 0, false, 6) + this.LJLILLLLZI.length() && LJJLIIIJL <= intValue && this.LJLJI) {
            this.LJLJJI.invoke();
        }
        return C76800UCe.LIZ;
    }
}
