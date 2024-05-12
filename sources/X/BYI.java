package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BYI {
    public static final ConcurrentHashSet<BWZ> LIZ = new ConcurrentHashSet<>();
    public static final ConcurrentHashMap<BWZ, InterfaceC88472Yns<Boolean, C76800UCe>> LIZIZ = new ConcurrentHashMap<>();

    public static boolean LIZ(BWZ businessType) {
        o.LJIIIZ(businessType, "businessType");
        ConcurrentHashSet<BWZ> concurrentHashSet = LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<BWZ> it = concurrentHashSet.iterator();
        while (it.hasNext()) {
            BWZ next = it.next();
            if (next != businessType) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((BWZ) it2.next()).getFlag()));
        }
        int flag = businessType.getFlag();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            flag &= ((Number) it3.next()).intValue();
        }
        if (flag == 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(BWZ businessType) {
        o.LJIIIZ(businessType, "businessType");
        return LIZ.contains(businessType);
    }

    public static void LIZJ(BWZ businessType) {
        o.LJIIIZ(businessType, "businessType");
        LIZ.add(businessType);
        for (Map.Entry<BWZ, InterfaceC88472Yns<Boolean, C76800UCe>> entry : LIZIZ.entrySet()) {
            entry.getValue().invoke(Boolean.valueOf(LIZ(entry.getKey())));
        }
    }

    public static void LIZLLL(BWZ businessType) {
        o.LJIIIZ(businessType, "businessType");
        LIZ.remove(businessType);
        for (Map.Entry<BWZ, InterfaceC88472Yns<Boolean, C76800UCe>> entry : LIZIZ.entrySet()) {
            entry.getValue().invoke(Boolean.valueOf(LIZ(entry.getKey())));
        }
    }
}
