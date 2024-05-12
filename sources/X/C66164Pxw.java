package X;

import com.bytedance.helios.api.config.AnchorInfoModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66164Pxw extends AbstractC66136PxU {
    @Override // X.AbstractC66136PxU
    public final String LIZIZ() {
        return "app_state";
    }

    @Override // X.AbstractC66136PxU
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC66136PxU
    public final boolean LIZJ(AnchorInfoModel model, Object obj) {
        o.LJIIIZ(model, "model");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        return PQ0.LJFF();
    }
}
