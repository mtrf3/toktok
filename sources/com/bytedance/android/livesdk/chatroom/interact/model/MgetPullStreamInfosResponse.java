package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import java.util.List;

/* loaded from: classes6.dex */
public final class MgetPullStreamInfosResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class PullStreamInfo extends F9E {

        @InterfaceC65349Pkn("live_type_audio")
        public Boolean liveTypeAudio;

        @InterfaceC65349Pkn("live_type_screenshot")
        public Boolean liveTypeScreenshot;

        @InterfaceC65349Pkn("live_type_third_party")
        public Boolean liveTypeThirdParty;

        @InterfaceC65349Pkn("pull_data_option_default_quality")
        public LiveCoreSDKData.Quality pullDataOptionDefaultQuality;

        @InterfaceC65349Pkn("pull_stream_url_data")
        public String pullStreamUrlData;

        @InterfaceC65349Pkn("room_id")
        public Long roomId;

        @InterfaceC65349Pkn("stream_url_extra_super_resolution")
        public StreamUrlExtra.SrConfig streamUrlExtraSuperResolution;

        @Override // X.F9E
        public final Object[] getObjects() {
            Long l = this.roomId;
            String str = this.pullStreamUrlData;
            LiveCoreSDKData.Quality quality = this.pullDataOptionDefaultQuality;
            StreamUrlExtra.SrConfig srConfig = this.streamUrlExtraSuperResolution;
            Boolean bool = this.liveTypeScreenshot;
            Boolean bool2 = this.liveTypeThirdParty;
            Boolean bool3 = this.liveTypeAudio;
            return new Object[]{l, l, str, str, quality, quality, srConfig, srConfig, bool, bool, bool2, bool2, bool3, bool3};
        }
    }

    /* loaded from: classes6.dex */
    public static final class ResponseData extends F9E {

        @InterfaceC65349Pkn("pull_stream_infos")
        public List<PullStreamInfo> pullStreamInfos;

        @Override // X.F9E
        public final Object[] getObjects() {
            List<PullStreamInfo> list = this.pullStreamInfos;
            return new Object[]{list, list, list};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        ResponseData responseData = this.data;
        return new Object[]{responseData, responseData};
    }
}
