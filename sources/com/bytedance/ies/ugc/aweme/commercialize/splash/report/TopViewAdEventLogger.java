package com.bytedance.ies.ugc.aweme.commercialize.splash.report;

import X.AbstractC58647Mzz;
import X.C58096Mr6;
import X.C58601MzF;
import X.NMB;
import X.NMD;
import X.NME;
import X.NMF;
import X.NMI;
import X.NMJ;
import X.NP9;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class TopViewAdEventLogger extends AbstractC58647Mzz implements ITopViewAdEventLogger {
    public final C58601MzF<?>[] LJII;

    public TopViewAdEventLogger() {
        this(new Object[]{null});
    }

    public static ITopViewAdEventLogger LJJIJ() {
        Object LIZ = C58096Mr6.LIZ(ITopViewAdEventLogger.class, false);
        if (LIZ != null) {
            return (ITopViewAdEventLogger) LIZ;
        }
        return new TopViewAdEventLogger();
    }

    @Override // X.C58620MzY
    public final C58601MzF<?>[] LJIILL() {
        return this.LJII;
    }

    public TopViewAdEventLogger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        NMB.LIZ.getClass();
        this.LJII = new C58601MzF[]{new C58601MzF<>(NMB.LJIILIIL, NMI.LJLIL), new C58601MzF<>(NMB.LJIIL, NP9.LJLIL), new C58601MzF<>(NMB.LJIL, NMJ.LJLIL), new C58601MzF<>(NMB.LIZJ, NMD.LJLIL), new C58601MzF<>(NMB.LIZLLL, NME.LJLIL), new C58601MzF<>(NMB.LJFF, NMF.LJLIL)};
    }
}
