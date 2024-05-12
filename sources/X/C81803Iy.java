package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS151S0100000_1;
import org.greenrobot.eventbus.EventBus;
import ujb.o;

/* renamed from: X.3Iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81803Iy implements C3JJ {
    public static final C62822Ol8 LLD = C221108m2.LIZIZ(C3JK.LJLIL);
    public final C3JQ LJLIL;
    public final C82283Ku LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final java.util.Map<C81983Jq, C3J9> LJLJJLL;
    public final List<InterfaceC787037a> LJLJL;
    public final List<C3J7> LJLJLJ;
    public final List<C3JD> LJLJLLL;
    public final List<C3JJ> LJLL;
    public final List<C3JJ> LJLLI;
    public final java.util.Map<C81983Jq, C3JL> LJLLILLLL;
    public final java.util.Map<C81983Jq, C3JL> LJLLJ;
    public InterfaceC79150V4o LJLLL;
    public final java.util.Map<String, java.util.Map<Class<?>, InterfaceC81703Io>> LJLLLL;
    public InterfaceC79150V4o LJLLLLLL;
    public final java.util.Map<String, C3JI> LJLZ;
    public final C62822Ol8 LJZ;
    public volatile boolean LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;

    public C81803Iy() {
        C3JQ c3jq = new C3JQ();
        C82283Ku c82283Ku = new C82283Ku();
        C39G c39g = new C39G();
        C39O c39o = new C39O();
        this.LJLIL = c3jq;
        this.LJLILLLLZI = c82283Ku;
        this.LJLJI = C221108m2.LIZIZ(C3KM.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(C81883Jg.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(C3JN.LJLIL);
        this.LJLJJLL = new ConcurrentHashMap();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LJLJL = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.LJLJLJ = copyOnWriteArrayList2;
        this.LJLJLLL = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.LJLL = copyOnWriteArrayList3;
        this.LJLLI = new CopyOnWriteArrayList();
        this.LJLLILLLL = new ConcurrentHashMap();
        this.LJLLJ = new ConcurrentHashMap();
        this.LJLLLL = new LinkedHashMap();
        this.LJLZ = new LinkedHashMap();
        this.LJZ = C221108m2.LIZIZ(C3JM.LJLIL);
        this.LJZL = C221108m2.LIZIZ(C37155Ei7.LJLIL);
        this.LL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 977));
        copyOnWriteArrayList.add(c3jq);
        copyOnWriteArrayList.add(c82283Ku);
        copyOnWriteArrayList2.add(c39g);
        copyOnWriteArrayList2.add(c39o);
        copyOnWriteArrayList3.add(c3jq);
        copyOnWriteArrayList3.add(c39g);
        copyOnWriteArrayList3.add(c82283Ku);
        copyOnWriteArrayList3.add(c39o);
        Iterator it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            C3J7 c3j7 = (C3J7) it.next();
            c3j7.LJFF(new C81733Ir(this));
            c3j7.LIZIZ(new C81753It(this));
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LJLJL).iterator();
        while (it2.hasNext()) {
            InterfaceC787037a interfaceC787037a = (InterfaceC787037a) it2.next();
            interfaceC787037a.LJFF(new C3J5(this));
            interfaceC787037a.LJIILJJIL(new C3J6(this));
        }
    }

    public final void LIZ() {
        C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", "doAtFinishWorking");
        Iterator it = ((CopyOnWriteArrayList) this.LJLL).iterator();
        while (it.hasNext()) {
            ((C3JJ) it.next()).LJIIJ();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LJLLI).iterator();
        while (it2.hasNext()) {
            ((C3JJ) it2.next()).LJIIJ();
        }
        EventBus.LIZJ().LJIJ(this);
        C3K3.LIZ().LJIIJ();
        Iterator it3 = ((ConcurrentHashMap) this.LJLJJLL).keySet().iterator();
        while (it3.hasNext()) {
            LJFF(new C3J9(0), (C81983Jq) it3.next());
        }
        LJIIJJI(new C3J2(this, null));
    }

    public final void LJII() {
        C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", "hire");
        Iterator it = ((CopyOnWriteArrayList) this.LJLL).iterator();
        while (it.hasNext()) {
            ((C3JJ) it.next()).LJIIL();
        }
        C3K3.LIZ().LJIIL();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    public final void LJIIIZ() {
        C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", "startWorking");
        Iterator it = ((CopyOnWriteArrayList) this.LJLL).iterator();
        while (it.hasNext()) {
            ((C3JJ) it.next()).LIZLLL();
        }
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
        LJIIJJI(new C81773Iv(this, null));
    }

    @Override // X.C3JJ
    public final void LIZLLL() {
        if (C3TX.LIZ()) {
            LJIIIZ();
        } else {
            LJIIJJI(new C37U(this, null));
        }
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        if (C3TX.LIZ()) {
            LIZ();
        } else {
            LJIIJJI(new C37T(this, null));
        }
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        if (C3TX.LIZ()) {
            LJII();
            return;
        }
        C81843Jc.LJ().LIZJ("first serial");
        C81843Jc.LJ().LIZJ("session data mediator hire");
        LJIIJJI(new C3J4(this, null));
    }

    public static C81833Jb LIZIZ(C81983Jq c81983Jq) {
        if (c81983Jq != null) {
            return C81843Jc.LIZLLL(c81983Jq);
        }
        return C81843Jc.LJ();
    }

    public final <T extends C3L4> T LIZJ(String str) {
        C3L4 c3l4;
        if (str != null) {
            try {
                if (!o.LJJJJJL(str)) {
                    Iterator it = ((ConcurrentHashMap) this.LJLJJLL).values().iterator();
                    while (it.hasNext()) {
                        Iterator<C3L4> it2 = ((C3J9) it.next()).LIZ().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                c3l4 = it2.next();
                                if (kotlin.jvm.internal.o.LJ(str, c3l4.LJFF())) {
                                    break;
                                }
                            } else {
                                c3l4 = null;
                                break;
                            }
                        }
                        T t = (T) c3l4;
                        if (t != null) {
                            return t;
                        }
                    }
                    C3Q9.LIZ.getClass();
                    C75782yE.LIZ();
                    C4WC c4wc = C4WC.LIZIZ;
                    C63120Opw LIZ = c4wc.LIZ(str);
                    if (LIZ == null) {
                        C75782yE.LIZ();
                        LIZ = c4wc.LJII(str);
                        if (LIZ == null) {
                            return null;
                        }
                    }
                    C3L5 LIZIZ = C82473Ln.LIZIZ(LIZ, null, false, 14);
                    if (!(LIZIZ instanceof C3L4)) {
                        return null;
                    }
                    return LIZIZ;
                }
            } catch (Exception e) {
                C34B.LJ("SessionRefactor-SessionDataMediator", e);
                return null;
            }
        }
        return null;
    }

    public final XKQ LJIIJJI(InterfaceC88471Ynr interfaceC88471Ynr) {
        return XKX.LIZLLL(C48841JEv.LIZ((MBA) this.LL.getValue()), null, null, interfaceC88471Ynr, 3);
    }

    public final void LJIILJJIL(C81983Jq c81983Jq) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopObserveSessionSource: ");
        LIZ.append(c81983Jq);
        C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ));
        ((ConcurrentHashMap) this.LJLLILLLL).remove(c81983Jq);
        ((ConcurrentHashMap) this.LJLJJLL).remove(c81983Jq);
        Iterator it = ((CopyOnWriteArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            ((InterfaceC787037a) it.next()).LJIIIZ(c81983Jq);
        }
    }

    @QD3
    public final void updateU16Settings(C3K2 c3k2) {
        LJIIJJI(new C3J1(this, null));
    }

    public final void LJ(String str, InterfaceC81703Io interfaceC81703Io) {
        if (!this.LJLLLL.containsKey(str)) {
            this.LJLLLL.put(str, new ConcurrentHashMap());
        }
        java.util.Map map = (java.util.Map) ((LinkedHashMap) this.LJLLLL).get(str);
        if (map != null) {
            map.put(interfaceC81703Io.getClass(), interfaceC81703Io);
        }
        InterfaceC79150V4o interfaceC79150V4o = this.LJLLL;
        if (interfaceC79150V4o == null) {
            interfaceC79150V4o = LJIIJJI(new C3J0(this, null));
        }
        this.LJLLL = interfaceC79150V4o;
    }

    public final void LJFF(C3J9 c3j9, C81983Jq c81983Jq) {
        ((ConcurrentHashMap) this.LJLJJLL).put(c81983Jq, c3j9);
        if (!c3j9.LIZLLL) {
            return;
        }
        C3JL c3jl = (C3JL) ((ConcurrentHashMap) this.LJLLILLLL).get(c81983Jq);
        if (c3jl != null) {
            c3jl.LIZ(c3j9, c81983Jq);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("after decorate: ");
        LIZ.append(c3j9);
        LIZ.append(' ');
        LIZ.append(c81983Jq.LIZIZ);
        C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ));
    }

    public final void LJI(C3J9 c3j9, C81983Jq c81983Jq) {
        if (!c3j9.LIZLLL) {
            return;
        }
        C3JL c3jl = (C3JL) ((ConcurrentHashMap) this.LJLLJ).get(c81983Jq);
        if (c3jl != null) {
            c3jl.LIZ(c3j9, c81983Jq);
        }
        C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", "notifyRawDataToObservers");
    }

    public final void LJIIIIZZ(C3JL c3jl, C81983Jq c81983Jq) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("observeSessionSource:");
        LIZ.append(c81983Jq);
        C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ));
        ((ConcurrentHashMap) this.LJLLILLLL).put(c81983Jq, c3jl);
        ((ConcurrentHashMap) this.LJLJJLL).put(c81983Jq, new C3J9(0));
        Iterator it = ((CopyOnWriteArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            ((InterfaceC787037a) it.next()).LJIIIIZZ(c81983Jq);
        }
    }

    public final void LJIILL(InterfaceC81793Ix interfaceC81793Ix, C81983Jq c81983Jq, C3J9 c3j9) {
        C3J9 LIZJ = interfaceC81793Ix.LIZJ(c3j9);
        if (!this.LJZI && LIZJ.LIZLLL) {
            C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", "initLazyProcessors");
            ((CopyOnWriteArrayList) this.LJLLI).add(this.LJLJI.getValue());
            ((CopyOnWriteArrayList) this.LJLLI).add(this.LJLJJI.getValue());
            Iterator it = ((CopyOnWriteArrayList) this.LJLLI).iterator();
            while (it.hasNext()) {
                C3JJ c3jj = (C3JJ) it.next();
                c3jj.LJIIL();
                c3jj.LIZLLL();
            }
            ((CopyOnWriteArrayList) this.LJLJLLL).add(this.LJLJI.getValue());
            ((CopyOnWriteArrayList) this.LJLJLLL).add(this.LJLJJI.getValue());
            ((CopyOnWriteArrayList) this.LJLJLLL).add(this.LJLJJL.getValue());
            ((CopyOnWriteArrayList) this.LJLJLJ).add(this.LJLJI.getValue());
            ((CopyOnWriteArrayList) this.LJLJLJ).add(this.LJLJJI.getValue());
            Iterator it2 = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
            while (it2.hasNext()) {
                C3J7 c3j7 = (C3J7) it2.next();
                c3j7.LJFF(new C81743Is(this));
                c3j7.LIZIZ(new C81763Iu(this));
            }
            this.LJZI = true;
        }
        LIZIZ(c81983Jq).LIZLLL(EnumC81823Ja.SESSION_MEDIATOR, C3JU.DECORATE);
        java.util.Map<C3JB, List<C3L4>> LIZLLL = LIZJ.LIZLLL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<C3JB, List<C3L4>> entry : LIZLLL.entrySet()) {
            C3JB key = entry.getKey();
            List<C3L4> value = entry.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("type: ");
            LIZ.append(key);
            LIZ.append(" : ");
            LIZ.append(value.size());
            C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ));
            Iterator it3 = ((CopyOnWriteArrayList) this.LJLJLLL).iterator();
            while (it3.hasNext()) {
                C3JD c3jd = (C3JD) it3.next();
                if (c3jd.LJII() != C39N.INBOX || C3K3.LIZ().LJLJJI) {
                    C81843Jc.LJ().LIZJ(c3jd.getTag());
                    c3jd.LJ(value);
                    C81843Jc.LJ().LIZ(c3jd.getTag());
                }
            }
            linkedHashMap.put(key, value);
        }
        C3J9 LIZ2 = C3J8.LIZ(linkedHashMap, LIZJ.LIZJ, LIZJ.LIZLLL);
        C81833Jb LIZIZ = LIZIZ(c81983Jq);
        EnumC81823Ja enumC81823Ja = EnumC81823Ja.SESSION_MEDIATOR;
        LIZIZ.LIZIZ(enumC81823Ja, C3JU.DECORATE);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("handleSourceDataBatchUpdateOperationCallback after decorate : ");
        LIZ3.append(LIZ2);
        C81843Jc.LIZIZ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ3));
        LJIIJJI(new C3J2(this, null));
        LJFF(LIZ2, c81983Jq);
        LJI(LIZ2, c81983Jq);
        LIZIZ(null).LIZIZ(enumC81823Ja, C3JU.BATCH_SOURCE_DATA_UPDATE);
    }
}
