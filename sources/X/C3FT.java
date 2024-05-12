package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.MAFListManager$updateFollowStatus$1", f = "MAFListManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3FT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3FT(String str, int i, InterfaceC67352kd<? super C3FT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3FT c3ft = new C3FT(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c3ft.LJLIL = obj;
        return c3ft;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r1.setFollowStatus(r3);
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.C141335gf.LIZJ(r7)
            java.lang.Object r5 = r6.LJLIL
            java.lang.String r4 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L42
            int r3 = r6.LJLJI     // Catch: java.lang.Exception -> L42
            monitor-enter(r5)     // Catch: java.lang.Exception -> L42
            java.util.List<com.ss.android.ugc.aweme.social.model.MAFIMUser> r0 = X.C3FW.LIZ     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L3f
        L10:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L29
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L3f
            com.ss.android.ugc.aweme.social.model.MAFIMUser r1 = (com.ss.android.ugc.aweme.social.model.MAFIMUser) r1     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = r1.getUid()     // Catch: java.lang.Throwable -> L3f
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L10
            r1.setFollowStatus(r3)     // Catch: java.lang.Throwable -> L3f
        L29:
            monitor-exit(r5)     // Catch: java.lang.Exception -> L42
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.lang.Exception -> L42
            com.ss.android.ugc.aweme.im.sdk.common.data.manager.base.IMDatabase r0 = X.C86443aK.LIZIZ(r0)     // Catch: java.lang.Exception -> L42
            X.3FV r2 = r0.LJIJJ()     // Catch: java.lang.Exception -> L42
            java.lang.String r1 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L42
            int r0 = r6.LJLJI     // Catch: java.lang.Exception -> L42
            r2.LIZIZ(r0, r1)     // Catch: java.lang.Exception -> L42
            goto L4a
        L3f:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Exception -> L42
            throw r0     // Catch: java.lang.Exception -> L42
        L42:
            r2 = move-exception
            java.lang.String r1 = "MAFListManager"
            java.lang.String r0 = "updateFollowStatus"
            X.C34B.LIZLLL(r1, r0, r2)
        L4a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
