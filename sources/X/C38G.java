package X;

import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;

/* renamed from: X.38G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38G implements InterfaceC64672gJ<LocalListResponse> {
    public final /* synthetic */ AnonymousClass385 LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ C38C LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.InterfaceC64672gJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse r13, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            r12 = this;
            r7 = r13
            boolean r0 = r14 instanceof X.C38S
            if (r0 == 0) goto L60
            r11 = r14
            X.38S r11 = (X.C38S) r11
            int r2 = r11.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r11.LJLILLLLZI = r2
        L13:
            java.lang.Object r6 = r11.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L3e
            if (r0 != r3) goto L66
            long r0 = r11.LJLJJLL
            X.34K r2 = r11.LJLJJL
            X.38G r5 = r11.LJLJJI
            X.C141335gf.LIZJ(r6)
        L27:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r3 = r6.booleanValue()
            r2.element = r3
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            X.385 r2 = r5.LJLIL
            long r0 = r2.LJ
            long r0 = r0 + r3
            r2.LJ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3e:
            X.C141335gf.LIZJ(r6)
            com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse r7 = (com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse) r7
            long r0 = java.lang.System.currentTimeMillis()
            X.34K r2 = r12.LJLILLLLZI
            X.38C r6 = r12.LJLJI
            X.385 r8 = r12.LJLIL
            long r9 = r12.LJLJJI
            r11.LJLJJI = r12
            r11.LJLJJL = r2
            r11.LJLJJLL = r0
            r11.LJLILLLLZI = r3
            java.lang.Object r6 = r6.LIZLLL(r7, r8, r9, r11)
            if (r6 != r4) goto L5e
            return r4
        L5e:
            r5 = r12
            goto L27
        L60:
            X.38S r11 = new X.38S
            r11.<init>(r12, r14)
            goto L13
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38G.emit(java.lang.Object, X.2kd):java.lang.Object");
    }

    public C38G(AnonymousClass385 anonymousClass385, C34K c34k, C38C c38c, long j) {
        this.LJLIL = anonymousClass385;
        this.LJLILLLLZI = c34k;
        this.LJLJI = c38c;
        this.LJLJJI = j;
    }
}
