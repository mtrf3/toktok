package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.0O7, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0O7<K, V> {
    public final C41311jj<K, V> LJLIL;
    public final Iterator<Map.Entry<K, V>> LJLILLLLZI;
    public int LJLJI;
    public Map.Entry<? extends K, ? extends V> LJLJJI;
    public Map.Entry<? extends K, ? extends V> LJLJJL;

    public final void LIZ() {
        Map.Entry<K, V> entry;
        this.LJLJJI = this.LJLJJL;
        if (this.LJLILLLLZI.hasNext()) {
            entry = this.LJLILLLLZI.next();
        } else {
            entry = null;
        }
        this.LJLJJL = entry;
    }

    public final boolean hasNext() {
        if (this.LJLJJL != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.LJLIL.LIZ().LIZLLL == this.LJLJI) {
            Map.Entry<? extends K, ? extends V> entry = this.LJLJJI;
            if (entry != null) {
                this.LJLIL.remove(entry.getKey());
                this.LJLJJI = null;
                this.LJLJI = this.LJLIL.LIZ().LIZLLL;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0O7(C41311jj<K, V> map, Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        o.LJIIIZ(map, "map");
        o.LJIIIZ(iterator, "iterator");
        this.LJLIL = map;
        this.LJLILLLLZI = iterator;
        this.LJLJI = map.LIZ().LIZLLL;
        LIZ();
    }
}
