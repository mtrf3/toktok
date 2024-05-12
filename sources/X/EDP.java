package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EDP extends EDR {
    public final EDN LIZ() {
        EDQ edq;
        List list = (List) this.LIZIZ.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof EDO) {
                arrayList.add(obj);
            }
        }
        String str = this.LIZ;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((EDO) it.next()).LJLJI) {
                    edq = EDQ.CRITICAL;
                    break;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((EDO) it2.next()).LJLILLLLZI != EnumC36074EDu.REDUNDANT) {
                    edq = EDQ.ERROR;
                    break;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            edq = EDQ.WARNING;
        } else {
            edq = EDQ.SUCCESS;
        }
        return new EDN(str, edq, arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDP(String checker) {
        super(checker);
        o.LJIIIZ(checker, "checker");
    }

    public final void LIZIZ(String key, EnumC36074EDu type, boolean z) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(type, "type");
        ((List) this.LIZIZ.getValue()).add(new EDO(key, type, z));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("putParamError: ");
        LIZ.append(key);
        LIZ.append(", ");
        LIZ.append(type);
        LIZ.append(", ");
        LIZ.append(z);
        String message = X1D.LIZIZ(LIZ);
        o.LJIIIZ(message, "message");
    }
}
