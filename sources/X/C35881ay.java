package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35881ay<T> extends C0OB {
    public static final Object LJFF = new Object();
    public C25690zd<C0O9, Integer> LIZJ;
    public Object LIZLLL = LJFF;
    public int LJ;

    @Override // X.C0OB
    public final C0OB LIZIZ() {
        return new C35881ay();
    }

    @Override // X.C0OB
    public final void LIZ(C0OB value) {
        o.LJIIIZ(value, "value");
        C35881ay c35881ay = (C35881ay) value;
        this.LIZJ = c35881ay.LIZJ;
        this.LIZLLL = c35881ay.LIZLLL;
        this.LJ = c35881ay.LJ;
    }

    public final int LIZJ(InterfaceC35921b2<?> derivedState, C0OA c0oa) {
        C25690zd<C0O9, Integer> c25690zd;
        C0OB LJII;
        o.LJIIIZ(derivedState, "derivedState");
        synchronized (C0OF.LIZJ) {
            c25690zd = this.LIZJ;
        }
        int i = 7;
        if (c25690zd != null) {
            C25710zf c25710zf = (C25710zf) C24630xv.LIZIZ.LIZ();
            int i2 = 0;
            if (c25710zf == null) {
                c25710zf = new C25710zf(new OSZ[0]);
            }
            int i3 = c25710zf.LJLJI;
            if (i3 > 0) {
                T[] tArr = c25710zf.LJLIL;
                o.LJII(tArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i4 = 0;
                do {
                    ((InterfaceC88472Yns) tArr[i4].getFirst()).invoke(derivedState);
                    i4++;
                } while (i4 < i3);
            }
            try {
                int i5 = c25690zd.LIZJ;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object obj = c25690zd.LIZ[i6];
                    o.LJII(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    C0O9 c0o9 = (C0O9) obj;
                    if (((Number) c25690zd.LIZIZ[i6]).intValue() == 1) {
                        if (c0o9 instanceof C44001o4) {
                            C44001o4 c44001o4 = (C44001o4) c0o9;
                            LJII = c44001o4.LIZJ((C35881ay) C0OF.LJII(c44001o4.LJLJI, c0oa), c0oa, false, c44001o4.LJLIL);
                        } else {
                            LJII = C0OF.LJII(c0o9.LJII(), c0oa);
                        }
                        i = (((i * 31) + System.identityHashCode(LJII)) * 31) + LJII.LIZ;
                    }
                }
                int i7 = c25710zf.LJLJI;
                if (i7 > 0) {
                    T[] tArr2 = c25710zf.LJLIL;
                    o.LJII(tArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        ((InterfaceC88472Yns) tArr2[i2].getSecond()).invoke(derivedState);
                        i2++;
                    } while (i2 < i7);
                }
            } catch (Throwable th) {
                int i8 = c25710zf.LJLJI;
                if (i8 > 0) {
                    T[] tArr3 = c25710zf.LJLIL;
                    o.LJII(tArr3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        ((InterfaceC88472Yns) tArr3[i2].getSecond()).invoke(derivedState);
                        i2++;
                    } while (i2 < i8);
                }
                throw th;
            }
        }
        return i;
    }
}
