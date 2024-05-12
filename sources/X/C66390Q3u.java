package X;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.Q3u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66390Q3u extends AbstractList<GraphRequest> {
    public static final AtomicInteger LJLJJL = new AtomicInteger();
    public Handler LJLIL;
    public final List<GraphRequest> LJLJI;
    public final String LJLILLLLZI = String.valueOf(LJLJJL.incrementAndGet());
    public final List<BMW> LJLJJI = new ArrayList();

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LJLJI.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI.size();
    }

    public C66390Q3u(GraphRequest... graphRequestArr) {
        this.LJLJI = new ArrayList(C61898ORa.LJIILL(graphRequestArr));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object element) {
        o.LJIIIZ(element, "element");
        return this.LJLJI.add(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return super.contains(obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return ((ArrayList) this.LJLJI).get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return super.indexOf(obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return super.lastIndexOf(obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof GraphRequest)) {
            return super.remove(obj);
        }
        return false;
    }

    public C66390Q3u(Collection<GraphRequest> collection) {
        this.LJLJI = new ArrayList(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.LJLJI.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object element) {
        o.LJIIIZ(element, "element");
        this.LJLJI.add(i, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object element) {
        o.LJIIIZ(element, "element");
        return this.LJLJI.set(i, element);
    }
}
