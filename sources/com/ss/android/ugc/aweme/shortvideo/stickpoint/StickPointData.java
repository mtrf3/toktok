package com.ss.android.ugc.aweme.shortvideo.stickpoint;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class StickPointData implements Serializable {

    @InterfaceC65349Pkn("ai_cut_id")
    public String aiCutId;

    @InterfaceC65349Pkn("video_count")
    public Integer videoCount = 0;

    @InterfaceC65349Pkn("video_cut_len_list")
    public String videoCutLenListStr;

    @InterfaceC65349Pkn("video_cut_start_time")
    public String videoCutStartTimeListStr;

    @InterfaceC65349Pkn("video_id")
    public String videoId;

    @InterfaceC65349Pkn("video_src_len_list")
    public String videoSrcLenListStr;

    public final String getAiCutId() {
        return this.aiCutId;
    }

    public final Integer getVideoCount() {
        return this.videoCount;
    }

    public final String getVideoCutLenListStr() {
        return this.videoCutLenListStr;
    }

    public final String getVideoCutStartTimeListStr() {
        return this.videoCutStartTimeListStr;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getVideoSrcLenListStr() {
        return this.videoSrcLenListStr;
    }

    public final void setAiCutId(String str) {
        this.aiCutId = str;
    }

    public final void setVideoCount(Integer num) {
        this.videoCount = num;
    }

    public final void setVideoCutLenListStr(String str) {
        this.videoCutLenListStr = str;
    }

    public final void setVideoCutStartTimeListStr(String str) {
        this.videoCutStartTimeListStr = str;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoSrcLenListStr(String str) {
        this.videoSrcLenListStr = str;
    }
}
