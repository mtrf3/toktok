package com.bytedance.ies.ugc.aweme.ttsetting.model;

import X.C35612DyK;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class TTSettingDataAppBean {

    @InterfaceC65349Pkn("aweme_live_podcast")
    public AwemeLivePodcast awemeLivePodcast;

    @InterfaceC65349Pkn("aweme_music_ailab")
    public AwemeMusicAilab awemeMusicAilab;

    @InterfaceC65349Pkn("aweme_push_monitor_config")
    public AwemePushMonitorConfig awemePushMonitorConfig;

    @InterfaceC65349Pkn("aweme_uniqueid_settings")
    public AwemeUniqueidSettings awemeUniqueidSettings;

    @InterfaceC65349Pkn("pre_download_delay_days")
    public Integer preDownloadDelayDays;

    @InterfaceC65349Pkn("pre_download_delay_second")
    public Long preDownloadDelaySecond;

    @InterfaceC65349Pkn("pre_download_start_time")
    public Integer preDownloadStartTime;

    @InterfaceC65349Pkn("pre_download_version")
    public Integer preDownloadVersion;

    @InterfaceC65349Pkn("teens_mode_alert_count")
    public Integer teensModeAlertCount;

    @InterfaceC65349Pkn("teens_mode_match_alert_switch")
    public Boolean teensModeMatchAlertSwitch;

    @InterfaceC65349Pkn("update_sdk")
    public Integer updateSdk;

    @InterfaceC65349Pkn("user_badge_click_settings")
    public C35612DyK userBadgeClickSettings;

    /* loaded from: classes7.dex */
    public static final class AwemeLivePodcast {

        @InterfaceC65349Pkn("can_be_obs_live_podcast")
        public Boolean canBeObsLivePodcast;
    }

    /* loaded from: classes7.dex */
    public static final class AwemeMusicAilab {

        @InterfaceC65349Pkn("frame_count")
        public Integer frameCount;

        @InterfaceC65349Pkn("song_uri")
        public String songUri;

        @InterfaceC65349Pkn("song_url_list")
        public ArrayList<String> songUrlList;
    }

    /* loaded from: classes7.dex */
    public static final class AwemePushMonitorConfig {

        @InterfaceC65349Pkn("default_send_data_interval")
        public Integer defaultSendDataInterval;

        @InterfaceC65349Pkn("enable_upload_unactive_apps")
        public Boolean enableUploadUnactiveApps;

        @InterfaceC65349Pkn("is_monitor_alive_enable")
        public Integer isMonitorAliveEnable;

        @InterfaceC65349Pkn("max_send_start_info_num")
        public Integer maxSendStartInfoNum;

        @InterfaceC65349Pkn("monitor_live_interval_second")
        public Integer monitorLiveIntervalSecond;

        @InterfaceC65349Pkn("upload_unactive_app_packages")
        public ArrayList<String> uploadUnactiveAppPackages;
    }

    /* loaded from: classes7.dex */
    public static final class AwemeUniqueidSettings {

        @InterfaceC65349Pkn("enable_al")
        public Integer enableAl;

        @InterfaceC65349Pkn("get_mobile_delay")
        public Integer getMobileDelay;

        @InterfaceC65349Pkn("get_phone_enable")
        public Integer getPhoneEnable;

        @InterfaceC65349Pkn("other_info_enable")
        public Integer otherInfoEnable;

        @InterfaceC65349Pkn("tt_get_mobile_retry_times")
        public Integer ttGetMobileRetryTimes;
    }

    public final C35612DyK getUserBadgeClickSettings() {
        return null;
    }

    public final void setUserBadgeClickSettings(C35612DyK c35612DyK) {
    }

    public final AwemeLivePodcast getAwemeLivePodcast() {
        return this.awemeLivePodcast;
    }

    public final AwemeMusicAilab getAwemeMusicAilab() {
        return this.awemeMusicAilab;
    }

    public final AwemePushMonitorConfig getAwemePushMonitorConfig() {
        return this.awemePushMonitorConfig;
    }

    public final AwemeUniqueidSettings getAwemeUniqueidSettings() {
        return this.awemeUniqueidSettings;
    }

    public final Integer getPreDownloadDelayDays() {
        return this.preDownloadDelayDays;
    }

    public final Long getPreDownloadDelaySecond() {
        return this.preDownloadDelaySecond;
    }

    public final Integer getPreDownloadStartTime() {
        return this.preDownloadStartTime;
    }

    public final Integer getPreDownloadVersion() {
        return this.preDownloadVersion;
    }

    public final Integer getTeensModeAlertCount() {
        return this.teensModeAlertCount;
    }

    public final Boolean getTeensModeMatchAlertSwitch() {
        return this.teensModeMatchAlertSwitch;
    }

    public final Integer getUpdateSdk() {
        return this.updateSdk;
    }

    public final void setAwemeLivePodcast(AwemeLivePodcast awemeLivePodcast) {
        this.awemeLivePodcast = awemeLivePodcast;
    }

    public final void setAwemeMusicAilab(AwemeMusicAilab awemeMusicAilab) {
        this.awemeMusicAilab = awemeMusicAilab;
    }

    public final void setAwemePushMonitorConfig(AwemePushMonitorConfig awemePushMonitorConfig) {
        this.awemePushMonitorConfig = awemePushMonitorConfig;
    }

    public final void setAwemeUniqueidSettings(AwemeUniqueidSettings awemeUniqueidSettings) {
        this.awemeUniqueidSettings = awemeUniqueidSettings;
    }

    public final void setPreDownloadDelayDays(Integer num) {
        this.preDownloadDelayDays = num;
    }

    public final void setPreDownloadDelaySecond(Long l) {
        this.preDownloadDelaySecond = l;
    }

    public final void setPreDownloadStartTime(Integer num) {
        this.preDownloadStartTime = num;
    }

    public final void setPreDownloadVersion(Integer num) {
        this.preDownloadVersion = num;
    }

    public final void setTeensModeAlertCount(Integer num) {
        this.teensModeAlertCount = num;
    }

    public final void setTeensModeMatchAlertSwitch(Boolean bool) {
        this.teensModeMatchAlertSwitch = bool;
    }

    public final void setUpdateSdk(Integer num) {
        this.updateSdk = num;
    }
}
