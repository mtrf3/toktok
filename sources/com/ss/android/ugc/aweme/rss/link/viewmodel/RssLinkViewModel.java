package com.ss.android.ugc.aweme.rss.link.viewmodel;

import X.AJD;
import X.AJH;
import X.AJJ;
import X.AJY;
import X.C188727au;
import X.FMX;
import X.InterfaceC68402mK;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RssLinkViewModel extends AssemViewModel<AJD> {
    public final RssLinkParam LJLIL;
    public final InterfaceC68402mK LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final AJD defaultState() {
        return new AJD(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        if (r2 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(X.AJI r4) {
        /*
            r3 = this;
            if (r4 == 0) goto La
            java.lang.Integer r2 = r4.LIZIZ
            if (r2 != 0) goto L1c
        L6:
            X.AJH r2 = X.AJH.CONNECT
        L8:
            if (r2 != 0) goto Lc
        La:
            X.AJH r2 = X.AJH.CONNECT
        Lc:
            r1 = 1
            r0 = 0
            iv0(r3, r0, r2, r1)
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 771(0x303, float:1.08E-42)
            r1.<init>(r4, r0)
            r3.setState(r1)
            return
        L1c:
            int r1 = r2.intValue()
            r0 = 11280(0x2c10, float:1.5807E-41)
            if (r1 != r0) goto L27
            X.AJH r2 = X.AJH.NOT_MATCH
            goto L8
        L27:
            int r1 = r2.intValue()
            r0 = 11281(0x2c11, float:1.5808E-41)
            if (r1 != r0) goto L32
            X.AJH r2 = X.AJH.FETCH
            goto L8
        L32:
            int r1 = r2.intValue()
            r0 = 11282(0x2c12, float:1.581E-41)
            if (r1 != r0) goto L3d
            X.AJH r2 = X.AJH.INVALID_LINK
            goto L8
        L3d:
            int r1 = r2.intValue()
            r0 = 11272(0x2c08, float:1.5795E-41)
            if (r1 != r0) goto L6
            X.AJH r2 = X.AJH.SECURITY
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel.gv0(X.AJI):void");
    }

    public final void hv0(AJJ exitMethod) {
        o.LJIIIZ(exitMethod, "exitMethod");
        withState(new AqS135S0200000_4(this, exitMethod, 108));
    }

    public RssLinkViewModel(RssLinkParam rssLinkParam, AJY rssRepo) {
        o.LJIIIZ(rssLinkParam, "rssLinkParam");
        o.LJIIIZ(rssRepo, "rssRepo");
        this.LJLIL = rssLinkParam;
        this.LJLILLLLZI = rssRepo;
    }

    public static void iv0(RssLinkViewModel rssLinkViewModel, int i, AJH failReason, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            failReason = AJH.NONE;
        }
        rssLinkViewModel.getClass();
        String enterFrom = rssLinkViewModel.LJLIL.getEnterFrom();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(failReason, "failReason");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LIZLLL(i, "load_status");
        c188727au.LJIIIZ("fail_reason", failReason.getReason());
        FMX.LJIIL("rss_link_load_status", c188727au.LIZ);
    }
}
