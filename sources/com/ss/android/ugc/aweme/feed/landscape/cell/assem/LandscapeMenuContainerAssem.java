package com.ss.android.ugc.aweme.feed.landscape.cell.assem;

import X.C208088Eq;
import X.C26338AVi;
import X.C35183DrP;
import X.C37179EiV;
import X.C51029K0z;
import X.C54838Lfe;
import X.C74220TAy;
import X.C7MY;
import X.C8D3;
import X.C8VR;
import X.InterfaceC65784Pro;
import Y.ARunnableS22S0200000_3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeMenuContainerAssem extends FeedBaseContentAssem<LandscapeMenuContainerAssem> {
    public final C74220TAy LJZL;
    public final BaseFeedPageParams LL;
    public final InterfaceC65784Pro<Long> LLD;
    public boolean LLF;

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    public final synchronized void Z3(View view) {
        if (this.LLF) {
            return;
        }
        C8VR.LIZ(this, new AqS134S0200000_3(this, view, 90));
        this.LLF = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (((Boolean) C35183DrP.LJIILJJIL.getValue()).booleanValue()) {
            if (!C54838Lfe.LJJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                C37179EiV.LIZ().postAtFrontOfQueue(new ARunnableS22S0200000_3(this, view, 17));
            } else {
                Z3(view);
            }
        } else {
            Z3(view);
        }
        if (C8D3.LIZIZ() && C208088Eq.LIZIZ()) {
            int LIZIZ = C7MY.LIZIZ(6);
            View findViewById = view.findViewById(R.id.d5g);
            o.LJIIIIZZ(findViewById, "view.findViewById<View>(R.id.favorite_layout)");
            C26338AVi.LJI(findViewById, 0, 0, 0, Integer.valueOf(LIZIZ), false, 16);
            View findViewById2 = view.findViewById(R.id.bkv);
            o.LJIIIIZZ(findViewById2, "view.findViewById<View>(R.id.comment_layout)");
            C26338AVi.LJI(findViewById2, 0, 0, 0, Integer.valueOf(LIZIZ), false, 16);
            View findViewById3 = view.findViewById(R.id.c_v);
            o.LJIIIIZZ(findViewById3, "view.findViewById<View>(R.id.digg_layout)");
            C26338AVi.LJI(findViewById3, 0, 0, 0, Integer.valueOf(LIZIZ), false, 16);
        }
    }

    public LandscapeMenuContainerAssem(C74220TAy assemSwitchHelper, BaseFeedPageParams params, InterfaceC65784Pro<Long> infoProvider) {
        o.LJIIIZ(assemSwitchHelper, "assemSwitchHelper");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(infoProvider, "infoProvider");
        new LinkedHashMap();
        this.LJZL = assemSwitchHelper;
        this.LL = params;
        this.LLD = infoProvider;
    }
}
