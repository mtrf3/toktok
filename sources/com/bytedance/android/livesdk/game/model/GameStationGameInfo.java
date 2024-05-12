package com.bytedance.android.livesdk.game.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GameStationGameInfo {

    @InterfaceC65349Pkn("android_package_size")
    public long androidPackageSize;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("ios_package_size")
    public long iosPackageSize;

    @InterfaceC65349Pkn("top_background_image")
    public ImageModel topBackgroundImage;

    @InterfaceC65349Pkn("id_str")
    public String idStr = "";

    @InterfaceC65349Pkn("name")
    public String name = "";

    @InterfaceC65349Pkn("android_age_limit")
    public String androidAgeLimit = "";

    @InterfaceC65349Pkn("ios_age_limit")
    public String iosAgeLimit = "";

    @InterfaceC65349Pkn("android_package")
    public String androidPackage = "";

    @InterfaceC65349Pkn("ios_bundle_id")
    public String iosBundleId = "";

    @InterfaceC65349Pkn("introduction_image")
    public List<ImageModel> introductionImage = new ArrayList();

    @InterfaceC65349Pkn("introduction")
    public String introduction = "";

    @InterfaceC65349Pkn("labels")
    public List<String> labels = new ArrayList();

    @InterfaceC65349Pkn("cp_name")
    public String cpName = "";

    @InterfaceC65349Pkn("introduction_video")
    public List<Video> introductionVideo = new ArrayList();

    @InterfaceC65349Pkn("ios_deep_link")
    public String iosDeepLink = "";

    @InterfaceC65349Pkn("android_deep_link")
    public String androidDeepLink = "";

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
}
