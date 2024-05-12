package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes16.dex */
public final class FYPRoomTagItem extends F9E {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("da_info")
    public String daInfo = "";

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("id")
    public Integer id;

    @InterfaceC65349Pkn("style")
    public Integer style;

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.id;
        Integer num2 = this.style;
        String str = this.content;
        ImageModel imageModel = this.icon;
        return new Object[]{num, num, num2, num2, str, str, imageModel, imageModel};
    }
}
