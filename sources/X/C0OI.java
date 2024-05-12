package X;

import java.util.HashMap;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0OI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OI {
    public final InterfaceC88472Yns<Object, C76800UCe> LIZ;
    public Object LIZIZ;
    public C25680zc LIZJ;
    public int LIZLLL;
    public final C25700ze<Object> LJ;
    public final C25690zd<Object, C25680zc> LJFF;
    public final C36441bs<Object> LJI;
    public final IDqS416S0100000 LJII;
    public final IDqS416S0100000 LJIIIIZZ;
    public int LJIIIZ;
    public final C25700ze<InterfaceC35921b2<?>> LJIIJ;
    public final HashMap<InterfaceC35921b2<?>, Object> LJIIJJI;

    public C0OI(InterfaceC88472Yns<Object, C76800UCe> onChanged) {
        o.LJIIIZ(onChanged, "onChanged");
        this.LIZ = onChanged;
        this.LIZLLL = -1;
        this.LJ = new C25700ze<>();
        this.LJFF = new C25690zd<>();
        this.LJI = new C36441bs<>();
        this.LJII = new IDqS416S0100000(this, 123);
        this.LJIIIIZZ = new IDqS416S0100000(this, 124);
        this.LJIIJ = new C25700ze<>();
        this.LJIIJJI = new HashMap<>();
    }

    public final boolean LIZIZ(java.util.Set<? extends Object> changes) {
        C25700ze<InterfaceC35921b2<?>> c25700ze;
        int LIZLLL;
        C25700ze<Object> c25700ze2;
        int LIZLLL2;
        o.LJIIIZ(changes, "changes");
        boolean z = false;
        for (Object obj : changes) {
            if (this.LJIIJ.LIZJ(obj) && (LIZLLL = (c25700ze = this.LJIIJ).LIZLLL(obj)) >= 0) {
                C36441bs<InterfaceC35921b2<?>> LJI = c25700ze.LJI(LIZLLL);
                int i = LJI.LJLIL;
                for (int i2 = 0; i2 < i; i2++) {
                    InterfaceC35921b2<?> interfaceC35921b2 = LJI.get(i2);
                    Object obj2 = this.LJIIJJI.get(interfaceC35921b2);
                    InterfaceC24600xs<?> LIZ = interfaceC35921b2.LIZ();
                    if (LIZ == null) {
                        LIZ = C36041bE.LIZ;
                    }
                    if (!LIZ.LIZIZ(interfaceC35921b2.LIZIZ(), obj2) && (LIZLLL2 = (c25700ze2 = this.LJ).LIZLLL(interfaceC35921b2)) >= 0) {
                        C36441bs<Object> LJI2 = c25700ze2.LJI(LIZLLL2);
                        int i3 = LJI2.LJLIL;
                        int i4 = 0;
                        while (i4 < i3) {
                            this.LJI.add(LJI2.get(i4));
                            i4++;
                            z = true;
                        }
                    }
                }
            }
            C25700ze<Object> c25700ze3 = this.LJ;
            int LIZLLL3 = c25700ze3.LIZLLL(obj);
            if (LIZLLL3 >= 0) {
                C36441bs<Object> LJI3 = c25700ze3.LJI(LIZLLL3);
                int i5 = LJI3.LJLIL;
                int i6 = 0;
                while (i6 < i5) {
                    this.LJI.add(LJI3.get(i6));
                    i6++;
                    z = true;
                }
            }
        }
        return z;
    }

    public final void LIZJ(Object value) {
        o.LJIIIZ(value, "value");
        if (this.LJIIIZ > 0) {
            return;
        }
        Object obj = this.LIZIZ;
        o.LJI(obj);
        C25680zc c25680zc = this.LIZJ;
        if (c25680zc == null) {
            c25680zc = new C25680zc();
            this.LIZJ = c25680zc;
            this.LJFF.LIZJ(obj, c25680zc);
        }
        int LIZ = c25680zc.LIZ(value, this.LIZLLL);
        if ((value instanceof InterfaceC35921b2) && LIZ != this.LIZLLL) {
            InterfaceC35921b2 interfaceC35921b2 = (InterfaceC35921b2) value;
            for (Object obj2 : interfaceC35921b2.LIZLLL()) {
                if (obj2 == null) {
                    break;
                }
                this.LJIIJ.LIZ(obj2, value);
            }
            this.LJIIJJI.put(value, interfaceC35921b2.LIZIZ());
        }
        if (LIZ == -1) {
            this.LJ.LIZ(value, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(C45741qs c45741qs) {
        C25690zd<Object, C25680zc> c25690zd = this.LJFF;
        int i = c25690zd.LIZJ;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = c25690zd.LIZ[i3];
            o.LJII(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            C25680zc c25680zc = (C25680zc) c25690zd.LIZIZ[i3];
            Boolean bool = (Boolean) c45741qs.invoke(obj);
            if (bool.booleanValue()) {
                int i4 = c25680zc.LIZ;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj2 = c25680zc.LIZIZ[i5];
                    o.LJII(obj2, "null cannot be cast to non-null type kotlin.Any");
                    this.LJ.LJ(obj2, obj);
                    if ((obj2 instanceof InterfaceC35921b2) && !this.LJ.LIZJ(obj2)) {
                        this.LJIIJ.LJFF(obj2);
                        this.LJIIJJI.remove(obj2);
                    }
                }
            }
            if (!bool.booleanValue()) {
                if (i2 != i3) {
                    c25690zd.LIZ[i2] = obj;
                    Object[] objArr = c25690zd.LIZIZ;
                    objArr[i2] = objArr[i3];
                }
                i2++;
            }
        }
        int i6 = c25690zd.LIZJ;
        if (i6 > i2) {
            for (int i7 = i2; i7 < i6; i7++) {
                c25690zd.LIZ[i7] = null;
                c25690zd.LIZIZ[i7] = null;
            }
            c25690zd.LIZJ = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(C0OI c0oi, Object obj) {
        C25680zc c25680zc = c0oi.LIZJ;
        if (c25680zc != null) {
            int i = c25680zc.LIZ;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = c25680zc.LIZIZ[i3];
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Any");
                int i4 = c25680zc.LIZJ[i3];
                if (i4 != c0oi.LIZLLL) {
                    c0oi.LJ.LJ(obj2, obj);
                    if ((obj2 instanceof InterfaceC35921b2) && !c0oi.LJ.LIZJ(obj2)) {
                        c0oi.LJIIJ.LJFF(obj2);
                        c0oi.LJIIJJI.remove(obj2);
                    }
                } else {
                    if (i2 != i3) {
                        c25680zc.LIZIZ[i2] = obj2;
                        c25680zc.LIZJ[i2] = i4;
                    }
                    i2++;
                }
            }
            int i5 = c25680zc.LIZ;
            for (int i6 = i2; i6 < i5; i6++) {
                c25680zc.LIZIZ[i6] = null;
            }
            c25680zc.LIZ = i2;
        }
    }
}
