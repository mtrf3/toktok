package X;

import X.AbstractC65694PqM;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.NavigableMap;
import java.util.SortedMap;

/* renamed from: X.PqO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65696PqO<K, V> extends AbstractC65695PqN<K, V> {
    public static final long serialVersionUID = 0;
    public transient InterfaceC139745e6<? extends List<V>> LJLJLJ;

    @Override // X.AbstractC65694PqM, X.AbstractC65632PpM
    public final java.util.Map<K, Collection<V>> LIZ() {
        java.util.Map<K, Collection<V>> map = this.LJLJJLL;
        if (map instanceof NavigableMap) {
            return new C65697PqP(this, (NavigableMap) this.LJLJJLL);
        }
        if (map instanceof SortedMap) {
            return new AbstractC65694PqM.i((SortedMap) this.LJLJJLL);
        }
        return new AbstractC65694PqM.c(this.LJLJJLL);
    }

    @Override // X.AbstractC65694PqM, X.AbstractC65632PpM
    public final java.util.Set<K> LIZJ() {
        java.util.Map<K, Collection<V>> map = this.LJLJJLL;
        if (map instanceof NavigableMap) {
            return new C65698PqQ(this, (NavigableMap) this.LJLJJLL);
        }
        if (map instanceof SortedMap) {
            return new AbstractC65694PqM.j((SortedMap) this.LJLJJLL);
        }
        return new AbstractC65694PqM.e(this.LJLJJLL);
    }

    @Override // X.AbstractC65695PqN
    /* renamed from: LJIIJJI */
    public final List<V> LJII() {
        return this.LJLJLJ.get();
    }

    @Override // X.AbstractC65695PqN, X.AbstractC65694PqM
    public final /* bridge */ /* synthetic */ Collection LJII() {
        return LJII();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.LJLJLJ = (InterfaceC139745e6) objectInputStream.readObject();
        java.util.Map<K, Collection<V>> map = (java.util.Map) objectInputStream.readObject();
        this.LJLJJLL = map;
        this.LJLJL = 0;
        for (Collection<V> collection : map.values()) {
            C76917UGr.LJ(!collection.isEmpty());
            this.LJLJL = collection.size() + this.LJLJL;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.LJLJLJ);
        objectOutputStream.writeObject(this.LJLJJLL);
    }

    public C65696PqO(java.util.Map<K, Collection<V>> map, InterfaceC139745e6<? extends List<V>> interfaceC139745e6) {
        super(map);
        this.LJLJLJ = interfaceC139745e6;
    }
}
