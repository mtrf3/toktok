package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WJc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82076WJc implements WKB {
    public C81975WFf LIZIZ;
    public final ArrayList<C81975WFf> LIZ = new ArrayList<>();
    public final List<InterfaceC82077WJd> LIZJ = new ArrayList();
    public int LIZLLL = Integer.MAX_VALUE;

    @Override // X.WKB
    public final C81975WFf LIZ() {
        return this.LIZIZ;
    }

    @Override // X.WKB
    public final int LJLLI() {
        return this.LIZLLL;
    }

    @Override // X.WKB
    public final List<C81975WFf> getItems() {
        return this.LIZ;
    }

    @Override // X.WKB
    public final void LIZIZ(C81975WFf c81975WFf) {
        if (o.LJ(this.LIZIZ, c81975WFf)) {
            return;
        }
        this.LIZIZ = c81975WFf;
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC82077WJd) it.next()).LJ();
        }
    }

    @Override // X.WKB
    public final void LIZJ(InterfaceC82077WJd callback) {
        o.LJIIIZ(callback, "callback");
        ((ArrayList) this.LIZJ).remove(callback);
    }

    @Override // X.WKB
    public final void LIZLLL(InterfaceC82077WJd callback) {
        o.LJIIIZ(callback, "callback");
        if (!((ArrayList) this.LIZJ).contains(callback)) {
            ((ArrayList) this.LIZJ).add(callback);
        }
    }

    @Override // X.WKB
    public final void LJLILLLLZI(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
        ArrayList arrayList = new ArrayList(this.LIZ);
        this.LIZ.clear();
        Iterator<? extends C81975WFf> it = items.iterator();
        while (it.hasNext()) {
            this.LIZ.add(it.next().clone());
        }
        ArrayList<C81975WFf> arrayList2 = this.LIZ;
        HashSet hashSet = new HashSet(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(hashSet);
        C40675Fxn.LJJLIIIIJ(arrayList2);
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC82077WJd) it2.next()).LIZ(arrayList, this.LIZ);
        }
    }

    @Override // X.WKB
    public final void LJLLJ(C81975WFf item) {
        o.LJIIIZ(item, "item");
        this.LIZ.add(item);
        ArrayList<C81975WFf> arrayList = this.LIZ;
        HashSet hashSet = new HashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        C40675Fxn.LJJLIIIIJ(arrayList);
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            InterfaceC82077WJd interfaceC82077WJd = (InterfaceC82077WJd) it.next();
            this.LIZ.size();
            interfaceC82077WJd.LJFF(item);
        }
    }

    @Override // X.WKB
    public final void LJLLLL(int i) {
        this.LIZLLL = i;
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC82077WJd) it.next()).LIZIZ();
        }
    }

    @Override // X.WKB
    public final void LL(C81975WFf item) {
        o.LJIIIZ(item, "item");
        Iterator<C81975WFf> it = this.LIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().LJLIL == item.LJLIL) {
                if (i >= 0) {
                    ((C81975WFf) ListProtector.get(this.LIZ, i)).LL = true;
                    ListProtector.set(this.LIZ, i, item.clone());
                    Iterator it2 = ((ArrayList) this.LIZJ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC82077WJd) it2.next()).LIZLLL(item);
                    }
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.WKB
    public final void LLFF(C81975WFf item) {
        o.LJIIIZ(item, "item");
        if (this.LIZ.remove(item)) {
            Iterator<InterfaceC82077WJd> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                it.next().LIZJ(item);
            }
        }
    }
}
