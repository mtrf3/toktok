package X;

/* renamed from: X.31t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C773331t {
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:13)(2:10|11))(5:16|17|(1:19)(1:23)|20|(1:22))|14|15))|26|6|7|(0)(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        r1 = X.C16880lQ.LLLZ("Force mask failed %s", java.util.Arrays.copyOf(new java.lang.Object[]{r2}, 1));
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "format(format, *args)");
        X.C34B.LIZJ("DMMediaSafetyHelper", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C109544Rq r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C773431u
            if (r0 == 0) goto L1e
            r12 = r15
            X.31u r12 = (X.C773431u) r12
            int r2 = r12.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r12.LJLJI = r2
        L12:
            java.lang.Object r2 = r12.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLJI
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            goto L24
        L1e:
            X.31u r12 = new X.31u
            r12.<init>(r13, r15)
            goto L12
        L24:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> L6e
            goto L88
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r2)
            X.2yE r0 = X.C3Q9.LIZ
            r0.getClass()
            X.C75782yE.LIZ()
            X.4WC r2 = X.C4WC.LIZIZ
            java.lang.String r0 = r14.getConversationId()
            X.Opw r0 = r2.LIZ(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth.DMMediaApi r4 = com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth.DMMediaApi.LIZIZ     // Catch: java.lang.Exception -> L6e
            if (r0 == 0) goto L69
            int r5 = r0.getInboxType()     // Catch: java.lang.Exception -> L6e
        L4d:
            int r6 = r14.getConversationType()     // Catch: java.lang.Exception -> L6e
            java.lang.String r7 = r14.getConversationId()     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = "msg.conversationId"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)     // Catch: java.lang.Exception -> L6e
            long r8 = r14.getConversationShortId()     // Catch: java.lang.Exception -> L6e
            long r10 = r14.getMsgId()     // Catch: java.lang.Exception -> L6e
            r12.LJLJI = r3     // Catch: java.lang.Exception -> L6e
            java.lang.Object r0 = r4.forceMask(r5, r6, r7, r8, r10, r12)     // Catch: java.lang.Exception -> L6e
            goto L6b
        L69:
            r5 = -1
            goto L4d
        L6b:
            if (r0 != r1) goto L88
            return r1
        L6e:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 0
            r1[r0] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r0 = "Force mask failed %s"
            java.lang.String r1 = X.C16880lQ.LLLZ(r0, r1)
            java.lang.String r0 = "format(format, *args)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "DMMediaSafetyHelper"
            X.C34B.LIZJ(r0, r1)
        L88:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773331t.LIZ(X.4Rq, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:13)(2:10|11))(5:16|17|(1:19)(1:23)|20|(1:22))|14|15))|26|6|7|(0)(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        r1 = X.C16880lQ.LLLZ("Unmasking failed %s", java.util.Arrays.copyOf(new java.lang.Object[]{r2}, 1));
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "format(format, *args)");
        X.C34B.LIZJ("DMMediaSafetyHelper", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C109544Rq r15, int r16, X.InterfaceC67352kd<? super X.C76800UCe> r17) {
        /*
            r14 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C773531v
            if (r0 == 0) goto L20
            r13 = r3
            X.31v r13 = (X.C773531v) r13
            int r2 = r13.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r13.LJLJI = r2
        L14:
            java.lang.Object r2 = r13.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r13.LJLJI
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.31v r13 = new X.31v
            r13.<init>(r14, r3)
            goto L14
        L26:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> L72
            goto L8c
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r2)
            X.2yE r0 = X.C3Q9.LIZ
            r0.getClass()
            X.C75782yE.LIZ()
            X.4WC r2 = X.C4WC.LIZIZ
            java.lang.String r0 = r15.getConversationId()
            X.Opw r0 = r2.LIZ(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth.DMMediaApi r4 = com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth.DMMediaApi.LIZIZ     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L6d
            int r5 = r0.getInboxType()     // Catch: java.lang.Exception -> L72
        L4f:
            int r6 = r15.getConversationType()     // Catch: java.lang.Exception -> L72
            java.lang.String r7 = r15.getConversationId()     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = "msg.conversationId"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)     // Catch: java.lang.Exception -> L72
            long r8 = r15.getConversationShortId()     // Catch: java.lang.Exception -> L72
            long r10 = r15.getMsgId()     // Catch: java.lang.Exception -> L72
            r13.LJLJI = r3     // Catch: java.lang.Exception -> L72
            r12 = r16
            java.lang.Object r0 = r4.unmask(r5, r6, r7, r8, r10, r12, r13)     // Catch: java.lang.Exception -> L72
            goto L6f
        L6d:
            r5 = -1
            goto L4f
        L6f:
            if (r0 != r1) goto L8c
            return r1
        L72:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 0
            r1[r0] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r0 = "Unmasking failed %s"
            java.lang.String r1 = X.C16880lQ.LLLZ(r0, r1)
            java.lang.String r0 = "format(format, *args)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "DMMediaSafetyHelper"
            X.C34B.LIZJ(r0, r1)
        L8c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773331t.LIZIZ(X.4Rq, int, X.2kd):java.lang.Object");
    }
}
