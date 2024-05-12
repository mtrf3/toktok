package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class EcBarrageMessage extends CR6 {

    @InterfaceC65349Pkn("background_color")
    public String backgroundColor = "";

    @InterfaceC65349Pkn("background_opacity")
    public double backgroundOpacity;

    @InterfaceC65349Pkn("content")
    public Text content;

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    public EcBarrageMessage() {
        this.type = EnumC31509CYf.EC_BARRAGE_MESSAGE;
    }
}
