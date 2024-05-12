package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class VHJ {
    public VHN LIZ;
    public List<List<ConditionConfig>> LIZIZ;
    public List<ConditionConfig> LIZJ;

    public final List<List<ConditionConfig>> LIZ() {
        Type type = new VHP().getType();
        Collection collection = (Collection) C36901Ee1.LIZ(this.LIZ.LIZ, type);
        Collection collection2 = (Collection) C36901Ee1.LIZ(this.LIZ.LIZIZ, type);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            arrayList.addAll(collection);
        }
        if (collection2 != null) {
            arrayList.addAll(collection2);
        }
        Collections.sort(arrayList, new VH5());
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
                if (i4 >= size || ((ConditionConfig) ListProtector.get(arrayList, i4)).LIZ() >= ((ConditionConfig) ListProtector.get(arrayList, i)).LIZ()) {
                }
            }
            arrayList3.add(arrayList4);
            i += arrayList4.size();
        }
        return arrayList3;
    }
}
