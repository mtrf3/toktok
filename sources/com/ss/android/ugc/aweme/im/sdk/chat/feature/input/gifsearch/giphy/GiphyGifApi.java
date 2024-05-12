package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy;

import X.AbstractC73638SvC;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model.GiphyGifsResponse;

/* loaded from: classes2.dex */
public interface GiphyGifApi {
    @E4Q("im/resources/gifs/trending/")
    AbstractC73638SvC<GiphyGifsResponse> getTrendingGiphy(@InterfaceC64989Pez("offset") int i);
}
