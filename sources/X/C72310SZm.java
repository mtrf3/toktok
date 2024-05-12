package X;

import fjb.a;

@InterfaceC65848Psq(c = "tiktok.compose.paging.ComposeLoader$loadLatest$1", f = "ComposeLoader.kt", l = {113}, m = "invokeSuspend")
/* renamed from: X.SZm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72310SZm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C72309SZl<T> LJLJJI;
    public final /* synthetic */ T LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72310SZm(C72309SZl<T> c72309SZl, T t, InterfaceC67352kd<? super C72310SZm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c72309SZl;
        this.LJLJJL = t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C72310SZm c72310SZm = new C72310SZm(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c72310SZm.LJLJI = obj;
        return c72310SZm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L17;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L24
            if (r0 != r4) goto L71
            X.C141335gf.LIZJ(r8)
        Ld:
            X.A2G r8 = (X.A2G) r8
            boolean r0 = r8 instanceof X.A2V
            if (r0 == 0) goto L21
            X.SZl<T> r2 = r7.LJLJJI
            X.OSZ<? extends T, ? extends T> r1 = r2.LJLJI
            X.A2V r8 = (X.A2V) r8
            T r0 = r8.LIZIZ
            X.OSZ r0 = X.OSZ.copy$default(r1, r5, r0, r4, r5)
            r2.LJLJI = r0
        L21:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L24:
            X.C141335gf.LIZJ(r8)
            java.lang.Object r0 = r7.LJLJI
            X.SZl<T> r2 = r7.LJLJJI
            T r1 = r7.LJLJJL
            r7.LJLJI = r0
            r7.LJLIL = r1
            r7.LJLILLLLZI = r4
            X.XKS r3 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r7)
            r3.<init>(r4, r0)
            r3.LJIIL()
            r2.LJLILLLLZI = r3
            if (r1 != 0) goto L4b
            X.OSZ<? extends T, ? extends T> r0 = r2.LJLJI
            java.lang.Object r1 = r0.getSecond()
            if (r1 == 0) goto L54
        L4b:
            com.bytedance.ies.powerlist.page.config.PowerPageSource<T> r0 = r2.LJLIL
            r0.onLoadLatest(r3, r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L6a
        L54:
            X.A2F r2 = X.A2G.LIZ
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "cursor is null!"
            r1.<init>(r0)
            r2.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            X.C3C5.m7constructorimpl(r0)
            r3.resumeWith(r0)
        L6a:
            java.lang.Object r8 = r3.LJIIJJI()
            if (r8 != r6) goto Ld
            return r6
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72310SZm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
