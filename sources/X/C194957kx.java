package X;

import com.ss.android.ugc.aweme.models.NowFeedResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.cache.NowCacheDelegate$cacheOnGetNowFeed$1", f = "NowCacheDelegate.kt", l = {C61447O9r.LJIIJ, 54, 57}, m = "invokeSuspend")
/* renamed from: X.7kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194957kx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ NowFeedResponse LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C194957kx(NowFeedResponse nowFeedResponse, InterfaceC67352kd<? super C194957kx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = nowFeedResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C194957kx(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLILLLLZI
            r6 = 3
            r8 = 2
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L16
            if (r0 == r7) goto Lbe
            if (r0 == r8) goto L96
            if (r0 != r6) goto Lb6
            X.C141335gf.LIZJ(r10)
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            X.C141335gf.LIZJ(r10)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r5 = r0.getCurUserId()
            com.ss.android.ugc.aweme.models.NowFeedResponse r0 = r9.LJLJI
            java.util.List r0 = r0.getData()
            java.util.Iterator r2 = r0.iterator()
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getAuthorUid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 == 0) goto L2d
        L44:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            if (r1 == 0) goto L52
            com.ss.android.ugc.aweme.now.UserNowPost r0 = r1.userNowPost
            if (r0 == 0) goto L52
            java.util.List r2 = r0.getNowPosts()
            if (r2 != 0) goto L54
        L52:
            X.OQg r2 = X.C61878OQg.INSTANCE
        L54:
            boolean r1 = r2.isEmpty()
            java.lang.String r0 = "myUid"
            if (r1 == 0) goto L79
        L5d:
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            r9.LJLILLLLZI = r7
            X.XI8 r1 = X.VFJ.LIZIZ
            X.7l2 r0 = new X.7l2
            r0.<init>(r5, r4)
            java.lang.Object r1 = X.XKX.LJI(r1, r0, r9)
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            if (r1 != r0) goto L74
        L71:
            if (r1 != r3) goto Lc1
            return r3
        L74:
            X.UCe r1 = X.C76800UCe.LIZ
            goto L71
        L77:
            r1 = r4
            goto L44
        L79:
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            r9.LJLIL = r2
            r9.LJLILLLLZI = r8
            X.XI8 r1 = X.VFJ.LIZIZ
            X.7l0 r0 = new X.7l0
            r0.<init>(r5, r4)
            java.lang.Object r1 = X.XKX.LJI(r1, r0, r9)
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            if (r1 != r0) goto L93
        L90:
            if (r1 != r3) goto L9d
            return r3
        L93:
            X.UCe r1 = X.C76800UCe.LIZ
            goto L90
        L96:
            java.lang.Object r2 = r9.LJLIL
            java.util.List r2 = (java.util.List) r2
            X.C141335gf.LIZJ(r10)
        L9d:
            r9.LJLIL = r4
            r9.LJLILLLLZI = r6
            X.XI8 r1 = X.VFJ.LIZIZ
            X.7kz r0 = new X.7kz
            r0.<init>(r2, r4)
            java.lang.Object r1 = X.XKX.LJI(r1, r0, r9)
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            if (r1 != r0) goto Lb3
        Lb0:
            if (r1 != r3) goto L13
            return r3
        Lb3:
            X.UCe r1 = X.C76800UCe.LIZ
            goto Lb0
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lbe:
            X.C141335gf.LIZJ(r10)
        Lc1:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194957kx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
