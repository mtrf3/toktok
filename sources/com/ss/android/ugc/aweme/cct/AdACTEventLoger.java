package com.ss.android.ugc.aweme.cct;

import X.AbstractC58647Mzz;
import X.C58096Mr6;
import X.C58601MzF;
import X.C58684N1k;
import X.N13;
import X.N14;
import X.N15;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class AdACTEventLoger extends AbstractC58647Mzz implements IAdWebEventLogger {
    public final C58601MzF<?>[] LJII;

    public AdACTEventLoger() {
        this(new Object[]{null});
    }

    public static IAdWebEventLogger LJJIJ() {
        Object LIZ = C58096Mr6.LIZ(IAdWebEventLogger.class, false);
        if (LIZ != null) {
            return (IAdWebEventLogger) LIZ;
        }
        return new AdACTEventLoger();
    }

    @Override // X.C58620MzY
    public final C58601MzF<?>[] LJIILL() {
        return this.LJII;
    }

    public AdACTEventLoger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C58684N1k.LIZ.getClass();
        this.LJII = new C58601MzF[]{new C58601MzF<>(C58684N1k.LIZJ, N15.LJLIL), new C58601MzF<>(C58684N1k.LIZIZ, N14.LJLIL), new C58601MzF<>(C58684N1k.LJIIJJI, N13.LJLIL)};
    }
}
