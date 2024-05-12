package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RtcLiveVideoParam extends F9E {
    public final String rtcBusinessId;
    public final RtcMixParam rtcMixParam;
    public final int rtcMixType;
    public final int rtcVideoParamMode;
    public final ArrayList<RtcResolution> videoResolutions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RtcLiveVideoParam copy$default(RtcLiveVideoParam rtcLiveVideoParam, int i, int i2, RtcMixParam rtcMixParam, ArrayList arrayList, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = rtcLiveVideoParam.rtcVideoParamMode;
        }
        if ((i3 & 2) != 0) {
            i2 = rtcLiveVideoParam.rtcMixType;
        }
        if ((i3 & 4) != 0) {
            rtcMixParam = rtcLiveVideoParam.rtcMixParam;
        }
        if ((i3 & 8) != 0) {
            arrayList = rtcLiveVideoParam.videoResolutions;
        }
        if ((i3 & 16) != 0) {
            str = rtcLiveVideoParam.rtcBusinessId;
        }
        return rtcLiveVideoParam.copy(i, i2, rtcMixParam, arrayList, str);
    }

    public final RtcLiveVideoParam copy(int i, int i2, RtcMixParam rtcMixParam, ArrayList<RtcResolution> videoResolutions, String rtcBusinessId) {
        o.LJIIIZ(rtcMixParam, "rtcMixParam");
        o.LJIIIZ(videoResolutions, "videoResolutions");
        o.LJIIIZ(rtcBusinessId, "rtcBusinessId");
        return new RtcLiveVideoParam(i, i2, rtcMixParam, videoResolutions, rtcBusinessId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.rtcVideoParamMode), Integer.valueOf(this.rtcMixType), this.rtcMixParam, this.videoResolutions, this.rtcBusinessId};
    }

    public final String getRtcBusinessId() {
        return this.rtcBusinessId;
    }

    public final RtcMixParam getRtcMixParam() {
        return this.rtcMixParam;
    }

    public final int getRtcMixType() {
        return this.rtcMixType;
    }

    public final int getRtcVideoParamMode() {
        return this.rtcVideoParamMode;
    }

    public final ArrayList<RtcResolution> getVideoResolutions() {
        return this.videoResolutions;
    }

    public RtcLiveVideoParam(int i, int i2, RtcMixParam rtcMixParam, ArrayList<RtcResolution> videoResolutions, String rtcBusinessId) {
        o.LJIIIZ(rtcMixParam, "rtcMixParam");
        o.LJIIIZ(videoResolutions, "videoResolutions");
        o.LJIIIZ(rtcBusinessId, "rtcBusinessId");
        this.rtcVideoParamMode = i;
        this.rtcMixType = i2;
        this.rtcMixParam = rtcMixParam;
        this.videoResolutions = videoResolutions;
        this.rtcBusinessId = rtcBusinessId;
    }

    public /* synthetic */ RtcLiveVideoParam(int i, int i2, RtcMixParam rtcMixParam, ArrayList arrayList, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 2 : i2, rtcMixParam, arrayList, str);
    }
}
