package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class BottomMessage extends CR6 {

    @InterfaceC65349Pkn("biz_type")
    public int bizType;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("detail_url")
    public String detailUrl;

    @InterfaceC65349Pkn("Duration")
    public long duration;

    @InterfaceC65349Pkn("float_style")
    public int floatStyle;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishInfo;

    @InterfaceC65349Pkn("show_type")
    public int showType;

    @InterfaceC65349Pkn("style")
    public int style;

    @InterfaceC65349Pkn("text_type")
    public int textType;

    @InterfaceC65349Pkn("violation_user_id")
    public long violationUserId;

    public BottomMessage() {
        this.type = EnumC31509CYf.BOTTOM_MESSAGE;
    }
}
