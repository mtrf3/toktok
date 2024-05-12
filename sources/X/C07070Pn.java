package X;

import X.C0Q9;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07070Pn<T, V extends C0Q9> {
    public final C0QC<T, V> LIZ;
    public final T LIZIZ;
    public final C1JK<T, V> LIZJ;
    public final ParcelableSnapshotMutableState LIZLLL;
    public final ParcelableSnapshotMutableState LJ;
    public final C0Q8 LJFF;
    public final C41391jr<T> LJI;
    public final V LJII;
    public final V LJIIIIZZ;
    public final V LJIIIZ;
    public final V LJIIJ;

    public final T LIZJ() {
        return this.LIZJ.getValue();
    }

    public static final Object LIZ(C07070Pn c07070Pn, Object obj) {
        if (o.LJ(c07070Pn.LJIIIZ, c07070Pn.LJII) && o.LJ(c07070Pn.LJIIJ, c07070Pn.LJIIIIZZ)) {
            return obj;
        }
        V invoke = c07070Pn.LIZ.LIZ().invoke(obj);
        int LIZIZ = invoke.LIZIZ();
        int i = 0;
        boolean z = false;
        while (i < LIZIZ) {
            int i2 = i + 1;
            if (invoke.LIZ(i) < c07070Pn.LJIIIZ.LIZ(i) || invoke.LIZ(i) > c07070Pn.LJIIJ.LIZ(i)) {
                invoke.LJ(C78842Uww.LJIIJJI(invoke.LIZ(i), c07070Pn.LJIIIZ.LIZ(i), c07070Pn.LJIIJ.LIZ(i)), i);
                z = true;
            }
            i = i2;
        }
        if (!z) {
            return obj;
        }
        return c07070Pn.LIZ.LIZIZ().invoke(invoke);
    }

    public final Object LIZLLL(T t, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C0Q8 c0q8 = this.LJFF;
        C2BO c2bo = new C2BO(this, t, null);
        C0Q6 c0q6 = C0Q6.Default;
        c0q8.getClass();
        Object LJI = C48841JEv.LJI(new C2BU(c0q6, c0q8, c2bo, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public C07070Pn(T t, C0QC<T, V> typeConverter, T t2) {
        o.LJIIIZ(typeConverter, "typeConverter");
        this.LIZ = typeConverter;
        this.LIZIZ = t2;
        this.LIZJ = new C1JK<>(typeConverter, t, null, 60);
        this.LIZLLL = C78966Uyw.LJJJIL(Boolean.FALSE);
        this.LJ = C78966Uyw.LJJJIL(t);
        this.LJFF = new C0Q8();
        this.LJI = new C41391jr<>(t2, 3);
        V invoke = typeConverter.LIZ().invoke(t);
        int LIZIZ = invoke.LIZIZ();
        for (int i = 0; i < LIZIZ; i++) {
            invoke.LJ(Float.NEGATIVE_INFINITY, i);
        }
        this.LJII = invoke;
        V invoke2 = this.LIZ.LIZ().invoke(t);
        int LIZIZ2 = invoke2.LIZIZ();
        for (int i2 = 0; i2 < LIZIZ2; i2++) {
            invoke2.LJ(Float.POSITIVE_INFINITY, i2);
        }
        this.LJIIIIZZ = invoke2;
        this.LJIIIZ = invoke;
        this.LJIIJ = invoke2;
    }

    public static Object LIZIZ(C07070Pn c07070Pn, Object obj, C0Q2 c0q2, IDqS172S0200000 iDqS172S0200000, InterfaceC67352kd interfaceC67352kd, int i) {
        T t;
        C0Q2 animationSpec = c0q2;
        IDqS172S0200000 iDqS172S02000002 = iDqS172S0200000;
        if ((i & 2) != 0) {
            animationSpec = c07070Pn.LJI;
        }
        if ((i & 4) != 0) {
            t = c07070Pn.LIZ.LIZIZ().invoke(c07070Pn.LIZJ.LJLJI);
        } else {
            t = null;
        }
        if ((i & 8) != 0) {
            iDqS172S02000002 = null;
        }
        Object LIZJ = c07070Pn.LIZJ();
        C0QC<T, V> typeConverter = c07070Pn.LIZ;
        o.LJIIIZ(animationSpec, "animationSpec");
        o.LJIIIZ(typeConverter, "typeConverter");
        C1J8 c1j8 = new C1J8(animationSpec, typeConverter, LIZJ, obj, (C0Q9) typeConverter.LIZ().invoke(t));
        long j = c07070Pn.LIZJ.LJLJJI;
        C0Q8 c0q8 = c07070Pn.LJFF;
        C2BN c2bn = new C2BN(c07070Pn, t, c1j8, j, iDqS172S02000002, null);
        C0Q6 c0q6 = C0Q6.Default;
        c0q8.getClass();
        return C48841JEv.LJI(new C2BU(c0q6, c0q8, c2bn, null), interfaceC67352kd);
    }
}
