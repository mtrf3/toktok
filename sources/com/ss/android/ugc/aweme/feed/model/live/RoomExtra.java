package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RoomExtra implements Serializable {

    @InterfaceC65349Pkn("config")
    public RoomConfig config;

    @InterfaceC65349Pkn("with_promotion")
    public boolean withPromotion;

    public RoomConfig getConfig() {
        return this.config;
    }

    public void setConfig(RoomConfig roomConfig) {
        this.config = roomConfig;
    }
}
