package X;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PoT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65577PoT<K, V> extends AbstractC65590Pog<Map.Entry<K, V>> {
    public final /* synthetic */ C65576PoS LJLJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI.LJLJJLL;
    }

    public C65577PoT(C65576PoS c65576PoS) {
        this.LJLJI = c65576PoS;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C76917UGr.LJFF(i, this.LJLJI.LJLJJLL);
        C65576PoS c65576PoS = this.LJLJI;
        Object[] objArr = c65576PoS.LJLJJI;
        int i2 = i * 2;
        int i3 = c65576PoS.LJLJJL;
        return new AbstractMap.SimpleImmutableEntry(objArr[i2 + i3], objArr[i2 + (i3 ^ 1)]);
    }
}
