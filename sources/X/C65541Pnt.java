package X;

import java.util.Iterator;

/* renamed from: X.Pnt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65541Pnt extends C65542Pnu<Object> {
    public C65541Pnt(AbstractC65539Pnr abstractC65539Pnr) {
        super(abstractC65539Pnr);
    }

    @Override // X.AbstractC65539Pnr
    public final AbstractC65590Pog LIZIZ(AbstractC65578PoU abstractC65578PoU) {
        C65587Pod builder = AbstractC65590Pog.builder();
        Iterator it = abstractC65578PoU.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!LIZLLL(next).isInterface()) {
                builder.LIZIZ(next);
            }
        }
        return super.LIZIZ(builder.LJ());
    }

    @Override // X.AbstractC65539Pnr
    public final Iterable<Object> LIZJ(Object obj) {
        return AbstractC65583PoZ.of();
    }
}
