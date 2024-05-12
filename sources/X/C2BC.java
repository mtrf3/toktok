package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.2BC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BC<K, V> extends AbstractC48201uq<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        C41311jj<K, V> c41311jj = this.LJLIL;
        return new C1IH(c41311jj, c41311jj.LIZ().LIZJ.entrySet().iterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2BC(C41311jj<K, V> map) {
        super(map);
        o.LJIIIZ(map, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object element) {
        o.LJIIIZ(element, "element");
        C0OH.LIZ();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        o.LJIIIZ(elements, "elements");
        C0OH.LIZ();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC90533gv) && !(obj instanceof EHP))) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        o.LJIIIZ(element, "element");
        return o.LJ(this.LJLIL.get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC90533gv) && !(obj instanceof EHP))) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        o.LJIIIZ(element, "element");
        if (this.LJLIL.remove(element.getKey()) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.LJLIL.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        InterfaceC37431dT<K, ? extends V> interfaceC37431dT;
        int i;
        boolean z;
        C0OA LJIIIIZZ;
        o.LJIIIZ(elements, "elements");
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(elements, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            OSZ osz = new OSZ(entry.getKey(), entry.getValue());
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        C41311jj<K, V> c41311jj = this.LJLIL;
        boolean z2 = false;
        do {
            synchronized (C0OH.LIZ) {
                C1IT c1it = c41311jj.LJLIL;
                o.LJII(c1it, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C1IT c1it2 = (C1IT) C0OF.LJI(c1it);
                interfaceC37431dT = c1it2.LIZJ;
                i = c1it2.LIZLLL;
            }
            o.LJI(interfaceC37431dT);
            C44551ox builder = interfaceC37431dT.builder();
            Object it2 = c41311jj.LJLILLLLZI.iterator();
            while (true) {
                z = true;
                if (!((C0O7) it2).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((C1IH) it2).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !o.LJ(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
                    z2 = true;
                }
            }
            C44541ow<K, V> LIZ = builder.LIZ();
            if (o.LJ(LIZ, interfaceC37431dT)) {
                break;
            }
            synchronized (C0OH.LIZ) {
                C1IT c1it3 = c41311jj.LJLIL;
                o.LJII(c1it3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (C0OF.LIZJ) {
                    LJIIIIZZ = C0OF.LJIIIIZZ();
                    C1IT c1it4 = (C1IT) C0OF.LJIJI(c1it3, c41311jj, LJIIIIZZ);
                    if (c1it4.LIZLLL == i) {
                        c1it4.LIZJ(LIZ);
                        c1it4.LIZLLL++;
                    } else {
                        z = false;
                    }
                }
                C0OF.LJIIL(LJIIIIZZ, c41311jj);
            }
        } while (!z);
        return z2;
    }
}
