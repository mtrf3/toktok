package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes6.dex */
public class GuideMessage extends CR6 {

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("display_style")
    public long displayStyle;

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("gift_id")
    public long giftId;

    @InterfaceC65349Pkn("guide_type")
    public long guideType;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene = "";

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public GuideMessage() {
        this.type = EnumC31509CYf.GUIDE_MESSAGE;
    }
}
