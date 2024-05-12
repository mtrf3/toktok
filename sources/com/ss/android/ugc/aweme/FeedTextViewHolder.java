package com.ss.android.ugc.aweme;

import X.AnonymousClass948;
import X.C222588oQ;
import X.C78996UzQ;
import X.W5F;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedTextViewHolder extends VideoViewCell {
    public Aweme LLZZ;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLJILLL() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LJLJJLL() {
        if (TextUtils.equals("homepage_hot", this.LJLLILLLL.LJIIIZ)) {
            return 2;
        }
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final Aweme O1() {
        Aweme aweme = this.LLZZ;
        if (aweme == null) {
            return getAweme();
        }
        return aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTextViewHolder(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        this.LLZZ = aweme;
        super.LIZLLL(C78996UzQ.LJIILJJIL(aweme));
        this.LLIIII.setVisibility(8);
        AnonymousClass948.LIZ(this.LLIFFJFJJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final W5F LLIIIZ(Video video) {
        W5F LLIIIZ = super.LLIIIZ(video);
        LLIIIZ.LJIJI = Bitmap.Config.ARGB_8888;
        return LLIIIZ;
    }
}
