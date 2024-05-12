package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.0g9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13610g9 {
    public final List<InterfaceC13600g8> LIZ;
    public final boolean LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C13610g9(InterfaceC13600g8... settings) {
        o.LJIIIZ(settings, "settings");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC13600g8 interfaceC13600g8 : settings) {
            String LIZJ = interfaceC13600g8.LIZJ();
            Object obj = linkedHashMap.get(LIZJ);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(LIZJ, obj);
            }
            ((List) obj).add(interfaceC13600g8);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                ORS.LJJLIIIJILLIZJL(list, arrayList);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('\'');
                LIZ.append(str);
                LIZ.append("' must be unique. Actual [ [");
                String LIZIZ = q.LIZIZ(LIZ, ORZ.LLD(list, null, null, null, null, 63), ']', LIZ);
                LIZIZ.toString();
                throw new IllegalArgumentException(LIZIZ);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.LIZ = arrayList2;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC13600g8) ListProtector.get(arrayList2, i)).LIZ();
        }
        this.LIZIZ = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C13610g9) && o.LJ(this.LIZ, ((C13610g9) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
