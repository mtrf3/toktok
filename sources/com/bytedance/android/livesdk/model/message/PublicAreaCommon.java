package com.bytedance.android.livesdk.model.message;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes6.dex */
public final class PublicAreaCommon extends F9E {

    @InterfaceC65349Pkn("user_consume_in_room")
    public Long userConsumeInRoom;

    @InterfaceC65349Pkn("user_label")
    public ImageModel userLabel;

    @Override // X.F9E
    public final Object[] getObjects() {
        ImageModel imageModel = this.userLabel;
        Long l = this.userConsumeInRoom;
        return new Object[]{imageModel, imageModel, l, l};
    }
}
