package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rhj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70255Rhj implements InterfaceC70263Rhr<C70256Rhk> {
    public final /* synthetic */ C70254Rhi LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ List<SkuItem> LIZJ;
    public final /* synthetic */ SaleProp LIZLLL;
    public final /* synthetic */ InterfaceC70268Rhw LJ;

    @Override // X.InterfaceC70263Rhr
    public final C70256Rhk LIZ(C70256Rhk c70256Rhk) {
        int LIZ;
        boolean z;
        C70256Rhk data = c70256Rhk;
        o.LJIIIZ(data, "data");
        boolean z2 = true;
        if (ujb.o.LJJJJJL(data.LIZ)) {
            LIZ = 0;
        } else {
            HashMap hashMap = new HashMap(this.LIZ.LIZIZ);
            hashMap.remove(Integer.valueOf(this.LIZIZ));
            Collection values = hashMap.values();
            o.LJIIIIZZ(values, "map.values");
            LIZ = RXW.LIZ(this.LIZJ, (String[]) C61898ORa.LJJIII(values.toArray(new String[0]), new String[]{data.LIZ}));
            if (LIZ > 0) {
                z = true;
                boolean LIZJ = this.LIZ.LIZJ(this.LIZIZ, this.LIZLLL.propId, data.LIZ);
                if (LIZ <= 0 && !this.LIZ.LJ.getNoStockIsEnable()) {
                    z2 = false;
                }
                return C70256Rhk.LIZJ(data, z, LIZJ, z2, 3);
            }
        }
        z = false;
        boolean LIZJ2 = this.LIZ.LIZJ(this.LIZIZ, this.LIZLLL.propId, data.LIZ);
        if (LIZ <= 0) {
            z2 = false;
        }
        return C70256Rhk.LIZJ(data, z, LIZJ2, z2, 3);
    }

    @Override // X.InterfaceC70263Rhr
    public final void LIZIZ(C70256Rhk c70256Rhk, boolean z, int i) {
        C70256Rhk data = c70256Rhk;
        o.LJIIIZ(data, "data");
        if (z) {
            C70254Rhi c70254Rhi = this.LIZ;
            int i2 = this.LIZIZ;
            String str = data.LIZ;
            List list = this.LIZJ;
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            c70254Rhi.LJ(i2, str, list);
            InterfaceC70165RgH interfaceC70165RgH = this.LIZ.LJFF;
            if (interfaceC70165RgH != null) {
                interfaceC70165RgH.LIZ(this.LJ, this.LIZIZ, data.LIZ, i, true);
                return;
            }
            return;
        }
        C70254Rhi c70254Rhi2 = this.LIZ;
        int i3 = this.LIZIZ;
        List list2 = this.LIZJ;
        if (list2 == null) {
            list2 = C61878OQg.INSTANCE;
        }
        c70254Rhi2.LJ(i3, null, list2);
        InterfaceC70165RgH interfaceC70165RgH2 = this.LIZ.LJFF;
        if (interfaceC70165RgH2 == null) {
            return;
        }
        interfaceC70165RgH2.LIZ(this.LJ, this.LIZIZ, data.LIZ, i, false);
    }

    public C70255Rhj(C70254Rhi c70254Rhi, int i, List list, SaleProp saleProp, C70247Rhb c70247Rhb) {
        this.LIZ = c70254Rhi;
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = saleProp;
        this.LJ = c70247Rhb;
    }
}
