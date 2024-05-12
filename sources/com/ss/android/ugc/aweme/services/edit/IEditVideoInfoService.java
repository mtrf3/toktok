package com.ss.android.ugc.aweme.services.edit;

/* loaded from: classes3.dex */
public interface IEditVideoInfoService {
    VideoInfoData getVideoInfoData(String str);

    Long getVideoLength(String str);

    void setVideoInfoData(String str, VideoInfoData videoInfoData);

    void setVideoLength(String str, long j);
}
