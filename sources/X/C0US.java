package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0US, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0US {
    public static final C1N3 LIZ = new C0UU() { // from class: X.1N3
        @Override // X.C0UU
        public final float LIZ(long j) {
            return C10370av.LIZLLL(j);
        }

        @Override // X.C0UU
        public final float LIZJ(long j) {
            return C10370av.LJ(j);
        }

        @Override // X.C0UU
        public final long LIZIZ(float f, float f2) {
            return C78923UyF.LIZ(f, f2);
        }
    };
    public static final C1N4 LIZIZ = new C0UU() { // from class: X.1N4
        @Override // X.C0UU
        public final float LIZ(long j) {
            return C10370av.LJ(j);
        }

        @Override // X.C0UU
        public final float LIZJ(long j) {
            return C10370av.LIZLLL(j);
        }

        @Override // X.C0UU
        public final long LIZIZ(float f, float f2) {
            return C78923UyF.LIZ(f2, f);
        }
    };
    public static final float LIZJ = ((float) 0.125d) / 18;

    public static final boolean LJ(C11H c11h, long j) {
        Object obj;
        List<C11P> list = c11h.LIZ;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                obj = ListProtector.get(list, i);
                if (C11O.LIZ(((C11P) obj).LIZ, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        C11P c11p = (C11P) obj;
        if (c11p != null && c11p.LIZLLL) {
            z = true;
        }
        return true ^ z;
    }

    public static final float LJFF(InterfaceC015404g pointerSlop, int i) {
        o.LJIIIZ(pointerSlop, "$this$pointerSlop");
        if (i == 2) {
            return pointerSlop.LIZLLL() * LIZJ;
        }
        return pointerSlop.LIZLLL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        if ((!X.C10370av.LIZIZ(com.google.android.play.core.appupdate.u.LJJIJLIJ(r8, true), X.C10370av.LIZIZ)) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ac -> B:10:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.InterfaceC37471dX r14, long r15, X.InterfaceC67352kd<? super X.C11P> r17) {
        /*
            r3 = r17
            boolean r0 = r3 instanceof X.C49641xA
            if (r0 == 0) goto Laf
            r7 = r3
            X.1xA r7 = (X.C49641xA) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laf
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L14:
            java.lang.Object r11 = r7.LJLJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r13 = 0
            r5 = 1
            if (r0 == 0) goto L87
            if (r0 != r5) goto Lb6
            X.2sW r4 = r7.LJLILLLLZI
            X.1dX r14 = r7.LJLIL
            X.C141335gf.LIZJ(r11)
        L27:
            X.11H r11 = (X.C11H) r11
            java.util.List<X.11P> r12 = r11.LIZ
            int r10 = r12.size()
            r9 = 0
        L30:
            if (r9 >= r10) goto L85
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r12, r9)
            r0 = r8
            X.11P r0 = (X.C11P) r0
            long r2 = r0.LIZ
            long r0 = r4.element
            boolean r0 = X.C11O.LIZ(r2, r0)
            if (r0 == 0) goto L82
        L43:
            X.11P r8 = (X.C11P) r8
            if (r8 != 0) goto L48
        L47:
            return r13
        L48:
            boolean r0 = com.google.android.play.core.appupdate.u.LIZIZ(r8)
            if (r0 == 0) goto L73
            java.util.List<X.11P> r9 = r11.LIZ
            int r3 = r9.size()
            r2 = 0
        L55:
            if (r2 >= r3) goto L71
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r2)
            r0 = r1
            X.11P r0 = (X.C11P) r0
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L6e
        L62:
            X.11P r1 = (X.C11P) r1
            if (r1 != 0) goto L9e
        L66:
            boolean r0 = r8.LIZIZ()
            if (r0 != 0) goto L47
            r13 = r8
            goto L47
        L6e:
            int r2 = r2 + 1
            goto L55
        L71:
            r1 = r13
            goto L62
        L73:
            long r2 = com.google.android.play.core.appupdate.u.LJJIJLIJ(r8, r5)
            long r0 = X.C10370av.LIZIZ
            boolean r0 = X.C10370av.LIZIZ(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto La2
            goto L66
        L82:
            int r9 = r9 + 1
            goto L30
        L85:
            r8 = r13
            goto L43
        L87:
            X.C141335gf.LIZJ(r11)
            X.11H r2 = r14.LJJJ()
            r0 = r15
            boolean r2 = LJ(r2, r0)
            if (r2 == 0) goto L96
            return r13
        L96:
            X.2sW r4 = new X.2sW
            r4.<init>()
            r4.element = r0
            goto La2
        L9e:
            long r0 = r1.LIZ
            r4.element = r0
        La2:
            r7.LJLIL = r14
            r7.LJLILLLLZI = r4
            r7.LJLJJI = r5
            java.lang.Object r11 = X.SC5.LIZ(r14, r7)
            if (r11 != r6) goto L27
            return r6
        Laf:
            X.1xA r7 = new X.1xA
            r7.<init>(r3)
            goto L14
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0US.LIZ(X.1dX, long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, X.11P] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(X.InterfaceC37471dX r10, long r11, X.InterfaceC67352kd<? super X.C11P> r13) {
        /*
            boolean r0 = r13 instanceof X.C49651xB
            if (r0 == 0) goto L23
            r8 = r13
            X.1xB r8 = (X.C49651xB) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r1 = r8.LJLJI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJI
            r9 = 1
            r6 = 0
            if (r0 == 0) goto L37
            if (r0 != r9) goto L2f
            X.2mC r4 = r8.LJLILLLLZI
            X.11P r0 = r8.LJLIL
            goto L29
        L23:
            X.1xB r8 = new X.1xB
            r8.<init>(r13)
            goto L12
        L29:
            X.C141335gf.LIZJ(r1)     // Catch: X.C11J -> L2d
            goto L96
        L2d:
            r6 = r0
            goto L92
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C141335gf.LIZJ(r1)
            X.11H r0 = r10.LJJJ()
            boolean r0 = LJ(r0, r11)
            if (r0 == 0) goto L45
            return r6
        L45:
            X.11H r0 = r10.LJJJ()
            java.util.List<X.11P> r4 = r0.LIZ
            int r3 = r4.size()
            r2 = 0
        L50:
            if (r2 >= r3) goto L69
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            r0 = r5
            X.11P r0 = (X.C11P) r0
            long r0 = r0.LIZ
            boolean r0 = X.C11O.LIZ(r0, r11)
            if (r0 == 0) goto L66
        L61:
            X.11P r5 = (X.C11P) r5
            if (r5 != 0) goto L6b
            return r6
        L66:
            int r2 = r2 + 1
            goto L50
        L69:
            r5 = r6
            goto L61
        L6b:
            X.2mC r4 = new X.2mC
            r4.<init>()
            X.2mC r3 = new X.2mC
            r3.<init>()
            r3.element = r5
            X.04g r0 = r10.getViewConfiguration()
            long r1 = r0.LIZIZ()
            X.2DB r0 = new X.2DB     // Catch: X.C11J -> L91
            r0.<init>(r3, r4, r6)     // Catch: X.C11J -> L91
            r8.LJLIL = r5     // Catch: X.C11J -> L91
            r8.LJLILLLLZI = r4     // Catch: X.C11J -> L91
            r8.LJLJJI = r9     // Catch: X.C11J -> L91
            java.lang.Object r0 = r10.LJJLIIJ(r1, r0, r8)     // Catch: X.C11J -> L91
            if (r0 != r7) goto L96
            return r7
        L91:
            r6 = r5
        L92:
            T r0 = r4.element
            if (r0 != 0) goto L97
        L96:
            return r6
        L97:
            r6 = r0
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0US.LIZIZ(X.1dX, long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0047 -> B:10:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.InterfaceC37471dX r5, long r6, X.InterfaceC88472Yns<? super X.C11P, X.C76800UCe> r8, X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            boolean r0 = r9 instanceof X.C49661xC
            if (r0 == 0) goto L4a
            r4 = r9
            X.1xC r4 = (X.C49661xC) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L50
            X.Yns r8 = r4.LJLILLLLZI
            X.1dX r5 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L24:
            X.11P r3 = (X.C11P) r3
            if (r3 != 0) goto L2b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L2b:
            boolean r0 = com.google.android.play.core.appupdate.u.LIZIZ(r3)
            if (r0 == 0) goto L38
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L34:
            X.C141335gf.LIZJ(r3)
            goto L3d
        L38:
            r8.invoke(r3)
            long r6 = r3.LIZ
        L3d:
            r4.LJLIL = r5
            r4.LJLILLLLZI = r8
            r4.LJLJJI = r1
            java.lang.Object r3 = LIZ(r5, r6, r4)
            if (r3 != r2) goto L24
            return r2
        L4a:
            X.1xC r4 = new X.1xC
            r4.<init>(r9)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0US.LIZJ(X.1dX, long, X.Yns, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
    
        if (X.C10370av.LIZLLL(com.google.android.play.core.appupdate.u.LJJIJLIJ(r10, true)) == 0.0f) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d0 -> B:10:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZLLL(X.InterfaceC37471dX r16, long r17, kotlin.jvm.internal.IDqS0S0210000 r19, X.InterfaceC67352kd r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0US.LIZLLL(X.1dX, long, kotlin.jvm.internal.IDqS0S0210000, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
    
        if (X.C10370av.LJ(com.google.android.play.core.appupdate.u.LJJIJLIJ(r10, true)) == 0.0f) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d0 -> B:10:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJI(X.InterfaceC37471dX r16, long r17, kotlin.jvm.internal.IDqS0S0210000 r19, X.InterfaceC67352kd r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0US.LJI(X.1dX, long, kotlin.jvm.internal.IDqS0S0210000, X.2kd):java.lang.Object");
    }
}
