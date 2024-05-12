package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer$triggerFullUpdate$2", f = "StorageSyncer.kt", l = {52, 53, 53}, m = "invokeSuspend")
/* renamed from: X.2oH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69612oH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69612oH(String str, boolean z, InterfaceC67352kd<? super C69612oH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69612oH(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L15
            if (r0 == r3) goto L29
            if (r0 == r4) goto L39
            if (r0 != r5) goto L49
            X.C141335gf.LIZJ(r8)
        L12:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L15:
            X.C141335gf.LIZJ(r8)
            X.3Bm r2 = X.C69592oF.LJLJI
            X.2oJ r1 = new X.2oJ
            r0 = 0
            r1.<init>(r0)
            r7.LJLIL = r3
            java.lang.Object r0 = X.V1M.LJIILL(r2, r1, r7)
            if (r0 != r6) goto L2c
            return r6
        L29:
            X.C141335gf.LIZJ(r8)
        L2c:
            X.2t1 r1 = X.C38C.LIZLLL
            java.lang.String r0 = r7.LJLILLLLZI
            r7.LJLIL = r4
            java.lang.Object r8 = r1.LIZ(r0, r7)
            if (r8 != r6) goto L3c
            return r6
        L39:
            X.C141335gf.LIZJ(r8)
        L3c:
            X.38C r8 = (X.C38C) r8
            boolean r0 = r7.LJLJI
            r7.LJLIL = r5
            java.lang.Object r0 = r8.LJIIIZ(r0, r7)
            if (r0 != r6) goto L12
            return r6
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69612oH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
