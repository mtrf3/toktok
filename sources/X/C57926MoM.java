package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MoM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57926MoM implements InterfaceC57861MnJ {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final LinkedHashMap<String, List<RecUser>> LIZIZ = new LinkedHashMap<>();

    public C57926MoM(AqS159S0100000_9 aqS159S0100000_9) {
        this.LIZ = aqS159S0100000_9;
    }

    @Override // X.InterfaceC57861MnJ
    public final List<InterfaceC57927MoN> LIZ(C57850Mn8 c57850Mn8) {
        if (this.LIZIZ.isEmpty()) {
            return c57850Mn8.LIZ;
        }
        List<InterfaceC57927MoN> list = c57850Mn8.LIZ;
        for (Map.Entry<String, List<RecUser>> entry : this.LIZIZ.entrySet()) {
            String key = entry.getKey();
            List<RecUser> value = entry.getValue();
            Iterator<InterfaceC57927MoN> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(it.next().getElementId(), key)) {
                    if (i >= 0) {
                        ArrayList arrayList = new ArrayList(C32I.LJJL(value, 10));
                        Iterator<RecUser> it2 = value.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().getUid());
                        }
                        java.util.Set LLJJ = ORZ.LLJJ(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (InterfaceC57927MoN interfaceC57927MoN : list) {
                            if (!LLJJ.contains(interfaceC57927MoN.getElementId())) {
                                arrayList2.add(interfaceC57927MoN);
                            }
                        }
                        list = ORZ.LLJILJILJ(arrayList2);
                        int i2 = i + 1;
                        ArrayList arrayList3 = (ArrayList) list;
                        int size = arrayList3.size();
                        if (i2 > size) {
                            i2 = size;
                        }
                        arrayList3.addAll(i2, value);
                    }
                } else {
                    i++;
                }
            }
        }
        return list;
    }
}
