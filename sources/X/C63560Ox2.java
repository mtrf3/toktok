package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ox2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63560Ox2 {
    public final InterfaceC117594jT LIZ;
    public final InterfaceC65784Pro<InterfaceC63292Osi> LIZIZ;
    public final InterfaceC65784Pro<C114444eO> LIZJ;
    public final InterfaceC63568OxA LIZLLL;
    public final XKW LJ;
    public final int LJFF;

    public C63560Ox2(C63589OxV c63589OxV) {
        C63571OxD clientBridge = C63571OxD.LJLIL;
        C63572OxE clientOptions = C63572OxE.LJLIL;
        C63306Osw c63306Osw = new C63306Osw();
        AbstractC78621UtN mainDispatcher = C36636EZk.LIZ;
        o.LJIIIZ(clientBridge, "clientBridge");
        o.LJIIIZ(clientOptions, "clientOptions");
        o.LJIIIZ(mainDispatcher, "mainDispatcher");
        this.LIZ = c63589OxV;
        this.LIZIZ = clientBridge;
        this.LIZJ = clientOptions;
        this.LIZLLL = c63306Osw;
        this.LJ = mainDispatcher;
        this.LJFF = EnumC63625Oy5.CREATE_CONVERSATION_V2.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:13)(2:10|11))(5:22|23|(1:25)(1:29)|26|(1:28))|14|(1:16)(1:21)|17|18|19))|32|6|7|(0)(0)|14|(0)(0)|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        X.C63322OtC.LJI("CreateConversationUseCase", "create conversation error", r3);
        r2 = new X.C63375Ou3();
        r2.LIZ.LIZ = r3.getErrorCode();
        r0 = r3.getMessage();
        r1 = r2.LIZ;
        r1.LIZJ = r0;
        r1.LJII = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: Oxf -> 0x0065, TryCatch #0 {Oxf -> 0x0065, blocks: (B:13:0x0053, B:14:0x0056, B:16:0x005e, B:23:0x003c, B:26:0x004a), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.bytedance.im.core.proto.Request r9, X.InterfaceC67352kd<? super X.C63573OxF> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C63566Ox8
            if (r0 == 0) goto L1f
            r7 = r10
            X.Ox8 r7 = (X.C63566Ox8) r7
            int r2 = r7.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r7.LJLJI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L2d
            if (r0 != r5) goto L25
            goto L53
        L1f:
            X.Ox8 r7 = new X.Ox8
            r7.<init>(r8, r10)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r1)
            X.Pro<X.4eO> r0 = r8.LIZJ
            java.lang.Object r0 = r0.invoke()
            X.4eO r0 = (X.C114444eO) r0
            boolean r0 = r0.LJJLL
            r3 = r0 ^ 1
            X.4jT r2 = r8.LIZ     // Catch: X.C63599Oxf -> L65
            X.OxU r1 = new X.OxU     // Catch: X.C63599Oxf -> L65
            r0 = 510(0x1fe, float:7.15E-43)
            r1.<init>(r9, r0)     // Catch: X.C63599Oxf -> L65
            if (r3 == 0) goto L49
            r0 = 1
            goto L4a
        L49:
            r0 = 0
        L4a:
            r7.LJLJI = r5     // Catch: X.C63599Oxf -> L65
            java.lang.Object r1 = r2.LIZIZ(r1, r0, r7)     // Catch: X.C63599Oxf -> L65
            if (r1 != r6) goto L56
            return r6
        L53:
            X.C141335gf.LIZJ(r1)     // Catch: X.C63599Oxf -> L65
        L56:
            X.Oyt r1 = (X.C63675Oyt) r1     // Catch: X.C63599Oxf -> L65
            com.bytedance.im.core.proto.Response r0 = r1.LJLIL     // Catch: X.C63599Oxf -> L65
            com.bytedance.im.core.proto.ResponseBody r0 = r0.body     // Catch: X.C63599Oxf -> L65
            if (r0 == 0) goto L61
            com.bytedance.im.core.proto.CreateConversationV2ResponseBody r0 = r0.create_conversation_v2_body     // Catch: X.C63599Oxf -> L65
            goto L62
        L61:
            r0 = r4
        L62:
            r1 = r4
            r4 = r0
            goto L84
        L65:
            r3 = move-exception
            java.lang.String r1 = "CreateConversationUseCase"
            java.lang.String r0 = "create conversation error"
            X.C63322OtC.LJI(r1, r0, r3)
            X.Ou3 r2 = new X.Ou3
            r2.<init>()
            int r1 = r3.getErrorCode()
            X.Oy3 r0 = r2.LIZ
            r0.LIZ = r1
            java.lang.String r0 = r3.getMessage()
            X.Oy3 r1 = r2.LIZ
            r1.LIZJ = r0
            r1.LJII = r3
        L84:
            X.OxF r0 = new X.OxF
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63560Ox2.LIZLLL(com.bytedance.im.core.proto.Request, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r16, long r17, X.InterfaceC86963bA<X.C63120Opw> r19, X.InterfaceC67352kd<? super X.C76800UCe> r20) {
        /*
            r15 = this;
            r4 = r19
            r3 = r20
            boolean r0 = r3 instanceof X.C63565Ox7
            r8 = r15
            if (r0 == 0) goto L94
            r14 = r3
            X.Ox7 r14 = (X.C63565Ox7) r14
            int r2 = r14.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r14.LJLJJL = r2
        L17:
            java.lang.Object r6 = r14.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r14.LJLJJL
            r5 = 2
            r7 = 1
            if (r0 == 0) goto L33
            if (r0 == r7) goto L2b
            if (r0 != r5) goto L9b
            X.C141335gf.LIZJ(r6)
        L28:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2b:
            X.3bA r4 = r14.LJLILLLLZI
            X.Ox2 r0 = r14.LJLIL
            X.C141335gf.LIZJ(r6)
            goto L70
        L33:
            X.C141335gf.LIZJ(r6)
            r14.LJLIL = r8
            r14.LJLILLLLZI = r4
            r14.LJLJJL = r7
            java.lang.Long[] r6 = new java.lang.Long[r5]
            X.Pro<X.Osi> r0 = r8.LIZIZ
            java.lang.Object r0 = r0.invoke()
            X.Osi r0 = (X.InterfaceC63292Osi) r0
            long r0 = r0.getUid()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r0 = 0
            r6[r0] = r2
            java.lang.Long r0 = new java.lang.Long
            r1 = r17
            r0.<init>(r1)
            r6[r7] = r0
            java.util.List r11 = X.C47261Igj.LJJIJIIJI(r6)
            int r10 = X.AbstractC63505Ow9.LIZ
            r12 = 0
            X.3mF r13 = X.C113554cx.LJJJLIIL()
            r9 = r16
            java.lang.Object r6 = r8.LIZ(r9, r10, r11, r12, r13, r14)
            if (r6 != r3) goto L6f
            return r3
        L6f:
            r0 = r8
        L70:
            X.3bq r6 = (X.C87383bq) r6
            r2 = 0
            r14.LJLIL = r2
            r14.LJLILLLLZI = r2
            r14.LJLJJL = r5
            if (r4 == 0) goto L8e
            X.XKW r1 = r0.LJ
            X.3bp r0 = new X.3bp
            r0.<init>(r6, r4, r2)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r14)
            if (r0 != r3) goto L8b
        L88:
            if (r0 != r3) goto L28
            return r3
        L8b:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L88
        L8e:
            r0.getClass()
            X.UCe r0 = X.C76800UCe.LIZ
            goto L88
        L94:
            X.Ox7 r14 = new X.Ox7
            r14.<init>(r8, r3)
            goto L17
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63560Ox2.LIZJ(int, long, X.3bA, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0263, code lost:
    
        if (r7 == null) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r26, int r27, java.util.List<java.lang.Long> r28, java.lang.String r29, java.util.Map<java.lang.String, java.lang.String> r30, X.InterfaceC67352kd<? super X.C87383bq> r31) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63560Ox2.LIZ(int, int, java.util.List, java.lang.String, java.util.Map, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r15, java.util.List<java.lang.Long> r16, java.lang.String r17, java.util.Map<java.lang.String, java.lang.String> r18, X.InterfaceC86963bA<X.C63120Opw> r19, X.InterfaceC67352kd<? super X.C76800UCe> r20) {
        /*
            r14 = this;
            r5 = r19
            r3 = r20
            boolean r0 = r3 instanceof X.C63564Ox6
            r7 = r14
            if (r0 == 0) goto La2
            r13 = r3
            X.Ox6 r13 = (X.C63564Ox6) r13
            int r2 = r13.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La2
            int r2 = r2 - r1
            r13.LJLJJL = r2
        L17:
            java.lang.Object r3 = r13.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r13.LJLJJL
            r6 = 2
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 == r0) goto L2b
            if (r1 != r6) goto La9
            X.C141335gf.LIZJ(r3)
        L28:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2b:
            X.3bA r5 = r13.LJLILLLLZI
            X.Ox2 r0 = r13.LJLIL
            X.C141335gf.LIZJ(r3)
            goto L7e
        L33:
            X.C141335gf.LIZJ(r3)
            r13.LJLIL = r7
            r13.LJLILLLLZI = r5
            r13.LJLJJL = r0
            java.util.List r10 = X.ORZ.LLJILJILJ(r16)
            X.Pro<X.Osi> r0 = r7.LIZIZ
            java.lang.Object r0 = r0.invoke()
            X.Osi r0 = (X.InterfaceC63292Osi) r0
            long r0 = r0.getUid()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r0 = r10
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L6f
            X.Pro<X.Osi> r0 = r7.LIZIZ
            java.lang.Object r0 = r0.invoke()
            X.Osi r0 = (X.InterfaceC63292Osi) r0
            long r2 = r0.getUid()
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r2)
            r0 = 0
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r10, r0, r1)
        L6f:
            int r9 = X.AbstractC63505Ow9.LIZIZ
            r8 = r15
            r11 = r17
            r12 = r18
            java.lang.Object r3 = r7.LIZ(r8, r9, r10, r11, r12, r13)
            if (r3 != r4) goto L7d
            return r4
        L7d:
            r0 = r7
        L7e:
            X.3bq r3 = (X.C87383bq) r3
            r2 = 0
            r13.LJLIL = r2
            r13.LJLILLLLZI = r2
            r13.LJLJJL = r6
            if (r5 == 0) goto L9c
            X.XKW r1 = r0.LJ
            X.3bp r0 = new X.3bp
            r0.<init>(r3, r5, r2)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r13)
            if (r0 != r4) goto L99
        L96:
            if (r0 != r4) goto L28
            return r4
        L99:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L96
        L9c:
            r0.getClass()
            X.UCe r0 = X.C76800UCe.LIZ
            goto L96
        La2:
            X.Ox6 r13 = new X.Ox6
            r13.<init>(r7, r3)
            goto L17
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63560Ox2.LIZIZ(int, java.util.List, java.lang.String, java.util.Map, X.3bA, X.2kd):java.lang.Object");
    }
}
