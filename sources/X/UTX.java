package X;

import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UTX implements InterfaceC237509Tu {
    public final IAuthApi LIZ;
    public final UQ5 LIZIZ;
    public final String LIZJ;

    public UTX(int i) {
        AuthApiService authApiService = AuthApiService.LIZIZ;
        UQ5 facebookUFR = C77266UUc.LIZIZ.LJIIJ();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        curUserId = curUserId == null ? "" : curUserId;
        o.LJIIIZ(authApiService, "authApiService");
        o.LJIIIZ(facebookUFR, "facebookUFR");
        this.LIZ = authApiService;
        this.LIZIZ = facebookUFR;
        this.LIZJ = curUserId;
    }

    public final void LIZJ(Throwable th) {
        C38306F1q c38306F1q;
        if ((th instanceof C38333F2r) && (c38306F1q = (C38306F1q) th) != null && c38306F1q.getErrorCode() == 3002047) {
            C77266UUc.LIZIZ.LJIIJ().LIZ(this.LIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, X.Ee8, com.ss.android.ugc.aweme.relation.auth.model.FriendsUploadResponse] */
    @Override // X.InterfaceC237509Tu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC58085Mqv r11, X.InterfaceC67352kd<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.UTY
            if (r0 == 0) goto L20
            r8 = r12
            X.UTY r8 = (X.UTY) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r4 = r8.LJLILLLLZI
            X.NAu r9 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJI
            r7 = 1
            if (r0 == 0) goto L2e
            if (r0 != r7) goto L26
            X.UTX r3 = r8.LJLIL
            goto L6e
        L20:
            X.UTY r8 = new X.UTY
            r8.<init>(r10, r12)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r4)
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.UQ5 r0 = r0.LJIIJ()
            boolean r6 = r0.LJIIJJI()
            com.ss.android.ugc.aweme.relation.auth.api.IAuthApi r5 = r10.LIZ
            int r4 = r11.getValue()     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            if (r6 == 0) goto L4d
            X.UQ5 r1 = r10.LIZIZ     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = r10.LIZJ     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r1.LJI(r0)     // Catch: java.lang.Throwable -> L7c
            goto L4e
        L4d:
            r2 = r3
        L4e:
            if (r6 == 0) goto L5d
            X.UQ5 r1 = r10.LIZIZ     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = r10.LIZJ     // Catch: java.lang.Throwable -> L7c
            long r0 = r1.LJIIJ(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.Long r3 = new java.lang.Long     // Catch: java.lang.Throwable -> L7c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L7c
        L5d:
            X.SvC r0 = X.C77238UTa.LIZ(r5, r4, r7, r2, r3)     // Catch: java.lang.Throwable -> L7c
            r8.LJLIL = r10     // Catch: java.lang.Throwable -> L7c
            r8.LJLJJI = r7     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r4 = X.C77318UWc.LIZ(r0, r8)     // Catch: java.lang.Throwable -> L7c
            if (r4 != r9) goto L6c
            return r9
        L6c:
            r3 = r10
            goto L71
        L6e:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Throwable -> L7a
        L71:
            com.ss.android.ugc.aweme.relation.auth.model.FriendsUploadResponse r4 = (com.ss.android.ugc.aweme.relation.auth.model.FriendsUploadResponse) r4     // Catch: java.lang.Throwable -> L7a
            r4.checkValid()     // Catch: java.lang.Throwable -> L7a
            X.C3C5.m7constructorimpl(r4)     // Catch: java.lang.Throwable -> L7a
            goto L85
        L7a:
            r0 = move-exception
            goto L7e
        L7c:
            r0 = move-exception
            r3 = r10
        L7e:
            X.3C4 r4 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r4)
        L85:
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r4)
            java.lang.String r1 = "FBRepo"
            if (r2 == 0) goto L95
            r3.LIZJ(r2)
            java.lang.String r0 = "sync error!"
            X.C221018lt.LIZJ(r1, r0, r2)
        L95:
            boolean r0 = X.C3C5.m13isSuccessimpl(r4)
            if (r0 == 0) goto La0
            java.lang.String r0 = "sync success!"
            X.C221018lt.LJFF(r1, r0)
        La0:
            boolean r0 = X.C3C5.m13isSuccessimpl(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UTX.LIZ(X.Mqv, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, X.Ee8, com.ss.android.ugc.aweme.relation.auth.model.FriendsUploadResponse] */
    @Override // X.InterfaceC237509Tu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC58085Mqv r11, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>> r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UTX.LIZIZ(X.Mqv, X.2kd):java.lang.Object");
    }
}
