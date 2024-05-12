package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.playerkit.configpicker.MultiDimensionalConditionConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VH8 {
    public VHN LIZ;
    public List<List<VH6>> LIZIZ;
    public List<VH6> LIZJ;

    public final List<List<VH6>> LIZ() {
        List LIZIZ = LIZIZ(this.LIZ.LJI);
        List LIZIZ2 = LIZIZ(this.LIZ.LJII);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZIZ);
        arrayList.addAll(LIZIZ2);
        Collections.sort(arrayList, new VH7());
        ArrayList arrayList2 = new ArrayList();
        this.LIZJ = arrayList2;
        arrayList2.addAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ArrayList arrayList4 = new ArrayList();
            for (int i2 = 0; i2 < size - i; i2++) {
                int i3 = i + i2;
                arrayList4.add(ListProtector.get(arrayList, i3));
                int i4 = i3 + 1;
                if (i4 >= size || ((VH6) ListProtector.get(arrayList, i4)).LIZ() >= ((VH6) ListProtector.get(arrayList, i)).LIZ()) {
                }
            }
            arrayList3.add(arrayList4);
            i += arrayList4.size();
        }
        return arrayList3;
    }

    public static List LIZIZ(MultiDimensionalConditionConfig multiDimensionalConditionConfig) {
        List<MultiDimensionalConditionConfig.ConditionConfig> list;
        ArrayList arrayList = new ArrayList();
        if (multiDimensionalConditionConfig != null && (list = multiDimensionalConditionConfig.configList) != null && list.size() != 0) {
            String str = multiDimensionalConditionConfig.libraVid;
            Iterator<MultiDimensionalConditionConfig.ConditionConfig> it = multiDimensionalConditionConfig.configList.iterator();
            while (it.hasNext()) {
                VH6 vh6 = new VH6(it.next());
                vh6.LJ = str;
                arrayList.add(vh6);
            }
        }
        return arrayList;
    }
}
