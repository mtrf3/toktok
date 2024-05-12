package X;

import djb.IDaS26S0000000_13;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes14.dex */
public final class UVR {
    public final CoroutineExceptionHandler LIZ;
    public final InterfaceC70422pa LIZIZ;
    public final InterfaceC88471Ynr<C32816CuK, UV7, C76800UCe> LIZJ;
    public final InterfaceC88471Ynr<C32816CuK, UV8, C76800UCe> LIZLLL;
    public final String LJ;
    public final CopyOnWriteArrayList<UVU> LJFF;

    public UVR(AqS195S0100000_13 aqS195S0100000_13, AqS195S0100000_13 aqS195S0100000_132) {
        IDaS26S0000000_13 iDaS26S0000000_13 = new IDaS26S0000000_13(CoroutineExceptionHandler.LJJJJIZL, 0);
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()).plus(iDaS26S0000000_13));
        this.LIZ = iDaS26S0000000_13;
        this.LIZIZ = LIZ;
        this.LIZJ = aqS195S0100000_13;
        this.LIZLLL = aqS195S0100000_132;
        this.LJ = "PostSendGiftChecker";
        this.LJFF = new CopyOnWriteArrayList<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a8 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0068 -> B:26:0x0078). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C32816CuK r9, X.UV9 r10, X.InterfaceC67352kd<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.UVT
            if (r0 == 0) goto Lab
            r3 = r11
            X.UVT r3 = (X.UVT) r3
            int r2 = r3.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lab
            int r2 = r2 - r1
            r3.LJLJL = r2
        L12:
            java.lang.Object r7 = r3.LJLJJL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJL
            r6 = 1
            r2 = 2
            if (r0 == 0) goto L38
            if (r0 == r6) goto L6b
            if (r0 != r2) goto Lb2
            java.lang.Object r6 = r3.LJLJJI
            java.util.Iterator r6 = (java.util.Iterator) r6
            X.UV9 r10 = r3.LJLJI
            X.CuK r9 = r3.LJLILLLLZI
            X.UVR r5 = r3.LJLIL
            X.C141335gf.LIZJ(r7)
        L2d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L89
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L38:
            X.C141335gf.LIZJ(r7)
            java.util.LinkedList<X.UVP> r0 = r9.LIZ
            java.util.Iterator r1 = r0.iterator()
            r5 = r8
        L42:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r1.next()
            X.UVP r0 = (X.UVP) r0
            java.lang.ref.WeakReference<X.UVU> r0 = r0.LJFF
            if (r0 == 0) goto L42
            java.lang.Object r0 = r0.get()
            X.UVU r0 = (X.UVU) r0
            if (r0 == 0) goto L42
            r3.LJLIL = r5
            r3.LJLILLLLZI = r9
            r3.LJLJI = r10
            r3.LJLJJI = r1
            r3.LJLJL = r6
            java.lang.Object r7 = r5.LIZ(r9, r0, r10, r3)
            if (r7 != r4) goto L78
            return r4
        L6b:
            java.lang.Object r1 = r3.LJLJJI
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.UV9 r10 = r3.LJLJI
            X.CuK r9 = r3.LJLILLLLZI
            X.UVR r5 = r3.LJLIL
            X.C141335gf.LIZJ(r7)
        L78:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L42
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L83:
            java.util.concurrent.CopyOnWriteArrayList<X.UVU> r0 = r5.LJFF
            java.util.Iterator r6 = r0.iterator()
        L89:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r1 = r6.next()
            X.UVU r1 = (X.UVU) r1
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.LJLIL = r5
            r3.LJLILLLLZI = r9
            r3.LJLJI = r10
            r3.LJLJJI = r6
            r3.LJLJL = r2
            java.lang.Object r7 = r5.LIZ(r9, r1, r10, r3)
            if (r7 != r4) goto L2d
            return r4
        Lab:
            X.UVT r3 = new X.UVT
            r3.<init>(r8, r11)
            goto L12
        Lb2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lba:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UVR.LIZIZ(X.CuK, X.UV9, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:11:0x0046, B:12:0x0049, B:14:0x007b), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C32816CuK r7, X.UVU r8, X.UV9 r9, X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.UVS
            if (r0 == 0) goto L24
            r3 = r10
            X.UVS r3 = (X.UVS) r3
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
            X.UVU r8 = r3.LJLJI
            X.CuK r7 = r3.LJLILLLLZI
            X.UVR r4 = r3.LJLIL
            goto L46
        L24:
            X.UVS r3 = new X.UVS
            r3.<init>(r6, r10)
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
            X.E8e r5 = r8.LJ(r9)     // Catch: java.lang.Exception -> L91
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
            X.UVH r1 = X.UVH.RESULT_CHECK_FAIL     // Catch: java.lang.Exception -> L8f
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
        throw new UnsupportedOperationException("Method not decompiled: X.UVR.LIZ(X.CuK, X.UVU, X.UV9, X.2kd):java.lang.Object");
    }
}
