package com.bytedance.android.livesdk.model;

import X.C30896CAq;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes6.dex */
public class BannerInRoom extends C30896CAq {

    @InterfaceC65349Pkn("action_type")
    public int actionType;

    @InterfaceC65349Pkn("appointment_end_timestamp")
    public Long appointmentEndTimestamp;

    @InterfaceC65349Pkn("appointment_id")
    public Long appointmentId;

    @InterfaceC65349Pkn("appointment_start_timestamp")
    public Long appointmentStartTimestamp;

    @InterfaceC65349Pkn("banner_location")
    public int bannerLocation;

    @InterfaceC65349Pkn("banner_type")
    public Long bannerType;

    @InterfaceC65349Pkn("business_type")
    public Long businessType;

    @InterfaceC65349Pkn("dynamic_banner")
    public BannerContentDynamic dynamicBanner;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("frame_type")
    public Long frameType;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("open_with_navigation_tag")
    public boolean openWithNavigationTag;

    @InterfaceC65349Pkn("priority")
    public int priority;

    @InterfaceC65349Pkn("roomid")
    public Long roomid;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("status")
    public Long status;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("uid")
    public Long uid;

    @InterfaceC65349Pkn("width")
    public int width;

    /* loaded from: classes6.dex */
    public static class BannerContentDynamic {

        @InterfaceC65349Pkn("json_resource")
        public String jsonResource;
    }
}
