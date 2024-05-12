package com.ss.android.ugc.aweme.log;

import X.AbstractC58647Mzz;
import X.C58601MzF;
import X.C58684N1k;
import X.N18;
import X.N19;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class AdLynxEventLoger extends AbstractC58647Mzz implements IAdLynxEventLogger {
    public final C58601MzF<?>[] LJII;

    public AdLynxEventLoger() {
        this(new Object[]{null});
    }

    @Override // X.C58620MzY
    public final C58601MzF<?>[] LJIILL() {
        return this.LJII;
    }

    public AdLynxEventLoger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C58684N1k.LIZ.getClass();
        this.LJII = new C58601MzF[]{new C58601MzF<>(C58684N1k.LJIILIIL, N19.LJLIL), new C58601MzF<>(C58684N1k.LJJJJJ, N18.LJLIL)};
    }
}
