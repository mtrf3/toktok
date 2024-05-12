package X;

import X.C95U;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.95Y, reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C95Y<T extends C95U> implements C94Y {
    public abstract Class<T[]> LIZIZ();

    public abstract int LIZJ();

    public abstract BaseTouchPointDataVM LIZLLL();

    /* JADX WARN: Multi-variable type inference failed */
    public List<C95U> LJ(HashMap<Integer, TouchPoint> touchPointsMap, List<? extends C95U> list) {
        o.LJIIIZ(touchPointsMap, "touchPointsMap");
        return list;
    }

    @Override // X.C94Y
    public final void LIZ(HashMap<Integer, TouchPoint> touchPointsMap) {
        ArrayList arrayList;
        int i;
        o.LJIIIZ(touchPointsMap, "touchPointsMap");
        try {
            TouchPoint touchPoint = touchPointsMap.get(Integer.valueOf(LIZJ()));
            if (touchPoint != null) {
                String str = touchPoint.data;
                Class<T[]> LIZIZ = LIZIZ();
                if (C62819Ol5.LJLIL == null) {
                    C62819Ol5.LJLIL = new Gson();
                }
                Object[] objArr = (Object[]) GsonProtectorUtils.fromJson(C62819Ol5.LJLIL, str, (Class) LIZIZ);
                if (objArr == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(Arrays.asList(objArr));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C95U c95u = (C95U) it.next();
                        if (c95u != null) {
                            c95u.LIZ = touchPoint.touchPointId;
                            c95u.LIZ(touchPoint.touchPointName);
                            Integer num = touchPoint.launchPlanId;
                            if (num != null) {
                                i = num.intValue();
                            } else {
                                i = -1;
                            }
                            c95u.LIZJ = Integer.valueOf(i);
                            String str2 = touchPoint.abVersions;
                            if (str2 == null) {
                                str2 = "";
                            }
                            c95u.LIZLLL = str2;
                            c95u.LJ = touchPoint.customEventParams;
                        }
                    }
                }
                C2MW.LIZ().LJI.put(Integer.valueOf(LIZJ()), LJ(touchPointsMap, arrayList));
                BaseTouchPointDataVM LIZLLL = LIZLLL();
                if (LIZLLL != null) {
                    LIZLLL.gv0();
                    return;
                }
                return;
            }
            if (this instanceof C9OQ) {
                C2MW.LIZ().LJI.put(Integer.valueOf(LIZJ()), LJ(touchPointsMap, null));
                BaseTouchPointDataVM LIZLLL2 = LIZLLL();
                if (LIZLLL2 != null) {
                    LIZLLL2.gv0();
                }
            }
        } catch (Exception unused) {
        }
    }
}
