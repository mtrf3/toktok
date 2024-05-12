package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class INR {
    public static boolean LIZ(Aweme aweme) {
        Object next;
        boolean z;
        boolean z2;
        List<INT> list = FeedPipViewModel.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            INS ins = ((INT) next2).LIZIZ;
            Object obj = linkedHashMap.get(ins);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(ins, obj);
            }
            ((List) obj).add(next2);
        }
        List list2 = (List) linkedHashMap.get(INS.ALLOW);
        Object obj2 = null;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Boolean.valueOf(((INT) it2.next()).LIZJ.invoke(aweme).booleanValue()));
            }
            Iterator it3 = arrayList.iterator();
            if (!it3.hasNext()) {
                next = null;
            } else {
                next = it3.next();
                while (it3.hasNext()) {
                    boolean booleanValue = ((Boolean) it3.next()).booleanValue();
                    if (((Boolean) next).booleanValue() || booleanValue) {
                        z = true;
                    } else {
                        z = false;
                    }
                    next = Boolean.valueOf(z);
                }
            }
            Boolean bool = (Boolean) next;
            if (bool != null && bool.booleanValue()) {
                List list3 = (List) linkedHashMap.get(INS.BLOCK);
                if (list3 == null) {
                    return true;
                }
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(Boolean.valueOf(((INT) it4.next()).LIZJ.invoke(aweme).booleanValue()));
                }
                Iterator it5 = arrayList2.iterator();
                if (it5.hasNext()) {
                    obj2 = it5.next();
                    while (it5.hasNext()) {
                        boolean booleanValue2 = ((Boolean) it5.next()).booleanValue();
                        if (((Boolean) obj2).booleanValue() || booleanValue2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        obj2 = Boolean.valueOf(z2);
                    }
                }
                Boolean bool2 = (Boolean) obj2;
                if (bool2 == null || !bool2.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
