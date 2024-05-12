package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Cne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32402Cne extends AbstractC32415Cnr {
    public C32402Cne(AbstractC32415Cnr abstractC32415Cnr) {
        super(abstractC32415Cnr);
    }

    @Override // X.AbstractC32415Cnr
    public final void LIZ(C32399Cnb c32399Cnb) {
        HashMap<String, C32417Cnt> hashMap;
        LinkedList<C32399Cnb> linkedList;
        if (c32399Cnb != null && (hashMap = c32399Cnb.LIZ) != null && hashMap.containsKey(c32399Cnb.LIZ())) {
            C32417Cnt c32417Cnt = c32399Cnb.LIZ.get(c32399Cnb.LIZ());
            if (c32417Cnt != null && (linkedList = c32417Cnt.LIZ) != null) {
                Iterator<C32399Cnb> it = linkedList.iterator();
                while (it.hasNext()) {
                    C32399Cnb next = it.next();
                    next.LJII = c32399Cnb.LJII;
                    next.LJIIIIZZ = c32399Cnb.LJIIIIZZ;
                    next.LJIIL = c32399Cnb.LJIIL;
                    next.LJIIJJI = c32399Cnb.LJIIJJI;
                    String str = c32399Cnb.LJIIJ;
                    o.LJIIIZ(str, "<set-?>");
                    next.LJIIJ = str;
                    next.LIZIZ(c32399Cnb.LJIIIZ);
                    AbstractC32415Cnr abstractC32415Cnr = this.LIZ;
                    if (abstractC32415Cnr != null) {
                        abstractC32415Cnr.LIZ(next);
                    }
                }
            }
            c32399Cnb.LIZ.remove(c32399Cnb.LIZ());
        }
    }
}
