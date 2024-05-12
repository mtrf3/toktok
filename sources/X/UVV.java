package X;

import djb.IDaS26S0000000_13;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes14.dex */
public final class UVV {
    public final CoroutineExceptionHandler LIZ;
    public final InterfaceC70422pa LIZIZ;
    public final InterfaceC88472Yns<C32816CuK, C76800UCe> LIZJ;
    public final InterfaceC88471Ynr<C32816CuK, UV8, C76800UCe> LIZLLL;
    public final String LJ;
    public final CopyOnWriteArrayList<InterfaceC77299UVj> LJFF;
    public final CopyOnWriteArrayList<InterfaceC77301UVl> LJI;

    public UVV(AqS179S0100000_13 aqS179S0100000_13, AqS195S0100000_13 aqS195S0100000_13) {
        IDaS26S0000000_13 iDaS26S0000000_13 = new IDaS26S0000000_13(CoroutineExceptionHandler.LJJJJIZL, 1);
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()).plus(iDaS26S0000000_13));
        this.LIZ = iDaS26S0000000_13;
        this.LIZIZ = LIZ;
        this.LIZJ = aqS179S0100000_13;
        this.LIZLLL = aqS195S0100000_13;
        this.LJ = "PreSendGiftChecker";
        this.LJFF = new CopyOnWriteArrayList<>();
        this.LJI = new CopyOnWriteArrayList<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a7 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x006b -> B:26:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C32816CuK r8, X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C77290UVa
            if (r0 == 0) goto Laa
            r4 = r9
            X.UVa r4 = (X.C77290UVa) r4
            int r2 = r4.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r4.LJLJJLL = r2
        L12:
            java.lang.Object r0 = r4.LJLJJI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJLL
            r6 = 1
            r3 = 2
            if (r1 == 0) goto L36
            if (r1 == r6) goto L6e
            if (r1 != r3) goto Lb1
            java.lang.Object r6 = r4.LJLJI
            java.util.Iterator r6 = (java.util.Iterator) r6
            X.CuK r8 = r4.LJLILLLLZI
            X.UVV r2 = r4.LJLIL
            X.C141335gf.LIZJ(r0)
        L2b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L36:
            X.C141335gf.LIZJ(r0)
            java.lang.String r1 = r7.LJ
            java.lang.String r0 = "doCheck"
            X.C0NB.LIZIZ(r1, r0)
            java.util.LinkedList<X.UVP> r0 = r8.LIZ
            java.util.Iterator r1 = r0.iterator()
            r2 = r7
        L47:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r1.next()
            X.UVP r0 = (X.UVP) r0
            java.lang.ref.WeakReference<X.UVj> r0 = r0.LIZIZ
            if (r0 == 0) goto L47
            java.lang.Object r0 = r0.get()
            X.UVj r0 = (X.InterfaceC77299UVj) r0
            if (r0 == 0) goto L47
            r4.LJLIL = r2
            r4.LJLILLLLZI = r8
            r4.LJLJI = r1
            r4.LJLJJLL = r6
            java.lang.Object r0 = r2.LIZ(r8, r0, r4)
            if (r0 != r5) goto L79
            return r5
        L6e:
            java.lang.Object r1 = r4.LJLJI
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.CuK r8 = r4.LJLILLLLZI
            X.UVV r2 = r4.LJLIL
            X.C141335gf.LIZJ(r0)
        L79:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L47
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L84:
            java.util.concurrent.CopyOnWriteArrayList<X.UVj> r0 = r2.LJFF
            java.util.Iterator r6 = r0.iterator()
        L8a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r1 = r6.next()
            X.UVj r1 = (X.InterfaceC77299UVj) r1
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4.LJLIL = r2
            r4.LJLILLLLZI = r8
            r4.LJLJI = r6
            r4.LJLJJLL = r3
            java.lang.Object r0 = r2.LIZ(r8, r1, r4)
            if (r0 != r5) goto L2b
            return r5
        Laa:
            X.UVa r4 = new X.UVa
            r4.<init>(r7, r9)
            goto L12
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UVV.LIZIZ(X.CuK, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C32816CuK r9, X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.UVZ
            if (r0 == 0) goto L29
            r3 = r10
            X.UVZ r3 = (X.UVZ) r3
            int r2 = r3.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r3.LJLJJLL = r2
        L12:
            java.lang.Object r7 = r3.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJLL
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L47
            if (r0 == r6) goto L3b
            if (r0 != r2) goto L33
            java.lang.Object r5 = r3.LJLJI
            java.util.Iterator r5 = (java.util.Iterator) r5
            X.CuK r9 = r3.LJLILLLLZI
            X.UVV r1 = r3.LJLIL
            goto L2f
        L29:
            X.UVZ r3 = new X.UVZ
            r3.<init>(r8, r10)
            goto L12
        L2f:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> Lb5
            goto L8e
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            java.lang.Object r5 = r3.LJLJI
            java.util.Iterator r5 = (java.util.Iterator) r5
            X.CuK r9 = r3.LJLILLLLZI
            X.UVV r1 = r3.LJLIL
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> L73
            goto L58
        L47:
            X.C141335gf.LIZJ(r7)
            java.lang.String r1 = r8.LJ
            java.lang.String r0 = "doProcess"
            X.C0NB.LIZIZ(r1, r0)
            java.util.concurrent.CopyOnWriteArrayList<X.UVl> r0 = r8.LJI
            java.util.Iterator r5 = r0.iterator()
            r1 = r8
        L58:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r5.next()
            X.UVl r0 = (X.InterfaceC77301UVl) r0
            r3.LJLIL = r1     // Catch: java.lang.Exception -> L73
            r3.LJLILLLLZI = r9     // Catch: java.lang.Exception -> L73
            r3.LJLJI = r5     // Catch: java.lang.Exception -> L73
            r3.LJLJJLL = r6     // Catch: java.lang.Exception -> L73
            java.lang.Object r0 = r0.LIZ(r9, r3)     // Catch: java.lang.Exception -> L73
            if (r0 != r4) goto L58
            return r4
        L73:
            r3 = move-exception
            java.lang.String r0 = r1.LJ
            X.C0NB.LJI(r0, r3)
            X.Ynr<X.CuK, X.UV8, X.UCe> r2 = r1.LIZLLL
            X.UV8 r1 = new X.UV8
            X.UVH r0 = X.UVH.EXCEPTION
            r1.<init>(r0, r3)
            r2.invoke(r9, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L88:
            java.util.LinkedList<X.UVP> r0 = r9.LIZ
            java.util.Iterator r5 = r0.iterator()
        L8e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r5.next()
            X.UVP r0 = (X.UVP) r0
            java.lang.ref.WeakReference<X.UVl> r0 = r0.LIZJ
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r0.get()
            X.UVl r0 = (X.InterfaceC77301UVl) r0
            if (r0 == 0) goto L8e
            r3.LJLIL = r1     // Catch: java.lang.Exception -> Lb5
            r3.LJLILLLLZI = r9     // Catch: java.lang.Exception -> Lb5
            r3.LJLJI = r5     // Catch: java.lang.Exception -> Lb5
            r3.LJLJJLL = r2     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r0 = r0.LIZ(r9, r3)     // Catch: java.lang.Exception -> Lb5
            if (r0 != r4) goto L8e
            return r4
        Lb5:
            r3 = move-exception
            java.lang.String r0 = r1.LJ
            X.C0NB.LJI(r0, r3)
            X.Ynr<X.CuK, X.UV8, X.UCe> r2 = r1.LIZLLL
            X.UV8 r1 = new X.UV8
            X.UVH r0 = X.UVH.EXCEPTION
            r1.<init>(r0, r3)
            r2.invoke(r9, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Lca:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UVV.LIZJ(X.CuK, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:11:0x0046, B:12:0x0049, B:14:0x007b), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C32816CuK r7, X.InterfaceC77299UVj r8, X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.UVY
            if (r0 == 0) goto L24
            r3 = r9
            X.UVY r3 = (X.UVY) r3
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
            X.UVj r8 = r3.LJLJI
            X.CuK r7 = r3.LJLILLLLZI
            X.UVV r4 = r3.LJLIL
            goto L46
        L24:
            X.UVY r3 = new X.UVY
            r3.<init>(r6, r9)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r5)
            r3.LJLIL = r6     // Catch: java.lang.Exception -> L91
            r3.LJLILLLLZI = r7     // Catch: java.lang.Exception -> L91
            r3.LJLJI = r8     // Catch: java.lang.Exception -> L91
            r3.LJLJJLL = r0     // Catch: java.lang.Exception -> L91
            java.lang.Object r5 = r8.LIZIZ(r7, r3)     // Catch: java.lang.Exception -> L91
            if (r5 != r2) goto L44
            return r2
        L44:
            r4 = r6
            goto L49
        L46:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> L8f
        L49:
            X.E8e r5 = (X.C35928E8e) r5     // Catch: java.lang.Exception -> L8f
            java.lang.String r2 = r4.LJ     // Catch: java.lang.Exception -> L8f
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = "checkAndIntercept interceptor("
            r1.append(r0)     // Catch: java.lang.Exception -> L8f
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L8f
            r1.append(r0)     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = ") reject("
            r1.append(r0)     // Catch: java.lang.Exception -> L8f
            boolean r0 = r5.LIZ     // Catch: java.lang.Exception -> L8f
            r1.append(r0)     // Catch: java.lang.Exception -> L8f
            r0 = 41
            r1.append(r0)     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L8f
            X.C0NB.LIZIZ(r2, r0)     // Catch: java.lang.Exception -> L8f
            boolean r0 = r5.LIZ     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L8c
            X.Ynr<X.CuK, X.UV8, X.UCe> r3 = r4.LIZLLL     // Catch: java.lang.Exception -> L8f
            X.UV8 r2 = new X.UV8     // Catch: java.lang.Exception -> L8f
            X.UVH r1 = X.UVH.PRE_SEND_CHECK_FAIL     // Catch: java.lang.Exception -> L8f
            java.lang.Object r0 = r5.LIZIZ     // Catch: java.lang.Exception -> L8f
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L8f
            r3.invoke(r7, r2)     // Catch: java.lang.Exception -> L8f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L8f
            return r0
        L8c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L8f:
            r3 = move-exception
            goto L93
        L91:
            r3 = move-exception
            r4 = r6
        L93:
            java.lang.String r0 = r4.LJ
            X.C0NB.LJI(r0, r3)
            X.Ynr<X.CuK, X.UV8, X.UCe> r2 = r4.LIZLLL
            X.UV8 r1 = new X.UV8
            X.UVH r0 = X.UVH.EXCEPTION
            r1.<init>(r0, r3)
            r2.invoke(r7, r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UVV.LIZ(X.CuK, X.UVj, X.2kd):java.lang.Object");
    }
}
