package com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class VoiceSearchResponse {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("addition")
    public final MusicSearchResult musicResult;

    @InterfaceC65349Pkn("reqid")
    public final String requestId;

    @InterfaceC65349Pkn("result")
    public final List<VoiceSearchResult> result;

    @InterfaceC65349Pkn("sequence")
    public final int sequence;

    public VoiceSearchResponse() {
        this(null, 0, null, 0, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceSearchResponse)) {
            return false;
        }
        VoiceSearchResponse voiceSearchResponse = (VoiceSearchResponse) obj;
        return o.LJ(this.requestId, voiceSearchResponse.requestId) && this.code == voiceSearchResponse.code && o.LJ(this.message, voiceSearchResponse.message) && this.sequence == voiceSearchResponse.sequence && o.LJ(this.result, voiceSearchResponse.result) && o.LJ(this.musicResult, voiceSearchResponse.musicResult);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.requestId.hashCode() * 31) + this.code) * 31) + this.message.hashCode()) * 31) + this.sequence) * 31) + this.result.hashCode()) * 31;
        MusicSearchResult musicSearchResult = this.musicResult;
        return hashCode + (musicSearchResult == null ? 0 : musicSearchResult.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceSearchResponse(requestId=");
        LIZ.append(this.requestId);
        LIZ.append(", code=");
        LIZ.append(this.code);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", sequence=");
        LIZ.append(this.sequence);
        LIZ.append(", result=");
        LIZ.append(this.result);
        LIZ.append(", musicResult=");
        LIZ.append(this.musicResult);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public VoiceSearchResponse(String requestId, int i, String message, int i2, List<VoiceSearchResult> result, MusicSearchResult musicSearchResult) {
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(message, "message");
        o.LJIIIZ(result, "result");
        this.requestId = requestId;
        this.code = i;
        this.message = message;
        this.sequence = i2;
        this.result = result;
        this.musicResult = musicSearchResult;
    }

    public VoiceSearchResponse(String str, int i, String str2, int i2, List list, MusicSearchResult musicSearchResult, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? str2 : "", (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? C61878OQg.INSTANCE : list, (i3 & 32) != 0 ? null : musicSearchResult);
    }
}
