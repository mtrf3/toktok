package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.OAe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61460OAe extends AbstractC58324Mum {
    public final List<String> LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final AtomicLong LJI;
    public final C58326Muo LJII;

    @Override // X.AbstractC58324Mum
    public final java.util.Map<String, List<String>> LIZ() {
        C58326Muo c58326Muo = this.LJII;
        java.util.Map<String, List<String>> map = c58326Muo.LIZIZ;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : c58326Muo.LIZ) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        java.util.Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
        c58326Muo.LIZIZ = unmodifiableMap;
        return unmodifiableMap;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        List<String> list = this.LIZ;
        return C16880lQ.LLLZI(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new Object[]{Integer.toHexString(System.identityHashCode(this)), C64504PTg.LIZIZ(list, -1, list), this.LIZ.toString(), Integer.valueOf(this.LIZIZ), this.LIZJ, this.LJII.LIZ.toString(), Boolean.valueOf(this.LIZLLL), this.LJ, this.LJFF, Long.valueOf(this.LJI.get())});
    }

    public C61460OAe(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3, long j) {
        this.LIZ = Collections.unmodifiableList(list);
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LJII = new C58326Muo(Collections.unmodifiableList(list2));
        this.LIZLLL = z;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = new AtomicLong(j);
    }
}
