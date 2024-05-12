package X;

/* renamed from: X.a1u, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91890a1u {
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(5:11|12|(1:14)|15|(4:17|(2:19|20)|22|23)(2:25|26))(2:27|28))(4:29|30|22|23))(2:31|(0)(0))))|35|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        r1 = r0.element;
        r7.LJLJI = r14;
        r7.LJLJJI = r0;
        r7.LJLIL = r11;
        r7.LJLILLLLZI = r10;
        r7.LJLJJLL = 2;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (X.C1JD.LIZJ(r1, r7) == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        return r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #0 {all -> 0x005d, blocks: (B:17:0x003e, B:22:0x005a, B:30:0x0057), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.UCe] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006d -> B:12:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(int r11, long r12, X.InterfaceC88472Yns<? super X.InterfaceC67352kd<? super X.C76800UCe>, ? extends java.lang.Object> r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            boolean r0 = r15 instanceof X.C92743aFf
            if (r0 == 0) goto L7c
            r7 = r15
            X.aFf r7 = (X.C92743aFf) r7
            int r2 = r7.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r7.LJLJJLL = r2
        L12:
            java.lang.Object r1 = r7.LJLJJL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJLL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L70
            if (r0 == r4) goto L4f
            if (r0 != r5) goto L86
            int r10 = r7.LJLILLLLZI
            int r11 = r7.LJLIL
            X.2sW r0 = r7.LJLJJI
            X.Yns r14 = r7.LJLJI
            X.C141335gf.LIZJ(r1)
        L2b:
            long r2 = r0.element
            r8 = 5000(0x1388, double:2.4703E-320)
            long r2 = r2 + r8
            r8 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L38
            r2 = 10000(0x2710, double:4.9407E-320)
        L38:
            r0.element = r2
            int r10 = r10 + 1
        L3c:
            if (r10 >= r11) goto L83
            r7.LJLJI = r14     // Catch: java.lang.Throwable -> L5d
            r7.LJLJJI = r0     // Catch: java.lang.Throwable -> L5d
            r7.LJLIL = r11     // Catch: java.lang.Throwable -> L5d
            r7.LJLILLLLZI = r10     // Catch: java.lang.Throwable -> L5d
            r7.LJLJJLL = r4     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = r14.invoke(r7)     // Catch: java.lang.Throwable -> L5d
            if (r1 != r6) goto L5a
            goto L82
        L4f:
            int r10 = r7.LJLILLLLZI
            int r11 = r7.LJLIL
            X.2sW r0 = r7.LJLJJI
            X.Yns r14 = r7.LJLJI
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L5d
        L5a:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L5d
            goto L8e
        L5d:
            long r1 = r0.element
            r7.LJLJI = r14
            r7.LJLJJI = r0
            r7.LJLIL = r11
            r7.LJLILLLLZI = r10
            r7.LJLJJLL = r5
            java.lang.Object r1 = X.C1JD.LIZJ(r1, r7)
            if (r1 != r6) goto L2b
            return r6
        L70:
            X.C141335gf.LIZJ(r1)
            X.2sW r0 = new X.2sW
            r0.<init>()
            r0.element = r12
            r10 = 0
            goto L3c
        L7c:
            X.aFf r7 = new X.aFf
            r7.<init>(r15)
            goto L12
        L82:
            return r6
        L83:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91890a1u.LIZ(int, long, X.Yns, X.2kd):java.lang.Object");
    }
}
