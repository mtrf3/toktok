package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.SubTimerSticker;

/* loaded from: classes6.dex */
public final class SubTimerStickerMessage extends CR6 {

    @InterfaceC65349Pkn("sticker")
    public SubTimerSticker sticker;

    public SubTimerStickerMessage() {
        this.type = EnumC31509CYf.SUB_TIMER_STICKER_MESSAGE;
    }
}
