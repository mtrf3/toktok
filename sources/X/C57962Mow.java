package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mow, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57962Mow extends C65735Pr1<InterfaceC57927MoN> {
    public final C57859MnH LJLJJI;
    public final InterfaceC70422pa LJLJJL;
    public final XLM LJLJJLL;
    public final XLM LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final java.util.Set<String> LJLL;
    public final C62822Ol8 LJLLI;
    public EnumC57985MpJ LJLLILLLL;
    public final C57979MpD LJLLJ;

    public final List<InterfaceC57927MoN> LJIILLIIL() {
        List<InterfaceC57927MoN> list = ((C57969Mp3) this.LJLJJLL.getValue()).LJ;
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public final C57947Moh LJIIZILJ() {
        return (C57947Moh) this.LJLJLLL.getValue();
    }

    public final C57963Mox LJIJ() {
        return (C57963Mox) this.LJLJLJ.getValue();
    }

    public final void LJJI() {
        AYY.LIZ.getClass();
        AYY.LIZIZ("DataSource", "reset All!");
        this.LJLJI.clear();
        ((CopyOnWriteArraySet) this.LJLL).clear();
        this.LJLJJLL.setValue(new C57969Mp3(true, 14));
        C57963Mox LJIJ = LJIJ();
        LJIJ.getClass();
        LJIJ.LJFF(new AqS175S0100000_9(LJIJ, 635));
    }

    @Override // X.C65735Pr1
    public final int LJII() {
        return LJIILLIIL().size();
    }

    public final void LJJIFFI() {
        XLM xlm = LJIJ().LJII;
        if (xlm != null) {
            C57970Mp4 c57970Mp4 = (C57970Mp4) xlm.getValue();
            List<RecUser> list = c57970Mp4.LJ;
            if (!(list instanceof List) || list == null) {
                return;
            }
            LJIL(c57970Mp4, LJIIIZ(c57970Mp4, list, ((C57948Moi) LJIIZILJ().LJFF.getValue()).LJLIL));
            return;
        }
        o.LJIJI("_state");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.MoN, java.lang.Object] */
    @Override // X.C65735Pr1
    public final InterfaceC57927MoN LJIIIIZZ(int i) {
        ?? r0 = get(i);
        remove((Object) r0);
        return r0;
    }

    @Override // X.C65735Pr1, java.util.List, java.util.Collection
    public final boolean add(Object element) {
        o.LJIIIZ(element, "element");
        "not support action".toString();
        throw new IllegalStateException("not support action");
    }

    @Override // X.C65735Pr1, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends InterfaceC57927MoN> elements) {
        o.LJIIIZ(elements, "elements");
        "not support action".toString();
        throw new IllegalStateException("not support action");
    }

    @Override // X.C65735Pr1, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC57927MoN)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // X.C65735Pr1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof InterfaceC57927MoN)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // X.C65735Pr1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof InterfaceC57927MoN)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }

    @Override // X.C65735Pr1, java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof InterfaceC57927MoN)) {
            return false;
        }
        InterfaceC57927MoN element = (InterfaceC57927MoN) obj;
        o.LJIIIZ(element, "element");
        Iterator<InterfaceC57927MoN> it = iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().getElementId(), element.getElementId())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        element.setRemoved(true);
        if (i < 0 || i >= LJII()) {
            return false;
        }
        InterfaceC57927MoN interfaceC57927MoN = get(i);
        interfaceC57927MoN.setRemoved(true);
        set(i, interfaceC57927MoN);
        return true;
    }

    @Override // X.C65735Pr1, java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        "not support action".toString();
        throw new IllegalStateException("not support action");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57962Mow(C57859MnH config, InterfaceC70422pa scope) {
        super(0);
        EnumC57985MpJ enumC57985MpJ;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(scope, "scope");
        this.LJLJJI = config;
        this.LJLJJL = scope;
        XLM LIZ = V8H.LIZ(new C57969Mp3(false, 31));
        this.LJLJJLL = LIZ;
        this.LJLJL = LIZ;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1056));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1054));
        this.LJLL = new CopyOnWriteArraySet();
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1055));
        if (C57898Mnu.LJFF(config)) {
            enumC57985MpJ = EnumC57985MpJ.STORAGE;
        } else {
            enumC57985MpJ = EnumC57985MpJ.API;
        }
        this.LJLLILLLL = enumC57985MpJ;
        this.LJLLJ = new C57979MpD();
    }

    public final void LJIL(C57970Mp4 c57970Mp4, List<? extends InterfaceC57927MoN> list) {
        List<? extends InterfaceC57927MoN> list2 = list;
        Object value = this.LJLJJLL.getValue();
        boolean z = c57970Mp4.LIZ;
        C57967Mp1 c57967Mp1 = c57970Mp4.LIZIZ;
        boolean z2 = c57970Mp4.LIZJ;
        if (list2 == null) {
            list2 = ((C57969Mp3) this.LJLJJLL.getValue()).LJ;
        }
        value.getClass();
        C57969Mp3 c57969Mp3 = new C57969Mp3(true, z, c57967Mp1, z2, list2);
        this.LJLJI.clear();
        List<V> list3 = this.LJLJI;
        if (list2 == null) {
            list2 = C61878OQg.INSTANCE;
        }
        list3.addAll(list2);
        AYY.LIZ.getClass();
        AYY.LIZIZ("DataSource", "source update to new state");
        this.LJLJJLL.setValue(c57969Mp3);
    }

    @Override // X.C65735Pr1, java.util.List
    public final void add(int i, Object element) {
        o.LJIIIZ(element, "element");
        "not support action".toString();
        throw new IllegalStateException("not support action");
    }

    public static List LJIIIZ(C57970Mp4 c57970Mp4, List list, List list2) {
        C57850Mn8 c57850Mn8 = new C57850Mn8(list, c57970Mp4.LIZJ);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c57850Mn8 = C57850Mn8.LIZ(c57850Mn8, ((InterfaceC57861MnJ) it.next()).LIZ(c57850Mn8));
        }
        return c57850Mn8.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(com.ss.android.ugc.aweme.relation.model.RecUser r14, boolean r15, X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.relation.model.RecUser>> r16) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57962Mow.LJIILJJIL(com.ss.android.ugc.aweme.relation.model.RecUser, boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(boolean r19, X.C57967Mp1 r20, X.InterfaceC67352kd<? super X.C57971Mp5> r21) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57962Mow.LJIJJLI(boolean, X.Mp1, X.2kd):java.lang.Object");
    }

    public final void LJJII(String str, String str2, List list) {
        String str3 = str2;
        List list2 = list;
        String str4 = str;
        XLM xlm = LJIJ().LJII;
        if (xlm != null) {
            C57967Mp1 c57967Mp1 = ((C57970Mp4) xlm.getValue()).LIZIZ;
            if (c57967Mp1 == null) {
                c57967Mp1 = LJIJ().LIZIZ();
            }
            if (list2 == null) {
                list2 = c57967Mp1.LIZJ;
            }
            if (str4 == null) {
                str4 = c57967Mp1.LJ;
            }
            if (str3 == null) {
                str3 = c57967Mp1.LIZLLL;
            }
            C57967Mp1 LIZ = C57967Mp1.LIZ(c57967Mp1, null, list2, str3, str4, false, 227);
            C57963Mox LJIJ = LJIJ();
            LJIJ.getClass();
            LJIJ.LJIIJ = C57967Mp1.LIZ(LIZ, "", null, null, null, false, 253);
            LJIJ.LJFF(new AqS175S0100000_9(LIZ, 636));
            return;
        }
        o.LJIJI("_state");
        throw null;
    }
}
