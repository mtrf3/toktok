package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class StreamUrl {
    public String LIZ;
    public String LIZIZ;

    @InterfaceC65349Pkn("candidate_resolution")
    public List<String> candidateResolution;

    @InterfaceC65349Pkn("complete_push_urls")
    public List<String> completePushUrls;

    @InterfaceC65349Pkn("rtmp_pull_url_params")
    public String defaultPullSdkParams;

    @InterfaceC65349Pkn("default_resolution")
    public String defaultResolution;

    @InterfaceC65349Pkn("extra")
    public StreamUrlExtra extra;

    @InterfaceC65349Pkn("flv_pull_url")
    public Map<String, String> flvPullUrl;

    @InterfaceC65349Pkn("hls_pull_url")
    public String hlsPullUrl;

    @InterfaceC65349Pkn("hls_pull_url_map")
    public Map<String, String> hlsPullUrlMap;

    @InterfaceC65349Pkn("hls_pull_url_params")
    public String hlsPullUrlParams;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("live_core_sdk_data")
    public LiveCoreSDKData liveCoreSDKData;

    @InterfaceC65349Pkn("provider")
    public int provider;

    @InterfaceC65349Pkn("flv_pull_url_params")
    public Map<String, String> pullSdkParams;

    @InterfaceC65349Pkn("rtmp_push_url_params")
    public String pushSdkParams;

    @InterfaceC65349Pkn("push_urls")
    public List<String> pushUrlList;

    @InterfaceC65349Pkn("resolution_name")
    public Map<String, String> resolutionName;

    @InterfaceC65349Pkn("rtmp_pull_url")
    public String rtmpPullUrl;

    @InterfaceC65349Pkn("rtmp_push_url")
    public String rtmpPushUrl;

    @InterfaceC65349Pkn("stream_app_id")
    public long streamAppId;

    @InterfaceC65349Pkn("stream_control_type")
    public Integer streamControlType;

    @InterfaceC65349Pkn("stream_delay_ms")
    public long streamDelayMs;
    public final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();
    public final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();
    public final LinkedList<LiveCoreSDKData.Quality> qualityList = new LinkedList<>();
    public String LIZJ = null;
    public String LIZLLL = null;
    public LiveCoreSDKData.Quality LJ = null;
    public LiveCoreSDKData.Quality LJFF = null;

    @InterfaceC65349Pkn("push_resolution")
    public String pushResolution = "";

    public final void LIZIZ() {
        this.LJ = null;
        this.LJFF = null;
        this.qualityList.clear();
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null) {
            return;
        }
        if (liveCoreSDKData.getQualityList() != null && this.liveCoreSDKData.getQualityList().size() > 0) {
            for (LiveCoreSDKData.Quality quality : this.liveCoreSDKData.getQualityList()) {
                this.qualityList.add(quality);
                if (this.LJFF == null) {
                    this.LJFF = quality;
                }
            }
        }
        this.LJ = this.liveCoreSDKData.getDefaultQuality();
        if (this.qualityList.isEmpty()) {
            LiveCoreSDKData.Quality quality2 = this.LJ;
            this.LJFF = quality2;
            this.qualityList.add(quality2);
        }
    }

    public final String LIZ() {
        if (TextUtils.isEmpty(this.LIZ)) {
            return this.rtmpPushUrl;
        }
        return this.LIZ;
    }

    public final void LIZJ() {
        String str;
        String str2;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.LIZJ = null;
        this.LIZLLL = null;
        List<String> list = this.candidateResolution;
        if (list != null && this.resolutionName != null && this.flvPullUrl != null) {
            for (String str3 : list) {
                String str4 = this.resolutionName.get(str3);
                if (str4 != null && (str = this.flvPullUrl.get(str3)) != null) {
                    Map<String, String> map = this.pullSdkParams;
                    if (map == null) {
                        str2 = null;
                    } else {
                        str2 = map.get(str3);
                    }
                    this.qualityMap.put(str4, str);
                    this.sdkParamsMap.put(str4, str2);
                    if (str3.equals(this.defaultResolution)) {
                        this.LIZJ = str4;
                    } else if (this.LIZJ == null) {
                        this.LIZJ = str4;
                    }
                    if (this.LIZLLL == null) {
                        this.LIZLLL = str4;
                    }
                }
            }
        }
        if (this.qualityMap.isEmpty() && !TextUtils.isEmpty(this.rtmpPullUrl)) {
            this.LIZJ = "default";
            this.LIZLLL = "default";
            this.qualityMap.put("default", this.rtmpPullUrl);
            this.sdkParamsMap.put(this.LIZJ, this.defaultPullSdkParams);
        }
    }
}
