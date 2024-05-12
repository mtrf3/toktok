package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.follow.logic.RelationTextDelegate$initViewClick$1$1", f = "RelationTextDelegate.kt", l = {68}, m = "invokeSuspend")
/* renamed from: X.4ce, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113364ce extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C57433MgP LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113364ce(C57433MgP c57433MgP, InterfaceC67352kd<? super C113364ce> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c57433MgP;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C113364ce(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLIL
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L2d
            X.C141335gf.LIZJ(r5)
        Lc:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            if (r0 != r1) goto L35
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L17:
            X.C141335gf.LIZJ(r5)
            X.MgP r0 = r4.LJLILLLLZI
            X.Mgc r0 = r0.LJLLILLLL
            X.Yns r0 = r0.getFollowClickInterceptor()
            if (r0 == 0) goto L35
            r4.LJLIL = r1
            java.lang.Object r5 = r0.invoke(r4)
            if (r5 != r2) goto Lc
            return r2
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.MgP r0 = r4.LJLILLLLZI
            com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM r3 = r0.LJI()
            X.MgP r0 = r4.LJLILLLLZI
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJFF()
            int r0 = r0.getFollowStatus()
            int r2 = X.C112674bX.LIZ(r0)
            X.MgP r0 = r4.LJLILLLLZI
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJFF()
            int r1 = r0.getFollowerStatus()
            X.MgP r0 = r4.LJLILLLLZI
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJFF()
            boolean r0 = r0.isAccuratePrivateAccount()
            r3.getClass()
            int r3 = com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM.iv0(r2, r1, r0)
            X.MgP r0 = r4.LJLILLLLZI
            X.Mgc r0 = r0.LJLLILLLL
            X.Ynr r2 = r0.getFollowClickListener()
            if (r2 == 0) goto L83
            X.MgP r0 = r4.LJLILLLLZI
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJFF()
            int r0 = r0.getFollowStatus()
            X.MgR r1 = X.C57434MgQ.LIZ(r0)
            X.MgR r0 = X.C57434MgQ.LIZ(r3)
            r2.invoke(r1, r0)
        L83:
            X.MgP r0 = r4.LJLILLLLZI
            boolean r0 = r0.LJIIIZ(r3)
            if (r0 == 0) goto L90
            X.MgP r0 = r4.LJLILLLLZI
            X.AbstractC57431MgN.LIZJ(r0)
        L90:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113364ce.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
