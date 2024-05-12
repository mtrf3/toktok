package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IYC implements IY4 {
    public static final IYC LIZIZ = new IYC();

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
        return "SingleBitRateUrlHook";
    }

    @Override // X.IY4
    public final boolean isValid() {
        Boolean enableVideoUrlHookOpt = (Boolean) IZ8.LJJL.getValue();
        o.LJIIIIZZ(enableVideoUrlHookOpt, "enableVideoUrlHookOpt");
        if (enableVideoUrlHookOpt.booleanValue()) {
            Boolean isEnableSingleBitrateHookOpt = (Boolean) IZ8.LJJLL.getValue();
            o.LJIIIIZZ(isEnableSingleBitrateHookOpt, "isEnableSingleBitrateHookOpt");
            if (isEnableSingleBitrateHookOpt.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.IY4
    public final IY0 LIZJ(IY5 iy5) {
        SimVideoUrlModel simVideoUrlModel;
        IYH iyh = iy5.LIZIZ;
        if (iyh != null && (simVideoUrlModel = iyh.LIZ) != null) {
            List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
            if (bitRate == null || !bitRate.isEmpty()) {
                List<SimBitRate> bitRate2 = simVideoUrlModel.getBitRate();
                if (bitRate2 != null && bitRate2.size() == 1) {
                    SimBitRate simBitRate = (SimBitRate) ListProtector.get(simVideoUrlModel.getBitRate(), 0);
                    return C46791IXz.LIZ(this, simBitRate.urlList(), simVideoUrlModel, simBitRate);
                }
            } else {
                return C46791IXz.LIZ(this, simVideoUrlModel.getUrlList(), simVideoUrlModel, null);
            }
        }
        return iy5.LIZ(iyh);
    }
}
