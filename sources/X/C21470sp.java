package X;

import Y.IDfS125S0100000;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C21470sp<T> {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final C0Q2<Float> LIZ;
    public final InterfaceC88472Yns<T, Boolean> LIZIZ;
    public final ParcelableSnapshotMutableState LIZJ;
    public final ParcelableSnapshotMutableState LIZLLL;
    public final ParcelableSnapshotMutableState LJ;
    public final ParcelableSnapshotMutableState LJFF;
    public final ParcelableSnapshotMutableState LJI;
    public final ParcelableSnapshotMutableState LJII;
    public final ParcelableSnapshotMutableState LJIIIIZZ;
    public final V1Z LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public final ParcelableSnapshotMutableState LJIIL;
    public final ParcelableSnapshotMutableState LJIILIIL;
    public final ParcelableSnapshotMutableState LJIILJJIL;
    public final C31831Mt LJIILL;

    public final java.util.Map<Float, T> LIZJ() {
        return (java.util.Map) this.LJIIIIZZ.getValue();
    }

    public final T LIZLLL() {
        return this.LIZJ.getValue();
    }

    public final T LJ() {
        float floatValue;
        float LJ;
        Float f = (Float) this.LJII.getValue();
        if (f != null) {
            LJ = f.floatValue();
        } else {
            float floatValue2 = ((Number) this.LJ.getValue()).floatValue();
            Float LJFF = UCI.LJFF(LIZLLL(), LIZJ());
            if (LJFF != null) {
                floatValue = LJFF.floatValue();
            } else {
                floatValue = ((Number) this.LJ.getValue()).floatValue();
            }
            LJ = UCI.LJ(floatValue2, floatValue, LIZJ().keySet(), (InterfaceC88471Ynr) this.LJIIL.getValue(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = LIZJ().get(Float.valueOf(LJ));
        if (t == null) {
            return LIZLLL();
        }
        return t;
    }

    public final float LJFF(float f) {
        float LJIIJJI = C78842Uww.LJIIJJI(((Number) this.LJI.getValue()).floatValue() + f, this.LJIIJ, this.LJIIJJI) - ((Number) this.LJI.getValue()).floatValue();
        if (Math.abs(LJIIJJI) > 0.0f) {
            this.LJIILL.LIZ.invoke(Float.valueOf(LJIIJJI));
        }
        return LJIIJJI;
    }

    public final void LJIIIIZZ(T t) {
        this.LIZJ.setValue(t);
    }

    public final Object LJI(final float f, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object collect = this.LJIIIZ.collect(new InterfaceC64672gJ<java.util.Map<Float, ? extends T>>(this) { // from class: X.1ZE
            public final /* synthetic */ C21470sp<T> LJLIL;

            {
                this.LJLIL = this;
            }

            @Override // X.InterfaceC64672gJ
            public final Object emit(Object obj, InterfaceC67352kd interfaceC67352kd2) {
                java.util.Map map = (java.util.Map) obj;
                Float LJFF = UCI.LJFF(this.LJLIL.LIZLLL(), map);
                o.LJI(LJFF);
                float floatValue = LJFF.floatValue();
                Object obj2 = map.get(new Float(UCI.LJ(((Number) this.LJLIL.LJ.getValue()).floatValue(), floatValue, map.keySet(), (InterfaceC88471Ynr) this.LJLIL.LJIIL.getValue(), f, ((Number) this.LJLIL.LJIILIIL.getValue()).floatValue())));
                if (obj2 != null && ((Boolean) this.LJLIL.LIZIZ.invoke(obj2)).booleanValue()) {
                    Object LIZIZ = C21470sp.LIZIZ(this.LJLIL, obj2, interfaceC67352kd2);
                    if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                        return LIZIZ;
                    }
                    return C76800UCe.LIZ;
                }
                C21470sp<T> c21470sp = this.LJLIL;
                Object LIZ = c21470sp.LIZ(floatValue, c21470sp.LIZ, interfaceC67352kd2);
                if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LIZ;
                }
                return C76800UCe.LIZ;
            }
        }, interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21470sp(T t, C0Q2<Float> animationSpec, InterfaceC88472Yns<? super T, Boolean> confirmStateChange) {
        o.LJIIIZ(animationSpec, "animationSpec");
        o.LJIIIZ(confirmStateChange, "confirmStateChange");
        this.LIZ = animationSpec;
        this.LIZIZ = confirmStateChange;
        this.LIZJ = C78966Uyw.LJJJIL(t);
        this.LIZLLL = C78966Uyw.LJJJIL(Boolean.FALSE);
        Float valueOf = Float.valueOf(0.0f);
        this.LJ = C78966Uyw.LJJJIL(valueOf);
        this.LJFF = C78966Uyw.LJJJIL(valueOf);
        this.LJI = C78966Uyw.LJJJIL(valueOf);
        this.LJII = C78966Uyw.LJJJIL(null);
        this.LJIIIIZZ = C78966Uyw.LJJJIL(C113554cx.LJJJLIIL());
        final C3C3 LJJJJZI = C78966Uyw.LJJJJZI(new IDqS420S0100000(this, 162));
        this.LJIIIZ = V1M.LJJJJLL(new InterfaceC65462ha<java.util.Map<Float, ? extends T>>() { // from class: X.1ZF
            @Override // X.InterfaceC65462ha
            public final Object collect(InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
                Object collect = LJJJJZI.collect(new IDfS125S0100000(interfaceC64672gJ, 43), interfaceC67352kd);
                if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return collect;
                }
                return C76800UCe.LIZ;
            }
        }, 1);
        this.LJIIJ = Float.NEGATIVE_INFINITY;
        this.LJIIJJI = Float.POSITIVE_INFINITY;
        this.LJIIL = C78966Uyw.LJJJIL(C525524l.LJLIL);
        this.LJIILIIL = C78966Uyw.LJJJIL(valueOf);
        this.LJIILJJIL = C78966Uyw.LJJJIL(null);
        this.LJIILL = new C31831Mt(new IDqS416S0100000(this, 282));
    }

    public static Object LIZIZ(C21470sp c21470sp, Object obj, InterfaceC67352kd interfaceC67352kd) {
        Object collect = c21470sp.LJIIIZ.collect(new C1ZG(obj, c21470sp, c21470sp.LIZ), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public final Object LIZ(float f, C0Q2<Float> c0q2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LIZ = this.LJIILL.LIZ(C0SF.Default, new C55432Fn(this, f, c0q2, null), interfaceC67352kd);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0218 A[Catch: all -> 0x021d, TryCatch #3 {all -> 0x021d, blocks: (B:26:0x004b, B:30:0x01fe, B:35:0x0218), top: B:25:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.Map<java.lang.Float, ? extends T> r13, java.util.Map<java.lang.Float, ? extends T> r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21470sp.LJII(java.util.Map, java.util.Map, X.2kd):java.lang.Object");
    }
}
