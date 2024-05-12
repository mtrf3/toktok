package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PromoteEventModel implements Serializable {

    @InterfaceC65349Pkn("common")
    public PromoteEventCommon common;

    @InterfaceC65349Pkn("ev_type")
    public String evType;

    @InterfaceC65349Pkn("payload")
    public PromoteEventPayload payload;

    /* JADX WARN: Multi-variable type inference failed */
    public PromoteEventModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final PromoteEventCommon getCommon() {
        return this.common;
    }

    public final String getEvType() {
        return this.evType;
    }

    public final PromoteEventPayload getPayload() {
        return this.payload;
    }

    public final void setCommon(PromoteEventCommon promoteEventCommon) {
        this.common = promoteEventCommon;
    }

    public final void setEvType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.evType = str;
    }

    public final void setPayload(PromoteEventPayload promoteEventPayload) {
        this.payload = promoteEventPayload;
    }

    public PromoteEventModel(String evType, PromoteEventCommon promoteEventCommon, PromoteEventPayload promoteEventPayload) {
        o.LJIIIZ(evType, "evType");
        this.evType = evType;
        this.common = promoteEventCommon;
        this.payload = promoteEventPayload;
    }

    public /* synthetic */ PromoteEventModel(String str, PromoteEventCommon promoteEventCommon, PromoteEventPayload promoteEventPayload, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "custom" : str, (i & 2) != 0 ? null : promoteEventCommon, (i & 4) != 0 ? null : promoteEventPayload);
    }
}
