package X;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: X.Qc4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67356Qc4 {
    public static final SparseArray<EnumC67357Qc5> LIZ = new SparseArray<>();
    public static final HashMap<EnumC67357Qc5, Integer> LIZIZ;

    static {
        HashMap<EnumC67357Qc5, Integer> hashMap = new HashMap<>();
        LIZIZ = hashMap;
        hashMap.put(EnumC67357Qc5.DEFAULT, 0);
        hashMap.put(EnumC67357Qc5.VERY_LOW, 1);
        hashMap.put(EnumC67357Qc5.HIGHEST, 2);
        for (EnumC67357Qc5 enumC67357Qc5 : hashMap.keySet()) {
            LIZ.append(LIZIZ.get(enumC67357Qc5).intValue(), enumC67357Qc5);
        }
    }

    public static int LIZ(EnumC67357Qc5 enumC67357Qc5) {
        Integer num = LIZIZ.get(enumC67357Qc5);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PriorityMapping is missing known Priority value ");
        LIZ2.append(enumC67357Qc5);
        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
    }

    public static EnumC67357Qc5 LIZIZ(int i) {
        EnumC67357Qc5 enumC67357Qc5 = LIZ.get(i);
        if (enumC67357Qc5 != null) {
            return enumC67357Qc5;
        }
        throw new IllegalArgumentException(KMP.LJ("Unknown Priority for value ", i));
    }
}
