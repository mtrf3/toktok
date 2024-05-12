package X;

/* renamed from: X.2t1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72552t1 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, X.InterfaceC67352kd<? super X.C38C> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C72542t0
            if (r0 == 0) goto L76
            r6 = r9
            X.2t0 r6 = (X.C72542t0) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L45
            if (r0 != r4) goto Lbc
            X.C141335gf.LIZJ(r1)
        L21:
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L2f
            java.lang.String r1 = "DataSource"
            java.lang.String r0 = "getInstance uid illegal!!"
            X.C69542oA.LIZ(r1, r0, r3)
            java.lang.String r8 = ""
        L2f:
            X.38C r5 = X.C38C.LJ
            if (r5 == 0) goto L39
            X.2t4 r0 = r5.LIZ
            if (r0 == 0) goto L39
            java.lang.String r3 = r0.LIZ
        L39:
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r8)
            if (r0 != 0) goto Lbb
            X.38C r5 = new X.38C
            X.2t2 r4 = X.C72582t4.LJFF
            monitor-enter(r4)
            goto L7c
        L45:
            X.C141335gf.LIZJ(r1)
            int r0 = r8.length()
            if (r0 != 0) goto L6d
        L4e:
            java.lang.String r2 = "DataSource"
            java.lang.String r1 = "getInstance block"
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            X.C69542oA.LIZ(r2, r1, r0)
            X.3Bm r1 = X.C69582oE.LJLJI
            X.2iv r0 = new X.2iv
            r0.<init>(r3)
            r6.getClass()
            r6.LJLJI = r4
            java.lang.Object r1 = X.V1M.LJIILL(r1, r0, r6)
            if (r1 != r5) goto L21
            return r5
        L6d:
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r0)
            if (r0 == 0) goto L2f
            goto L4e
        L76:
            X.2t0 r6 = new X.2t0
            r6.<init>(r7, r9)
            goto L12
        L7c:
            X.2t4 r3 = X.C72582t4.LJI     // Catch: java.lang.Throwable -> Lb2
            if (r3 == 0) goto L89
            java.lang.String r0 = r3.LIZ     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L89
            goto Lb5
        L89:
            X.2t4 r0 = X.C72582t4.LJI     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L94
            com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L94
            r0.LIZLLL()     // Catch: java.lang.Throwable -> Lb2
        L94:
            X.2t4 r3 = new X.2t4     // Catch: java.lang.Throwable -> Lb2
            r3.<init>(r8)     // Catch: java.lang.Throwable -> Lb2
            X.C72582t4.LJI = r3     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "Context"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "create new "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb2
            r1.append(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb2
            X.C69542oA.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r4)
            goto Lb6
        Lb2:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        Lb5:
            monitor-exit(r4)
        Lb6:
            r5.<init>(r3)
            X.C38C.LJ = r5
        Lbb:
            return r5
        Lbc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72552t1.LIZ(java.lang.String, X.2kd):java.lang.Object");
    }
}
