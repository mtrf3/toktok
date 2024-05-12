package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OFL extends OFN {
    public final /* synthetic */ C79604VMa LIZ;

    @Override // X.OFN
    public final void LIZ() {
        HybridMultiMonitor.getInstance().customReport(this.LIZ);
    }

    public OFL(C79604VMa c79604VMa) {
        this.LIZ = c79604VMa;
    }

    @Override // X.OFN
    public final void LIZIZ(String containerId, COL type) {
        o.LJIIJ(containerId, "containerId");
        o.LJIIJ(type, "type");
        OFH.LIZLLL.getClass();
        OFM LJFF = OFH.LJFF(type);
        if (LJFF != null) {
            LJFF.customReport(type.LIZ(), this.LIZ);
        } else {
            HybridMultiMonitor.getInstance().customReport(this.LIZ);
        }
    }
}
