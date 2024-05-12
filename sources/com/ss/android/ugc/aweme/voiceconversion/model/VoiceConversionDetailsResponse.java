package com.ss.android.ugc.aweme.voiceconversion.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VoiceConversionDetailsResponse {

    @InterfaceC65349Pkn("vc_filter_info")
    public final VoiceConversionStruct info;

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    @InterfaceC65349Pkn("vc_filter_videolist")
    public final VoiceConversionStruct videoDetail;

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceConversionDetailsResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceConversionDetailsResponse)) {
            return false;
        }
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) obj;
        return o.LJ(this.statusCode, voiceConversionDetailsResponse.statusCode) && o.LJ(this.statusMsg, voiceConversionDetailsResponse.statusMsg) && o.LJ(this.info, voiceConversionDetailsResponse.info) && o.LJ(this.videoDetail, voiceConversionDetailsResponse.videoDetail);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VoiceConversionStruct voiceConversionStruct = this.info;
        int hashCode3 = (hashCode2 + (voiceConversionStruct == null ? 0 : voiceConversionStruct.hashCode())) * 31;
        VoiceConversionStruct voiceConversionStruct2 = this.videoDetail;
        return hashCode3 + (voiceConversionStruct2 != null ? voiceConversionStruct2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceConversionDetailsResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", info=");
        LIZ.append(this.info);
        LIZ.append(", videoDetail=");
        LIZ.append(this.videoDetail);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public VoiceConversionDetailsResponse(Integer num, String str, VoiceConversionStruct voiceConversionStruct, VoiceConversionStruct voiceConversionStruct2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.info = voiceConversionStruct;
        this.videoDetail = voiceConversionStruct2;
    }

    public /* synthetic */ VoiceConversionDetailsResponse(Integer num, String str, VoiceConversionStruct voiceConversionStruct, VoiceConversionStruct voiceConversionStruct2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : voiceConversionStruct, (i & 8) != 0 ? null : voiceConversionStruct2);
    }
}
