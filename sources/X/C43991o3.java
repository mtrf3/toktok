package X;

import Y.IDObjectS0S0101000;
import android.os.Trace;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43991o3 implements InterfaceC35841au {
    public final AbstractC24810yD LJLIL;
    public final InterfaceC24420xa<?> LJLILLLLZI;
    public final AtomicReference<Object> LJLJI;
    public final Object LJLJJI;
    public final HashSet<InterfaceC24390xX> LJLJJL;
    public final C35871ax LJLJJLL;
    public final C25700ze<C35991b9> LJLJL;
    public final HashSet<C35991b9> LJLJLJ;
    public final C25700ze<InterfaceC35921b2<?>> LJLJLLL;
    public final List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> LJLL;
    public final List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> LJLLI;
    public final C25700ze<C35991b9> LJLLILLLL;
    public C25690zd<C35991b9, C36441bs<Object>> LJLLJ;
    public boolean LJLLL;
    public C43991o3 LJLLLL;
    public int LJLLLLLL;
    public final C35931b3 LJLZ;
    public final MBA LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> LL;

    public C43991o3() {
        throw null;
    }

    @Override // X.InterfaceC24790yB
    public final void LIZJ() {
        this.LJLIL.LIZ(this);
    }

    @Override // X.InterfaceC35841au
    public final boolean LJFF() {
        boolean LJJLIIIJILLIZJL;
        synchronized (this.LJLJJI) {
            LJJIFFI();
            try {
                C25690zd<C35991b9, C36441bs<Object>> c25690zd = this.LJLLJ;
                this.LJLLJ = new C25690zd<>();
                try {
                    LJJLIIIJILLIZJL = this.LJLZ.LJJLIIIJILLIZJL(c25690zd);
                    if (!LJJLIIIJILLIZJL) {
                        LJJII();
                    }
                } catch (Exception e) {
                    this.LJLLJ = c25690zd;
                    throw e;
                }
            } finally {
            }
        }
        return LJJLIIIJILLIZJL;
    }

    @Override // X.InterfaceC35841au
    public final void LJII() {
        synchronized (this.LJLJJI) {
            try {
                LJJ(this.LJLL);
                LJJII();
            } catch (Throwable th) {
                try {
                    if (!this.LJLJJL.isEmpty()) {
                        new C35781ao(this.LJLJJL).LIZLLL();
                    }
                    throw th;
                } catch (Exception e) {
                    LJIJJ();
                    throw e;
                }
            }
        }
    }

    @Override // X.InterfaceC35841au
    public final void LJIIIIZZ() {
        C35991b9 c35991b9;
        synchronized (this.LJLJJI) {
            for (Object obj : this.LJLJJLL.LJLJI) {
                if ((obj instanceof C35991b9) && (c35991b9 = (C35991b9) obj) != null) {
                    c35991b9.invalidate();
                }
            }
        }
    }

    @Override // X.InterfaceC35841au
    public final void LJIIIZ() {
        synchronized (this.LJLJJI) {
            try {
                this.LJLZ.LJIJJLI.clear();
                if (!this.LJLJJL.isEmpty()) {
                    new C35781ao(this.LJLJJL).LIZLLL();
                }
            } catch (Throwable th) {
                try {
                    if (!this.LJLJJL.isEmpty()) {
                        new C35781ao(this.LJLJJL).LIZLLL();
                    }
                    throw th;
                } catch (Exception e) {
                    LJIJJ();
                    throw e;
                }
            }
        }
    }

    @Override // X.InterfaceC35841au
    public final void LJIIJ() {
        synchronized (this.LJLJJI) {
            try {
                if (!this.LJLLI.isEmpty()) {
                    LJJ(this.LJLLI);
                }
            } catch (Throwable th) {
                try {
                    if (!this.LJLJJL.isEmpty()) {
                        new C35781ao(this.LJLJJL).LIZLLL();
                    }
                    throw th;
                } catch (Exception e) {
                    LJIJJ();
                    throw e;
                }
            }
        }
    }

    @Override // X.InterfaceC35841au
    public final boolean LJIILLIIL() {
        return this.LJLZ.LJJIIJZLJL;
    }

    @Override // X.InterfaceC24790yB
    public final boolean LJIJ() {
        boolean z;
        synchronized (this.LJLJJI) {
            if (this.LJLLJ.LIZJ <= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public final void LJIJJ() {
        this.LJLJI.set(null);
        ((ArrayList) this.LJLL).clear();
        ((ArrayList) this.LJLLI).clear();
        this.LJLJJL.clear();
    }

    public final void LJJI() {
        C25700ze<InterfaceC35921b2<?>> c25700ze = this.LJLJLLL;
        int i = c25700ze.LIZLLL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = c25700ze.LIZ[i3];
            C36441bs<InterfaceC35921b2<?>> c36441bs = c25700ze.LIZJ[i4];
            o.LJI(c36441bs);
            int i5 = c36441bs.LJLIL;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = c36441bs.LJLILLLLZI[i7];
                o.LJII(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.LJLJL.LIZJ(obj))) {
                    if (i6 != i7) {
                        c36441bs.LJLILLLLZI[i6] = obj;
                    }
                    i6++;
                }
            }
            int i8 = c36441bs.LJLIL;
            for (int i9 = i6; i9 < i8; i9++) {
                c36441bs.LJLILLLLZI[i9] = null;
            }
            c36441bs.LJLIL = i6;
            if (i6 > 0) {
                if (i2 != i3) {
                    int[] iArr = c25700ze.LIZ;
                    int i10 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i10;
                }
                i2++;
            }
        }
        int i11 = c25700ze.LIZLLL;
        for (int i12 = i2; i12 < i11; i12++) {
            c25700ze.LIZIZ[c25700ze.LIZ[i12]] = null;
        }
        c25700ze.LIZLLL = i2;
        Iterator<C35991b9> it = this.LJLJLJ.iterator();
        o.LJIIIIZZ(it, "iterator()");
        while (it.hasNext()) {
            if (it.next().LJI == null) {
                it.remove();
            }
        }
    }

    public final void LJJIFFI() {
        AtomicReference<Object> atomicReference = this.LJLJI;
        Object obj = C24330xR.LIZ;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!o.LJ(andSet, obj)) {
                if (andSet instanceof java.util.Set) {
                    LJIJJLI(true, (java.util.Set) andSet);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (java.util.Set set : (java.util.Set[]) andSet) {
                        LJIJJLI(true, set);
                    }
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("corrupt pendingModifications drain: ");
                LIZ.append(this.LJLJI);
                C24780yA.LIZJ(X1D.LIZIZ(LIZ));
                throw null;
            }
            C24780yA.LIZJ("pending composition has not been applied");
            throw null;
        }
    }

    public final void LJJII() {
        Object andSet = this.LJLJI.getAndSet(null);
        if (!o.LJ(andSet, C24330xR.LIZ)) {
            if (andSet instanceof java.util.Set) {
                LJIJJLI(false, (java.util.Set) andSet);
                return;
            }
            if (andSet instanceof Object[]) {
                for (java.util.Set set : (java.util.Set[]) andSet) {
                    LJIJJLI(false, set);
                }
                return;
            }
            if (andSet == null) {
                C24780yA.LIZJ("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("corrupt pendingModifications drain: ");
            LIZ.append(this.LJLJI);
            C24780yA.LIZJ(X1D.LIZIZ(LIZ));
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0027, code lost:
    
        if ((true ^ r4.LJLJJL.isEmpty()) != false) goto L14;
     */
    @Override // X.InterfaceC24790yB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispose() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.LJLJJI
            monitor-enter(r3)
            boolean r0 = r4.LJZI     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L54
            r2 = 1
            r4.LJZI = r2     // Catch: java.lang.Throwable -> L5b
            X.1iJ r0 = X.C24460xe.LIZIZ     // Catch: java.lang.Throwable -> L5b
            r4.LL = r0     // Catch: java.lang.Throwable -> L5b
            X.1b3 r0 = r4.LJLZ     // Catch: java.lang.Throwable -> L5b
            java.util.List<X.Ynt<X.0xa<?>, X.0xp, X.0xT, X.UCe>> r0 = r0.LJJIJIL     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L17
            r4.LJJ(r0)     // Catch: java.lang.Throwable -> L5b
        L17:
            X.1ax r0 = r4.LJLJJLL     // Catch: java.lang.Throwable -> L5b
            int r0 = r0.LJLILLLLZI     // Catch: java.lang.Throwable -> L5b
            if (r0 <= 0) goto L1f
            r1 = 1
            goto L29
        L1f:
            r1 = 0
            java.util.HashSet<X.0xX> r0 = r4.LJLJJL     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5b
            r2 = r2 ^ r0
            if (r2 == 0) goto L4f
        L29:
            X.1ao r2 = new X.1ao     // Catch: java.lang.Throwable -> L5b
            java.util.HashSet<X.0xX> r0 = r4.LJLJJL     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L4c
            X.1ax r0 = r4.LJLJJLL     // Catch: java.lang.Throwable -> L5b
            X.0xp r1 = r0.LJIILJJIL()     // Catch: java.lang.Throwable -> L5b
            X.C24780yA.LJ(r1, r2)     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r0 = move-exception
            r1.LJFF()     // Catch: java.lang.Throwable -> L5b
            throw r0     // Catch: java.lang.Throwable -> L5b
        L41:
            r1.LJFF()     // Catch: java.lang.Throwable -> L5b
            X.0xa<?> r0 = r4.LJLILLLLZI     // Catch: java.lang.Throwable -> L5b
            r0.clear()     // Catch: java.lang.Throwable -> L5b
            r2.LJ()     // Catch: java.lang.Throwable -> L5b
        L4c:
            r2.LIZLLL()     // Catch: java.lang.Throwable -> L5b
        L4f:
            X.1b3 r0 = r4.LJLZ     // Catch: java.lang.Throwable -> L5b
            r0.LJJJJ()     // Catch: java.lang.Throwable -> L5b
        L54:
            monitor-exit(r3)
            X.0yD r0 = r4.LJLIL
            r0.LJIILL(r4)
            return
        L5b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43991o3.dispose():void");
    }

    @Override // X.InterfaceC24790yB
    public final boolean LIZIZ() {
        return this.LJZL;
    }

    @Override // X.InterfaceC24790yB
    public final boolean isDisposed() {
        return this.LJZI;
    }

    @Override // X.InterfaceC35841au
    public final void LIZLLL(IDqS176S0200000 iDqS176S0200000) {
        C35931b3 c35931b3 = this.LJLZ;
        c35931b3.getClass();
        if (!c35931b3.LJJIIJZLJL) {
            c35931b3.LJJIIJZLJL = true;
            try {
                iDqS176S0200000.invoke();
                return;
            } finally {
                c35931b3.LJJIIJZLJL = false;
            }
        }
        "Preparing a composition while composing is not supported".toString();
        C24780yA.LIZJ("Preparing a composition while composing is not supported");
        throw null;
    }

    @Override // X.InterfaceC35841au
    public final boolean LJ(C36441bs c36441bs) {
        IDObjectS0S0101000 iDObjectS0S0101000 = new IDObjectS0S0101000(c36441bs, 3);
        while (iDObjectS0S0101000.hasNext()) {
            Object next = iDObjectS0S0101000.next();
            if (this.LJLJL.LIZJ(next) || this.LJLJLLL.LIZJ(next)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC35841au
    public final void LJI(Object value) {
        C35991b9 LJJJJZI;
        o.LJIIIZ(value, "value");
        C35931b3 c35931b3 = this.LJLZ;
        if (c35931b3.LJJII > 0 || (LJJJJZI = c35931b3.LJJJJZI()) == null) {
            return;
        }
        LJJJJZI.LIZ |= 1;
        this.LJLJL.LIZ(value, LJJJJZI);
        boolean z = value instanceof InterfaceC35921b2;
        if (z) {
            this.LJLJLLL.LJFF(value);
            for (Object obj : ((InterfaceC35921b2) value).LIZLLL()) {
                if (obj == null) {
                    break;
                }
                this.LJLJLLL.LIZ(obj, value);
            }
        }
        if ((LJJJJZI.LIZ & 32) != 0) {
            return;
        }
        C25680zc c25680zc = LJJJJZI.LJFF;
        if (c25680zc == null) {
            c25680zc = new C25680zc();
            LJJJJZI.LJFF = c25680zc;
        }
        c25680zc.LIZ(value, LJJJJZI.LJ);
        if (!z) {
            return;
        }
        C25690zd<InterfaceC35921b2<?>, Object> c25690zd = LJJJJZI.LJI;
        if (c25690zd == null) {
            c25690zd = new C25690zd<>();
            LJJJJZI.LJI = c25690zd;
        }
        c25690zd.LIZJ(value, ((InterfaceC35921b2) value).LIZIZ());
    }

    @Override // X.InterfaceC35841au
    public final void LJIIJJI(List<OSZ<C24380xW, C24380xW>> list) {
        int size = ((ArrayList) list).size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (!o.LJ(((C24380xW) ((OSZ) ListProtector.get(list, i)).getFirst()).LIZJ, this)) {
                    break;
                } else {
                    i++;
                }
            } else {
                z = true;
                break;
            }
        }
        C24780yA.LJFF(z);
        try {
            C35931b3 c35931b3 = this.LJLZ;
            c35931b3.getClass();
            try {
                c35931b3.LJJJLL(list);
                c35931b3.LJJIZ();
            } catch (Throwable th) {
                c35931b3.LJJIJIL();
                throw th;
            }
        } finally {
        }
    }

    @Override // X.InterfaceC24790yB
    public final void LJIIL(boolean z) {
        this.LJZL = z;
    }

    @Override // X.InterfaceC35841au
    public final void LJIILIIL(C24340xS c24340xS) {
        C35781ao c35781ao = new C35781ao(this.LJLJJL);
        C24570xp LJIILJJIL = c24340xS.LIZ.LJIILJJIL();
        try {
            C24780yA.LJ(LJIILJJIL, c35781ao);
            LJIILJJIL.LJFF();
            c35781ao.LJ();
        } catch (Throwable th) {
            LJIILJJIL.LJFF();
            throw th;
        }
    }

    @Override // X.InterfaceC24790yB
    public final void LJIILJJIL(InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        if (!this.LJZI) {
            this.LL = interfaceC88471Ynr;
            this.LJLIL.LIZIZ(this, (C40431iJ) interfaceC88471Ynr);
        } else {
            "The composition is disposed".toString();
            throw new IllegalStateException("The composition is disposed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Set[]] */
    @Override // X.InterfaceC35841au
    public final void LJIILL(java.util.Set<? extends Object> values) {
        java.util.Set<? extends Object> set;
        o.LJIIIZ(values, "values");
        while (true) {
            Object obj = this.LJLJI.get();
            if (obj == null || o.LJ(obj, C24330xR.LIZ)) {
                set = values;
            } else if (obj instanceof java.util.Set) {
                set = new java.util.Set[]{obj, values};
            } else if (obj instanceof Object[]) {
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set = C61898ORa.LJJII(values, (Object[]) obj);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("corrupt pendingModifications: ");
                LIZ.append(this.LJLJI);
                String LIZIZ = X1D.LIZIZ(LIZ);
                LIZIZ.toString();
                throw new IllegalStateException(LIZIZ);
            }
            AtomicReference<Object> atomicReference = this.LJLJI;
            while (!atomicReference.compareAndSet(obj, set)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.LJLJJI) {
                    LJJII();
                }
                return;
            }
            return;
        }
    }

    @Override // X.InterfaceC35841au
    public final void LJIIZILJ(Object value) {
        o.LJIIIZ(value, "value");
        synchronized (this.LJLJJI) {
            LJJIIJZLJL(value);
            C25700ze<InterfaceC35921b2<?>> c25700ze = this.LJLJLLL;
            int LIZLLL = c25700ze.LIZLLL(value);
            if (LIZLLL >= 0) {
                C36441bs<InterfaceC35921b2<?>> LJI = c25700ze.LJI(LIZLLL);
                int i = LJI.LJLIL;
                for (int i2 = 0; i2 < i; i2++) {
                    LJJIIJZLJL(LJI.get(i2));
                }
            }
        }
    }

    @Override // X.InterfaceC35841au
    public final void LJIJI(C40431iJ c40431iJ) {
        try {
            synchronized (this.LJLJJI) {
                LJJIFFI();
                C25690zd<C35991b9, C36441bs<Object>> c25690zd = this.LJLLJ;
                this.LJLLJ = new C25690zd<>();
                try {
                    this.LJLZ.LJJJ(c25690zd, c40431iJ);
                } catch (Exception e) {
                    this.LJLLJ = c25690zd;
                    throw e;
                }
            }
        } finally {
        }
    }

    public final void LJJ(List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> list) {
        C24400xY c24400xY;
        boolean isEmpty;
        C35781ao c35781ao = new C35781ao(this.LJLJJL);
        try {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty()) {
                if (isEmpty) {
                    return;
                } else {
                    return;
                }
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                this.LJLILLLLZI.LJFF();
                C24570xp LJIILJJIL = this.LJLJJLL.LJIILJJIL();
                try {
                    InterfaceC24420xa<?> interfaceC24420xa = this.LJLILLLLZI;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((InterfaceC88473Ynt) arrayList.get(i)).invoke(interfaceC24420xa, LJIILJJIL, c35781ao);
                    }
                    arrayList.clear();
                    LJIILJJIL.LJFF();
                    this.LJLILLLLZI.LIZIZ();
                    Trace.endSection();
                    c35781ao.LJ();
                    c35781ao.LJFF();
                    if (this.LJLLL) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.LJLLL = false;
                            C25700ze<C35991b9> c25700ze = this.LJLJL;
                            int i2 = c25700ze.LIZLLL;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                int i5 = c25700ze.LIZ[i4];
                                C36441bs<C35991b9> c36441bs = c25700ze.LIZJ[i5];
                                o.LJI(c36441bs);
                                int i6 = c36441bs.LJLIL;
                                int i7 = 0;
                                for (int i8 = 0; i8 < i6; i8++) {
                                    Object obj = c36441bs.LJLILLLLZI[i8];
                                    o.LJII(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    C35991b9 c35991b9 = (C35991b9) obj;
                                    if (c35991b9.LIZIZ != null && (c24400xY = c35991b9.LIZJ) != null && c24400xY.LIZ()) {
                                        if (i7 != i8) {
                                            c36441bs.LJLILLLLZI[i7] = obj;
                                        }
                                        i7++;
                                    }
                                }
                                int i9 = c36441bs.LJLIL;
                                for (int i10 = i7; i10 < i9; i10++) {
                                    c36441bs.LJLILLLLZI[i10] = null;
                                }
                                c36441bs.LJLIL = i7;
                                if (i7 > 0) {
                                    if (i3 != i4) {
                                        int[] iArr = c25700ze.LIZ;
                                        int i11 = iArr[i3];
                                        iArr[i3] = i5;
                                        iArr[i4] = i11;
                                    }
                                    i3++;
                                }
                            }
                            int i12 = c25700ze.LIZLLL;
                            for (int i13 = i3; i13 < i12; i13++) {
                                c25700ze.LIZIZ[c25700ze.LIZ[i13]] = null;
                            }
                            c25700ze.LIZLLL = i3;
                            LJJI();
                            Trace.endSection();
                        } finally {
                        }
                    }
                    if (((ArrayList) this.LJLLI).isEmpty()) {
                        c35781ao.LIZLLL();
                    }
                } catch (Throwable th) {
                    LJIILJJIL.LJFF();
                    throw th;
                }
            } finally {
            }
        } finally {
            if (((ArrayList) this.LJLLI).isEmpty()) {
                c35781ao.LIZLLL();
            }
        }
    }

    public final void LJJIIJZLJL(Object obj) {
        EnumC24720y4 enumC24720y4;
        C25700ze<C35991b9> c25700ze = this.LJLJL;
        int LIZLLL = c25700ze.LIZLLL(obj);
        if (LIZLLL >= 0) {
            C36441bs<C35991b9> LJI = c25700ze.LJI(LIZLLL);
            int i = LJI.LJLIL;
            for (int i2 = 0; i2 < i; i2++) {
                C35991b9 c35991b9 = LJI.get(i2);
                C43991o3 c43991o3 = c35991b9.LIZIZ;
                if (c43991o3 == null || (enumC24720y4 = c43991o3.LJJIII(c35991b9, obj)) == null) {
                    enumC24720y4 = EnumC24720y4.IGNORED;
                }
                if (enumC24720y4 == EnumC24720y4.IMMINENT) {
                    this.LJLLILLLL.LIZ(obj, c35991b9);
                }
            }
        }
    }

    public C43991o3(AbstractC24810yD parent, AbstractC35801aq abstractC35801aq) {
        o.LJIIIZ(parent, "parent");
        this.LJLIL = parent;
        this.LJLILLLLZI = abstractC35801aq;
        this.LJLJI = new AtomicReference<>(null);
        this.LJLJJI = new Object();
        HashSet<InterfaceC24390xX> hashSet = new HashSet<>();
        this.LJLJJL = hashSet;
        C35871ax c35871ax = new C35871ax();
        this.LJLJJLL = c35871ax;
        this.LJLJL = new C25700ze<>();
        this.LJLJLJ = new HashSet<>();
        this.LJLJLLL = new C25700ze<>();
        ArrayList arrayList = new ArrayList();
        this.LJLL = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJLLI = arrayList2;
        this.LJLLILLLL = new C25700ze<>();
        this.LJLLJ = new C25690zd<>();
        C35931b3 c35931b3 = new C35931b3(abstractC35801aq, parent, c35871ax, hashSet, arrayList, arrayList2, this);
        parent.LJIIL(c35931b3);
        this.LJLZ = c35931b3;
        this.LJZ = null;
        this.LL = C24460xe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJLI(boolean z, java.util.Set set) {
        HashSet hashSet;
        C68322mC c68322mC = new C68322mC();
        for (Object obj : set) {
            if (obj instanceof C35991b9) {
                C35991b9 c35991b9 = (C35991b9) obj;
                C43991o3 c43991o3 = c35991b9.LIZIZ;
                if (c43991o3 != null && c43991o3.LJJIII(c35991b9, null) != null) {
                }
            } else {
                LJIL(this, z, c68322mC, obj);
                C25700ze<InterfaceC35921b2<?>> c25700ze = this.LJLJLLL;
                int LIZLLL = c25700ze.LIZLLL(obj);
                if (LIZLLL >= 0) {
                    C36441bs<InterfaceC35921b2<?>> LJI = c25700ze.LJI(LIZLLL);
                    int i = LJI.LJLIL;
                    for (int i2 = 0; i2 < i; i2++) {
                        LJIL(this, z, c68322mC, LJI.get(i2));
                    }
                }
            }
        }
        if (z && (!this.LJLJLJ.isEmpty())) {
            C25700ze<C35991b9> c25700ze2 = this.LJLJL;
            int i3 = c25700ze2.LIZLLL;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = c25700ze2.LIZ[i5];
                C36441bs<C35991b9> c36441bs = c25700ze2.LIZJ[i6];
                o.LJI(c36441bs);
                int i7 = c36441bs.LJLIL;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj2 = c36441bs.LJLILLLLZI[i9];
                    o.LJII(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (!this.LJLJLJ.contains(obj2) && ((hashSet = (HashSet) c68322mC.element) == null || !hashSet.contains(obj2))) {
                        if (i8 != i9) {
                            c36441bs.LJLILLLLZI[i8] = obj2;
                        }
                        i8++;
                    }
                }
                int i10 = c36441bs.LJLIL;
                for (int i11 = i8; i11 < i10; i11++) {
                    c36441bs.LJLILLLLZI[i11] = null;
                }
                c36441bs.LJLIL = i8;
                if (i8 > 0) {
                    if (i4 != i5) {
                        int[] iArr = c25700ze2.LIZ;
                        int i12 = iArr[i4];
                        iArr[i4] = i6;
                        iArr[i5] = i12;
                    }
                    i4++;
                }
            }
            int i13 = c25700ze2.LIZLLL;
            for (int i14 = i4; i14 < i13; i14++) {
                c25700ze2.LIZIZ[c25700ze2.LIZ[i14]] = null;
            }
            c25700ze2.LIZLLL = i4;
            LJJI();
            this.LJLJLJ.clear();
            return;
        }
        HashSet hashSet2 = (HashSet) c68322mC.element;
        if (hashSet2 != null) {
            C25700ze<C35991b9> c25700ze3 = this.LJLJL;
            int i15 = c25700ze3.LIZLLL;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = c25700ze3.LIZ[i17];
                C36441bs<C35991b9> c36441bs2 = c25700ze3.LIZJ[i18];
                o.LJI(c36441bs2);
                int i19 = c36441bs2.LJLIL;
                int i20 = 0;
                for (int i21 = 0; i21 < i19; i21++) {
                    Object obj3 = c36441bs2.LJLILLLLZI[i21];
                    o.LJII(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (!hashSet2.contains(obj3)) {
                        if (i20 != i21) {
                            c36441bs2.LJLILLLLZI[i20] = obj3;
                        }
                        i20++;
                    }
                }
                int i22 = c36441bs2.LJLIL;
                for (int i23 = i20; i23 < i22; i23++) {
                    c36441bs2.LJLILLLLZI[i23] = null;
                }
                c36441bs2.LJLIL = i20;
                if (i20 > 0) {
                    if (i16 != i17) {
                        int[] iArr2 = c25700ze3.LIZ;
                        int i24 = iArr2[i16];
                        iArr2[i16] = i18;
                        iArr2[i17] = i24;
                    }
                    i16++;
                }
            }
            int i25 = c25700ze3.LIZLLL;
            for (int i26 = i16; i26 < i25; i26++) {
                c25700ze3.LIZIZ[c25700ze3.LIZ[i26]] = null;
            }
            c25700ze3.LIZLLL = i16;
            LJJI();
        }
    }

    public final EnumC24720y4 LJJIII(C35991b9 scope, Object obj) {
        o.LJIIIZ(scope, "scope");
        int i = scope.LIZ;
        if ((i & 2) != 0) {
            scope.LIZ = i | 4;
        }
        C24400xY c24400xY = scope.LIZJ;
        if (c24400xY == null || !this.LJLJJLL.LJIILLIIL(c24400xY) || !c24400xY.LIZ()) {
            return EnumC24720y4.IGNORED;
        }
        if (!c24400xY.LIZ()) {
            return EnumC24720y4.IGNORED;
        }
        if (scope.LIZLLL != null) {
            return LJJIIJ(scope, c24400xY, obj);
        }
        return EnumC24720y4.IGNORED;
    }

    @Override // X.InterfaceC35841au
    public final <R> R LIZ(InterfaceC35841au interfaceC35841au, int i, InterfaceC65784Pro<? extends R> interfaceC65784Pro) {
        if (interfaceC35841au != null && !o.LJ(interfaceC35841au, this) && i >= 0) {
            this.LJLLLL = (C43991o3) interfaceC35841au;
            this.LJLLLLLL = i;
            try {
                return interfaceC65784Pro.invoke();
            } finally {
                this.LJLLLL = null;
                this.LJLLLLLL = 0;
            }
        }
        return interfaceC65784Pro.invoke();
    }

    public final EnumC24720y4 LJJIIJ(C35991b9 key, C24400xY c24400xY, Object obj) {
        synchronized (this.LJLJJI) {
            C43991o3 c43991o3 = this.LJLLLL;
            if (c43991o3 == null || !this.LJLJJLL.LJIIIIZZ(this.LJLLLLLL, c24400xY)) {
                c43991o3 = null;
                C35931b3 c35931b3 = this.LJLZ;
                if (c35931b3.LJJIIJZLJL && c35931b3.LJLILLLLZI(key, obj)) {
                    return EnumC24720y4.IMMINENT;
                }
                if (obj == null) {
                    this.LJLLJ.LIZJ(key, null);
                } else {
                    C25690zd<C35991b9, C36441bs<Object>> c25690zd = this.LJLLJ;
                    c25690zd.getClass();
                    o.LJIIIZ(key, "key");
                    if (c25690zd.LIZ(key) >= 0) {
                        C36441bs<Object> LIZIZ = c25690zd.LIZIZ(key);
                        if (LIZIZ != null) {
                            LIZIZ.add(obj);
                        }
                    } else {
                        C36441bs<Object> c36441bs = new C36441bs<>();
                        c36441bs.add(obj);
                        c25690zd.LIZJ(key, c36441bs);
                    }
                }
            }
            if (c43991o3 != null) {
                return c43991o3.LJJIIJ(key, c24400xY, obj);
            }
            this.LJLIL.LJIIIIZZ(this);
            if (this.LJLZ.LJJIIJZLJL) {
                return EnumC24720y4.DEFERRED;
            }
            return EnumC24720y4.SCHEDULED;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.HashSet, T] */
    public static final void LJIL(C43991o3 c43991o3, boolean z, C68322mC<HashSet<C35991b9>> c68322mC, Object obj) {
        EnumC24720y4 enumC24720y4;
        C25700ze<C35991b9> c25700ze = c43991o3.LJLJL;
        int LIZLLL = c25700ze.LIZLLL(obj);
        if (LIZLLL >= 0) {
            C36441bs<C35991b9> LJI = c25700ze.LJI(LIZLLL);
            int i = LJI.LJLIL;
            for (int i2 = 0; i2 < i; i2++) {
                C35991b9 c35991b9 = LJI.get(i2);
                if (!c43991o3.LJLLILLLL.LJ(obj, c35991b9)) {
                    C43991o3 c43991o32 = c35991b9.LIZIZ;
                    if (c43991o32 == null || (enumC24720y4 = c43991o32.LJJIII(c35991b9, obj)) == null) {
                        enumC24720y4 = EnumC24720y4.IGNORED;
                    }
                    if (enumC24720y4 != EnumC24720y4.IGNORED) {
                        if (c35991b9.LJI != null && !z) {
                            c43991o3.LJLJLJ.add(c35991b9);
                        } else {
                            HashSet<C35991b9> hashSet = c68322mC.element;
                            HashSet<C35991b9> hashSet2 = hashSet;
                            if (hashSet == null) {
                                ?? hashSet3 = new HashSet();
                                c68322mC.element = hashSet3;
                                hashSet2 = hashSet3;
                            }
                            hashSet2.add(c35991b9);
                        }
                    }
                }
            }
        }
    }
}
