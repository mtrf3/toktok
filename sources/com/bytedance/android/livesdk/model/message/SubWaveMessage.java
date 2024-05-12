package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.SubWaveImMsg;

/* loaded from: classes6.dex */
public final class SubWaveMessage extends CR6 {

    @InterfaceC65349Pkn("sub_wave_im_msg")
    public SubWaveImMsg subWaveImMsg;

    public SubWaveMessage() {
        this.type = EnumC31509CYf.SUB_WAVE_MESSAGE;
    }
}
