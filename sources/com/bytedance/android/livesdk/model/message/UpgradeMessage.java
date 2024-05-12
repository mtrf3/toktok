package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public final class UpgradeMessage extends CR6 {
    public User LJLIL;

    @InterfaceC65349Pkn("text")
    public Text text;

    @Override // X.CR6
    public final boolean supportDisplayText() {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public UpgradeMessage() {
        this.type = EnumC31509CYf.UPGRADE_MESSAGE;
    }

    public UpgradeMessage(boolean z) {
        this.isLocalInsertMsg = z;
        this.type = EnumC31509CYf.UPGRADE_MESSAGE;
    }
}
