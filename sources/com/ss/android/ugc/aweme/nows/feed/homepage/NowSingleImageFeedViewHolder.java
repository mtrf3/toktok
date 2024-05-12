package com.ss.android.ugc.aweme.nows.feed.homepage;

import X.C195647m4;
import X.C213108Xy;
import X.C222588oQ;
import X.C8Y3;
import X.InterfaceC212878Xb;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowSingleImageFeedViewHolder extends NowSingleCardFeedViewHolder<NowSingleImageFeedViewHolder, C195647m4> {
    @Override // com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleCardFeedViewHolder
    public final boolean LJLJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleCardFeedViewHolder
    public final C195647m4 LJLIL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        C213108Xy c213108Xy = C8Y3.LJII;
        String str = this.LJLLILLLL.LJIIIZ;
        c213108Xy.getClass();
        return new C195647m4(aweme, null, null, C213108Xy.LIZ(str), null, false, false, true, "bottom", null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NowSingleImageFeedViewHolder(C222588oQ params, InterfaceC212878Xb<NowSingleImageFeedViewHolder, C195647m4> interfaceC212878Xb) {
        super(params, interfaceC212878Xb);
        o.LJIIIZ(params, "params");
    }
}
