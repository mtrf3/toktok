package com.ss.android.ugc.aweme.commercialize.measurement;

import X.C221108m2;
import X.C46402IJa;
import X.C58096Mr6;
import X.C59402NTa;
import X.C59407NTf;
import X.C62822Ol8;
import X.IVK;
import X.JC6;
import X.NIT;
import X.NR4;
import X.NR5;
import X.NR9;
import X.NRC;
import X.NRG;
import X.NS8;
import X.NTU;
import X.NTW;
import X.NTY;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MeasurementServiceImpl implements IMeasurementService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C46402IJa.LJLIL);

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    public final synchronized IVK LIZJ() {
        IVK ivk;
        NIT nit = (NIT) ((Map) this.LIZ.getValue()).get("search");
        if (nit instanceof IVK) {
            ivk = (IVK) nit;
        } else {
            ivk = null;
        }
        return ivk;
    }

    public static IMeasurementService LJ() {
        Object LIZ = C58096Mr6.LIZ(IMeasurementService.class, false);
        if (LIZ != null) {
            return (IMeasurementService) LIZ;
        }
        if (C58096Mr6.LLLLLLLLL == null) {
            synchronized (IMeasurementService.class) {
                if (C58096Mr6.LLLLLLLLL == null) {
                    C58096Mr6.LLLLLLLLL = new MeasurementServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    public final NIT LIZ() {
        NR4 nr4;
        NIT nit = (NIT) ((Map) this.LIZ.getValue()).get("search");
        NIT nit2 = nit;
        if (nit == null) {
            if (o.LJ("search", "search")) {
                C59407NTf LIZ = new NS8(0).LIZ(NTU.LJLIL).LIZ(NTW.LJLIL).LIZ(NTY.LJLIL).LIZ(C59402NTa.LJLIL);
                NR9 nr9 = new NR9((NRC) LIZ.LIZ.invoke(new NR5()));
                nr9.LIZIZ.LJ("search");
                nr4 = nr9;
            } else if (o.LJ("search", "feed")) {
                nr4 = NRG.LIZ();
            } else {
                nr4 = NRG.LIZ();
            }
            ((Map) this.LIZ.getValue()).put("search", nr4);
            nit2 = nr4;
        }
        return nit2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    public final JC6 LIZLLL() {
        return new JC6();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService
    public final void LIZIZ() {
    }
}
