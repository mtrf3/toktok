package X;

/* renamed from: X.32l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C775132l {
    public static final C775132l LIZ = new C775132l();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C30P.LJLIL);
    public static final String LIZJ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZJ = JBR.LJFF(LIZ2, EF7.LJI.LIZ, "/tiktok/v1/", LIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, java.lang.String r21, X.InterfaceC67352kd r22) {
        /*
            r15 = this;
            r10 = r18
            r13 = r20
            r5 = r21
            r12 = r19
            r9 = r17
            r3 = r22
            boolean r0 = r3 instanceof X.C775232m
            if (r0 == 0) goto L65
            r14 = r3
            X.32m r14 = (X.C775232m) r14
            int r2 = r14.LJLJLLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r14.LJLJLLL = r2
        L1e:
            java.lang.Object r2 = r14.LJLJL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r14.LJLJLLL
            r3 = 1
            if (r0 == 0) goto L3f
            if (r0 != r3) goto Lcd
            long r0 = r14.LJLJJLL
            int r13 = r14.LJLJI
            int r10 = r14.LJLILLLLZI
            int r9 = r14.LJLIL
            java.lang.Object r5 = r14.LJLJJL
            java.lang.Object r12 = r14.LJLJJI
            X.C141335gf.LIZJ(r2)
        L38:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoMsgAckResponse r2 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoMsgAckResponse) r2
            int r3 = r2.error_code
            if (r3 == 0) goto L6b
            return r2
        L3f:
            X.C141335gf.LIZJ(r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.Ol8 r2 = X.C775132l.LIZIZ
            java.lang.Object r8 = r2.getValue()
            com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApi r8 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApi) r8
            r14.LJLJJI = r12
            r14.LJLJJL = r5
            r14.LJLIL = r9
            r14.LJLILLLLZI = r10
            r14.LJLJI = r13
            r14.LJLJJLL = r0
            r14.LJLJLLL = r3
            r11 = r16
            java.lang.Object r2 = r8.sendTakoReceiveMsgAck(r9, r10, r11, r12, r13, r14)
            if (r2 != r4) goto L38
            return r4
        L65:
            X.32m r14 = new X.32m
            r14.<init>(r15, r3)
            goto L1e
        L6b:
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r0
            long r3 = r2.getServerExecutionEndTime()
            long r0 = r2.getRequestArrivedTime()
            long r3 = r3 - r0
            long r7 = r7 - r3
            r0 = 2
            long r0 = (long) r0
            long r7 = r7 / r0
            java.lang.String r6 = java.lang.String.valueOf(r13)
            X.3Wm r4 = X.C772831o.LIZ()
            java.lang.String r0 = "queryServerMsgId"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "onEventV3"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.1HQ r3 = new X.1HQ
            r3.<init>()
            java.lang.String r1 = "inbox_type"
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r3.put(r1, r0)
            java.lang.String r0 = "query_server_message_id"
            r3.put(r0, r5)
            java.lang.String r1 = "msg_type"
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r3.put(r1, r0)
            if (r12 != 0) goto Lb4
            java.lang.String r12 = ""
        Lb4:
            java.lang.String r0 = "scene"
            r3.put(r0, r12)
            java.lang.String r0 = "is_ws"
            r3.put(r0, r6)
            java.lang.String r1 = "ack_request_arrived_cost"
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r3.put(r1, r0)
            java.lang.String r0 = "gpt_message_ack"
            r4.LIZIZ(r0, r3)
            return r2
        Lcd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C775132l.LIZIZ(java.lang.String, int, int, java.lang.String, boolean, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r23, java.lang.String r24, java.lang.Long r25, java.lang.String r26, java.lang.Long r27, java.lang.String r28, java.lang.String r29, java.lang.Long r30, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSugResponse> r31) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C775132l.LIZ(int, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, X.2kd):java.lang.Object");
    }
}
