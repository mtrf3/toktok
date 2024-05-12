package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IyR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48359IyR {
    public static final List<Long> LIZ = new ArrayList();

    public static void LIZ(long j) {
        List<Long> list = LIZ;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() < 30) {
            arrayList.add(Long.valueOf(j));
        } else {
            ListProtector.set(list, 0, Long.valueOf(j));
        }
    }
}
