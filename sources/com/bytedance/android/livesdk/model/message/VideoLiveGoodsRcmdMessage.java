package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class VideoLiveGoodsRcmdMessage extends CR6 {

    @InterfaceC65349Pkn("rcmd_goods_id")
    public Long rcmdGoodsId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.rcmdGoodsId != null) {
            sb.append(", rcmd_goods_id=");
            sb.append(this.rcmdGoodsId);
        }
        return DIX.LIZLLL(sb, 0, 2, "VideoLiveGoodsRcmdMessage{", '}');
    }

    public VideoLiveGoodsRcmdMessage() {
        this.type = EnumC31509CYf.VIDEO_LIVE_GOODS_RCMD_MESSAGE;
    }
}
