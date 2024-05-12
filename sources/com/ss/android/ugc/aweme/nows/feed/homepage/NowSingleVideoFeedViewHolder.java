package com.ss.android.ugc.aweme.nows.feed.homepage;

import X.C195657m5;
import X.C213108Xy;
import X.C222588oQ;
import X.C8Y3;
import X.InterfaceC212878Xb;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowSingleVideoFeedViewHolder extends NowSingleCardFeedViewHolder<NowSingleVideoFeedViewHolder, C195657m5> {
    @Override // com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleCardFeedViewHolder
    public final boolean LJLJI() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleCardFeedViewHolder
    public final C195657m5 LJLIL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        C213108Xy c213108Xy = C8Y3.LJII;
        String str = this.LJLLILLLL.LJIIIZ;
        c213108Xy.getClass();
        return new C195657m5(aweme, null, null, C213108Xy.LIZ(str), null, false, false, true, "bottom", null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NowSingleVideoFeedViewHolder(C222588oQ params, InterfaceC212878Xb<NowSingleVideoFeedViewHolder, C195657m5> interfaceC212878Xb) {
        super(params, interfaceC212878Xb);
        o.LJIIIZ(params, "params");
    }
}
