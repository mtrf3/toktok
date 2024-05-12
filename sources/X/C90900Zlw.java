package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Zlw, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90900Zlw extends AbstractC90703Zil<String> implements RandomAccess, InterfaceC90398Zdq {
    public final List<Object> LJLILLLLZI;

    static {
        new C90900Zlw(10).LJLIL = false;
    }

    public C90900Zlw() {
        this(10);
    }

    @Override // X.InterfaceC90398Zdq
    public final InterfaceC90398Zdq LIZLLL() {
        if (this.LJLIL) {
            return new C90727Zj9(this);
        }
        return this;
    }

    @Override // X.InterfaceC90398Zdq
    public final List<?> LJI() {
        return Collections.unmodifiableList(this.LJLILLLLZI);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC90703Zil, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        LIZJ();
        this.LJLILLLLZI.clear();
        ((AbstractList) this).modCount++;
    }

    public C90900Zlw(int i) {
        this.LJLILLLLZI = new ArrayList(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = ListProtector.get(this.LJLILLLLZI, i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC90364ZdI) {
            AbstractC90364ZdI abstractC90364ZdI = (AbstractC90364ZdI) obj;
            String zzm = abstractC90364ZdI.zzm(C90359ZdD.LIZ);
            if (abstractC90364ZdI.zzi()) {
                ListProtector.set(this.LJLILLLLZI, i, zzm);
            }
            return zzm;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, C90359ZdD.LIZ);
        C90286Zc2 c90286Zc2 = C90389Zdh.LIZ;
        int length = bArr.length;
        c90286Zc2.getClass();
        if (C90286Zc2.LIZ(bArr, length)) {
            ListProtector.set(this.LJLILLLLZI, i, str);
        }
        return str;
    }

    @Override // X.InterfaceC90352Zd6
    public final /* bridge */ /* synthetic */ InterfaceC90352Zd6 LJIILL(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.LJLILLLLZI);
            return new C90900Zlw((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // X.InterfaceC90398Zdq
    public final Object LJIJJ(int i) {
        return ListProtector.get(this.LJLILLLLZI, i);
    }

    @Override // X.AbstractC90703Zil, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // X.AbstractC90703Zil, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        LIZJ();
        Object remove = ListProtector.remove(this.LJLILLLLZI, i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return remove;
        }
        if (remove instanceof AbstractC90364ZdI) {
            return ((AbstractC90364ZdI) remove).zzm(C90359ZdD.LIZ);
        }
        return new String((byte[]) remove, C90359ZdD.LIZ);
    }

    public C90900Zlw(ArrayList<Object> arrayList) {
        this.LJLILLLLZI = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        LIZJ();
        ListProtector.add(this.LJLILLLLZI, i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.AbstractC90703Zil, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        LIZJ();
        if (collection instanceof InterfaceC90398Zdq) {
            collection = ((InterfaceC90398Zdq) collection).LJI();
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
        if (obj2 instanceof AbstractC90364ZdI) {
            return ((AbstractC90364ZdI) obj2).zzm(C90359ZdD.LIZ);
        }
        return new String((byte[]) obj2, C90359ZdD.LIZ);
    }
}
