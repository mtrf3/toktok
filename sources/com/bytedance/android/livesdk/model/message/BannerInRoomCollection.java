package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.BannerInRoom;
import java.util.List;

/* loaded from: classes6.dex */
public class BannerInRoomCollection {

    @InterfaceC65349Pkn("activity_top_right")
    public BannerInfo activityTopRightBanner;

    @InterfaceC65349Pkn("bottom_right")
    public BannerInfo bottomRightBanner;

    @InterfaceC65349Pkn("gift_panel")
    public BannerInfo giftPanelBanner;

    @InterfaceC65349Pkn("live_scene")
    public BannerInfo liveScene;

    @InterfaceC65349Pkn("middle")
    public BannerInfo middleBanner;

    @InterfaceC65349Pkn("top_left")
    public BannerInfo topLeft;

    @InterfaceC65349Pkn("top_right")
    public BannerInfo topRightBanner;

    /* loaded from: classes6.dex */
    public static final class BannerInfo {

        @InterfaceC65349Pkn("animation_image")
        public ImageModel animationImage;

        @InterfaceC65349Pkn("banner_list")
        public List<BannerInRoom> bannerList;

        @InterfaceC65349Pkn("collapse")
        public BannerCollapseInfo collapseInfo;

        @InterfaceC65349Pkn("container_type")
        public Long containerType;

        @InterfaceC65349Pkn("container_height")
        public int height;

        @InterfaceC65349Pkn("lynx_container_url")
        public String lynxContainerUrl;

        @InterfaceC65349Pkn("container_url")
        public String url;

        @InterfaceC65349Pkn("container_width")
        public int width;
    }
}
