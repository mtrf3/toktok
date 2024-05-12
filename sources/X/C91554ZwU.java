package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZwU, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91554ZwU extends AbstractC65781Prl implements InterfaceC88472Yns<C91420ZuK, C91420ZuK> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91554ZwU(String str, String str2, int i) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C91420ZuK invoke(C91420ZuK c91420ZuK) {
        C91420ZuK setState = c91420ZuK;
        o.LJIIIZ(setState, "$this$setState");
        return C91420ZuK.LIZ(setState, null, new C91423ZuN(this.LJLIL, this.LJLILLLLZI, this.LJLJI, false), 1);
    }
}
