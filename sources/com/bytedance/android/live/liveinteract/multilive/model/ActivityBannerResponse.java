package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class ActivityBannerResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class BannerInfo {

        @InterfaceC65349Pkn("show_banner")
        public boolean showBanner;

        @InterfaceC65349Pkn("banner_url")
        public String bannerUrl = "";

        @InterfaceC65349Pkn("activity_url")
        public String activityUrl = "";
    }

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("banner")
        public List<BannerInfo> banner = new ArrayList();

        @InterfaceC65349Pkn("in_room_multi_guest_banner")
        public List<InRoomMultiGuestBanner> inRoomMultiGuestBanner = new ArrayList();
    }
}
