package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2Zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60672Zr {
    public static void LIZ(String str, String str2, C60682Zs c60682Zs) {
        if (str != null) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(str2);
                String LIZIZ = X1D.LIZIZ(LIZ);
                ConcurrentHashMap<String, List<C60682Zs>> concurrentHashMap = C39479FeV.LJI;
                if (concurrentHashMap.containsKey(LIZIZ)) {
                    List<C60682Zs> list = concurrentHashMap.get(LIZIZ);
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    if (list.size() >= 3) {
                        ListProtector.remove(list, 0);
                    }
                    list.add(c60682Zs);
                    concurrentHashMap.put(LIZIZ, list);
                } else {
                    concurrentHashMap.put(LIZIZ, C47261Igj.LJJIJIL(c60682Zs));
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}
