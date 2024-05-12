package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes17.dex */
public final class CollectionUser extends F9E {

    @InterfaceC65349Pkn("avatar")
    public ImageModel avatar;

    @InterfaceC65349Pkn("display_id")
    public String displayId;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    @InterfaceC65349Pkn("user_id_str")
    public String userIdStr;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.userId;
        String str = this.userIdStr;
        String str2 = this.displayId;
        ImageModel imageModel = this.avatar;
        return new Object[]{l, l, str, str, str2, str2, imageModel, imageModel};
    }
}
