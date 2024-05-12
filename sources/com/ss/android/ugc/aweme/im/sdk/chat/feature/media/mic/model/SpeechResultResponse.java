package com.ss.android.ugc.aweme.im.sdk.chat.feature.media.mic.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SpeechResultResponse extends F9E {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("reqid")
    public final String requestId;

    @InterfaceC65349Pkn("result")
    public final List<SpeechResult> result;

    @InterfaceC65349Pkn("sequence")
    public final int sequence;

    public SpeechResultResponse() {
        this(null, 0, null, 0, null, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.requestId, Integer.valueOf(this.code), this.message, Integer.valueOf(this.sequence), this.result};
    }

    public SpeechResultResponse(String requestId, int i, String message, int i2, List<SpeechResult> result) {
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(message, "message");
        o.LJIIIZ(result, "result");
        this.requestId = requestId;
        this.code = i;
        this.message = message;
        this.sequence = i2;
        this.result = result;
    }

    public SpeechResultResponse(String str, int i, String str2, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? str2 : "", (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? C61878OQg.INSTANCE : list);
    }
}
