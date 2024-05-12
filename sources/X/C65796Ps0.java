package X;

import java.util.AbstractMap;

/* renamed from: X.Ps0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65796Ps0 extends AbstractC65794Pry {
    public final /* synthetic */ C65791Prv LJLJI;

    @Override // X.AbstractC65792Prw
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI.LJLJJL;
    }

    public C65796Ps0(C65791Prv c65791Prv) {
        this.LJLJI = c65791Prv;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C47261Igj.LJJJLIIL(i, this.LJLJI.LJLJJL);
        C65791Prv c65791Prv = this.LJLJI;
        int i2 = i + i;
        Object obj = c65791Prv.LJLJJI[i2];
        obj.getClass();
        Object obj2 = c65791Prv.LJLJJI[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
