package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes17.dex */
public class CommonToastMessage extends CR6 {

    @InterfaceC65349Pkn("discardable")
    public boolean discardable;

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("top_img_height")
    public int imageHeight;

    @InterfaceC65349Pkn("top_img_width")
    public int imageWidth;

    @InterfaceC65349Pkn("immediate")
    public boolean immediate;

    @InterfaceC65349Pkn("show_mongolia_layer")
    public boolean showMongoliaLayer;

    @InterfaceC65349Pkn("top_img")
    public ImageModel topImage;

    @InterfaceC65349Pkn("background_color_start")
    public String backgroundColorStart = "#ff9d5c";

    @InterfaceC65349Pkn("background_color_end")
    public String backgroundColorEnd = "#ff9d5c";

    @InterfaceC65349Pkn("text_color")
    public String textColor = "#ffffff";

    @InterfaceC65349Pkn("position")
    public int position = 1;

    public CommonToastMessage() {
        this.type = EnumC31509CYf.COMMON_TOAST;
    }
}
