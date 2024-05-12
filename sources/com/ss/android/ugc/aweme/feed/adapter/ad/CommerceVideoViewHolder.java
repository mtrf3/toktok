package com.ss.android.ugc.aweme.feed.adapter.ad;

import X.A9B;
import X.A9D;
import X.C222588oQ;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CommerceVideoViewHolder extends VideoViewCell {
    public final A9D LLZZ;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LJLJJLL() {
        return 7;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gR() {
        return "cell_commerce";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLJJLIIIJLLLLLLLZ() {
        A9B.LIZ("resetPlayerView before");
        if (this.LLZZ.LIZ()) {
            A9B.LIZ("resetPlayerView initSlideViewPager");
            this.LLZZ.LIZJ();
        } else {
            A9B.LIZ("resetPlayerView super.resetPlayerView()");
            super.LLJJLIIIJLLLLLLLZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void unBind() {
        super.unBind();
        this.LLZZ.LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommerceVideoViewHolder(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLZZ = new A9D(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        super.LIZLLL(aweme);
        A9B.LIZ("bind");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void l8(int i) {
        super.l8(i);
        A9B.LIZIZ(this.LLJJJIL, "commerce new");
    }
}
