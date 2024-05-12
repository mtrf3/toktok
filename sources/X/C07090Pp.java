package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Pp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07090Pp {
    public static final <T, V extends C0Q9> void LIZJ(C0Q1<T, V> c0q1, C1JK<T, V> state) {
        o.LJIIIZ(c0q1, "<this>");
        o.LJIIIZ(state, "state");
        state.LJLILLLLZI.setValue(c0q1.LIZ());
        V v = state.LJLJI;
        V source = c0q1.LJFF;
        o.LJIIIZ(v, "<this>");
        o.LJIIIZ(source, "source");
        int LIZIZ = v.LIZIZ();
        for (int i = 0; i < LIZIZ; i++) {
            v.LJ(source.LIZ(i), i);
        }
        state.LJLJJI = c0q1.LJI;
        state.LJLJJL = ((Boolean) c0q1.LJII.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4 A[Catch: CancellationException -> 0x00f9, TryCatch #4 {CancellationException -> 0x00f9, blocks: (B:15:0x00ac, B:17:0x00af, B:19:0x00c4, B:21:0x00e3, B:27:0x00e8), top: B:14:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, X.0Q1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends X.C0Q9> java.lang.Object LIZ(X.C1JK<T, V> r18, X.InterfaceC07130Pt<T, V> r19, long r20, X.InterfaceC88472Yns<? super X.C0Q1<T, V>, X.C76800UCe> r22, X.InterfaceC67352kd<? super X.C76800UCe> r23) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07090Pp.LIZ(X.1JK, X.0Pt, long, X.Yns, X.2kd):java.lang.Object");
    }

    public static final <T, V extends C0Q9> void LIZIZ(C0Q1<T, V> c0q1, long j, InterfaceC07130Pt<T, V> interfaceC07130Pt, C1JK<T, V> c1jk, InterfaceC88472Yns<? super C0Q1<T, V>, C76800UCe> interfaceC88472Yns) {
        c0q1.LJI = j;
        long j2 = j - c0q1.LIZJ;
        c0q1.LJ.setValue(interfaceC07130Pt.LJ(j2));
        V LJI = interfaceC07130Pt.LJI(j2);
        o.LJIIIZ(LJI, "<set-?>");
        c0q1.LJFF = LJI;
        if (interfaceC07130Pt.LIZJ(j2)) {
            c0q1.getClass();
            c0q1.LJII.setValue(Boolean.FALSE);
        }
        LIZJ(c0q1, c1jk);
        interfaceC88472Yns.invoke(c0q1);
    }
}
