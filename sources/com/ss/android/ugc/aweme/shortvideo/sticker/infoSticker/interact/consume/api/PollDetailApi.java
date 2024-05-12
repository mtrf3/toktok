package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import X.AbstractC73672Svk;
import X.C74205TAj;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollDetailResponse;

/* loaded from: classes13.dex */
public interface PollDetailApi {
    public static final C74205TAj LIZ = C74205TAj.LIZ;

    @E4Q("/aweme/v1/vote/option/userlist/")
    AbstractC73672Svk<PollDetailResponse> getPollDetail(@InterfaceC64989Pez("vote_id") long j, @InterfaceC64989Pez("option_id") long j2, @InterfaceC64989Pez("offset") int i);
}
