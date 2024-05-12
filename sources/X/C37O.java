package X;

import com.bytedance.keva.Keva;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.37O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37O {
    public static C82253Kr LIZIZ() {
        C82253Kr c82253Kr = C82253Kr.LLFFF;
        if (c82253Kr == null) {
            synchronized (C82253Kr.class) {
                c82253Kr = C82253Kr.LLFFF;
                if (c82253Kr == null) {
                    c82253Kr = new C82253Kr();
                    C82253Kr.LLFFF = c82253Kr;
                }
            }
        }
        return c82253Kr;
    }

    public static long LIZ(List list) {
        Keva kevaRepo = Keva.getRepo(C72302sc.LIZ());
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        long j = kevaRepo.getLong("stranger_update_time", -1L);
        String LIZ = C72302sc.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getTime - ");
        LIZ2.append(j);
        C34B.LJI(LIZ, X1D.LIZIZ(LIZ2));
        if (list == null || list.isEmpty()) {
            return -1L;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            long updatedTime = ((C63120Opw) it.next()).getUpdatedTime();
            while (it.hasNext()) {
                long updatedTime2 = ((C63120Opw) it.next()).getUpdatedTime();
                if (updatedTime < updatedTime2) {
                    updatedTime = updatedTime2;
                }
            }
            Keva kevaRepo2 = Keva.getRepo(C72302sc.LIZ());
            o.LJIIIIZZ(kevaRepo2, "kevaRepo");
            String LIZ3 = C72302sc.LIZ();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("storeTime - ");
            LIZ4.append(updatedTime);
            C34B.LJI(LIZ3, X1D.LIZIZ(LIZ4));
            kevaRepo2.storeLong("stranger_update_time", updatedTime);
            if (updatedTime > j) {
                C72302sc.LIZJ(true);
            }
            return updatedTime;
        }
        throw new NoSuchElementException();
    }
}
