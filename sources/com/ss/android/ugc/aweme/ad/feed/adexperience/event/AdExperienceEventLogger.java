package com.ss.android.ugc.aweme.ad.feed.adexperience.event;

import X.AbstractC58647Mzz;
import X.C58601MzF;
import X.N10;
import X.N11;
import com.ss.android.ugc.aweme.ad.feed.adexperience.IAdExperienceEventLogger;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class AdExperienceEventLogger extends AbstractC58647Mzz implements IAdExperienceEventLogger {
    public final C58601MzF<?>[] LJII;

    public AdExperienceEventLogger() {
        this(new Object[]{null});
    }

    @Override // X.C58620MzY
    public final C58601MzF<?>[] LJIILL() {
        return this.LJII;
    }

    public AdExperienceEventLogger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        N11.LIZ.getClass();
        this.LJII = new C58601MzF[]{new C58601MzF<>(N11.LIZIZ, N10.LJLIL)};
    }
}
