package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import X.AbstractC73672Svk;
import X.C86395XvT;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollResponse;

/* loaded from: classes16.dex */
public interface PollApi {
    public static final C86395XvT LIZ = C86395XvT.LIZ;

    @InterfaceC195787mI
    @E4T("/aweme/v1/vote/option/")
    AbstractC73672Svk<PollResponse> poll(@InterfaceC64987Pex("vote_id") long j, @InterfaceC64987Pex("option_id") long j2);
}
