package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event;

import X.AbstractC58647Mzz;
import X.C58601MzF;
import X.C58635Mzn;
import X.C58636Mzo;
import X.C58637Mzp;
import X.C58639Mzr;
import X.C58640Mzs;
import X.C58641Mzt;
import X.C58645Mzx;
import X.C58649N0b;
import X.InterfaceC58549MyP;
import X.N0H;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class SearchAdEventLogger extends AbstractC58647Mzz implements ISearchAdEventLogger {
    public final C58601MzF<?>[] LJII;

    public SearchAdEventLogger() {
        this(new Object[]{null});
    }

    @Override // X.AbstractC58647Mzz, X.AbstractC58624Mzc
    public final InterfaceC58549MyP LJJ() {
        return C58649N0b.LIZ(super.LJJ());
    }

    @Override // X.C58620MzY
    public final C58601MzF<?>[] LJIILL() {
        return this.LJII;
    }

    public SearchAdEventLogger(Object[] objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        N0H.LIZ.getClass();
        this.LJII = new C58601MzF[]{new C58601MzF<>(N0H.LIZIZ, C58640Mzs.LJLIL), new C58601MzF<>(N0H.LIZJ, C58636Mzo.LJLIL), new C58601MzF<>(N0H.LIZLLL, C58635Mzn.LJLIL), new C58601MzF<>(N0H.LJFF, C58645Mzx.LJLIL), new C58601MzF<>(N0H.LJI, C58641Mzt.LJLIL), new C58601MzF<>(N0H.LJIIIIZZ, C58637Mzp.LJLIL), new C58601MzF<>(N0H.LJIIZILJ, C58639Mzr.LJLIL)};
    }
}
