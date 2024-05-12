package com.ss.android.ugc.aweme.ttsvoice.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TTSVoiceDetailsResponse {

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    @InterfaceC65349Pkn("tts_voices")
    public final List<TTSVoiceStruct> ttsVoiceStruct;

    public TTSVoiceDetailsResponse() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSVoiceDetailsResponse)) {
            return false;
        }
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) obj;
        return o.LJ(this.statusCode, tTSVoiceDetailsResponse.statusCode) && o.LJ(this.statusMsg, tTSVoiceDetailsResponse.statusMsg) && o.LJ(this.ttsVoiceStruct, tTSVoiceDetailsResponse.ttsVoiceStruct);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<TTSVoiceStruct> list = this.ttsVoiceStruct;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTSVoiceDetailsResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", ttsVoiceStruct=");
        return C1NE.LIZIZ(LIZ, this.ttsVoiceStruct, ')', LIZ);
    }

    public TTSVoiceDetailsResponse(Integer num, String str, List<TTSVoiceStruct> list) {
        this.statusCode = num;
        this.statusMsg = str;
        this.ttsVoiceStruct = list;
    }

    public TTSVoiceDetailsResponse(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C61878OQg.INSTANCE : list);
    }
}
