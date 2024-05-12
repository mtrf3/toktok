package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class UnauthorizedMemberMessage extends CR6 {

    @InterfaceC65349Pkn("action")
    public int action;

    @InterfaceC65349Pkn("enter_text")
    public Text enterText;

    @InterfaceC65349Pkn("nick_name")
    public String nickName;

    @InterfaceC65349Pkn("nick_name_prefix")
    public Text nickNamePrefix;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.action == 1 || super.canText()) {
            return true;
        }
        return false;
    }

    public UnauthorizedMemberMessage() {
        this.type = EnumC31509CYf.LIVE_UNAUTHORIZED_MEMBER_MESSAGE;
        this.nickName = "";
    }
}
