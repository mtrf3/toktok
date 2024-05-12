package X;

import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem$onInvite$1$1", f = "AddYoursInviteFriendsAssem.kt", l = {136, 144}, m = "invokeSuspend")
/* renamed from: X.8iK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218808iK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AddYoursInviteFriendsAssem LJLJI;
    public final /* synthetic */ C218868iQ LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C218808iK(AddYoursInviteFriendsAssem addYoursInviteFriendsAssem, C218868iQ c218868iQ, InterfaceC67352kd<? super C218808iK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = addYoursInviteFriendsAssem;
        this.LJLJJI = c218868iQ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C218808iK(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLILLLLZI
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L49
            if (r0 != r7) goto L8a
            java.lang.Object r8 = r9.LJLIL
            X.C141335gf.LIZJ(r10)
        L11:
            boolean r2 = X.C3C5.m13isSuccessimpl(r8)
            com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem r0 = r9.LJLJI
            X.LuL r0 = r0.LJLIL
            java.lang.Object r0 = r0.getValue()
            X.8iS r0 = (X.C218888iS) r0
            X.8iM r1 = r0.LJLJJI
            if (r1 == 0) goto L2a
            X.8iQ r0 = r9.LJLJJI
            java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r0 = r0.LJLIL
            r1.mobInviteButtonClicked(r2, r0)
        L2a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2d:
            X.C141335gf.LIZJ(r10)
            com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem r0 = r9.LJLJI
            X.8iQ r2 = r9.LJLJJI
            X.LuL r0 = r0.LJLIL     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L53
            X.8iS r0 = (X.C218888iS) r0     // Catch: java.lang.Throwable -> L53
            X.Ynr<java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee>, X.2kd<? super X.UCe>, java.lang.Object> r1 = r0.LJLILLLLZI     // Catch: java.lang.Throwable -> L53
            java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r0 = r2.LJLIL     // Catch: java.lang.Throwable -> L53
            r9.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r10 = r1.invoke(r0, r9)     // Catch: java.lang.Throwable -> L53
            if (r10 != r6) goto L4c
            goto L92
        L49:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L53
        L4c:
            r8 = r10
            X.UCe r8 = (X.C76800UCe) r8     // Catch: java.lang.Throwable -> L53
            X.C3C5.m7constructorimpl(r8)     // Catch: java.lang.Throwable -> L53
            goto L5b
        L53:
            r0 = move-exception
            X.3C4 r8 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r8)
        L5b:
            com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem r5 = r9.LJLJI
            java.lang.Throwable r4 = X.C3C5.m10exceptionOrNullimpl(r8)
            if (r4 == 0) goto L11
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r5)
            X.8iJ r1 = new X.8iJ
            r2 = 0
            r1.<init>(r5, r2)
            r0 = 3
            X.XKX.LIZLLL(r3, r2, r2, r1, r0)
            java.lang.String r1 = "AYInviteAssem"
            java.lang.String r0 = "invite err"
            X.C221018lt.LIZJ(r1, r0, r4)
            X.XIF r1 = X.EXV.LIZ
            X.8iI r0 = new X.8iI
            r0.<init>(r5, r2)
            r9.LJLIL = r8
            r9.LJLILLLLZI = r7
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r9)
            if (r0 != r6) goto L11
            return r6
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L92:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218808iK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
