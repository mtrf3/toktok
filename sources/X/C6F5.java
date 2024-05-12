package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6F5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6F5 extends AbstractC65781Prl implements InterfaceC88472Yns<C6F2, C76800UCe> {
    public final /* synthetic */ C6F7 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ Runnable LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6F5(C6F7 c6f7, boolean z, boolean z2, Runnable runnable) {
        super(1);
        this.LJLIL = c6f7;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = runnable;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C6F2 offerPendingAction) {
        o.LJIIIZ(offerPendingAction, "$this$offerPendingAction");
        C6F2 c6f2 = this.LJLIL.LJLJJI;
        if (c6f2 != null) {
            c6f2.LLJJIJIIJIL(this.LJLJJI, this.LJLILLLLZI, this.LJLJI);
        }
        return C76800UCe.LIZ;
    }
}
