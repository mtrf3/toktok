package com.ss.android.ugc.aweme.nows.feed.homepage;

import X.C195627m2;
import X.C213108Xy;
import X.C222588oQ;
import X.C8Y3;
import X.InterfaceC212878Xb;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowMultiCardFeedViewHolder extends NowPostCardFeedViewHolder<NowMultiCardFeedViewHolder, C195627m2> {
    @Override // com.ss.android.ugc.aweme.nows.feed.homepage.NowPostCardFeedViewHolder
    public final ReusedUIAssem<?> LJLIIL() {
        return new NowPostCardRootAssem(true, false, this.LJLLILLLL.LJIIIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NowMultiCardFeedViewHolder(C222588oQ params, InterfaceC212878Xb<NowMultiCardFeedViewHolder, C195627m2> interfaceC212878Xb) {
        super(params, interfaceC212878Xb);
        o.LJIIIZ(params, "params");
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.homepage.NowPostCardFeedViewHolder, X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        LIZLLL(aweme);
        if (aweme == null) {
            return;
        }
        C213108Xy c213108Xy = C8Y3.LJII;
        String str = this.LJLLILLLL.LJIIIZ;
        c213108Xy.getClass();
        LJJZ(i, new C195627m2(aweme, C213108Xy.LIZ(str), true, null, 378));
    }
}
