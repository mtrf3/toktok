package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.C62297Ocf;
import X.C62301Ocj;
import X.InterfaceC62225ObV;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;

/* loaded from: classes11.dex */
public final class SnapchatChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "snapchat";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC62225ObV getChannel(C62297Ocf c62297Ocf) {
        if (c62297Ocf == null || c62297Ocf.LIZ == null) {
            return null;
        }
        return new C62301Ocj();
    }
}
