package com.bytedance.ies.cutsame.source.api;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ImageResponse extends BaseResponse {
    public AfrResponse data;

    public ImageResponse() {
    }

    public final AfrResponse getData() {
        return this.data;
    }

    public final void setData(AfrResponse afrResponse) {
        this.data = afrResponse;
    }

    public ImageResponse(int i, String str, Throwable th) {
        super(i, str, th);
    }

    public /* synthetic */ ImageResponse(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }
}
