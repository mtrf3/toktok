package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OyV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63651OyV {
    public final InterfaceC117594jT LIZ;
    public final InterfaceC88472Yns<String, C63120Opw> LIZIZ;
    public final InterfaceC65784Pro<InterfaceC63292Osi> LIZJ;
    public final InterfaceC65784Pro<C114444eO> LIZLLL;
    public final boolean LJ;

    public C63651OyV(C63589OxV c63589OxV) {
        C108174Mj getConversationFromMemory = C108174Mj.LJLIL;
        C63677Oyv getClientBridge = C63677Oyv.LJLIL;
        C63678Oyw getClientIMOptions = C63678Oyw.LJLIL;
        o.LJIIIZ(getConversationFromMemory, "getConversationFromMemory");
        o.LJIIIZ(getClientBridge, "getClientBridge");
        o.LJIIIZ(getClientIMOptions, "getClientIMOptions");
        this.LIZ = c63589OxV;
        this.LIZIZ = getConversationFromMemory;
        this.LIZJ = getClientBridge;
        this.LIZLLL = getClientIMOptions;
        this.LJ = false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(5:20|(1:22)|23|24|(1:26))|14|(2:16|18)|19))|29|6|7|(0)(0)|14|(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        X.C63322OtC.LJI("MessageCompletenessUseCase", "fetch error", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6 A[Catch: Oxf -> 0x00a9, TRY_LEAVE, TryCatch #0 {Oxf -> 0x00a9, blocks: (B:13:0x009b, B:14:0x009e, B:16:0x00a6, B:24:0x0089), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C63120Opw r9, long r10, int r12, X.InterfaceC67352kd<? super com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof X.C63662Oyg
            if (r0 == 0) goto L1e
            r5 = r13
            X.Oyg r5 = (X.C63662Oyg) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 != r4) goto L24
            goto L9b
        L1e:
            X.Oyg r5 = new X.Oyg
            r5.<init>(r8, r13)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r1)
            X.Oyh r2 = new X.Oyh
            r2.<init>()
            java.lang.String r0 = r9.getConversationId()
            r2.LJ = r0
            long r0 = r9.getConversationShortId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.LIZLLL = r0
            int r0 = r9.getConversationType()
            X.OwA r0 = X.EnumC63506OwA.fromValue(r0)
            r2.LJFF = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r2.LJI = r0
            if (r12 <= 0) goto L5c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.LJII = r0
        L5c:
            X.Z8v r1 = new X.Z8v
            r1.<init>()
            com.bytedance.im.core.proto.GetMessagesCheckInfoV2RequestBody r0 = r2.build()
            r1.LJIIL = r0
            com.bytedance.im.core.proto.RequestBody r7 = r1.build()
            int r3 = r9.getInboxType()
            X.Oy5 r0 = X.EnumC63625Oy5.GET_MESSAGES_CHECK_INFO_V2
            int r2 = r0.getValue()
            X.Pro<X.Osi> r0 = r8.LIZJ
            java.lang.Object r1 = r0.invoke()
            X.Osi r1 = (X.InterfaceC63292Osi) r1
            X.Pro<X.4eO> r0 = r8.LIZLLL
            java.lang.Object r0 = r0.invoke()
            X.4eO r0 = (X.C114444eO) r0
            com.bytedance.im.core.proto.Request r3 = X.C32151Nz.LJ(r3, r2, r7, r1, r0)
            X.4jT r2 = r8.LIZ     // Catch: X.C63599Oxf -> La9
            X.OxU r1 = new X.OxU     // Catch: X.C63599Oxf -> La9
            r0 = 510(0x1fe, float:7.15E-43)
            r1.<init>(r3, r0)     // Catch: X.C63599Oxf -> La9
            r5.LJLJI = r4     // Catch: X.C63599Oxf -> La9
            java.lang.Object r1 = r2.LIZIZ(r1, r4, r5)     // Catch: X.C63599Oxf -> La9
            if (r1 != r6) goto L9e
            return r6
        L9b:
            X.C141335gf.LIZJ(r1)     // Catch: X.C63599Oxf -> La9
        L9e:
            X.Oyt r1 = (X.C63675Oyt) r1     // Catch: X.C63599Oxf -> La9
            com.bytedance.im.core.proto.Response r0 = r1.LJLIL     // Catch: X.C63599Oxf -> La9
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body     // Catch: X.C63599Oxf -> La9
            if (r0 == 0) goto Lb1
            com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody r0 = r0.get_message_check_info_v2_body     // Catch: X.C63599Oxf -> La9
            goto Lb2
        La9:
            r2 = move-exception
            java.lang.String r1 = "MessageCompletenessUseCase"
            java.lang.String r0 = "fetch error"
            X.C63322OtC.LJI(r1, r0, r2)
        Lb1:
            r0 = 0
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63651OyV.LIZ(X.Opw, long, int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r14, long r15, java.lang.String r17, X.InterfaceC67352kd r18) {
        /*
            r13 = this;
            r3 = r18
            r9 = r15
            r11 = r14
            boolean r0 = r3 instanceof X.C63661Oyf
            r7 = r13
            if (r0 == 0) goto L7c
            r12 = r3
            X.Oyf r12 = (X.C63661Oyf) r12
            int r2 = r12.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r12.LJLJJI = r2
        L17:
            java.lang.Object r6 = r12.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLJJI
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L42
            if (r0 != r3) goto L92
            X.Opw r8 = r12.LJLIL
            X.C141335gf.LIZJ(r6)
        L28:
            com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody r6 = (com.bytedance.im.core.proto.GetMessagesCheckInfoV2ResponseBody) r6
            if (r6 == 0) goto L36
            java.lang.Boolean r1 = r6.is_demoted
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L82
        L36:
            X.OuP r2 = new X.OuP
            X.OQg r1 = X.C61878OQg.INSTANCE
            int r0 = r8.getConversationType()
            r2.<init>(r1, r0, r3)
            return r2
        L42:
            X.C141335gf.LIZJ(r6)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L69
            r9 = 0
        L4d:
            if (r11 >= 0) goto L50
            r11 = 0
        L50:
            X.Yns<java.lang.String, X.Opw> r0 = r7.LIZIZ
            r2 = r17
            java.lang.Object r8 = r0.invoke(r2)
            X.Opw r8 = (X.C63120Opw) r8
            if (r8 != 0) goto L71
            boolean r0 = r7.LJ
            if (r0 != 0) goto L9a
            X.OuP r2 = new X.OuP
            X.OQg r1 = X.C61878OQg.INSTANCE
            r0 = -1
            r2.<init>(r1, r0, r3)
            return r2
        L69:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4d
            r0 = 1
            long r9 = r9 + r0
            goto L4d
        L71:
            r12.LJLIL = r8
            r12.LJLJJI = r3
            java.lang.Object r6 = r7.LIZ(r8, r9, r11, r12)
            if (r6 != r5) goto L28
            return r5
        L7c:
            X.Oyf r12 = new X.Oyf
            r12.<init>(r7, r3)
            goto L17
        L82:
            X.OuP r2 = new X.OuP
            java.util.List<com.bytedance.im.core.proto.MessageCheckInfoV2> r1 = r6.msg_list
            if (r1 != 0) goto L8a
            X.OQg r1 = X.C61878OQg.INSTANCE
        L8a:
            int r0 = r8.getConversationType()
            r2.<init>(r1, r0, r4)
            return r2
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MessageCompletenessUseCase unable to find conversation "
            java.lang.String r0 = defpackage.i0.LJFF(r0, r2)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63651OyV.LIZIZ(int, long, java.lang.String, X.2kd):java.lang.Object");
    }
}
