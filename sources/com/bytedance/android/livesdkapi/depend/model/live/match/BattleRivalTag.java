package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes14.dex */
public final class BattleRivalTag extends F9E {

    @InterfaceC65349Pkn("bg_image")
    public ImageModel bgImage;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("icon_image")
    public ImageModel iconImage;

    @Override // X.F9E
    public final Object[] getObjects() {
        ImageModel imageModel = this.bgImage;
        ImageModel imageModel2 = this.iconImage;
        String str = this.content;
        return new Object[]{imageModel, imageModel, imageModel2, imageModel2, str, str};
    }
}
