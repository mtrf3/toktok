package com.ss.android.ugc.aweme.channel.share.model;

import X.C62297Ocf;
import X.C62312Ocu;
import X.InterfaceC62225ObV;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;

/* loaded from: classes11.dex */
public final class ShareChannelService implements IChannelApi {
    public final ShareChannelInfo LJLIL;

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return this.LJLIL.channelKey;
    }

    public ShareChannelService(ShareChannelInfo shareChannelInfo) {
        this.LJLIL = shareChannelInfo;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC62225ObV getChannel(C62297Ocf c62297Ocf) {
        return new C62312Ocu(this.LJLIL);
    }
}
