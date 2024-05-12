package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.EOz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36365EOz implements EYT {
    public boolean LIZ;
    public final Object LIZIZ = new Object();

    public final void LIZ() {
        if (!"ActionReaper".equals(C16880lQ.LLLLIIIILLL().getName())) {
            synchronized (this.LIZIZ) {
                if (!this.LIZ) {
                    try {
                        Thread.sleep(1500L);
                    } catch (Exception unused) {
                    }
                    this.LIZ = true;
                }
            }
        }
    }

    public static final void LIZIZ(List<C66619QCp> list, boolean z) {
        HashMap hashMap = new HashMap();
        QJY.LJI(hashMap, z);
        for (Map.Entry entry : hashMap.entrySet()) {
            list.add(new C66619QCp((String) entry.getKey(), (String) entry.getValue()));
        }
    }
}
