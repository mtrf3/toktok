package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class RTCExtraInfo extends F9E {

    @InterfaceC65349Pkn("byte_rtc_ext_info")
    public ByteRTCExtInfo byteRtcExtInfo;

    @InterfaceC65349Pkn("live_rtc_engine_config")
    public RTCEngineConfig config;

    @InterfaceC65349Pkn("interact_client_type")
    public int interactClientType;

    @InterfaceC65349Pkn("rtc_bitrate_map")
    public RTCBitRateMap rtcBitRateMap;

    @InterfaceC65349Pkn("rtc_business_id")
    public String rtcBusinessId;

    @InterfaceC65349Pkn("rtc_fps")
    public int rtcFps;

    @InterfaceC65349Pkn("extra")
    public RTCInfoExtra rtcInfoExtra;

    @InterfaceC65349Pkn("rtc_mix_base")
    public RTCMixBase rtcMixBase;

    @InterfaceC65349Pkn("rtc_other")
    public RTCOther rtcOther;

    @InterfaceC65349Pkn("live_rtc_video_param")
    public List<RTCLiveVideoParam> rtcVideoParam;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RTCExtraInfo() {
        /*
            r13 = this;
            r1 = 0
            r4 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r3 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r4
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.config, this.rtcVideoParam, this.rtcBitRateMap, Integer.valueOf(this.rtcFps), this.rtcMixBase, this.byteRtcExtInfo, this.rtcInfoExtra, this.rtcBusinessId, this.rtcOther, Integer.valueOf(this.interactClientType)};
    }

    public RTCExtraInfo(RTCEngineConfig rTCEngineConfig, List<RTCLiveVideoParam> list, RTCBitRateMap rTCBitRateMap, int i, RTCMixBase rTCMixBase, ByteRTCExtInfo byteRTCExtInfo, RTCInfoExtra rTCInfoExtra, String str, RTCOther rTCOther, int i2) {
        this.config = rTCEngineConfig;
        this.rtcVideoParam = list;
        this.rtcBitRateMap = rTCBitRateMap;
        this.rtcFps = i;
        this.rtcMixBase = rTCMixBase;
        this.byteRtcExtInfo = byteRTCExtInfo;
        this.rtcInfoExtra = rTCInfoExtra;
        this.rtcBusinessId = str;
        this.rtcOther = rTCOther;
        this.interactClientType = i2;
    }

    public /* synthetic */ RTCExtraInfo(RTCEngineConfig rTCEngineConfig, List list, RTCBitRateMap rTCBitRateMap, int i, RTCMixBase rTCMixBase, ByteRTCExtInfo byteRTCExtInfo, RTCInfoExtra rTCInfoExtra, String str, RTCOther rTCOther, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : rTCEngineConfig, (i3 & 2) != 0 ? null : list, (i3 & 4) != 0 ? null : rTCBitRateMap, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? null : rTCMixBase, (i3 & 32) != 0 ? null : byteRTCExtInfo, (i3 & 64) != 0 ? null : rTCInfoExtra, (i3 & 128) != 0 ? null : str, (i3 & 256) == 0 ? rTCOther : null, (i3 & 512) == 0 ? i2 : 0);
    }
}
