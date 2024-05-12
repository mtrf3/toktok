package X;

import android.util.ArrayMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Pvt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66037Pvt {
    public static final C66037Pvt LIZIZ = new C66037Pvt();
    public final ArrayMap<Integer, List<InterfaceC66039Pvv>> LIZ = new ArrayMap<>(7);

    public final void LIZIZ(InterfaceC66039Pvv interfaceC66039Pvv) {
        synchronized (this) {
            int LIZ = interfaceC66039Pvv.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("registerEventHandler: ");
            LIZ2.append(interfaceC66039Pvv.LIZ());
            LIZ2.append("->");
            LIZ2.append(interfaceC66039Pvv);
            C66063PwJ.LIZIZ("EventHandler", X1D.LIZIZ(LIZ2));
            List<InterfaceC66039Pvv> list = this.LIZ.get(Integer.valueOf(LIZ));
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
            }
            list.add(interfaceC66039Pvv);
            this.LIZ.put(Integer.valueOf(LIZ), list);
        }
    }

    public final void LIZ(int i, C66120PxE c66120PxE) {
        List<InterfaceC66039Pvv> list = this.LIZ.get(Integer.valueOf(i));
        if (list != null && list.size() > 0) {
            Iterator<InterfaceC66039Pvv> it = list.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ(c66120PxE);
            }
        }
    }
}
