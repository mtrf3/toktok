package com.ss.android.ugc.aweme.channel.share.channelservice;

import X.C62297Ocf;
import X.C62315Ocx;
import X.InterfaceC62225ObV;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.channel.share.model.IChannelApi;

/* loaded from: classes11.dex */
public final class WhatsappStatusChannelService implements IChannelApi {
    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final String getChannelKey() {
        return "whatsapp_status";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.IChannelApi
    public final InterfaceC62225ObV getChannel(C62297Ocf c62297Ocf) {
        String str;
        InterfaceC88472Yns<String, String> interfaceC88472Yns;
        if (c62297Ocf != null && (interfaceC88472Yns = c62297Ocf.LIZIZ) != null) {
            str = interfaceC88472Yns.invoke("whatsapp_status");
        } else {
            str = null;
        }
        return new C62315Ocx(str);
    }
}
