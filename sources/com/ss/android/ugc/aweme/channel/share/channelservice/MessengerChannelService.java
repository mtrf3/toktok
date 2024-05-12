package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.C62297Ocf;
import X.C62666Oic;
import X.InterfaceC62225ObV;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;

/* loaded from: classes11.dex */
public final class MessengerChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "messenger";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC62225ObV getChannel(C62297Ocf c62297Ocf) {
        if (c62297Ocf == null || c62297Ocf.LIZ == null) {
            return null;
        }
        return new C62666Oic(c62297Ocf);
    }
}
