package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.XLr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84691XLr extends AbstractC84675XLb<String> implements InterfaceC84696XLw, RandomAccess {
    public final List<Object> LJLILLLLZI;

    static {
        new C84691XLr(10).LJLIL = false;
    }

    @Override // X.InterfaceC84696XLw
    public final InterfaceC84696XLw LJJIIJZLJL() {
        if (this.LJLIL) {
            return new C84692XLs(this);
        }
        return this;
    }

    @Override // X.InterfaceC84696XLw
    public final List<?> LJJIJIIJIL() {
        return Collections.unmodifiableList(this.LJLILLLLZI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC84675XLb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        LIZJ();
        this.LJLILLLLZI.clear();
        ((AbstractList) this).modCount++;
    }

    public C84691XLr(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // X.InterfaceC84696XLw
    public final Object LJJ(int i) {
        return ListProtector.get(this.LJLILLLLZI, i);
    }

    @Override // X.InterfaceC84678XLe
    public final /* synthetic */ InterfaceC84678XLe LJJIL(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.LJLILLLLZI);
            return new C84691XLr((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84675XLb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object obj = ListProtector.get(this.LJLILLLLZI, i);
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof AbstractC87141YHx) {
            AbstractC87141YHx abstractC87141YHx = (AbstractC87141YHx) obj;
            String zzare = abstractC87141YHx.zzare();
            if (abstractC87141YHx.zzarf()) {
                ListProtector.set(this.LJLILLLLZI, i, zzare);
            }
            return zzare;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, YI0.LIZ);
        if (PUZ.LIZ.LLLLLZIL(0, bArr, bArr.length) == 0) {
            ListProtector.set(this.LJLILLLLZI, i, str);
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        LIZJ();
        Object remove = ListProtector.remove(this.LJLILLLLZI, i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return remove;
        }
        if (remove instanceof AbstractC87141YHx) {
            return ((AbstractC87141YHx) remove).zzare();
        }
        return new String((byte[]) remove, YI0.LIZ);
    }

    public C84691XLr(ArrayList<Object> arrayList) {
        this.LJLILLLLZI = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        LIZJ();
        ListProtector.add(this.LJLILLLLZI, i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.AbstractC84675XLb, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        LIZJ();
        if (collection instanceof InterfaceC84696XLw) {
            collection = ((InterfaceC84696XLw) collection).LJJIJIIJIL();
        }
        boolean addAll = this.LJLILLLLZI.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        LIZJ();
        Object obj2 = ListProtector.set(this.LJLILLLLZI, i, obj);
        if (obj2 instanceof String) {
            return obj2;
        }
        if (obj2 instanceof AbstractC87141YHx) {
            return ((AbstractC87141YHx) obj2).zzare();
        }
        return new String((byte[]) obj2, YI0.LIZ);
    }
}
