package com.ss.android.ugc.aweme.settings;

import X.C08880Wm;
import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyTabConfig {
    public static final Config LIZ;

    /* loaded from: classes10.dex */
    public static final class Config {

        @InterfaceC65349Pkn("ab_mode")
        public Integer abMode;

        @InterfaceC65349Pkn("allow_once_settings_popup_freq")
        public Integer allowOnceSettingsPopupFreq;

        @InterfaceC65349Pkn("banner_popup_freq")
        public Integer bannerPopupFreq;

        @InterfaceC65349Pkn("bgd_video")
        public UrlStruct bkgdVideo;

        @InterfaceC65349Pkn("bgd_video_cover")
        public UrlStruct bkgdVideoCover;

        @InterfaceC65349Pkn("current_region")
        public final LocationRegion currentRegion;

        @InterfaceC65349Pkn("intro_popup_freq")
        public Integer introPopupFreq;

        @InterfaceC65349Pkn("intro_popup_text")
        public String introPopupText;

        @InterfaceC65349Pkn("intro_popup_title")
        public String introPopupTitle;

        @InterfaceC65349Pkn("learn_more_url_feature_unavailable_android")
        public String learnMoreUrlFeatureNotAvailable;

        @InterfaceC65349Pkn("learn_more_url_intro_android")
        public String learnMoreUrlIntro;

        @InterfaceC65349Pkn("post_to_nearby_toggle_text")
        public final String nearbyPrivacyVisibilityToggleText;

        @InterfaceC65349Pkn("nearby_return_days")
        public final Integer nearbyReturnDays;

        @InterfaceC65349Pkn("nearby_roaming_enable")
        public final boolean nearbyRoamingEnable;

        @InterfaceC65349Pkn("post_to_nearby_toggle_enable")
        public final boolean nearbyToggleControlEnable;

        @InterfaceC65349Pkn("settings_popup_freq")
        public Integer settingsPopupFreq;

        @InterfaceC65349Pkn("show_bottom_tab")
        public final boolean showBottomTab;

        @InterfaceC65349Pkn("show_change_region_popup")
        public final boolean showChangeRegionPopup;

        @InterfaceC65349Pkn("show_content")
        public final boolean showContent;

        @InterfaceC65349Pkn("show_down_arrow")
        public final boolean showDownArrow;

        @InterfaceC65349Pkn("show_intro_once")
        public Boolean showIntroOnce;

        @InterfaceC65349Pkn("show_tab")
        public final boolean showTab;

        @InterfaceC65349Pkn("toast_enable")
        public Boolean toastEnable;

        @InterfaceC65349Pkn("user_publish_landing_nearby")
        public final boolean userPublishLandingNearby;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.showTab == config.showTab && this.showContent == config.showContent && this.showBottomTab == config.showBottomTab && o.LJ(this.bkgdVideo, config.bkgdVideo) && o.LJ(this.bkgdVideoCover, config.bkgdVideoCover) && o.LJ(this.abMode, config.abMode) && o.LJ(this.introPopupFreq, config.introPopupFreq) && o.LJ(this.settingsPopupFreq, config.settingsPopupFreq) && o.LJ(this.allowOnceSettingsPopupFreq, config.allowOnceSettingsPopupFreq) && o.LJ(this.bannerPopupFreq, config.bannerPopupFreq) && o.LJ(this.introPopupTitle, config.introPopupTitle) && o.LJ(this.introPopupText, config.introPopupText) && o.LJ(this.toastEnable, config.toastEnable) && o.LJ(this.showIntroOnce, config.showIntroOnce) && o.LJ(this.learnMoreUrlFeatureNotAvailable, config.learnMoreUrlFeatureNotAvailable) && o.LJ(this.learnMoreUrlIntro, config.learnMoreUrlIntro) && this.showDownArrow == config.showDownArrow && o.LJ(this.currentRegion, config.currentRegion) && this.showChangeRegionPopup == config.showChangeRegionPopup && this.nearbyRoamingEnable == config.nearbyRoamingEnable && o.LJ(this.nearbyPrivacyVisibilityToggleText, config.nearbyPrivacyVisibilityToggleText) && this.nearbyToggleControlEnable == config.nearbyToggleControlEnable && o.LJ(this.nearbyReturnDays, config.nearbyReturnDays) && this.userPublishLandingNearby == config.userPublishLandingNearby;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v82 */
        /* JADX WARN: Type inference failed for: r0v83 */
        public final int hashCode() {
            boolean z = this.showTab;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.showContent;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            ?? r03 = this.showBottomTab;
            int i4 = r03;
            if (r03 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            UrlStruct urlStruct = this.bkgdVideo;
            int hashCode = (i5 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
            UrlStruct urlStruct2 = this.bkgdVideoCover;
            int hashCode2 = (hashCode + (urlStruct2 == null ? 0 : urlStruct2.hashCode())) * 31;
            Integer num = this.abMode;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.introPopupFreq;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.settingsPopupFreq;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.allowOnceSettingsPopupFreq;
            int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.bannerPopupFreq;
            int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
            String str = this.introPopupTitle;
            int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.introPopupText;
            int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.toastEnable;
            int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.showIntroOnce;
            int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str3 = this.learnMoreUrlFeatureNotAvailable;
            int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.learnMoreUrlIntro;
            int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ?? r04 = this.showDownArrow;
            int i6 = r04;
            if (r04 != 0) {
                i6 = 1;
            }
            int i7 = (hashCode13 + i6) * 31;
            LocationRegion locationRegion = this.currentRegion;
            int hashCode14 = (i7 + (locationRegion == null ? 0 : locationRegion.hashCode())) * 31;
            ?? r05 = this.showChangeRegionPopup;
            int i8 = r05;
            if (r05 != 0) {
                i8 = 1;
            }
            int i9 = (hashCode14 + i8) * 31;
            ?? r06 = this.nearbyRoamingEnable;
            int i10 = r06;
            if (r06 != 0) {
                i10 = 1;
            }
            int i11 = (i9 + i10) * 31;
            String str5 = this.nearbyPrivacyVisibilityToggleText;
            int hashCode15 = (i11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            ?? r07 = this.nearbyToggleControlEnable;
            int i12 = r07;
            if (r07 != 0) {
                i12 = 1;
            }
            int i13 = (hashCode15 + i12) * 31;
            Integer num6 = this.nearbyReturnDays;
            return ((i13 + (num6 != null ? num6.hashCode() : 0)) * 31) + (this.userPublishLandingNearby ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(showTab=");
            sb.append(this.showTab);
            sb.append(", showContent=");
            sb.append(this.showContent);
            sb.append(", showBottomTab=");
            sb.append(this.showBottomTab);
            sb.append(", bkgdVideo=");
            sb.append(this.bkgdVideo);
            sb.append(", bkgdVideoCover=");
            sb.append(this.bkgdVideoCover);
            sb.append(", abMode=");
            sb.append(this.abMode);
            sb.append(", introPopupFreq=");
            sb.append(this.introPopupFreq);
            sb.append(", settingsPopupFreq=");
            sb.append(this.settingsPopupFreq);
            sb.append(", allowOnceSettingsPopupFreq=");
            sb.append(this.allowOnceSettingsPopupFreq);
            sb.append(", bannerPopupFreq=");
            sb.append(this.bannerPopupFreq);
            sb.append(", introPopupTitle=");
            sb.append(this.introPopupTitle);
            sb.append(", introPopupText=");
            sb.append(this.introPopupText);
            sb.append(", toastEnable=");
            sb.append(this.toastEnable);
            sb.append(", showIntroOnce=");
            sb.append(this.showIntroOnce);
            sb.append(", learnMoreUrlFeatureNotAvailable=");
            sb.append(this.learnMoreUrlFeatureNotAvailable);
            sb.append(", learnMoreUrlIntro=");
            sb.append(this.learnMoreUrlIntro);
            sb.append(", showDownArrow=");
            sb.append(this.showDownArrow);
            sb.append(", currentRegion=");
            sb.append(this.currentRegion);
            sb.append(", showChangeRegionPopup=");
            sb.append(this.showChangeRegionPopup);
            sb.append(", nearbyRoamingEnable=");
            sb.append(this.nearbyRoamingEnable);
            sb.append(", nearbyPrivacyVisibilityToggleText=");
            sb.append(this.nearbyPrivacyVisibilityToggleText);
            sb.append(", nearbyToggleControlEnable=");
            sb.append(this.nearbyToggleControlEnable);
            sb.append(", nearbyReturnDays=");
            sb.append(this.nearbyReturnDays);
            sb.append(", userPublishLandingNearby=");
            return C08880Wm.LIZJ(sb, this.userPublishLandingNearby, ')');
        }

        public Config(boolean z, boolean z2, boolean z3, UrlStruct urlStruct, UrlStruct urlStruct2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, boolean z4, LocationRegion locationRegion, boolean z5, boolean z6, String str5, boolean z7, Integer num6, boolean z8) {
            this.showTab = z;
            this.showContent = z2;
            this.showBottomTab = z3;
            this.bkgdVideo = urlStruct;
            this.bkgdVideoCover = urlStruct2;
            this.abMode = num;
            this.introPopupFreq = num2;
            this.settingsPopupFreq = num3;
            this.allowOnceSettingsPopupFreq = num4;
            this.bannerPopupFreq = num5;
            this.introPopupTitle = str;
            this.introPopupText = str2;
            this.toastEnable = bool;
            this.showIntroOnce = bool2;
            this.learnMoreUrlFeatureNotAvailable = str3;
            this.learnMoreUrlIntro = str4;
            this.showDownArrow = z4;
            this.currentRegion = locationRegion;
            this.showChangeRegionPopup = z5;
            this.nearbyRoamingEnable = z6;
            this.nearbyPrivacyVisibilityToggleText = str5;
            this.nearbyToggleControlEnable = z7;
            this.nearbyReturnDays = num6;
            this.userPublishLandingNearby = z8;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Config(boolean r26, boolean r27, boolean r28, com.ss.android.ugc.aweme.settings.UrlStruct r29, com.ss.android.ugc.aweme.settings.UrlStruct r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Integer r33, java.lang.Integer r34, java.lang.Integer r35, java.lang.String r36, java.lang.String r37, java.lang.Boolean r38, java.lang.Boolean r39, java.lang.String r40, java.lang.String r41, boolean r42, com.ss.android.ugc.tiktok.location_api.service.LocationRegion r43, boolean r44, boolean r45, java.lang.String r46, boolean r47, java.lang.Integer r48, boolean r49, int r50, kotlin.jvm.internal.DefaultConstructorMarker r51) {
            /*
                Method dump skipped, instructions count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settings.NearbyTabConfig.Config.<init>(boolean, boolean, boolean, com.ss.android.ugc.aweme.settings.UrlStruct, com.ss.android.ugc.aweme.settings.UrlStruct, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, boolean, com.ss.android.ugc.tiktok.location_api.service.LocationRegion, boolean, boolean, java.lang.String, boolean, java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        LIZ = new Config(z, z, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, 16777212, 0 == true ? 1 : 0);
    }

    public static int LIZ() {
        Integer num = LIZIZ().allowOnceSettingsPopupFreq;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Config LIZIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("nearby_tab_config", Config.class, LIZ);
        if (config == null) {
            boolean z = false;
            return new Config(z, z, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, 16777212, 0 == true ? 1 : 0);
        }
        return config;
    }

    public static LocationRegion LIZJ() {
        return LIZIZ().currentRegion;
    }

    public static boolean LIZLLL() {
        if (LIZIZ().nearbyRoamingEnable && LIZIZ().currentRegion != null) {
            return true;
        }
        return false;
    }

    public static int LJ() {
        Integer num = LIZIZ().settingsPopupFreq;
        if (num != null) {
            return num.intValue();
        }
        return 7;
    }

    public static boolean LJFF() {
        return LIZIZ().showContent;
    }

    public static boolean LJI() {
        if (LIZIZ().showDownArrow && LIZIZ().currentRegion != null) {
            return true;
        }
        return false;
    }

    public static boolean LJII() {
        Boolean bool = LIZIZ().toastEnable;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
