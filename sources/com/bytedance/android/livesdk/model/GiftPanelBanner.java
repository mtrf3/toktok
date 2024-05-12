package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;

/* loaded from: classes6.dex */
public class GiftPanelBanner {

    @InterfaceC65349Pkn("banner_lynx_url")
    public String bannerLynxUrl = "";

    @InterfaceC65349Pkn("banner_priority")
    public int bannerPriority;

    @InterfaceC65349Pkn("bg_color_values")
    public List<String> bgColors;

    @InterfaceC65349Pkn("display_text")
    public Text displayText;

    @InterfaceC65349Pkn("left_icon")
    public ImageModel leftIcon;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    static {
        new GiftPanelBanner();
    }
}
