package X;

import Y.IDComparatorS42S0000000_14;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VHL {
    public List<String> LIZ;

    public final ConditionConfig LIZ(List<ConditionConfig> list) {
        String str;
        List<String> list2 = this.LIZ;
        if (list2 == null || list2.size() == 0) {
            return (ConditionConfig) ListProtector.get(list, 0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ConditionConfig conditionConfig = (ConditionConfig) it.next();
            ArrayList arrayList2 = new ArrayList();
            java.util.Map<String, List<String>> map = conditionConfig.clientFilterRequirement;
            java.util.Map<String, List<String>> map2 = conditionConfig.serverFilterRequirement;
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
                    arrayList.add(new VHQ(conditionConfig, str));
                }
            }
        }
        Collections.sort(arrayList, new IDComparatorS42S0000000_14(4));
        if (arrayList.size() == 0) {
            return (ConditionConfig) ListProtector.get(list, 0);
        }
        return ((VHQ) ListProtector.get(arrayList, 0)).LIZ;
    }

    public final void LIZIZ(VHN vhn) {
        if (this.LIZ == null) {
            this.LIZ = (List) C36901Ee1.LIZ(vhn.LIZLLL, new TypeToken<List<String>>() { // from class: X.2ZB
            }.getType());
        }
    }
}
