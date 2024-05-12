package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class StaticGiftListResponse {

    @InterfaceC65349Pkn("gifts")
    public List<Gift> gifts = new ArrayList();

    @InterfaceC65349Pkn("metadata")
    public Metadata metadata;

    /* loaded from: classes14.dex */
    public static final class Metadata {

        @InterfaceC65349Pkn("hash")
        public String hash = "";

        @InterfaceC65349Pkn("num_gifts")
        public long numGifts;

        @InterfaceC65349Pkn("timestamp")
        public long timestamp;
    }
}
