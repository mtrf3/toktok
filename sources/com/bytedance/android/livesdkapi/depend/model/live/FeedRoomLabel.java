package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class FeedRoomLabel implements Serializable {

    @InterfaceC65349Pkn("background_color")
    public String backgroundColor;

    @InterfaceC65349Pkn("bg_image")
    public ImageModel bgImage;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("position")
    public long location;

    @InterfaceC65349Pkn("log_extra")
    public String logExtra;

    @InterfaceC65349Pkn("text")
    public Text text;
}
