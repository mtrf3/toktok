package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0k4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16040k4 {
    public static C33861Uo LIZ() {
        List<InterfaceC16050k5> LIZ = C16070k7.LIZ.LIZ();
        ArrayList arrayList = new ArrayList(LIZ.size());
        int size = LIZ.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C16030k3((InterfaceC16050k5) ListProtector.get(LIZ, i)));
        }
        return new C33861Uo(arrayList);
    }
}
