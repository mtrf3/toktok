package X;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.Poe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65588Poe<E> extends C65584Poa<E> {
    public final Comparator<? super E> LJFF;

    @Override // X.C65584Poa
    public final C65584Poa LJ(Iterator it) {
        throw null;
    }

    @Override // X.C65584Poa
    /* renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final C65592Poi LJFF() {
        C65592Poi LJIIJ = AbstractC65591Poh.LJIIJ(this.LJFF, this.LIZIZ, this.LIZ);
        this.LIZIZ = LJIIJ.size();
        this.LIZJ = true;
        return LJIIJ;
    }

    public C65588Poe(Comparator<? super E> comparator) {
        comparator.getClass();
        this.LJFF = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C65584Poa
    public final C65584Poa LIZLLL(Object obj) {
        super.LIZLLL(obj);
        return this;
    }

    public final void LJI(Iterator it) {
        super.LJ(it);
    }
}
