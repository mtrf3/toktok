package X;

import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$getSharerInfoAsync$sharerInfoDeferred$1", f = "ReflowSideProcessor.kt", l = {172}, m = "invokeSuspend")
/* renamed from: X.9Xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238449Xk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends User>>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C238479Xn LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238449Xk(boolean z, C238479Xn c238479Xn, InterfaceC67352kd<? super C238449Xk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = c238479Xn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C238449Xk c238449Xk = new C238449Xk(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c238449Xk.LJLJI = obj;
        return c238449Xk;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r9.LJLILLLLZI
            r0 = 1
            r8 = 0
            if (r1 == 0) goto L15
            if (r1 != r0) goto Ld
            long r1 = r9.LJLIL
            goto L2b
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L15:
            X.C141335gf.LIZJ(r10)
            long r1 = android.os.SystemClock.elapsedRealtime()
            X.9Xn r3 = r9.LJLJJL
            r9.LJLIL = r1     // Catch: java.lang.Throwable -> L55
            r9.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L55
            com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService r0 = com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService.LIZIZ     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = X.C238469Xm.LIZ(r3, r0, r9)     // Catch: java.lang.Throwable -> L55
            if (r10 != r4) goto L2e
            goto L54
        L2b:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L52
        L2e:
            com.ss.android.ugc.aweme.feed.model.ExposeSharerData r10 = (com.ss.android.ugc.aweme.feed.model.ExposeSharerData) r10     // Catch: java.lang.Throwable -> L52
            r10.checkValid()     // Catch: java.lang.Throwable -> L52
            com.ss.android.ugc.aweme.profile.model.User r3 = r10.sharer     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L4c
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r10.logPbBean     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L50
            java.lang.String r0 = r0.getImprId()     // Catch: java.lang.Throwable -> L52
        L3f:
            r3.setRequestId(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "1-4"
            r3.setRecType(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "45"
            r3.setFriendTypeStr(r0)     // Catch: java.lang.Throwable -> L52
        L4c:
            X.C3C5.m7constructorimpl(r10)     // Catch: java.lang.Throwable -> L52
            goto L5d
        L50:
            r0 = r8
            goto L3f
        L52:
            r0 = move-exception
            goto L56
        L54:
            return r4
        L55:
            r0 = move-exception
        L56:
            X.3C4 r10 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r10)
        L5d:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            boolean r0 = X.C3C5.m12isFailureimpl(r10)
            if (r0 == 0) goto L92
            r1 = r8
        L69:
            com.ss.android.ugc.aweme.feed.model.ExposeSharerData r1 = (com.ss.android.ugc.aweme.feed.model.ExposeSharerData) r1
            boolean r0 = r9.LJLJJI
            if (r0 == 0) goto L88
            X.9Xg r2 = new X.9Xg
            X.9Xn r3 = r9.LJLJJL
            if (r1 == 0) goto L8f
            com.ss.android.ugc.aweme.profile.model.User r4 = r1.sharer
            java.lang.String r7 = r1.status_msg
            int r0 = r1.error_code
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r0)
        L80:
            r2.<init>(r3, r4, r5, r7, r8)
            java.lang.String r0 = "@LinkRelation"
            r2.LIZLLL(r0)
        L88:
            boolean r0 = X.C3C5.m13isSuccessimpl(r10)
            if (r0 == 0) goto Lae
            goto L94
        L8f:
            r4 = r8
            r7 = r8
            goto L80
        L92:
            r1 = r10
            goto L69
        L94:
            com.ss.android.ugc.aweme.feed.model.ExposeSharerData r10 = (com.ss.android.ugc.aweme.feed.model.ExposeSharerData) r10     // Catch: java.lang.Throwable -> La9
            com.ss.android.ugc.aweme.profile.model.User r10 = r10.sharer     // Catch: java.lang.Throwable -> La9
            if (r10 == 0) goto L9e
            X.C3C5.m7constructorimpl(r10)     // Catch: java.lang.Throwable -> La9
            goto Lb1
        L9e:
            java.lang.String r1 = "sharer is null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> La9
            r1.toString()     // Catch: java.lang.Throwable -> La9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La9
            throw r0     // Catch: java.lang.Throwable -> La9
        La9:
            r0 = move-exception
            X.3C4 r10 = X.C141335gf.LIZ(r0)
        Lae:
            X.C3C5.m7constructorimpl(r10)
        Lb1:
            X.3C5 r0 = X.C3C5.m6boximpl(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238449Xk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends User>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
