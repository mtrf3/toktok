package X;

/* loaded from: classes11.dex */
public final class OS2 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LIZ(java.lang.String r11, java.lang.String r12, java.lang.String r13, X.InterfaceC88472Yns<? super X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<T>>, ? extends java.lang.Object> r14, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<T>> r15) {
        /*
            boolean r0 = r15 instanceof X.OS4
            if (r0 == 0) goto L2b
            r7 = r15
            X.OS4 r7 = (X.OS4) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r5 = r7.LJLJI
            X.NAu r10 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r9 = 1
            java.lang.String r2 = "rd_ttec_store_net_load"
            java.lang.String r4 = "err_info"
            java.lang.String r8 = "is_success"
            r6 = 0
            if (r0 == 0) goto L39
            if (r0 != r9) goto L31
            long r0 = r7.LJLILLLLZI
            java.lang.Object r3 = r7.LJLIL
            java.util.Map r3 = (java.util.Map) r3
            goto L6a
        L2b:
            X.OS4 r7 = new X.OS4
            r7.<init>(r15)
            goto L12
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            X.C141335gf.LIZJ(r5)
            X.OSZ[] r3 = new X.OSZ[r9]
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "current_page"
            r1.<init>(r0, r11)
            r3[r6] = r1
            java.util.Map r3 = X.C113554cx.LJJLIIIIJ(r3)
            if (r12 == 0) goto L52
            java.lang.String r0 = "scene"
            r3.put(r0, r12)
        L52:
            if (r13 == 0) goto L59
            java.lang.String r0 = "active_tab"
            r3.put(r0, r13)
        L59:
            long r0 = java.lang.System.currentTimeMillis()
            r7.LJLIL = r3     // Catch: java.lang.Exception -> Lbf java.util.concurrent.CancellationException -> Ld5
            r7.LJLILLLLZI = r0     // Catch: java.lang.Exception -> Lbf java.util.concurrent.CancellationException -> Ld5
            r7.LJLJJI = r9     // Catch: java.lang.Exception -> Lbf java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r5 = r14.invoke(r7)     // Catch: java.lang.Exception -> Lbf java.util.concurrent.CancellationException -> Ld5
            if (r5 != r10) goto L6d
            goto Lbe
        L6a:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Ld5
        L6d:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r5 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r5     // Catch: java.lang.Exception -> Lbc java.util.concurrent.CancellationException -> Ld5
            boolean r7 = r5.isCodeOK()
            if (r7 == 0) goto La0
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r0
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r6)
            java.lang.String r0 = "duration"
            r3.put(r0, r1)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r9)
            r3.put(r8, r0)
            T r0 = r5.data
            if (r0 != 0) goto L9e
        L90:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            java.lang.String r0 = "is_empty_data"
            r3.put(r0, r1)
        L9a:
            com.google.gson.internal.b.LJJIJIIJI(r2, r3)
            return r5
        L9e:
            r9 = 0
            goto L90
        La0:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            r3.put(r8, r0)
            int r0 = r5.code
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "err_code"
            r3.put(r0, r1)
            java.lang.String r0 = r5.message
            if (r0 == 0) goto L9a
            r3.put(r4, r0)
            goto L9a
        Lbc:
            r1 = move-exception
            goto Lc0
        Lbe:
            return r10
        Lbf:
            r1 = move-exception
        Lc0:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            r3.put(r8, r0)
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto Ld1
            r3.put(r4, r0)
        Ld1:
            com.google.gson.internal.b.LJJIJIIJI(r2, r3)
            throw r1
        Ld5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OS2.LIZ(java.lang.String, java.lang.String, java.lang.String, X.Yns, X.2kd):java.lang.Object");
    }
}
