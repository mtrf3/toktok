package X;

import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.4cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC113374cf<T, R> extends C3RG<R> {
    public InterfaceC88471Ynr<? super T, ? super InterfaceC67352kd<? super Boolean>, ? extends Object> LIZIZ;
    public InterfaceC88471Ynr<? super List<? extends T>, ? super InterfaceC67352kd<? super List<? extends T>>, ? extends Object> LIZJ;
    public InterfaceC88471Ynr<? super R, ? super InterfaceC67352kd<? super Boolean>, ? extends Object> LIZLLL;
    public InterfaceC88471Ynr<? super List<? extends R>, ? super InterfaceC67352kd<? super List<? extends R>>, ? extends Object> LJ;
    public int LJFF = -1;
    public volatile boolean LJI;

    public abstract InterfaceC88472Yns<T, R> LJ();

    public abstract Object LJI(InterfaceC67352kd<? super List<T>> interfaceC67352kd);

    public abstract Object LJIIIIZZ(InterfaceC67352kd<? super List<T>> interfaceC67352kd);

    public AbstractC113374cf() {
        new AqS167S0100000_1(this, 320);
        this.LJI = true;
    }

    @Override // X.C3RG
    public final boolean LIZ() {
        return this.LJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r4
      0x0023: PHI (r4v5 java.lang.Object) = (r4v4 java.lang.Object), (r4v0 java.lang.Object) binds: [B:17:0x0044, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC67352kd<? super java.util.List<R>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C113414cj
            if (r0 == 0) goto L47
            r5 = r7
            X.4cj r5 = (X.C113414cj) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJJI
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 == r0) goto L24
            if (r1 != r2) goto L4d
            X.C141335gf.LIZJ(r4)
        L23:
            return r4
        L24:
            X.4cf r1 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
            goto L39
        L2a:
            X.C141335gf.LIZJ(r4)
            r5.LJLIL = r6
            r5.LJLJJI = r0
            java.lang.Object r4 = r6.LJI(r5)
            if (r4 != r3) goto L38
            return r3
        L38:
            r1 = r6
        L39:
            java.util.List r4 = (java.util.List) r4
            r0 = 0
            r5.LJLIL = r0
            r5.LJLJJI = r2
            java.lang.Object r4 = r1.LJIIIZ(r4, r5)
            if (r4 != r3) goto L23
            return r3
        L47:
            X.4cj r5 = new X.4cj
            r5.<init>(r6, r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC113374cf.LJFF(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r4
      0x0023: PHI (r4v5 java.lang.Object) = (r4v4 java.lang.Object), (r4v0 java.lang.Object) binds: [B:17:0x0044, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC67352kd<? super java.util.List<R>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C113424ck
            if (r0 == 0) goto L47
            r5 = r7
            X.4ck r5 = (X.C113424ck) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJJI
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 == r0) goto L24
            if (r1 != r2) goto L4d
            X.C141335gf.LIZJ(r4)
        L23:
            return r4
        L24:
            X.4cf r1 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
            goto L39
        L2a:
            X.C141335gf.LIZJ(r4)
            r5.LJLIL = r6
            r5.LJLJJI = r0
            java.lang.Object r4 = r6.LJIIIIZZ(r5)
            if (r4 != r3) goto L38
            return r3
        L38:
            r1 = r6
        L39:
            java.util.List r4 = (java.util.List) r4
            r0 = 0
            r5.LJLIL = r0
            r5.LJLJJI = r2
            java.lang.Object r4 = r1.LJIIIZ(r4, r5)
            if (r4 != r3) goto L23
            return r3
        L47:
            X.4ck r5 = new X.4ck
            r5.<init>(r6, r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC113374cf.LJII(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.util.List<T> r15, X.InterfaceC67352kd<? super java.util.List<R>> r16) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC113374cf.LJIIIZ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List r9, X.InterfaceC67352kd r10, X.InterfaceC88471Ynr r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C113404ci
            if (r0 == 0) goto L6d
            r7 = r10
            X.4ci r7 = (X.C113404ci) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r6 = r7.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r4 = 0
            java.lang.String r3 = "Loader"
            r2 = 1
            if (r0 == 0) goto L4a
            if (r0 != r2) goto L73
            java.lang.Object r9 = r7.LJLIL
            X.C141335gf.LIZJ(r6)
        L25:
            java.util.List r6 = (java.util.List) r6
        L27:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "finish collating list size: "
            r1.append(r0)
            if (r6 == 0) goto L3b
            int r0 = r6.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r0)
        L3b:
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C34B.LJI(r3, r0)
            if (r6 != 0) goto L48
        L47:
            return r9
        L48:
            r9 = r6
            goto L47
        L4a:
            java.lang.String r0 = "Start collating list size: "
            java.lang.StringBuilder r1 = X.C43881HKb.LIZIZ(r6, r0)
            int r0 = r9.size()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C34B.LJI(r3, r0)
            if (r11 == 0) goto L6b
            r7.LJLIL = r9
            r7.LJLJJI = r2
            java.lang.Object r6 = r11.invoke(r9, r7)
            if (r6 != r5) goto L25
            return r5
        L6b:
            r6 = r4
            goto L27
        L6d:
            X.4ci r7 = new X.4ci
            r7.<init>(r8, r10)
            goto L12
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC113374cf.LIZJ(java.util.List, X.2kd, X.Ynr):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0051 -> B:10:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List r9, X.InterfaceC67352kd r10, X.InterfaceC88471Ynr r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C113384cg
            if (r0 == 0) goto L74
            r5 = r10
            X.4cg r5 = (X.C113384cg) r5
            int r2 = r5.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LJLJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJJL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJL
            r4 = 1
            java.lang.String r2 = "Loader"
            if (r0 == 0) goto L54
            if (r0 != r4) goto L7a
            java.lang.Object r0 = r5.LJLJJI
            java.lang.Object r7 = r5.LJLJI
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r3 = r5.LJLILLLLZI
            java.util.Collection r3 = (java.util.Collection) r3
            X.Ynr r11 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L2e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L39
            r3.add(r0)
        L39:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r7.next()
            r5.LJLIL = r11
            r5.LJLILLLLZI = r3
            r5.LJLJI = r7
            r5.LJLJJI = r0
            r5.LJLJL = r4
            java.lang.Object r1 = r11.invoke(r0, r5)
            if (r1 != r6) goto L2e
            return r6
        L54:
            java.lang.String r0 = "Start filtering list size: "
            java.lang.StringBuilder r1 = X.C43881HKb.LIZIZ(r1, r0)
            int r0 = r9.size()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C34B.LJI(r2, r0)
            if (r11 == 0) goto L9a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r7 = r9.iterator()
            goto L39
        L74:
            X.4cg r5 = new X.4cg
            r5.<init>(r8, r10)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L82:
            r9 = r3
            java.util.List r9 = (java.util.List) r9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "finish filtering list size: "
            r1.<init>(r0)
            int r0 = r9.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C34B.LJI(r2, r0)
        L9a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC113374cf.LIZLLL(java.util.List, X.2kd, X.Ynr):java.lang.Object");
    }
}
