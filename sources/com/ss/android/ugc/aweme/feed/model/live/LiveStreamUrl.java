package com.ss.android.ugc.aweme.feed.model.live;

import X.C78540Us4;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class LiveStreamUrl implements Serializable {
    public String bindNodeRtmpUrl;

    @InterfaceC65349Pkn("candidate_resolution")
    public ArrayList<String> candidateResolution;

    @InterfaceC65349Pkn("rtmp_pull_url_params")
    public String defaultPullSdkParams;

    @InterfaceC65349Pkn("default_resolution")
    public String defaultResolution;

    @InterfaceC65349Pkn("extra")
    public LiveStreamUrlExtra extra;

    @InterfaceC65349Pkn("flv_pull_url")
    public HashMap<String, String> flvPullUrl;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("live_core_sdk_data")
    public LiveCoreSDKData liveCoreSDKData;
    public String ngbRTMPUrl;

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
    public String rtmp_pull_url;

    @InterfaceC65349Pkn("rtmp_push_url")
    public String rtmp_push_url;
    public final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();
    public final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();
    public final LinkedList<LiveCoreSDKData.Quality> qualityList = new LinkedList<>();
    public String defaultQualityName = null;
    public String lowestQualityName = null;
    public LiveCoreSDKData.Quality multiDefaultQuality = null;
    public LiveCoreSDKData.Quality multiLowestQuality = null;

    public void validateMultiPullData() {
        this.multiDefaultQuality = null;
        this.multiLowestQuality = null;
        this.qualityList.clear();
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null) {
            return;
        }
        if (!C78540Us4.LJIILLIIL(liveCoreSDKData.getQualityList())) {
            for (LiveCoreSDKData.Quality quality : this.liveCoreSDKData.getQualityList()) {
                this.qualityList.add(quality);
                if (this.multiLowestQuality == null) {
                    this.multiLowestQuality = quality;
                }
            }
        }
        this.multiDefaultQuality = this.liveCoreSDKData.getDefaultQuality();
        if (this.qualityList.isEmpty()) {
            LiveCoreSDKData.Quality quality2 = this.multiDefaultQuality;
            this.multiLowestQuality = quality2;
            this.qualityList.add(quality2);
        }
    }

    public String getMultiStreamData() {
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null || liveCoreSDKData.getDefaultPreviewQuality() == null) {
            return null;
        }
        return this.liveCoreSDKData.getDefaultPreviewQuality().sdkKey;
    }

    public String getMultiStreamDefaultQualityName() {
        LiveCoreSDKData.Quality quality = this.multiDefaultQuality;
        if (quality == null) {
            return "";
        }
        return quality.name;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public String getMultiStreamLowestQualityName() {
        LiveCoreSDKData.Quality quality = this.multiLowestQuality;
        if (quality == null) {
            return "";
        }
        return quality.name;
    }

    public String getPullSdkParams() {
        Map<String, String> map = this.pullSdkParams;
        if (map != null) {
            return map.get("ORIGIN");
        }
        return null;
    }

    public Set<String> getQualities() {
        return this.qualityMap.keySet();
    }

    public String getRtmpPushUrl() {
        if (C78540Us4.LJIILL(this.ngbRTMPUrl)) {
            return this.rtmp_push_url;
        }
        return this.ngbRTMPUrl;
    }

    public boolean isMultiPullDataValid() {
        if (this.liveCoreSDKData == null) {
            return false;
        }
        validateMultiPullData();
        return !this.qualityList.isEmpty();
    }

    public void validatePullUrl() {
        String str;
        String str2;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.defaultQualityName = null;
        this.lowestQualityName = null;
        ArrayList<String> arrayList = this.candidateResolution;
        if (arrayList != null && this.resolutionName != null && this.flvPullUrl != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String str3 = this.resolutionName.get(next);
                if (str3 != null && (str = this.flvPullUrl.get(next)) != null) {
                    Map<String, String> map = this.pullSdkParams;
                    if (map == null) {
                        str2 = null;
                    } else {
                        str2 = map.get(next);
                    }
                    this.qualityMap.put(str3, str);
                    this.sdkParamsMap.put(str3, str2);
                    if (next.equals(this.defaultResolution)) {
                        this.defaultQualityName = str3;
                    } else if (this.defaultQualityName == null) {
                        this.defaultQualityName = str3;
                    }
                    if (this.lowestQualityName == null) {
                        this.lowestQualityName = str3;
                    }
                }
            }
        }
        if (this.qualityMap.isEmpty() && !TextUtils.isEmpty(this.rtmp_pull_url)) {
            this.defaultQualityName = "default";
            this.lowestQualityName = "default";
            this.qualityMap.put("default", this.rtmp_pull_url);
            this.sdkParamsMap.put(this.defaultQualityName, this.defaultPullSdkParams);
        }
    }

    public boolean isPullUrlValid() {
        validatePullUrl();
        return !this.qualityMap.isEmpty();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveStreamUrl{id=");
        LIZ.append(this.id);
        LIZ.append(", idStr='");
        Q89.LIZIZ(LIZ, this.idStr, '\'', ", provider=");
        LIZ.append(this.provider);
        LIZ.append(", rtmpPushUrl='");
        Q89.LIZIZ(LIZ, this.rtmp_push_url, '\'', ", pushUrlList=");
        LIZ.append(this.pushUrlList);
        LIZ.append(", rtmp_pull_url='");
        Q89.LIZIZ(LIZ, this.rtmp_pull_url, '\'', ", flvPullUrl=");
        LIZ.append(this.flvPullUrl);
        LIZ.append(", resolutionName=");
        LIZ.append(this.resolutionName);
        LIZ.append(", pullSdkParams=");
        LIZ.append(this.pullSdkParams);
        LIZ.append(", candidateResolution=");
        LIZ.append(this.candidateResolution);
        LIZ.append(", defaultResolution='");
        Q89.LIZIZ(LIZ, this.defaultResolution, '\'', ", extra=");
        LIZ.append(this.extra);
        LIZ.append(", defaultPullSdkParams='");
        Q89.LIZIZ(LIZ, this.defaultPullSdkParams, '\'', ", pushSdkParams='");
        Q89.LIZIZ(LIZ, this.pushSdkParams, '\'', ", liveCoreSDKData=");
        LIZ.append(this.liveCoreSDKData);
        LIZ.append(", ngbRTMPUrl='");
        Q89.LIZIZ(LIZ, this.ngbRTMPUrl, '\'', ", bindNodeRtmpUrl='");
        Q89.LIZIZ(LIZ, this.bindNodeRtmpUrl, '\'', ", qualityMap=");
        LIZ.append(this.qualityMap);
        LIZ.append(", sdkParamsMap=");
        LIZ.append(this.sdkParamsMap);
        LIZ.append(", qualityList=");
        LIZ.append(this.qualityList);
        LIZ.append(", defaultQualityName='");
        Q89.LIZIZ(LIZ, this.defaultQualityName, '\'', ", lowestQualityName='");
        Q89.LIZIZ(LIZ, this.lowestQualityName, '\'', ", multiDefaultQuality=");
        LIZ.append(this.multiDefaultQuality);
        LIZ.append(", multiLowestQuality=");
        LIZ.append(this.multiLowestQuality);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getBindNodeRtmpUrl() {
        return this.bindNodeRtmpUrl;
    }

    public String getDefaultQuality() {
        return this.defaultQualityName;
    }

    public LiveStreamUrlExtra getExtra() {
        return this.extra;
    }

    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public LiveCoreSDKData getLiveCoreSDKData() {
        return this.liveCoreSDKData;
    }

    public String getLowestQuality() {
        return this.lowestQualityName;
    }

    public int getProvider() {
        return this.provider;
    }

    public String getPushSdkParams() {
        return this.pushSdkParams;
    }

    public List<String> getPushUrlList() {
        return this.pushUrlList;
    }

    public List<LiveCoreSDKData.Quality> getQualityList() {
        return this.qualityList;
    }

    public String getRtmpPullUrl() {
        return this.rtmp_pull_url;
    }

    public void setBindNodeRtmpUrl(String str) {
        this.bindNodeRtmpUrl = str;
    }

    public void setCandidateResolution(ArrayList<String> arrayList) {
        this.candidateResolution = arrayList;
    }

    public void setDefaultResolution(String str) {
        this.defaultResolution = str;
    }

    public void setExtra(LiveStreamUrlExtra liveStreamUrlExtra) {
        this.extra = liveStreamUrlExtra;
    }

    public void setFlvPullUrl(HashMap<String, String> hashMap) {
        this.flvPullUrl = hashMap;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    @InterfaceC65349Pkn("live_core_sdk_data")
    public void setLiveCoreSDKData(LiveCoreSDKData liveCoreSDKData) {
        this.liveCoreSDKData = liveCoreSDKData;
    }

    public void setNgbRTMPUrl(String str) {
        this.ngbRTMPUrl = str;
    }

    public void setProvider(int i) {
        this.provider = i;
    }

    @InterfaceC65349Pkn("rtmp_push_url_params")
    public void setPushSdkParams(String str) {
        this.pushSdkParams = str;
    }

    @InterfaceC65349Pkn("push_urls")
    public void setPushUrlList(List<String> list) {
        this.pushUrlList = list;
    }

    public void setResolutionName(Map<String, String> map) {
        this.resolutionName = map;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmp_pull_url = str;
    }

    public void setRtmpPushUrl(String str) {
        this.rtmp_push_url = str;
    }
}
