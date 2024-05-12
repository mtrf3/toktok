package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes6.dex */
public final class GiftGlobalMessage extends CR6 {

    @InterfaceC65349Pkn("from_user_id")
    public long mFromUserId;

    @InterfaceC65349Pkn("left_icon")
    public ImageModel mLeftIcon;

    @InterfaceC65349Pkn("notify")
    public RoomNotifyMessage mNotifyMessage;

    public GiftGlobalMessage() {
        this.type = EnumC31509CYf.GIFT_GLOBAL_MESSAGE;
    }
}
