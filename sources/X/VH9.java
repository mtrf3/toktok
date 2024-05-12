package X;

import Y.IDComparatorS42S0000000_14;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.playerkit.configpicker.MultiDimensionalConditionConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VH9 {
    public List<String> LIZ;

    public final VH6 LIZ(List<VH6> list) {
        String str;
        List<String> list2 = this.LIZ;
        if (list2 == null || list2.size() == 0) {
            return (VH6) ListProtector.get(list, 0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            VH6 vh6 = (VH6) it.next();
            ArrayList arrayList2 = new ArrayList();
            java.util.Map<String, List<String>> map = vh6.LIZIZ;
            java.util.Map<String, List<String>> map2 = vh6.LIZJ;
            if (map != null) {
                arrayList2.addAll(map.keySet());
            }
            if (map2 != null) {
                arrayList2.addAll(map2.keySet());
            }
            if (arrayList2.size() != 0) {
                int size = arrayList2.size();
                char[] cArr = new char[size];
                int i = 0;
                while (true) {
                    if (i < size) {
                        int indexOf = this.LIZ.indexOf(ListProtector.get(arrayList2, i));
                        if (indexOf < 0) {
                            str = null;
                            break;
                        }
                        cArr[i] = (char) (indexOf + 48);
                        i++;
                    } else {
                        Arrays.sort(cArr);
                        str = new String(cArr);
                        break;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new VHA(vh6, str));
                }
            }
        }
        Collections.sort(arrayList, new IDComparatorS42S0000000_14(0));
        if (arrayList.size() == 0) {
            return (VH6) ListProtector.get(list, 0);
        }
        return ((VHA) ListProtector.get(arrayList, 0)).LIZ;
    }

    public final void LIZIZ(VHN vhn) {
        List<String> list;
        List<String> list2;
        if (this.LIZ == null) {
            MultiDimensionalConditionConfig multiDimensionalConditionConfig = vhn.LJII;
            MultiDimensionalConditionConfig multiDimensionalConditionConfig2 = vhn.LJI;
            if (multiDimensionalConditionConfig != null && (list2 = multiDimensionalConditionConfig.priorityConfig) != null && list2.size() > 0) {
                this.LIZ = multiDimensionalConditionConfig.priorityConfig;
            } else if (multiDimensionalConditionConfig2 != null && (list = multiDimensionalConditionConfig2.priorityConfig) != null && list.size() > 0) {
                this.LIZ = multiDimensionalConditionConfig2.priorityConfig;
            } else {
                this.LIZ = new ArrayList();
            }
        }
    }
}
