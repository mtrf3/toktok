package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class ShortTouchInfo extends F9E {

    @InterfaceC65349Pkn("animation_type")
    public int animationType;

    @InterfaceC65349Pkn("container_type")
    public int containerType;

    @InterfaceC65349Pkn("height")
    public Integer height;

    @InterfaceC65349Pkn("img_url")
    public String imgUrl;

    @InterfaceC65349Pkn("jump_schema")
    public String jumpSchema;

    @InterfaceC65349Pkn("short_touch_fallback_url")
    public String shortTouchFallbackUrl;

    @InterfaceC65349Pkn("short_touch_url")
    public String shortTouchUrl;

    @InterfaceC65349Pkn("show_animation")
    public int showAnimation;

    @InterfaceC65349Pkn("sub_item_list")
    public List<String> subItemList;

    @InterfaceC65349Pkn("width")
    public Integer width;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.shortTouchUrl;
        String str2 = this.shortTouchFallbackUrl;
        Integer num = this.width;
        Integer num2 = this.height;
        String str3 = this.imgUrl;
        String str4 = this.jumpSchema;
        List<String> list = this.subItemList;
        return new Object[]{str, str, str2, str2, Integer.valueOf(this.containerType), num, num, num2, num2, str3, str3, str4, str4, Integer.valueOf(this.showAnimation), Integer.valueOf(this.animationType), list, list, list};
    }
}
