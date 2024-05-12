package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1wX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49251wX extends AbstractC65781Prl implements InterfaceC88472Yns<C24590xr, InterfaceC24580xq> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC70422pa LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C1OD> LJLJI;
    public final /* synthetic */ C1OH LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49251wX(boolean z, InterfaceC70422pa interfaceC70422pa, InterfaceC35811ar<C1OD> interfaceC35811ar, C1OH c1oh) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC70422pa;
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = c1oh;
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC24580xq invoke(C24590xr DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        if (!this.LJLIL) {
            XKX.LIZLLL(this.LJLILLLLZI, null, null, new C2CO(this.LJLJJI, this.LJLJI, null), 3);
        }
        return new InterfaceC24580xq() { // from class: X.1Ls
            @Override // X.InterfaceC24580xq
            public final void dispose() {
            }
        };
    }
}
