package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.BKi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28600BKi<T> {
    public static C28600BKi LIZIZ;
    public final java.util.Map<String, C28599BKh> LIZ = new ConcurrentHashMap();

    public static C28600BKi LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C28600BKi.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C28600BKi();
                }
            }
        }
        return LIZIZ;
    }

    public final C28599BKh LIZJ(String str) {
        C28599BKh c28599BKh = (C28599BKh) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c28599BKh == null) {
            C28599BKh c28599BKh2 = new C28599BKh();
            ((ConcurrentHashMap) this.LIZ).put(str, c28599BKh2);
            return c28599BKh2;
        }
        return c28599BKh;
    }

    public final Object LIZ(int i, Class cls) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cls.getName());
        LIZ.append(i);
        C28599BKh LIZJ = LIZJ(X1D.LIZIZ(LIZ));
        if (((ArrayList) LIZJ.LIZ).size() >= 1) {
            List list = LIZJ.LIZ;
            return ListProtector.remove(list, ((ArrayList) list).size() - 1);
        }
        return null;
    }

    public final void LIZLLL(int i, Object obj) {
        Class<?> cls = obj.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cls.getName());
        LIZ.append(i);
        ArrayList arrayList = (ArrayList) LIZJ(X1D.LIZIZ(LIZ)).LIZ;
        int size = arrayList.size();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(cls.getName());
        LIZ2.append(i);
        if (size < LIZJ(X1D.LIZIZ(LIZ2)).LIZIZ && !arrayList.contains(obj)) {
            arrayList.add(obj);
        }
    }
}
