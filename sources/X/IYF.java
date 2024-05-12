package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IYF implements IY4 {
    public static final IYF LIZIZ = new IYF();

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
        return "SelectBitrateFromMemoryCacheUrlHook";
    }

    @Override // X.IY4
    public final boolean isValid() {
        Boolean enableSelectBitrateFromMemoryCache = (Boolean) IZ8.LJJLIIIIJ.getValue();
        o.LJIIIIZZ(enableSelectBitrateFromMemoryCache, "enableSelectBitrateFromMemoryCache");
        return enableSelectBitrateFromMemoryCache.booleanValue();
    }

    @Override // X.IY4
    public final IY0 LIZJ(IY5 iy5) {
        SimVideoUrlModel simVideoUrlModel;
        List<SimBitRate> bitRate;
        IYH iyh = iy5.LIZIZ;
        SimBitRate simBitRate = null;
        if (iyh == null || (simVideoUrlModel = iyh.LIZ) == null) {
            return iy5.LIZ(iyh);
        }
        InterfaceC46904Iay LIZ = C46900Iau.LIZ(simVideoUrlModel, EnumC46870IaQ.FromMemory);
        if (LIZ.LIZIZ() > 0 && (bitRate = simVideoUrlModel.getBitRate()) != null) {
            Iterator<SimBitRate> it = bitRate.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SimBitRate next = it.next();
                if (o.LJ(next.getUrlKey(), LIZ.key())) {
                    simBitRate = next;
                    break;
                }
            }
            SimBitRate simBitRate2 = simBitRate;
            if (simBitRate2 != null) {
                return C46791IXz.LIZ(this, simBitRate2.urlList(), simVideoUrlModel, simBitRate2);
            }
        }
        return iy5.LIZ(iyh);
    }
}
