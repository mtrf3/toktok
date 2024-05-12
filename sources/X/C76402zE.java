package X;

import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$collectSharerState$1", f = "SharedVideoDeepLinkHelper.kt", l = {124, 132}, m = "invokeSuspend")
/* renamed from: X.2zE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76402zE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SharedVideoDeepLinkHelper LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76402zE(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper, boolean z, String str, InterfaceC67352kd<? super C76402zE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = sharedVideoDeepLinkHelper;
        this.LJLJI = z;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76402zE(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r3 = 2
            r1 = 1
            r10 = 0
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L31
            if (r0 != r3) goto L72
            X.C141335gf.LIZJ(r12)
        L10:
            com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper r0 = r11.LJLILLLLZI
            X.XKQ r0 = r0.LJLJLLL
            if (r0 == 0) goto L19
            r0.LIZIZ(r10)
        L19:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1c:
            X.C141335gf.LIZJ(r12)
            X.2zC r4 = new X.2zC
            com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper r0 = r11.LJLILLLLZI
            r4.<init>(r0, r10)
            r11.LJLIL = r1
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r12 = X.C74209TAn.LIZJ(r0, r4, r11)
            if (r12 != r2) goto L34
            return r2
        L31:
            X.C141335gf.LIZJ(r12)
        L34:
            X.33Y r12 = (X.C33Y) r12
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "collect sharerState: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "@LinkRelation_Video"
            X.C221018lt.LJFF(r0, r1)
            if (r12 == 0) goto L6f
            X.9Xn r9 = r12.LIZ
            X.2td<com.ss.android.ugc.aweme.profile.model.User> r0 = r12.LIZIZ
            if (r0 == 0) goto L70
            java.lang.Object r7 = r0.LIZ()
            com.ss.android.ugc.aweme.profile.model.User r7 = (com.ss.android.ugc.aweme.profile.model.User) r7
        L59:
            com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper r5 = r11.LJLILLLLZI
            X.XKW r0 = r5.LJLILLLLZI
            X.LuM r4 = new X.LuM
            boolean r6 = r11.LJLJI
            java.lang.String r8 = r11.LJLJJI
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.LJLIL = r3
            java.lang.Object r0 = X.XKX.LJI(r0, r4, r11)
            if (r0 != r2) goto L10
            return r2
        L6f:
            r9 = r10
        L70:
            r7 = r10
            goto L59
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76402zE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
