package com.ss.android.ugc.aweme.creatortools.videogift;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class GiftSettings extends F9E {

    @InterfaceC65349Pkn("show_video_gift_entrance")
    public final boolean allowVideoGift;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.allowVideoGift)};
    }

    public GiftSettings(boolean z) {
        this.allowVideoGift = z;
    }
}
