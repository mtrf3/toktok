package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class StreamUrlStruct implements Serializable {

    @InterfaceC65349Pkn("live_core_sdk_data")
    public LiveCoreSDKData liveCoreSDKData;
    public LiveStreamUrlExtra liveStreamUrlExtra;

    @InterfaceC65349Pkn("candidate_resolution")
    public ArrayList<String> mCandidateResolutionList;

    @InterfaceC65349Pkn("default_resolution")
    public String mDefaultResolution;

    @InterfaceC65349Pkn("flv_pull_url")
    public HashMap<String, String> mFlvPullUrlMap;

    @InterfaceC65349Pkn("provider")
    public int provider;

    @InterfaceC65349Pkn("rtmp_pull_url")
    public String rtmp_pull_url;

    @InterfaceC65349Pkn("rtmp_push_url")
    public String rtmp_push_url;
    public String sdkParams = "";

    @InterfaceC65349Pkn("sid")
    public long sid;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StreamUrlStruct{sid=");
        LIZ.append(this.sid);
        LIZ.append(", rtmp_pull_url='");
        Q89.LIZIZ(LIZ, this.rtmp_pull_url, '\'', ", rtmp_push_url='");
        Q89.LIZIZ(LIZ, this.rtmp_push_url, '\'', ", provider=");
        LIZ.append(this.provider);
        LIZ.append(", mFlvPullUrlMap=");
        LIZ.append(this.mFlvPullUrlMap);
        LIZ.append(", mCandidateResolutionList=");
        LIZ.append(this.mCandidateResolutionList);
        LIZ.append(", mDefaultResolution='");
        Q89.LIZIZ(LIZ, this.mDefaultResolution, '\'', ", liveCoreSDKData=");
        LIZ.append(this.liveCoreSDKData);
        LIZ.append(", liveStreamUrlExtra=");
        LIZ.append(this.liveStreamUrlExtra);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
