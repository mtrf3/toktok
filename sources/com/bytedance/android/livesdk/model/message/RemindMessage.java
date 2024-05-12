package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public class RemindMessage extends CR6 {

    @InterfaceC65349Pkn("tips_title")
    public Text bottomTip;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("display_text")
    public Text illegalText;

    @InterfaceC65349Pkn("notice_content")
    public Text noticeContent;

    @InterfaceC65349Pkn("notice_title")
    public Text noticeTitle;

    @InterfaceC65349Pkn("notice_type")
    public int noticeType;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    @InterfaceC65349Pkn("style")
    public String style;

    @InterfaceC65349Pkn("tips_url")
    public String tipUrl;

    @InterfaceC65349Pkn("title")
    public Text title;

    @InterfaceC65349Pkn("violation_reason")
    public Text violationReason;

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public RemindMessage() {
        this.type = EnumC31509CYf.REMIND;
    }
}
