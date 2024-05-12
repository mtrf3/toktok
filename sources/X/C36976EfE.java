package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EfE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36976EfE {
    public static List<String> LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = EPA.LIZIZ().iterator();
        while (it.hasNext()) {
            String LIZIZ = C36970Ef8.LIZIZ(it.next());
            if (LIZIZ != null) {
                arrayList.add(LIZIZ);
            }
        }
        return arrayList;
    }

    public static void LIZIZ(AbstractC37134Ehm abstractC37134Ehm) {
        List LJJIJ = C47261Igj.LJJIJ(abstractC37134Ehm.LIZIZ);
        Iterable iterable = abstractC37134Ehm.LJI.LJII;
        if (iterable == null) {
            iterable = C61878OQg.INSTANCE;
        }
        List LJLJJL = ORZ.LJLJJL(ORZ.LLIIIZ(iterable, LJJIJ));
        String moduleName = abstractC37134Ehm.LIZ;
        o.LJIIIZ(moduleName, "moduleName");
        Keva repo = KevaImpl.getRepo("dynamic_task_triggered", 0);
        o.LJIIIIZZ(repo, "getKevaRepo()");
        C36455ESl LIZ = C36454ESk.LIZ(repo.getString(moduleName, null));
        if (LIZ == null) {
            LIZ = new C36455ESl(LJLJJL, 0L, 0);
        }
        long j = LIZ.LIZIZ;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        int i = LIZ.LIZJ + 1;
        List<String> packageNames = LIZ.LIZ;
        o.LJIIIZ(packageNames, "packageNames");
        KevaImpl.getRepo("dynamic_task_triggered", 0).storeString(abstractC37134Ehm.LIZ, new C36455ESl(packageNames, j, i).toString());
    }
}
