package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunFeedViewModel$loadMore$1", f = "MallRacunFeedViewModel.kt", l = {66}, m = "invokeSuspend")
/* renamed from: X.Ln0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55294Ln0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C55289Lmv LJLJJI;
    public final /* synthetic */ M89 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55294Ln0(C55289Lmv c55289Lmv, M89 m89, InterfaceC67352kd<? super C55294Ln0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c55289Lmv;
        this.LJLJJL = m89;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55294Ln0 c55294Ln0 = new C55294Ln0(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c55294Ln0.LJLJI = obj;
        return c55294Ln0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55294Ln0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
