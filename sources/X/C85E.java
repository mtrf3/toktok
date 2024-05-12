package X;

import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.85E, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C85E extends AnonymousClass852<C85M> {
    public final List<AnonymousClass852<C85M>> LJIIIIZZ;

    public final List<AnonymousClass852<C85M>> LIZLLL() {
        List<AnonymousClass852<C85M>> LJJIJ;
        List<AnonymousClass852<C85M>> list = this.LJIIIIZZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            AnonymousClass852 anonymousClass852 = (AnonymousClass852) it.next();
            if (anonymousClass852 instanceof C85E) {
                LJJIJ = ((C85E) anonymousClass852).LIZLLL();
            } else {
                LJJIJ = C47261Igj.LJJIJ(anonymousClass852);
            }
            ORS.LJJLIIIJILLIZJL(LJJIJ, arrayList);
        }
        return arrayList;
    }

    @Override // X.InterfaceC2057785t
    public String LIZ() {
        List<AnonymousClass852<C85M>> LIZLLL = LIZLLL();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
        Iterator<AnonymousClass852<C85M>> it = LIZLLL.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ());
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = i0.LJFF((String) next, (String) it2.next());
            }
            return (String) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public C85E(int i, int i2) {
        super(i, i2);
        this.LJIIIIZZ = new ArrayList();
    }
}
