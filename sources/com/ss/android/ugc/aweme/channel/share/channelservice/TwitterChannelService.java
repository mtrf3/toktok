package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.C62297Ocf;
import X.C62302Ock;
import X.InterfaceC62225ObV;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;

/* loaded from: classes11.dex */
public final class TwitterChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "twitter";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC62225ObV getChannel(C62297Ocf c62297Ocf) {
        return new C62302Ock();
    }
}
