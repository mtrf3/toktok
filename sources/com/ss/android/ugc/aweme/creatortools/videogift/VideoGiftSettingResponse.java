package com.ss.android.ugc.aweme.creatortools.videogift;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoGiftSettingResponse extends BaseResponse {

    @InterfaceC65349Pkn("video_gift_status")
    public final Integer videoGiftStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGiftSettingResponse) && o.LJ(this.videoGiftStatus, ((VideoGiftSettingResponse) obj).videoGiftStatus);
    }

    public final int hashCode() {
        Integer num = this.videoGiftStatus;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoGiftSettingResponse(videoGiftStatus=");
        return s0.LIZJ(LIZ, this.videoGiftStatus, ')', LIZ);
    }

    public VideoGiftSettingResponse(Integer num) {
        this.videoGiftStatus = num;
    }
}
