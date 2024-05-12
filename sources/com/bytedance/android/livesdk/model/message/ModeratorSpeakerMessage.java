package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public final class ModeratorSpeakerMessage extends CR6 {
    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public ModeratorSpeakerMessage() {
        this.type = EnumC31509CYf.MODERATOR_OPERATE_MESSAGE;
    }
}
