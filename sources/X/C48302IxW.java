package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IxW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48302IxW {
    public static volatile C48302IxW LIZ;

    public static C48302IxW LIZ() {
        if (LIZ == null) {
            synchronized (C48302IxW.class) {
                if (LIZ == null) {
                    LIZ = new C48302IxW();
                }
            }
        }
        return LIZ;
    }

    public static List LIZIZ(String str) {
        ArrayList arrayList = new ArrayList();
        if (C38354F3m.LJ(str)) {
            return arrayList;
        }
        for (String str2 : str.split(",")) {
            if (!C38354F3m.LJ(str2)) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }
}
