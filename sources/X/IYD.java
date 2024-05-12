package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IYD implements IY4 {
    public static final IYD LIZIZ = new IYD();
    public static final C35751E1j<SimVideoUrlModel, IY0> LIZJ = new C35751E1j<>(100);

    @Override // X.IY4
    public final /* synthetic */ boolean LIZ() {
        return true;
    }

    @Override // X.IY4
    public final /* synthetic */ IY0 LIZIZ(IY5 iy5) {
        return J9A.LIZ(iy5);
    }

    @Override // X.IY4
    public final String getName() {
        return "OutputCacheHook";
    }

    @Override // X.IY4
    public final boolean isValid() {
        Boolean enableOutputCacheHookOpt = (Boolean) IZ8.LJJLI.getValue();
        o.LJIIIIZZ(enableOutputCacheHookOpt, "enableOutputCacheHookOpt");
        return enableOutputCacheHookOpt.booleanValue();
    }

    @Override // X.IY4
    public final IY0 LIZJ(IY5 iy5) {
        SimVideoUrlModel simVideoUrlModel;
        IYH iyh = iy5.LIZIZ;
        if (iyh == null || (simVideoUrlModel = iyh.LIZ) == null) {
            return iy5.LIZ(iyh);
        }
        C35751E1j<SimVideoUrlModel, IY0> c35751E1j = LIZJ;
        IY0 iy0 = c35751E1j.get(simVideoUrlModel);
        if (iy0 == null) {
            iy0 = iy5.LIZ(iyh);
            c35751E1j.put(simVideoUrlModel, iy0);
        }
        return iy0;
    }
}
