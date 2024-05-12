package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public final class OperateToastMessage extends CR6 {

    @InterfaceC65349Pkn("delay_display_duration_millisecond")
    public long delayDuration;

    @InterfaceC65349Pkn("display_duration_millisecond")
    public long displayDuration;

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public OperateToastMessage() {
        this.type = EnumC31509CYf.OPERATE_TOAST_MESSAGE;
    }
}
