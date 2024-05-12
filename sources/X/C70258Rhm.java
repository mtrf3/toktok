package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rhm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70258Rhm implements InterfaceC70263Rhr<C70257Rhl> {
    public final /* synthetic */ C70254Rhi LIZ;
    public final /* synthetic */ InterfaceC70268Rhw LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ List<SkuItem> LIZLLL;

    @Override // X.InterfaceC70263Rhr
    public final C70257Rhl LIZ(C70257Rhl data) {
        o.LJIIIZ(data, "data");
        return data;
    }

    @Override // X.InterfaceC70263Rhr
    public final void LIZIZ(C70257Rhl c70257Rhl, boolean z, int i) {
        C70257Rhl data = c70257Rhl;
        o.LJIIIZ(data, "data");
        if (z) {
            this.LIZ.LJ(this.LIZJ, data.LIZ, this.LIZLLL);
            InterfaceC70165RgH interfaceC70165RgH = this.LIZ.LJFF;
            if (interfaceC70165RgH != null) {
                interfaceC70165RgH.LIZ(this.LIZIZ, this.LIZJ, data.LIZ, i, true);
                return;
            }
            return;
        }
        this.LIZ.LJ(this.LIZJ, null, this.LIZLLL);
        InterfaceC70165RgH interfaceC70165RgH2 = this.LIZ.LJFF;
        if (interfaceC70165RgH2 == null) {
            return;
        }
        interfaceC70165RgH2.LIZ(this.LIZIZ, this.LIZJ, data.LIZ, i, false);
    }

    public C70258Rhm(C70254Rhi c70254Rhi, C70247Rhb c70247Rhb, int i, List list) {
        this.LIZ = c70254Rhi;
        this.LIZIZ = c70247Rhb;
        this.LIZJ = i;
        this.LIZLLL = list;
    }
}
