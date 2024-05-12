package com.bytedance.ies.cutsame.source.api;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class VideoResponse extends BaseResponse {
    public VideoItemInfo data;

    public VideoResponse() {
    }

    public final VideoItemInfo getData() {
        return this.data;
    }

    public final void setData(VideoItemInfo videoItemInfo) {
        this.data = videoItemInfo;
    }

    public VideoResponse(int i, String str, Throwable th) {
        super(i, str, th);
    }

    public /* synthetic */ VideoResponse(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }
}
