package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes14.dex */
public final class SearchBar extends F9E {

    @InterfaceC65349Pkn("bg_image")
    public ImageModel bgImage;

    @InterfaceC65349Pkn("content")
    public String content;

    @Override // X.F9E
    public final Object[] getObjects() {
        ImageModel imageModel = this.bgImage;
        String str = this.content;
        return new Object[]{imageModel, imageModel, str, str};
    }
}
