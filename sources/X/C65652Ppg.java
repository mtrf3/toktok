package X;

import defpackage.g0;
import java.util.ArrayList;

/* renamed from: X.Ppg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65652Ppg extends AbstractC65653Pph<E>.b {
    public final /* synthetic */ C65649Ppd LJLILLLLZI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int size = size();
        g0.LJIIIIZZ(size, "arraySize");
        ArrayList arrayList = new ArrayList(C65713Pqf.LIZ(size + 5 + (size / 10)));
        C65631PpL.LIZ(arrayList, iterator());
        return arrayList.toArray();
    }

    @Override // X.AbstractC65653Pph.b, X.AbstractC65673Pq1
    public final /* bridge */ /* synthetic */ InterfaceC65672Pq0 LIZJ() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65652Ppg(C65649Ppd c65649Ppd) {
        super();
        this.LJLILLLLZI = c65649Ppd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        g0.LJIIIIZZ(size, "arraySize");
        ArrayList arrayList = new ArrayList(C65713Pqf.LIZ(size + 5 + (size / 10)));
        C65631PpL.LIZ(arrayList, iterator());
        return (T[]) arrayList.toArray(tArr);
    }
}
