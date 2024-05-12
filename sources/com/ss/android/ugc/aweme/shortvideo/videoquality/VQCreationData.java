package com.ss.android.ugc.aweme.shortvideo.videoquality;

import X.AnonymousClass391;
import X.C07670Rv;
import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.WM7;
import X.X1D;
import com.google.gson.m;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import defpackage.b0;
import defpackage.q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VQCreationData {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("action")
    public final m action;

    @InterfaceC65349Pkn("app_info")
    public final AppInfo appInfo;

    @InterfaceC65349Pkn("creation_id")
    public final String creationID;

    @InterfaceC65349Pkn("device_info")
    public final DeviceInfo deviceInfo;

    @InterfaceC65349Pkn("env")
    public final EnvInfo envInfo;

    @InterfaceC65349Pkn("media_sources")
    public final List<MediaSource> mediaSources;

    @InterfaceC65349Pkn("other_info")
    public final OtherInfo otherInfo;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final int scene;

    @InterfaceC65349Pkn("user_info")
    public final UserInfo userInfo;

    @InterfaceC65349Pkn("ve_info")
    public Map<String, ? extends Object> veInfo;

    @InterfaceC65349Pkn("version")
    public final String version;

    @InterfaceC65349Pkn("result")
    public final VideoInfo videoInfo;

    /* loaded from: classes8.dex */
    public static final class DeviceInfo {

        @InterfaceC65349Pkn("device_brand")
        public final String deviceBrand;

        @InterfaceC65349Pkn("device_type")
        public final String deviceType;

        @InterfaceC65349Pkn("did")
        public final String did;

        @InterfaceC65349Pkn("os")
        public final String os;

        @InterfaceC65349Pkn("os_version")
        public final String osVersion;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceInfo)) {
                return false;
            }
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            return o.LJ(this.osVersion, deviceInfo.osVersion) && o.LJ(this.os, deviceInfo.os) && o.LJ(this.deviceType, deviceInfo.deviceType) && o.LJ(this.deviceBrand, deviceInfo.deviceBrand) && o.LJ(this.did, deviceInfo.did);
        }

        public final int hashCode() {
            return this.did.hashCode() + C79062V1e.LJ(this.deviceBrand, C79062V1e.LJ(this.deviceType, C79062V1e.LJ(this.os, this.osVersion.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DeviceInfo(osVersion=");
            LIZ.append(this.osVersion);
            LIZ.append(", os=");
            LIZ.append(this.os);
            LIZ.append(", deviceType=");
            LIZ.append(this.deviceType);
            LIZ.append(", deviceBrand=");
            LIZ.append(this.deviceBrand);
            LIZ.append(", did=");
            return q.LIZIZ(LIZ, this.did, ')', LIZ);
        }

        public DeviceInfo(String osVersion, String os, String deviceType, String deviceBrand, String did) {
            o.LJIIIZ(osVersion, "osVersion");
            o.LJIIIZ(os, "os");
            o.LJIIIZ(deviceType, "deviceType");
            o.LJIIIZ(deviceBrand, "deviceBrand");
            o.LJIIIZ(did, "did");
            this.osVersion = osVersion;
            this.os = os;
            this.deviceType = deviceType;
            this.deviceBrand = deviceBrand;
            this.did = did;
        }
    }

    /* loaded from: classes8.dex */
    public static final class UserInfo {

        @InterfaceC65349Pkn("follower_count")
        public final int followerCount;

        @InterfaceC65349Pkn("region")
        public final String region;

        @InterfaceC65349Pkn("uid")
        public final String uid;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserInfo)) {
                return false;
            }
            UserInfo userInfo = (UserInfo) obj;
            return this.followerCount == userInfo.followerCount && o.LJ(this.region, userInfo.region) && o.LJ(this.uid, userInfo.uid);
        }

        public final int hashCode() {
            return this.uid.hashCode() + C79062V1e.LJ(this.region, this.followerCount * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UserInfo(followerCount=");
            LIZ.append(this.followerCount);
            LIZ.append(", region=");
            LIZ.append(this.region);
            LIZ.append(", uid=");
            return q.LIZIZ(LIZ, this.uid, ')', LIZ);
        }

        public UserInfo(int i, String region, String uid) {
            o.LJIIIZ(region, "region");
            o.LJIIIZ(uid, "uid");
            this.followerCount = i;
            this.region = region;
            this.uid = uid;
        }
    }

    /* loaded from: classes8.dex */
    public static final class VideoInfo {
        public static final /* synthetic */ int LIZ = 0;

        @InterfaceC65349Pkn("bitrate")
        public final String bitrate;

        @InterfaceC65349Pkn("file_size")
        public final long fileSize;

        @InterfaceC65349Pkn("fps")
        public final int fps;

        @InterfaceC65349Pkn("is_reencode")
        public final boolean isReencode;

        @InterfaceC65349Pkn("not_remux_error_code")
        public final int notRemuxErrorCode;

        @InterfaceC65349Pkn("resolution")
        public final String resolution;

        @InterfaceC65349Pkn("type")
        public final int type;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoInfo)) {
                return false;
            }
            VideoInfo videoInfo = (VideoInfo) obj;
            return this.type == videoInfo.type && o.LJ(this.resolution, videoInfo.resolution) && this.isReencode == videoInfo.isReencode && o.LJ(this.bitrate, videoInfo.bitrate) && this.notRemuxErrorCode == videoInfo.notRemuxErrorCode && this.fileSize == videoInfo.fileSize && this.fps == videoInfo.fps;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int i = this.type * 31;
            String str = this.resolution;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (i + hashCode) * 31;
            boolean z = this.isReencode;
            int i4 = z;
            if (z != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            String str2 = this.bitrate;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return JBR.LIZJ(this.fileSize, (((i5 + i2) * 31) + this.notRemuxErrorCode) * 31, 31) + this.fps;
        }

        public final String toString() {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VideoInfo(type=");
            LIZ2.append(this.type);
            LIZ2.append(", resolution=");
            LIZ2.append(this.resolution);
            LIZ2.append(", isReencode=");
            LIZ2.append(this.isReencode);
            LIZ2.append(", bitrate=");
            LIZ2.append(this.bitrate);
            LIZ2.append(", notRemuxErrorCode=");
            LIZ2.append(this.notRemuxErrorCode);
            LIZ2.append(", fileSize=");
            LIZ2.append(this.fileSize);
            LIZ2.append(", fps=");
            return b0.LIZJ(LIZ2, this.fps, ')', LIZ2);
        }

        public VideoInfo(int i, String str, boolean z, String str2, int i2, long j, int i3) {
            this.type = i;
            this.resolution = str;
            this.isReencode = z;
            this.bitrate = str2;
            this.notRemuxErrorCode = i2;
            this.fileSize = j;
            this.fps = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VQCreationData)) {
            return false;
        }
        VQCreationData vQCreationData = (VQCreationData) obj;
        return o.LJ(this.videoInfo, vQCreationData.videoInfo) && o.LJ(this.deviceInfo, vQCreationData.deviceInfo) && o.LJ(this.appInfo, vQCreationData.appInfo) && o.LJ(this.userInfo, vQCreationData.userInfo) && o.LJ(this.mediaSources, vQCreationData.mediaSources) && o.LJ(this.envInfo, vQCreationData.envInfo) && o.LJ(this.action, vQCreationData.action) && o.LJ(this.veInfo, vQCreationData.veInfo) && o.LJ(this.otherInfo, vQCreationData.otherInfo) && this.scene == vQCreationData.scene && o.LJ(this.creationID, vQCreationData.creationID) && o.LJ(this.version, vQCreationData.version);
    }

    /* loaded from: classes8.dex */
    public static final class AppInfo {

        @InterfaceC65349Pkn("app_id")
        public final String appId;

        @InterfaceC65349Pkn("app_version")
        public final String appVersion;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppInfo)) {
                return false;
            }
            AppInfo appInfo = (AppInfo) obj;
            return o.LJ(this.appVersion, appInfo.appVersion) && o.LJ(this.appId, appInfo.appId);
        }

        public final int hashCode() {
            return this.appId.hashCode() + (this.appVersion.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AppInfo(appVersion=");
            LIZ.append(this.appVersion);
            LIZ.append(", appId=");
            return q.LIZIZ(LIZ, this.appId, ')', LIZ);
        }

        public AppInfo(String appVersion, String appId) {
            o.LJIIIZ(appVersion, "appVersion");
            o.LJIIIZ(appId, "appId");
            this.appVersion = appVersion;
            this.appId = appId;
        }
    }

    /* loaded from: classes8.dex */
    public static final class MediaSource {
        public static final /* synthetic */ int LIZ = 0;

        @InterfaceC65349Pkn("bitrate")
        public final String bitrate;

        @InterfaceC65349Pkn("fps")
        public final int fps;

        @InterfaceC65349Pkn("resolution")
        public final String resolution;

        @InterfaceC65349Pkn("type")
        public final int type;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaSource)) {
                return false;
            }
            MediaSource mediaSource = (MediaSource) obj;
            return this.type == mediaSource.type && o.LJ(this.resolution, mediaSource.resolution) && o.LJ(this.bitrate, mediaSource.bitrate) && this.fps == mediaSource.fps;
        }

        public final int hashCode() {
            int i = this.type * 31;
            String str = this.resolution;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bitrate;
            return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.fps;
        }

        public final String toString() {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("MediaSource(type=");
            LIZ2.append(this.type);
            LIZ2.append(", resolution=");
            LIZ2.append(this.resolution);
            LIZ2.append(", bitrate=");
            LIZ2.append(this.bitrate);
            LIZ2.append(", fps=");
            return b0.LIZJ(LIZ2, this.fps, ')', LIZ2);
        }

        public MediaSource(int i, String str, String str2, int i2) {
            this.type = i;
            this.resolution = str;
            this.bitrate = str2;
            this.fps = i2;
        }
    }

    /* loaded from: classes8.dex */
    public static final class OtherInfo {

        @InterfaceC65349Pkn("enter_from")
        public final String enterFrom;

        @InterfaceC65349Pkn("is_draft_or_backup")
        public final boolean isDraft;

        @InterfaceC65349Pkn("published_vids")
        public final List<String> publishedVids;

        @InterfaceC65349Pkn("video_content_source")
        public final String videoContentSource;

        @InterfaceC65349Pkn("video_source")
        public final int videoSource;

        @InterfaceC65349Pkn("video_type")
        public final String videoType;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OtherInfo)) {
                return false;
            }
            OtherInfo otherInfo = (OtherInfo) obj;
            return this.videoSource == otherInfo.videoSource && o.LJ(this.videoContentSource, otherInfo.videoContentSource) && o.LJ(this.videoType, otherInfo.videoType) && o.LJ(this.enterFrom, otherInfo.enterFrom) && this.isDraft == otherInfo.isDraft && o.LJ(this.publishedVids, otherInfo.publishedVids);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = this.videoSource * 31;
            String str = this.videoContentSource;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.videoType;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.enterFrom;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            boolean z = this.isDraft;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return this.publishedVids.hashCode() + ((hashCode3 + i2) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OtherInfo(videoSource=");
            LIZ.append(this.videoSource);
            LIZ.append(", videoContentSource=");
            LIZ.append(this.videoContentSource);
            LIZ.append(", videoType=");
            LIZ.append(this.videoType);
            LIZ.append(", enterFrom=");
            LIZ.append(this.enterFrom);
            LIZ.append(", isDraft=");
            LIZ.append(this.isDraft);
            LIZ.append(", publishedVids=");
            return C1NE.LIZIZ(LIZ, this.publishedVids, ')', LIZ);
        }

        public OtherInfo(int i, String str, String str2, String str3, boolean z, List<String> publishedVids) {
            o.LJIIIZ(publishedVids, "publishedVids");
            this.videoSource = i;
            this.videoContentSource = str;
            this.videoType = str2;
            this.enterFrom = str3;
            this.isDraft = z;
            this.publishedVids = publishedVids;
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        VideoInfo videoInfo = this.videoInfo;
        int i = 0;
        if (videoInfo == null) {
            hashCode = 0;
        } else {
            hashCode = videoInfo.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.mediaSources, (this.userInfo.hashCode() + ((this.appInfo.hashCode() + ((this.deviceInfo.hashCode() + (hashCode * 31)) * 31)) * 31)) * 31, 31);
        EnvInfo envInfo = this.envInfo;
        if (envInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = envInfo.hashCode();
        }
        int hashCode5 = (this.action.hashCode() + ((LIZIZ + hashCode2) * 31)) * 31;
        Map<String, ? extends Object> map = this.veInfo;
        if (map == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map.hashCode();
        }
        int i2 = (hashCode5 + hashCode3) * 31;
        OtherInfo otherInfo = this.otherInfo;
        if (otherInfo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = otherInfo.hashCode();
        }
        int i3 = (((i2 + hashCode4) * 31) + this.scene) * 31;
        String str = this.creationID;
        if (str != null) {
            i = str.hashCode();
        }
        return this.version.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VQCreationData(videoInfo=");
        sb.append(this.videoInfo);
        sb.append(", deviceInfo=");
        sb.append(this.deviceInfo);
        sb.append(", appInfo=");
        sb.append(this.appInfo);
        sb.append(", userInfo=");
        sb.append(this.userInfo);
        sb.append(", mediaSources=");
        sb.append(this.mediaSources);
        sb.append(", envInfo=");
        sb.append(this.envInfo);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", veInfo=");
        sb.append(this.veInfo);
        sb.append(", otherInfo=");
        sb.append(this.otherInfo);
        sb.append(", scene=");
        sb.append(this.scene);
        sb.append(", creationID=");
        sb.append(this.creationID);
        sb.append(", version=");
        return C07670Rv.LIZIZ(sb, this.version, ')');
    }

    /* loaded from: classes7.dex */
    public static final class EnvInfo {
        public static final /* synthetic */ int LIZ = 0;

        @InterfaceC65349Pkn("settings")
        public final Map<String, Object> settings;

        @InterfaceC65349Pkn("video_quality_info")
        public final m videoQualityInfo;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnvInfo)) {
                return false;
            }
            EnvInfo envInfo = (EnvInfo) obj;
            return o.LJ(this.settings, envInfo.settings) && o.LJ(this.videoQualityInfo, envInfo.videoQualityInfo);
        }

        public final int hashCode() {
            return this.videoQualityInfo.hashCode() + (this.settings.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EnvInfo(settings=");
            LIZ2.append(this.settings);
            LIZ2.append(", videoQualityInfo=");
            LIZ2.append(this.videoQualityInfo);
            LIZ2.append(')');
            return X1D.LIZIZ(LIZ2);
        }

        public EnvInfo(Map<String, ? extends Object> settings, m videoQualityInfo) {
            o.LJIIIZ(settings, "settings");
            o.LJIIIZ(videoQualityInfo, "videoQualityInfo");
            this.settings = settings;
            this.videoQualityInfo = videoQualityInfo;
        }
    }

    public VQCreationData(VideoInfo videoInfo, DeviceInfo deviceInfo, AppInfo appInfo, UserInfo userInfo, List<MediaSource> mediaSources, EnvInfo envInfo, m action, Map<String, ? extends Object> map, OtherInfo otherInfo, int i, String str, String version) {
        o.LJIIIZ(deviceInfo, "deviceInfo");
        o.LJIIIZ(appInfo, "appInfo");
        o.LJIIIZ(userInfo, "userInfo");
        o.LJIIIZ(mediaSources, "mediaSources");
        o.LJIIIZ(action, "action");
        o.LJIIIZ(version, "version");
        this.videoInfo = videoInfo;
        this.deviceInfo = deviceInfo;
        this.appInfo = appInfo;
        this.userInfo = userInfo;
        this.mediaSources = mediaSources;
        this.envInfo = envInfo;
        this.action = action;
        this.veInfo = map;
        this.otherInfo = otherInfo;
        this.scene = i;
        this.creationID = str;
        this.version = version;
    }

    public /* synthetic */ VQCreationData(VideoInfo videoInfo, DeviceInfo deviceInfo, AppInfo appInfo, UserInfo userInfo, List list, EnvInfo envInfo, m mVar, Map map, OtherInfo otherInfo, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoInfo, deviceInfo, appInfo, userInfo, list, envInfo, mVar, map, otherInfo, i, str, (i2 & 2048) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
