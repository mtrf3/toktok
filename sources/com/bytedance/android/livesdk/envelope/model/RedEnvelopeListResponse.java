package com.bytedance.android.livesdk.envelope.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RedEnvelopeListResponse extends F9E {

    @InterfaceC65349Pkn("envelope_infos")
    public List<RedEnvelopInfo> envelopList;

    @InterfaceC65349Pkn("message")
    public String message;

    @InterfaceC65349Pkn("prompts")
    public String prompts;

    /* JADX WARN: Multi-variable type inference failed */
    public RedEnvelopeListResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.envelopList, this.message, this.prompts};
    }

    public RedEnvelopeListResponse(List<RedEnvelopInfo> list, String message, String prompts) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(prompts, "prompts");
        this.envelopList = list;
        this.message = message;
        this.prompts = prompts;
    }

    public /* synthetic */ RedEnvelopeListResponse(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
