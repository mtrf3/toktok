package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.email.EmailSyncAuthProcessor$invokeSyncApi$1", f = "EmailSyncAuthProcessor.kt", l = {53, 60, 68}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UT0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C77216USe>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ UT4 LJLJJL;
    public final /* synthetic */ C77211URz LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UT0(boolean z, UT4 ut4, C77211URz c77211URz, InterfaceC67352kd<? super UT0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = ut4;
        this.LJLJJLL = c77211URz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        UT0 ut0 = new UT0(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        ut0.LJLJI = obj;
        return ut0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, com.ss.android.ugc.aweme.base.api.BaseResponse, X.Ee8] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r13.LJLILLLLZI
            r7 = 0
            r4 = 3
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L1b
            if (r0 == r9) goto L16
            if (r0 == r5) goto L88
            if (r0 != r4) goto Lc3
            X.C141335gf.LIZJ(r14)
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            java.lang.Object r2 = r13.LJLJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            goto L4e
        L1b:
            X.C141335gf.LIZJ(r14)
            java.lang.Object r2 = r13.LJLJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.UPc r1 = X.C77136UPc.LIZ
            boolean r0 = r13.LJLJJI
            r1.LIZJ(r0)
            X.UT4 r0 = r13.LJLJJL
            com.ss.android.ugc.aweme.relation.auth.api.IAuthApi r8 = r0.LIZ
            X.URz r0 = r13.LJLJJLL
            boolean r12 = r13.LJLJJI
            X.URy r0 = r0.LJLIL     // Catch: java.lang.Throwable -> L5c
            android.os.Bundle r1 = r0.LJFF     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L41
            java.lang.String r0 = "is_manual"
            boolean r0 = r1.getBoolean(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L41
            r11 = 1
            goto L42
        L41:
            r11 = 0
        L42:
            r13.LJLJI = r2     // Catch: java.lang.Throwable -> L5c
            r13.LJLILLLLZI = r9     // Catch: java.lang.Throwable -> L5c
            r10 = r9
            java.lang.Object r14 = r8.syncSocialRelationStatus(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L5c
            if (r14 != r3) goto L51
            goto Lcb
        L4e:
            X.C141335gf.LIZJ(r14)     // Catch: java.lang.Throwable -> L5a
        L51:
            com.ss.android.ugc.aweme.base.api.BaseResponse r14 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r14     // Catch: java.lang.Throwable -> L5a
            r14.checkValid()     // Catch: java.lang.Throwable -> L5a
            X.C3C5.m7constructorimpl(r14)     // Catch: java.lang.Throwable -> L5a
            goto L64
        L5a:
            r0 = move-exception
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            X.3C4 r14 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r14)
        L64:
            r6 = r14
            X.URz r1 = r13.LJLJJLL
            boolean r0 = X.C3C5.m13isSuccessimpl(r6)
            if (r0 == 0) goto L91
            X.USe r0 = r1.LJLILLLLZI
            X.USf r0 = r0.LJLIL
            X.USf r1 = X.C77217USf.L(r0, r9)
            X.UQ0 r0 = X.UQ0.SYNC
            X.USe r0 = X.C77216USe.L(r1, r0)
            r13.LJLJI = r2
            r13.LJLIL = r6
            r13.LJLILLLLZI = r5
            java.lang.Object r0 = r2.emit(r0, r13)
            if (r0 != r3) goto L91
            return r3
        L88:
            java.lang.Object r6 = r13.LJLIL
            java.lang.Object r2 = r13.LJLJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r14)
        L91:
            boolean r1 = r13.LJLJJI
            X.URz r8 = r13.LJLJJLL
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r6)
            if (r0 == 0) goto L13
            r5 = 0
            if (r1 == 0) goto La8
            X.URS r1 = new X.URS
            r0 = 10
            r1.<init>(r8, r5, r0)
            r1.LIZLLL(r5)
        La8:
            X.USe r0 = r8.LJLILLLLZI
            X.USf r0 = r0.LJLIL
            X.USf r1 = X.C77217USf.L(r0, r7)
            X.UQ0 r0 = X.UQ0.SYNC
            X.USe r0 = X.C77216USe.L(r1, r0)
            r13.LJLJI = r6
            r13.LJLIL = r5
            r13.LJLILLLLZI = r4
            java.lang.Object r0 = r2.emit(r0, r13)
            if (r0 != r3) goto L13
            return r3
        Lc3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lcb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UT0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C77216USe> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
