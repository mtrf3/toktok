package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90393gh {
    public static final int LIZ(Throwable th) {
        C64799Pbv c64799Pbv;
        o.LJIIIZ(th, "<this>");
        if ((th instanceof C64799Pbv) && (c64799Pbv = (C64799Pbv) th) != null) {
            return c64799Pbv.getStatusCode();
        }
        return -106;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(3:20|21|(2:23|24))|18|12))|34|6|7|(0)(0)|18|12|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        r8.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r11 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        r11.invoke(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        r7.LJLIL = r8;
        r7.LJLILLLLZI = r11;
        r7.LJLJI = r10;
        r7.LJLJJL = 2;
        r9 = new X.XKS(1, X.C78555UsJ.LJJII(r7));
        r9.LJIIL();
        r7 = new kotlin.jvm.internal.AqS61S0400000_1(r8, r9, r10, r11, 0);
        r0 = new X.C73306Spq();
        X.C73312Spw.LJI(r0, r7);
        r8.setStatus(r0);
        r1 = r9.LJIIJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r1 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LIZIZ(X.C73305Spp r10, X.InterfaceC88472Yns<? super java.lang.Exception, X.C76800UCe> r11, X.InterfaceC88473Ynt<? super java.lang.Long, ? super java.lang.Boolean, ? super X.InterfaceC67352kd<? super T>, ? extends java.lang.Object> r12, X.InterfaceC67352kd<? super T> r13) {
        /*
            r3 = r13
            r8 = r10
            r10 = r12
            r11 = r11
            boolean r0 = r3 instanceof X.C90403gi
            if (r0 == 0) goto L85
            r7 = r3
            X.3gi r7 = (X.C90403gi) r7
            int r2 = r7.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r7.LJLJJL = r2
        L16:
            java.lang.Object r1 = r7.LJLJJI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJL
            r6 = 2
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 == r4) goto L28
            if (r0 != r6) goto L8b
            X.C141335gf.LIZJ(r1)
        L27:
            return r1
        L28:
            X.Ynt r10 = r7.LJLJI
            X.Yns r11 = r7.LJLILLLLZI
            X.Spp r8 = r7.LJLIL
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            goto L27
        L32:
            X.C141335gf.LIZJ(r1)
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            java.lang.Long r1 = new java.lang.Long     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            r1.<init>(r2)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            r7.LJLIL = r8     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            r7.LJLILLLLZI = r11     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            r7.LJLJI = r10     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            r7.LJLJJL = r4     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            java.lang.Object r1 = r10.invoke(r1, r0, r7)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L94
            if (r1 != r5) goto L27
            goto L93
        L4f:
            r1 = move-exception
            r0 = 0
            r8.setVisibility(r0)
            if (r11 == 0) goto L59
            r11.invoke(r1)
        L59:
            r7.LJLIL = r8
            r7.LJLILLLLZI = r11
            r7.LJLJI = r10
            r7.LJLJJL = r6
            X.XKS r9 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r7)
            r9.<init>(r4, r0)
            r9.LJIIL()
            kotlin.jvm.internal.AqS61S0400000_1 r7 = new kotlin.jvm.internal.AqS61S0400000_1
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            X.Spq r0 = new X.Spq
            r0.<init>()
            X.C73312Spw.LJI(r0, r7)
            r8.setStatus(r0)
            java.lang.Object r1 = r9.LJIIJJI()
            if (r1 != r5) goto L27
            return r5
        L85:
            X.3gi r7 = new X.3gi
            r7.<init>(r3)
            goto L16
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L93:
            return r5
        L94:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90393gh.LIZIZ(X.Spp, X.Yns, X.Ynt, X.2kd):java.lang.Object");
    }
}
