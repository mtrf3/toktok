package X;

import android.view.View;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import kotlin.jvm.internal.o;

/* renamed from: X.F3d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38345F3d extends AbstractC60800Ntc {
    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        VNS vns;
        o.LJIIIZ(view, "view");
        View LIZJ = view.LIZJ();
        if ((LIZJ instanceof VNS) && (vns = (VNS) LIZJ) != null) {
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.addContext(vns, "music_chart_fmp_opti", "true");
        }
    }
}
