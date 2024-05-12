package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K02 {
    public static final java.util.Map<String, java.util.Set<K03>> LIZ = new HashMap();
    public static int LIZIZ;

    public static final java.util.Map LIZIZ(String eventKey, Aweme aweme, String str) {
        o.LJIIIZ(eventKey, "eventKey");
        return LIZ(aweme, eventKey, str, null);
    }

    public static final java.util.Map<String, String> LIZ(Aweme aweme, String str, String str2, JHA jha) {
        String str3;
        HashMap LIZ2 = C1R5.LIZ(str, "eventKey");
        java.util.Map<String, java.util.Set<K03>> map = LIZ;
        o.LJI(map);
        java.util.Set set = (java.util.Set) ((HashMap) map).get(str);
        if (set != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (((K03) obj).LIZJ == LIZIZ) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    K03 k03 = (K03) it.next();
                    K04 k04 = k03.LIZIZ;
                    String str4 = "";
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (k04.LJIJI(str3)) {
                        K04 k042 = k03.LIZIZ;
                        if (str2 != null) {
                            str4 = str2;
                        }
                        String LJJJIL = k042.LJJJIL(aweme, str4, LIZIZ, jha);
                        if (!TextUtils.isEmpty(k03.LIZ) && !TextUtils.isEmpty(LJJJIL)) {
                            LIZ2.put(k03.LIZ, LJJJIL);
                        }
                    }
                }
            }
        }
        return LIZ2;
    }

    public static final void LIZJ(String str, String str2, QXX method, int i) {
        o.LJIIIZ(method, "method");
        java.util.Map<String, java.util.Set<K03>> map = LIZ;
        o.LJI(map);
        HashMap hashMap = (HashMap) map;
        java.util.Set set = (java.util.Set) hashMap.get(str);
        if (set == null) {
            set = new LinkedHashSet();
            hashMap.put(str, set);
        }
        set.add(new K03(str2, method, i));
    }
}
