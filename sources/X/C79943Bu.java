package X;

import kotlinx.coroutines.flow.ChannelAsFlow;

/* renamed from: X.3Bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C79943Bu {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC65462ha LIZ(XK4 xk4) {
        return new ChannelAsFlow(xk4, true, null, 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(6:(2:3|(9:5|6|7|(1:(1:(2:11|12)(2:50|51))(4:52|53|19|(2:28|(2:30|(2:32|33))(2:34|(2:39|40)(1:38)))(2:21|(3:(1:24)|25|26)(1:27))))(2:54|(2:56|57))|13|14|(2:16|17)|19|(0)(0)))|13|14|(0)|19|(0)(0))|59|6|7|(0)(0)|(2:(1:45)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:12:0x002d, B:19:0x005d, B:21:0x0061, B:27:0x0084, B:28:0x0066, B:30:0x006a, B:34:0x0086, B:36:0x008a, B:38:0x0091, B:39:0x0092, B:40:0x00a0, B:53:0x0056), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:12:0x002d, B:19:0x005d, B:21:0x0061, B:27:0x0084, B:28:0x0066, B:30:0x006a, B:34:0x0086, B:36:0x008a, B:38:0x0091, B:39:0x0092, B:40:0x00a0, B:53:0x0056), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0076 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LIZIZ(X.InterfaceC64672gJ<? super T> r6, X.XKM<? extends T> r7, boolean r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            boolean r0 = r9 instanceof X.C79933Bt
            if (r0 == 0) goto L27
            r5 = r9
            X.3Bt r5 = (X.C79933Bt) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            r2 = 2
            if (r0 == 0) goto L40
            if (r0 == r3) goto L39
            if (r0 != r2) goto L31
            boolean r8 = r5.LJLJI
            X.XKM r7 = r5.LJLILLLLZI
            X.2gJ r6 = r5.LJLIL
            goto L2d
        L27:
            X.3Bt r5 = new X.3Bt
            r5.<init>(r9)
            goto L12
        L2d:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> La1
            goto L47
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            boolean r8 = r5.LJLJI
            X.XKM r7 = r5.LJLILLLLZI
            X.2gJ r6 = r5.LJLIL
            goto L56
        L40:
            X.C141335gf.LIZJ(r1)
            boolean r0 = r6 instanceof X.C79953Bv
            if (r0 != 0) goto Lad
        L47:
            r5.LJLIL = r6     // Catch: java.lang.Throwable -> La4
            r5.LJLILLLLZI = r7     // Catch: java.lang.Throwable -> La4
            r5.LJLJI = r8     // Catch: java.lang.Throwable -> La4
            r5.LJLJJL = r3     // Catch: java.lang.Throwable -> La4
            java.lang.Object r1 = r7.LJIILJJIL(r5)     // Catch: java.lang.Throwable -> La4
            if (r1 != r4) goto L5d
            goto La3
        L56:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> La1
            X.3Bx r1 = (X.C79973Bx) r1     // Catch: java.lang.Throwable -> La1
            java.lang.Object r1 = r1.LIZ     // Catch: java.lang.Throwable -> La1
        L5d:
            boolean r0 = r1 instanceof X.C79993Bz     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L66
            java.lang.Throwable r0 = X.C79973Bx.LIZ(r1)     // Catch: java.lang.Throwable -> La1
            goto L79
        L66:
            boolean r0 = r1 instanceof X.C3C0     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L86
            r5.LJLIL = r6     // Catch: java.lang.Throwable -> La1
            r5.LJLILLLLZI = r7     // Catch: java.lang.Throwable -> La1
            r5.LJLJI = r8     // Catch: java.lang.Throwable -> La1
            r5.LJLJJL = r2     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r6.emit(r1, r5)     // Catch: java.lang.Throwable -> La1
            if (r0 != r4) goto L47
            goto L85
        L79:
            if (r0 != 0) goto L84
            if (r8 == 0) goto L81
            r0 = 0
            X.C77275UUl.LIZIZ(r7, r0)
        L81:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L84:
            throw r0     // Catch: java.lang.Throwable -> La1
        L85:
            return r4
        L86:
            boolean r0 = r1 instanceof X.C79993Bz     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L92
            r0 = r1
            X.3Bz r0 = (X.C79993Bz) r0     // Catch: java.lang.Throwable -> La1
            java.lang.Throwable r0 = r0.LIZ     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L92
            throw r0     // Catch: java.lang.Throwable -> La1
        L92:
            java.lang.String r0 = "Trying to call 'getOrThrow' on a failed channel result: "
            java.lang.String r1 = kotlin.jvm.internal.o.LJIILLIIL(r1, r0)     // Catch: java.lang.Throwable -> La1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La1
            r1.toString()     // Catch: java.lang.Throwable -> La1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La1
            throw r0     // Catch: java.lang.Throwable -> La1
        La1:
            r1 = move-exception
            goto La5
        La3:
            return r4
        La4:
            r1 = move-exception
        La5:
            throw r1     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            if (r8 == 0) goto Lac
            X.C77275UUl.LIZIZ(r7, r1)
        Lac:
            throw r0
        Lad:
            X.3Bv r6 = (X.C79953Bv) r6
            java.lang.Throwable r0 = r6.LJLIL
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79943Bu.LIZIZ(X.2gJ, X.XKM, boolean, X.2kd):java.lang.Object");
    }
}
