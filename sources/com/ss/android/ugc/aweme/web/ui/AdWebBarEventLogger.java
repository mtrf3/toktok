package com.ss.android.ugc.aweme.web.ui;

import X.AbstractC58647Mzz;
import X.C58601MzF;
import X.C58684N1k;
import X.N16;
import X.N17;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class AdWebBarEventLogger extends AbstractC58647Mzz implements IAdWebEventLogger {
    public final C58601MzF<?>[] LJII;

    public AdWebBarEventLogger() {
        this(null);
    }

    @Override // X.C58620MzY
    public final C58601MzF<?>[] LJIILL() {
        return this.LJII;
    }

    public AdWebBarEventLogger(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C58684N1k.LIZ.getClass();
        this.LJII = new C58601MzF[]{new C58601MzF<>(C58684N1k.LJFF, N17.LJLIL), new C58601MzF<>(C58684N1k.LJIILJJIL, N16.LJLIL)};
    }
}
