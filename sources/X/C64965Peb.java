package X;

import java.util.Iterator;

/* renamed from: X.Peb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64965Peb extends AbstractC64964Pea<Iterable<Object>> {
    public final /* synthetic */ AbstractC64964Pea LIZ;

    public C64965Peb(AbstractC64964Pea abstractC64964Pea) {
        this.LIZ = abstractC64964Pea;
    }

    @Override // X.AbstractC64964Pea
    public final void LIZ(C64970Peg c64970Peg, Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.LIZ.LIZ(c64970Peg, it.next());
        }
    }
}
