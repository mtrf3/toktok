package com.bytedance.android.livesdk.chatroom.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes17.dex */
public final class OriginBadgeInfo extends F9E {

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("origin_img")
    public ImageModel originImg;

    @InterfaceC65349Pkn("sub_level")
    public Integer subLevel;

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.subLevel;
        ImageModel imageModel = this.originImg;
        String str = this.description;
        return new Object[]{num, num, imageModel, imageModel, str, str};
    }
}
