package X;

import com.bytedance.helios.api.config.AnchorInfoModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66157Pxp extends AbstractC66136PxU {
    @Override // X.AbstractC66136PxU
    public final String LIZIZ() {
        return "multiple_page";
    }

    @Override // X.AbstractC66136PxU
    public final boolean LJ() {
        return false;
    }

    @Override // X.AbstractC66136PxU
    public final boolean LIZJ(AnchorInfoModel model, Object obj) {
        o.LJIIIZ(model, "model");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        return model.resourcePages.contains(PQ0.LIZLLL());
    }
}
