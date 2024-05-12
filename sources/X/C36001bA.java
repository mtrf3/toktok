package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1bA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36001bA extends AbstractC24810yD {
    public static final XLM LJIJ;
    public static final AtomicReference<Boolean> LJIJI;
    public final C26Y LIZ;
    public final C84673XKz LIZIZ;
    public final MBA LIZJ;
    public final Object LIZLLL;
    public InterfaceC79150V4o LJ;
    public Throwable LJFF;
    public final List<InterfaceC35841au> LJI;
    public final List<java.util.Set<Object>> LJII;
    public final List<InterfaceC35841au> LJIIIIZZ;
    public final List<InterfaceC35841au> LJIIIZ;
    public final List<C24380xW> LJIIJ;
    public final java.util.Map<C24320xQ<Object>, List<C24380xW>> LJIIJJI;
    public final java.util.Map<C24380xW, C24340xS> LJIIL;
    public List<InterfaceC35841au> LJIILIIL;
    public XJL<? super C76800UCe> LJIILJJIL;
    public C24690y1 LJIILL;
    public final XLM LJIILLIIL;
    public final C24700y2 LJIIZILJ;

    @Override // X.AbstractC24810yD
    public final boolean LJ() {
        return false;
    }

    @Override // X.AbstractC24810yD
    public final int LJI() {
        return 1000;
    }

    @Override // X.AbstractC24810yD
    public final void LJIIJJI(java.util.Set<Object> set) {
    }

    static {
        new Object() { // from class: X.0y0
        };
        LJIJ = V8H.LIZ(C535928l.LJLJJI);
        LJIJI = new AtomicReference<>(Boolean.FALSE);
    }

    public final void LJIL() {
        if (!this.LJII.isEmpty()) {
            ArrayList arrayList = (ArrayList) this.LJII;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                java.util.Set<? extends Object> set = (java.util.Set) ListProtector.get(arrayList, i);
                ArrayList arrayList2 = (ArrayList) this.LJI;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((InterfaceC35841au) ListProtector.get(arrayList2, i2)).LJIILL(set);
                }
            }
            ((ArrayList) this.LJII).clear();
            if (LJJIFFI() == null) {
                return;
            }
            "called outside of runRecomposeAndApplyChanges".toString();
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
        }
    }

    public final void LJJI() {
        synchronized (this.LIZLLL) {
            if (((EnumC24710y3) this.LJIILLIIL.getValue()).compareTo(EnumC24710y3.Idle) >= 0) {
                this.LJIILLIIL.setValue(EnumC24710y3.ShuttingDown);
            }
        }
        this.LIZIZ.LIZIZ(null);
    }

    public final XJL<C76800UCe> LJJIFFI() {
        EnumC24710y3 enumC24710y3;
        if (((EnumC24710y3) this.LJIILLIIL.getValue()).compareTo(EnumC24710y3.ShuttingDown) <= 0) {
            ((ArrayList) this.LJI).clear();
            ((ArrayList) this.LJII).clear();
            ((ArrayList) this.LJIIIIZZ).clear();
            ((ArrayList) this.LJIIIZ).clear();
            ((ArrayList) this.LJIIJ).clear();
            this.LJIILIIL = null;
            XJL<? super C76800UCe> xjl = this.LJIILJJIL;
            if (xjl != null) {
                xjl.LJJIJIL(null);
            }
            this.LJIILJJIL = null;
            this.LJIILL = null;
            return null;
        }
        if (this.LJIILL != null) {
            enumC24710y3 = EnumC24710y3.Inactive;
        } else if (this.LJ == null) {
            ((ArrayList) this.LJII).clear();
            ((ArrayList) this.LJIIIIZZ).clear();
            if (this.LIZ.LJII()) {
                enumC24710y3 = EnumC24710y3.InactivePendingWork;
            } else {
                enumC24710y3 = EnumC24710y3.Inactive;
            }
        } else if ((!((ArrayList) this.LJIIIIZZ).isEmpty()) || (!((ArrayList) this.LJII).isEmpty()) || (!((ArrayList) this.LJIIIZ).isEmpty()) || (!((ArrayList) this.LJIIJ).isEmpty()) || this.LIZ.LJII()) {
            enumC24710y3 = EnumC24710y3.PendingWork;
        } else {
            enumC24710y3 = EnumC24710y3.Idle;
        }
        this.LJIILLIIL.setValue(enumC24710y3);
        if (enumC24710y3 != EnumC24710y3.PendingWork) {
            return null;
        }
        XJL xjl2 = this.LJIILJJIL;
        this.LJIILJJIL = null;
        return xjl2;
    }

    public final boolean LJJII() {
        boolean z;
        synchronized (this.LIZLLL) {
            z = true;
            if (!(!this.LJII.isEmpty()) && !(!this.LJIIIIZZ.isEmpty())) {
                if (!this.LIZ.LJII()) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // X.AbstractC24810yD
    public final MBA LJII() {
        return this.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0y2] */
    public C36001bA(MBA effectCoroutineContext) {
        o.LJIIIZ(effectCoroutineContext, "effectCoroutineContext");
        C26Y c26y = new C26Y(new IDqS420S0100000(this, 174));
        this.LIZ = c26y;
        C84673XKz c84673XKz = new C84673XKz((InterfaceC79150V4o) effectCoroutineContext.get(InterfaceC79150V4o.LJJJJJ));
        c84673XKz.LJJIII(new IDqS416S0100000(this, 310));
        this.LIZIZ = c84673XKz;
        this.LIZJ = effectCoroutineContext.plus(c26y).plus(c84673XKz);
        this.LIZLLL = new Object();
        this.LJI = new ArrayList();
        this.LJII = new ArrayList();
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = new ArrayList();
        this.LJIIJJI = new LinkedHashMap();
        this.LJIIL = new LinkedHashMap();
        this.LJIILLIIL = V8H.LIZ(EnumC24710y3.Inactive);
        this.LJIIZILJ = new Object() { // from class: X.0y2
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIZILJ(C36001bA c36001bA) {
        int i;
        C61878OQg c61878OQg;
        synchronized (c36001bA.LIZLLL) {
            if (!c36001bA.LJIIJJI.isEmpty()) {
                List LJJLI = C32I.LJJLI(((LinkedHashMap) c36001bA.LJIIJJI).values());
                ((LinkedHashMap) c36001bA.LJIIJJI).clear();
                ArrayList arrayList = (ArrayList) LJJLI;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C24380xW c24380xW = (C24380xW) arrayList.get(i2);
                    arrayList2.add(new OSZ(c24380xW, ((LinkedHashMap) c36001bA.LJIIL).get(c24380xW)));
                }
                ((LinkedHashMap) c36001bA.LJIIL).clear();
                c61878OQg = arrayList2;
            } else {
                c61878OQg = C61878OQg.INSTANCE;
            }
        }
        int size2 = c61878OQg.size();
        for (i = 0; i < size2; i++) {
            OSZ osz = (OSZ) ListProtector.get(c61878OQg, i);
            C24380xW c24380xW2 = (C24380xW) osz.getFirst();
            C24340xS c24340xS = (C24340xS) osz.getSecond();
            if (c24340xS != null) {
                c24380xW2.LIZJ.LJIILIIL(c24340xS);
            }
        }
    }

    public static final void LJIJ(C36001bA c36001bA) {
        synchronized (c36001bA.LIZLLL) {
        }
    }

    public static final void LJIJJ(C36001bA c36001bA) {
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (!SettingsManager.LIZ("recomposer_fix_crash", true)) {
            c36001bA.LJIL();
            return;
        }
        try {
            c36001bA.LJIL();
        } catch (IndexOutOfBoundsException e) {
            PEH.LIZJ(e);
        }
    }

    public static void LJJ(C1IE c1ie) {
        try {
            if (!(c1ie.LJIJI() instanceof C1IN)) {
                return;
            }
            "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString();
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
        } finally {
            c1ie.LIZJ();
        }
    }

    @Override // X.AbstractC24810yD
    public final void LIZ(InterfaceC35841au composition) {
        o.LJIIIZ(composition, "composition");
        boolean LJIILLIIL = composition.LJIILLIIL();
        try {
            composition.LJII();
            composition.LJIIJ();
            if (!LJIILLIIL) {
                C0OF.LJIIIIZZ().LJIIJJI();
            }
        } catch (Exception e) {
            LJJIIZI(this, e, false, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC24810yD
    public final void LIZJ(C24380xW c24380xW) {
        synchronized (this.LIZLLL) {
            java.util.Map<C24320xQ<Object>, List<C24380xW>> map = this.LJIIJJI;
            C24320xQ<Object> c24320xQ = c24380xW.LIZ;
            o.LJIIIZ(map, "<this>");
            Object obj = ((LinkedHashMap) map).get(c24320xQ);
            if (obj == null) {
                obj = new ArrayList();
                map.put(c24320xQ, obj);
            }
            ((List) obj).add(c24380xW);
        }
    }

    @Override // X.AbstractC24810yD
    public final void LJIIIIZZ(InterfaceC35841au composition) {
        XJL<C76800UCe> xjl;
        o.LJIIIZ(composition, "composition");
        synchronized (this.LIZLLL) {
            if (!((ArrayList) this.LJIIIIZZ).contains(composition)) {
                ((ArrayList) this.LJIIIIZZ).add(composition);
                xjl = LJJIFFI();
            } else {
                xjl = null;
            }
        }
        if (xjl != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            xjl.resumeWith(c76800UCe);
        }
    }

    @Override // X.AbstractC24810yD
    public final C24340xS LJIIJ(C24380xW reference) {
        C24340xS remove;
        o.LJIIIZ(reference, "reference");
        synchronized (this.LIZLLL) {
            remove = this.LJIIL.remove(reference);
        }
        return remove;
    }

    @Override // X.AbstractC24810yD
    public final void LJIILL(InterfaceC35841au composition) {
        o.LJIIIZ(composition, "composition");
        synchronized (this.LIZLLL) {
            this.LJI.remove(composition);
            this.LJIIIIZZ.remove(composition);
            this.LJIIIZ.remove(composition);
        }
    }

    public final void LJJIII(InterfaceC35841au interfaceC35841au) {
        synchronized (this.LIZLLL) {
            ArrayList arrayList = (ArrayList) this.LJIIJ;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (o.LJ(((C24380xW) arrayList.get(i)).LIZJ, interfaceC35841au)) {
                    ArrayList arrayList2 = new ArrayList();
                    LJJIIJ(arrayList2, this, interfaceC35841au);
                    while (!arrayList2.isEmpty()) {
                        LJJIIJZLJL(arrayList2, null);
                        LJJIIJ(arrayList2, this, interfaceC35841au);
                    }
                    return;
                }
            }
        }
    }

    public static final Object LJIILLIIL(C36001bA c36001bA, C2GY c2gy) {
        if (!c36001bA.LJJII()) {
            XKS xks = new XKS(1, C78555UsJ.LJJII(c2gy));
            xks.LJIIL();
            synchronized (c36001bA.LIZLLL) {
                if (c36001bA.LJJII()) {
                    C76800UCe c76800UCe = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(c76800UCe);
                    xks.resumeWith(c76800UCe);
                } else {
                    c36001bA.LJIILJJIL = xks;
                }
            }
            Object LJIIJJI = xks.LJIIJJI();
            if (LJIIJJI != EnumC58928NAu.COROUTINE_SUSPENDED) {
                return C76800UCe.LIZ;
            }
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    public static final void LJIJJLI(C36001bA c36001bA, InterfaceC79150V4o interfaceC79150V4o) {
        synchronized (c36001bA.LIZLLL) {
            Throwable th = c36001bA.LJFF;
            if (th == null) {
                if (((EnumC24710y3) c36001bA.LJIILLIIL.getValue()).compareTo(EnumC24710y3.ShuttingDown) > 0) {
                    if (c36001bA.LJ == null) {
                        c36001bA.LJ = interfaceC79150V4o;
                        c36001bA.LJJIFFI();
                    } else {
                        "Recomposer already running".toString();
                        throw new IllegalStateException("Recomposer already running");
                    }
                } else {
                    "Recomposer shut down".toString();
                    throw new IllegalStateException("Recomposer shut down");
                }
            } else {
                throw th;
            }
        }
    }

    @Override // X.AbstractC24810yD
    public final void LIZIZ(InterfaceC35841au composition, C40431iJ c40431iJ) {
        o.LJIIIZ(composition, "composition");
        boolean LJIILLIIL = composition.LJIILLIIL();
        try {
            C1IE LJ = C0O8.LJ(new IDqS416S0100000(composition, 312), new IDqS172S0200000(composition, (InterfaceC35841au) null, (C36441bs<Object>) 85));
            try {
                C0OA LJIIIIZZ = LJ.LJIIIIZZ();
                try {
                    composition.LJIJI(c40431iJ);
                    if (!LJIILLIIL) {
                        C0OF.LJIIIIZZ().LJIIJJI();
                    }
                    synchronized (this.LIZLLL) {
                        if (((EnumC24710y3) this.LJIILLIIL.getValue()).compareTo(EnumC24710y3.ShuttingDown) > 0 && !((ArrayList) this.LJI).contains(composition)) {
                            ((ArrayList) this.LJI).add(composition);
                        }
                    }
                    try {
                        LJJIII(composition);
                        if (!composition.LIZIZ()) {
                            LIZ(composition);
                        }
                    } catch (Exception e) {
                        LJJIIZ(e, composition, true);
                    }
                } finally {
                    C0OA.LJIILJJIL(LJIIIIZZ);
                }
            } finally {
                LJJ(LJ);
            }
        } catch (Exception e2) {
            LJJIIZ(e2, composition, true);
        }
    }

    @Override // X.AbstractC24810yD
    public final void LJIIIZ(C24380xW reference, C24340xS c24340xS) {
        o.LJIIIZ(reference, "reference");
        synchronized (this.LIZLLL) {
            this.LJIIL.put(reference, c24340xS);
        }
    }

    public final List<InterfaceC35841au> LJJIIJZLJL(List<C24380xW> list, C36441bs<Object> c36441bs) {
        ArrayList arrayList;
        Object obj;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = ListProtector.get(list, i);
            InterfaceC35841au interfaceC35841au = ((C24380xW) obj2).LIZJ;
            Object obj3 = hashMap.get(interfaceC35841au);
            if (obj3 == null) {
                obj3 = new ArrayList();
                hashMap.put(interfaceC35841au, obj3);
            }
            ((ArrayList) obj3).add(obj2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            InterfaceC35841au interfaceC35841au2 = (InterfaceC35841au) entry.getKey();
            List list2 = (List) entry.getValue();
            C24780yA.LJFF(!interfaceC35841au2.LJIILLIIL());
            interfaceC35841au2.toString();
            C1IE LJ = C0O8.LJ(new IDqS416S0100000(interfaceC35841au2, 312), new IDqS172S0200000(interfaceC35841au2, (InterfaceC35841au) c36441bs, (C36441bs<Object>) 85));
            try {
                C0OA LJIIIIZZ = LJ.LJIIIIZZ();
                try {
                    synchronized (this.LIZLLL) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            C24380xW c24380xW = (C24380xW) list2.get(i2);
                            java.util.Map<C24320xQ<Object>, List<C24380xW>> map = this.LJIIJJI;
                            C24320xQ<Object> c24320xQ = c24380xW.LIZ;
                            o.LJIIIZ(map, "<this>");
                            List list3 = (List) ((LinkedHashMap) map).get(c24320xQ);
                            if (list3 != null) {
                                obj = ORS.LJJLJ(list3);
                                if (list3.isEmpty()) {
                                    map.remove(c24320xQ);
                                }
                            } else {
                                obj = null;
                            }
                            arrayList.add(new OSZ(c24380xW, obj));
                        }
                    }
                    interfaceC35841au2.LJIIJJI(arrayList);
                } finally {
                    C0OA.LJIILJJIL(LJIIIIZZ);
                }
            } finally {
                LJJ(LJ);
            }
        }
        return ORZ.LLJI(hashMap.keySet());
    }

    public static final InterfaceC35841au LJIJI(C36001bA c36001bA, InterfaceC35841au interfaceC35841au, C36441bs c36441bs) {
        if (interfaceC35841au.LJIILLIIL() || interfaceC35841au.isDisposed()) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("test-> test-> composing func for composition:");
        LIZ.append(interfaceC35841au);
        LIZ.append(" modifiedValues size:");
        LIZ.append(Integer.valueOf(c36441bs.LJLIL));
        LIZ.append(" modifiedValues:");
        LIZ.append(c36441bs.LJLILLLLZI);
        X1D.LIZIZ(LIZ);
        C1IE LJ = C0O8.LJ(new IDqS416S0100000(interfaceC35841au, 312), new IDqS172S0200000(interfaceC35841au, (InterfaceC35841au) c36441bs, (C36441bs<Object>) 85));
        try {
            C0OA LJIIIIZZ = LJ.LJIIIIZZ();
            try {
                if (c36441bs.LJLIL > 0) {
                    interfaceC35841au.LIZLLL(new IDqS176S0200000(interfaceC35841au, c36441bs, 50));
                }
                if (!interfaceC35841au.LJFF()) {
                    interfaceC35841au = null;
                }
                return interfaceC35841au;
            } finally {
                C0OA.LJIILJJIL(LJIIIIZZ);
            }
        } finally {
            LJJ(LJ);
        }
    }

    public static final void LJJIIJ(List<C24380xW> list, C36001bA c36001bA, InterfaceC35841au interfaceC35841au) {
        ArrayList arrayList = (ArrayList) list;
        arrayList.clear();
        synchronized (c36001bA.LIZLLL) {
            Iterator it = ((ArrayList) c36001bA.LJIIJ).iterator();
            while (it.hasNext()) {
                C24380xW c24380xW = (C24380xW) it.next();
                if (o.LJ(c24380xW.LIZJ, interfaceC35841au)) {
                    arrayList.add(c24380xW);
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0y1] */
    public final void LJJIIZ(final Exception exc, InterfaceC35841au interfaceC35841au, boolean z) {
        Boolean bool = LJIJI.get();
        o.LJIIIIZZ(bool, "_hotReloadEnabled.get()");
        if (bool.booleanValue()) {
            if (!(exc instanceof C24480xg)) {
                synchronized (this.LIZLLL) {
                    ((ArrayList) this.LJIIIZ).clear();
                    ((ArrayList) this.LJIIIIZZ).clear();
                    ((ArrayList) this.LJII).clear();
                    ((ArrayList) this.LJIIJ).clear();
                    ((LinkedHashMap) this.LJIIJJI).clear();
                    ((LinkedHashMap) this.LJIIL).clear();
                    this.LJIILL = new Object(exc) { // from class: X.0y1
                    };
                    if (interfaceC35841au != null) {
                        List list = this.LJIILIIL;
                        if (list == null) {
                            list = new ArrayList();
                            this.LJIILIIL = list;
                        }
                        if (!list.contains(interfaceC35841au)) {
                            list.add(interfaceC35841au);
                        }
                        ((ArrayList) this.LJI).remove(interfaceC35841au);
                    }
                    LJJIFFI();
                }
                return;
            }
            throw exc;
        }
        throw exc;
    }

    public static /* synthetic */ void LJJIIZI(C36001bA c36001bA, Exception exc, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        c36001bA.LJJIIZ(exc, null, z);
    }
}
