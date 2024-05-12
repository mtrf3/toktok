package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class VideoLiveCouponRcmdMessage extends CR6 {

    @InterfaceC65349Pkn("rcmd_coupon_id")
    public Long rcmdCouponId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.rcmdCouponId != null) {
            sb.append(", rcmd_coupon_id=");
            sb.append(this.rcmdCouponId);
        }
        return DIX.LIZLLL(sb, 0, 2, "VideoLiveCouponRcmdMessage{", '}');
    }

    public VideoLiveCouponRcmdMessage() {
        this.type = EnumC31509CYf.VIDEO_LIVE_COUPON_RCMD_MESSAGE;
    }
}
