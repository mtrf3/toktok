package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes17.dex */
public final class PartnershipGame extends F9E {

    @InterfaceC65349Pkn("age_limit")
    public Long ageLimit;

    @InterfaceC65349Pkn("android_package")
    public String androidPackage;

    @InterfaceC65349Pkn("android_package_size")
    public Long androidPackageSize;

    @InterfaceC65349Pkn("android_version")
    public String androidVersion;

    @InterfaceC65349Pkn("brief_introduction")
    public String briefIntroduction;

    @InterfaceC65349Pkn("game_tag_id")
    public long gameTagId;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("id")
    public Long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("introduction")
    public String introduction;

    @InterfaceC65349Pkn("introduction_image")
    public List<ImageModel> introductionImage;

    @InterfaceC65349Pkn("introduction_video")
    public List<Video> introductionVideo;

    @InterfaceC65349Pkn("ios_bundle_id")
    public String iosBundleId;

    @InterfaceC65349Pkn("ios_package_size")
    public Long iosPackageSize;

    @InterfaceC65349Pkn("ios_version")
    public String iosVersion;

    @InterfaceC65349Pkn("labels")
    public List<String> labels;

    @InterfaceC65349Pkn("last_update_time")
    public Long lastUpdateTime;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("open_gll")
    public int openGll;

    @InterfaceC65349Pkn("top_background_image")
    public ImageModel topBackgroundImage;

    @InterfaceC65349Pkn("deep_link")
    public String deepLink = "";

    @InterfaceC65349Pkn("game_publisher")
    public String gamePublisher = "";

    @InterfaceC65349Pkn("contact_email")
    public String contactEmail = "";

    @InterfaceC65349Pkn("contact_phone_num")
    public String contactPhoneNum = "";

    /* loaded from: classes16.dex */
    public static final class Video {

        @InterfaceC65349Pkn("cover")
        public ImageModel cover;

        @InterfaceC65349Pkn("duration")
        public double duration;

        @InterfaceC65349Pkn("vid")
        public String vid = "";

        @InterfaceC65349Pkn("url")
        public String url = "";
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.id;
        String str = this.idStr;
        String str2 = this.name;
        String str3 = this.androidVersion;
        String str4 = this.iosVersion;
        Long l2 = this.ageLimit;
        String str5 = this.androidPackage;
        Long l3 = this.androidPackageSize;
        String str6 = this.iosBundleId;
        Long l4 = this.iosPackageSize;
        ImageModel imageModel = this.icon;
        List<ImageModel> list = this.introductionImage;
        String str7 = this.introduction;
        String str8 = this.briefIntroduction;
        List<String> list2 = this.labels;
        Long l5 = this.lastUpdateTime;
        return new Object[]{l, l, str, str, str2, str2, str3, str3, str4, str4, l2, l2, str5, str5, l3, l3, str6, str6, l4, l4, imageModel, imageModel, list, list, list, str7, str7, str8, str8, list2, list2, list2, l5, l5};
    }
}
