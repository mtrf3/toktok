package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86633ad implements C3ZA {
    public final C3ZA LIZ;
    public final InterfaceC75532xp LIZIZ;

    public C86633ad(YW7 yw7) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        this.LIZ = yw7;
        this.LIZIZ = onEventV3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.C3ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C86673ah
            if (r0 == 0) goto L20
            r4 = r6
            X.3ah r4 = (X.C86673ah) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.3ad r2 = r4.LJLIL
            goto L26
        L20:
            X.3ah r4 = new X.3ah
            r4.<init>(r5, r6)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L4b
        L2a:
            r1 = move-exception
            goto L46
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3ZA r0 = r5.LIZ     // Catch: java.lang.Exception -> L44
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L44
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r0 = r0.LIZ(r4)     // Catch: java.lang.Exception -> L44
            if (r0 != r2) goto L4b
            return r2
        L44:
            r1 = move-exception
            r2 = r5
        L46:
            java.lang.String r0 = "clear"
            r2.LIZIZ(r1, r0)
        L4b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86633ad.LIZ(X.2kd):java.lang.Object");
    }

    @Override // X.C3ZA
    public final MAFIMUser LIZLLL(long j) {
        try {
            return this.LIZ.LIZLLL(j);
        } catch (Exception e) {
            LIZIZ(e, "getMAFWithShareStatus");
            return null;
        }
    }

    @Override // X.C3ZA
    public final IMUser LJI(Long l) {
        try {
            return this.LIZ.LJI(l);
        } catch (Exception e) {
            LIZIZ(e, "getIMUserBaseInfoWithShareStatus");
            return null;
        }
    }

    public final void LIZIZ(Exception exc, String str) {
        C34B.LJ("SharePermissionDaoErrorReporter", exc);
        this.LIZIZ.LIZIZ("SHARE_PERMISSION_ERROR", C113554cx.LJJLIIIIJ(new OSZ("transactionName", str), new OSZ("isRoom", "true"), new OSZ("error_stack", android.util.Log.getStackTraceString(exc))));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.C3ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<com.ss.android.ugc.aweme.contact.model.SharePermission> r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C86683ai
            if (r0 == 0) goto L20
            r4 = r7
            X.3ai r4 = (X.C86683ai) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.3ad r2 = r4.LJLIL
            goto L26
        L20:
            X.3ai r4 = new X.3ai
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L4b
        L2a:
            r1 = move-exception
            goto L46
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3ZA r0 = r5.LIZ     // Catch: java.lang.Exception -> L44
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L44
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r0 = r0.LIZJ(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r0 != r2) goto L4b
            return r2
        L44:
            r1 = move-exception
            r2 = r5
        L46:
            java.lang.String r0 = "insertOrReplaceList"
            r2.LIZIZ(r1, r0)
        L4b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86633ad.LIZJ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.C3ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.contact.model.SharePermission r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C86663ag
            if (r0 == 0) goto L20
            r4 = r7
            X.3ag r4 = (X.C86663ag) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.3ad r2 = r4.LJLIL
            goto L26
        L20:
            X.3ag r4 = new X.3ag
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L4b
        L2a:
            r1 = move-exception
            goto L46
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3ZA r0 = r5.LIZ     // Catch: java.lang.Exception -> L44
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L44
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r0 = r0.LJ(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r0 != r2) goto L4b
            return r2
        L44:
            r1 = move-exception
            r2 = r5
        L46:
            java.lang.String r0 = "updateSharePermission"
            r2.LIZIZ(r1, r0)
        L4b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86633ad.LJ(com.ss.android.ugc.aweme.contact.model.SharePermission, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.C3ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.Long r6, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.contact.model.SharePermission> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C86643ae
            if (r0 == 0) goto L20
            r4 = r7
            X.3ae r4 = (X.C86643ae) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.3ad r2 = r4.LJLIL
            goto L26
        L20:
            X.3ae r4 = new X.3ae
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L44
        L2a:
            r1 = move-exception
            goto L47
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3ZA r0 = r5.LIZ     // Catch: java.lang.Exception -> L45
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L45
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.LJFF(r6, r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            java.lang.String r0 = "getSharePermission"
            r2.LIZIZ(r1, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86633ad.LJFF(java.lang.Long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.C3ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.contact.model.SharePermission r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C86653af
            if (r0 == 0) goto L20
            r4 = r7
            X.3af r4 = (X.C86653af) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.3ad r2 = r4.LJLIL
            goto L26
        L20:
            X.3af r4 = new X.3af
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2a
            goto L4b
        L2a:
            r1 = move-exception
            goto L46
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            X.3ZA r0 = r5.LIZ     // Catch: java.lang.Exception -> L44
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L44
            r4.LJLJJI = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r0 = r0.LJII(r6, r4)     // Catch: java.lang.Exception -> L44
            if (r0 != r2) goto L4b
            return r2
        L44:
            r1 = move-exception
            r2 = r5
        L46:
            java.lang.String r0 = "insertOrReplace"
            r2.LIZIZ(r1, r0)
        L4b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86633ad.LJII(com.ss.android.ugc.aweme.contact.model.SharePermission, X.2kd):java.lang.Object");
    }
}
