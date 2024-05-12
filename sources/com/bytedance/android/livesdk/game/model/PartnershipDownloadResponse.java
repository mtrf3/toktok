package com.bytedance.android.livesdk.game.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class PartnershipDownloadResponse {

    @InterfaceC65349Pkn("referrer")
    public String referrer;

    /* JADX WARN: Multi-variable type inference failed */
    public PartnershipDownloadResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PartnershipDownloadResponse(String str) {
        this.referrer = str;
    }

    public /* synthetic */ PartnershipDownloadResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
