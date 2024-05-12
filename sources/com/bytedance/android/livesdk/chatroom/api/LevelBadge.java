package com.bytedance.android.livesdk.chatroom.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes6.dex */
public final class LevelBadge extends F9E {

    @InterfaceC65349Pkn("origin_img")
    public ImageModel originImg;

    @InterfaceC65349Pkn("preview_img")
    public ImageModel previewImg;

    @Override // X.F9E
    public final Object[] getObjects() {
        ImageModel imageModel = this.originImg;
        ImageModel imageModel2 = this.previewImg;
        return new Object[]{imageModel, imageModel, imageModel2, imageModel2};
    }
}
