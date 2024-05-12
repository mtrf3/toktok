package com.ss.android.ugc.aweme.feed.api;

import X.AbstractC73547Stj;
import X.C9TW;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;

/* loaded from: classes5.dex */
public interface FeedBubbleAckApi {
    public static final C9TW LIZ = C9TW.LIZ;

    @InterfaceC195787mI
    @E4T("/tiktok/v1/bubble/ack/")
    AbstractC73547Stj sendBubbleAck(@InterfaceC64987Pex("biz") int i, @InterfaceC64987Pex("type") int i2);
}
