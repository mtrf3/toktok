package X;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.Pq3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65675Pq3<E> extends AbstractC65599Pop<E> {
    public final /* synthetic */ C65660Ppo LJLJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJI.LJLJJI.LIZJ;
    }

    public C65675Pq3(C65660Ppo c65660Ppo) {
        this.LJLJI = c65660Ppo;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLJI.contains(obj);
    }

    @Override // X.AbstractC65599Pop
    public final E get(int i) {
        C65656Ppk<E> c65656Ppk = this.LJLJI.LJLJJI;
        C76917UGr.LJFF(i, c65656Ppk.LIZJ);
        return (E) c65656Ppk.LIZ[i];
    }
}
