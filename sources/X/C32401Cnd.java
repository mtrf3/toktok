package X;

import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Cnd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32401Cnd extends AbstractC32397CnZ {
    public C32401Cnd(C32398Cna c32398Cna) {
        super(c32398Cna);
    }

    @Override // X.AbstractC32397CnZ
    public final void LIZ(AbstractC32415Cnr abstractC32415Cnr, C32399Cnb c32399Cnb) {
        LinkedList<C32399Cnb> linkedList;
        HashMap<String, C32417Cnt> hashMap;
        Boolean bool = null;
        if (c32399Cnb != null && (hashMap = c32399Cnb.LIZ) != null) {
            bool = Boolean.valueOf(hashMap.containsKey(c32399Cnb.LIZ()));
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            C32417Cnt c32417Cnt = c32399Cnb.LIZ.get(c32399Cnb.LIZ());
            if (c32417Cnt != null && (linkedList = c32417Cnt.LIZ) != null) {
                linkedList.add(c32399Cnb);
                return;
            }
            return;
        }
        if (c32399Cnb == null || c32399Cnb.LIZ == null) {
            return;
        }
        C32417Cnt c32417Cnt2 = new C32417Cnt();
        c32399Cnb.LIZ.put(c32399Cnb.LIZ(), c32417Cnt2);
        LinkedList<C32399Cnb> linkedList2 = c32417Cnt2.LIZ;
        if (linkedList2 != null) {
            linkedList2.add(c32399Cnb);
        }
        C32402Cne c32402Cne = new C32402Cne(abstractC32415Cnr);
        AbstractC32397CnZ abstractC32397CnZ = this.LIZ;
        if (abstractC32397CnZ == null) {
            return;
        }
        abstractC32397CnZ.LIZ(c32402Cne, c32399Cnb);
    }
}
