package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UVc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77292UVc implements InterfaceC77304UVo {
    public static final AtomicLong LJIIIIZZ = new AtomicLong(0);
    public final InterfaceC70422pa LIZ;
    public final InterfaceC65784Pro<List<InterfaceC77300UVk>> LIZIZ;
    public final InterfaceC65784Pro<List<InterfaceC77303UVn>> LIZJ;
    public final InterfaceC88471Ynr<C32816CuK, UVA, C76800UCe> LIZLLL;
    public final InterfaceC88471Ynr<C32816CuK, UV8, C76800UCe> LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;
    public final long LJI;
    public final AtomicBoolean LJII;

    public abstract Object LJFF(C32816CuK c32816CuK, InterfaceC67352kd<? super UVA> interfaceC67352kd);

    public abstract InterfaceC65784Pro<List<InterfaceC77303UVn>> LJI();

    public abstract String LJII();

    @Override // X.InterfaceC77304UVo
    public final boolean LIZ(C32816CuK transactionTask) {
        o.LJIIIZ(transactionTask, "transactionTask");
        if (this.LJII.compareAndSet(true, false)) {
            String LJII = LJII();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("exe(");
            LIZ.append(this.LJI);
            LIZ.append(") tryExecute success task: ");
            LIZ.append(transactionTask.LIZ());
            C0NB.LIZIZ(LJII, X1D.LIZIZ(LIZ));
            XKX.LIZLLL(this.LIZ, null, null, new C77293UVd(this, transactionTask, null), 3);
            return true;
        }
        String LJII2 = LJII();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("exe(");
        LIZ2.append(this.LJI);
        LIZ2.append(") tryExecute executor busy, skip");
        C0NB.LIZIZ(LJII2, X1D.LIZIZ(LIZ2));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00bf -> B:11:0x002b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0082 -> B:26:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C32816CuK r9, X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C77295UVf
            if (r0 == 0) goto Lc2
            r3 = r10
            X.UVf r3 = (X.C77295UVf) r3
            int r2 = r3.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc2
            int r2 = r2 - r1
            r3.LJLJJLL = r2
        L12:
            java.lang.Object r0 = r3.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r3.LJLJJLL
            r6 = 1
            r2 = 2
            if (r1 == 0) goto L36
            if (r1 == r6) goto L85
            if (r1 != r2) goto Lc9
            java.lang.Object r5 = r3.LJLJI
            java.util.Iterator r5 = (java.util.Iterator) r5
            X.CuK r9 = r3.LJLILLLLZI
            X.UVc r1 = r3.LJLIL
            X.C141335gf.LIZJ(r0)
        L2b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La7
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L36:
            X.C141335gf.LIZJ(r0)
            java.lang.String r7 = r8.LJII()
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            java.lang.String r0 = "exe("
            r5.append(r0)
            long r0 = r8.LJI
            r5.append(r0)
            java.lang.String r0 = ") doCheck"
            r5.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r5)
            X.C0NB.LIZIZ(r7, r0)
            java.util.LinkedList<X.UVP> r0 = r9.LIZ
            java.util.Iterator r5 = r0.iterator()
            r1 = r8
        L5e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r5.next()
            X.UVP r0 = (X.UVP) r0
            java.lang.ref.WeakReference<X.UVk> r0 = r0.LIZLLL
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r0.get()
            X.UVk r0 = (X.InterfaceC77300UVk) r0
            if (r0 == 0) goto L5e
            r3.LJLIL = r1
            r3.LJLILLLLZI = r9
            r3.LJLJI = r5
            r3.LJLJJLL = r6
            java.lang.Object r0 = r1.LIZIZ(r9, r0, r3)
            if (r0 != r4) goto L90
            return r4
        L85:
            java.lang.Object r5 = r3.LJLJI
            java.util.Iterator r5 = (java.util.Iterator) r5
            X.CuK r9 = r3.LJLILLLLZI
            X.UVc r1 = r3.LJLIL
            X.C141335gf.LIZJ(r0)
        L90:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L9b:
            X.Pro<java.util.List<X.UVk>> r0 = r1.LIZIZ
            java.lang.Object r0 = r0.invoke()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r5 = r0.iterator()
        La7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Ld1
            java.lang.Object r0 = r5.next()
            X.UVk r0 = (X.InterfaceC77300UVk) r0
            r3.LJLIL = r1
            r3.LJLILLLLZI = r9
            r3.LJLJI = r5
            r3.LJLJJLL = r2
            java.lang.Object r0 = r1.LIZIZ(r9, r0, r3)
            if (r0 != r4) goto L2b
            return r4
        Lc2:
            X.UVf r3 = new X.UVf
            r3.<init>(r8, r10)
            goto L12
        Lc9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Ld1:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC77292UVc.LIZJ(X.CuK, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C32816CuK r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC77292UVc.LIZLLL(X.CuK, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C32816CuK r9, X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC77292UVc.LJ(X.CuK, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[Catch: Exception -> 0x009b, TryCatch #1 {Exception -> 0x009b, blocks: (B:11:0x0046, B:12:0x0049, B:14:0x0087), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C32816CuK r7, X.InterfaceC77300UVk r8, X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C77294UVe
            if (r0 == 0) goto L24
            r3 = r9
            X.UVe r3 = (X.C77294UVe) r3
            int r2 = r3.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LJLJJLL = r2
        L12:
            java.lang.Object r5 = r3.LJLJJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r3.LJLJJLL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            X.UVk r8 = r3.LJLJI
            X.CuK r7 = r3.LJLILLLLZI
            X.UVc r4 = r3.LJLIL
            goto L46
        L24:
            X.UVe r3 = new X.UVe
            r3.<init>(r6, r9)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r5)
            r3.LJLIL = r6     // Catch: java.lang.Exception -> L9d
            r3.LJLILLLLZI = r7     // Catch: java.lang.Exception -> L9d
            r3.LJLJI = r8     // Catch: java.lang.Exception -> L9d
            r3.LJLJJLL = r0     // Catch: java.lang.Exception -> L9d
            java.lang.Object r5 = r8.LIZIZ(r7, r3)     // Catch: java.lang.Exception -> L9d
            if (r5 != r2) goto L44
            return r2
        L44:
            r4 = r6
            goto L49
        L46:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> L9b
        L49:
            X.E8e r5 = (X.C35928E8e) r5     // Catch: java.lang.Exception -> L9b
            java.lang.String r2 = r4.LJII()     // Catch: java.lang.Exception -> L9b
            java.lang.StringBuilder r3 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "exe("
            r3.append(r0)     // Catch: java.lang.Exception -> L9b
            long r0 = r4.LJI     // Catch: java.lang.Exception -> L9b
            r3.append(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = ") checkAndIntercept interceptor("
            r3.append(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L9b
            r3.append(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = ") reject("
            r3.append(r0)     // Catch: java.lang.Exception -> L9b
            boolean r0 = r5.LIZ     // Catch: java.lang.Exception -> L9b
            r3.append(r0)     // Catch: java.lang.Exception -> L9b
            r0 = 41
            r3.append(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = X.X1D.LIZIZ(r3)     // Catch: java.lang.Exception -> L9b
            X.C0NB.LIZIZ(r2, r0)     // Catch: java.lang.Exception -> L9b
            boolean r0 = r5.LIZ     // Catch: java.lang.Exception -> L9b
            if (r0 == 0) goto L98
            X.Ynr<X.CuK, X.UV8, X.UCe> r3 = r4.LJ     // Catch: java.lang.Exception -> L9b
            X.UV8 r2 = new X.UV8     // Catch: java.lang.Exception -> L9b
            X.UVH r1 = X.UVH.PRE_REQUEST_CHECK_FAIL     // Catch: java.lang.Exception -> L9b
            java.lang.Object r0 = r5.LIZIZ     // Catch: java.lang.Exception -> L9b
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L9b
            r3.invoke(r7, r2)     // Catch: java.lang.Exception -> L9b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L9b
            return r0
        L98:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L9b:
            r3 = move-exception
            goto L9f
        L9d:
            r3 = move-exception
            r4 = r6
        L9f:
            java.lang.String r0 = r4.LJII()
            X.C0NB.LJI(r0, r3)
            X.Ynr<X.CuK, X.UV8, X.UCe> r2 = r4.LJ
            X.UV8 r1 = new X.UV8
            X.UVH r0 = X.UVH.EXCEPTION
            r1.<init>(r0, r3)
            r2.invoke(r7, r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC77292UVc.LIZIZ(X.CuK, X.UVk, X.2kd):java.lang.Object");
    }

    public AbstractC77292UVc(InterfaceC70422pa scope, AqS163S0100000_13 obtainPreRequestInterceptors, AqS163S0100000_13 obtainPreRequestProcessor, InterfaceC88471Ynr onResult, InterfaceC88471Ynr onFail, InterfaceC65784Pro onAvailable) {
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(obtainPreRequestInterceptors, "obtainPreRequestInterceptors");
        o.LJIIIZ(obtainPreRequestProcessor, "obtainPreRequestProcessor");
        o.LJIIIZ(onResult, "onResult");
        o.LJIIIZ(onFail, "onFail");
        o.LJIIIZ(onAvailable, "onAvailable");
        this.LIZ = scope;
        this.LIZIZ = obtainPreRequestInterceptors;
        this.LIZJ = obtainPreRequestProcessor;
        this.LIZLLL = onResult;
        this.LJ = onFail;
        this.LJFF = onAvailable;
        this.LJI = LJIIIIZZ.addAndGet(1L);
        this.LJII = new AtomicBoolean(true);
    }
}
