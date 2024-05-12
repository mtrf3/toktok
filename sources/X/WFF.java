package X;

import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class WFF {
    public final ArrayList<WFI> LIZ = new ArrayList<>();
    public final SparseArray<WFI> LIZIZ = new SparseArray<>();
    public final ArrayDeque<WFI> LIZJ = new ArrayDeque<>();

    public final void LIZ(boolean z, java.util.Map<View, Integer> map, int i, View[] viewArr, int... iArr) {
        int i2;
        WFI wfi;
        SparseArray<WFI> sparseArray = this.LIZIZ;
        ArrayList<WFI> arrayList = this.LIZ;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            WFI wfi2 = (WFI) ListProtector.get(arrayList, i3);
            wfi2.LIZIZ.clear();
            wfi2.LIZJ.clear();
        }
        for (int i4 = 0; i4 < size; i4++) {
            WFI wfi3 = (WFI) ListProtector.get(arrayList, i4);
            int[] rules = ((WFH) wfi3.LIZ.getLayoutParams()).getRules();
            for (int i5 : iArr) {
                int i6 = rules[i5];
                if ((i6 > 0 || (i6 != -1 && ((-16777216) & i6) != 0 && (16711680 & i6) != 0)) && (wfi = sparseArray.get(i6)) != null && wfi != wfi3) {
                    wfi.LIZIZ.put(wfi3, this);
                    wfi3.LIZJ.put(i6, wfi);
                }
            }
        }
        ArrayDeque<WFI> arrayDeque = this.LIZJ;
        arrayDeque.clear();
        for (int i7 = 0; i7 < size; i7++) {
            WFI wfi4 = (WFI) ListProtector.get(arrayList, i7);
            if (wfi4.LIZJ.size() == 0) {
                arrayDeque.addLast(wfi4);
            }
        }
        int i8 = 0;
        while (true) {
            WFI pollLast = arrayDeque.pollLast();
            if (pollLast == null) {
                break;
            }
            View view = pollLast.LIZ;
            int id = view.getId();
            int i9 = i8 + 1;
            viewArr[i8] = view;
            ArrayMap<WFI, WFF> arrayMap = pollLast.LIZIZ;
            int size2 = arrayMap.size();
            for (int i10 = 0; i10 < size2; i10++) {
                WFI keyAt = arrayMap.keyAt(i10);
                SparseArray<WFI> sparseArray2 = keyAt.LIZJ;
                sparseArray2.remove(id);
                if (sparseArray2.size() == 0) {
                    arrayDeque.add(keyAt);
                }
            }
            if (z) {
                if (size2 == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                int i11 = i2 * i;
                if (map.containsKey(view)) {
                    map.put(view, Integer.valueOf(map.get(view).intValue() + i11));
                } else {
                    map.put(view, Integer.valueOf(i11));
                }
            }
            i8 = i9;
        }
        if (i8 < viewArr.length) {
            throw new IllegalStateException("Circular dependencies cannot exist in RelativeLayout");
        }
    }
}
