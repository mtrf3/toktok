package X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.Pot, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65603Pot<V> extends AbstractC65590Pog<V> {
    public final /* synthetic */ AbstractC65590Pog LJLJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI.size();
    }

    public C65603Pot(AbstractC65590Pog abstractC65590Pog) {
        this.LJLJI = abstractC65590Pog;
    }

    @Override // java.util.List
    public final V get(int i) {
        return (V) ((Map.Entry) this.LJLJI.get(i)).getValue();
    }
}
