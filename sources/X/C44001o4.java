package X;

import kotlin.jvm.internal.IDqS4S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.1o4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44001o4<T> implements C0O9, InterfaceC35921b2<T> {
    public final InterfaceC65784Pro<T> LJLIL;
    public final InterfaceC24600xs<T> LJLILLLLZI;
    public C35881ay<T> LJLJI;

    @Override // X.C0O9
    public final /* synthetic */ C0OB LJIIIZ(C0OB c0ob, C0OB c0ob2, C0OB c0ob3) {
        return null;
    }

    @Override // X.InterfaceC35921b2
    public final T LIZIZ() {
        return (T) LIZJ((C35881ay) C0OF.LJI(this.LJLJI), C0OF.LJIIIIZZ(), false, this.LJLIL).LIZLLL;
    }

    @Override // X.InterfaceC35921b2
    public final Object[] LIZLLL() {
        Object[] objArr;
        C25690zd<C0O9, Integer> c25690zd = LIZJ((C35881ay) C0OF.LJI(this.LJLJI), C0OF.LJIIIIZZ(), false, this.LJLIL).LIZJ;
        if (c25690zd == null || (objArr = c25690zd.LIZ) == null) {
            return new Object[0];
        }
        return objArr;
    }

    public final String toString() {
        String str;
        C0OF.LJI(this.LJLJI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DerivedState(value=");
        C35881ay c35881ay = (C35881ay) C0OF.LJI(this.LJLJI);
        C0OA LJIIIIZZ = C0OF.LJIIIIZZ();
        if (c35881ay.LIZLLL != C35881ay.LJFF && c35881ay.LJ == c35881ay.LIZJ(this, LJIIIIZZ)) {
            str = String.valueOf(c35881ay.LIZLLL);
        } else {
            str = "<Not calculated>";
        }
        LIZ.append(str);
        LIZ.append(")@");
        LIZ.append(hashCode());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC24760y8
    public final T getValue() {
        InterfaceC88472Yns<Object, C76800UCe> LJFF = C0OF.LJIIIIZZ().LJFF();
        if (LJFF != null) {
            LJFF.invoke(this);
        }
        return (T) LIZJ((C35881ay) C0OF.LJI(this.LJLJI), C0OF.LJIIIIZZ(), true, this.LJLIL).LIZLLL;
    }

    @Override // X.InterfaceC35921b2
    public final InterfaceC24600xs<T> LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C0O9
    public final C0OB LJII() {
        return this.LJLJI;
    }

    public C44001o4(InterfaceC65784Pro calculation) {
        o.LJIIIZ(calculation, "calculation");
        this.LJLIL = calculation;
        this.LJLILLLLZI = null;
        this.LJLJI = new C35881ay<>();
    }

    @Override // X.C0O9
    public final void LJIIIIZZ(C0OB c0ob) {
        this.LJLJI = (C35881ay) c0ob;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C35881ay<T> LIZJ(C35881ay<T> c35881ay, C0OA c0oa, boolean z, InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        int i;
        InterfaceC24600xs<T> interfaceC24600xs;
        int i2;
        int i3 = 0;
        if (c35881ay.LIZLLL != C35881ay.LJFF && c35881ay.LJ == c35881ay.LIZJ(this, c0oa)) {
            if (z) {
                C25710zf c25710zf = (C25710zf) C24630xv.LIZIZ.LIZ();
                if (c25710zf == null) {
                    c25710zf = new C25710zf(new OSZ[0]);
                }
                int i4 = c25710zf.LJLJI;
                if (i4 > 0) {
                    T[] tArr = c25710zf.LJLIL;
                    o.LJII(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i5 = 0;
                    do {
                        ((InterfaceC88472Yns) tArr[i5].getFirst()).invoke(this);
                        i5++;
                    } while (i5 < i4);
                }
                try {
                    C25690zd<C0O9, Integer> c25690zd = c35881ay.LIZJ;
                    Integer num = (Integer) C24630xv.LIZ.LIZ();
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    if (c25690zd != null) {
                        int i6 = c25690zd.LIZJ;
                        for (int i7 = 0; i7 < i6; i7++) {
                            Object obj = c25690zd.LIZ[i7];
                            o.LJII(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            C0O9 c0o9 = (C0O9) obj;
                            C24630xv.LIZ.LIZIZ(Integer.valueOf(((Number) c25690zd.LIZIZ[i7]).intValue() + i2));
                            InterfaceC88472Yns<Object, C76800UCe> LJFF = c0oa.LJFF();
                            if (LJFF != null) {
                                LJFF.invoke(c0o9);
                            }
                        }
                    }
                    C24630xv.LIZ.LIZIZ(Integer.valueOf(i2));
                    int i8 = c25710zf.LJLJI;
                    if (i8 > 0) {
                        T[] tArr2 = c25710zf.LJLIL;
                        o.LJII(tArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            ((InterfaceC88472Yns) tArr2[i3].getSecond()).invoke(this);
                            i3++;
                        } while (i3 < i8);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c35881ay;
        }
        Integer num2 = (Integer) C24630xv.LIZ.LIZ();
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        C25690zd<C0O9, Integer> c25690zd2 = new C25690zd<>();
        C25710zf c25710zf2 = (C25710zf) C24630xv.LIZIZ.LIZ();
        if (c25710zf2 == null) {
            c25710zf2 = new C25710zf(new OSZ[0]);
        }
        int i9 = c25710zf2.LJLJI;
        if (i9 > 0) {
            T[] tArr3 = c25710zf2.LJLIL;
            o.LJII(tArr3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i10 = 0;
            do {
                ((InterfaceC88472Yns) tArr3[i10].getFirst()).invoke(this);
                i10++;
            } while (i10 < i9);
        }
        try {
            C24730y5 c24730y5 = C24630xv.LIZ;
            c24730y5.LIZIZ(Integer.valueOf(i + 1));
            Object LIZIZ = C0O8.LIZIZ(interfaceC65784Pro, new IDqS4S0201000(this, c25690zd2, (C25690zd<C0O9, Integer>) i, 3));
            c24730y5.LIZIZ(Integer.valueOf(i));
            int i11 = c25710zf2.LJLJI;
            if (i11 > 0) {
                T[] tArr4 = c25710zf2.LJLIL;
                o.LJII(tArr4, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i12 = 0;
                do {
                    ((InterfaceC88472Yns) tArr4[i12].getSecond()).invoke(this);
                    i12++;
                } while (i12 < i11);
            }
            synchronized (C0OF.LIZJ) {
                C0OA LJIIIIZZ = C0OF.LJIIIIZZ();
                Object obj2 = c35881ay.LIZLLL;
                if (obj2 != C35881ay.LJFF && (interfaceC24600xs = this.LJLILLLLZI) != 0 && interfaceC24600xs.LIZIZ(LIZIZ, obj2)) {
                    c35881ay.LIZJ = c25690zd2;
                    c35881ay.LJ = c35881ay.LIZJ(this, LJIIIIZZ);
                } else {
                    c35881ay = (C35881ay) C0OF.LJIIJJI(this.LJLJI, this, LJIIIIZZ);
                    c35881ay.LIZJ = c25690zd2;
                    c35881ay.LJ = c35881ay.LIZJ(this, LJIIIIZZ);
                    c35881ay.LIZLLL = LIZIZ;
                }
            }
            if (i == 0) {
                C0OF.LJIIIIZZ().LJIIJJI();
            }
            return c35881ay;
        } finally {
            int i13 = c25710zf2.LJLJI;
            if (i13 > 0) {
                T[] tArr5 = c25710zf2.LJLIL;
                o.LJII(tArr5, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((InterfaceC88472Yns) tArr5[i3].getSecond()).invoke(this);
                    i3++;
                } while (i3 < i13);
            }
        }
    }
}
