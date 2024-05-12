package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.3Zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C86043Zg extends TBS implements InterfaceC88471Ynr<List<? extends C86023Ze>, String, List<? extends C86033Zf>> {
    public C86043Zg(C86233Zz c86233Zz) {
        super(2, c86233Zz, C86233Zz.class, "groupByBusinessInfo", "groupByBusinessInfo(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends C86033Zf> invoke(List<? extends C86023Ze> list, String str) {
        List<? extends C86023Ze> p0 = list;
        String p1 = str;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.receiver.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C86023Ze c86023Ze : p0) {
            C86023Ze c86023Ze2 = c86023Ze;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c86023Ze2.LJLIL);
            LIZ.append('_');
            LIZ.append(c86023Ze2.LJLILLLLZI);
            String LIZIZ = X1D.LIZIZ(LIZ);
            Object obj = linkedHashMap.get(LIZIZ);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(LIZIZ, obj);
            }
            ((List) obj).add(c86023Ze);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            if (!list2.isEmpty()) {
                C86023Ze c86023Ze3 = (C86023Ze) ORZ.LJLLJ(list2);
                arrayList.add(new C86033Zf(c86023Ze3.LJLIL, c86023Ze3.LJLILLLLZI, p1, ORZ.LLJILJILJ(list2)));
            }
        }
        return arrayList;
    }
}
