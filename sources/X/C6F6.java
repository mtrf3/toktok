package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6F6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6F6 extends AbstractC65781Prl implements InterfaceC88472Yns<C6F2, C76800UCe> {
    public final /* synthetic */ C6F7 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ Runnable LJLJJL;
    public final /* synthetic */ Runnable LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6F6(C6F7 c6f7, boolean z, boolean z2, boolean z3, Runnable runnable, Runnable runnable2) {
        super(1);
        this.LJLIL = c6f7;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = runnable;
        this.LJLJJLL = runnable2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C6F2 offerPendingAction) {
        o.LJIIIZ(offerPendingAction, "$this$offerPendingAction");
        C6F2 c6f2 = this.LJLIL.LJLJJI;
        if (c6f2 != null) {
            c6f2.LLJJIJIL(this.LJLJJL, this.LJLJJLL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        }
        return C76800UCe.LIZ;
    }
}
