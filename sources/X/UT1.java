package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.mlbb.MlbbSyncAuthProcessor$invokeSyncApi$1", f = "MlbbSyncAuthProcessor.kt", l = {47, 54, 61}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UT1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C77216USe>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ UT5 LJLJJL;
    public final /* synthetic */ C77211URz LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UT1(boolean z, UT5 ut5, C77211URz c77211URz, InterfaceC67352kd<? super UT1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = ut5;
        this.LJLJJLL = c77211URz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        UT1 ut1 = new UT1(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        ut1.LJLJI = obj;
        return ut1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, com.ss.android.ugc.aweme.base.api.BaseResponse, X.Ee8] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLILLLLZI
            r11 = 0
            r4 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L1b
            if (r0 == r1) goto L16
            if (r0 == r6) goto L8b
            if (r0 != r4) goto Lb8
            X.C141335gf.LIZJ(r13)
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            java.lang.Object r2 = r12.LJLJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            goto L53
        L1b:
            X.C141335gf.LIZJ(r13)
            java.lang.Object r2 = r12.LJLJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.UPb r5 = X.C77135UPb.LIZ
            boolean r0 = r12.LJLJJI
            r5.LIZJ(r0)
            X.UT5 r0 = r12.LJLJJL
            com.ss.android.ugc.aweme.relation.auth.api.IAuthApi r7 = r0.LIZ
            boolean r5 = r12.LJLJJI
            X.URz r0 = r12.LJLJJLL
            if (r5 == 0) goto L35
            r9 = 1
            goto L36
        L35:
            r9 = 0
        L36:
            X.URy r0 = r0.LJLIL     // Catch: java.lang.Throwable -> L5f
            android.os.Bundle r5 = r0.LJFF     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L46
            java.lang.String r0 = "is_manual"
            boolean r0 = r5.getBoolean(r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L46
            r10 = 1
            goto L47
        L46:
            r10 = 0
        L47:
            r12.LJLJI = r2     // Catch: java.lang.Throwable -> L5f
            r12.LJLILLLLZI = r1     // Catch: java.lang.Throwable -> L5f
            r8 = 6
            java.lang.Object r13 = r7.syncSocialRelationStatus(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L5f
            if (r13 != r3) goto L56
            goto Lc0
        L53:
            X.C141335gf.LIZJ(r13)     // Catch: java.lang.Throwable -> L5f
        L56:
            com.ss.android.ugc.aweme.base.api.BaseResponse r13 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r13     // Catch: java.lang.Throwable -> L5f
            r13.checkValid()     // Catch: java.lang.Throwable -> L5f
            X.C3C5.m7constructorimpl(r13)     // Catch: java.lang.Throwable -> L5f
            goto L67
        L5f:
            r0 = move-exception
            X.3C4 r13 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r13)
        L67:
            r5 = r13
            X.URz r7 = r12.LJLJJLL
            boolean r0 = X.C3C5.m13isSuccessimpl(r5)
            if (r0 == 0) goto L94
            X.USe r0 = r7.LJLILLLLZI
            X.USf r0 = r0.LJLIL
            X.USf r1 = X.C77217USf.L(r0, r1)
            X.UQ0 r0 = X.UQ0.SYNC
            X.USe r0 = X.C77216USe.L(r1, r0)
            r12.LJLJI = r2
            r12.LJLIL = r5
            r12.LJLILLLLZI = r6
            java.lang.Object r0 = r2.emit(r0, r12)
            if (r0 != r3) goto L94
            return r3
        L8b:
            java.lang.Object r5 = r12.LJLIL
            java.lang.Object r2 = r12.LJLJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r13)
        L94:
            X.URz r1 = r12.LJLJJLL
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r5)
            if (r0 == 0) goto L13
            X.USe r0 = r1.LJLILLLLZI
            X.USf r0 = r0.LJLIL
            X.USf r1 = X.C77217USf.L(r0, r11)
            X.UQ0 r0 = X.UQ0.SYNC
            X.USe r1 = X.C77216USe.L(r1, r0)
            r12.LJLJI = r5
            r0 = 0
            r12.LJLIL = r0
            r12.LJLILLLLZI = r4
            java.lang.Object r0 = r2.emit(r1, r12)
            if (r0 != r3) goto L13
            return r3
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UT1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C77216USe> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
