package X;

import kotlin.jvm.internal.o;

/* renamed from: X.V0r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79049V0r extends AbstractC65781Prl implements InterfaceC88472Yns<C24590xr, InterfaceC24580xq> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C22060tm LJLILLLLZI;
    public final /* synthetic */ C08370Un LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJJL;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLJJLL;
    public final /* synthetic */ InterfaceC35811ar<C08370Un> LJLJL;
    public final /* synthetic */ InterfaceC35811ar<C08370Un> LJLJLJ;
    public final /* synthetic */ InterfaceC35811ar<C79035V0d> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79049V0r(long j, C22060tm c22060tm, C08370Un c08370Un, long j2, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC35811ar<Integer> interfaceC35811ar2, InterfaceC35811ar<C08370Un> interfaceC35811ar3, InterfaceC35811ar<C08370Un> interfaceC35811ar4, InterfaceC35811ar<C79035V0d> interfaceC35811ar5) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = c22060tm;
        this.LJLJI = c08370Un;
        this.LJLJJI = j2;
        this.LJLJJL = interfaceC35811ar;
        this.LJLJJLL = interfaceC35811ar2;
        this.LJLJL = interfaceC35811ar3;
        this.LJLJLJ = interfaceC35811ar4;
        this.LJLJLLL = interfaceC35811ar5;
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC24580xq invoke(C24590xr DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        this.LJLJJL.setValue(Boolean.FALSE);
        this.LJLJJLL.setValue(null);
        this.LJLJL.setValue(null);
        this.LJLJLJ.setValue(C79053V0v.LIZLLL(this.LJLIL, this.LJLILLLLZI, this.LJLJI));
        this.LJLJLLL.setValue(new C79035V0d(this.LJLJJI, this.LJLJI.LIZ.LIZIZ, C23520w8.LIZJ));
        return new C79050V0s();
    }
}
