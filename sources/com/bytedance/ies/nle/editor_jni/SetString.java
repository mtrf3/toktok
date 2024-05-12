package com.bytedance.ies.nle.editor_jni;

import X.C88544Yp2;
import java.util.AbstractSet;
import java.util.Collection;

/* loaded from: classes17.dex */
public final class SetString extends AbstractSet<String> {
    public static final /* synthetic */ int LJLJI = 0;
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLETemplateJNI.delete_SetString(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        NLETemplateJNI.SetString_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return NLETemplateJNI.SetString_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<String> iterator() {
        C88544Yp2 c88544Yp2 = new C88544Yp2(this);
        c88544Yp2.LJLIL = new Iterator(NLETemplateJNI.SetString_begin(this.LJLIL, this));
        c88544Yp2.LJLILLLLZI = new Iterator(NLETemplateJNI.SetString_end(this.LJLIL, this));
        return c88544Yp2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return NLETemplateJNI.SetString_sizeImpl(this.LJLIL, this);
    }

    public SetString() {
        this(NLETemplateJNI.new_SetString__SWIG_0());
    }

    /* loaded from: classes17.dex */
    public static class Iterator {
        public transient long LIZ;
        public transient boolean LIZIZ = true;

        public final void finalize() {
            synchronized (this) {
                long j = this.LIZ;
                if (j != 0) {
                    if (this.LIZIZ) {
                        this.LIZIZ = false;
                        NLETemplateJNI.delete_SetString_Iterator(j);
                    }
                    this.LIZ = 0L;
                }
            }
        }

        public Iterator(long j) {
            this.LIZ = j;
        }
    }

    public SetString(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return NLETemplateJNI.SetString_add(this.LJLIL, this, (String) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends String> collection) {
        java.util.Iterator<? extends String> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= NLETemplateJNI.SetString_add(this.LJLIL, this, it.next());
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return NLETemplateJNI.SetString_containsImpl(this.LJLIL, this, (String) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return NLETemplateJNI.SetString_removeImpl(this.LJLIL, this, (String) obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }
}
