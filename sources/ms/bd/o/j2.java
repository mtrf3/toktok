package ms.bd.o;

import X.C66455Q6h;
import X.FQ7;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public class j2 extends g2 {
    public long LIZ;

    public final void finalize() {
        k.a(100663298, 0, this.LIZ, null, null);
        this.LIZ = -1L;
        super.finalize();
    }

    /* loaded from: classes7.dex */
    public class a implements FQ7 {
        public a() {
        }

        @Override // X.FQ7
        public final Map<String, String> LIZIZ(Map<String, String> map) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object key = entry.getKey();
                String lowerCase = ((String) entry.getValue()).toLowerCase();
                if (key != null && !lowerCase.equals("")) {
                    arrayList.add(key);
                    arrayList.add(lowerCase);
                }
            }
            String[] strArr = (String[]) k.a(100663297, 0, j2.this.LIZ, "", arrayList.toArray(new String[0]));
            if (strArr != null) {
                hashMap = new HashMap();
                for (int i = 0; i < strArr.length; i += 2) {
                    hashMap.put(strArr[i], strArr[i + 1]);
                }
            }
            return hashMap;
        }

        @Override // X.FQ7
        public final Map<String, String> LIZ(String str, Map<String, List<String>> map) {
            int i;
            String str2;
            HashMap hashMap = new HashMap();
            if (str != null && !str.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(k.a(16777217, 0, 0L, "0ff01e", new byte[]{20, 86, 57}));
                arrayList.add(str);
                Iterator it = ((TreeMap) map).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if (entry.getValue() != null && ((List) entry.getValue()).size() > 0) {
                        str2 = ((String) ListProtector.get((List) entry.getValue(), 0)).toLowerCase();
                    } else {
                        str2 = null;
                    }
                    if (key != null && str2 != null && !str2.equals("")) {
                        arrayList.add(key);
                        arrayList.add(str2);
                    }
                }
                String[] strArr = (String[]) k.a(100663297, 0, j2.this.LIZ, str, arrayList.toArray(new String[0]));
                if (strArr != null) {
                    HashMap hashMap2 = new HashMap();
                    for (i = 0; i < strArr.length; i += 2) {
                        hashMap2.put(strArr[i], strArr[i + 1]);
                    }
                    return hashMap2;
                }
            }
            return hashMap;
        }
    }

    @Override // ms.bd.o.g2
    public final Object LIZJ(long j) {
        this.LIZ = j;
        C66455Q6h.LIZJ = new a();
        return null;
    }
}
