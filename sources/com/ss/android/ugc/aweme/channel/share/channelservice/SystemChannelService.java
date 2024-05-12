package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.C62293Ocb;
import X.C62297Ocf;
import X.InterfaceC62225ObV;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;

/* loaded from: classes11.dex */
public final class SystemChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "more";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC62225ObV getChannel(C62297Ocf c62297Ocf) {
        InterfaceC88472Yns<String, String> interfaceC88472Yns;
        String invoke;
        if (c62297Ocf == null || (interfaceC88472Yns = c62297Ocf.LIZIZ) == null || (invoke = interfaceC88472Yns.invoke("more")) == null) {
            return null;
        }
        return new C62293Ocb(invoke);
    }
}
