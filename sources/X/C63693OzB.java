package X;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OzB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63693OzB extends CopyOnWriteArraySet<InterfaceC54035LIp> {
    public final /* synthetic */ AbstractC63695OzD LJLIL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    public C63693OzB(AbstractC63695OzD abstractC63695OzD) {
        this.LJLIL = abstractC63695OzD;
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(InterfaceC54035LIp interfaceC54035LIp) {
        if (interfaceC54035LIp != null) {
            AbstractC63695OzD abstractC63695OzD = this.LJLIL;
            abstractC63695OzD.getClass();
            Class[] LIZ = C62843OlT.LIZ(abstractC63695OzD.getClass().getName());
            if (LIZ != null && ORY.LJJIJIIJIL(interfaceC54035LIp.getClass(), LIZ)) {
                java.util.Map<String, C214578bV> LIZIZ = abstractC63695OzD.LIZIZ();
                for (Map.Entry<String, Object> entry : interfaceC54035LIp.LLJZ().entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (abstractC63695OzD.LIZJ) {
                        if (LIZIZ.containsKey(key)) {
                            abstractC63695OzD.LIZLLL(value, key);
                        }
                    } else {
                        abstractC63695OzD.LIZLLL(value, key);
                    }
                }
                for (Map.Entry<String, Object> entry2 : interfaceC54035LIp.LLLLIL().entrySet()) {
                    String key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (interfaceC54035LIp.LLD()) {
                        if (LIZIZ.containsKey(key2)) {
                            abstractC63695OzD.LIZLLL(value2, key2);
                        }
                    } else {
                        abstractC63695OzD.LIZLLL(value2, key2);
                    }
                }
            }
        }
        return super.add((C63693OzB) interfaceC54035LIp);
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof InterfaceC54035LIp)) {
            return contains((InterfaceC54035LIp) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof InterfaceC54035LIp)) {
            return remove((InterfaceC54035LIp) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(InterfaceC54035LIp interfaceC54035LIp) {
        return super.contains((Object) interfaceC54035LIp);
    }

    public /* bridge */ boolean remove(InterfaceC54035LIp interfaceC54035LIp) {
        return super.remove((Object) interfaceC54035LIp);
    }
}
