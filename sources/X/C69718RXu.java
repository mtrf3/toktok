package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.RXu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69718RXu extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        Object obj2;
        List list;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        if ((((!pdpViewModel.Zv0() || !ry7.LIZLLL) && PdpViewModel.Nv0(ry7.LIZ)) || ry7.LJ) && !ry7.LIZLLL) {
            java.util.Map<String, ? extends Object> map = this.LIZ;
            ArrayList arrayList = null;
            if (map != null) {
                obj2 = map.get("show_bricks");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof List) && (list = (List) obj2) != null) {
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof String) {
                        arrayList.add(obj3);
                    }
                }
            }
            List<InterfaceC27632Asu> LIZ = C27614Asc.LIZ(ry7.LIZ, pdpViewModel, arrayList);
            if (LIZ != null) {
                LJ.addAll(ORZ.LJLL(LIZ));
            }
        }
        return LJ;
    }
}
