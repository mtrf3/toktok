package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.RXv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69719RXv extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        List<InterfaceC27632Asu> LIZ;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        if ((((!pdpViewModel.Zv0() || !ry7.LIZLLL) && PdpViewModel.Nv0(ry7.LIZ)) || ry7.LJ) && !ry7.LIZLLL && (LIZ = C27614Asc.LIZ(ry7.LIZ, pdpViewModel, null)) != null) {
            LJ.addAll(ORZ.LJLL(LIZ));
        }
        return LJ;
    }
}
