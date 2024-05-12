package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WJa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82074WJa implements WK0 {
    public final C81975WFf LIZ;
    public final C81975WFf LIZIZ;
    public final C81975WFf LIZJ;
    public final C81975WFf LIZLLL;
    public final C81975WFf LJ;
    public final C81975WFf LJFF;
    public final C81975WFf LJI;
    public C81975WFf LJIIIIZZ;
    public C81975WFf LJIIIZ;
    public final ArrayList<C81975WFf> LJII = new ArrayList<>();
    public final List<InterfaceC82075WJb> LJIIJ = new ArrayList();
    public int LJIIJJI = Integer.MAX_VALUE;

    @Override // X.WK0
    public final C81975WFf LIZLLL() {
        Iterator<C81975WFf> it = this.LJII.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().LJLIL == 16) {
                if (i >= 0) {
                    return (C81975WFf) ListProtector.get(this.LJII, i);
                }
            } else {
                i++;
            }
        }
        C81975WFf c81975WFf = this.LJIIIZ;
        if (c81975WFf != null) {
            return c81975WFf;
        }
        return this.LIZIZ;
    }

    @Override // X.WK0
    public final C81975WFf LJIIIZ() {
        C81975WFf c81975WFf;
        Iterator<C81975WFf> it = this.LJII.iterator();
        while (true) {
            if (it.hasNext()) {
                c81975WFf = it.next();
                C81975WFf c81975WFf2 = c81975WFf;
                C81975WFf c81975WFf3 = this.LIZLLL;
                if (c81975WFf3 != null && c81975WFf2.LJLIL == c81975WFf3.LJLIL) {
                    break;
                }
            } else {
                c81975WFf = null;
                break;
            }
        }
        C81975WFf c81975WFf4 = c81975WFf;
        if (c81975WFf4 == null) {
            return this.LIZLLL;
        }
        return c81975WFf4;
    }

    @Override // X.WK0
    public final C81975WFf LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.WK0
    public final C81975WFf LJ() {
        return this.LIZ;
    }

    @Override // X.WK0
    public final C81975WFf LJFF() {
        return this.LJ;
    }

    @Override // X.WK0
    public final C81975WFf LJI() {
        return this.LJFF;
    }

    @Override // X.WK0
    public final C81975WFf LJII() {
        return this.LIZJ;
    }

    @Override // X.WK0
    public final C81975WFf LJIIJ() {
        return this.LJI;
    }

    @Override // X.WK0
    public final int LJLLI() {
        return this.LJIIJJI;
    }

    @Override // X.WK0
    public final List<C81975WFf> getItems() {
        return this.LJII;
    }

    @Override // X.WK0
    public final void LIZIZ(C81975WFf c81975WFf) {
        if (o.LJ(this.LJIIIIZZ, c81975WFf)) {
            return;
        }
        this.LJIIIIZZ = c81975WFf;
        Iterator it = ((ArrayList) this.LJIIJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC82075WJb) it.next()).LJ();
        }
    }

    @Override // X.WK0
    public final void LIZJ(InterfaceC82075WJb callback) {
        o.LJIIIZ(callback, "callback");
        if (!((ArrayList) this.LJIIJ).contains(callback)) {
            ((ArrayList) this.LJIIJ).add(callback);
        }
    }

    @Override // X.WK0
    public final void LJIIIIZZ(InterfaceC82075WJb callback) {
        o.LJIIIZ(callback, "callback");
        ((ArrayList) this.LJIIJ).remove(callback);
    }

    @Override // X.WK0
    public final void LJLILLLLZI(List<? extends C81975WFf> items) {
        o.LJIIIZ(items, "items");
        ArrayList arrayList = new ArrayList(this.LJII);
        this.LJII.clear();
        Iterator<? extends C81975WFf> it = items.iterator();
        while (it.hasNext()) {
            this.LJII.add(it.next().clone());
        }
        ArrayList<C81975WFf> arrayList2 = this.LJII;
        HashSet hashSet = new HashSet(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(hashSet);
        C40675Fxn.LJJLIIIIJ(arrayList2);
        Iterator it2 = ((ArrayList) this.LJIIJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC82075WJb) it2.next()).LIZ(arrayList, this.LJII);
        }
    }

    @Override // X.WK0
    public final void LJLLJ(C81975WFf item) {
        o.LJIIIZ(item, "item");
        this.LJII.add(item);
        ArrayList<C81975WFf> arrayList = this.LJII;
        HashSet hashSet = new HashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        C40675Fxn.LJJLIIIIJ(arrayList);
        Iterator it = ((ArrayList) this.LJIIJ).iterator();
        while (it.hasNext()) {
            InterfaceC82075WJb interfaceC82075WJb = (InterfaceC82075WJb) it.next();
            this.LJII.size();
            interfaceC82075WJb.LJFF(item);
        }
    }

    @Override // X.WK0
    public final void LJLLLL(int i) {
        this.LJIIJJI = i;
        Iterator it = ((ArrayList) this.LJIIJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC82075WJb) it.next()).LIZIZ();
        }
    }

    @Override // X.WK0
    public final void LL(C81975WFf item) {
        o.LJIIIZ(item, "item");
        Iterator<C81975WFf> it = this.LJII.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().LJLIL == item.LJLIL) {
                if (i >= 0) {
                    ((C81975WFf) ListProtector.get(this.LJII, i)).LL = true;
                    ListProtector.set(this.LJII, i, item.clone());
                    Iterator it2 = ((ArrayList) this.LJIIJ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC82075WJb) it2.next()).LIZLLL(item);
                    }
                    if (item.LJLIL == 16) {
                        this.LJIIIZ = (C81975WFf) ListProtector.get(this.LJII, i);
                        return;
                    }
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.WK0
    public final void LLFF(C81975WFf item) {
        o.LJIIIZ(item, "item");
        if (this.LJII.remove(item)) {
            Iterator<InterfaceC82075WJb> it = this.LJIIJ.iterator();
            while (it.hasNext()) {
                it.next().LIZJ(item);
            }
        }
    }

    public C82074WJa(C81975WFf c81975WFf, C81975WFf c81975WFf2, C81975WFf c81975WFf3, C81975WFf c81975WFf4, C81975WFf c81975WFf5, C81975WFf c81975WFf6, C81975WFf c81975WFf7) {
        this.LIZ = c81975WFf;
        this.LIZIZ = c81975WFf2;
        this.LIZJ = c81975WFf3;
        this.LIZLLL = c81975WFf4;
        this.LJ = c81975WFf5;
        this.LJFF = c81975WFf6;
        this.LJI = c81975WFf7;
    }
}
