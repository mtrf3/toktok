package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes16.dex */
public final class XM2 extends AbstractC84676XLc implements RandomAccess, XM3 {
    public final List LJLILLLLZI;

    static {
        new XM2(10).LJLIL = false;
    }

    public XM2() {
        this(10);
    }

    @Override // X.XM3
    public final XM3 LJ() {
        if (this.LJLIL) {
            return new XM1(this);
        }
        return this;
    }

    @Override // X.XM3
    public final List LJI() {
        return Collections.unmodifiableList(this.LJLILLLLZI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        LIZJ();
        this.LJLILLLLZI.clear();
        ((AbstractList) this).modCount++;
    }

    public XM2(int i) {
        this.LJLILLLLZI = new ArrayList(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = ListProtector.get(this.LJLILLLLZI, i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC87134YHq) {
            AbstractC87134YHq abstractC87134YHq = (AbstractC87134YHq) obj;
            String zzn = abstractC87134YHq.zzn(YIG.LIZ);
            if (abstractC87134YHq.zzi()) {
                ListProtector.set(this.LJLILLLLZI, i, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, YIG.LIZ);
        C64526PUc c64526PUc = C64524PUa.LIZ;
        int length = bArr.length;
        c64526PUc.getClass();
        if (AbstractC64527PUd.LIZ(0, bArr, length)) {
            ListProtector.set(this.LJLILLLLZI, i, str);
        }
        return str;
    }

    @Override // X.XM3
    public final Object LJIIJJI(int i) {
        return ListProtector.get(this.LJLILLLLZI, i);
    }

    @Override // X.XM3
    public final void LJIILIIL(AbstractC87134YHq abstractC87134YHq) {
        LIZJ();
        this.LJLILLLLZI.add(abstractC87134YHq);
        ((AbstractList) this).modCount++;
    }

    @Override // X.XM7
    public final /* bridge */ /* synthetic */ XM7 LJIJI(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.LJLILLLLZI);
            return new XM2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        LIZJ();
        Object remove = ListProtector.remove(this.LJLILLLLZI, i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return remove;
        }
        if (remove instanceof AbstractC87134YHq) {
            return ((AbstractC87134YHq) remove).zzn(YIG.LIZ);
        }
        return new String((byte[]) remove, YIG.LIZ);
    }

    public XM2(ArrayList arrayList) {
        this.LJLILLLLZI = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        LIZJ();
        ListProtector.add(this.LJLILLLLZI, i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.AbstractC84676XLc, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        LIZJ();
        if (collection instanceof XM3) {
            collection = ((XM3) collection).LJI();
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
        if (obj2 instanceof AbstractC87134YHq) {
            return ((AbstractC87134YHq) obj2).zzn(YIG.LIZ);
        }
        return new String((byte[]) obj2, YIG.LIZ);
    }
}
